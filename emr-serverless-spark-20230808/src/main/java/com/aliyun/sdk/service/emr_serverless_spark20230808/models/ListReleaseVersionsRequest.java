// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListReleaseVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListReleaseVersionsRequest</p>
 */
public class ListReleaseVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseType")
    private String releaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseVersionStatus")
    private String releaseVersionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceFilter")
    private String serviceFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ListReleaseVersionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.releaseType = builder.releaseType;
        this.releaseVersion = builder.releaseVersion;
        this.releaseVersionStatus = builder.releaseVersionStatus;
        this.serviceFilter = builder.serviceFilter;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReleaseVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseType
     */
    public String getReleaseType() {
        return this.releaseType;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return releaseVersionStatus
     */
    public String getReleaseVersionStatus() {
        return this.releaseVersionStatus;
    }

    /**
     * @return serviceFilter
     */
    public String getServiceFilter() {
        return this.serviceFilter;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListReleaseVersionsRequest, Builder> {
        private String regionId; 
        private String releaseType; 
        private String releaseVersion; 
        private String releaseVersionStatus; 
        private String serviceFilter; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListReleaseVersionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.releaseType = request.releaseType;
            this.releaseVersion = request.releaseVersion;
            this.releaseVersionStatus = request.releaseVersionStatus;
            this.serviceFilter = request.serviceFilter;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the version.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>stable</li>
         * <li>Beta</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
        public Builder releaseType(String releaseType) {
            this.putQueryParameter("releaseType", releaseType);
            this.releaseType = releaseType;
            return this;
        }

        /**
         * <p>The version of EMR Serverless Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-2.1 (Spark 3.3.1, Scala 2.12, Java Runtime)</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("releaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>The status of the version.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ONLINE</li>
         * <li>OFFLINE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        public Builder releaseVersionStatus(String releaseVersionStatus) {
            this.putQueryParameter("releaseVersionStatus", releaseVersionStatus);
            this.releaseVersionStatus = releaseVersionStatus;
            return this;
        }

        /**
         * serviceFilter.
         */
        public Builder serviceFilter(String serviceFilter) {
            this.putQueryParameter("serviceFilter", serviceFilter);
            this.serviceFilter = serviceFilter;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListReleaseVersionsRequest build() {
            return new ListReleaseVersionsRequest(this);
        } 

    } 

}
