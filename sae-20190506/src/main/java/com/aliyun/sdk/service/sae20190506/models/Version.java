// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link Version} extends {@link TeaModel}
 *
 * <p>Version</p>
 */
public class Version extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    @com.aliyun.core.annotation.NameInMap("weight")
    private Double weight;

    private Version(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.image = builder.image;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.requestId = builder.requestId;
        this.versionId = builder.versionId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Version create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return weight
     */
    public Double getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String image; 
        private String lastModifiedTime; 
        private String requestId; 
        private String versionId; 
        private Double weight; 

        private Builder() {
        } 

        private Builder(Version model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.image = model.image;
            this.lastModifiedTime = model.lastModifiedTime;
            this.requestId = model.requestId;
            this.versionId = model.versionId;
            this.weight = model.weight;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * weight.
         */
        public Builder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Version build() {
            return new Version(this);
        } 

    } 

}
