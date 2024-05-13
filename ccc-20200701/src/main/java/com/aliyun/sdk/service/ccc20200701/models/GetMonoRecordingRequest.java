// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonoRecordingRequest} extends {@link RequestModel}
 *
 * <p>GetMonoRecordingRequest</p>
 */
public class GetMonoRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Long expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetMonoRecordingRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.expireSeconds = builder.expireSeconds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonoRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return expireSeconds
     */
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetMonoRecordingRequest, Builder> {
        private String contactId; 
        private Long expireSeconds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetMonoRecordingRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.expireSeconds = request.expireSeconds;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Long expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
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

        @Override
        public GetMonoRecordingRequest build() {
            return new GetMonoRecordingRequest(this);
        } 

    } 

}
