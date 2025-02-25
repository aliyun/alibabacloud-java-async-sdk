// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonMaterialsRequest} extends {@link RequestModel}
 *
 * <p>ListCommonMaterialsRequest</p>
 */
public class ListCommonMaterialsRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("Type")
    private String type;

    private ListCommonMaterialsRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCommonMaterialsRequest, Builder> {
        private String jwtToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCommonMaterialsRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.type = request.type;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCommonMaterialsRequest build() {
            return new ListCommonMaterialsRequest(this);
        } 

    } 

}
