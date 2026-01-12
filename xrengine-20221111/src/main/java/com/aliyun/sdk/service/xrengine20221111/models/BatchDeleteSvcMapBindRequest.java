// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link BatchDeleteSvcMapBindRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteSvcMapBindRequest</p>
 */
public class BatchDeleteSvcMapBindRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    private BatchDeleteSvcMapBindRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteSvcMapBindRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<BatchDeleteSvcMapBindRequest, Builder> {
        private java.util.List<Long> ids; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteSvcMapBindRequest request) {
            super(request);
            this.ids = request.ids;
            this.jwtToken = request.jwtToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public BatchDeleteSvcMapBindRequest build() {
            return new BatchDeleteSvcMapBindRequest(this);
        } 

    } 

}
