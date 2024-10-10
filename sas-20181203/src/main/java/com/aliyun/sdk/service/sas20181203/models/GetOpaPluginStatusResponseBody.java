// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOpaPluginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpaPluginStatusResponseBody</p>
 */
public class GetOpaPluginStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstallStatus")
    private java.util.List < InstallStatus> installStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOpaPluginStatusResponseBody(Builder builder) {
        this.installStatus = builder.installStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaPluginStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return installStatus
     */
    public java.util.List < InstallStatus> getInstallStatus() {
        return this.installStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstallStatus> installStatus; 
        private String requestId; 

        /**
         * <p>The installation status of the components that are required for clusters protected by proactive defense for containers.</p>
         */
        public Builder installStatus(java.util.List < InstallStatus> installStatus) {
            this.installStatus = installStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOpaPluginStatusResponseBody build() {
            return new GetOpaPluginStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpaPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaPluginStatusResponseBody</p>
     */
    public static class InstallStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("InstallStatus")
        private Boolean installStatus;

        private InstallStatus(Builder builder) {
            this.clusterId = builder.clusterId;
            this.installStatus = builder.installStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallStatus create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return installStatus
         */
        public Boolean getInstallStatus() {
            return this.installStatus;
        }

        public static final class Builder {
            private String clusterId; 
            private Boolean installStatus; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c60b77fe62093480db6164a3c2fa****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Indicates whether the component is installed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder installStatus(Boolean installStatus) {
                this.installStatus = installStatus;
                return this;
            }

            public InstallStatus build() {
                return new InstallStatus(this);
            } 

        } 

    }
}
