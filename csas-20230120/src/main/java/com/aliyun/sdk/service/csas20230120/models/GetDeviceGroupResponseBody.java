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
 * {@link GetDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceGroupResponseBody</p>
 */
public class GetDeviceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceGroup")
    private DeviceGroup deviceGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceGroupResponseBody(Builder builder) {
        this.deviceGroup = builder.deviceGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroup
     */
    public DeviceGroup getDeviceGroup() {
        return this.deviceGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceGroup deviceGroup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeviceGroupResponseBody model) {
            this.deviceGroup = model.deviceGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The device label details.</p>
         */
        public Builder deviceGroup(DeviceGroup deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceGroupResponseBody build() {
            return new GetDeviceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceGroupResponseBody</p>
     */
    public static class DeviceGroup extends TeaModel {
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

        private DeviceGroup(Builder builder) {
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

        public static DeviceGroup create() {
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

            private Builder(DeviceGroup model) {
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
             * <p>The device label description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test device group description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The device label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>device-group-5191cf830a5e****</p>
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * <p>The dynamic device group rule operator.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder dynamicOperator(String dynamicOperator) {
                this.dynamicOperator = dynamicOperator;
                return this;
            }

            /**
             * <p>The matching rule of the dynamic device label.</p>
             */
            public Builder dynamicRule(Rule dynamicRule) {
                this.dynamicRule = dynamicRule;
                return this;
            }

            /**
             * <p>The device label type. Valid values:</p>
             * <ul>
             * <li><strong>static</strong>: Static device label. Members consist of manually added terminal devices.</li>
             * <li><strong>dynamic</strong>: Dynamic device label.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>Indicates whether the device label is a system built-in device label. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: System built-in device label.</li>
             * <li><strong>false</strong>: User-defined device label.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The collection of terminal device IDs associated with the device label.</p>
             */
            public Builder matchDevTags(java.util.List<String> matchDevTags) {
                this.matchDevTags = matchDevTags;
                return this;
            }

            /**
             * <p>The device label name.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest_a1b2bfd0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeviceGroup build() {
                return new DeviceGroup(this);
            } 

        } 

    }
}
