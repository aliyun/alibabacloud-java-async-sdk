// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmAvailableAlertGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmAvailableAlertGroupsResponseBody</p>
 */
public class ListCloudGtmAvailableAlertGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertGroups")
    private AlertGroups alertGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCloudGtmAvailableAlertGroupsResponseBody(Builder builder) {
        this.alertGroups = builder.alertGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmAvailableAlertGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertGroups
     */
    public AlertGroups getAlertGroups() {
        return this.alertGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertGroups alertGroups; 
        private String requestId; 

        /**
         * AlertGroups.
         */
        public Builder alertGroups(AlertGroups alertGroups) {
            this.alertGroups = alertGroups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCloudGtmAvailableAlertGroupsResponseBody build() {
            return new ListCloudGtmAvailableAlertGroupsResponseBody(this);
        } 

    } 

    public static class AlertGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private AlertGroup(Builder builder) {
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupName; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public AlertGroup build() {
                return new AlertGroup(this);
            } 

        } 

    }
    public static class AlertGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private java.util.List < AlertGroup> alertGroup;

        private AlertGroups(Builder builder) {
            this.alertGroup = builder.alertGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertGroups create() {
            return builder().build();
        }

        /**
         * @return alertGroup
         */
        public java.util.List < AlertGroup> getAlertGroup() {
            return this.alertGroup;
        }

        public static final class Builder {
            private java.util.List < AlertGroup> alertGroup; 

            /**
             * AlertGroup.
             */
            public Builder alertGroup(java.util.List < AlertGroup> alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            public AlertGroups build() {
                return new AlertGroups(this);
            } 

        } 

    }
}
