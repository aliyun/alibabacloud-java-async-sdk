// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSynchronizConstantsRequest} extends {@link RequestModel}
 *
 * <p>InsertSynchronizConstantsRequest</p>
 */
public class InsertSynchronizConstantsRequest extends Request {
    @Query
    @NameInMap("AccessData")
    private String accessData;

    @Query
    @NameInMap("EndpointData")
    private String endpointData;

    @Query
    @NameInMap("MasterData")
    private String masterData;

    @Query
    @NameInMap("OsversionData")
    private String osversionData;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("ProductCodeData")
    private String productCodeData;

    @Query
    @NameInMap("RegionData")
    private String regionData;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneData")
    private String zoneData;

    private InsertSynchronizConstantsRequest(Builder builder) {
        super(builder);
        this.accessData = builder.accessData;
        this.endpointData = builder.endpointData;
        this.masterData = builder.masterData;
        this.osversionData = builder.osversionData;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productCodeData = builder.productCodeData;
        this.regionData = builder.regionData;
        this.regionId = builder.regionId;
        this.zoneData = builder.zoneData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSynchronizConstantsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessData
     */
    public String getAccessData() {
        return this.accessData;
    }

    /**
     * @return endpointData
     */
    public String getEndpointData() {
        return this.endpointData;
    }

    /**
     * @return masterData
     */
    public String getMasterData() {
        return this.masterData;
    }

    /**
     * @return osversionData
     */
    public String getOsversionData() {
        return this.osversionData;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCodeData
     */
    public String getProductCodeData() {
        return this.productCodeData;
    }

    /**
     * @return regionData
     */
    public String getRegionData() {
        return this.regionData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneData
     */
    public String getZoneData() {
        return this.zoneData;
    }

    public static final class Builder extends Request.Builder<InsertSynchronizConstantsRequest, Builder> {
        private String accessData; 
        private String endpointData; 
        private String masterData; 
        private String osversionData; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productCodeData; 
        private String regionData; 
        private String regionId; 
        private String zoneData; 

        private Builder() {
            super();
        } 

        private Builder(InsertSynchronizConstantsRequest response) {
            super(response);
            this.accessData = response.accessData;
            this.endpointData = response.endpointData;
            this.masterData = response.masterData;
            this.osversionData = response.osversionData;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.productCodeData = response.productCodeData;
            this.regionData = response.regionData;
            this.regionId = response.regionId;
            this.zoneData = response.zoneData;
        } 

        /**
         * AccessData.
         */
        public Builder accessData(String accessData) {
            this.putQueryParameter("AccessData", accessData);
            this.accessData = accessData;
            return this;
        }

        /**
         * EndpointData.
         */
        public Builder endpointData(String endpointData) {
            this.putQueryParameter("EndpointData", endpointData);
            this.endpointData = endpointData;
            return this;
        }

        /**
         * MasterData.
         */
        public Builder masterData(String masterData) {
            this.putQueryParameter("MasterData", masterData);
            this.masterData = masterData;
            return this;
        }

        /**
         * OsversionData.
         */
        public Builder osversionData(String osversionData) {
            this.putQueryParameter("OsversionData", osversionData);
            this.osversionData = osversionData;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCodeData.
         */
        public Builder productCodeData(String productCodeData) {
            this.putQueryParameter("ProductCodeData", productCodeData);
            this.productCodeData = productCodeData;
            return this;
        }

        /**
         * RegionData.
         */
        public Builder regionData(String regionData) {
            this.putQueryParameter("RegionData", regionData);
            this.regionData = regionData;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ZoneData.
         */
        public Builder zoneData(String zoneData) {
            this.putQueryParameter("ZoneData", zoneData);
            this.zoneData = zoneData;
            return this;
        }

        @Override
        public InsertSynchronizConstantsRequest build() {
            return new InsertSynchronizConstantsRequest(this);
        } 

    } 

}
