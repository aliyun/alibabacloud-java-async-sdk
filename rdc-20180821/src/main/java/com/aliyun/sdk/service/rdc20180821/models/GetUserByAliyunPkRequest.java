// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserByAliyunPkRequest} extends {@link RequestModel}
 *
 * <p>GetUserByAliyunPkRequest</p>
 */
public class GetUserByAliyunPkRequest extends Request {
    @Query
    @NameInMap("Pk")
    @Validation(required = true)
    private String pk;

    private GetUserByAliyunPkRequest(Builder builder) {
        super(builder);
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserByAliyunPkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<GetUserByAliyunPkRequest, Builder> {
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(GetUserByAliyunPkRequest response) {
            super(response);
            this.pk = response.pk;
        } 

        /**
         * Pk.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public GetUserByAliyunPkRequest build() {
            return new GetUserByAliyunPkRequest(this);
        } 

    } 

}
