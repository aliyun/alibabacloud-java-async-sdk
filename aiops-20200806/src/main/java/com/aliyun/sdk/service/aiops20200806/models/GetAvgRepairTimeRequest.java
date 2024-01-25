// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvgRepairTimeRequest} extends {@link RequestModel}
 *
 * <p>GetAvgRepairTimeRequest</p>
 */
public class GetAvgRepairTimeRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetAvgRepairTimeRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvgRepairTimeRequest create() {
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

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetAvgRepairTimeRequest, Builder> {
        private String operaUid; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetAvgRepairTimeRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.uid = request.uid;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
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
        public GetAvgRepairTimeRequest build() {
            return new GetAvgRepairTimeRequest(this);
        } 

    } 

}
