// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListTenantAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantAppResponseBody</p>
 */
public class ListTenantAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTenantAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTenantAppResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business result code, returned as a string. The value is typically &quot;200&quot; when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of applications on the current page. Each element represents an application.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code field in the business response. This field may be empty. The actual transmission status is determined by the HTTP response status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the request processing result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The actual page number of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The actual number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request tracking ID. Provide this value when reporting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111-2222-4333-8444-555555555555</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was processed successfully. Valid values:</p>
         * <ul>
         * <li>true: Succeeded.</li>
         * <li>false: Failed.</li>
         * </ul>
         * <p>Refer to the corresponding field descriptions for specific business meanings.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of applications that match the filter conditions. This value is not equal to the length of the array on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTenantAppResponseBody build() {
            return new ListTenantAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminTag")
        private java.util.List<String> adminTag;

        @com.aliyun.core.annotation.NameInMap("AppAdminTag")
        private String appAdminTag;

        @com.aliyun.core.annotation.NameInMap("AppRegInfo")
        private String appRegInfo;

        @com.aliyun.core.annotation.NameInMap("AppTag")
        private java.util.List<String> appTag;

        @com.aliyun.core.annotation.NameInMap("AppUid")
        private String appUid;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("AutoDeleteFlag")
        private Boolean autoDeleteFlag;

        @com.aliyun.core.annotation.NameInMap("AutoInstallFlag")
        private Boolean autoInstallFlag;

        @com.aliyun.core.annotation.NameInMap("AutoInstallType")
        private String autoInstallType;

        @com.aliyun.core.annotation.NameInMap("AutoInstallmentType")
        private Integer autoInstallmentType;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Integer cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("ClusterUid")
        private String clusterUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Developer")
        private String developer;

        @com.aliyun.core.annotation.NameInMap("DiscountPrice")
        private Double discountPrice;

        @com.aliyun.core.annotation.NameInMap("DistributeType")
        private String distributeType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileRealName")
        private String fileRealName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HasCert")
        private Boolean hasCert;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("IconUrlInternal")
        private String iconUrlInternal;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Install")
        private Boolean install;

        @com.aliyun.core.annotation.NameInMap("InstallMode")
        private Integer installMode;

        @com.aliyun.core.annotation.NameInMap("IsAdmin")
        private Boolean isAdmin;

        @com.aliyun.core.annotation.NameInMap("IsFree")
        private String isFree;

        @com.aliyun.core.annotation.NameInMap("IsGame")
        private Boolean isGame;

        @com.aliyun.core.annotation.NameInMap("IsWhiteList")
        private Integer isWhiteList;

        @com.aliyun.core.annotation.NameInMap("ItemCode")
        private String itemCode;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("ManageCateEnName")
        private String manageCateEnName;

        @com.aliyun.core.annotation.NameInMap("ManageCateId")
        private Integer manageCateId;

        @com.aliyun.core.annotation.NameInMap("ManageCateName")
        private String manageCateName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OriginAppType")
        private String originAppType;

        @com.aliyun.core.annotation.NameInMap("OriginalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OwnerOs")
        private String ownerOs;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private Integer paymentType;

        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PublishDate")
        private String publishDate;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private String publishType;

        @com.aliyun.core.annotation.NameInMap("SandboxMode")
        private Integer sandboxMode;

        @com.aliyun.core.annotation.NameInMap("SearchTag")
        private String searchTag;

        @com.aliyun.core.annotation.NameInMap("SilenceDeleteFlag")
        private Integer silenceDeleteFlag;

        @com.aliyun.core.annotation.NameInMap("SilenceDeleteParam")
        private String silenceDeleteParam;

        @com.aliyun.core.annotation.NameInMap("SilenceFlag")
        private Integer silenceFlag;

        @com.aliyun.core.annotation.NameInMap("SilenceParam")
        private String silenceParam;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubAppType")
        private String subAppType;

        @com.aliyun.core.annotation.NameInMap("SubSourceType")
        private String subSourceType;

        @com.aliyun.core.annotation.NameInMap("SubscribeCount")
        private Long subscribeCount;

        @com.aliyun.core.annotation.NameInMap("SupplierId")
        private Long supplierId;

        @com.aliyun.core.annotation.NameInMap("UserTag")
        private java.util.List<String> userTag;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("WamFileName")
        private String wamFileName;

        @com.aliyun.core.annotation.NameInMap("WamFilePath")
        private String wamFilePath;

        @com.aliyun.core.annotation.NameInMap("WamFileRealName")
        private String wamFileRealName;

        @com.aliyun.core.annotation.NameInMap("WamFileSize")
        private Long wamFileSize;

        private Data(Builder builder) {
            this.adminTag = builder.adminTag;
            this.appAdminTag = builder.appAdminTag;
            this.appRegInfo = builder.appRegInfo;
            this.appTag = builder.appTag;
            this.appUid = builder.appUid;
            this.authType = builder.authType;
            this.autoDeleteFlag = builder.autoDeleteFlag;
            this.autoInstallFlag = builder.autoInstallFlag;
            this.autoInstallType = builder.autoInstallType;
            this.autoInstallmentType = builder.autoInstallmentType;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.clusterUid = builder.clusterUid;
            this.description = builder.description;
            this.developer = builder.developer;
            this.discountPrice = builder.discountPrice;
            this.distributeType = builder.distributeType;
            this.expireTime = builder.expireTime;
            this.extend = builder.extend;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.fileRealName = builder.fileRealName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasCert = builder.hasCert;
            this.iconUrl = builder.iconUrl;
            this.iconUrlInternal = builder.iconUrlInternal;
            this.id = builder.id;
            this.install = builder.install;
            this.installMode = builder.installMode;
            this.isAdmin = builder.isAdmin;
            this.isFree = builder.isFree;
            this.isGame = builder.isGame;
            this.isWhiteList = builder.isWhiteList;
            this.itemCode = builder.itemCode;
            this.labels = builder.labels;
            this.licenseType = builder.licenseType;
            this.manageCateEnName = builder.manageCateEnName;
            this.manageCateId = builder.manageCateId;
            this.manageCateName = builder.manageCateName;
            this.name = builder.name;
            this.originAppType = builder.originAppType;
            this.originalPrice = builder.originalPrice;
            this.osType = builder.osType;
            this.ownerOs = builder.ownerOs;
            this.paymentType = builder.paymentType;
            this.price = builder.price;
            this.priority = builder.priority;
            this.publishDate = builder.publishDate;
            this.publishType = builder.publishType;
            this.sandboxMode = builder.sandboxMode;
            this.searchTag = builder.searchTag;
            this.silenceDeleteFlag = builder.silenceDeleteFlag;
            this.silenceDeleteParam = builder.silenceDeleteParam;
            this.silenceFlag = builder.silenceFlag;
            this.silenceParam = builder.silenceParam;
            this.size = builder.size;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subAppType = builder.subAppType;
            this.subSourceType = builder.subSourceType;
            this.subscribeCount = builder.subscribeCount;
            this.supplierId = builder.supplierId;
            this.userTag = builder.userTag;
            this.version = builder.version;
            this.versionName = builder.versionName;
            this.wamFileName = builder.wamFileName;
            this.wamFilePath = builder.wamFilePath;
            this.wamFileRealName = builder.wamFileRealName;
            this.wamFileSize = builder.wamFileSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adminTag
         */
        public java.util.List<String> getAdminTag() {
            return this.adminTag;
        }

        /**
         * @return appAdminTag
         */
        public String getAppAdminTag() {
            return this.appAdminTag;
        }

        /**
         * @return appRegInfo
         */
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        /**
         * @return appTag
         */
        public java.util.List<String> getAppTag() {
            return this.appTag;
        }

        /**
         * @return appUid
         */
        public String getAppUid() {
            return this.appUid;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return autoDeleteFlag
         */
        public Boolean getAutoDeleteFlag() {
            return this.autoDeleteFlag;
        }

        /**
         * @return autoInstallFlag
         */
        public Boolean getAutoInstallFlag() {
            return this.autoInstallFlag;
        }

        /**
         * @return autoInstallType
         */
        public String getAutoInstallType() {
            return this.autoInstallType;
        }

        /**
         * @return autoInstallmentType
         */
        public Integer getAutoInstallmentType() {
            return this.autoInstallmentType;
        }

        /**
         * @return cateId
         */
        public Integer getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return clusterUid
         */
        public String getClusterUid() {
            return this.clusterUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return developer
         */
        public String getDeveloper() {
            return this.developer;
        }

        /**
         * @return discountPrice
         */
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return distributeType
         */
        public String getDistributeType() {
            return this.distributeType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileRealName
         */
        public String getFileRealName() {
            return this.fileRealName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasCert
         */
        public Boolean getHasCert() {
            return this.hasCert;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return iconUrlInternal
         */
        public String getIconUrlInternal() {
            return this.iconUrlInternal;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return install
         */
        public Boolean getInstall() {
            return this.install;
        }

        /**
         * @return installMode
         */
        public Integer getInstallMode() {
            return this.installMode;
        }

        /**
         * @return isAdmin
         */
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        /**
         * @return isFree
         */
        public String getIsFree() {
            return this.isFree;
        }

        /**
         * @return isGame
         */
        public Boolean getIsGame() {
            return this.isGame;
        }

        /**
         * @return isWhiteList
         */
        public Integer getIsWhiteList() {
            return this.isWhiteList;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return manageCateEnName
         */
        public String getManageCateEnName() {
            return this.manageCateEnName;
        }

        /**
         * @return manageCateId
         */
        public Integer getManageCateId() {
            return this.manageCateId;
        }

        /**
         * @return manageCateName
         */
        public String getManageCateName() {
            return this.manageCateName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return originAppType
         */
        public String getOriginAppType() {
            return this.originAppType;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return ownerOs
         */
        public String getOwnerOs() {
            return this.ownerOs;
        }

        /**
         * @return paymentType
         */
        public Integer getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return sandboxMode
         */
        public Integer getSandboxMode() {
            return this.sandboxMode;
        }

        /**
         * @return searchTag
         */
        public String getSearchTag() {
            return this.searchTag;
        }

        /**
         * @return silenceDeleteFlag
         */
        public Integer getSilenceDeleteFlag() {
            return this.silenceDeleteFlag;
        }

        /**
         * @return silenceDeleteParam
         */
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        /**
         * @return silenceFlag
         */
        public Integer getSilenceFlag() {
            return this.silenceFlag;
        }

        /**
         * @return silenceParam
         */
        public String getSilenceParam() {
            return this.silenceParam;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subAppType
         */
        public String getSubAppType() {
            return this.subAppType;
        }

        /**
         * @return subSourceType
         */
        public String getSubSourceType() {
            return this.subSourceType;
        }

        /**
         * @return subscribeCount
         */
        public Long getSubscribeCount() {
            return this.subscribeCount;
        }

        /**
         * @return supplierId
         */
        public Long getSupplierId() {
            return this.supplierId;
        }

        /**
         * @return userTag
         */
        public java.util.List<String> getUserTag() {
            return this.userTag;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return wamFileName
         */
        public String getWamFileName() {
            return this.wamFileName;
        }

        /**
         * @return wamFilePath
         */
        public String getWamFilePath() {
            return this.wamFilePath;
        }

        /**
         * @return wamFileRealName
         */
        public String getWamFileRealName() {
            return this.wamFileRealName;
        }

        /**
         * @return wamFileSize
         */
        public Long getWamFileSize() {
            return this.wamFileSize;
        }

        public static final class Builder {
            private java.util.List<String> adminTag; 
            private String appAdminTag; 
            private String appRegInfo; 
            private java.util.List<String> appTag; 
            private String appUid; 
            private String authType; 
            private Boolean autoDeleteFlag; 
            private Boolean autoInstallFlag; 
            private String autoInstallType; 
            private Integer autoInstallmentType; 
            private Integer cateId; 
            private String cateName; 
            private String clusterUid; 
            private String description; 
            private String developer; 
            private Double discountPrice; 
            private String distributeType; 
            private String expireTime; 
            private String extend; 
            private String fileName; 
            private String filePath; 
            private String fileRealName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasCert; 
            private String iconUrl; 
            private String iconUrlInternal; 
            private Integer id; 
            private Boolean install; 
            private Integer installMode; 
            private Boolean isAdmin; 
            private String isFree; 
            private Boolean isGame; 
            private Integer isWhiteList; 
            private String itemCode; 
            private String labels; 
            private String licenseType; 
            private String manageCateEnName; 
            private Integer manageCateId; 
            private String manageCateName; 
            private String name; 
            private String originAppType; 
            private Double originalPrice; 
            private String osType; 
            private String ownerOs; 
            private Integer paymentType; 
            private String price; 
            private Integer priority; 
            private String publishDate; 
            private String publishType; 
            private Integer sandboxMode; 
            private String searchTag; 
            private Integer silenceDeleteFlag; 
            private String silenceDeleteParam; 
            private Integer silenceFlag; 
            private String silenceParam; 
            private Long size; 
            private String sourceType; 
            private String startTime; 
            private String status; 
            private String subAppType; 
            private String subSourceType; 
            private Long subscribeCount; 
            private Long supplierId; 
            private java.util.List<String> userTag; 
            private String version; 
            private String versionName; 
            private String wamFileName; 
            private String wamFilePath; 
            private String wamFileRealName; 
            private Long wamFileSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adminTag = model.adminTag;
                this.appAdminTag = model.appAdminTag;
                this.appRegInfo = model.appRegInfo;
                this.appTag = model.appTag;
                this.appUid = model.appUid;
                this.authType = model.authType;
                this.autoDeleteFlag = model.autoDeleteFlag;
                this.autoInstallFlag = model.autoInstallFlag;
                this.autoInstallType = model.autoInstallType;
                this.autoInstallmentType = model.autoInstallmentType;
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.clusterUid = model.clusterUid;
                this.description = model.description;
                this.developer = model.developer;
                this.discountPrice = model.discountPrice;
                this.distributeType = model.distributeType;
                this.expireTime = model.expireTime;
                this.extend = model.extend;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.fileRealName = model.fileRealName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hasCert = model.hasCert;
                this.iconUrl = model.iconUrl;
                this.iconUrlInternal = model.iconUrlInternal;
                this.id = model.id;
                this.install = model.install;
                this.installMode = model.installMode;
                this.isAdmin = model.isAdmin;
                this.isFree = model.isFree;
                this.isGame = model.isGame;
                this.isWhiteList = model.isWhiteList;
                this.itemCode = model.itemCode;
                this.labels = model.labels;
                this.licenseType = model.licenseType;
                this.manageCateEnName = model.manageCateEnName;
                this.manageCateId = model.manageCateId;
                this.manageCateName = model.manageCateName;
                this.name = model.name;
                this.originAppType = model.originAppType;
                this.originalPrice = model.originalPrice;
                this.osType = model.osType;
                this.ownerOs = model.ownerOs;
                this.paymentType = model.paymentType;
                this.price = model.price;
                this.priority = model.priority;
                this.publishDate = model.publishDate;
                this.publishType = model.publishType;
                this.sandboxMode = model.sandboxMode;
                this.searchTag = model.searchTag;
                this.silenceDeleteFlag = model.silenceDeleteFlag;
                this.silenceDeleteParam = model.silenceDeleteParam;
                this.silenceFlag = model.silenceFlag;
                this.silenceParam = model.silenceParam;
                this.size = model.size;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.subAppType = model.subAppType;
                this.subSourceType = model.subSourceType;
                this.subscribeCount = model.subscribeCount;
                this.supplierId = model.supplierId;
                this.userTag = model.userTag;
                this.version = model.version;
                this.versionName = model.versionName;
                this.wamFileName = model.wamFileName;
                this.wamFilePath = model.wamFilePath;
                this.wamFileRealName = model.wamFileRealName;
                this.wamFileSize = model.wamFileSize;
            } 

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             */
            public Builder adminTag(java.util.List<String> adminTag) {
                this.adminTag = adminTag;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             * 
             * <strong>example:</strong>
             * <p>Recommended</p>
             */
            public Builder appAdminTag(String appAdminTag) {
                this.appAdminTag = appAdminTag;
                return this;
            }

            /**
             * <p>The application registry identification information, returned as a string. This value can be used to match the name of an application registry entry.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleEditor</p>
             */
            public Builder appRegInfo(String appRegInfo) {
                this.appRegInfo = appRegInfo;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             */
            public Builder appTag(java.util.List<String> appTag) {
                this.appTag = appTag;
                return this;
            }

            /**
             * <p>The application UID string, which is a different identifier from the numeric Id field.</p>
             * 
             * <strong>example:</strong>
             * <p>app-demo-001</p>
             */
            public Builder appUid(String appUid) {
                this.appUid = appUid;
                return this;
            }

            /**
             * <p>The authorization dimension of the application.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>auth_type_user: Authorized by user.</li>
             * <li>auth_type_resource_group: Authorized by resource group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auth_type_user</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder autoDeleteFlag(Boolean autoDeleteFlag) {
                this.autoDeleteFlag = autoDeleteFlag;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder autoInstallFlag(Boolean autoInstallFlag) {
                this.autoInstallFlag = autoInstallFlag;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>SILENCE_INSTALL</p>
             */
            public Builder autoInstallType(String autoInstallType) {
                this.autoInstallType = autoInstallType;
                return this;
            }

            /**
             * <p>The new automatic installation scope policy. Use this field together with AuthType to determine the authorization dimension. Valid values:</p>
             * <ul>
             * <li>0: Automatically install for all visible users or resource groups.</li>
             * <li>1: Automatically install for some visible users or resource groups.</li>
             * <li>2: Disable automatic installation.</li>
             * <li>99: Unknown policy.</li>
             * </ul>
             * <p>This field describes the configuration scope and does not indicate that the installation has been completed on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoInstallmentType(Integer autoInstallmentType) {
                this.autoInstallmentType = autoInstallmentType;
                return this;
            }

            /**
             * <p>The display category ID of the application. The category ID is a dynamic identifier and is not a fixed enumeration.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The display category name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Office</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>cluster-demo-001</p>
             */
            public Builder clusterUid(String clusterUid) {
                this.clusterUid = clusterUid;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Used for document editing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the application developer.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample Software Company</p>
             */
            public Builder developer(String developer) {
                this.developer = developer;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder discountPrice(Double discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * <p>The authorization distribution scope of the application. This field must be interpreted together with AuthType. An empty value does not necessarily mean that the application is not distributed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ALL: Distributed to all.</li>
             * <li>DESIGNATED: Distributed to a specified scope.</li>
             * <li>NOTDISTRO: Not distributed.</li>
             * <li>UNKNOWN: Unknown scope.</li>
             * </ul>
             * <p>The distribution target is determined by AuthType.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder distributeType(String distributeType) {
                this.distributeType = distributeType;
                return this;
            }

            /**
             * <p>The authorization end time of the application. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-07T00:00:00.000+0000</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The extended information of the application, returned as a string. There is no unified fixed field structure.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The storage file name of the installation package, which may differ from the original file name.</p>
             * 
             * <strong>example:</strong>
             * <p>editor_1.2.3.exe</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The storage path of the installation package. This value is not a directly accessible download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>packages/example/editor.exe</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The original file name of the installation package.</p>
             * 
             * <strong>example:</strong>
             * <p>editor.exe</p>
             */
            public Builder fileRealName(String fileRealName) {
                this.fileRealName = fileRealName;
                return this;
            }

            /**
             * <p>The creation time of the application record. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T09:04:38.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time of the application record. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T09:04:38.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder hasCert(Boolean hasCert) {
                this.hasCert = hasCert;
                return this;
            }

            /**
             * <p>The icon URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/icons/editor.png">https://example.com/icons/editor.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The internal network icon URL of the application. Use this URL only when the corresponding network access conditions are met. The domain name in the example is for illustrative purposes only.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/icons/editor.png">https://example.com/icons/editor.png</a></p>
             */
            public Builder iconUrlInternal(String iconUrlInternal) {
                this.iconUrlInternal = iconUrlInternal;
                return this;
            }

            /**
             * <p>The numeric ID of the application, used as the identity of the application and to associate what to do next.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder install(Boolean install) {
                this.install = install;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder installMode(Integer installMode) {
                this.installMode = installMode;
                return this;
            }

            /**
             * <p>Specifies whether elevated privilege installation is configured. This does not indicate the administrator identity of the caller.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Elevated privilege installation is configured.</li>
             * <li>false: Elevated privilege installation is not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAdmin(Boolean isAdmin) {
                this.isAdmin = isAdmin;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>TRUE</p>
             */
            public Builder isFree(String isFree) {
                this.isFree = isFree;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             */
            public Builder isGame(Boolean isGame) {
                this.isGame = isGame;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isWhiteList(Integer isWhiteList) {
                this.isWhiteList = isWhiteList;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>app-demo-001</p>
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             * 
             * <strong>example:</strong>
             * <p>Office</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * <p>The English name of the management category of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Office</p>
             */
            public Builder manageCateEnName(String manageCateEnName) {
                this.manageCateEnName = manageCateEnName;
                return this;
            }

            /**
             * <p>The management category ID of the application, which may differ from the display category CateId.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder manageCateId(Integer manageCateId) {
                this.manageCateId = manageCateId;
                return this;
            }

            /**
             * <p>The management category name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Office</p>
             */
            public Builder manageCateName(String manageCateName) {
                this.manageCateName = manageCateName;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleEditor</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The application type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ClientBase: Client-based application.</li>
             * <li>WebBase: Web-based application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ClientBase</p>
             */
            public Builder originAppType(String originAppType) {
                this.originAppType = originAppType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * <p>The operating system type of the application.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>WINDOWS: Windows.</li>
             * <li>LINUX: Linux.</li>
             * <li>ANDROID: Android.</li>
             * <li>UNKNOWN: Unknown operating system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WINDOWS</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>WINDOWS</p>
             */
            public Builder ownerOs(String ownerOs) {
                this.ownerOs = ownerOs;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paymentType(Integer paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The publish time of the application. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T09:04:39.000+0000</p>
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * <p>The customer scope of the application.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ENT: Enterprise.</li>
             * <li>PER: Individual.</li>
             * <li>BOTH: Enterprise and individual.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENT</p>
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sandboxMode(Integer sandboxMode) {
                this.sandboxMode = sandboxMode;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             * 
             * <strong>example:</strong>
             * <p>Edit Document</p>
             */
            public Builder searchTag(String searchTag) {
                this.searchTag = searchTag;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder silenceDeleteFlag(Integer silenceDeleteFlag) {
                this.silenceDeleteFlag = silenceDeleteFlag;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>/uninstall /quiet</p>
             */
            public Builder silenceDeleteParam(String silenceDeleteParam) {
                this.silenceDeleteParam = silenceDeleteParam;
                return this;
            }

            /**
             * <p>Indicates whether silent installtion is supported. Valid values:</p>
             * <ul>
             * <li>0: Not supported.</li>
             * <li>1: Supported.</li>
             * </ul>
             * <p>This field indicates the application capability and does not represent the actual installation execute result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder silenceFlag(Integer silenceFlag) {
                this.silenceFlag = silenceFlag;
                return this;
            }

            /**
             * <p>The silent installtion parameters, used by the corresponding installation flow.</p>
             * 
             * <strong>example:</strong>
             * <p>/quiet</p>
             */
            public Builder silenceParam(String silenceParam) {
                this.silenceParam = silenceParam;
                return this;
            }

            /**
             * <p>The size of the installation package.</p>
             * 
             * <strong>example:</strong>
             * <p>10485760</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The application source. Valid values:</p>
             * <ul>
             * <li>MARKET: Alibaba Cloud Marketplace application.</li>
             * <li>TENANT: Tenant-uploaded application.</li>
             * <li>UNKNOWN: Unknown source.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TENANT</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The start time of the application authorization. The value is returned as a string with time zone information, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-07T00:00:00.000+0000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The application status. This field does not represent the installation status on the endpoint. Valid values:</p>
             * <ul>
             * <li>NORMAL: Normal.</li>
             * <li>DELETE: Deleted.</li>
             * <li>UNCHECK: Not reviewed or not verified.</li>
             * <li>DISABLE: All versions are unavailable.</li>
             * <li>UNKNOWN: Unknown status.</li>
             * </ul>
             * <p><strong>The following historical statuses from the sandbox packaging and publishing process are deprecated. Do not use them: UNPACKED (not packaged), TESTING (packaged, pending testing), UNPUBLISHED (testing completed, not published), PUBLISHED (published).</strong></p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>sandbox</p>
             */
            public Builder subAppType(String subAppType) {
                this.subAppType = subAppType;
                return this;
            }

            /**
             * <p>The secondary source of the application. Valid values:</p>
             * <ul>
             * <li>ALI_MARKET: Alibaba Cloud Marketplace.</li>
             * <li>ISV: Independent software vendor.</li>
             * <li>OPS: Operations channel.</li>
             * <li>UNKNOWN: Unknown source.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ISV</p>
             */
            public Builder subSourceType(String subSourceType) {
                this.subSourceType = subSourceType;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subscribeCount(Long subscribeCount) {
                this.subscribeCount = subscribeCount;
                return this;
            }

            /**
             * <p>The account ID of the application supplier or uploader.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder supplierId(Long supplierId) {
                this.supplierId = supplierId;
                return this;
            }

            /**
             * <p>An internal field. We do not recommend that you use this field.</p>
             */
            public Builder userTag(java.util.List<String> userTag) {
                this.userTag = userTag;
                return this;
            }

            /**
             * <p>The application version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The display name of the application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3 Release</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>editor_1.2.3.wam</p>
             */
            public Builder wamFileName(String wamFileName) {
                this.wamFileName = wamFileName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>packages/example/editor.wam</p>
             */
            public Builder wamFilePath(String wamFilePath) {
                this.wamFilePath = wamFilePath;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>editor.wam</p>
             */
            public Builder wamFileRealName(String wamFileRealName) {
                this.wamFileRealName = wamFileRealName;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder wamFileSize(Long wamFileSize) {
                this.wamFileSize = wamFileSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
