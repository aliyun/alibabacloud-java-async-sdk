// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link BatchContentSyncDetectResponseBody} extends {@link TeaModel}
 *
 * <p>BatchContentSyncDetectResponseBody</p>
 */
public class BatchContentSyncDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchContentSyncDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchContentSyncDetectResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchContentSyncDetectResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public BatchContentSyncDetectResponseBody build() {
            return new BatchContentSyncDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>BatchContentSyncDetectResponseBody</p>
     */
    public static class DetectResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskInfo")
        private String riskInfo;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        private DetectResultList(Builder builder) {
            this.riskInfo = builder.riskInfo;
            this.riskResult = builder.riskResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectResultList create() {
            return builder().build();
        }

        /**
         * @return riskInfo
         */
        public String getRiskInfo() {
            return this.riskInfo;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public static final class Builder {
            private String riskInfo; 
            private Integer riskResult; 

            private Builder() {
            } 

            private Builder(DetectResultList model) {
                this.riskInfo = model.riskInfo;
                this.riskResult = model.riskResult;
            } 

            /**
             * RiskInfo.
             */
            public Builder riskInfo(String riskInfo) {
                this.riskInfo = riskInfo;
                return this;
            }

            /**
             * RiskResult.
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            public DetectResultList build() {
                return new DetectResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>BatchContentSyncDetectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectResultList")
        private java.util.List<DetectResultList> detectResultList;

        private Data(Builder builder) {
            this.detectResultList = builder.detectResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detectResultList
         */
        public java.util.List<DetectResultList> getDetectResultList() {
            return this.detectResultList;
        }

        public static final class Builder {
            private java.util.List<DetectResultList> detectResultList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detectResultList = model.detectResultList;
            } 

            /**
             * DetectResultList.
             */
            public Builder detectResultList(java.util.List<DetectResultList> detectResultList) {
                this.detectResultList = detectResultList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
