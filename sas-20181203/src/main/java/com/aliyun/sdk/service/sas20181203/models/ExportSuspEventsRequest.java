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
 * {@link ExportSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>ExportSuspEventsRequest</p>
 */
public class ExportSuspEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsTypeList")
    private java.util.List<String> assetsTypeList;

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
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateErrorCodeList")
    private java.util.List<String> operateErrorCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentEventTypes")
    private String parentEventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private String timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private String timeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueInfo")
    private String uniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ExportSuspEventsRequest(Builder builder) {
        super(builder);
        this.assetsTypeList = builder.assetsTypeList;
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.name = builder.name;
        this.operateErrorCodeList = builder.operateErrorCodeList;
        this.pageSize = builder.pageSize;
        this.parentEventTypes = builder.parentEventTypes;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.targetType = builder.targetType;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
        this.uniqueInfo = builder.uniqueInfo;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportSuspEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsTypeList
     */
    public java.util.List<String> getAssetsTypeList() {
        return this.assetsTypeList;
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
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operateErrorCodeList
     */
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentEventTypes
     */
    public String getParentEventTypes() {
        return this.parentEventTypes;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return timeEnd
     */
    public String getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public String getTimeStart() {
        return this.timeStart;
    }

    /**
     * @return uniqueInfo
     */
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ExportSuspEventsRequest, Builder> {
        private java.util.List<String> assetsTypeList; 
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String currentPage; 
        private String dealed; 
        private String from; 
        private Long groupId; 
        private Long id; 
        private String lang; 
        private String levels; 
        private String name; 
        private java.util.List<String> operateErrorCodeList; 
        private String pageSize; 
        private String parentEventTypes; 
        private String remark; 
        private String sourceIp; 
        private String status; 
        private String targetType; 
        private String timeEnd; 
        private String timeStart; 
        private String uniqueInfo; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ExportSuspEventsRequest request) {
            super(request);
            this.assetsTypeList = request.assetsTypeList;
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.from = request.from;
            this.groupId = request.groupId;
            this.id = request.id;
            this.lang = request.lang;
            this.levels = request.levels;
            this.name = request.name;
            this.operateErrorCodeList = request.operateErrorCodeList;
            this.pageSize = request.pageSize;
            this.parentEventTypes = request.parentEventTypes;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.targetType = request.targetType;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
            this.uniqueInfo = request.uniqueInfo;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The types of assets.</p>
         */
        public Builder assetsTypeList(java.util.List<String> assetsTypeList) {
            this.putQueryParameter("AssetsTypeList", assetsTypeList);
            this.assetsTypeList = assetsTypeList;
            return this;
        }

        /**
         * <p>The ID of the cluster that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the asset</li>
         * <li><strong>appName</strong>: the name of the application</li>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>regionId</strong>: the ID of the region</li>
         * <li><strong>nodeName</strong>: the name of the node</li>
         * <li><strong>namespace</strong>: the namespace</li>
         * <li><strong>clusterName</strong>: the name of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
         * <li><strong>imageRepoTag</strong>: the tag that is added to the image</li>
         * <li><strong>imageDigest</strong>: the digest of the image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the condition that is used to query alert events on containers.</p>
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
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The status of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>N</strong>: unhandled</li>
         * <li><strong>Y</strong>: handled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The data source of the exception. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>8076980</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>17821</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * <p>The severity of the alert event. Separate multiple severities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious,suspicious,remind</p>
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * <p>The complete name of the exception.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The status codes of alert events.</p>
         */
        public Builder operateErrorCodeList(java.util.List<String> operateErrorCodeList) {
            this.putQueryParameter("OperateErrorCodeList", operateErrorCodeList);
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The alert type of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>Suspicious process</strong></li>
         * <li><strong>Webshell</strong></li>
         * <li><strong>Unusual logon</strong></li>
         * <li><strong>Exception</strong></li>
         * <li><strong>Sensitive file tampering</strong></li>
         * <li><strong>Malicious process (cloud threat detection)</strong></li>
         * <li><strong>Suspicious network connection</strong></li>
         * <li><strong>Suspicious account</strong></li>
         * <li><strong>Application intrusion event</strong></li>
         * <li><strong>Cloud threat detection</strong></li>
         * <li><strong>Precise defense</strong></li>
         * <li><strong>Application whitelist</strong></li>
         * <li><strong>Persistent webshell</strong></li>
         * <li><strong>Web application threat detection</strong></li>
         * <li><strong>Malicious script</strong></li>
         * <li><strong>Threat intelligence</strong></li>
         * <li><strong>Malicious network activity</strong></li>
         * <li><strong>Cluster exception</strong></li>
         * <li><strong>Webshell (on-premises threat detection)</strong></li>
         * <li><strong>Vulnerability exploitation</strong></li>
         * <li><strong>Malicious process (on-premises threat detection)</strong></li>
         * <li><strong>Trusted exception</strong></li>
         * <li><strong>Others</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        public Builder parentEventTypes(String parentEventTypes) {
            this.putQueryParameter("ParentEventTypes", parentEventTypes);
            this.parentEventTypes = parentEventTypes;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The handling status of the exception. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: all status</li>
         * <li><strong>1</strong>: pending handling</li>
         * <li><strong>2</strong>: ignored</li>
         * <li><strong>4</strong>: confirmed</li>
         * <li><strong>8</strong>: marked as false positive</li>
         * <li><strong>16</strong>: handling</li>
         * <li><strong>32</strong>: handled</li>
         * <li><strong>64</strong>: expired</li>
         * <li><strong>128</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The dimension from which you want to configure the feature. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
         * <li><strong>image_repo</strong>: the ID of the image repository</li>
         * <li><strong>Cluster</strong>: the ID of the cluster</li>
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
         * <p>The end of the time range during which the exception is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-05 00:00:00</p>
         */
        public Builder timeEnd(String timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the exception is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01 00:00:00</p>
         */
        public Builder timeStart(String timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        /**
         * <p>The unique key of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>1fbe8d16727f61d1478a674d6fa0****</p>
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * <p>The unique ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>18b7336e-d469-473b-af83-8e5420f9****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ExportSuspEventsRequest build() {
            return new ExportSuspEventsRequest(this);
        } 

    } 

}
