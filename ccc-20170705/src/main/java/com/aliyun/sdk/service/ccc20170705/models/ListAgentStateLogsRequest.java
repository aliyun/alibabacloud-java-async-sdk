// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentStateLogsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentStateLogsRequest</p>
 */
public class ListAgentStateLogsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

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
    @NameInMap("RamId")
    @Validation(required = true)
    private Long ramId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private ListAgentStateLogsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ramId = builder.ramId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStateLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return ramId
     */
    public Long getRamId() {
        return this.ramId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAgentStateLogsRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long ramId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentStateLogsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.ramId = response.ramId;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * RamId.
         */
        public Builder ramId(Long ramId) {
            this.putQueryParameter("RamId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAgentStateLogsRequest build() {
            return new ListAgentStateLogsRequest(this);
        } 

    } 

}
