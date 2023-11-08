// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetVmMetaResponseBody</p>
 */
public class GetVmMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VmMetaInfo")
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The metadata that is required to add a non-containerized application to the ASM instance.
         */
        public Builder vmMetaInfo(VmMetaInfo vmMetaInfo) {
            this.vmMetaInfo = vmMetaInfo;
            return this;
        }

        public GetVmMetaResponseBody build() {
            return new GetVmMetaResponseBody(this);
        } 

    } 

    public static class VmMetaInfo extends TeaModel {
        @NameInMap("EnvoyEnvContent")
        private String envoyEnvContent;

        @NameInMap("HostsContent")
        private String hostsContent;

        @NameInMap("TokenContent")
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

            /**
             * The content of the EnvoyEnv file.
             */
            public Builder envoyEnvContent(String envoyEnvContent) {
                this.envoyEnvContent = envoyEnvContent;
                return this;
            }

            /**
             * The content of the hosts file.
             */
            public Builder hostsContent(String hostsContent) {
                this.hostsContent = hostsContent;
                return this;
            }

            /**
             * The content of the Token file.
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
