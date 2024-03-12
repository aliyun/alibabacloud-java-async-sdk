// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectRouterRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectRouterRequest</p>
 */
public class CreateExpressConnectRouterRequest extends Request {
    @Body
    @NameInMap("AlibabaSideAsn")
    @Validation(required = true)
    private Long alibabaSideAsn;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateExpressConnectRouterRequest(Builder builder) {
        super(builder);
        this.alibabaSideAsn = builder.alibabaSideAsn;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectRouterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alibabaSideAsn
     */
    public Long getAlibabaSideAsn() {
        return this.alibabaSideAsn;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateExpressConnectRouterRequest, Builder> {
        private Long alibabaSideAsn; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String name; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressConnectRouterRequest request) {
            super(request);
            this.alibabaSideAsn = request.alibabaSideAsn;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * AlibabaSideAsn.
         */
        public Builder alibabaSideAsn(Long alibabaSideAsn) {
            this.putBodyParameter("AlibabaSideAsn", alibabaSideAsn);
            this.alibabaSideAsn = alibabaSideAsn;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateExpressConnectRouterRequest build() {
            return new CreateExpressConnectRouterRequest(this);
        } 

    } 

}
