// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAScriptsRequest} extends {@link RequestModel}
 *
 * <p>CreateAScriptsRequest</p>
 */
public class CreateAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScripts")
    private java.util.List < AScripts> aScripts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    private CreateAScriptsRequest(Builder builder) {
        super(builder);
        this.aScripts = builder.aScripts;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAScriptsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aScripts
     */
    public java.util.List < AScripts> getAScripts() {
        return this.aScripts;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<CreateAScriptsRequest, Builder> {
        private java.util.List < AScripts> aScripts; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAScriptsRequest request) {
            super(request);
            this.aScripts = request.aScripts;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
        } 

        /**
         * <p>The information about the AScript rules.</p>
         */
        public Builder aScripts(java.util.List < AScripts> aScripts) {
            this.putQueryParameter("AScripts", aScripts);
            this.aScripts = aScripts;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The listener ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-6hfq3zs0x04ibn****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public CreateAScriptsRequest build() {
            return new CreateAScriptsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAScriptsRequest} extends {@link TeaModel}
     *
     * <p>CreateAScriptsRequest</p>
     */
    public static class ExtAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeKey")
        private String attributeKey;

        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private String attributeValue;

        private ExtAttributes(Builder builder) {
            this.attributeKey = builder.attributeKey;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtAttributes create() {
            return builder().build();
        }

        /**
         * @return attributeKey
         */
        public String getAttributeKey() {
            return this.attributeKey;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeKey; 
            private String attributeValue; 

            /**
             * <p>The attribute name.</p>
             * <p>Set the value to <strong>EsDebug</strong>, which specifies that if requests carry the _es_dbg parameter and the value is the specified key, the debugging header is enabled to output the execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>EsDebug</p>
             */
            public Builder attributeKey(String attributeKey) {
                this.attributeKey = attributeKey;
                return this;
            }

            /**
             * <p>The attribute value, which must be 1 to 128 characters in length, and can contain letters or digits.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public ExtAttributes build() {
                return new ExtAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAScriptsRequest} extends {@link TeaModel}
     *
     * <p>CreateAScriptsRequest</p>
     */
    public static class AScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AScriptName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String aScriptName;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ExtAttributeEnabled")
        private Boolean extAttributeEnabled;

        @com.aliyun.core.annotation.NameInMap("ExtAttributes")
        private java.util.List < ExtAttributes> extAttributes;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scriptContent;

        private AScripts(Builder builder) {
            this.aScriptName = builder.aScriptName;
            this.enabled = builder.enabled;
            this.extAttributeEnabled = builder.extAttributeEnabled;
            this.extAttributes = builder.extAttributes;
            this.scriptContent = builder.scriptContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AScripts create() {
            return builder().build();
        }

        /**
         * @return aScriptName
         */
        public String getAScriptName() {
            return this.aScriptName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return extAttributeEnabled
         */
        public Boolean getExtAttributeEnabled() {
            return this.extAttributeEnabled;
        }

        /**
         * @return extAttributes
         */
        public java.util.List < ExtAttributes> getExtAttributes() {
            return this.extAttributes;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        public static final class Builder {
            private String aScriptName; 
            private Boolean enabled; 
            private Boolean extAttributeEnabled; 
            private java.util.List < ExtAttributes> extAttributes; 
            private String scriptContent; 

            /**
             * <p>The name of the AScript rule.</p>
             * <p>The name must be 2 to 128 character in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder aScriptName(String aScriptName) {
                this.aScriptName = aScriptName;
                return this;
            }

            /**
             * <p>Specifies whether to enable the AScript rule. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the extended attributes of the AScript rule. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder extAttributeEnabled(Boolean extAttributeEnabled) {
                this.extAttributeEnabled = extAttributeEnabled;
                return this;
            }

            /**
             * <p>The extended attributes.</p>
             */
            public Builder extAttributes(java.util.List < ExtAttributes> extAttributes) {
                this.extAttributes = extAttributes;
                return this;
            }

            /**
             * <p>The content of the AScript rule.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>if and(match_re($uri, &quot;^/1.txt$&quot;), $arg_type) {   rewrite(concat(&quot;/1.&quot;, $arg_type), &quot;break&quot;) }</p>
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            public AScripts build() {
                return new AScripts(this);
            } 

        } 

    }
}
