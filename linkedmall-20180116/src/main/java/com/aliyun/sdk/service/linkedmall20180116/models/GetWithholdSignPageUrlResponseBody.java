// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetWithholdSignPageUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetWithholdSignPageUrlResponseBody</p>
 */
public class GetWithholdSignPageUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WithholdSignResponse")
    private WithholdSignResponse withholdSignResponse;

    private GetWithholdSignPageUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.withholdSignResponse = builder.withholdSignResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWithholdSignPageUrlResponseBody create() {
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
     * @return withholdSignResponse
     */
    public WithholdSignResponse getWithholdSignResponse() {
        return this.withholdSignResponse;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private WithholdSignResponse withholdSignResponse; 

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
         * WithholdSignResponse.
         */
        public Builder withholdSignResponse(WithholdSignResponse withholdSignResponse) {
            this.withholdSignResponse = withholdSignResponse;
            return this;
        }

        public GetWithholdSignPageUrlResponseBody build() {
            return new GetWithholdSignPageUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWithholdSignPageUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetWithholdSignPageUrlResponseBody</p>
     */
    public static class WithholdSignResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutRequestNo")
        private String outRequestNo;

        @com.aliyun.core.annotation.NameInMap("PageUrl")
        private String pageUrl;

        private WithholdSignResponse(Builder builder) {
            this.outRequestNo = builder.outRequestNo;
            this.pageUrl = builder.pageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WithholdSignResponse create() {
            return builder().build();
        }

        /**
         * @return outRequestNo
         */
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        /**
         * @return pageUrl
         */
        public String getPageUrl() {
            return this.pageUrl;
        }

        public static final class Builder {
            private String outRequestNo; 
            private String pageUrl; 

            /**
             * OutRequestNo.
             */
            public Builder outRequestNo(String outRequestNo) {
                this.outRequestNo = outRequestNo;
                return this;
            }

            /**
             * PageUrl.
             */
            public Builder pageUrl(String pageUrl) {
                this.pageUrl = pageUrl;
                return this;
            }

            public WithholdSignResponse build() {
                return new WithholdSignResponse(this);
            } 

        } 

    }
}
