// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DeleteAliasRequest} extends {@link RequestModel}
 *
 * <p>DeleteAliasRequest</p>
 */
public class DeleteAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliasName;

    private DeleteAliasRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    public static final class Builder extends Request.Builder<DeleteAliasRequest, Builder> {
        private String aliasName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAliasRequest request) {
            super(request);
            this.aliasName = request.aliasName;
        } 

        /**
         * <p>The alias that you want to delete.</p>
         * <p>The value must be 1 to 255 characters in length and must include the alias/ prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/example</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        @Override
        public DeleteAliasRequest build() {
            return new DeleteAliasRequest(this);
        } 

    } 

}
