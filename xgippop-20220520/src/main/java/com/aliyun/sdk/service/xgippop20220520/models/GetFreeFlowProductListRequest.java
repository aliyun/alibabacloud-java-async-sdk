// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowProductListRequest} extends {@link RequestModel}
 *
 * <p>GetFreeFlowProductListRequest</p>
 */
public class GetFreeFlowProductListRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetFreeFlowProductListRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowProductListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetFreeFlowProductListRequest, Builder> {
        private Long aliUid; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetFreeFlowProductListRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.instanceId = request.instanceId;
        } 

        /**
         * 用户编号
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetFreeFlowProductListRequest build() {
            return new GetFreeFlowProductListRequest(this);
        } 

    } 

}
