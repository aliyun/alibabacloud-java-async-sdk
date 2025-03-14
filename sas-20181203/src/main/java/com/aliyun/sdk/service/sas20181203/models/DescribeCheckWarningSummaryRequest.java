// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCheckWarningSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningSummaryRequest</p>
 */
public class DescribeCheckWarningSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskName")
    private String riskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskStatus")
    private Integer riskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
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
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c80dae73bd1be442699766b14ffd0****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the container field. Valid values:</p>
         * <ul>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageId</strong>: the ID of the image</li>
         * <li><strong>namespace</strong>: the namespace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the container field.</p>
         * 
         * <strong>example:</strong>
         * <p>c819391d2d520485fa3e81e2dc2ea****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The language of the content within the request and the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * <p>The status of the baseline check. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>3</strong>: passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskStatus(Integer riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>219.133.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>2</strong>: verifying</li>
         * <li><strong>3</strong>: passed</li>
         * <li><strong>5</strong>: expired</li>
         * <li><strong>6</strong>: ignored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the ID of an asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The level-1 type of check items.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the level-1 types of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * <p>The UUID of the asset.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f03259d8-1e81-4fae-bcbb-275fb5****</p>
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
