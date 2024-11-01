// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAScriptsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAScriptsRequest</p>
 */
public class DeleteAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > aScriptIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    private DeleteAScriptsRequest(Builder builder) {
        super(builder);
        this.aScriptIds = builder.aScriptIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAScriptsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aScriptIds
     */
    public java.util.List < String > getAScriptIds() {
        return this.aScriptIds;
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

    public static final class Builder extends Request.Builder<DeleteAScriptsRequest, Builder> {
        private java.util.List < String > aScriptIds; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAScriptsRequest request) {
            super(request);
            this.aScriptIds = request.aScriptIds;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The AScript rule IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder aScriptIds(java.util.List < String > aScriptIds) {
            this.putQueryParameter("AScriptIds", aScriptIds);
            this.aScriptIds = aScriptIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>f516e84e-fc0c-4c2d-a461-6cd774a84dbd</p>
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

        @Override
        public DeleteAScriptsRequest build() {
            return new DeleteAScriptsRequest(this);
        } 

    } 

}
