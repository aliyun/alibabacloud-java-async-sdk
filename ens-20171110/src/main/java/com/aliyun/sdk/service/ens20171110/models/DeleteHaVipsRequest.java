// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteHaVipsRequest} extends {@link RequestModel}
 *
 * <p>DeleteHaVipsRequest</p>
 */
public class DeleteHaVipsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > haVipIds;

    private DeleteHaVipsRequest(Builder builder) {
        super(builder);
        this.haVipIds = builder.haVipIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHaVipsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipIds
     */
    public java.util.List < String > getHaVipIds() {
        return this.haVipIds;
    }

    public static final class Builder extends Request.Builder<DeleteHaVipsRequest, Builder> {
        private java.util.List < String > haVipIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHaVipsRequest request) {
            super(request);
            this.haVipIds = request.haVipIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder haVipIds(java.util.List < String > haVipIds) {
            String haVipIdsShrink = shrink(haVipIds, "HaVipIds", "json");
            this.putQueryParameter("HaVipIds", haVipIdsShrink);
            this.haVipIds = haVipIds;
            return this;
        }

        @Override
        public DeleteHaVipsRequest build() {
            return new DeleteHaVipsRequest(this);
        } 

    } 

}
