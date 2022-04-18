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
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
            this.serviceRegionId = request.serviceRegionId;
            this.startTime = request.startTime;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * CheckStatus.
         */
        public Builder checkStatus(Integer checkStatus) {
            this.putQueryParameter("CheckStatus", checkStatus);
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DatamaskStatus.
         */
        public Builder datamaskStatus(Integer datamaskStatus) {
            this.putQueryParameter("DatamaskStatus", datamaskStatus);
            this.datamaskStatus = datamaskStatus;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * StartTime.
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
