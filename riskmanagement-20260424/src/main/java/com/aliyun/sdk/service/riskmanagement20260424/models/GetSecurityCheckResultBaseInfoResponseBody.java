// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetSecurityCheckResultBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityCheckResultBaseInfoResponseBody</p>
 */
public class GetSecurityCheckResultBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecurityCheckResultBaseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityCheckResultBaseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecurityCheckResultBaseInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecurityCheckResultBaseInfoResponseBody build() {
            return new GetSecurityCheckResultBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityCheckResultBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityCheckResultBaseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigCompleted")
        private String configCompleted;

        @com.aliyun.core.annotation.NameInMap("PendingSecurityAlertCount")
        private Integer pendingSecurityAlertCount;

        @com.aliyun.core.annotation.NameInMap("PendingVulnerabilityCount")
        private Integer pendingVulnerabilityCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private Data(Builder builder) {
            this.configCompleted = builder.configCompleted;
            this.pendingSecurityAlertCount = builder.pendingSecurityAlertCount;
            this.pendingVulnerabilityCount = builder.pendingVulnerabilityCount;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configCompleted
         */
        public String getConfigCompleted() {
            return this.configCompleted;
        }

        /**
         * @return pendingSecurityAlertCount
         */
        public Integer getPendingSecurityAlertCount() {
            return this.pendingSecurityAlertCount;
        }

        /**
         * @return pendingVulnerabilityCount
         */
        public Integer getPendingVulnerabilityCount() {
            return this.pendingVulnerabilityCount;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String configCompleted; 
            private Integer pendingSecurityAlertCount; 
            private Integer pendingVulnerabilityCount; 
            private String progress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configCompleted = model.configCompleted;
                this.pendingSecurityAlertCount = model.pendingSecurityAlertCount;
                this.pendingVulnerabilityCount = model.pendingVulnerabilityCount;
                this.progress = model.progress;
            } 

            /**
             * ConfigCompleted.
             */
            public Builder configCompleted(String configCompleted) {
                this.configCompleted = configCompleted;
                return this;
            }

            /**
             * PendingSecurityAlertCount.
             */
            public Builder pendingSecurityAlertCount(Integer pendingSecurityAlertCount) {
                this.pendingSecurityAlertCount = pendingSecurityAlertCount;
                return this;
            }

            /**
             * PendingVulnerabilityCount.
             */
            public Builder pendingVulnerabilityCount(Integer pendingVulnerabilityCount) {
                this.pendingVulnerabilityCount = pendingVulnerabilityCount;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
