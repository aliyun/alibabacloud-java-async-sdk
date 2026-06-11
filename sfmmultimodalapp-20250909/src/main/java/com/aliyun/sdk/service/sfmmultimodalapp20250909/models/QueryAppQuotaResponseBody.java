// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link QueryAppQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppQuotaResponseBody</p>
 */
public class QueryAppQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveLicenseCount")
    private Integer activeLicenseCount;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("LicenseCount")
    private Integer licenseCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsagePercent")
    private Double usagePercent;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryAppQuotaResponseBody(Builder builder) {
        this.activeLicenseCount = builder.activeLicenseCount;
        this.appId = builder.appId;
        this.licenseCount = builder.licenseCount;
        this.requestId = builder.requestId;
        this.usagePercent = builder.usagePercent;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeLicenseCount
     */
    public Integer getActiveLicenseCount() {
        return this.activeLicenseCount;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return licenseCount
     */
    public Integer getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usagePercent
     */
    public Double getUsagePercent() {
        return this.usagePercent;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Integer activeLicenseCount; 
        private String appId; 
        private Integer licenseCount; 
        private String requestId; 
        private Double usagePercent; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(QueryAppQuotaResponseBody model) {
            this.activeLicenseCount = model.activeLicenseCount;
            this.appId = model.appId;
            this.licenseCount = model.licenseCount;
            this.requestId = model.requestId;
            this.usagePercent = model.usagePercent;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * ActiveLicenseCount.
         */
        public Builder activeLicenseCount(Integer activeLicenseCount) {
            this.activeLicenseCount = activeLicenseCount;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * LicenseCount.
         */
        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82296D89-6895-574B-8AA1-64959957CB41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsagePercent.
         */
        public Builder usagePercent(Double usagePercent) {
            this.usagePercent = usagePercent;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public QueryAppQuotaResponseBody build() {
            return new QueryAppQuotaResponseBody(this);
        } 

    } 

}
