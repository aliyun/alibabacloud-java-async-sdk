// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetUpgradeStatusResponseBody</p>
 */
public class GetUpgradeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUpgradeStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUpgradeStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUpgradeStatusResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D73E42D0-AA72-5880-B96F-548B43C84736</p>
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

        public GetUpgradeStatusResponseBody build() {
            return new GetUpgradeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUpgradeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetUpgradeStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private String details;

        @com.aliyun.core.annotation.NameInMap("FromVersion")
        private String fromVersion;

        @com.aliyun.core.annotation.NameInMap("PrepareFinishTime")
        private String prepareFinishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToVersion")
        private String toVersion;

        private Data(Builder builder) {
            this.details = builder.details;
            this.fromVersion = builder.fromVersion;
            this.prepareFinishTime = builder.prepareFinishTime;
            this.status = builder.status;
            this.toVersion = builder.toVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return fromVersion
         */
        public String getFromVersion() {
            return this.fromVersion;
        }

        /**
         * @return prepareFinishTime
         */
        public String getPrepareFinishTime() {
            return this.prepareFinishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toVersion
         */
        public String getToVersion() {
            return this.toVersion;
        }

        public static final class Builder {
            private String details; 
            private String fromVersion; 
            private String prepareFinishTime; 
            private String status; 
            private String toVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.details = model.details;
                this.fromVersion = model.fromVersion;
                this.prepareFinishTime = model.prepareFinishTime;
                this.status = model.status;
                this.toVersion = model.toVersion;
            } 

            /**
             * Details.
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * FromVersion.
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * PrepareFinishTime.
             */
            public Builder prepareFinishTime(String prepareFinishTime) {
                this.prepareFinishTime = prepareFinishTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ToVersion.
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
