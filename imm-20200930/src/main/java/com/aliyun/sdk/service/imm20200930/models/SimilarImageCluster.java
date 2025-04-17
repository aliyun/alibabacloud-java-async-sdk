// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SimilarImageCluster} extends {@link TeaModel}
 *
 * <p>SimilarImageCluster</p>
 */
public class SimilarImageCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<SimilarImage> files;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private SimilarImageCluster(Builder builder) {
        this.createTime = builder.createTime;
        this.customLabels = builder.customLabels;
        this.files = builder.files;
        this.objectId = builder.objectId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimilarImageCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return files
     */
    public java.util.List<SimilarImage> getFiles() {
        return this.files;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private java.util.Map<String, ?> customLabels; 
        private java.util.List<SimilarImage> files; 
        private String objectId; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(SimilarImageCluster model) {
            this.createTime = model.createTime;
            this.customLabels = model.customLabels;
            this.files = model.files;
            this.objectId = model.objectId;
            this.updateTime = model.updateTime;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List<SimilarImage> files) {
            this.files = files;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public SimilarImageCluster build() {
            return new SimilarImageCluster(this);
        } 

    } 

}
