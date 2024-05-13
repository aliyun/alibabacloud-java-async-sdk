// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeLhDagOwnerRequest} extends {@link RequestModel}
 *
 * <p>ChangeLhDagOwnerRequest</p>
 */
public class ChangeLhDagOwnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ChangeLhDagOwnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.ownerUserId = builder.ownerUserId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeLhDagOwnerRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return ownerUserId
     */
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ChangeLhDagOwnerRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long ownerUserId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ChangeLhDagOwnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.ownerUserId = request.ownerUserId;
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
         * The ID of the task flow. You can call the [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the user to be specified as the new owner of the task flow. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
         */
        public Builder ownerUserId(Long ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ChangeLhDagOwnerRequest build() {
            return new ChangeLhDagOwnerRequest(this);
        } 

    } 

}
