// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardRequest} extends {@link RequestModel}
 *
 * <p>GetCardRequest</p>
 */
public class GetCardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iccid;

    private GetCardRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    public static final class Builder extends Request.Builder<GetCardRequest, Builder> {
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(GetCardRequest request) {
            super(request);
            this.iccid = request.iccid;
        } 

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        @Override
        public GetCardRequest build() {
            return new GetCardRequest(this);
        } 

    } 

}
