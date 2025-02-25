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
 * {@link GetProgramRequest} extends {@link RequestModel}
 *
 * <p>GetProgramRequest</p>
 */
public class GetProgramRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programName;

    private GetProgramRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.programName = builder.programName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProgramRequest create() {
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

    public static final class Builder extends Request.Builder<GetProgramRequest, Builder> {
        private String channelName; 
        private String programName; 

        private Builder() {
            super();
        } 

        private Builder(GetProgramRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.programName = request.programName;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>program1</p>
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
            return this;
        }

        @Override
        public GetProgramRequest build() {
            return new GetProgramRequest(this);
        } 

    } 

}
