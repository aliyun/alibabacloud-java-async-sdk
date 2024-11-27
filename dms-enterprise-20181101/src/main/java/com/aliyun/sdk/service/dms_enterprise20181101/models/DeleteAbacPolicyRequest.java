// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAbacPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAbacPolicyRequest</p>
 */
public class DeleteAbacPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbacPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long abacPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private DeleteAbacPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.abacPolicyId = builder.abacPolicyId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAbacPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return abacPolicyId
     */
    public Long getAbacPolicyId() {
        return this.abacPolicyId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteAbacPolicyRequest, Builder> {
        private String regionId; 
        private Long abacPolicyId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAbacPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.abacPolicyId = request.abacPolicyId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder abacPolicyId(Long abacPolicyId) {
            this.putQueryParameter("AbacPolicyId", abacPolicyId);
            this.abacPolicyId = abacPolicyId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteAbacPolicyRequest build() {
            return new DeleteAbacPolicyRequest(this);
        } 

    } 

}
