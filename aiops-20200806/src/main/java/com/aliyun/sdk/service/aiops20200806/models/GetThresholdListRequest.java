// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThresholdListRequest} extends {@link RequestModel}
 *
 * <p>GetThresholdListRequest</p>
 */
public class GetThresholdListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetThresholdListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThresholdListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetThresholdListRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetThresholdListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetThresholdListRequest build() {
            return new GetThresholdListRequest(this);
        } 

    } 

}
