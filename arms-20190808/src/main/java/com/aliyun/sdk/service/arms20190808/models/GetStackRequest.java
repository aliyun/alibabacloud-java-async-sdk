// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackRequest} extends {@link RequestModel}
 *
 * <p>GetStackRequest</p>
 */
public class GetStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RpcID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rpcID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceID")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The end time of the call method.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the remote procedure call (RPC) mode. You can obtain the ID by calling the **GetTrace** operation.
         */
        public Builder rpcID(String rpcID) {
            this.putQueryParameter("RpcID", rpcID);
            this.rpcID = rpcID;
            return this;
        }

        /**
         * The start time of the call method.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The trace ID. You can log on to the Application Real-Time Monitoring Service (ARMS) console and obtain the trace ID on the **Trace Query** page.
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
