// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoundationVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFoundationVersionRequest</p>
 */
public class GetFoundationVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private GetFoundationVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoundationVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetFoundationVersionRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetFoundationVersionRequest request) {
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
        public GetFoundationVersionRequest build() {
            return new GetFoundationVersionRequest(this);
        } 

    } 

}
