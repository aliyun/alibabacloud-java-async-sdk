// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRunResponseBody</p>
 */
public class CreateRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private CreateRunResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String hostId; 
        private String requestId; 
        private String runId; 
        private String workspace; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public CreateRunResponseBody build() {
            return new CreateRunResponseBody(this);
        } 

    } 

}
