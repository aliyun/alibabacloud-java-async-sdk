// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetAliasResponseBody} extends {@link TeaModel}
 *
 * <p>GetAliasResponseBody</p>
 */
public class GetAliasResponseBody extends TeaModel {
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @NameInMap("aliasName")
    private String aliasName;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("versionId")
    private String versionId;


    private GetAliasResponseBody(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliasResponseBody create() {
        return builder().build();
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
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
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String aliasName; 
        private String createdTime; 
        private String description; 
        private String lastModifiedTime; 
        private String versionId; 

        /**
         * <p>额外版本权重</p>
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * <p>别名名称</p>
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>创建时间</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>别名描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>上次更新时间</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>版本ID</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public GetAliasResponseBody build() {
            return new GetAliasResponseBody(this);
        } 

    } 

}
