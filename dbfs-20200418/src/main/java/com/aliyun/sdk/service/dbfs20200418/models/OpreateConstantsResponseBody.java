// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpreateConstantsResponseBody} extends {@link TeaModel}
 *
 * <p>OpreateConstantsResponseBody</p>
 */
public class OpreateConstantsResponseBody extends TeaModel {
    @NameInMap("AccessData")
    private String accessData;

    @NameInMap("Data")
    private String data;

    @NameInMap("EndpointData")
    private String endpointData;

    @NameInMap("MasterData")
    private String masterData;

    @NameInMap("OsversionData")
    private String osversionData;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("ProductCodeData")
    private String productCodeData;

    @NameInMap("RegionData")
    private String regionData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("ZoneData")
    private String zoneData;

    private OpreateConstantsResponseBody(Builder builder) {
        this.accessData = builder.accessData;
        this.data = builder.data;
        this.endpointData = builder.endpointData;
        this.masterData = builder.masterData;
        this.osversionData = builder.osversionData;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productCodeData = builder.productCodeData;
        this.regionData = builder.regionData;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.zoneData = builder.zoneData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpreateConstantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessData
     */
    public String getAccessData() {
        return this.accessData;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return zoneData
     */
    public String getZoneData() {
        return this.zoneData;
    }

    public static final class Builder {
        private String accessData; 
        private String data; 
        private String endpointData; 
        private String masterData; 
        private String osversionData; 
        private Long pageNumber; 
        private Long pageSize; 
        private String productCodeData; 
        private String regionData; 
        private String requestId; 
        private Long totalCount; 
        private String zoneData; 

        /**
         * AccessData.
         */
        public Builder accessData(String accessData) {
            this.accessData = accessData;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * EndpointData.
         */
        public Builder endpointData(String endpointData) {
            this.endpointData = endpointData;
            return this;
        }

        /**
         * MasterData.
         */
        public Builder masterData(String masterData) {
            this.masterData = masterData;
            return this;
        }

        /**
         * OsversionData.
         */
        public Builder osversionData(String osversionData) {
            this.osversionData = osversionData;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCodeData.
         */
        public Builder productCodeData(String productCodeData) {
            this.productCodeData = productCodeData;
            return this;
        }

        /**
         * RegionData.
         */
        public Builder regionData(String regionData) {
            this.regionData = regionData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * ZoneData.
         */
        public Builder zoneData(String zoneData) {
            this.zoneData = zoneData;
            return this;
        }

        public OpreateConstantsResponseBody build() {
            return new OpreateConstantsResponseBody(this);
        } 

    } 

}
