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
 * {@link DescribeCloudVendorAccountAKListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudVendorAccountAKListResponseBody</p>
 */
public class DescribeCloudVendorAccountAKListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudVendorAccountAKs")
    private java.util.List<CloudVendorAccountAKs> cloudVendorAccountAKs;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudVendorAccountAKListResponseBody(Builder builder) {
        this.cloudVendorAccountAKs = builder.cloudVendorAccountAKs;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudVendorAccountAKListResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudVendorAccountAKs
     */
    public java.util.List<CloudVendorAccountAKs> getCloudVendorAccountAKs() {
        return this.cloudVendorAccountAKs;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CloudVendorAccountAKs> cloudVendorAccountAKs; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the AccessKey pairs.</p>
         */
        public Builder cloudVendorAccountAKs(java.util.List<CloudVendorAccountAKs> cloudVendorAccountAKs) {
            this.cloudVendorAccountAKs = cloudVendorAccountAKs;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudVendorAccountAKListResponseBody build() {
            return new DescribeCloudVendorAccountAKListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudVendorAccountAKListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudVendorAccountAKListResponseBody</p>
     */
    public static class AuthModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("ModuleAssetType")
        private String moduleAssetType;

        @com.aliyun.core.annotation.NameInMap("ModuleDisp")
        private String moduleDisp;

        @com.aliyun.core.annotation.NameInMap("ModuleServiceStatus")
        private Integer moduleServiceStatus;

        @com.aliyun.core.annotation.NameInMap("ModuleStatement")
        private String moduleStatement;

        @com.aliyun.core.annotation.NameInMap("TrailMessage")
        private String trailMessage;

        @com.aliyun.core.annotation.NameInMap("TrailStatus")
        private String trailStatus;

        private AuthModules(Builder builder) {
            this.message = builder.message;
            this.module = builder.module;
            this.moduleAssetType = builder.moduleAssetType;
            this.moduleDisp = builder.moduleDisp;
            this.moduleServiceStatus = builder.moduleServiceStatus;
            this.moduleStatement = builder.moduleStatement;
            this.trailMessage = builder.trailMessage;
            this.trailStatus = builder.trailStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthModules create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return moduleAssetType
         */
        public String getModuleAssetType() {
            return this.moduleAssetType;
        }

        /**
         * @return moduleDisp
         */
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        /**
         * @return moduleServiceStatus
         */
        public Integer getModuleServiceStatus() {
            return this.moduleServiceStatus;
        }

        /**
         * @return moduleStatement
         */
        public String getModuleStatement() {
            return this.moduleStatement;
        }

        /**
         * @return trailMessage
         */
        public String getTrailMessage() {
            return this.trailMessage;
        }

        /**
         * @return trailStatus
         */
        public String getTrailStatus() {
            return this.trailStatus;
        }

        public static final class Builder {
            private String message; 
            private String module; 
            private String moduleAssetType; 
            private String moduleDisp; 
            private Integer moduleServiceStatus; 
            private String moduleStatement; 
            private String trailMessage; 
            private String trailStatus; 

            /**
             * <p>The error message of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_domain_error</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The code of the module. Valid values:</p>
             * <ul>
             * <li><strong>HOST</strong>: host</li>
             * <li><strong>CSPM</strong>: configuration assessment</li>
             * <li><strong>SIEM</strong>: CloudSiem</li>
             * <li><strong>TRIAL</strong>: log audit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HOST</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The cloud asset that is associated with the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud server or virtual machine</p>
             */
            public Builder moduleAssetType(String moduleAssetType) {
                this.moduleAssetType = moduleAssetType;
                return this;
            }

            /**
             * <p>The display name of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Host Assets</p>
             */
            public Builder moduleDisp(String moduleDisp) {
                this.moduleDisp = moduleDisp;
                return this;
            }

            /**
             * <p>The service status of the module. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: being used</li>
             * <li><strong>1</strong>: exception occurred</li>
             * <li><strong>2</strong>: being validated</li>
             * <li><strong>3</strong>: validation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder moduleServiceStatus(Integer moduleServiceStatus) {
                this.moduleServiceStatus = moduleServiceStatus;
                return this;
            }

            /**
             * <p>The permission description of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Read permission of the cloud server or virtual machine</p>
             */
            public Builder moduleStatement(String moduleStatement) {
                this.moduleStatement = moduleStatement;
                return this;
            }

            /**
             * <p>The error message of the log audit service.</p>
             * 
             * <strong>example:</strong>
             * <p>timeout</p>
             */
            public Builder trailMessage(String trailMessage) {
                this.trailMessage = trailMessage;
                return this;
            }

            /**
             * <p>The status of the log audit service. Valid values:</p>
             * <ul>
             * <li><strong>init</strong>: being initialized</li>
             * <li><strong>verify</strong>: being validated</li>
             * <li><strong>enable</strong>: enabled</li>
             * <li><strong>disable</strong>: disabled</li>
             * <li><strong>error</strong>: exception occurred</li>
             * <li><strong>timeout</strong>: validation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder trailStatus(String trailStatus) {
                this.trailStatus = trailStatus;
                return this;
            }

            public AuthModules build() {
                return new AuthModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudVendorAccountAKListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudVendorAccountAKListResponseBody</p>
     */
    public static class CloudVendorAccountAKs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AkType")
        private String akType;

        @com.aliyun.core.annotation.NameInMap("AuthId")
        private Long authId;

        @com.aliyun.core.annotation.NameInMap("AuthModules")
        private java.util.List<AuthModules> authModules;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("VendorAuthAlias")
        private String vendorAuthAlias;

        private CloudVendorAccountAKs(Builder builder) {
            this.akType = builder.akType;
            this.authId = builder.authId;
            this.authModules = builder.authModules;
            this.message = builder.message;
            this.secretId = builder.secretId;
            this.serviceStatus = builder.serviceStatus;
            this.status = builder.status;
            this.vendor = builder.vendor;
            this.vendorAuthAlias = builder.vendorAuthAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudVendorAccountAKs create() {
            return builder().build();
        }

        /**
         * @return akType
         */
        public String getAkType() {
            return this.akType;
        }

        /**
         * @return authId
         */
        public Long getAuthId() {
            return this.authId;
        }

        /**
         * @return authModules
         */
        public java.util.List<AuthModules> getAuthModules() {
            return this.authModules;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorAuthAlias
         */
        public String getVendorAuthAlias() {
            return this.vendorAuthAlias;
        }

        public static final class Builder {
            private String akType; 
            private Long authId; 
            private java.util.List<AuthModules> authModules; 
            private String message; 
            private String secretId; 
            private Integer serviceStatus; 
            private Integer status; 
            private String vendor; 
            private String vendorAuthAlias; 

            /**
             * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong>: a primary account</li>
             * <li><strong>sub</strong>: a sub-account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder akType(String akType) {
                this.akType = akType;
                return this;
            }

            /**
             * <p>The unique ID of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder authId(Long authId) {
                this.authId = authId;
                return this;
            }

            /**
             * <p>The modules that are associated with the AccessKey pair.</p>
             */
            public Builder authModules(java.util.List<AuthModules> authModules) {
                this.authModules = authModules;
                return this;
            }

            /**
             * <p>The error message of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>The IAM user is forbidden in the currently selected region</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S3D6c4O***</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The service status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: being used</li>
             * <li><strong>1</strong>: exception occurred</li>
             * <li><strong>2</strong>: being validated</li>
             * <li><strong>3</strong>: validation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: enabled</li>
             * <li><strong>1</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cloud service provider. Valid values:</p>
             * <ul>
             * <li><strong>Tencent</strong>: Tencent Cloud</li>
             * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
             * <li><strong>Azure</strong>: Microsoft Azure</li>
             * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tencent</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The name of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder vendorAuthAlias(String vendorAuthAlias) {
                this.vendorAuthAlias = vendorAuthAlias;
                return this;
            }

            public CloudVendorAccountAKs build() {
                return new CloudVendorAccountAKs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudVendorAccountAKListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudVendorAccountAKListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
