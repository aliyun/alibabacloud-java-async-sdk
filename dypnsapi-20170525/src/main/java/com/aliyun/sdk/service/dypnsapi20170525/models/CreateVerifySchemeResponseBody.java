// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVerifySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVerifySchemeResponseBody</p>
 */
public class CreateVerifySchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GateVerifySchemeDTO")
    private GateVerifySchemeDTO gateVerifySchemeDTO;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateVerifySchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateVerifySchemeDTO = builder.gateVerifySchemeDTO;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVerifySchemeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateVerifySchemeDTO
     */
    public GateVerifySchemeDTO getGateVerifySchemeDTO() {
        return this.gateVerifySchemeDTO;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
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
        private GateVerifySchemeDTO gateVerifySchemeDTO; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder gateVerifySchemeDTO(GateVerifySchemeDTO gateVerifySchemeDTO) {
            this.gateVerifySchemeDTO = gateVerifySchemeDTO;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1E75E69-3049-5FDB-A376-D745837CD2B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateVerifySchemeResponseBody build() {
            return new CreateVerifySchemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVerifySchemeResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVerifySchemeResponseBody</p>
     */
    public static class GateVerifySchemeDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchemeCode")
        private String schemeCode;

        private GateVerifySchemeDTO(Builder builder) {
            this.schemeCode = builder.schemeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GateVerifySchemeDTO create() {
            return builder().build();
        }

        /**
         * @return schemeCode
         */
        public String getSchemeCode() {
            return this.schemeCode;
        }

        public static final class Builder {
            private String schemeCode; 

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>FC10001287****</p>
             */
            public Builder schemeCode(String schemeCode) {
                this.schemeCode = schemeCode;
                return this;
            }

            public GateVerifySchemeDTO build() {
                return new GateVerifySchemeDTO(this);
            } 

        } 

    }
}
