// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetIdentityProviderServiceProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderServiceProviderResponseBody</p>
 */
public class GetIdentityProviderServiceProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetIdentityProviderServiceProviderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderServiceProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderServiceProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>失败时结合 HTTP 状态及 message 处理。</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>结果结构见本接口返回字段；异步写接口的返回表示受理，不保证后台任务已完成。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>本次请求的处理状态，不等同后台任务最终结果。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>请求受理或错误消息；异步任务结果需按对应查询接口核对。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>用于关联本次调用与排障，失败时请保留。</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>true 表示本次请求处理成功；异步写入仍需继续查询任务结果。</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdentityProviderServiceProviderResponseBody build() {
            return new GetIdentityProviderServiceProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderServiceProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderServiceProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acsUrl")
        private String acsUrl;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("metadataXml")
        private String metadataXml;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Data(Builder builder) {
            this.acsUrl = builder.acsUrl;
            this.entityId = builder.entityId;
            this.metadataXml = builder.metadataXml;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acsUrl
         */
        public String getAcsUrl() {
            return this.acsUrl;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return metadataXml
         */
        public String getMetadataXml() {
            return this.metadataXml;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String acsUrl; 
            private String entityId; 
            private String metadataXml; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acsUrl = model.acsUrl;
                this.entityId = model.entityId;
                this.metadataXml = model.metadataXml;
                this.protocol = model.protocol;
            } 

            /**
             * <p>我方 SAML 断言消费地址，配置到外部 IdP。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sp.example.com/saml/acs">https://sp.example.com/saml/acs</a></p>
             */
            public Builder acsUrl(String acsUrl) {
                this.acsUrl = acsUrl;
                return this;
            }

            /**
             * <p>我方 SP 的实体标识，配置到外部 IdP；不是外部 IdP Entity ID。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sp.example.com/entity">https://sp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>我方 SP Metadata XML，供外部 IdP 导入；不能作为 IdP XML 提交 SAML 配置。</p>
             * 
             * <strong>example:</strong>
             * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://sp.example.com/entity"><SPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><AssertionConsumerService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST" Location="https://sp.example.com/saml/acs" index="0"/></SPSSODescriptor></EntityDescriptor></p>
             */
            public Builder metadataXml(String metadataXml) {
                this.metadataXml = metadataXml;
                return this;
            }

            /**
             * <p>查询参数必填，仅支持精确值 SAML；响应返回 SAML。</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
