// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteFilterConfigsRequest} extends {@link RequestModel}
 *
 * <p>DeleteFilterConfigsRequest</p>
 */
public class DeleteFilterConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuId")
    private String uuId;

    private DeleteFilterConfigsRequest(Builder builder) {
        super(builder);
        this.uuId = builder.uuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFilterConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuId
     */
    public String getUuId() {
        return this.uuId;
    }

    public static final class Builder extends Request.Builder<DeleteFilterConfigsRequest, Builder> {
        private String uuId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFilterConfigsRequest request) {
            super(request);
            this.uuId = request.uuId;
        } 

        /**
         * UuId.
         */
        public Builder uuId(String uuId) {
            this.putQueryParameter("UuId", uuId);
            this.uuId = uuId;
            return this;
        }

        @Override
        public DeleteFilterConfigsRequest build() {
            return new DeleteFilterConfigsRequest(this);
        } 

    } 

}
