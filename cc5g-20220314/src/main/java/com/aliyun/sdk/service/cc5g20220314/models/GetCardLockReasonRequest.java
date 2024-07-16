// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLockReasonRequest} extends {@link RequestModel}
 *
 * <p>GetCardLockReasonRequest</p>
 */
public class GetCardLockReasonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iccid;

    private GetCardLockReasonRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardLockReasonRequest create() {
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

    public static final class Builder extends Request.Builder<GetCardLockReasonRequest, Builder> {
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(GetCardLockReasonRequest request) {
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
        public GetCardLockReasonRequest build() {
            return new GetCardLockReasonRequest(this);
        } 

    } 

}
