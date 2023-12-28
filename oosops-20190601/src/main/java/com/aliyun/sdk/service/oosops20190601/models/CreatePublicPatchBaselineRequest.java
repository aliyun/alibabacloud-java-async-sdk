// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicPatchBaselineRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicPatchBaselineRequest</p>
 */
public class CreatePublicPatchBaselineRequest extends Request {
    @Query
    @NameInMap("ApprovalRules")
    @Validation(required = true)
    private String approvalRules;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OperationSystem")
    @Validation(required = true)
    private String operationSystem;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreatePublicPatchBaselineRequest(Builder builder) {
        super(builder);
        this.approvalRules = builder.approvalRules;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.operationSystem = builder.operationSystem;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicPatchBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalRules
     */
    public String getApprovalRules() {
        return this.approvalRules;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operationSystem
     */
    public String getOperationSystem() {
        return this.operationSystem;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePublicPatchBaselineRequest, Builder> {
        private String approvalRules; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String operationSystem; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicPatchBaselineRequest request) {
            super(request);
            this.approvalRules = request.approvalRules;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.operationSystem = request.operationSystem;
            this.regionId = request.regionId;
        } 

        /**
         * ApprovalRules.
         */
        public Builder approvalRules(String approvalRules) {
            this.putQueryParameter("ApprovalRules", approvalRules);
            this.approvalRules = approvalRules;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperationSystem.
         */
        public Builder operationSystem(String operationSystem) {
            this.putQueryParameter("OperationSystem", operationSystem);
            this.operationSystem = operationSystem;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreatePublicPatchBaselineRequest build() {
            return new CreatePublicPatchBaselineRequest(this);
        } 

    } 

}
