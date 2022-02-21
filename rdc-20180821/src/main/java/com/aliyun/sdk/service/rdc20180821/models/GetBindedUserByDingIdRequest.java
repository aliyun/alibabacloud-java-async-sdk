// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBindedUserByDingIdRequest} extends {@link RequestModel}
 *
 * <p>GetBindedUserByDingIdRequest</p>
 */
public class GetBindedUserByDingIdRequest extends Request {
    @Query
    @NameInMap("DingId")
    @Validation(required = true)
    private String dingId;

    private GetBindedUserByDingIdRequest(Builder builder) {
        super(builder);
        this.dingId = builder.dingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBindedUserByDingIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dingId
     */
    public String getDingId() {
        return this.dingId;
    }

    public static final class Builder extends Request.Builder<GetBindedUserByDingIdRequest, Builder> {
        private String dingId; 

        private Builder() {
            super();
        } 

        private Builder(GetBindedUserByDingIdRequest response) {
            super(response);
            this.dingId = response.dingId;
        } 

        /**
         * DingId.
         */
        public Builder dingId(String dingId) {
            this.putQueryParameter("DingId", dingId);
            this.dingId = dingId;
            return this;
        }

        @Override
        public GetBindedUserByDingIdRequest build() {
            return new GetBindedUserByDingIdRequest(this);
        } 

    } 

}
