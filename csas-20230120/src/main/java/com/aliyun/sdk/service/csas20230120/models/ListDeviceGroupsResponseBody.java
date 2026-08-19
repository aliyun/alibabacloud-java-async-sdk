// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDeviceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceGroupsResponseBody</p>
 */
public class ListDeviceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceGroups")
    private java.util.List<DeviceGroups> deviceGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListDeviceGroupsResponseBody(Builder builder) {
        this.deviceGroups = builder.deviceGroups;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroups
     */
    public java.util.List<DeviceGroups> getDeviceGroups() {
        return this.deviceGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<DeviceGroups> deviceGroups; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListDeviceGroupsResponseBody model) {
            this.deviceGroups = model.deviceGroups;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * DeviceGroups.
         */
        public Builder deviceGroups(java.util.List<DeviceGroups> deviceGroups) {
            this.deviceGroups = deviceGroups;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FD724DBC-CD76-5235-BF76-59C51B73296D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDeviceGroupsResponseBody build() {
            return new ListDeviceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceGroupsResponseBody</p>
     */
    public static class DeviceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @com.aliyun.core.annotation.NameInMap("DynamicOperator")
        @Deprecated
        private String dynamicOperator;

        @com.aliyun.core.annotation.NameInMap("DynamicRule")
        private Rule dynamicRule;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("MatchDevTags")
        private java.util.List<String> matchDevTags;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DeviceGroups(Builder builder) {
            this.description = builder.description;
            this.deviceGroupId = builder.deviceGroupId;
            this.dynamicOperator = builder.dynamicOperator;
            this.dynamicRule = builder.dynamicRule;
            this.groupType = builder.groupType;
            this.isDefault = builder.isDefault;
            this.matchDevTags = builder.matchDevTags;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return dynamicOperator
         */
        public String getDynamicOperator() {
            return this.dynamicOperator;
        }

        /**
         * @return dynamicRule
         */
        public Rule getDynamicRule() {
            return this.dynamicRule;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return matchDevTags
         */
        public java.util.List<String> getMatchDevTags() {
            return this.matchDevTags;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String deviceGroupId; 
            private String dynamicOperator; 
            private Rule dynamicRule; 
            private String groupType; 
            private String isDefault; 
            private java.util.List<String> matchDevTags; 
            private String name; 

            private Builder() {
            } 

            private Builder(DeviceGroups model) {
                this.description = model.description;
                this.deviceGroupId = model.deviceGroupId;
                this.dynamicOperator = model.dynamicOperator;
                this.dynamicRule = model.dynamicRule;
                this.groupType = model.groupType;
                this.isDefault = model.isDefault;
                this.matchDevTags = model.matchDevTags;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceGroupId.
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * DynamicOperator.
             */
            public Builder dynamicOperator(String dynamicOperator) {
                this.dynamicOperator = dynamicOperator;
                return this;
            }

            /**
             * DynamicRule.
             */
            public Builder dynamicRule(Rule dynamicRule) {
                this.dynamicRule = dynamicRule;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * MatchDevTags.
             */
            public Builder matchDevTags(java.util.List<String> matchDevTags) {
                this.matchDevTags = matchDevTags;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeviceGroups build() {
                return new DeviceGroups(this);
            } 

        } 

    }
}
