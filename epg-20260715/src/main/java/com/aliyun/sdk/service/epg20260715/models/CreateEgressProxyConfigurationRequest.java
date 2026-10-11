// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateEgressProxyConfigurationRequest</p>
 */
public class CreateEgressProxyConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultRulePhaseActions")
    private DefaultRulePhaseActions defaultRulePhaseActions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyConfigurationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateEgressProxyConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.defaultRulePhaseActions = builder.defaultRulePhaseActions;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyConfigurationName = builder.egressProxyConfigurationName;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return defaultRulePhaseActions
     */
    public DefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyConfigurationName
     */
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateEgressProxyConfigurationRequest, Builder> {
        private String clientToken; 
        private DefaultRulePhaseActions defaultRulePhaseActions; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyConfigurationName; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateEgressProxyConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.defaultRulePhaseActions = request.defaultRulePhaseActions;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyConfigurationName = request.egressProxyConfigurationName;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The default actions to be performed in each effective phase (PreDns, PreRequest, and PostResponse) when traffic does not match any rules.</p>
         */
        public Builder defaultRulePhaseActions(DefaultRulePhaseActions defaultRulePhaseActions) {
            this.putBodyParameter("DefaultRulePhaseActions", defaultRulePhaseActions);
            this.defaultRulePhaseActions = defaultRulePhaseActions;
            return this;
        }

        /**
         * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run and does not create the egress proxy configuration. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, the corresponding error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder egressProxyConfigurationName(String egressProxyConfigurationName) {
            this.putBodyParameter("EgressProxyConfigurationName", egressProxyConfigurationName);
            this.egressProxyConfigurationName = egressProxyConfigurationName;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4jcyx5e****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateEgressProxyConfigurationRequest build() {
            return new CreateEgressProxyConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEgressProxyConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyConfigurationRequest</p>
     */
    public static class DefaultRulePhaseActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostResponse")
        private String postResponse;

        @com.aliyun.core.annotation.NameInMap("PreDns")
        private String preDns;

        @com.aliyun.core.annotation.NameInMap("PreRequest")
        private String preRequest;

        private DefaultRulePhaseActions(Builder builder) {
            this.postResponse = builder.postResponse;
            this.preDns = builder.preDns;
            this.preRequest = builder.preRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRulePhaseActions create() {
            return builder().build();
        }

        /**
         * @return postResponse
         */
        public String getPostResponse() {
            return this.postResponse;
        }

        /**
         * @return preDns
         */
        public String getPreDns() {
            return this.preDns;
        }

        /**
         * @return preRequest
         */
        public String getPreRequest() {
            return this.preRequest;
        }

        public static final class Builder {
            private String postResponse; 
            private String preDns; 
            private String preRequest; 

            private Builder() {
            } 

            private Builder(DefaultRulePhaseActions model) {
                this.postResponse = model.postResponse;
                this.preDns = model.preDns;
                this.preRequest = model.preRequest;
            } 

            /**
             * <p>The default action to be performed in the PostResponse phase (after the response is returned) when traffic does not match any rules. This phase supports only the <strong>Allow</strong> value (default), which allows the traffic to pass through.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder postResponse(String postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * <p>The default action to be performed in the PreDns phase (before DNS resolution) when traffic does not match any rules. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong> (default): allows the traffic to pass through.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preDns(String preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * <p>The default action to be performed in the PreRequest phase (before the request is forwarded) when traffic does not match any rules. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong> (default): allows the traffic to pass through.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preRequest(String preRequest) {
                this.preRequest = preRequest;
                return this;
            }

            public DefaultRulePhaseActions build() {
                return new DefaultRulePhaseActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyConfigurationRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
