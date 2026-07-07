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
 * {@link DescribeEdgeMobileAgentPackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeMobileAgentPackagesRequest</p>
 */
public class DescribeEdgeMobileAgentPackagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceClass")
    private String deviceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseKeys")
    private String licenseKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private String packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeEdgeMobileAgentPackagesRequest(Builder builder) {
        super(builder);
        this.deviceClass = builder.deviceClass;
        this.licenseKeys = builder.licenseKeys;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.packageIds = builder.packageIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMobileAgentPackagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceClass
     */
    public String getDeviceClass() {
        return this.deviceClass;
    }

    /**
     * @return licenseKeys
     */
    public String getLicenseKeys() {
        return this.licenseKeys;
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
     * @return packageIds
     */
    public String getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeMobileAgentPackagesRequest, Builder> {
        private String deviceClass; 
        private String licenseKeys; 
        private Integer maxResults; 
        private String nextToken; 
        private String packageIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeMobileAgentPackagesRequest request) {
            super(request);
            this.deviceClass = request.deviceClass;
            this.licenseKeys = request.licenseKeys;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.packageIds = request.packageIds;
            this.status = request.status;
        } 

        /**
         * DeviceClass.
         */
        public Builder deviceClass(String deviceClass) {
            this.putQueryParameter("DeviceClass", deviceClass);
            this.deviceClass = deviceClass;
            return this;
        }

        /**
         * LicenseKeys.
         */
        public Builder licenseKeys(String licenseKeys) {
            this.putQueryParameter("LicenseKeys", licenseKeys);
            this.licenseKeys = licenseKeys;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(String packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeEdgeMobileAgentPackagesRequest build() {
            return new DescribeEdgeMobileAgentPackagesRequest(this);
        } 

    } 

}
