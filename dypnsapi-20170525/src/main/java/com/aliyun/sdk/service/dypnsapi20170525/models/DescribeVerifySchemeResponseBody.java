// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVerifySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifySchemeResponseBody</p>
 */
public class DescribeVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SchemeQueryResultDTO")
    private SchemeQueryResultDTO schemeQueryResultDTO;

    private DescribeVerifySchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemeQueryResultDTO = builder.schemeQueryResultDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifySchemeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return schemeQueryResultDTO
     */
    public SchemeQueryResultDTO getSchemeQueryResultDTO() {
        return this.schemeQueryResultDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SchemeQueryResultDTO schemeQueryResultDTO; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SchemeQueryResultDTO.
         */
        public Builder schemeQueryResultDTO(SchemeQueryResultDTO schemeQueryResultDTO) {
            this.schemeQueryResultDTO = schemeQueryResultDTO;
            return this;
        }

        public DescribeVerifySchemeResponseBody build() {
            return new DescribeVerifySchemeResponseBody(this);
        } 

    } 

    public static class SchemeQueryResultDTO extends TeaModel {
        @NameInMap("AppEncryptInfo")
        private String appEncryptInfo;

        private SchemeQueryResultDTO(Builder builder) {
            this.appEncryptInfo = builder.appEncryptInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeQueryResultDTO create() {
            return builder().build();
        }

        /**
         * @return appEncryptInfo
         */
        public String getAppEncryptInfo() {
            return this.appEncryptInfo;
        }

        public static final class Builder {
            private String appEncryptInfo; 

            /**
             * AppEncryptInfo.
             */
            public Builder appEncryptInfo(String appEncryptInfo) {
                this.appEncryptInfo = appEncryptInfo;
                return this;
            }

            public SchemeQueryResultDTO build() {
                return new SchemeQueryResultDTO(this);
            } 

        } 

    }
}
