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
 * {@link DescribeAppsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppsRequest</p>
 */
public class DescribeAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    private java.util.List<String> appIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallationStatus")
    private String installationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MD5")
    private String mD5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAppsRequest(Builder builder) {
        super(builder);
        this.appIdList = builder.appIdList;
        this.appName = builder.appName;
        this.bizRegionId = builder.bizRegionId;
        this.installationStatus = builder.installationStatus;
        this.mD5 = builder.mD5;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIdList
     */
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return installationStatus
     */
    public String getInstallationStatus() {
        return this.installationStatus;
    }

    /**
     * @return mD5
     */
    public String getMD5() {
        return this.mD5;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAppsRequest, Builder> {
        private java.util.List<String> appIdList; 
        private String appName; 
        private String bizRegionId; 
        private String installationStatus; 
        private String mD5; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppsRequest request) {
            super(request);
            this.appIdList = request.appIdList;
            this.appName = request.appName;
            this.bizRegionId = request.bizRegionId;
            this.installationStatus = request.installationStatus;
            this.mD5 = request.mD5;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * <p>The IDs of the applications.</p>
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putQueryParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultAppName</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Region id.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The installation/uninstallation status of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>INSTALLFAILED: The application failed to be installed.</li>
         * <li>UNINSTALLING: The application is being uninstalled.</li>
         * <li>INSTALLING: The application is being installed.</li>
         * <li>UNINSTALLED: The application is uninstalled.</li>
         * <li>INSTALLED: The application is installed.</li>
         * <li>UNINSTALLFAILED: The application failed to be uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALLING</p>
         */
        public Builder installationStatus(String installationStatus) {
            this.putQueryParameter("InstallationStatus", installationStatus);
            this.installationStatus = installationStatus;
            return this;
        }

        /**
         * <p>The value of MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>THCIEH73KEK3334</p>
         */
        public Builder mD5(String mD5) {
            this.putQueryParameter("MD5", mD5);
            this.mD5 = mD5;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED: The application failed to be created.</li>
         * <li>NORMAL: The application is available.</li>
         * <li>CREATING: The application is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAppsRequest build() {
            return new DescribeAppsRequest(this);
        } 

    } 

}
