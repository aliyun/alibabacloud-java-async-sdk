// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOssConfigRequest} extends {@link RequestModel}
 *
 * <p>GetOssConfigRequest</p>
 */
public class GetOssConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private GetOssConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetOssConfigRequest, Builder> {
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetOssConfigRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetOssConfigRequest build() {
            return new GetOssConfigRequest(this);
        } 

    } 

}
