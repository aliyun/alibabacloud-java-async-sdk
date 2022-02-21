// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGeoFenceRequest} extends {@link RequestModel}
 *
 * <p>CreateGeoFenceRequest</p>
 */
public class CreateGeoFenceRequest extends Request {
    @Query
    @NameInMap("AlarmCondition")
    @Validation(required = true)
    private String alarmCondition;

    @Query
    @NameInMap("Area")
    @Validation(required = true)
    private Float area;

    @Query
    @NameInMap("Center")
    private String center;

    @Query
    @NameInMap("CityCode")
    private String cityCode;

    @Query
    @NameInMap("CountryCode")
    @Validation(required = true)
    private String countryCode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FenceName")
    @Validation(required = true)
    private String fenceName;

    @Query
    @NameInMap("Points")
    private String points;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("ProvinceCode")
    @Validation(required = true)
    private String provinceCode;

    @Query
    @NameInMap("Radius")
    private Integer radius;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private CreateGeoFenceRequest(Builder builder) {
        super(builder);
        this.alarmCondition = builder.alarmCondition;
        this.area = builder.area;
        this.center = builder.center;
        this.cityCode = builder.cityCode;
        this.countryCode = builder.countryCode;
        this.description = builder.description;
        this.fenceName = builder.fenceName;
        this.points = builder.points;
        this.projectId = builder.projectId;
        this.provinceCode = builder.provinceCode;
        this.radius = builder.radius;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGeoFenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmCondition
     */
    public String getAlarmCondition() {
        return this.alarmCondition;
    }

    /**
     * @return area
     */
    public Float getArea() {
        return this.area;
    }

    /**
     * @return center
     */
    public String getCenter() {
        return this.center;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fenceName
     */
    public String getFenceName() {
        return this.fenceName;
    }

    /**
     * @return points
     */
    public String getPoints() {
        return this.points;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return provinceCode
     */
    public String getProvinceCode() {
        return this.provinceCode;
    }

    /**
     * @return radius
     */
    public Integer getRadius() {
        return this.radius;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateGeoFenceRequest, Builder> {
        private String alarmCondition; 
        private Float area; 
        private String center; 
        private String cityCode; 
        private String countryCode; 
        private String description; 
        private String fenceName; 
        private String points; 
        private String projectId; 
        private String provinceCode; 
        private Integer radius; 
        private String regionId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateGeoFenceRequest response) {
            super(response);
            this.alarmCondition = response.alarmCondition;
            this.area = response.area;
            this.center = response.center;
            this.cityCode = response.cityCode;
            this.countryCode = response.countryCode;
            this.description = response.description;
            this.fenceName = response.fenceName;
            this.points = response.points;
            this.projectId = response.projectId;
            this.provinceCode = response.provinceCode;
            this.radius = response.radius;
            this.regionId = response.regionId;
            this.type = response.type;
        } 

        /**
         * AlarmCondition.
         */
        public Builder alarmCondition(String alarmCondition) {
            this.putQueryParameter("AlarmCondition", alarmCondition);
            this.alarmCondition = alarmCondition;
            return this;
        }

        /**
         * Area.
         */
        public Builder area(Float area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * Center.
         */
        public Builder center(String center) {
            this.putQueryParameter("Center", center);
            this.center = center;
            return this;
        }

        /**
         * CityCode.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * CountryCode.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FenceName.
         */
        public Builder fenceName(String fenceName) {
            this.putQueryParameter("FenceName", fenceName);
            this.fenceName = fenceName;
            return this;
        }

        /**
         * Points.
         */
        public Builder points(String points) {
            this.putQueryParameter("Points", points);
            this.points = points;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProvinceCode.
         */
        public Builder provinceCode(String provinceCode) {
            this.putQueryParameter("ProvinceCode", provinceCode);
            this.provinceCode = provinceCode;
            return this;
        }

        /**
         * Radius.
         */
        public Builder radius(Integer radius) {
            this.putQueryParameter("Radius", radius);
            this.radius = radius;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateGeoFenceRequest build() {
            return new CreateGeoFenceRequest(this);
        } 

    } 

}
