// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>ExportSuspEventsRequest</p>
 */
public class ExportSuspEventsRequest extends Request {
    @Query
    @NameInMap("AssetsTypeList")
    private java.util.List < String > assetsTypeList;

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
    private String currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperateErrorCodeList")
    private java.util.List < String > operateErrorCodeList;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ParentEventTypes")
    private String parentEventTypes;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("TimeEnd")
    private String timeEnd;

    @Query
    @NameInMap("TimeStart")
    private String timeStart;

    @Query
    @NameInMap("UniqueInfo")
    private String uniqueInfo;

    @Query
    @NameInMap("Uuid")
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
    public java.util.List < String > getAssetsTypeList() {
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
    public java.util.List < String > getOperateErrorCodeList() {
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
        private java.util.List < String > assetsTypeList; 
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String currentPage; 
        private String dealed; 
        private String from; 
        private Long id; 
        private String lang; 
        private String levels; 
        private String name; 
        private java.util.List < String > operateErrorCodeList; 
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
         * The types of assets.
         */
        public Builder assetsTypeList(java.util.List < String > assetsTypeList) {
            this.putQueryParameter("AssetsTypeList", assetsTypeList);
            this.assetsTypeList = assetsTypeList;
            return this;
        }

        /**
         * The ID of the cluster that you want to query.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The key of the condition that is used to query alert events on containers. Valid values:
         * <p>
         * 
         * *   **instanceId**: the ID of the asset
         * *   **appName**: the name of the application
         * *   **clusterId**: the ID of the cluster
         * *   **regionId**: the ID of the region
         * *   **nodeName**: the name of the node
         * *   **namespace**: the namespace
         * *   **clusterName**: the name of the cluster
         * *   **image**: the name of the image
         * *   **imageRepoName**: the name of the image repository
         * *   **imageRepoNamespace**: the namespace to which the image repository belongs
         * *   **imageRepoTag**: the tag that is added to the image
         * *   **imageDigest**: the digest of the image
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The value of the condition that is used to query alert events on containers.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status of the alert event. Valid values:
         * <p>
         * 
         * *   **N**: unhandled
         * *   **Y**: handled
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The data source of the exception. Set the value to sas.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The severity of the alert event. Separate multiple severities with commas (,). Valid values:
         * <p>
         * 
         * *   **serious**
         * *   **suspicious**
         * *   **remind**
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * The complete name of the exception.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperateErrorCodeList.
         */
        public Builder operateErrorCodeList(java.util.List < String > operateErrorCodeList) {
            this.putQueryParameter("OperateErrorCodeList", operateErrorCodeList);
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The alert type of the alert event. Valid values:
         * <p>
         * 
         * *   **Suspicious process**
         * *   **Webshell**
         * *   **Unusual logon**
         * *   **Exception**
         * *   **Sensitive file tampering**
         * *   **Malicious process (cloud threat detection)**
         * *   **Suspicious network connection**
         * *   **Suspicious account**
         * *   **Application intrusion event**
         * *   **Cloud threat detection**
         * *   **Precise defense**
         * *   **Application whitelist**
         * *   **Persistent webshell**
         * *   **Web application threat detection**
         * *   **Malicious script**
         * *   **Threat intelligence**
         * *   **Malicious network activity**
         * *   **Cluster exception**
         * *   **Webshell (on-premises threat detection)**
         * *   **Vulnerability exploitation**
         * *   **Malicious process (on-premises threat detection)**
         * *   **Trusted exception**
         * *   **Others**
         */
        public Builder parentEventTypes(String parentEventTypes) {
            this.putQueryParameter("ParentEventTypes", parentEventTypes);
            this.parentEventTypes = parentEventTypes;
            return this;
        }

        /**
         * The remarks.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The source IP address of the request. The value of this parameter is specified by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The handling status of the exception. Valid values:
         * <p>
         * 
         * *   **0**: all status
         * *   **1**: pending handling
         * *   **2**: ignored
         * *   **4**: confirmed
         * *   **8**: marked as false positive
         * *   **16**: handling
         * *   **32**: handled
         * *   **64**: expired
         * *   **128**: deleted
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The dimension from which you want to configure the feature. Valid values:
         * <p>
         * 
         * *   **uuid**: the UUID of the asset
         * *   **image_repo**: the ID of the image repository
         * *   **Cluster**: the ID of the cluster
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The end of the time range during which the exception is detected.
         */
        public Builder timeEnd(String timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The beginning of the time range during which the exception is detected.
         */
        public Builder timeStart(String timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        /**
         * UniqueInfo.
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * Uuid.
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
