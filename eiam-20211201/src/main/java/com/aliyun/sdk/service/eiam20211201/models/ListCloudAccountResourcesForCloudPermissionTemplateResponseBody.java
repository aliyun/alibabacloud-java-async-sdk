// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListCloudAccountResourcesForCloudPermissionTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAccountResourcesForCloudPermissionTemplateResponseBody</p>
 */
public class ListCloudAccountResourcesForCloudPermissionTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccountResources")
    private java.util.List<CloudAccountResources> cloudAccountResources;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCloudAccountResourcesForCloudPermissionTemplateResponseBody(Builder builder) {
        this.cloudAccountResources = builder.cloudAccountResources;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccountResourcesForCloudPermissionTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountResources
     */
    public java.util.List<CloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudAccountResources> cloudAccountResources; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudAccountResourcesForCloudPermissionTemplateResponseBody model) {
            this.cloudAccountResources = model.cloudAccountResources;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of cloud account resources.</p>
         */
        public Builder cloudAccountResources(java.util.List<CloudAccountResources> cloudAccountResources) {
            this.cloudAccountResources = cloudAccountResources;
            return this;
        }

        /**
         * <p>The number of entries returned per page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned in the current response. You can use this token to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody build() {
            return new ListCloudAccountResourcesForCloudPermissionTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAccountResourcesForCloudPermissionTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountResourcesForCloudPermissionTemplateResponseBody</p>
     */
    public static class CloudAccountResourceMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CamPolicyDocument")
        private String camPolicyDocument;

        @com.aliyun.core.annotation.NameInMap("CamPolicyType")
        private String camPolicyType;

        @com.aliyun.core.annotation.NameInMap("IamPolicyDocument")
        private String iamPolicyDocument;

        @com.aliyun.core.annotation.NameInMap("IamPolicyType")
        private String iamPolicyType;

        @com.aliyun.core.annotation.NameInMap("RamPolicyDocument")
        private String ramPolicyDocument;

        @com.aliyun.core.annotation.NameInMap("RamPolicyType")
        private String ramPolicyType;

        private CloudAccountResourceMeta(Builder builder) {
            this.camPolicyDocument = builder.camPolicyDocument;
            this.camPolicyType = builder.camPolicyType;
            this.iamPolicyDocument = builder.iamPolicyDocument;
            this.iamPolicyType = builder.iamPolicyType;
            this.ramPolicyDocument = builder.ramPolicyDocument;
            this.ramPolicyType = builder.ramPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountResourceMeta create() {
            return builder().build();
        }

        /**
         * @return camPolicyDocument
         */
        public String getCamPolicyDocument() {
            return this.camPolicyDocument;
        }

        /**
         * @return camPolicyType
         */
        public String getCamPolicyType() {
            return this.camPolicyType;
        }

        /**
         * @return iamPolicyDocument
         */
        public String getIamPolicyDocument() {
            return this.iamPolicyDocument;
        }

        /**
         * @return iamPolicyType
         */
        public String getIamPolicyType() {
            return this.iamPolicyType;
        }

        /**
         * @return ramPolicyDocument
         */
        public String getRamPolicyDocument() {
            return this.ramPolicyDocument;
        }

        /**
         * @return ramPolicyType
         */
        public String getRamPolicyType() {
            return this.ramPolicyType;
        }

        public static final class Builder {
            private String camPolicyDocument; 
            private String camPolicyType; 
            private String iamPolicyDocument; 
            private String iamPolicyType; 
            private String ramPolicyDocument; 
            private String ramPolicyType; 

            private Builder() {
            } 

            private Builder(CloudAccountResourceMeta model) {
                this.camPolicyDocument = model.camPolicyDocument;
                this.camPolicyType = model.camPolicyType;
                this.iamPolicyDocument = model.iamPolicyDocument;
                this.iamPolicyType = model.iamPolicyType;
                this.ramPolicyDocument = model.ramPolicyDocument;
                this.ramPolicyType = model.ramPolicyType;
            } 

            /**
             * <p>The JSON string of the Tencent Cloud CAM policy document. This parameter is returned only for Tencent Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
             */
            public Builder camPolicyDocument(String camPolicyDocument) {
                this.camPolicyDocument = camPolicyDocument;
                return this;
            }

            /**
             * <p>The type of the Tencent Cloud Access Management (CAM) policy. Valid values: qcs and local. This parameter is returned only for Tencent Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>qcs</p>
             */
            public Builder camPolicyType(String camPolicyType) {
                this.camPolicyType = camPolicyType;
                return this;
            }

            /**
             * <p>The JSON string of the AWS IAM policy document. This parameter is returned only for AWS cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[]}</p>
             */
            public Builder iamPolicyDocument(String iamPolicyDocument) {
                this.iamPolicyDocument = iamPolicyDocument;
                return this;
            }

            /**
             * <p>The type of the AWS Identity and Access Management (IAM) policy. Valid values: aws and local. This parameter is returned only for AWS cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>aws</p>
             */
            public Builder iamPolicyType(String iamPolicyType) {
                this.iamPolicyType = iamPolicyType;
                return this;
            }

            /**
             * <p>The JSON string of the RAM policy document. This parameter is returned only by the Get operation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
             */
            public Builder ramPolicyDocument(String ramPolicyDocument) {
                this.ramPolicyDocument = ramPolicyDocument;
                return this;
            }

            /**
             * <p>The type of the Resource Access Management (RAM) policy. Valid values: system and custom.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder ramPolicyType(String ramPolicyType) {
                this.ramPolicyType = ramPolicyType;
                return this;
            }

            public CloudAccountResourceMeta build() {
                return new CloudAccountResourceMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAccountResourcesForCloudPermissionTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountResourcesForCloudPermissionTemplateResponseBody</p>
     */
    public static class CloudAccountResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceEntityId")
        private String cloudAccountResourceEntityId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceEntityType")
        private String cloudAccountResourceEntityType;

        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceId")
        private String cloudAccountResourceId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceMeta")
        private CloudAccountResourceMeta cloudAccountResourceMeta;

        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceName")
        private String cloudAccountResourceName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CloudAccountResources(Builder builder) {
            this.cloudAccountId = builder.cloudAccountId;
            this.cloudAccountResourceEntityId = builder.cloudAccountResourceEntityId;
            this.cloudAccountResourceEntityType = builder.cloudAccountResourceEntityType;
            this.cloudAccountResourceId = builder.cloudAccountResourceId;
            this.cloudAccountResourceMeta = builder.cloudAccountResourceMeta;
            this.cloudAccountResourceName = builder.cloudAccountResourceName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountResources create() {
            return builder().build();
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return cloudAccountResourceEntityId
         */
        public String getCloudAccountResourceEntityId() {
            return this.cloudAccountResourceEntityId;
        }

        /**
         * @return cloudAccountResourceEntityType
         */
        public String getCloudAccountResourceEntityType() {
            return this.cloudAccountResourceEntityType;
        }

        /**
         * @return cloudAccountResourceId
         */
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

        /**
         * @return cloudAccountResourceMeta
         */
        public CloudAccountResourceMeta getCloudAccountResourceMeta() {
            return this.cloudAccountResourceMeta;
        }

        /**
         * @return cloudAccountResourceName
         */
        public String getCloudAccountResourceName() {
            return this.cloudAccountResourceName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cloudAccountId; 
            private String cloudAccountResourceEntityId; 
            private String cloudAccountResourceEntityType; 
            private String cloudAccountResourceId; 
            private CloudAccountResourceMeta cloudAccountResourceMeta; 
            private String cloudAccountResourceName; 
            private Long createTime; 
            private String description; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CloudAccountResources model) {
                this.cloudAccountId = model.cloudAccountId;
                this.cloudAccountResourceEntityId = model.cloudAccountResourceEntityId;
                this.cloudAccountResourceEntityType = model.cloudAccountResourceEntityType;
                this.cloudAccountResourceId = model.cloudAccountResourceId;
                this.cloudAccountResourceMeta = model.cloudAccountResourceMeta;
                this.cloudAccountResourceName = model.cloudAccountResourceName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012xxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>The unique remote identifier of the resource entity.</p>
             * 
             * <strong>example:</strong>
             * <p>System:AliyunIntelligentcockpitReadOnlyAccessexample</p>
             */
            public Builder cloudAccountResourceEntityId(String cloudAccountResourceEntityId) {
                this.cloudAccountResourceEntityId = cloudAccountResourceEntityId;
                return this;
            }

            /**
             * <p>The type of the resource entity. Valid values: ram_role.</p>
             * 
             * <strong>example:</strong>
             * <p>ram_role</p>
             */
            public Builder cloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
                this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
                return this;
            }

            /**
             * <p>The ID of the cloud account resource.</p>
             * 
             * <strong>example:</strong>
             * <p>car_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder cloudAccountResourceId(String cloudAccountResourceId) {
                this.cloudAccountResourceId = cloudAccountResourceId;
                return this;
            }

            /**
             * <p>The metadata of the resource.</p>
             */
            public Builder cloudAccountResourceMeta(CloudAccountResourceMeta cloudAccountResourceMeta) {
                this.cloudAccountResourceMeta = cloudAccountResourceMeta;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-sso-role</p>
             */
            public Builder cloudAccountResourceName(String cloudAccountResourceName) {
                this.cloudAccountResourceName = cloudAccountResourceName;
                return this;
            }

            /**
             * <p>The time when the resource was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud account resource used for SSO</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the resource was last updated. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649916625000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CloudAccountResources build() {
                return new CloudAccountResources(this);
            } 

        } 

    }
}
