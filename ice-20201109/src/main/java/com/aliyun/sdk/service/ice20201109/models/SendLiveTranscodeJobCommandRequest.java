// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SendLiveTranscodeJobCommandRequest} extends {@link RequestModel}
 *
 * <p>SendLiveTranscodeJobCommandRequest</p>
 */
public class SendLiveTranscodeJobCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private SendLiveTranscodeJobCommandRequest(Builder builder) {
        super(builder);
        this.command = builder.command;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveTranscodeJobCommandRequest create() {
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

    public static final class Builder extends Request.Builder<SendLiveTranscodeJobCommandRequest, Builder> {
        private String command; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(SendLiveTranscodeJobCommandRequest request) {
            super(request);
            this.command = request.command;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The operation command. Only the stop command is supported. This command is used to stop a transcoding job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * <p>The ID of the transcoding job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public SendLiveTranscodeJobCommandRequest build() {
            return new SendLiveTranscodeJobCommandRequest(this);
        } 

    } 

}
