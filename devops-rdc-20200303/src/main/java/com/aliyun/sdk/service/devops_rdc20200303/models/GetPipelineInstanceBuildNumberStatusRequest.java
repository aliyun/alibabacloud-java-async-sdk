// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceBuildNumberStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineInstanceBuildNumberStatusRequest</p>
 */
public class GetPipelineInstanceBuildNumberStatusRequest extends Request {
    @Body
    @NameInMap("BuildNum")
    @Validation(maximum = 999999999999999D, minimum = 1)
    private Long buildNum;

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

    private GetPipelineInstanceBuildNumberStatusRequest(Builder builder) {
        super(builder);
        this.buildNum = builder.buildNum;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstanceBuildNumberStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildNum
     */
    public Long getBuildNum() {
        return this.buildNum;
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

    public static final class Builder extends Request.Builder<GetPipelineInstanceBuildNumberStatusRequest, Builder> {
        private Long buildNum; 
        private String orgId; 
        private Long pipelineId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineInstanceBuildNumberStatusRequest response) {
            super(response);
            this.buildNum = response.buildNum;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
            this.userPk = response.userPk;
        } 

        /**
         * BuildNum.
         */
        public Builder buildNum(Long buildNum) {
            this.putBodyParameter("BuildNum", buildNum);
            this.buildNum = buildNum;
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
        public GetPipelineInstanceBuildNumberStatusRequest build() {
            return new GetPipelineInstanceBuildNumberStatusRequest(this);
        } 

    } 

}
