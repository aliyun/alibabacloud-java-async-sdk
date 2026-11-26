// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link CreateAScriptsRequest} extends {@link RequestModel}
 *
 * <p>CreateAScriptsRequest</p>
 */
public class CreateAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScripts")
    private java.util.List<AScripts> aScripts;

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
    public java.util.List<AScripts> getAScripts() {
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
        private java.util.List<AScripts> aScripts; 
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
         * <p>The list of programmable script information.</p>
         */
        public Builder aScripts(java.util.List<AScripts> aScripts) {
            this.putQueryParameter("AScripts", aScripts);
            this.aScripts = aScripts;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>Generate a unique value from your client for each request. ClientToken supports only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sends a dry run request. No programmable script is created. The system checks whether the required parameters are specified, the request format is valid, and business limits are met. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
         * <li><strong>false</strong> (default): Sends a regular request. If the check passes, an HTTP 2xx status code is returned and the operation is performed.</li>
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

            private Builder() {
            } 

            private Builder(ExtAttributes model) {
                this.attributeKey = model.attributeKey;
                this.attributeValue = model.attributeValue;
            } 

            /**
             * <p>The attribute key of the AScript script.</p>
             * <p>Valid values: <strong>EsDebug</strong> only. When a request carries the _es_dbg parameter and its value matches the key configured here, the corresponding debug response headers are enabled to output rule execution records.</p>
             * 
             * <strong>example:</strong>
             * <p>EsDebug</p>
             */
            public Builder attributeKey(String attributeKey) {
                this.attributeKey = attributeKey;
                return this;
            }

            /**
             * <p>The attribute value. The value can contain uppercase and lowercase letters and digits, and must be 1 to 128 characters in length.</p>
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
        private java.util.List<ExtAttributes> extAttributes;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scriptContent;

        private AScripts(Builder builder) {
            this.aScriptName = builder.aScriptName;
            this.enabled = builder.enabled;
            this.extAttributeEnabled = builder.extAttributeEnabled;
            this.extAttributes = builder.extAttributes;
            this.position = builder.position;
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
        public java.util.List<ExtAttributes> getExtAttributes() {
            return this.extAttributes;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
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
            private java.util.List<ExtAttributes> extAttributes; 
            private String position; 
            private String scriptContent; 

            private Builder() {
            } 

            private Builder(AScripts model) {
                this.aScriptName = model.aScriptName;
                this.enabled = model.enabled;
                this.extAttributeEnabled = model.extAttributeEnabled;
                this.extAttributes = model.extAttributes;
                this.position = model.position;
                this.scriptContent = model.scriptContent;
            } 

            /**
             * <p>The name of the programmable script.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. It must start with a letter, Chinese character, or digit.</p>
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
             * <p>Specifies whether to enable the programmable script. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong> (default): Disabled.</p>
             * </li>
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
             * <p>Specifies whether to enable the extended attributes of the programmable script. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false (default): Disabled.</p>
             * </li>
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
            public Builder extAttributes(java.util.List<ExtAttributes> extAttributes) {
                this.extAttributes = extAttributes;
                return this;
            }

            /**
             * <p>The execution position of the programmable script. Valid values:</p>
             * <ul>
             * <li><p>RequestHead (default): before request-direction rules are executed.</p>
             * </li>
             * <li><p>RequestFoot: after request-direction rules are executed.</p>
             * </li>
             * <li><p>ResponseHead: before response-direction rules are executed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RequestFoot</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The content of the programmable script.</p>
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
