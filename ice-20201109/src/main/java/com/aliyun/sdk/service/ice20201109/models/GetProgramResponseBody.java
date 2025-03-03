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
 * {@link GetProgramResponseBody} extends {@link TeaModel}
 *
 * <p>GetProgramResponseBody</p>
 */
public class GetProgramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Program")
    private ChannelAssemblyProgram program;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProgramResponseBody(Builder builder) {
        this.program = builder.program;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProgramResponseBody create() {
        return builder().build();
    }

    /**
     * @return program
     */
    public ChannelAssemblyProgram getProgram() {
        return this.program;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ChannelAssemblyProgram program; 
        private String requestId; 

        /**
         * <p>The information about the program.</p>
         */
        public Builder program(ChannelAssemblyProgram program) {
            this.program = program;
            return this;
        }

        /**
         * <p><strong>Request ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxx-xxxxx-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProgramResponseBody build() {
            return new GetProgramResponseBody(this);
        } 

    } 

}
