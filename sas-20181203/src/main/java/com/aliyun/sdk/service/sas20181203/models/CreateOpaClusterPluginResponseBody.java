// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpaClusterPluginResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOpaClusterPluginResponseBody</p>
 */
public class CreateOpaClusterPluginResponseBody extends TeaModel {
    @NameInMap("InstallStatus")
    private java.util.List < InstallStatus> installStatus;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOpaClusterPluginResponseBody(Builder builder) {
        this.installStatus = builder.installStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpaClusterPluginResponseBody create() {
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
         * InstallStatus.
         */
        public Builder installStatus(java.util.List < InstallStatus> installStatus) {
            this.installStatus = installStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOpaClusterPluginResponseBody build() {
            return new CreateOpaClusterPluginResponseBody(this);
        } 

    } 

    public static class InstallStatus extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("InstallStatus")
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * InstallStatus.
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
