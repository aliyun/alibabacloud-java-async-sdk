// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeKernelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKernelVersionResponseBody</p>
 */
public class DescribeKernelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableKernelVersions")
    private java.util.List<AvailableKernelVersions> availableKernelVersions;

    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    private String expireDate;

    @com.aliyun.core.annotation.NameInMap("KernelVersion")
    private String kernelVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKernelVersionResponseBody(Builder builder) {
        this.availableKernelVersions = builder.availableKernelVersions;
        this.expireDate = builder.expireDate;
        this.kernelVersion = builder.kernelVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKernelVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableKernelVersions
     */
    public java.util.List<AvailableKernelVersions> getAvailableKernelVersions() {
        return this.availableKernelVersions;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableKernelVersions> availableKernelVersions; 
        private String expireDate; 
        private String kernelVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeKernelVersionResponseBody model) {
            this.availableKernelVersions = model.availableKernelVersions;
            this.expireDate = model.expireDate;
            this.kernelVersion = model.kernelVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of target versions to which the current version can be upgraded.</p>
         */
        public Builder availableKernelVersions(java.util.List<AvailableKernelVersions> availableKernelVersions) {
            this.availableKernelVersions = availableKernelVersions;
            return this;
        }

        /**
         * <p>The end-of-support date of the version. The time is in the yyyy-MM-DD HH:mm:ss format. After this date, the system no longer maintains this version. If any issues occur, upgrade to a later version.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T16:00:00Z</p>
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>The kernel version number of the cluster. Example: <strong>3.1.8</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.8</p>
         */
        public Builder kernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKernelVersionResponseBody build() {
            return new DescribeKernelVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKernelVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKernelVersionResponseBody</p>
     */
    public static class AvailableKernelVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("KernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("ReleaseDate")
        private String releaseDate;

        private AvailableKernelVersions(Builder builder) {
            this.expireDate = builder.expireDate;
            this.kernelVersion = builder.kernelVersion;
            this.releaseDate = builder.releaseDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableKernelVersions create() {
            return builder().build();
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public static final class Builder {
            private String expireDate; 
            private String kernelVersion; 
            private String releaseDate; 

            private Builder() {
            } 

            private Builder(AvailableKernelVersions model) {
                this.expireDate = model.expireDate;
                this.kernelVersion = model.kernelVersion;
                this.releaseDate = model.releaseDate;
            } 

            /**
             * <p>The end-of-support date of the version. The time is in the yyyy-MM-DD HH:mm:ss format. After this date, the system no longer maintains this version. If any issues occur, upgrade to a later version.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-17T16:00:00Z</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The kernel version number of the cluster. Example: <strong>3.1.9</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3.1.9</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The release time of the kernel version. The time format is yyyy-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-17T16:00:00Z</p>
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            public AvailableKernelVersions build() {
                return new AvailableKernelVersions(this);
            } 

        } 

    }
}
