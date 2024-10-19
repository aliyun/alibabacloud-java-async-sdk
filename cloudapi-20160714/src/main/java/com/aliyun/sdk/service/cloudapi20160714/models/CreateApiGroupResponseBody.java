// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiGroupResponseBody</p>
 */
public class CreateApiGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    @com.aliyun.core.annotation.NameInMap("TagStatus")
    private Boolean tagStatus;

    private CreateApiGroupResponseBody(Builder builder) {
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
        this.tagStatus = builder.tagStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return tagStatus
     */
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

    public static final class Builder {
        private String basePath; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String instanceId; 
        private String instanceType; 
        private String requestId; 
        private String subDomain; 
        private Boolean tagStatus; 

        /**
         * BasePath.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
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
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * TagStatus.
         */
        public Builder tagStatus(Boolean tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }

        public CreateApiGroupResponseBody build() {
            return new CreateApiGroupResponseBody(this);
        } 

    } 

}
