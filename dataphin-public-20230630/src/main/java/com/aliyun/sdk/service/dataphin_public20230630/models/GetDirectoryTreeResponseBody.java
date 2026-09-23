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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDirectoryTreeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code. OK indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Directory tree information. Returns the directory tree with all edge information, traversed level by level from the root node.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
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

            private Builder() {
            } 

            private Builder(Children model) {
                this.categoryType = model.categoryType;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dataCellId = model.dataCellId;
                this.dirName = model.dirName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.name = model.name;
                this.projectId = model.projectId;
                this.stringId = model.stringId;
                this.type = model.type;
            } 

            /**
             * <p>Directory type.</p>
             * 
             * <strong>example:</strong>
             * <p>codeManage</p>
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>Creator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000907</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Creator name.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>Data cell ID.</p>
             * 
             * <strong>example:</strong>
             * <p>41342</p>
             */
            public Builder dataCellId(Long dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * <p>Directory path. Valid only for file or resource nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * <p>Creation time. Empty for non-entity object nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-01 18:08:17</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time. Empty for non-entity object nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-01 18:08:17</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Last modifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000907</p>
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>Last modifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * <p>Display name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>代码管理</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7081229106458752</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Directory string ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder stringId(String stringId) {
                this.stringId = stringId;
                return this;
            }

            /**
             * <p>Object type.</p>
             * 
             * <strong>example:</strong>
             * <p>codeManage</p>
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

            private Builder() {
            } 

            private Builder(Parent model) {
                this.categoryType = model.categoryType;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dataCellId = model.dataCellId;
                this.dirName = model.dirName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.name = model.name;
                this.projectId = model.projectId;
                this.stringId = model.stringId;
                this.type = model.type;
            } 

            /**
             * <p>Directory type.</p>
             * 
             * <strong>example:</strong>
             * <p>codeManage</p>
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>Creator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000907</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Creator name.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>Data cell ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3213</p>
             */
            public Builder dataCellId(Long dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * <p>Directory path. Valid only for file or resource nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * <p>Creation time. Empty for non-entity object nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-01 18:08:17</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time. Empty for non-entity object nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-01 18:08:17</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Last modifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300000907</p>
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>Last modifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * <p>Display name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>代码管理</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7081229106458752</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Directory string ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder stringId(String stringId) {
                this.stringId = stringId;
                return this;
            }

            /**
             * <p>Object type.</p>
             * 
             * <strong>example:</strong>
             * <p>codeManage</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.children = model.children;
                this.parent = model.parent;
            } 

            /**
             * <p>Child node.</p>
             */
            public Builder children(Children children) {
                this.children = children;
                return this;
            }

            /**
             * <p>Parent node.</p>
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
