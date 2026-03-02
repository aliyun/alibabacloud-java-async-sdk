// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackDetailRequest} extends {@link RequestModel}
 *
 * <p>GetStackDetailRequest</p>
 */
public class GetStackDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rpcId")
    private String rpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private GetStackDetailRequest(Builder builder) {
        super(builder);
        this.traceId = builder.traceId;
        this.endTime = builder.endTime;
        this.env = builder.env;
        this.rpcId = builder.rpcId;
        this.serviceGroupId = builder.serviceGroupId;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return rpcId
     */
    public String getRpcId() {
        return this.rpcId;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetStackDetailRequest, Builder> {
        private String traceId; 
        private String endTime; 
        private String env; 
        private String rpcId; 
        private Long serviceGroupId; 
        private String serviceName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetStackDetailRequest request) {
            super(request);
            this.traceId = request.traceId;
            this.endTime = request.endTime;
            this.env = request.env;
            this.rpcId = request.rpcId;
            this.serviceGroupId = request.serviceGroupId;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
        } 

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.putPathParameter("traceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * env.
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * rpcId.
         */
        public Builder rpcId(String rpcId) {
            this.putQueryParameter("rpcId", rpcId);
            this.rpcId = rpcId;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putQueryParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetStackDetailRequest build() {
            return new GetStackDetailRequest(this);
        } 

    } 

}
