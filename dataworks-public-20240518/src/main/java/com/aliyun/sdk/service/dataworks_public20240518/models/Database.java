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
 * {@link Database} extends {@link TeaModel}
 *
 * <p>Database</p>
 */
public class Database extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("LocationUri")
    private String locationUri;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    private String parentMetaEntityId;

    private Database(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.locationUri = builder.locationUri;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.parentMetaEntityId = builder.parentMetaEntityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Database create() {
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
     * @return locationUri
     */
    public String getLocationUri() {
        return this.locationUri;
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

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String id; 
        private String locationUri; 
        private Long modifyTime; 
        private String name; 
        private String parentMetaEntityId; 

        private Builder() {
        } 

        private Builder(Database model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.id = model.id;
            this.locationUri = model.locationUri;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.parentMetaEntityId = model.parentMetaEntityId;
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
         * LocationUri.
         */
        public Builder locationUri(String locationUri) {
            this.locationUri = locationUri;
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

        public Database build() {
            return new Database(this);
        } 

    } 

}
