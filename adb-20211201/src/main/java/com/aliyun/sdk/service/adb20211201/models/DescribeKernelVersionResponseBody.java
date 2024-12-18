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

        /**
         * AvailableKernelVersions.
         */
        public Builder availableKernelVersions(java.util.List<AvailableKernelVersions> availableKernelVersions) {
            this.availableKernelVersions = availableKernelVersions;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * KernelVersion.
         */
        public Builder kernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * KernelVersion.
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * ReleaseDate.
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
