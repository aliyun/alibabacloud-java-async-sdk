// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiListResponseBody</p>
 */
public class DescribeApiListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiList")
    private java.util.List < ApiList> apiList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApiListResponseBody(Builder builder) {
        this.apiList = builder.apiList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiListResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiList
     */
    public java.util.List < ApiList> getApiList() {
        return this.apiList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ApiList> apiList; 
        private String requestId; 

        /**
         * The information about the service.
         */
        public Builder apiList(java.util.List < ApiList> apiList) {
            this.apiList = apiList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiListResponseBody build() {
            return new DescribeApiListResponseBody(this);
        } 

    } 

    public static class ApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocUrl")
        private String docUrl;

        @com.aliyun.core.annotation.NameInMap("PopCode")
        private String popCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private ApiList(Builder builder) {
            this.docUrl = builder.docUrl;
            this.popCode = builder.popCode;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiList create() {
            return builder().build();
        }

        /**
         * @return docUrl
         */
        public String getDocUrl() {
            return this.docUrl;
        }

        /**
         * @return popCode
         */
        public String getPopCode() {
            return this.popCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String docUrl; 
            private String popCode; 
            private String productName; 

            /**
             * The link to the API references of the Alibaba Cloud service.
             */
            public Builder docUrl(String docUrl) {
                this.docUrl = docUrl;
                return this;
            }

            /**
             * The POP code of the Alibaba Cloud service.
             */
            public Builder popCode(String popCode) {
                this.popCode = popCode;
                return this;
            }

            /**
             * The name of the Alibaba Cloud service.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ApiList build() {
                return new ApiList(this);
            } 

        } 

    }
}
