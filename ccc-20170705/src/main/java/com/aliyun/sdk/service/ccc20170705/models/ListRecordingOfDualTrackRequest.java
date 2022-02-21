// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecordingOfDualTrackRequest} extends {@link RequestModel}
 *
 * <p>ListRecordingOfDualTrackRequest</p>
 */
public class ListRecordingOfDualTrackRequest extends Request {
    @Query
    @NameInMap("AgentId")
    private String agentId;

    @Query
    @NameInMap("CalledNumber")
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    private String callingNumber;

    @Query
    @NameInMap("ConnectId")
    private String connectId;

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
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("StopTime")
    @Validation(required = true)
    private Long stopTime;

    private ListRecordingOfDualTrackRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.connectId = builder.connectId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecordingOfDualTrackRequest create() {
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
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return connectId
     */
    public String getConnectId() {
        return this.connectId;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Long getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<ListRecordingOfDualTrackRequest, Builder> {
        private String agentId; 
        private String calledNumber; 
        private String callingNumber; 
        private String connectId; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTime; 
        private Long stopTime; 

        private Builder() {
            super();
        } 

        private Builder(ListRecordingOfDualTrackRequest response) {
            super(response);
            this.agentId = response.agentId;
            this.calledNumber = response.calledNumber;
            this.callingNumber = response.callingNumber;
            this.connectId = response.connectId;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.stopTime = response.stopTime;
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
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * ConnectId.
         */
        public Builder connectId(String connectId) {
            this.putQueryParameter("ConnectId", connectId);
            this.connectId = connectId;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StopTime.
         */
        public Builder stopTime(Long stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public ListRecordingOfDualTrackRequest build() {
            return new ListRecordingOfDualTrackRequest(this);
        } 

    } 

}
