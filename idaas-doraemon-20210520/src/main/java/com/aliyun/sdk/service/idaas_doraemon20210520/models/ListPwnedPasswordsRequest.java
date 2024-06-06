// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPwnedPasswordsRequest} extends {@link RequestModel}
 *
 * <p>ListPwnedPasswordsRequest</p>
 */
public class ListPwnedPasswordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixHexPasswordSha1Hash")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefixHexPasswordSha1Hash;

    private ListPwnedPasswordsRequest(Builder builder) {
        super(builder);
        this.prefixHexPasswordSha1Hash = builder.prefixHexPasswordSha1Hash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPwnedPasswordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prefixHexPasswordSha1Hash
     */
    public String getPrefixHexPasswordSha1Hash() {
        return this.prefixHexPasswordSha1Hash;
    }

    public static final class Builder extends Request.Builder<ListPwnedPasswordsRequest, Builder> {
        private String prefixHexPasswordSha1Hash; 

        private Builder() {
            super();
        } 

        private Builder(ListPwnedPasswordsRequest request) {
            super(request);
            this.prefixHexPasswordSha1Hash = request.prefixHexPasswordSha1Hash;
        } 

        /**
         * PrefixHexPasswordSha1Hash.
         */
        public Builder prefixHexPasswordSha1Hash(String prefixHexPasswordSha1Hash) {
            this.putQueryParameter("PrefixHexPasswordSha1Hash", prefixHexPasswordSha1Hash);
            this.prefixHexPasswordSha1Hash = prefixHexPasswordSha1Hash;
            return this;
        }

        @Override
        public ListPwnedPasswordsRequest build() {
            return new ListPwnedPasswordsRequest(this);
        } 

    } 

}
