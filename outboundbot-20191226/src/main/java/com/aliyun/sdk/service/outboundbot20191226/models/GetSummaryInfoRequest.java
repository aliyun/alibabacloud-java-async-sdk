// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSummaryInfoRequest</p>
 */
public class GetSummaryInfoRequest extends Request {
    @Query
    @NameInMap("InstanceIdList")
    private java.util.List < String > instanceIdList;

    private GetSummaryInfoRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public java.util.List < String > getInstanceIdList() {
        return this.instanceIdList;
    }

    public static final class Builder extends Request.Builder<GetSummaryInfoRequest, Builder> {
        private java.util.List < String > instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetSummaryInfoRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public GetSummaryInfoRequest build() {
            return new GetSummaryInfoRequest(this);
        } 

    } 

}
