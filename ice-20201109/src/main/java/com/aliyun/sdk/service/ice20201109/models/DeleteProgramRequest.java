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
 * {@link DeleteProgramRequest} extends {@link RequestModel}
 *
 * <p>DeleteProgramRequest</p>
 */
public class DeleteProgramRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programName;

    private DeleteProgramRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.programName = builder.programName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProgramRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    public static final class Builder extends Request.Builder<DeleteProgramRequest, Builder> {
        private String channelName; 
        private String programName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProgramRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.programName = request.programName;
        } 

        /**
         * <p>The name of the channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>The name of the program.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name</p>
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
            return this;
        }

        @Override
        public DeleteProgramRequest build() {
            return new DeleteProgramRequest(this);
        } 

    } 

}
