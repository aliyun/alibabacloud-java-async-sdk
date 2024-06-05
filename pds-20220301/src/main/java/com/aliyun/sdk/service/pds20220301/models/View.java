// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link View} extends {@link TeaModel}
 *
 * <p>View</p>
 */
public class View extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ex_fields_info")
    private java.util.Map < String, ? > exFieldsInfo;

    @com.aliyun.core.annotation.NameInMap("file_count")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("view_id")
    private String viewId;

    private View(Builder builder) {
        this.category = builder.category;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.exFieldsInfo = builder.exFieldsInfo;
        this.fileCount = builder.fileCount;
        this.name = builder.name;
        this.owner = builder.owner;
        this.updatedAt = builder.updatedAt;
        this.viewId = builder.viewId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static View create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exFieldsInfo
     */
    public java.util.Map < String, ? > getExFieldsInfo() {
        return this.exFieldsInfo;
    }

    /**
     * @return fileCount
     */
    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return viewId
     */
    public String getViewId() {
        return this.viewId;
    }

    public static final class Builder {
        private String category; 
        private String createdAt; 
        private String description; 
        private java.util.Map < String, ? > exFieldsInfo; 
        private Long fileCount; 
        private String name; 
        private String owner; 
        private String updatedAt; 
        private String viewId; 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * ex_fields_info.
         */
        public Builder exFieldsInfo(java.util.Map < String, ? > exFieldsInfo) {
            this.exFieldsInfo = exFieldsInfo;
            return this;
        }

        /**
         * file_count.
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
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
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * view_id.
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        public View build() {
            return new View(this);
        } 

    } 

}
