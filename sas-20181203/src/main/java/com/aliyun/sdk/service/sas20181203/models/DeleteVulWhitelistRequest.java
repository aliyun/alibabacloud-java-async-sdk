// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteVulWhitelistRequest</p>
 */
public class DeleteVulWhitelistRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Whitelist")
    private String whitelist;

    private DeleteVulWhitelistRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVulWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<DeleteVulWhitelistRequest, Builder> {
        private String id; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVulWhitelistRequest request) {
            super(request);
            this.id = request.id;
            this.whitelist = request.whitelist;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Whitelist.
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public DeleteVulWhitelistRequest build() {
            return new DeleteVulWhitelistRequest(this);
        } 

    } 

}
