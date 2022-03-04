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
    @NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("ConsoleOutput")
    private String consoleOutput;

    private GetInstanceConsoleOutputResponseBody(Builder builder) {
        this.lastUpdateTime = builder.lastUpdateTime;
        this.requestId = builder.requestId;
        this.instanceId = builder.instanceId;
        this.consoleOutput = builder.consoleOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConsoleOutputResponseBody create() {
        return builder().build();
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return consoleOutput
     */
    public String getConsoleOutput() {
        return this.consoleOutput;
    }

    public static final class Builder {
        private String lastUpdateTime; 
        private String requestId; 
        private String instanceId; 
        private String consoleOutput; 

        /**
         * The time when the instance was last started, restarted, or shut down. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The system command output of the instance. The output is Base64-encoded.
         */
        public Builder consoleOutput(String consoleOutput) {
            this.consoleOutput = consoleOutput;
            return this;
        }

        public GetInstanceConsoleOutputResponseBody build() {
            return new GetInstanceConsoleOutputResponseBody(this);
        } 

    } 

}
