// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishServiceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>PublishServiceVersionResponseBody</p>
 */
public class PublishServiceVersionResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("versionId")
    private String versionId;

    private PublishServiceVersionResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishServiceVersionResponseBody create() {
        return builder().build();
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
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String lastModifiedTime; 
        private String versionId; 

        /**
         * 创建时间
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * 版本描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 上次更新时间
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * 版本ID
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public PublishServiceVersionResponseBody build() {
            return new PublishServiceVersionResponseBody(this);
        } 

    } 

}
