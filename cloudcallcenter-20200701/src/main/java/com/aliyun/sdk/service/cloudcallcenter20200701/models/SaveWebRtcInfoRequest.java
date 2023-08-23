// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebRtcInfoRequest} extends {@link RequestModel}
 *
 * <p>SaveWebRtcInfoRequest</p>
 */
public class SaveWebRtcInfoRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("ContentType")
    @Validation(required = true)
    private String contentType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
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
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
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
         * JobId.
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
