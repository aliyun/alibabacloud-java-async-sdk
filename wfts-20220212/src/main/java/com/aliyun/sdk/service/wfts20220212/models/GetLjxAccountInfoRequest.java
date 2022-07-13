// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wfts20220212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLjxAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLjxAccountInfoRequest</p>
 */
public class GetLjxAccountInfoRequest extends Request {
    @Query
    @NameInMap("LjxAccountInfoId")
    @Validation(required = true)
    private String ljxAccountInfoId;

    private GetLjxAccountInfoRequest(Builder builder) {
        super(builder);
        this.ljxAccountInfoId = builder.ljxAccountInfoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLjxAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ljxAccountInfoId
     */
    public String getLjxAccountInfoId() {
        return this.ljxAccountInfoId;
    }

    public static final class Builder extends Request.Builder<GetLjxAccountInfoRequest, Builder> {
        private String ljxAccountInfoId; 

        private Builder() {
            super();
        } 

        private Builder(GetLjxAccountInfoRequest request) {
            super(request);
            this.ljxAccountInfoId = request.ljxAccountInfoId;
        } 

        /**
         * 实例 ID。
         */
        public Builder ljxAccountInfoId(String ljxAccountInfoId) {
            this.putQueryParameter("LjxAccountInfoId", ljxAccountInfoId);
            this.ljxAccountInfoId = ljxAccountInfoId;
            return this;
        }

        @Override
        public GetLjxAccountInfoRequest build() {
            return new GetLjxAccountInfoRequest(this);
        } 

    } 

}
