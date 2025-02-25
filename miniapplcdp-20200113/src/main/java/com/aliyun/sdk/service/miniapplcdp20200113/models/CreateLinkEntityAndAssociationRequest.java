// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLinkEntityAndAssociationRequest} extends {@link RequestModel}
 *
 * <p>CreateLinkEntityAndAssociationRequest</p>
 */
public class CreateLinkEntityAndAssociationRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("ModelData")
    @Validation(required = true)
    private String modelData;

    @Query
    @NameInMap("Source")
    private String source;

    private CreateLinkEntityAndAssociationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.modelData = builder.modelData;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLinkEntityAndAssociationRequest create() {
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
     * @return modelData
     */
    public String getModelData() {
        return this.modelData;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateLinkEntityAndAssociationRequest, Builder> {
        private String clientToken; 
        private String modelData; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateLinkEntityAndAssociationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.modelData = request.modelData;
            this.source = request.source;
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
         * ModelData.
         */
        public Builder modelData(String modelData) {
            this.putQueryParameter("ModelData", modelData);
            this.modelData = modelData;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateLinkEntityAndAssociationRequest build() {
            return new CreateLinkEntityAndAssociationRequest(this);
        } 

    } 

}
