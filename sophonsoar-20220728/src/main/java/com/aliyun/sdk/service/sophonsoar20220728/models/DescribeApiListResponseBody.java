// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the service.</p>
         */
        public Builder apiList(java.util.List < ApiList> apiList) {
            this.apiList = apiList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A15D31E-B38B-5F7F-8DC0-1C74408875AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiListResponseBody build() {
            return new DescribeApiListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiListResponseBody</p>
     */
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
             * <p>The link to the API references of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx">https://xxxxx</a></p>
             */
            public Builder docUrl(String docUrl) {
                this.docUrl = docUrl;
                return this;
            }

            /**
             * <p>The POP code of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Sas</p>
             */
            public Builder popCode(String popCode) {
                this.popCode = popCode;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud Security Center</p>
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
