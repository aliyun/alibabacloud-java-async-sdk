// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHandleRiskRequest} extends {@link RequestModel}
 *
 * <p>UpdateHandleRiskRequest</p>
 */
public class UpdateHandleRiskRequest extends Request {
    @Query
    @NameInMap("PatrolDetailIds")
    private String patrolDetailIds;

    @Query
    @NameInMap("PatrolId")
    private Long patrolId;

    @Query
    @NameInMap("SwitchFrontOperaUid")
    private String switchFrontOperaUid;

    private UpdateHandleRiskRequest(Builder builder) {
        super(builder);
        this.patrolDetailIds = builder.patrolDetailIds;
        this.patrolId = builder.patrolId;
        this.switchFrontOperaUid = builder.switchFrontOperaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHandleRiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return patrolDetailIds
     */
    public String getPatrolDetailIds() {
        return this.patrolDetailIds;
    }

    /**
     * @return patrolId
     */
    public Long getPatrolId() {
        return this.patrolId;
    }

    /**
     * @return switchFrontOperaUid
     */
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    public static final class Builder extends Request.Builder<UpdateHandleRiskRequest, Builder> {
        private String patrolDetailIds; 
        private Long patrolId; 
        private String switchFrontOperaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHandleRiskRequest request) {
            super(request);
            this.patrolDetailIds = request.patrolDetailIds;
            this.patrolId = request.patrolId;
            this.switchFrontOperaUid = request.switchFrontOperaUid;
        } 

        /**
         * PatrolDetailIds.
         */
        public Builder patrolDetailIds(String patrolDetailIds) {
            this.putQueryParameter("PatrolDetailIds", patrolDetailIds);
            this.patrolDetailIds = patrolDetailIds;
            return this;
        }

        /**
         * PatrolId.
         */
        public Builder patrolId(Long patrolId) {
            this.putQueryParameter("PatrolId", patrolId);
            this.patrolId = patrolId;
            return this;
        }

        /**
         * SwitchFrontOperaUid.
         */
        public Builder switchFrontOperaUid(String switchFrontOperaUid) {
            this.putQueryParameter("SwitchFrontOperaUid", switchFrontOperaUid);
            this.switchFrontOperaUid = switchFrontOperaUid;
            return this;
        }

        @Override
        public UpdateHandleRiskRequest build() {
            return new UpdateHandleRiskRequest(this);
        } 

    } 

}
