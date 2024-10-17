// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendLiveSnapshotJobCommandRequest} extends {@link RequestModel}
 *
 * <p>SendLiveSnapshotJobCommandRequest</p>
 */
public class SendLiveSnapshotJobCommandRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder command(String command) {
            this.putBodyParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
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
