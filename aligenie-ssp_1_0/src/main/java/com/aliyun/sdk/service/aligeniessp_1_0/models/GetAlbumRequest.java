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
 * {@link GetAlbumRequest} extends {@link RequestModel}
 *
 * <p>GetAlbumRequest</p>
 */
public class GetAlbumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetAlbumRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlbumRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAlbumRequest, Builder> {
        private Long id; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAlbumRequest request) {
            super(request);
            this.id = request.id;
            this.type = request.type;
        } 

        /**
         * <p>Album ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12343</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Default Value: song</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>song</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAlbumRequest build() {
            return new GetAlbumRequest(this);
        } 

    } 

}
