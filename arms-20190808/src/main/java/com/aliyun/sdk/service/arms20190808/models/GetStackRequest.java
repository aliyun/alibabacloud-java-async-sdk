// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackRequest} extends {@link RequestModel}
 *
 * <p>GetStackRequest</p>
 */
public class GetStackRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RpcID")
    @Validation(required = true)
    private String rpcID;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("TraceID")
    @Validation(required = true)
    private String traceID;

    private GetStackRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.rpcID = builder.rpcID;
        this.startTime = builder.startTime;
        this.traceID = builder.traceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackRequest create() {
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
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rpcID
     */
    public String getRpcID() {
        return this.rpcID;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return traceID
     */
    public String getTraceID() {
        return this.traceID;
    }

    public static final class Builder extends Request.Builder<GetStackRequest, Builder> {
        private Long endTime; 
        private String pid; 
        private String regionId; 
        private String rpcID; 
        private Long startTime; 
        private String traceID; 

        private Builder() {
            super();
        } 

        private Builder(GetStackRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.rpcID = request.rpcID;
            this.startTime = request.startTime;
            this.traceID = request.traceID;
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
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RpcID.
         */
        public Builder rpcID(String rpcID) {
            this.putQueryParameter("RpcID", rpcID);
            this.rpcID = rpcID;
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
         * TraceID.
         */
        public Builder traceID(String traceID) {
            this.putQueryParameter("TraceID", traceID);
            this.traceID = traceID;
            return this;
        }

        @Override
        public GetStackRequest build() {
            return new GetStackRequest(this);
        } 

    } 

}
