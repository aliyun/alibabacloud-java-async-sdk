// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetGroupResponseBody</p>
 */
public class GetGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupExternalId")
    private String groupExternalId;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("groupSourceId")
    private String groupSourceId;

    @com.aliyun.core.annotation.NameInMap("groupSourceType")
    private String groupSourceType;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private GetGroupResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.groupExternalId = builder.groupExternalId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.groupSourceId = builder.groupSourceId;
        this.groupSourceType = builder.groupSourceType;
        this.instanceId = builder.instanceId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return groupExternalId
     */
    public String getGroupExternalId() {
        return this.groupExternalId;
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
     * @return groupSourceId
     */
    public String getGroupSourceId() {
        return this.groupSourceId;
    }

    /**
     * @return groupSourceType
     */
    public String getGroupSourceType() {
        return this.groupSourceType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String groupExternalId; 
        private String groupId; 
        private String groupName; 
        private String groupSourceId; 
        private String groupSourceType; 
        private String instanceId; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(GetGroupResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.groupExternalId = model.groupExternalId;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.groupSourceId = model.groupSourceId;
            this.groupSourceType = model.groupSourceType;
            this.instanceId = model.instanceId;
            this.updateTime = model.updateTime;
        } 

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * groupExternalId.
         */
        public Builder groupExternalId(String groupExternalId) {
            this.groupExternalId = groupExternalId;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * groupSourceId.
         */
        public Builder groupSourceId(String groupSourceId) {
            this.groupSourceId = groupSourceId;
            return this;
        }

        /**
         * groupSourceType.
         */
        public Builder groupSourceType(String groupSourceType) {
            this.groupSourceType = groupSourceType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetGroupResponseBody build() {
            return new GetGroupResponseBody(this);
        } 

    } 

}
