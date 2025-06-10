// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceIssue")
    private String instanceIssue;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceSpecification")
    private String instanceSpecification;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private GetInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.instanceIssue = builder.instanceIssue;
        this.instanceName = builder.instanceName;
        this.instanceSpecification = builder.instanceSpecification;
        this.instanceStatus = builder.instanceStatus;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
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
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIssue
     */
    public String getInstanceIssue() {
        return this.instanceIssue;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceSpecification
     */
    public String getInstanceSpecification() {
        return this.instanceSpecification;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String code; 
        private Long createTime; 
        private String instanceId; 
        private String instanceIssue; 
        private String instanceName; 
        private String instanceSpecification; 
        private String instanceStatus; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.instanceId = model.instanceId;
            this.instanceIssue = model.instanceIssue;
            this.instanceName = model.instanceName;
            this.instanceSpecification = model.instanceSpecification;
            this.instanceStatus = model.instanceStatus;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
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
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926439000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the Container Registry instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The issue occurs on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>The issue occurs on the instance. Valid values: OSS_TOO_MANY_BUCKETS: The number of Object Storage Service (OSS) buckets exceeds the upper limit. OSS_BUCKET_ALREADY_EXISTS: An OSS bucket that has the duplicate name already exists. OSS_SERVICE_ROLE_UNAUTHORIZED: The OSS service-linked role is not granted permissions. USER_NOT_REGISTERED_BY_REAL_NAME: The Alibaba Cloud account has not passed a real name verification.</p>
         */
        public Builder instanceIssue(String instanceIssue) {
            this.instanceIssue = instanceIssue;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai-instance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The edition of the instance. Valid values: Enterprise_Basic: Basic Edition instances Enterprise_Standard: Standard Edition instances Enterprise_Advanced: Advanced Edition instances</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise_Basic</p>
         */
        public Builder instanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><code>PENDING</code>: The instance is being initialized.</li>
         * <li><code>INIT_ERROR</code>: The instance failed to be initialized.</li>
         * <li><code>STARTING</code>: The instance is being started.</li>
         * <li><code>RUNNING</code>: The instance is running.</li>
         * <li><code>STOPPING</code>: The instance is being stopped.</li>
         * <li><code>STOPPED</code>: The instance is stopped.</li>
         * <li><code>DELETING</code>: The instance is being deleted.</li>
         * <li><code>DELETED</code>: The instance is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926560000</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF34B18-4228-470C-860C-D28597CF010E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv36i4isx****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags of the instance.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test_key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test_value</p>
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
