// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVerifySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVerifySchemeResponseBody</p>
 */
public class CreateVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GateVerifySchemeDTO")
    private GateVerifySchemeDTO gateVerifySchemeDTO;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GateVerifySchemeDTO.
         */
        public Builder gateVerifySchemeDTO(GateVerifySchemeDTO gateVerifySchemeDTO) {
            this.gateVerifySchemeDTO = gateVerifySchemeDTO;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
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

        public CreateVerifySchemeResponseBody build() {
            return new CreateVerifySchemeResponseBody(this);
        } 

    } 

    public static class GateVerifySchemeDTO extends TeaModel {
        @NameInMap("SchemeCode")
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
             * SchemeCode.
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
