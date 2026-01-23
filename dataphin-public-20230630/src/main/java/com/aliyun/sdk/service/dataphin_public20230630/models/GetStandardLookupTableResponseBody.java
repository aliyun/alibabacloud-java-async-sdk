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
 * {@link GetStandardLookupTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardLookupTableResponseBody</p>
 */
public class GetStandardLookupTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LookupTableInfo")
    private LookupTableInfo lookupTableInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStandardLookupTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.lookupTableInfo = builder.lookupTableInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardLookupTableResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return lookupTableInfo
     */
    public LookupTableInfo getLookupTableInfo() {
        return this.lookupTableInfo;
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
        private Integer httpStatusCode; 
        private LookupTableInfo lookupTableInfo; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStandardLookupTableResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.lookupTableInfo = model.lookupTableInfo;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * LookupTableInfo.
         */
        public Builder lookupTableInfo(LookupTableInfo lookupTableInfo) {
            this.lookupTableInfo = lookupTableInfo;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetStandardLookupTableResponseBody build() {
            return new GetStandardLookupTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardLookupTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardLookupTableResponseBody</p>
     */
    public static class DirectoryReference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        private DirectoryReference(Builder builder) {
            this.directory = builder.directory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryReference create() {
            return builder().build();
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        public static final class Builder {
            private String directory; 

            private Builder() {
            } 

            private Builder(DirectoryReference model) {
                this.directory = model.directory;
            } 

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            public DirectoryReference build() {
                return new DirectoryReference(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardLookupTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardLookupTableResponseBody</p>
     */
    public static class LookupTableValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LookupTableValueList(Builder builder) {
            this.description = builder.description;
            this.englishName = builder.englishName;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupTableValueList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String englishName; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(LookupTableValueList model) {
                this.description = model.description;
                this.englishName = model.englishName;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LookupTableValueList build() {
                return new LookupTableValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardLookupTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardLookupTableResponseBody</p>
     */
    public static class LookupTableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectoryReference")
        private DirectoryReference directoryReference;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("LookupTableValueList")
        private java.util.List<LookupTableValueList> lookupTableValueList;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        private LookupTableInfo(Builder builder) {
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.directoryReference = builder.directoryReference;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.lookupTableValueList = builder.lookupTableValueList;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupTableInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryReference
         */
        public DirectoryReference getDirectoryReference() {
            return this.directoryReference;
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
         * @return lookupTableValueList
         */
        public java.util.List<LookupTableValueList> getLookupTableValueList() {
            return this.lookupTableValueList;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        public static final class Builder {
            private String code; 
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private DirectoryReference directoryReference; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private java.util.List<LookupTableValueList> lookupTableValueList; 
            private String modifyTime; 
            private String name; 
            private String owner; 
            private String ownerName; 

            private Builder() {
            } 

            private Builder(LookupTableInfo model) {
                this.code = model.code;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.directoryReference = model.directoryReference;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.lookupTableValueList = model.lookupTableValueList;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DirectoryReference.
             */
            public Builder directoryReference(DirectoryReference directoryReference) {
                this.directoryReference = directoryReference;
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
             * LookupTableValueList.
             */
            public Builder lookupTableValueList(java.util.List<LookupTableValueList> lookupTableValueList) {
                this.lookupTableValueList = lookupTableValueList;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            public LookupTableInfo build() {
                return new LookupTableInfo(this);
            } 

        } 

    }
}
