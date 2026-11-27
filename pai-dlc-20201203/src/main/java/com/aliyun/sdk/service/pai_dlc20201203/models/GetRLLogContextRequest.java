// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetRLLogContextRequest} extends {@link RequestModel}
 *
 * <p>GetRLLogContextRequest</p>
 */
public class GetRLLogContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnchorMessage")
    private String anchorMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnchorTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String anchorTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectTime")
    private String collectTime;

    private GetRLLogContextRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.anchorMessage = builder.anchorMessage;
        this.anchorTime = builder.anchorTime;
        this.collectTime = builder.collectTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLLogContextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return anchorMessage
     */
    public String getAnchorMessage() {
        return this.anchorMessage;
    }

    /**
     * @return anchorTime
     */
    public String getAnchorTime() {
        return this.anchorTime;
    }

    /**
     * @return collectTime
     */
    public String getCollectTime() {
        return this.collectTime;
    }

    public static final class Builder extends Request.Builder<GetRLLogContextRequest, Builder> {
        private String jobId; 
        private String anchorMessage; 
        private String anchorTime; 
        private String collectTime; 

        private Builder() {
            super();
        } 

        private Builder(GetRLLogContextRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.anchorMessage = request.anchorMessage;
            this.anchorTime = request.anchorTime;
            this.collectTime = request.collectTime;
        } 

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The text of the anchor log. The fallback path locates the log by prefix matching. This value is derived from Fatal[].RawMessage.</p>
         * 
         * <strong>example:</strong>
         * <p>[rank0]: torch.OutOfMemoryError: CUDA out of memory. Tried to allocate 2.00 GiB</p>
         */
        public Builder anchorMessage(String anchorMessage) {
            this.putQueryParameter("AnchorMessage", anchorMessage);
            this.anchorMessage = anchorMessage;
            return this;
        }

        /**
         * <p>The timestamp of the anchor log line in UTC RFC 3339 format with second precision.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05T16:36:55Z</p>
         */
        public Builder anchorTime(String anchorTime) {
            this.putQueryParameter("AnchorTime", anchorTime);
            this.anchorTime = anchorTime;
            return this;
        }

        /**
         * <p>The agent_collect_time of the anchor line as a nanosecond string. This value is derived from Fatal[].CollectNs. If provided, the exact path is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1785947815190122847</p>
         */
        public Builder collectTime(String collectTime) {
            this.putQueryParameter("CollectTime", collectTime);
            this.collectTime = collectTime;
            return this;
        }

        @Override
        public GetRLLogContextRequest build() {
            return new GetRLLogContextRequest(this);
        } 

    } 

}
