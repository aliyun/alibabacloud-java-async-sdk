// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBaselineCheckWhiteRecordResponseBody} extends {@link TeaModel}
 *
 * <p>AddBaselineCheckWhiteRecordResponseBody</p>
 */
public class AddBaselineCheckWhiteRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddBaselineCheckWhiteRecordResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBaselineCheckWhiteRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddBaselineCheckWhiteRecordResponseBody build() {
            return new AddBaselineCheckWhiteRecordResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.checkId = builder.checkId;
            this.lang = builder.lang;
            this.reason = builder.reason;
            this.recordId = builder.recordId;
            this.source = builder.source;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Long checkId; 
            private String lang; 
            private String reason; 
            private Long recordId; 
            private String source; 
            private String target; 
            private String targetType; 

            /**
             * The ID of the check item.
             * <p>
             * 
             * >  You can call the [ListCheckItemWarningSummary](~~ListCheckItemWarningSummary~~) operation to query the IDs of check items.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The language of the content within the request and response. Default value: **zh**. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The reason why the check item is added to the whitelist.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The ID of the whitelist rule.
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * The data source. Valid values:
             * <p>
             * 
             * *   **default**: server
             * *   **agentless**: agentless detection
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The object that is added to the whitelist.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the assets on which the whitelist rule takes effect. Valid values:
             * <p>
             * 
             * *   **all_instance**: all servers
             * *   **instance**: specific servers
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
