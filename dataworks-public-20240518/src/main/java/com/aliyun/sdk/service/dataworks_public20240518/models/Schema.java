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
 * {@link Schema} extends {@link TeaModel}
 *
 * <p>Schema</p>
 */
public class Schema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    private String parentMetaEntityId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Schema(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.parentMetaEntityId = builder.parentMetaEntityId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schema create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentMetaEntityId
     */
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String id; 
        private Long modifyTime; 
        private String name; 
        private String parentMetaEntityId; 
        private String type; 

        private Builder() {
        } 

        private Builder(Schema model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.parentMetaEntityId = model.parentMetaEntityId;
            this.type = model.type;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentMetaEntityId.
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Schema build() {
            return new Schema(this);
        } 

    } 

}
