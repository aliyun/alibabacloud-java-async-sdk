// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersByProdResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersByProdResponseBody</p>
 */
public class ListUsersByProdResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListUsersByProdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersByProdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUsersByProdResponseBody build() {
            return new ListUsersByProdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("Imported")
        private Boolean imported;

        @NameInMap("LogMdsCode")
        private String logMdsCode;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("SourceLogCode")
        private String sourceLogCode;

        @NameInMap("SourceLogName")
        private String sourceLogName;

        @NameInMap("SourceProdCode")
        private String sourceProdCode;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.cloudCode = builder.cloudCode;
            this.imported = builder.imported;
            this.logMdsCode = builder.logMdsCode;
            this.mainUserId = builder.mainUserId;
            this.sourceLogCode = builder.sourceLogCode;
            this.sourceLogName = builder.sourceLogName;
            this.sourceProdCode = builder.sourceProdCode;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        /**
         * @return logMdsCode
         */
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return sourceLogCode
         */
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        /**
         * @return sourceLogName
         */
        public String getSourceLogName() {
            return this.sourceLogName;
        }

        /**
         * @return sourceProdCode
         */
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private String cloudCode; 
            private Boolean imported; 
            private String logMdsCode; 
            private Long mainUserId; 
            private String sourceLogCode; 
            private String sourceLogName; 
            private String sourceProdCode; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * LogMdsCode.
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * SourceLogCode.
             */
            public Builder sourceLogCode(String sourceLogCode) {
                this.sourceLogCode = sourceLogCode;
                return this;
            }

            /**
             * SourceLogName.
             */
            public Builder sourceLogName(String sourceLogName) {
                this.sourceLogName = sourceLogName;
                return this;
            }

            /**
             * SourceProdCode.
             */
            public Builder sourceProdCode(String sourceProdCode) {
                this.sourceProdCode = sourceProdCode;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
