// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigHistoryResponseBody</p>
 */
public class DescribeConfigHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigHistoryItems")
    private java.util.List < ConfigHistoryItems> configHistoryItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The change records of the configuration parameters.</p>
         */
        public Builder configHistoryItems(java.util.List < ConfigHistoryItems> configHistoryItems) {
            this.configHistoryItems = configHistoryItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigHistoryResponseBody build() {
            return new DescribeConfigHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfigHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigHistoryResponseBody</p>
     */
    public static class ConfigHistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeId")
        private String changeId;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Time")
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
             * <p>The ID of the change record.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * <p>The user ID (UID) of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The reason for the setting modification of the configuration parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether the setting modification of the configuration parameters took effect. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The time when the values of the configuration parameters were changed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-22T10:00:00Z</p>
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
