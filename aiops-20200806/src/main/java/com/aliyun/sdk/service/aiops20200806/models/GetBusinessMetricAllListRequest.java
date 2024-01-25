// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessMetricAllListRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessMetricAllListRequest</p>
 */
public class GetBusinessMetricAllListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetBusinessMetricAllListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessMetricAllListRequest create() {
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

    public static final class Builder extends Request.Builder<GetBusinessMetricAllListRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessMetricAllListRequest request) {
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
        public GetBusinessMetricAllListRequest build() {
            return new GetBusinessMetricAllListRequest(this);
        } 

    } 

}
