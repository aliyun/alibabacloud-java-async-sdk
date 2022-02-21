// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAgentStatisticReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateAgentStatisticReportRequest</p>
 */
public class GenerateAgentStatisticReportRequest extends Request {
    @Query
    @NameInMap("AgentId")
    private String agentId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private GenerateAgentStatisticReportRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAgentStatisticReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GenerateAgentStatisticReportRequest, Builder> {
        private String agentId; 
        private String endDate; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAgentStatisticReportRequest response) {
            super(response);
            this.agentId = response.agentId;
            this.endDate = response.endDate;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GenerateAgentStatisticReportRequest build() {
            return new GenerateAgentStatisticReportRequest(this);
        } 

    } 

}
