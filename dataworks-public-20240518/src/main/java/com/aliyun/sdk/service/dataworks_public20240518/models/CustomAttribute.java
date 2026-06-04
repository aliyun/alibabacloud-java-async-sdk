// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CustomAttribute} extends {@link TeaModel}
 *
 * <p>CustomAttribute</p>
 */
public class CustomAttribute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DisplayEnabled")
    private Boolean displayEnabled;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("SearchFilterEnabled")
    private Boolean searchFilterEnabled;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("ValueEnums")
    private java.util.List<String> valueEnums;

    private CustomAttribute(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.displayEnabled = builder.displayEnabled;
        this.displayName = builder.displayName;
        this.entityTypes = builder.entityTypes;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.searchFilterEnabled = builder.searchFilterEnabled;
        this.type = builder.type;
        this.valueEnums = builder.valueEnums;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomAttribute create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return displayEnabled
     */
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return searchFilterEnabled
     */
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return valueEnums
     */
    public java.util.List<String> getValueEnums() {
        return this.valueEnums;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private Boolean displayEnabled; 
        private String displayName; 
        private java.util.List<String> entityTypes; 
        private String id; 
        private Long modifyTime; 
        private Boolean searchFilterEnabled; 
        private String type; 
        private java.util.List<String> valueEnums; 

        private Builder() {
        } 

        private Builder(CustomAttribute model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.displayEnabled = model.displayEnabled;
            this.displayName = model.displayName;
            this.entityTypes = model.entityTypes;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.searchFilterEnabled = model.searchFilterEnabled;
            this.type = model.type;
            this.valueEnums = model.valueEnums;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DisplayEnabled.
         */
        public Builder displayEnabled(Boolean displayEnabled) {
            this.displayEnabled = displayEnabled;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * EntityTypes.
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * SearchFilterEnabled.
         */
        public Builder searchFilterEnabled(Boolean searchFilterEnabled) {
            this.searchFilterEnabled = searchFilterEnabled;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * ValueEnums.
         */
        public Builder valueEnums(java.util.List<String> valueEnums) {
            this.valueEnums = valueEnums;
            return this;
        }

        public CustomAttribute build() {
            return new CustomAttribute(this);
        } 

    } 

}
