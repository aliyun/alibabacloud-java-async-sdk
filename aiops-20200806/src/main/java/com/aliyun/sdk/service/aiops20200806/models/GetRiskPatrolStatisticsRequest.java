// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRiskPatrolStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetRiskPatrolStatisticsRequest</p>
 */
public class GetRiskPatrolStatisticsRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetRiskPatrolStatisticsRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskPatrolStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<GetRiskPatrolStatisticsRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetRiskPatrolStatisticsRequest request) {
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
        public GetRiskPatrolStatisticsRequest build() {
            return new GetRiskPatrolStatisticsRequest(this);
        } 

    } 

}
