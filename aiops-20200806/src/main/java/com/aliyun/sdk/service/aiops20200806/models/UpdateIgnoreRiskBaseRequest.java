// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIgnoreRiskBaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateIgnoreRiskBaseRequest</p>
 */
public class UpdateIgnoreRiskBaseRequest extends Request {
    @Query
    @NameInMap("HandleDescribe")
    private String handleDescribe;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PatrolDetailIds")
    private String patrolDetailIds;

    @Query
    @NameInMap("PatrolId")
    private Long patrolId;

    private UpdateIgnoreRiskBaseRequest(Builder builder) {
        super(builder);
        this.handleDescribe = builder.handleDescribe;
        this.operaUid = builder.operaUid;
        this.patrolDetailIds = builder.patrolDetailIds;
        this.patrolId = builder.patrolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIgnoreRiskBaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return handleDescribe
     */
    public String getHandleDescribe() {
        return this.handleDescribe;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
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

    public static final class Builder extends Request.Builder<UpdateIgnoreRiskBaseRequest, Builder> {
        private String handleDescribe; 
        private String operaUid; 
        private String patrolDetailIds; 
        private Long patrolId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIgnoreRiskBaseRequest request) {
            super(request);
            this.handleDescribe = request.handleDescribe;
            this.operaUid = request.operaUid;
            this.patrolDetailIds = request.patrolDetailIds;
            this.patrolId = request.patrolId;
        } 

        /**
         * HandleDescribe.
         */
        public Builder handleDescribe(String handleDescribe) {
            this.putQueryParameter("HandleDescribe", handleDescribe);
            this.handleDescribe = handleDescribe;
            return this;
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

        @Override
        public UpdateIgnoreRiskBaseRequest build() {
            return new UpdateIgnoreRiskBaseRequest(this);
        } 

    } 

}
