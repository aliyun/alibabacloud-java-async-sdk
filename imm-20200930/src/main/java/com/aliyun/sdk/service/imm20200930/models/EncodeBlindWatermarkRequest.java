// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncodeBlindWatermarkRequest} extends {@link RequestModel}
 *
 * <p>EncodeBlindWatermarkRequest</p>
 */
public class EncodeBlindWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageQuality")
    private Integer imageQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrengthLevel")
    private String strengthLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    private EncodeBlindWatermarkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.imageQuality = builder.imageQuality;
        this.projectName = builder.projectName;
        this.sourceURI = builder.sourceURI;
        this.strengthLevel = builder.strengthLevel;
        this.targetURI = builder.targetURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncodeBlindWatermarkRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return imageQuality
     */
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return strengthLevel
     */
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    public static final class Builder extends Request.Builder<EncodeBlindWatermarkRequest, Builder> {
        private String regionId; 
        private String content; 
        private Integer imageQuality; 
        private String projectName; 
        private String sourceURI; 
        private String strengthLevel; 
        private String targetURI; 

        private Builder() {
            super();
        } 

        private Builder(EncodeBlindWatermarkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.imageQuality = request.imageQuality;
            this.projectName = request.projectName;
            this.sourceURI = request.sourceURI;
            this.strengthLevel = request.strengthLevel;
            this.targetURI = request.targetURI;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ImageQuality.
         */
        public Builder imageQuality(Integer imageQuality) {
            this.putQueryParameter("ImageQuality", imageQuality);
            this.imageQuality = imageQuality;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * StrengthLevel.
         */
        public Builder strengthLevel(String strengthLevel) {
            this.putQueryParameter("StrengthLevel", strengthLevel);
            this.strengthLevel = strengthLevel;
            return this;
        }

        /**
         * TargetURI.
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        @Override
        public EncodeBlindWatermarkRequest build() {
            return new EncodeBlindWatermarkRequest(this);
        } 

    } 

}
