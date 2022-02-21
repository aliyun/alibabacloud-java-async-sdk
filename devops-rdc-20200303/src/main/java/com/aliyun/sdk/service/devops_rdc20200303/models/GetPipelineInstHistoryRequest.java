// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineInstHistoryRequest</p>
 */
public class GetPipelineInstHistoryRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true, minLength = 1)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20)
    private Long pageSize;

    @Body
    @NameInMap("PageStart")
    @Validation(required = true)
    private Long pageStart;

    @Body
    @NameInMap("PipelineId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long pipelineId;

    @Body
    @NameInMap("StartTime")
    @Validation(minLength = 1)
    private String startTime;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private GetPipelineInstHistoryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageStart = builder.pageStart;
        this.pipelineId = builder.pipelineId;
        this.startTime = builder.startTime;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageStart
     */
    public Long getPageStart() {
        return this.pageStart;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<GetPipelineInstHistoryRequest, Builder> {
        private String endTime; 
        private String orgId; 
        private Long pageSize; 
        private Long pageStart; 
        private Long pipelineId; 
        private String startTime; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineInstHistoryRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.orgId = response.orgId;
            this.pageSize = response.pageSize;
            this.pageStart = response.pageStart;
            this.pipelineId = response.pipelineId;
            this.startTime = response.startTime;
            this.userPk = response.userPk;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageStart.
         */
        public Builder pageStart(Long pageStart) {
            this.putBodyParameter("PageStart", pageStart);
            this.pageStart = pageStart;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putBodyParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
        public GetPipelineInstHistoryRequest build() {
            return new GetPipelineInstHistoryRequest(this);
        } 

    } 

}
