// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListSaasInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListSaasInfoResponseBody</p>
 */
public class ListSaasInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private String saasToken; 

        private Builder() {
        } 

        private Builder(ListSaasInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.saasToken = model.saasToken;
        } 

        /**
         * <p>The list of SaaS integration entries.</p>
         */
        public Builder data(java.util.List<Data> data) {
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
         * <p>The SaaS integration token issued by Chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>06614fdb-c72f-436e-8003-dfe8a2854a15</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.enName = model.enName;
                this.name = model.name;
                this.serviceUrl = model.serviceUrl;
                this.url = model.url;
            } 

            /**
             * <p>The unique identifier of the SaaS atomic page. This identifier can be used to associate and query related information about the atomic page.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL_SERVICE</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The English name of the atomic page.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL SERVICE</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The Chinese name of the atomic page.</p>
             * 
             * <strong>example:</strong>
             * <p>全局服务</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The iframe-embedded SaaS page URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pre-alime4service.console.aliyun.com/?productCode=p_beebot_public&switchAgent=1204001&saasCode=Robot&saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&saasName=123#/robot">https://pre-alime4service.console.aliyun.com/?productCode=p_beebot_public&amp;switchAgent=1204001&amp;saasCode=Robot&amp;saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&amp;saasName=123#/robot</a></p>
             */
            public Builder serviceUrl(String serviceUrl) {
                this.serviceUrl = serviceUrl;
                return this;
            }

            /**
             * <p>The URL of the atomic page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alime.console.aliyun.com/?productCode=p_beebot_public&switchAgent=1204001&saasCode=Robot&saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&saasName=123#/robot">https://alime.console.aliyun.com/?productCode=p_beebot_public&amp;switchAgent=1204001&amp;saasCode=Robot&amp;saasToken=06614fdb-c72f-436e-8003-dfe8a2854a15&amp;saasName=123#/robot</a></p>
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
