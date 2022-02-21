// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferPipelineOwnerRequest} extends {@link RequestModel}
 *
 * <p>TransferPipelineOwnerRequest</p>
 */
public class TransferPipelineOwnerRequest extends Request {
    @Body
    @NameInMap("NewOwnerId")
    @Validation(required = true)
    private String newOwnerId;

    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long pipelineId;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private TransferPipelineOwnerRequest(Builder builder) {
        super(builder);
        this.newOwnerId = builder.newOwnerId;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferPipelineOwnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newOwnerId
     */
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<TransferPipelineOwnerRequest, Builder> {
        private String newOwnerId; 
        private String orgId; 
        private Long pipelineId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(TransferPipelineOwnerRequest response) {
            super(response);
            this.newOwnerId = response.newOwnerId;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
            this.userPk = response.userPk;
        } 

        /**
         * NewOwnerId.
         */
        public Builder newOwnerId(String newOwnerId) {
            this.putBodyParameter("NewOwnerId", newOwnerId);
            this.newOwnerId = newOwnerId;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public TransferPipelineOwnerRequest build() {
            return new TransferPipelineOwnerRequest(this);
        } 

    } 

}
