// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutHybridMonitorMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>PutHybridMonitorMetricDataResponseBody</p>
 */
public class PutHybridMonitorMetricDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorDetail")
    private java.util.List < ErrorDetail> errorDetail;

    @NameInMap("RequestId")
    private String requestId;

    private PutHybridMonitorMetricDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorDetail = builder.errorDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutHybridMonitorMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorDetail
     */
    public java.util.List < ErrorDetail> getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < ErrorDetail> errorDetail; 
        private String requestId; 

        /**
         * The details of the invalid parameters.
         * <p>
         * 
         * If the request parameters that you set are invalid, the details of the invalid parameters are displayed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder errorDetail(java.util.List < ErrorDetail> errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutHybridMonitorMetricDataResponseBody build() {
            return new PutHybridMonitorMetricDataResponseBody(this);
        } 

    } 

    public static class ErrorDetail extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Index")
        private Long index;

        private ErrorDetail(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private String errorMessage; 
            private Long index; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
