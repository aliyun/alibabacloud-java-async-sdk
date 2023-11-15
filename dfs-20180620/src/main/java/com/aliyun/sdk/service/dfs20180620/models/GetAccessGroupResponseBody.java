// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessGroupResponseBody</p>
 */
public class GetAccessGroupResponseBody extends TeaModel {
    @NameInMap("AccessGroup")
    private AccessGroup accessGroup;

    @NameInMap("RequestId")
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

        /**
         * AccessGroup.
         */
        public Builder accessGroup(AccessGroup accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessGroupResponseBody build() {
            return new GetAccessGroupResponseBody(this);
        } 

    } 

    public static class AccessGroup extends TeaModel {
        @NameInMap("AccessGroupId")
        private String accessGroupId;

        @NameInMap("AccessGroupName")
        private String accessGroupName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("MountPointCount")
        private Integer mountPointCount;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RuleCount")
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

            /**
             * AccessGroupId.
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
                return this;
            }

            /**
             * AccessGroupName.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * MountPointCount.
             */
            public Builder mountPointCount(Integer mountPointCount) {
                this.mountPointCount = mountPointCount;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * RuleCount.
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
