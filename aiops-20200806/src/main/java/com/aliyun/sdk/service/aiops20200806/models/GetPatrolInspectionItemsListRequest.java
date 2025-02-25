// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPatrolInspectionItemsListRequest} extends {@link RequestModel}
 *
 * <p>GetPatrolInspectionItemsListRequest</p>
 */
public class GetPatrolInspectionItemsListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetPatrolInspectionItemsListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolInspectionItemsListRequest create() {
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

    public static final class Builder extends Request.Builder<GetPatrolInspectionItemsListRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetPatrolInspectionItemsListRequest request) {
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
        public GetPatrolInspectionItemsListRequest build() {
            return new GetPatrolInspectionItemsListRequest(this);
        } 

    } 

}
