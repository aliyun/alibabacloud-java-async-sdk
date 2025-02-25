// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link InitializeVccRequest} extends {@link RequestModel}
 *
 * <p>InitializeVccRequest</p>
 */
public class InitializeVccRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private InitializeVccRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeVccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<InitializeVccRequest, Builder> {
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(InitializeVccRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxhucx5ewuwy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public InitializeVccRequest build() {
            return new InitializeVccRequest(this);
        } 

    } 

}
