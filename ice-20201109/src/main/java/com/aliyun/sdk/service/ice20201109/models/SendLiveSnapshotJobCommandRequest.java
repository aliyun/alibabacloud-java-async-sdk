// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendLiveSnapshotJobCommandRequest} extends {@link RequestModel}
 *
 * <p>SendLiveSnapshotJobCommandRequest</p>
 */
public class SendLiveSnapshotJobCommandRequest extends Request {
    @Body
    @NameInMap("Command")
    @Validation(required = true)
    private String command;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private SendLiveSnapshotJobCommandRequest(Builder builder) {
        super(builder);
        this.command = builder.command;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveSnapshotJobCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<SendLiveSnapshotJobCommandRequest, Builder> {
        private String command; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(SendLiveSnapshotJobCommandRequest request) {
            super(request);
            this.command = request.command;
            this.jobId = request.jobId;
        } 

        /**
         * Command.
         */
        public Builder command(String command) {
            this.putBodyParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public SendLiveSnapshotJobCommandRequest build() {
            return new SendLiveSnapshotJobCommandRequest(this);
        } 

    } 

}
