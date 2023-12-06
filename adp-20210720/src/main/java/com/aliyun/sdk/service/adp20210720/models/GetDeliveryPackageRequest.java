// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeliveryPackageRequest} extends {@link RequestModel}
 *
 * <p>GetDeliveryPackageRequest</p>
 */
public class GetDeliveryPackageRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    private GetDeliveryPackageRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliveryPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetDeliveryPackageRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetDeliveryPackageRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetDeliveryPackageRequest build() {
            return new GetDeliveryPackageRequest(this);
        } 

    } 

}
