// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link Artifact} extends {@link TeaModel}
 *
 * <p>Artifact</p>
 */
public class Artifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("catagoryBizId")
    private String catagoryBizId;

    @com.aliyun.core.annotation.NameInMap("creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("credential")
    private Credential credential;

    @com.aliyun.core.annotation.NameInMap("fullPath")
    private java.util.List<String> fullPath;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private Artifact(Builder builder) {
        this.bizId = builder.bizId;
        this.catagoryBizId = builder.catagoryBizId;
        this.creator = builder.creator;
        this.credential = builder.credential;
        this.fullPath = builder.fullPath;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.location = builder.location;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Artifact create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return catagoryBizId
     */
    public String getCatagoryBizId() {
        return this.catagoryBizId;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return credential
     */
    public Credential getCredential() {
        return this.credential;
    }

    /**
     * @return fullPath
     */
    public java.util.List<String> getFullPath() {
        return this.fullPath;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String bizId; 
        private String catagoryBizId; 
        private Long creator; 
        private Credential credential; 
        private java.util.List<String> fullPath; 
        private String gmtCreated; 
        private String gmtModified; 
        private String location; 
        private Long modifier; 
        private String modifierName; 
        private String name; 

        private Builder() {
        } 

        private Builder(Artifact model) {
            this.bizId = model.bizId;
            this.catagoryBizId = model.catagoryBizId;
            this.creator = model.creator;
            this.credential = model.credential;
            this.fullPath = model.fullPath;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.location = model.location;
            this.modifier = model.modifier;
            this.modifierName = model.modifierName;
            this.name = model.name;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * catagoryBizId.
         */
        public Builder catagoryBizId(String catagoryBizId) {
            this.catagoryBizId = catagoryBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * credential.
         */
        public Builder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        /**
         * fullPath.
         */
        public Builder fullPath(java.util.List<String> fullPath) {
            this.fullPath = fullPath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Artifact build() {
            return new Artifact(this);
        } 

    } 

}
