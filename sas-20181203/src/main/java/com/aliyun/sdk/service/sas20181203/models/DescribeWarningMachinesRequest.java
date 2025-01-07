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
 * {@link DescribeWarningMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeWarningMachinesRequest</p>
 */
public class DescribeWarningMachinesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HaveRisk")
    private Integer haveRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineName")
    private String machineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DescribeWarningMachinesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.haveRisk = builder.haveRisk;
        this.lang = builder.lang;
        this.machineName = builder.machineName;
        this.pageSize = builder.pageSize;
        this.riskId = builder.riskId;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
        this.targetType = builder.targetType;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarningMachinesRequest create() {
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
     * @return haveRisk
     */
    public Integer getHaveRisk() {
        return this.haveRisk;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return machineName
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeWarningMachinesRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private Long groupId; 
        private Integer haveRisk; 
        private String lang; 
        private String machineName; 
        private Integer pageSize; 
        private Long riskId; 
        private String sourceIp; 
        private Long strategyId; 
        private String targetType; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWarningMachinesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.haveRisk = request.haveRisk;
            this.lang = request.lang;
            this.machineName = request.machineName;
            this.pageSize = request.pageSize;
            this.riskId = request.riskId;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
            this.targetType = request.targetType;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c7e3c5b420a7947c2933303144688****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the field that is used to search for the container. Valid values:</p>
         * <ul>
         * <li><strong>CONTAINER_ID</strong>: the ID of the container</li>
         * <li><strong>IMAGE</strong>: the name of the image</li>
         * <li><strong>NAMESPACE</strong>: the namespace</li>
         * <li><strong>NODE_NAME</strong>: the name of the node</li>
         * <li><strong>POD_IP</strong>: the IP address of the pod</li>
         * <li><strong>HOST_IP</strong>: the IP address of the host</li>
         * <li><strong>INSTANCE_ID</strong>: the ID of the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>containerId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the field that is used to search for the container.</p>
         * 
         * <strong>example:</strong>
         * <p>c8bb3ef0f5ccf45508f0fd1ffc200****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/130972.html">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
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
         * <p>Specifies whether risks were detected. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder haveRisk(Integer haveRisk) {
            this.putQueryParameter("HaveRisk", haveRisk);
            this.haveRisk = haveRisk;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The name of the server on which the baseline check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>oracle-win-001****</p>
         */
        public Builder machineName(String machineName) {
            this.putQueryParameter("MachineName", machineName);
            this.machineName = machineName;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>, which indicates that 10 entries of server information are displayed on each page. A maximum of 100 entries can be returned per page.</p>
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
         * <p>The ID of the risk item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: the ID of the container</li>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
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
         * <p>The UUID of the server on which the baseline check is performed. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9888955c-0076-49da-bd9c-34f5492b****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeWarningMachinesRequest build() {
            return new DescribeWarningMachinesRequest(this);
        } 

    } 

}
