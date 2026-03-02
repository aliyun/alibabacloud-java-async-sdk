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
 * {@link GetTraceDetailRequest} extends {@link RequestModel}
 *
 * <p>GetTraceDetailRequest</p>
 */
public class GetTraceDetailRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private GetTraceDetailRequest(Builder builder) {
        super(builder);
        this.traceId = builder.traceId;
        this.endTime = builder.endTime;
        this.env = builder.env;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceDetailRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetTraceDetailRequest, Builder> {
        private String traceId; 
        private String endTime; 
        private String env; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetTraceDetailRequest request) {
            super(request);
            this.traceId = request.traceId;
            this.endTime = request.endTime;
            this.env = request.env;
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
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetTraceDetailRequest build() {
            return new GetTraceDetailRequest(this);
        } 

    } 

}
