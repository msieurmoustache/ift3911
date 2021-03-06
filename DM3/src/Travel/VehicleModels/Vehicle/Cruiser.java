package Travel.VehicleModels.Vehicle;

import java.util.List;

import Travel.TravelType;
import Travel.Forms.VehicleModelForm;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.SectionWithCabins;

public class Cruiser extends TransportVehicleModel {

	public Cruiser(String ID, String modelName, List<BaseSection> sections) {
		super(TravelType.Cruise, ID, modelName, validSections(sections));
	}

	public Cruiser(VehicleModelForm form) {
		super(form);
	}
	private static List<BaseSection> validSections(List<BaseSection> sections) {
		for (BaseSection s : sections)
			if (!(s instanceof SectionWithCabins))
				throw new IllegalArgumentException("A cruiser can't have a section of type " + s.typeToString());

		return sections;
	}
}