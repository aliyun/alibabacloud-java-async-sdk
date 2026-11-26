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
 * {@link DeleteAScriptsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAScriptsRequest</p>
 */
public class DeleteAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> aScriptIds;

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
    public java.util.List<String> getAScriptIds() {
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
        private java.util.List<String> aScriptIds; 
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
         * <p>The IDs of the programmable scripts.</p>
         * <p>This parameter is required.</p>
         */
        public Builder aScriptIds(java.util.List<String> aScriptIds) {
            this.putQueryParameter("AScriptIds", aScriptIds);
            this.aScriptIds = aScriptIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client and ensure that the value is unique among different requests. The client token can contain only ASCII characters. If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>f516e84e-fc0c-4c2d-a461-6cd77******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not delete the programmable scripts. The system checks whether required parameters are specified, the request format, and service limits. If the check fails, the system returns an error. If the check succeeds, the system returns the <code>DryRunOperation</code> error code.</li>
         * <li><strong>false</strong> (default): performs a regular request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</li>
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
