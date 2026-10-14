// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListMiniEngineVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMiniEngineVersionsResponseBody</p>
 */
public class ListMiniEngineVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KernelVersions")
    private java.util.List<KernelVersions> kernelVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMiniEngineVersionsResponseBody(Builder builder) {
        this.kernelVersions = builder.kernelVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMiniEngineVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kernelVersions
     */
    public java.util.List<KernelVersions> getKernelVersions() {
        return this.kernelVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<KernelVersions> kernelVersions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMiniEngineVersionsResponseBody model) {
            this.kernelVersions = model.kernelVersions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of available kernel versions.</p>
         */
        public Builder kernelVersions(java.util.List<KernelVersions> kernelVersions) {
            this.kernelVersions = kernelVersions;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMiniEngineVersionsResponseBody build() {
            return new ListMiniEngineVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMiniEngineVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMiniEngineVersionsResponseBody</p>
     */
    public static class KernelVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KernelReleaseType")
        private String kernelReleaseType;

        @com.aliyun.core.annotation.NameInMap("KernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("KernelVersionName")
        private String kernelVersionName;

        private KernelVersions(Builder builder) {
            this.kernelReleaseType = builder.kernelReleaseType;
            this.kernelVersion = builder.kernelVersion;
            this.kernelVersionName = builder.kernelVersionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KernelVersions create() {
            return builder().build();
        }

        /**
         * @return kernelReleaseType
         */
        public String getKernelReleaseType() {
            return this.kernelReleaseType;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return kernelVersionName
         */
        public String getKernelVersionName() {
            return this.kernelVersionName;
        }

        public static final class Builder {
            private String kernelReleaseType; 
            private String kernelVersion; 
            private String kernelVersionName; 

            private Builder() {
            } 

            private Builder(KernelVersions model) {
                this.kernelReleaseType = model.kernelReleaseType;
                this.kernelVersion = model.kernelVersion;
                this.kernelVersionName = model.kernelVersionName;
            } 

            /**
             * <p>The release type of the kernel version. This value is the same as the value returned by the corresponding database product. For example, for ApsaraDB RDS, LTS indicates a long-term support version and BETA indicates a preview version. For PolarDB, the value can be Stable, Old, HighRisk, or Beta.</p>
             * 
             * <strong>example:</strong>
             * <p>LTS</p>
             */
            public Builder kernelReleaseType(String kernelReleaseType) {
                this.kernelReleaseType = kernelReleaseType;
                return this;
            }

            /**
             * <p>The available kernel version number.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_20220731</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The display name of the kernel version.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL 8.0</p>
             */
            public Builder kernelVersionName(String kernelVersionName) {
                this.kernelVersionName = kernelVersionName;
                return this;
            }

            public KernelVersions build() {
                return new KernelVersions(this);
            } 

        } 

    }
}
