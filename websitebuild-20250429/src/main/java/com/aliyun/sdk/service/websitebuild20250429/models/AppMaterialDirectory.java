// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppMaterialDirectory} extends {@link TeaModel}
 *
 * <p>AppMaterialDirectory</p>
 */
public class AppMaterialDirectory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List<AppMaterialDirectory> children;

    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SortNum")
    private String sortNum;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AppMaterialDirectory(Builder builder) {
        this.bizId = builder.bizId;
        this.children = builder.children;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
        this.sortNum = builder.sortNum;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppMaterialDirectory create() {
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
     * @return children
     */
    public java.util.List<AppMaterialDirectory> getChildren() {
        return this.children;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sortNum
     */
    public String getSortNum() {
        return this.sortNum;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String bizId; 
        private java.util.List<AppMaterialDirectory> children; 
        private String directoryId; 
        private String name; 
        private String sortNum; 
        private String type; 

        private Builder() {
        } 

        private Builder(AppMaterialDirectory model) {
            this.bizId = model.bizId;
            this.children = model.children;
            this.directoryId = model.directoryId;
            this.name = model.name;
            this.sortNum = model.sortNum;
            this.type = model.type;
        } 

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250814102215000001</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The list of subfolders.</p>
         */
        public Builder children(java.util.List<AppMaterialDirectory> children) {
            this.children = children;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20260206134746000001-system</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>图片管理</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The sort number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortNum(String sortNum) {
            this.sortNum = sortNum;
            return this;
        }

        /**
         * <p>The folder type.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AppMaterialDirectory build() {
            return new AppMaterialDirectory(this);
        } 

    } 

}
