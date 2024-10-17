// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTraceAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTraceAppResponseBody</p>
 */
public class DeleteTraceAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteTraceAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTraceAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
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
        private Long code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response in JSON format, including the HTTP status code, error code, response message, and trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;code\&quot;:200,\&quot;data\&quot;:\&quot;{\\&quot;code\\&quot;:200,\\&quot;data\\&quot;:true,\\&quot;errorCode\\&quot;:\\&quot;The application is deleted\\&quot;,\\&quot;message\\&quot;:\\&quot;The application is deleted\\&quot;,\\&quot;success\\&quot;:true,\\&quot;traceId\\&quot;:\\&quot;0bc0594d15954826692915817e****\\&quot;}\&quot;,\&quot;errorCode\&quot;:\&quot;The application is deleted\&quot;,\&quot;message\&quot;:\&quot;The application is deleted\&quot;,\&quot;success\&quot;:true,\&quot;traceId\&quot;:\&quot;0ab2646915954826692568137d****\&quot;}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>46355DD8-FC56-40C5-BFC6-269DE4F9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <p>true: The request was successful.</p>
         * <p>false: The request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteTraceAppResponseBody build() {
            return new DeleteTraceAppResponseBody(this);
        } 

    } 

}
