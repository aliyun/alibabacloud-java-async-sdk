// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDifyInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDifyInstancesResponseBody</p>
 */
public class ListDifyInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListDifyInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDifyInstancesResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String code; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Root root; 
        private Boolean success; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(ListDifyInstancesResponseBody model) {
            this.code = model.code;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
            this.tags = model.tags;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ListDifyInstancesResponseBody build() {
            return new ListDifyInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDifyInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDifyInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUuid")
        private String appUuid;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DifyInstanceId")
        private String difyInstanceId;

        @com.aliyun.core.annotation.NameInMap("DifyInstanceName")
        private String difyInstanceName;

        @com.aliyun.core.annotation.NameInMap("Edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("EnterpriseInternetUrl")
        private String enterpriseInternetUrl;

        @com.aliyun.core.annotation.NameInMap("EnterpriseIntranetUrl")
        private String enterpriseIntranetUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetUrl")
        private String internetUrl;

        @com.aliyun.core.annotation.NameInMap("IntranetUrl")
        private String intranetUrl;

        @com.aliyun.core.annotation.NameInMap("MajorVersion")
        private String majorVersion;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.appUuid = builder.appUuid;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.difyInstanceId = builder.difyInstanceId;
            this.difyInstanceName = builder.difyInstanceName;
            this.edition = builder.edition;
            this.enterpriseInternetUrl = builder.enterpriseInternetUrl;
            this.enterpriseIntranetUrl = builder.enterpriseIntranetUrl;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetUrl = builder.internetUrl;
            this.intranetUrl = builder.intranetUrl;
            this.majorVersion = builder.majorVersion;
            this.regionCode = builder.regionCode;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.workspaceId = builder.workspaceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appUuid
         */
        public String getAppUuid() {
            return this.appUuid;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return difyInstanceId
         */
        public String getDifyInstanceId() {
            return this.difyInstanceId;
        }

        /**
         * @return difyInstanceName
         */
        public String getDifyInstanceName() {
            return this.difyInstanceName;
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return enterpriseInternetUrl
         */
        public String getEnterpriseInternetUrl() {
            return this.enterpriseInternetUrl;
        }

        /**
         * @return enterpriseIntranetUrl
         */
        public String getEnterpriseIntranetUrl() {
            return this.enterpriseIntranetUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetUrl
         */
        public String getInternetUrl() {
            return this.internetUrl;
        }

        /**
         * @return intranetUrl
         */
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        /**
         * @return majorVersion
         */
        public String getMajorVersion() {
            return this.majorVersion;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String appUuid; 
            private String createdTime; 
            private String description; 
            private String difyInstanceId; 
            private String difyInstanceName; 
            private String edition; 
            private String enterpriseInternetUrl; 
            private String enterpriseIntranetUrl; 
            private String instanceId; 
            private String instanceName; 
            private String internetUrl; 
            private String intranetUrl; 
            private String majorVersion; 
            private String regionCode; 
            private String regionId; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 
            private String workspaceId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appUuid = model.appUuid;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.difyInstanceId = model.difyInstanceId;
                this.difyInstanceName = model.difyInstanceName;
                this.edition = model.edition;
                this.enterpriseInternetUrl = model.enterpriseInternetUrl;
                this.enterpriseIntranetUrl = model.enterpriseIntranetUrl;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetUrl = model.internetUrl;
                this.intranetUrl = model.intranetUrl;
                this.majorVersion = model.majorVersion;
                this.regionCode = model.regionCode;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.workspaceId = model.workspaceId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AppUuid.
             */
            public Builder appUuid(String appUuid) {
                this.appUuid = appUuid;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DifyInstanceId.
             */
            public Builder difyInstanceId(String difyInstanceId) {
                this.difyInstanceId = difyInstanceId;
                return this;
            }

            /**
             * DifyInstanceName.
             */
            public Builder difyInstanceName(String difyInstanceName) {
                this.difyInstanceName = difyInstanceName;
                return this;
            }

            /**
             * Edition.
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * EnterpriseInternetUrl.
             */
            public Builder enterpriseInternetUrl(String enterpriseInternetUrl) {
                this.enterpriseInternetUrl = enterpriseInternetUrl;
                return this;
            }

            /**
             * EnterpriseIntranetUrl.
             */
            public Builder enterpriseIntranetUrl(String enterpriseIntranetUrl) {
                this.enterpriseIntranetUrl = enterpriseIntranetUrl;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetUrl.
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * IntranetUrl.
             */
            public Builder intranetUrl(String intranetUrl) {
                this.intranetUrl = intranetUrl;
                return this;
            }

            /**
             * MajorVersion.
             */
            public Builder majorVersion(String majorVersion) {
                this.majorVersion = majorVersion;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDifyInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDifyInstancesResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        private Root(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDifyInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDifyInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
