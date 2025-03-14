// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateOpaClusterPluginResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOpaClusterPluginResponseBody</p>
 */
public class CreateOpaClusterPluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstallStatus")
    private java.util.List<InstallStatus> installStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return installStatus
     */
    public java.util.List<InstallStatus> getInstallStatus() {
        return this.installStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstallStatus> installStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOpaClusterPluginResponseBody model) {
            this.installStatus = model.installStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The installation status of the components.</p>
         */
        public Builder installStatus(java.util.List<InstallStatus> installStatus) {
            this.installStatus = installStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOpaClusterPluginResponseBody build() {
            return new CreateOpaClusterPluginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOpaClusterPluginResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOpaClusterPluginResponseBody</p>
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

            private Builder() {
            } 

            private Builder(InstallStatus model) {
                this.clusterId = model.clusterId;
                this.installStatus = model.installStatus;
            } 

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
