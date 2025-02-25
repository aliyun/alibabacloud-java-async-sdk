// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectInstancesRequest} extends {@link RequestModel}
 *
 * <p>GetConnectInstancesRequest</p>
 */
public class GetConnectInstancesRequest extends Request {
    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetConnectInstancesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<GetConnectInstancesRequest, Builder> {
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectInstancesRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetConnectInstancesRequest build() {
            return new GetConnectInstancesRequest(this);
        } 

    } 

}
