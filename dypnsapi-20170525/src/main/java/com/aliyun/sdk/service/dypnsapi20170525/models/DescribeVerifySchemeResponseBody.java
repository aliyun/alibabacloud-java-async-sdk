// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVerifySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifySchemeResponseBody</p>
 */
public class DescribeVerifySchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchemeQueryResultDTO")
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
         * <p>The response code. OK indicates that the request is successful. For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>0C5380A7-2032-5F7D-9614-1BF8B54D16CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder schemeQueryResultDTO(SchemeQueryResultDTO schemeQueryResultDTO) {
            this.schemeQueryResultDTO = schemeQueryResultDTO;
            return this;
        }

        public DescribeVerifySchemeResponseBody build() {
            return new DescribeVerifySchemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifySchemeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifySchemeResponseBody</p>
     */
    public static class SchemeQueryResultDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppEncryptInfo")
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
             * <p>The key generated when you create a service in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>ZDMARqPkyQzWVJjB/sB/+fCp5TA4lNsRnY7rEC+HfGsOIOk1Brj8UyXFW2RBYIWqLieCSo8ZypEaEj+h9rLd3FgpXAjGYDfmOperod6jPUUwFHhBObxK+HuKVoi2jOqN7aDOlyPyGcATyq3BDdlf922JmnFLT8Hvnu4qgzzCZk0LXWTb0XVPnm5/fHUGHEA2Q+aTrGkaWcHjmTDqQ7BtvrAIIcJJkCJu4i1aeU++/0EzGWap4mcb2VhKROBs****</p>
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
