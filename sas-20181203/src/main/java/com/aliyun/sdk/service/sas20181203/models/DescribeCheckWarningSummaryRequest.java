// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningSummaryRequest</p>
 */
public class DescribeCheckWarningSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ContainerFieldName")
    private String containerFieldName;

    @Query
    @NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskName")
    private String riskName;

    @Query
    @NameInMap("RiskStatus")
    private Integer riskStatus;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("StrategyId")
    private Long strategyId;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("TypeName")
    private String typeName;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private DescribeCheckWarningSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskName = builder.riskName;
        this.riskStatus = builder.riskStatus;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
        this.targetType = builder.targetType;
        this.typeName = builder.typeName;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    /**
     * @return riskStatus
     */
    public Integer getRiskStatus() {
        return this.riskStatus;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningSummaryRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private Long groupId; 
        private String lang; 
        private Integer pageSize; 
        private String riskName; 
        private Integer riskStatus; 
        private String sourceIp; 
        private String status; 
        private Long strategyId; 
        private String targetType; 
        private String typeName; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskName = request.riskName;
            this.riskStatus = request.riskStatus;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.strategyId = request.strategyId;
            this.targetType = request.targetType;
            this.typeName = request.typeName;
            this.uuids = request.uuids;
        } 

        /**
         * The value of the container field.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The level-1 type of check items.
         * <p>
         * 
         * >  You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the level-1 types of check items.
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The statistics of check items.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UUID of the asset.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The level-2 type of the risk item.
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * The type of the query condition. Valid values:
         * <p>
         * 
         * *   **uuid**: the ID of an asset
         */
        public Builder riskStatus(Integer riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The number of high-risk items.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The number of assets on which risk items are detected.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The number of check items.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The page number of the current page.
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * The name of the container field. Valid values:
         * <p>
         * 
         * *   **clusterId**: the ID of the cluster
         * *   **image**: the name of the image
         * *   **imageId**: the ID of the image
         * *   **namespace**: the namespace
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeCheckWarningSummaryRequest build() {
            return new DescribeCheckWarningSummaryRequest(this);
        } 

    } 

}
