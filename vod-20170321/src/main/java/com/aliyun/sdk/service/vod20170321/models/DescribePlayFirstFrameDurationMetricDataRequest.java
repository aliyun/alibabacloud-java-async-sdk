// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayFirstFrameDurationMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayFirstFrameDurationMetricDataRequest</p>
 */
public class DescribePlayFirstFrameDurationMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribePlayFirstFrameDurationMetricDataRequest(Builder builder) {
        super(builder);
        this.beginTs = builder.beginTs;
        this.endTs = builder.endTs;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayFirstFrameDurationMetricDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTs
     */
    public String getBeginTs() {
        return this.beginTs;
    }

    /**
     * @return endTs
     */
    public String getEndTs() {
        return this.endTs;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<DescribePlayFirstFrameDurationMetricDataRequest, Builder> {
        private String beginTs; 
        private String endTs; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayFirstFrameDurationMetricDataRequest request) {
            super(request);
            this.beginTs = request.beginTs;
            this.endTs = request.endTs;
            this.traceId = request.traceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder beginTs(String beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTs(String endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public DescribePlayFirstFrameDurationMetricDataRequest build() {
            return new DescribePlayFirstFrameDurationMetricDataRequest(this);
        } 

    } 

}
