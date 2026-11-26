// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetAlbumDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>GetAlbumDetailByIdRequest</p>
 */
public class GetAlbumDetailByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbumId")
    private String albumId;

    private GetAlbumDetailByIdRequest(Builder builder) {
        super(builder);
        this.albumId = builder.albumId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlbumDetailByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return albumId
     */
    public String getAlbumId() {
        return this.albumId;
    }

    public static final class Builder extends Request.Builder<GetAlbumDetailByIdRequest, Builder> {
        private String albumId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlbumDetailByIdRequest request) {
            super(request);
            this.albumId = request.albumId;
        } 

        /**
         * <p>Album ID</p>
         * 
         * <strong>example:</strong>
         * <p>51999575</p>
         */
        public Builder albumId(String albumId) {
            this.putQueryParameter("AlbumId", albumId);
            this.albumId = albumId;
            return this;
        }

        @Override
        public GetAlbumDetailByIdRequest build() {
            return new GetAlbumDetailByIdRequest(this);
        } 

    } 

}
