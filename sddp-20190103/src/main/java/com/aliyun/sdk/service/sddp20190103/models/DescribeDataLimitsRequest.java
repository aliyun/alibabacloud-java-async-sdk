// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitsRequest</p>
 */
public class DescribeDataLimitsRequest extends Request {
    @Query
    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @Query
    @NameInMap("CheckStatus")
    private Integer checkStatus;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DatamaskStatus")
    private Integer datamaskStatus;

    @Query
    @NameInMap("Enable")
    private Integer enable;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("EngineType")
    private String engineType;

    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    @Query
    @NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeDataLimitsRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.checkStatus = builder.checkStatus;
        this.currentPage = builder.currentPage;
        this.datamaskStatus = builder.datamaskStatus;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.engineType = builder.engineType;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
        this.resourceType = builder.resourceType;
        this.serviceRegionId = builder.serviceRegionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return checkStatus
     */
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return datamaskStatus
     */
    public Integer getDatamaskStatus() {
        return this.datamaskStatus;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitsRequest, Builder> {
        private Integer auditStatus; 
        private Integer checkStatus; 
        private Integer currentPage; 
        private Integer datamaskStatus; 
        private Integer enable; 
        private Long endTime; 
        private String engineType; 
        private Integer featureType; 
        private String lang; 
        private Integer pageSize; 
        private String parentId; 
        private Integer resourceType; 
        private String serviceRegionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitsRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.checkStatus = request.checkStatus;
            this.currentPage = request.currentPage;
            this.datamaskStatus = request.datamaskStatus;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.engineType = request.engineType;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
            this.serviceRegionId = request.serviceRegionId;
            this.startTime = request.startTime;
        } 

        /**
         * Specifies whether to enable the security audit feature. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * The data detection status. Valid values:
         * <p>
         * 
         * *   **0**: The data detection is ready.
         * *   **1**: The data detection is running.
         * *   **2**: The connectivity test is in progress.
         * *   **3**: The connectivity test passed.
         * *   **4**: The connectivity test failed.
         */
        public Builder checkStatus(Integer checkStatus) {
            this.putQueryParameter("CheckStatus", checkStatus);
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether DSC has the data de-identification permissions on the data asset. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder datamaskStatus(Integer datamaskStatus) {
            this.putQueryParameter("DatamaskStatus", datamaskStatus);
            this.datamaskStatus = datamaskStatus;
            return this;
        }

        /**
         * Specifies whether DSC has the data detection permissions on the data asset. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The end of the time range to query The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the database engine. Valid values include **MySQL**, **SQLServer**, **Oracle**, **PostgreSQL**, and **MongoDB**.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * FeatureType.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The parent ID of the data asset to be queried. Valid values:
         * <p>
         * 
         * *   The name or ID of the MaxCompute project.
         * *   The name or ID of the OSS bucket.
         * *   The name or ID of the ApsaraDB RDS instance or database.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The type of the service to which the data asset to be queried belongs. Valid values:
         * <p>
         * 
         * *   **1**: MaxCompute
         * *   **2**: Object Storage Service (OSS)
         * *   **3**: AnalyticDB for MySQL
         * *   **4**: Tablestore
         * *   **5**: ApsaraDB RDS
         * *   **6**: self-managed database
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The region in which the data asset resides.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * The beginning of the time range to query The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDataLimitsRequest build() {
            return new DescribeDataLimitsRequest(this);
        } 

    } 

}
