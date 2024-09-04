// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreditInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCreditInfoRequest</p>
 */
public class GetCreditInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long uid;

    private GetCreditInfoRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreditInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetCreditInfoRequest, Builder> {
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetCreditInfoRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * Sub Account UID
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetCreditInfoRequest build() {
            return new GetCreditInfoRequest(this);
        } 

    } 

}
