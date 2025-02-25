// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link ModifyExpressConnectRouterRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectRouterRequest</p>
 */
public class ModifyExpressConnectRouterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ModifyExpressConnectRouterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectRouterRequest create() {
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
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectRouterRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String ecrId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectRouterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.name = request.name;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
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
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-fu8rszhgv7623c****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The name of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyExpressConnectRouterRequest build() {
            return new ModifyExpressConnectRouterRequest(this);
        } 

    } 

}
