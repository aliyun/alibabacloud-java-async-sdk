// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GetVmMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetVmMetaResponseBody</p>
 */
public class GetVmMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VmMetaInfo")
    private VmMetaInfo vmMetaInfo;

    private GetVmMetaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vmMetaInfo = builder.vmMetaInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmMetaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vmMetaInfo
     */
    public VmMetaInfo getVmMetaInfo() {
        return this.vmMetaInfo;
    }

    public static final class Builder {
        private String requestId; 
        private VmMetaInfo vmMetaInfo; 

        private Builder() {
        } 

        private Builder(GetVmMetaResponseBody model) {
            this.requestId = model.requestId;
            this.vmMetaInfo = model.vmMetaInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9522f7c9-63a1-4603-b850-37d12a****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata that is required to add a non-containerized application to the ASM instance.</p>
         */
        public Builder vmMetaInfo(VmMetaInfo vmMetaInfo) {
            this.vmMetaInfo = vmMetaInfo;
            return this;
        }

        public GetVmMetaResponseBody build() {
            return new GetVmMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVmMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetVmMetaResponseBody</p>
     */
    public static class VmMetaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvoyEnvContent")
        private String envoyEnvContent;

        @com.aliyun.core.annotation.NameInMap("HostsContent")
        private String hostsContent;

        @com.aliyun.core.annotation.NameInMap("TokenContent")
        private String tokenContent;

        private VmMetaInfo(Builder builder) {
            this.envoyEnvContent = builder.envoyEnvContent;
            this.hostsContent = builder.hostsContent;
            this.tokenContent = builder.tokenContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VmMetaInfo create() {
            return builder().build();
        }

        /**
         * @return envoyEnvContent
         */
        public String getEnvoyEnvContent() {
            return this.envoyEnvContent;
        }

        /**
         * @return hostsContent
         */
        public String getHostsContent() {
            return this.hostsContent;
        }

        /**
         * @return tokenContent
         */
        public String getTokenContent() {
            return this.tokenContent;
        }

        public static final class Builder {
            private String envoyEnvContent; 
            private String hostsContent; 
            private String tokenContent; 

            private Builder() {
            } 

            private Builder(VmMetaInfo model) {
                this.envoyEnvContent = model.envoyEnvContent;
                this.hostsContent = model.hostsContent;
                this.tokenContent = model.tokenContent;
            } 

            /**
             * <p>The content of the EnvoyEnv file.</p>
             * 
             * <strong>example:</strong>
             * <p>....</p>
             */
            public Builder envoyEnvContent(String envoyEnvContent) {
                this.envoyEnvContent = envoyEnvContent;
                return this;
            }

            /**
             * <p>The content of the hosts file.</p>
             * 
             * <strong>example:</strong>
             * <p>....</p>
             */
            public Builder hostsContent(String hostsContent) {
                this.hostsContent = hostsContent;
                return this;
            }

            /**
             * <p>The content of the Token file.</p>
             * 
             * <strong>example:</strong>
             * <p>....</p>
             */
            public Builder tokenContent(String tokenContent) {
                this.tokenContent = tokenContent;
                return this;
            }

            public VmMetaInfo build() {
                return new VmMetaInfo(this);
            } 

        } 

    }
}
