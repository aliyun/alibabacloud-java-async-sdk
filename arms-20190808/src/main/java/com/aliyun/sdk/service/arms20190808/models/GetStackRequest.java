// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("SpanID")
    private String spanID;

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
        this.spanID = builder.spanID;
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
     * @return spanID
     */
    public String getSpanID() {
        return this.spanID;
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
        private String spanID; 
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
            this.spanID = request.spanID;
            this.startTime = request.startTime;
            this.traceID = request.traceID;
        } 

        /**
         * <p>The end time of the call method.</p>
         * 
         * <strong>example:</strong>
         * <p>1653641800</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application. For more information about how to obtain the PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">Obtain the PID of an application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eb4zdose6v@36bab313a******</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the remote procedure call (RPC) mode. You can obtain the ID by calling the <strong>GetTrace</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder rpcID(String rpcID) {
            this.putQueryParameter("RpcID", rpcID);
            this.rpcID = rpcID;
            return this;
        }

        /**
         * SpanID.
         */
        public Builder spanID(String spanID) {
            this.putQueryParameter("SpanID", spanID);
            this.spanID = spanID;
            return this;
        }

        /**
         * <p>The start time of the call method.</p>
         * 
         * <strong>example:</strong>
         * <p>1653555396</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The trace ID. You can log on to the Application Real-Time Monitoring Service (ARMS) console and obtain the trace ID on the <strong>Trace Query</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0a5800611641470044457853******</p>
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
