// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteCompliancePacksRequest} extends {@link RequestModel}
 *
 * <p>DeleteCompliancePacksRequest</p>
 */
public class DeleteCompliancePacksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteRule")
    private Boolean deleteRule;

    private DeleteCompliancePacksRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.compliancePackIds = builder.compliancePackIds;
        this.deleteRule = builder.deleteRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCompliancePacksRequest create() {
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
     * @return compliancePackIds
     */
    public String getCompliancePackIds() {
        return this.compliancePackIds;
    }

    /**
     * @return deleteRule
     */
    public Boolean getDeleteRule() {
        return this.deleteRule;
    }

    public static final class Builder extends Request.Builder<DeleteCompliancePacksRequest, Builder> {
        private String clientToken; 
        private String compliancePackIds; 
        private Boolean deleteRule; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCompliancePacksRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.compliancePackIds = request.compliancePackIds;
            this.deleteRule = request.deleteRule;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the compliance package. Separate multiple compliance package IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        public Builder compliancePackIds(String compliancePackIds) {
            this.putBodyParameter("CompliancePackIds", compliancePackIds);
            this.compliancePackIds = compliancePackIds;
            return this;
        }

        /**
         * <p>Specifies whether to delete the rules in the compliance package. Valid values:</p>
         * <ul>
         * <li>true: The rules are deleted.</li>
         * <li>false (default): The rules are not deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteRule(Boolean deleteRule) {
            this.putBodyParameter("DeleteRule", deleteRule);
            this.deleteRule = deleteRule;
            return this;
        }

        @Override
        public DeleteCompliancePacksRequest build() {
            return new DeleteCompliancePacksRequest(this);
        } 

    } 

}
