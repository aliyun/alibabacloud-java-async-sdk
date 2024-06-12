// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the compliance package. Separate multiple compliance package IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).
         */
        public Builder compliancePackIds(String compliancePackIds) {
            this.putBodyParameter("CompliancePackIds", compliancePackIds);
            this.compliancePackIds = compliancePackIds;
            return this;
        }

        /**
         * Specifies whether to delete the rules in the compliance package. Valid values:
         * <p>
         * 
         * *   true: The rules are deleted.
         * *   false (default): The rules are not deleted.
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
