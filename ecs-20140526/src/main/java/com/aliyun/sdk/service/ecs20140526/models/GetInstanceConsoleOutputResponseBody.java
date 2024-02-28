// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsoleOutputResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceConsoleOutputResponseBody</p>
 */
public class GetInstanceConsoleOutputResponseBody extends TeaModel {
    @NameInMap("ConsoleOutput")
    private String consoleOutput;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceConsoleOutputResponseBody(Builder builder) {
        this.consoleOutput = builder.consoleOutput;
        this.instanceId = builder.instanceId;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConsoleOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return consoleOutput
     */
    public String getConsoleOutput() {
        return this.consoleOutput;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String consoleOutput; 
        private String instanceId; 
        private String lastUpdateTime; 
        private String requestId; 

        /**
         * The Base64-encoded command output of the instance.
         */
        public Builder consoleOutput(String consoleOutput) {
            this.consoleOutput = consoleOutput;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The time when the last log entry was generated in the Linux kernel. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC+8.
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceConsoleOutputResponseBody build() {
            return new GetInstanceConsoleOutputResponseBody(this);
        } 

    } 

}
