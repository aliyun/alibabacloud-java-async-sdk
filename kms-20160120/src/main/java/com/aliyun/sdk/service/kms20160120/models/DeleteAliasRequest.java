// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAliasRequest} extends {@link RequestModel}
 *
 * <p>DeleteAliasRequest</p>
 */
public class DeleteAliasRequest extends Request {
    @Query
    @NameInMap("AliasName")
    @Validation(required = true)
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
         * AliasName.
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
