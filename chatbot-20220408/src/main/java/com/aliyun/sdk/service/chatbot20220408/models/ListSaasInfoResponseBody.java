// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSaasInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListSaasInfoResponseBody</p>
 */
public class ListSaasInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaasToken")
    private String saasToken;

    private ListSaasInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.saasToken = builder.saasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaasInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saasToken
     */
    public String getSaasToken() {
        return this.saasToken;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private String saasToken; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A629A28F-F25E-5572-A679-FA46FB0151D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaasToken.
         */
        public Builder saasToken(String saasToken) {
            this.saasToken = saasToken;
            return this;
        }

        public ListSaasInfoResponseBody build() {
            return new ListSaasInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSaasInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSaasInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceUrl")
        private String serviceUrl;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.code = builder.code;
            this.enName = builder.enName;
            this.name = builder.name;
            this.serviceUrl = builder.serviceUrl;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceUrl
         */
        public String getServiceUrl() {
            return this.serviceUrl;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String code; 
            private String enName; 
            private String name; 
            private String serviceUrl; 
            private String url; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ServiceUrl.
             */
            public Builder serviceUrl(String serviceUrl) {
                this.serviceUrl = serviceUrl;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
