// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicTemplateCache} extends {@link TeaModel}
 *
 * <p>PublicTemplateCache</p>
 */
public class PublicTemplateCache extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("imageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.NameInMap("imageSizeMB")
    private Integer imageSizeMB;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("readyTime")
    private String readyTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private PublicTemplateCache(Builder builder) {
        this.createdTime = builder.createdTime;
        this.imageDigest = builder.imageDigest;
        this.imageSizeMB = builder.imageSizeMB;
        this.progress = builder.progress;
        this.readyTime = builder.readyTime;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateCache create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageSizeMB
     */
    public Integer getImageSizeMB() {
        return this.imageSizeMB;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return readyTime
     */
    public String getReadyTime() {
        return this.readyTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder {
        private String createdTime; 
        private String imageDigest; 
        private Integer imageSizeMB; 
        private Integer progress; 
        private String readyTime; 
        private String status; 
        private String statusReason; 
        private String teamID; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(PublicTemplateCache model) {
            this.createdTime = model.createdTime;
            this.imageDigest = model.imageDigest;
            this.imageSizeMB = model.imageSizeMB;
            this.progress = model.progress;
            this.readyTime = model.readyTime;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.teamID = model.teamID;
            this.templateID = model.templateID;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * imageDigest.
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * imageSizeMB.
         */
        public Builder imageSizeMB(Integer imageSizeMB) {
            this.imageSizeMB = imageSizeMB;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * readyTime.
         */
        public Builder readyTime(String readyTime) {
            this.readyTime = readyTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public PublicTemplateCache build() {
            return new PublicTemplateCache(this);
        } 

    } 

}
