// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Category} extends {@link TeaModel}
 *
 * <p>Category</p>
 */
public class Category extends TeaModel {
    @NameInMap("bizId")
    @Validation(required = true)
    private String bizId;

    @NameInMap("creator")
    @Validation(required = true)
    private Long creator;

    @NameInMap("gmtCreated")
    @Validation(required = true)
    private String gmtCreated;

    @NameInMap("gmtModified")
    @Validation(required = true)
    private String gmtModified;

    @NameInMap("modifier")
    @Validation(required = true)
    private Long modifier;

    @NameInMap("name")
    @Validation(required = true, maxLength = 64, minLength = 1)
    private String name;

    @NameInMap("parentBizId")
    private String parentBizId;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private Category(Builder builder) {
        this.bizId = builder.bizId;
        this.creator = builder.creator;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.parentBizId = builder.parentBizId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Category create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
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
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentBizId
     */
    public String getParentBizId() {
        return this.parentBizId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String bizId; 
        private Long creator; 
        private String gmtCreated; 
        private String gmtModified; 
        private Long modifier; 
        private String name; 
        private String parentBizId; 
        private String type; 

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * parentBizId.
         */
        public Builder parentBizId(String parentBizId) {
            this.parentBizId = parentBizId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Category build() {
            return new Category(this);
        } 

    } 

}
