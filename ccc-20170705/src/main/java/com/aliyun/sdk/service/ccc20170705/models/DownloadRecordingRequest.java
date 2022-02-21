// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadRecordingRequest} extends {@link RequestModel}
 *
 * <p>DownloadRecordingRequest</p>
 */
public class DownloadRecordingRequest extends Request {
    @Query
    @NameInMap("Channel")
    private String channel;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DownloadRecordingRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadRecordingRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DownloadRecordingRequest, Builder> {
        private String channel; 
        private String fileName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadRecordingRequest response) {
            super(response);
            this.channel = response.channel;
            this.fileName = response.fileName;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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
        public DownloadRecordingRequest build() {
            return new DownloadRecordingRequest(this);
        } 

    } 

}
