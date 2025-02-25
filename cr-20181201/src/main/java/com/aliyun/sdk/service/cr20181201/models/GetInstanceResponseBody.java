// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceIssue")
    private String instanceIssue;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceSpecification")
    private String instanceSpecification;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

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
    public java.util.List < Tags> getTags() {
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
        private java.util.List < Tags> tags; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * InstanceIssue.
         */
        public Builder instanceIssue(String instanceIssue) {
            this.instanceIssue = instanceIssue;
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
         * InstanceSpecification.
         */
        public Builder instanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
