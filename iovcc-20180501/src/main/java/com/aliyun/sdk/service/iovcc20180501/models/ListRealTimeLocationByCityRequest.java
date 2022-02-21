// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealTimeLocationByCityRequest} extends {@link RequestModel}
 *
 * <p>ListRealTimeLocationByCityRequest</p>
 */
public class ListRealTimeLocationByCityRequest extends Request {
    @Query
    @NameInMap("CityCode")
    private String cityCode;

    @Query
    @NameInMap("CountryCode")
    private String countryCode;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("ProvinceCode")
    private String provinceCode;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    private Integer size;

    private ListRealTimeLocationByCityRequest(Builder builder) {
        super(builder);
        this.cityCode = builder.cityCode;
        this.countryCode = builder.countryCode;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.provinceCode = builder.provinceCode;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealTimeLocationByCityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListRealTimeLocationByCityRequest, Builder> {
        private String cityCode; 
        private String countryCode; 
        private Integer offset; 
        private String projectId; 
        private String provinceCode; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListRealTimeLocationByCityRequest response) {
            super(response);
            this.cityCode = response.cityCode;
            this.countryCode = response.countryCode;
            this.offset = response.offset;
            this.projectId = response.projectId;
            this.provinceCode = response.provinceCode;
            this.regionId = response.regionId;
            this.size = response.size;
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
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListRealTimeLocationByCityRequest build() {
            return new ListRealTimeLocationByCityRequest(this);
        } 

    } 

}
