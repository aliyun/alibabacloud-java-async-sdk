// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link GenerateRelayPollerScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateRelayPollerScriptResponseBody</p>
 */
public class GenerateRelayPollerScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateRelayPollerScriptResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateRelayPollerScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateRelayPollerScriptResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The generation result, which contains the target identifier, the normalized platform, and the installation script.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateRelayPollerScriptResponseBody build() {
            return new GenerateRelayPollerScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateRelayPollerScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateRelayPollerScriptResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        private Data(Builder builder) {
            this.platform = builder.platform;
            this.script = builder.script;
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private String platform; 
            private String script; 
            private String targetId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.platform = model.platform;
                this.script = model.script;
                this.targetId = model.targetId;
            } 

            /**
             * <p>The normalized target platform in the operating system-architecture format.</p>
             * 
             * <strong>example:</strong>
             * <p>linux-amd64</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The installation script content (bash). The script contains a one-time access code, a temporary download link for the poller binary (signed and valid for 1 hour), and a checksum. The script does not contain the actual endpoint or credentials of the target, which are interactively entered during installation. The script carries access credential semantics. Transmit it through a trusted channel and re-download the script to obtain a new one after use.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The scan target identifier echoed from the request.</p>
             * 
             * <strong>example:</strong>
             * <p>target-abc123def4567</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
