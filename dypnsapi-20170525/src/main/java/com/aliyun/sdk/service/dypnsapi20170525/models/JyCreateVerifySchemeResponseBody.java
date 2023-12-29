// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JyCreateVerifySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>JyCreateVerifySchemeResponseBody</p>
 */
public class JyCreateVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GateVerifySchemeData")
    private GateVerifySchemeData gateVerifySchemeData;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private JyCreateVerifySchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateVerifySchemeData = builder.gateVerifySchemeData;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JyCreateVerifySchemeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateVerifySchemeData
     */
    public GateVerifySchemeData getGateVerifySchemeData() {
        return this.gateVerifySchemeData;
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

    public static final class Builder {
        private String code; 
        private GateVerifySchemeData gateVerifySchemeData; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GateVerifySchemeData.
         */
        public Builder gateVerifySchemeData(GateVerifySchemeData gateVerifySchemeData) {
            this.gateVerifySchemeData = gateVerifySchemeData;
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

        public JyCreateVerifySchemeResponseBody build() {
            return new JyCreateVerifySchemeResponseBody(this);
        } 

    } 

    public static class GateVerifySchemeData extends TeaModel {
        @NameInMap("SchemeCode")
        private String schemeCode;

        private GateVerifySchemeData(Builder builder) {
            this.schemeCode = builder.schemeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GateVerifySchemeData create() {
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

            public GateVerifySchemeData build() {
                return new GateVerifySchemeData(this);
            } 

        } 

    }
}
