// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigHistoryResponseBody</p>
 */
public class DescribeConfigHistoryResponseBody extends TeaModel {
    @NameInMap("ConfigHistoryItems")
    private java.util.List < ConfigHistoryItems> configHistoryItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeConfigHistoryResponseBody(Builder builder) {
        this.configHistoryItems = builder.configHistoryItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return configHistoryItems
     */
    public java.util.List < ConfigHistoryItems> getConfigHistoryItems() {
        return this.configHistoryItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConfigHistoryItems> configHistoryItems; 
        private String requestId; 

        /**
         * The change records of the configuration parameters.
         */
        public Builder configHistoryItems(java.util.List < ConfigHistoryItems> configHistoryItems) {
            this.configHistoryItems = configHistoryItems;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigHistoryResponseBody build() {
            return new DescribeConfigHistoryResponseBody(this);
        } 

    } 

    public static class ConfigHistoryItems extends TeaModel {
        @NameInMap("ChangeId")
        private String changeId;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("Time")
        private String time;

        private ConfigHistoryItems(Builder builder) {
            this.changeId = builder.changeId;
            this.ownerId = builder.ownerId;
            this.reason = builder.reason;
            this.success = builder.success;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigHistoryItems create() {
            return builder().build();
        }

        /**
         * @return changeId
         */
        public String getChangeId() {
            return this.changeId;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String changeId; 
            private String ownerId; 
            private String reason; 
            private Boolean success; 
            private String time; 

            /**
             * The ID of the change record.
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * The user ID (UID) of the Alibaba Cloud account.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The reason for the setting modification of the configuration parameters.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Indicates whether the setting modification of the configuration parameters took effect. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * The time when the values of the configuration parameters were changed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ConfigHistoryItems build() {
                return new ConfigHistoryItems(this);
            } 

        } 

    }
}
