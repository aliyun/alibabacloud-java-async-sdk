// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListPredefinedModelsRequest} extends {@link RequestModel}
 *
 * <p>ListPredefinedModelsRequest</p>
 */
public class ListPredefinedModelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("providerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerType;

    private ListPredefinedModelsRequest(Builder builder) {
        super(builder);
        this.providerType = builder.providerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPredefinedModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    public static final class Builder extends Request.Builder<ListPredefinedModelsRequest, Builder> {
        private String providerType; 

        private Builder() {
            super();
        } 

        private Builder(ListPredefinedModelsRequest request) {
            super(request);
            this.providerType = request.providerType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder providerType(String providerType) {
            this.putPathParameter("providerType", providerType);
            this.providerType = providerType;
            return this;
        }

        @Override
        public ListPredefinedModelsRequest build() {
            return new ListPredefinedModelsRequest(this);
        } 

    } 

}
