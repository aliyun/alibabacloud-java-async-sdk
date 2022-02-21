// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadAllTypeRecordingRequest} extends {@link RequestModel}
 *
 * <p>DownloadAllTypeRecordingRequest</p>
 */
public class DownloadAllTypeRecordingRequest extends Request {
    @Query
    @NameInMap("Channel")
    private String channel;

    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private String contactId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DownloadAllTypeRecordingRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.contactId = builder.contactId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadAllTypeRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DownloadAllTypeRecordingRequest, Builder> {
        private String channel; 
        private String contactId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadAllTypeRecordingRequest response) {
            super(response);
            this.channel = response.channel;
            this.contactId = response.contactId;
            this.instanceId = response.instanceId;
        } 

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DownloadAllTypeRecordingRequest build() {
            return new DownloadAllTypeRecordingRequest(this);
        } 

    } 

}
