// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseResponseBody</p>
 */
public class DescribeDiagnoseResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("DiagnoseResult")
    private java.util.Map < String, ? > diagnoseResult;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeDiagnoseResponseBody(Builder builder) {
        this.code = builder.code;
        this.diagnoseResult = builder.diagnoseResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return diagnoseResult
     */
    public java.util.Map < String, ? > getDiagnoseResult() {
        return this.diagnoseResult;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.Map < String, ? > diagnoseResult; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DiagnoseResult.
         */
        public Builder diagnoseResult(java.util.Map < String, ? > diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDiagnoseResponseBody build() {
            return new DescribeDiagnoseResponseBody(this);
        } 

    } 

}
