// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeEdgeMobileAgentPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMobileAgentPackagesResponseBody</p>
 */
public class DescribeEdgeMobileAgentPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Packages")
    private java.util.List<Packages> packages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEdgeMobileAgentPackagesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.packages = builder.packages;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMobileAgentPackagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return packages
     */
    public java.util.List<Packages> getPackages() {
        return this.packages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Packages> packages; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEdgeMobileAgentPackagesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.packages = model.packages;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Packages.
         */
        public Builder packages(java.util.List<Packages> packages) {
            this.packages = packages;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEdgeMobileAgentPackagesResponseBody build() {
            return new DescribeEdgeMobileAgentPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeMobileAgentPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeMobileAgentPackagesResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceClass")
        private String deviceClass;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("LicenseKeys")
        private java.util.List<String> licenseKeys;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("PackageSpec")
        private String packageSpec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Packages(Builder builder) {
            this.deviceClass = builder.deviceClass;
            this.expireDate = builder.expireDate;
            this.licenseKeys = builder.licenseKeys;
            this.packageId = builder.packageId;
            this.packageSpec = builder.packageSpec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return deviceClass
         */
        public String getDeviceClass() {
            return this.deviceClass;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return licenseKeys
         */
        public java.util.List<String> getLicenseKeys() {
            return this.licenseKeys;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageSpec
         */
        public String getPackageSpec() {
            return this.packageSpec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String deviceClass; 
            private String expireDate; 
            private java.util.List<String> licenseKeys; 
            private String packageId; 
            private String packageSpec; 
            private String status; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this.deviceClass = model.deviceClass;
                this.expireDate = model.expireDate;
                this.licenseKeys = model.licenseKeys;
                this.packageId = model.packageId;
                this.packageSpec = model.packageSpec;
                this.status = model.status;
            } 

            /**
             * DeviceClass.
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
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
             * LicenseKeys.
             */
            public Builder licenseKeys(java.util.List<String> licenseKeys) {
                this.licenseKeys = licenseKeys;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * PackageSpec.
             */
            public Builder packageSpec(String packageSpec) {
                this.packageSpec = packageSpec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
}
