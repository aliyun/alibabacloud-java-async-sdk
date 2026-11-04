// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link GetAccessGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessGroupResponseBody</p>
 */
public class GetAccessGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessGroup")
    private AccessGroup accessGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessGroupResponseBody(Builder builder) {
        this.accessGroup = builder.accessGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroup
     */
    public AccessGroup getAccessGroup() {
        return this.accessGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessGroup accessGroup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccessGroupResponseBody model) {
            this.accessGroup = model.accessGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The access group information.</p>
         */
        public Builder accessGroup(AccessGroup accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessGroupResponseBody build() {
            return new GetAccessGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessGroupResponseBody</p>
     */
    public static class AccessGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupId")
        private String accessGroupId;

        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MountPointCount")
        private Integer mountPointCount;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        private AccessGroup(Builder builder) {
            this.accessGroupId = builder.accessGroupId;
            this.accessGroupName = builder.accessGroupName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.isDefault = builder.isDefault;
            this.mountPointCount = builder.mountPointCount;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessGroup create() {
            return builder().build();
        }

        /**
         * @return accessGroupId
         */
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        /**
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return mountPointCount
         */
        public Integer getMountPointCount() {
            return this.mountPointCount;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String accessGroupId; 
            private String accessGroupName; 
            private String createTime; 
            private String description; 
            private Boolean isDefault; 
            private Integer mountPointCount; 
            private String networkType; 
            private String regionId; 
            private Integer ruleCount; 

            private Builder() {
            } 

            private Builder(AccessGroup model) {
                this.accessGroupId = model.accessGroupId;
                this.accessGroupName = model.accessGroupName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.isDefault = model.isDefault;
                this.mountPointCount = model.mountPointCount;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.ruleCount = model.ruleCount;
            } 

            /**
             * <p>The access group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
                return this;
            }

            /**
             * <p>The name of the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cluster-policy</p>
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * <p>The time when the access group was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T08:02:09.986217Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T08:02:09.986217Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>Dedicated access group for test clusters</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the access group is the default access group. Valid values:</p>
             * <ul>
             * <li>true: The access group is the default access group. When the access group is the default access group, all IP addresses are allowed to access it, and you cannot delete the default access group or the permission rules in the access group.</li>
             * <li>false: The access group is not the default access group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The number of mount points associated with the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mountPointCount(Integer mountPointCount) {
                this.mountPointCount = mountPointCount;
                return this;
            }

            /**
             * <p>The network type of the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of permission rules in the access group.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public AccessGroup build() {
                return new AccessGroup(this);
            } 

        } 

    }
}
