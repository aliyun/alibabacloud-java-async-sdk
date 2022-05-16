// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCampaignRequest} extends {@link RequestModel}
 *
 * <p>DeleteCampaignRequest</p>
 */
public class DeleteCampaignRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private DeleteCampaignRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCampaignRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCampaignRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCampaignRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * path
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteCampaignRequest build() {
            return new DeleteCampaignRequest(this);
        } 

    } 

}
