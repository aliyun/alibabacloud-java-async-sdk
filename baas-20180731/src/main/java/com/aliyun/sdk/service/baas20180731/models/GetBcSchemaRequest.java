// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBcSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetBcSchemaRequest</p>
 */
public class GetBcSchemaRequest extends Request {
    @Body
    @NameInMap("Bizid")
    private String bizid;

    private GetBcSchemaRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBcSchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<GetBcSchemaRequest, Builder> {
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(GetBcSchemaRequest request) {
            super(request);
            this.bizid = request.bizid;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        @Override
        public GetBcSchemaRequest build() {
            return new GetBcSchemaRequest(this);
        } 

    } 

}
