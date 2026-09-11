// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListAvailableConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableConfigsResponseBody</p>
 */
public class ListAvailableConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAvailableConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.configs = builder.configs;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableConfigsResponseBody create() {
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
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
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
        private java.util.List<Configs> configs; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAvailableConfigsResponseBody model) {
            this.code = model.code;
            this.configs = model.configs;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of queried Logtail configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAvailableConfigsResponseBody build() {
            return new ListAvailableConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corpName")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("platformType")
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("ssoSettingsId")
        private String ssoSettingsId;

        @com.aliyun.core.annotation.NameInMap("ssoSettingsName")
        private String ssoSettingsName;

        private Configs(Builder builder) {
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.platformType = builder.platformType;
            this.ssoSettingsId = builder.ssoSettingsId;
            this.ssoSettingsName = builder.ssoSettingsName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return ssoSettingsId
         */
        public String getSsoSettingsId() {
            return this.ssoSettingsId;
        }

        /**
         * @return ssoSettingsName
         */
        public String getSsoSettingsName() {
            return this.ssoSettingsName;
        }

        public static final class Builder {
            private String corpId; 
            private String corpName; 
            private String platformType; 
            private String ssoSettingsId; 
            private String ssoSettingsName; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.platformType = model.platformType;
                this.ssoSettingsId = model.ssoSettingsId;
                this.ssoSettingsName = model.ssoSettingsName;
            } 

            /**
             * <p>The enterprise ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleCorpId</p>
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * <p>The organization name.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * <p>The platform type.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * <p>The SSO configuration ID. This parameter has a value only for SAML, OAuth2, and WeCom types. The value is null for the custom type.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSsoSettingsId</p>
             */
            public Builder ssoSettingsId(String ssoSettingsId) {
                this.ssoSettingsId = ssoSettingsId;
                return this;
            }

            /**
             * <p>The SSO configuration name. This parameter has a value only for SAML, OAuth2, and WeCom types. The value is null for the custom type.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder ssoSettingsName(String ssoSettingsName) {
                this.ssoSettingsName = ssoSettingsName;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
