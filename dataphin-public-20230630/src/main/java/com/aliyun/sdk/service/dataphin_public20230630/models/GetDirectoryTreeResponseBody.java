// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDirectoryTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryTreeResponseBody</p>
 */
public class GetDirectoryTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDirectoryTreeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryTreeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDirectoryTreeResponseBody build() {
            return new GetDirectoryTreeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDirectoryTreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryTreeResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private String categoryType;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private Long dataCellId;

        @com.aliyun.core.annotation.NameInMap("DirName")
        private String dirName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("StringId")
        private String stringId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Children(Builder builder) {
            this.categoryType = builder.categoryType;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dataCellId = builder.dataCellId;
            this.dirName = builder.dirName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.stringId = builder.stringId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return categoryType
         */
        public String getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return dataCellId
         */
        public Long getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return dirName
         */
        public String getDirName() {
            return this.dirName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return stringId
         */
        public String getStringId() {
            return this.stringId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String categoryType; 
            private String creator; 
            private String creatorName; 
            private Long dataCellId; 
            private String dirName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private String name; 
            private Long projectId; 
            private String stringId; 
            private String type; 

            /**
             * CategoryType.
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DataCellId.
             */
            public Builder dataCellId(Long dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * DirName.
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * StringId.
             */
            public Builder stringId(String stringId) {
                this.stringId = stringId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectoryTreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryTreeResponseBody</p>
     */
    public static class Parent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private String categoryType;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private Long dataCellId;

        @com.aliyun.core.annotation.NameInMap("DirName")
        private String dirName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("StringId")
        private String stringId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Parent(Builder builder) {
            this.categoryType = builder.categoryType;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dataCellId = builder.dataCellId;
            this.dirName = builder.dirName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.stringId = builder.stringId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parent create() {
            return builder().build();
        }

        /**
         * @return categoryType
         */
        public String getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return dataCellId
         */
        public Long getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return dirName
         */
        public String getDirName() {
            return this.dirName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return stringId
         */
        public String getStringId() {
            return this.stringId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String categoryType; 
            private String creator; 
            private String creatorName; 
            private Long dataCellId; 
            private String dirName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private String name; 
            private Long projectId; 
            private String stringId; 
            private String type; 

            /**
             * CategoryType.
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DataCellId.
             */
            public Builder dataCellId(Long dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * DirName.
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * StringId.
             */
            public Builder stringId(String stringId) {
                this.stringId = stringId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Parent build() {
                return new Parent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectoryTreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryTreeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private Children children;

        @com.aliyun.core.annotation.NameInMap("Parent")
        private Parent parent;

        private Data(Builder builder) {
            this.children = builder.children;
            this.parent = builder.parent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public Children getChildren() {
            return this.children;
        }

        /**
         * @return parent
         */
        public Parent getParent() {
            return this.parent;
        }

        public static final class Builder {
            private Children children; 
            private Parent parent; 

            /**
             * Children.
             */
            public Builder children(Children children) {
                this.children = children;
                return this;
            }

            /**
             * Parent.
             */
            public Builder parent(Parent parent) {
                this.parent = parent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
