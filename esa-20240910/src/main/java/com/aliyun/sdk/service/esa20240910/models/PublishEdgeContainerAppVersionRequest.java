// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < String > regions;

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
    public java.util.List < String > getRegions() {
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
        private java.util.List < String > regions; 
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
         * FullRelease.
         */
        public Builder fullRelease(Boolean fullRelease) {
            this.putQueryParameter("FullRelease", fullRelease);
            this.fullRelease = fullRelease;
            return this;
        }

        /**
         * Percentage.
         */
        public Builder percentage(Integer percentage) {
            this.putBodyParameter("Percentage", percentage);
            this.percentage = percentage;
            return this;
        }

        /**
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
         * PublishType.
         */
        public Builder publishType(String publishType) {
            this.putQueryParameter("PublishType", publishType);
            this.publishType = publishType;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List < String > regions) {
            String regionsShrink = shrink(regions, "Regions", "json");
            this.putQueryParameter("Regions", regionsShrink);
            this.regions = regions;
            return this;
        }

        /**
         * Remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
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
