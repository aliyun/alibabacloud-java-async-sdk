// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListCloudAppsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAppsRequest</p>
 */
public class ListCloudAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatestVersionOnly")
    private Boolean latestVersionOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgLabel")
    private String pkgLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgType")
    private String pkgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCloudAppsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appVersion = builder.appVersion;
        this.endTime = builder.endTime;
        this.latestVersionOnly = builder.latestVersionOnly;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pkgLabel = builder.pkgLabel;
        this.pkgType = builder.pkgType;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return latestVersionOnly
     */
    public Boolean getLatestVersionOnly() {
        return this.latestVersionOnly;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pkgLabel
     */
    public String getPkgLabel() {
        return this.pkgLabel;
    }

    /**
     * @return pkgType
     */
    public String getPkgType() {
        return this.pkgType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCloudAppsRequest, Builder> {
        private String appId; 
        private String appName; 
        private String appVersion; 
        private String endTime; 
        private Boolean latestVersionOnly; 
        private Long pageNumber; 
        private Long pageSize; 
        private String pkgLabel; 
        private String pkgType; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAppsRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.appVersion = request.appVersion;
            this.endTime = request.endTime;
            this.latestVersionOnly = request.latestVersionOnly;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pkgLabel = request.pkgLabel;
            this.pkgType = request.pkgType;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the cloud application. This ID corresponds to a unique application package.</p>
         * 
         * <strong>example:</strong>
         * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Application name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aaa.bbb</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The time range filter parameter. Express it in ISO8601 standard format, using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T02:23:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Return only the latest submitted version of the application. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder latestVersionOnly(Boolean latestVersionOnly) {
            this.putQueryParameter("LatestVersionOnly", latestVersionOnly);
            this.latestVersionOnly = latestVersionOnly;
            return this;
        }

        /**
         * <p>The page number for the query list. The starting value is 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page for paged queries. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Valid values:</p>
         * <ol>
         * <li><p>Valid values:
         * a. hot
         * b. game
         * c. app</p>
         * </li>
         * <li><p>Special case:a. To list applications that have no tags, enter NULL.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder pkgLabel(String pkgLabel) {
            this.putQueryParameter("PkgLabel", pkgLabel);
            this.pkgLabel = pkgLabel;
            return this;
        }

        /**
         * <p>The package type. Valid values:</p>
         * <ol>
         * <li><p>android</p>
         * </li>
         * <li><p>win</p>
         * </li>
         * <li><p>android_appmarket</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder pkgType(String pkgType) {
            this.putQueryParameter("PkgType", pkgType);
            this.pkgType = pkgType;
            return this;
        }

        /**
         * <p>The time range filter parameter. Express it in ISO8601 standard format, using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-29T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The application upload status. Valid values:</p>
         * <ol>
         * <li><p>Success: The desired state, indicating success.</p>
         * </li>
         * <li><p>Failed: The desired state, indicating failure.</p>
         * </li>
         * <li><p>Created</p>
         * </li>
         * <li><p>Doing</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCloudAppsRequest build() {
            return new ListCloudAppsRequest(this);
        } 

    } 

}
