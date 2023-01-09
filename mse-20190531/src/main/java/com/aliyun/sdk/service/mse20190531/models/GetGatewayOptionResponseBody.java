// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayOptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayOptionResponseBody</p>
 */
public class GetGatewayOptionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private GatewayOption data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetGatewayOptionResponseBody(Builder builder) {
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

    public static GetGatewayOptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public GatewayOption getData() {
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
        private Integer code; 
        private GatewayOption data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The value 200 indicates that the request is successfully processed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed configurations of the gateway.
         * <p>
         * 
         * *   **TraceDetails**: the sampling description of Tracing Analysis. Content: TraceEnabled indicates whether Tracing Analysis is activated. Sample indicates the sampling rate of Tracing Analysis.
         * *   **LogConfigDetails**: the description of Log Service. Content: LogEnabled indicates whether Log Service is activated. ProjectName indicates the Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.
         * *   **EnableHardwareAcceleration**: indicates whether hardware acceleration is enabled.
         * *   **DisableHttp2Alpn**: indicates whether the HTTP/2 protocol is disabled.
         * *   **EnableWaf**: indicates whether Web Application Firewall (WAF) is enabled.
         */
        public Builder data(GatewayOption data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         * <p>
         * 
         * *   If the request is successful, a success message is returned.
         * *   If the request fails, an error message is returned, such as the "TaskId not found" message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayOptionResponseBody build() {
            return new GetGatewayOptionResponseBody(this);
        } 

    } 

}
