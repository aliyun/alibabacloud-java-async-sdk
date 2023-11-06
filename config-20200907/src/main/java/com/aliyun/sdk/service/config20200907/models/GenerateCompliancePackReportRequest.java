// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateCompliancePackReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateCompliancePackReportRequest</p>
 */
public class GenerateCompliancePackReportRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("CompliancePackId")
    @Validation(required = true)
    private String compliancePackId;

    private GenerateCompliancePackReportRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.compliancePackId = builder.compliancePackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCompliancePackReportRequest create() {
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
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public static final class Builder extends Request.Builder<GenerateCompliancePackReportRequest, Builder> {
        private String clientToken; 
        private String compliancePackId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCompliancePackReportRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.compliancePackId = request.compliancePackId;
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
         * The ID of the compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putBodyParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        @Override
        public GenerateCompliancePackReportRequest build() {
            return new GenerateCompliancePackReportRequest(this);
        } 

    } 

}
