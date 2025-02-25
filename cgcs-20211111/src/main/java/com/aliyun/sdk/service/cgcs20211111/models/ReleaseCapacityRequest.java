// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseCapacityRequest} extends {@link RequestModel}
 *
 * <p>ReleaseCapacityRequest</p>
 */
public class ReleaseCapacityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistrictId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String districtId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectReleaseSessionCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer expectReleaseSessionCapacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private ReleaseCapacityRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.districtId = builder.districtId;
        this.expectReleaseSessionCapacity = builder.expectReleaseSessionCapacity;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseCapacityRequest create() {
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
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return districtId
     */
    public String getDistrictId() {
        return this.districtId;
    }

    /**
     * @return expectReleaseSessionCapacity
     */
    public Integer getExpectReleaseSessionCapacity() {
        return this.expectReleaseSessionCapacity;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ReleaseCapacityRequest, Builder> {
        private String appId; 
        private String appVersion; 
        private String districtId; 
        private Integer expectReleaseSessionCapacity; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseCapacityRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.districtId = request.districtId;
            this.expectReleaseSessionCapacity = request.expectReleaseSessionCapacity;
            this.projectId = request.projectId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * DistrictId.
         */
        public Builder districtId(String districtId) {
            this.putBodyParameter("DistrictId", districtId);
            this.districtId = districtId;
            return this;
        }

        /**
         * ExpectReleaseSessionCapacity.
         */
        public Builder expectReleaseSessionCapacity(Integer expectReleaseSessionCapacity) {
            this.putBodyParameter("ExpectReleaseSessionCapacity", expectReleaseSessionCapacity);
            this.expectReleaseSessionCapacity = expectReleaseSessionCapacity;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ReleaseCapacityRequest build() {
            return new ReleaseCapacityRequest(this);
        } 

    } 

}
