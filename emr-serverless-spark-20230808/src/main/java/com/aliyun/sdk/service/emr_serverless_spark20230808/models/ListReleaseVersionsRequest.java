// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private ListReleaseVersionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.releaseType = builder.releaseType;
        this.releaseVersion = builder.releaseVersion;
        this.releaseVersionStatus = builder.releaseVersionStatus;
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

    public static final class Builder extends Request.Builder<ListReleaseVersionsRequest, Builder> {
        private String regionId; 
        private String releaseType; 
        private String releaseVersion; 
        private String releaseVersionStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListReleaseVersionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.releaseType = request.releaseType;
            this.releaseVersion = request.releaseVersion;
            this.releaseVersionStatus = request.releaseVersionStatus;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the version.
         * <p>
         * 
         * Valid values:
         * 
         * *   stable
         * *   beta
         */
        public Builder releaseType(String releaseType) {
            this.putQueryParameter("releaseType", releaseType);
            this.releaseType = releaseType;
            return this;
        }

        /**
         * The version of Serverless Spark.
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putQueryParameter("releaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * The status of the version. Valid values:
         * <p>
         * 
         * Valid values:
         * 
         * *   ONLINE
         * *   OFFLINE
         */
        public Builder releaseVersionStatus(String releaseVersionStatus) {
            this.putQueryParameter("releaseVersionStatus", releaseVersionStatus);
            this.releaseVersionStatus = releaseVersionStatus;
            return this;
        }

        @Override
        public ListReleaseVersionsRequest build() {
            return new ListReleaseVersionsRequest(this);
        } 

    } 

}
