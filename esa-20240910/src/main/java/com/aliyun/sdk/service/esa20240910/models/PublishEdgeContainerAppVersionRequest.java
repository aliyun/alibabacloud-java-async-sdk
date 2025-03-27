// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PublishEdgeContainerAppVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishEdgeContainerAppVersionRequest</p>
 */
public class PublishEdgeContainerAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullRelease")
    private Boolean fullRelease;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Percentage")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer percentage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publishEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishType")
    private String publishType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<String> regions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String remarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String versionId;

    private PublishEdgeContainerAppVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.fullRelease = builder.fullRelease;
        this.percentage = builder.percentage;
        this.publishEnv = builder.publishEnv;
        this.publishType = builder.publishType;
        this.regions = builder.regions;
        this.remarks = builder.remarks;
        this.startTime = builder.startTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishEdgeContainerAppVersionRequest create() {
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
     * @return fullRelease
     */
    public Boolean getFullRelease() {
        return this.fullRelease;
    }

    /**
     * @return percentage
     */
    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * @return publishEnv
     */
    public String getPublishEnv() {
        return this.publishEnv;
    }

    /**
     * @return publishType
     */
    public String getPublishType() {
        return this.publishType;
    }

    /**
     * @return regions
     */
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<PublishEdgeContainerAppVersionRequest, Builder> {
        private String appId; 
        private Boolean fullRelease; 
        private Integer percentage; 
        private String publishEnv; 
        private String publishType; 
        private java.util.List<String> regions; 
        private String remarks; 
        private String startTime; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(PublishEdgeContainerAppVersionRequest request) {
            super(request);
            this.appId = request.appId;
            this.fullRelease = request.fullRelease;
            this.percentage = request.percentage;
            this.publishEnv = request.publishEnv;
            this.publishType = request.publishType;
            this.regions = request.regions;
            this.remarks = request.remarks;
            this.startTime = request.startTime;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to fully release the version. This parameter takes effect only when PublishType is set to region.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fullRelease(Boolean fullRelease) {
            this.putQueryParameter("FullRelease", fullRelease);
            this.fullRelease = fullRelease;
            return this;
        }

        /**
         * <p>The release percentage. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder percentage(Integer percentage) {
            this.putBodyParameter("Percentage", percentage);
            this.percentage = percentage;
            return this;
        }

        /**
         * <p>The environment to which you want to release the version. Valid values:</p>
         * <ul>
         * <li>prod: the production environment.</li>
         * <li>staging: the staging environment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder publishEnv(String publishEnv) {
            this.putBodyParameter("PublishEnv", publishEnv);
            this.publishEnv = publishEnv;
            return this;
        }

        /**
         * <p>Specifies how the version is released. Valid values:</p>
         * <ul>
         * <li>percentage: releases the version by percentage.</li>
         * <li>region: releases the version by region.</li>
         * </ul>
         * <p>If you do not specify this parameter, the version is released by percentage by default.</p>
         * 
         * <strong>example:</strong>
         * <p>percentage</p>
         */
        public Builder publishType(String publishType) {
            this.putQueryParameter("PublishType", publishType);
            this.publishType = publishType;
            return this;
        }

        /**
         * <p>The regions to which the version is released.</p>
         */
        public Builder regions(java.util.List<String> regions) {
            String regionsShrink = shrink(regions, "Regions", "json");
            this.putQueryParameter("Regions", regionsShrink);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The remarks. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>test publish app</p>
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * <p>The time when the application version starts to be released. If you do not specify this parameter, the current time is used by default.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-05T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The version ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-87962637161651****</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public PublishEdgeContainerAppVersionRequest build() {
            return new PublishEdgeContainerAppVersionRequest(this);
        } 

    } 

}
