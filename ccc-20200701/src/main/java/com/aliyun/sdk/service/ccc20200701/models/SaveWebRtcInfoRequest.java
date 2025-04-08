// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link SaveWebRtcInfoRequest} extends {@link RequestModel}
 *
 * <p>SaveWebRtcInfoRequest</p>
 */
public class SaveWebRtcInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private SaveWebRtcInfoRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWebRtcInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<SaveWebRtcInfoRequest, Builder> {
        private String callId; 
        private String content; 
        private String contentType; 
        private String instanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWebRtcInfoRequest request) {
            super(request);
            this.callId = request.callId;
            this.content = request.content;
            this.contentType = request.contentType;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e13c9740-1e37-123b-21b6-00163e352f9</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;media_source&quot;:{},&quot;remote_inbound_rtp&quot;:{},&quot;outbound_rtp&quot;:{},&quot;inbound_rtp&quot;:{},&quot;remote_outbound_rtp&quot;:{},&quot;candidate&quot;:{},&quot;basic&quot;:{&quot;callId&quot;:&quot;e13c9740-1e37-123b-21b6-00163e352f9&quot;,&quot;timestamp&quot;:&quot;1647262108395&quot;,&quot;callStartTime&quot;:&quot;1647262108393&quot;,&quot;uid&quot;:&quot;user-test&quot;,&quot;access_point&quot;:&quot;shanghai&quot;,&quot;browser&quot;:&quot;90&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}}</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-b8b0ca63-330c-4e65-8ae3-9de2c7ce7683</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public SaveWebRtcInfoRequest build() {
            return new SaveWebRtcInfoRequest(this);
        } 

    } 

}
