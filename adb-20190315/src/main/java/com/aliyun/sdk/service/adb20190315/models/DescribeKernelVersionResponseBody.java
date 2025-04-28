// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * <p>The minor versions to which you can update the current minor version of the cluster.</p>
         */
        public Builder availableKernelVersions(java.util.List<AvailableKernelVersions> availableKernelVersions) {
            this.availableKernelVersions = availableKernelVersions;
            return this;
        }

        /**
         * <p>The maintenance expiration time of the version. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC. After the time arrives, the system no longer maintains the version. If any issues occur, update the minor version of the cluster to a later version.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-01T10:36:30Z</p>
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>The minor version of the cluster. Example: <strong>3.1.8</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.8</p>
         */
        public Builder kernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
             * <p>The maintenance expiration time of the version. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC. After the time arrives, the system no longer maintains the version. If any issues occur, update the minor version of the cluster to a later version.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-01T10:36:30Z</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The minor version. Example: <strong>3.1.9</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3.1.9</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The time when the minor version was released. The time follows the ISO 8601 standard in the yyyy-MM-DD HH:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-01T10:36:30Z</p>
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
