// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkHttpsParameters} extends {@link TeaModel}
 *
 * <p>SinkHttpsParameters</p>
 */
public class SinkHttpsParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Body")
    private SinkHttpsParametersBody body;

    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("URL")
    private URL URL;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SinkHttpsParameters(Builder builder) {
        this.body = builder.body;
        this.method = builder.method;
        this.networkType = builder.networkType;
        this.securityGroupId = builder.securityGroupId;
        this.token = builder.token;
        this.URL = builder.URL;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkHttpsParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SinkHttpsParametersBody getBody() {
        return this.body;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return URL
     */
    public URL getURL() {
        return this.URL;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private SinkHttpsParametersBody body; 
        private String method; 
        private String networkType; 
        private String securityGroupId; 
        private String token; 
        private URL URL; 
        private String vSwitchIds; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(SinkHttpsParameters model) {
            this.body = model.body;
            this.method = model.method;
            this.networkType = model.networkType;
            this.securityGroupId = model.securityGroupId;
            this.token = model.token;
            this.URL = model.URL;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>HTTP Body</p>
         */
        public Builder body(SinkHttpsParametersBody body) {
            this.body = body;
            return this;
        }

        /**
         * <p>The HTTP method.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The network type, PrivateNetwork/PublicNetwork.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>HTTP Token</p>
         * 
         * <strong>example:</strong>
         * <p>token-****</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The HTTP/HTTPS address.</p>
         */
        public Builder URL(URL URL) {
            this.URL = URL;
            return this;
        }

        /**
         * <p>The vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>vpc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public SinkHttpsParameters build() {
            return new SinkHttpsParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkHttpsParameters} extends {@link TeaModel}
     *
     * <p>SinkHttpsParameters</p>
     */
    public static class SinkHttpsParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkHttpsParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkHttpsParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(SinkHttpsParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Form</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>Template</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;message&quot;:&quot;${message}&quot;}</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;message&quot;:&quot;$.data.message&quot;}</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkHttpsParametersBody build() {
                return new SinkHttpsParametersBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkHttpsParameters} extends {@link TeaModel}
     *
     * <p>SinkHttpsParameters</p>
     */
    public static class URL extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private URL(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static URL create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(URL model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * <p>Form</p>
             * 
             * <strong>example:</strong>
             * <p>CONSTANT</p>
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * <p>Template</p>
             * 
             * <strong>example:</strong>
             * <p>https://${host}/events</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/events">https://example.com/events</a></p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public URL build() {
                return new URL(this);
            } 

        } 

    }
}
