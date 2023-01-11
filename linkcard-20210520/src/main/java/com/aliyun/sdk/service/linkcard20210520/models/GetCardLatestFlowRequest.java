// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLatestFlowRequest} extends {@link RequestModel}
 *
 * <p>GetCardLatestFlowRequest</p>
 */
public class GetCardLatestFlowRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    private GetCardLatestFlowRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardLatestFlowRequest create() {
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

    public static final class Builder extends Request.Builder<GetCardLatestFlowRequest, Builder> {
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(GetCardLatestFlowRequest request) {
            super(request);
            this.iccid = request.iccid;
        } 

        /**
         * iccid
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        @Override
        public GetCardLatestFlowRequest build() {
            return new GetCardLatestFlowRequest(this);
        } 

    } 

}
