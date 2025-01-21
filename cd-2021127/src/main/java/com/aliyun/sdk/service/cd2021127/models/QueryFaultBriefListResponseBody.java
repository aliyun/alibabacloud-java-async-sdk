// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryFaultBriefListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaultBriefListResponseBody</p>
 */
public class QueryFaultBriefListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFaultBriefListResponseBody(Builder builder) {
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

    public static QueryFaultBriefListResponseBody create() {
        return builder().build();
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List<Data> data) {
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

        public QueryFaultBriefListResponseBody build() {
            return new QueryFaultBriefListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaultBriefListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaultBriefListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultNum")
        private Integer faultNum;

        @com.aliyun.core.annotation.NameInMap("FaultType")
        private Integer faultType;

        @com.aliyun.core.annotation.NameInMap("RecoveryNum")
        private Integer recoveryNum;

        private Data(Builder builder) {
            this.faultNum = builder.faultNum;
            this.faultType = builder.faultType;
            this.recoveryNum = builder.recoveryNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return faultNum
         */
        public Integer getFaultNum() {
            return this.faultNum;
        }

        /**
         * @return faultType
         */
        public Integer getFaultType() {
            return this.faultType;
        }

        /**
         * @return recoveryNum
         */
        public Integer getRecoveryNum() {
            return this.recoveryNum;
        }

        public static final class Builder {
            private Integer faultNum; 
            private Integer faultType; 
            private Integer recoveryNum; 

            /**
             * FaultNum.
             */
            public Builder faultNum(Integer faultNum) {
                this.faultNum = faultNum;
                return this;
            }

            /**
             * FaultType.
             */
            public Builder faultType(Integer faultType) {
                this.faultType = faultType;
                return this;
            }

            /**
             * RecoveryNum.
             */
            public Builder recoveryNum(Integer recoveryNum) {
                this.recoveryNum = recoveryNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
