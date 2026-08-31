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
 * {@link ListAssetDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetDirectoriesResponseBody</p>
 */
public class ListAssetDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAssetDirectoriesResponseBody(Builder builder) {
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

    public static ListAssetDirectoriesResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAssetDirectoriesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * Data.
         */
        public Builder data(Data data) {
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

        public ListAssetDirectoriesResponseBody build() {
            return new ListAssetDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetDirectoriesResponseBody</p>
     */
    public static class Modifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Modifier(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modifier create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Modifier model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Modifier build() {
                return new Modifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetDirectoriesResponseBody</p>
     */
    public static class DirectoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryDescription")
        private String directoryDescription;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("FullPath")
        private String fullPath;

        @com.aliyun.core.annotation.NameInMap("FullPathIds")
        private java.util.List<Long> fullPathIds;

        @com.aliyun.core.annotation.NameInMap("FullPathNames")
        private java.util.List<String> fullPathNames;

        @com.aliyun.core.annotation.NameInMap("HasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private Modifier modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ParentDirectoryId")
        private Long parentDirectoryId;

        private DirectoryList(Builder builder) {
            this.directoryDescription = builder.directoryDescription;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.fullPath = builder.fullPath;
            this.fullPathIds = builder.fullPathIds;
            this.fullPathNames = builder.fullPathNames;
            this.hasChildren = builder.hasChildren;
            this.level = builder.level;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.parentDirectoryId = builder.parentDirectoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryList create() {
            return builder().build();
        }

        /**
         * @return directoryDescription
         */
        public String getDirectoryDescription() {
            return this.directoryDescription;
        }

        /**
         * @return directoryId
         */
        public Long getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return fullPath
         */
        public String getFullPath() {
            return this.fullPath;
        }

        /**
         * @return fullPathIds
         */
        public java.util.List<Long> getFullPathIds() {
            return this.fullPathIds;
        }

        /**
         * @return fullPathNames
         */
        public java.util.List<String> getFullPathNames() {
            return this.fullPathNames;
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return modifier
         */
        public Modifier getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return parentDirectoryId
         */
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public static final class Builder {
            private String directoryDescription; 
            private Long directoryId; 
            private String directoryName; 
            private String fullPath; 
            private java.util.List<Long> fullPathIds; 
            private java.util.List<String> fullPathNames; 
            private Boolean hasChildren; 
            private Integer level; 
            private Modifier modifier; 
            private String modifyTime; 
            private Long parentDirectoryId; 

            private Builder() {
            } 

            private Builder(DirectoryList model) {
                this.directoryDescription = model.directoryDescription;
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.fullPath = model.fullPath;
                this.fullPathIds = model.fullPathIds;
                this.fullPathNames = model.fullPathNames;
                this.hasChildren = model.hasChildren;
                this.level = model.level;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.parentDirectoryId = model.parentDirectoryId;
            } 

            /**
             * DirectoryDescription.
             */
            public Builder directoryDescription(String directoryDescription) {
                this.directoryDescription = directoryDescription;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DirectoryName.
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * FullPath.
             */
            public Builder fullPath(String fullPath) {
                this.fullPath = fullPath;
                return this;
            }

            /**
             * FullPathIds.
             */
            public Builder fullPathIds(java.util.List<Long> fullPathIds) {
                this.fullPathIds = fullPathIds;
                return this;
            }

            /**
             * FullPathNames.
             */
            public Builder fullPathNames(java.util.List<String> fullPathNames) {
                this.fullPathNames = fullPathNames;
                return this;
            }

            /**
             * HasChildren.
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
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
             * ParentDirectoryId.
             */
            public Builder parentDirectoryId(Long parentDirectoryId) {
                this.parentDirectoryId = parentDirectoryId;
                return this;
            }

            public DirectoryList build() {
                return new DirectoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetDirectoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryList")
        private java.util.List<DirectoryList> directoryList;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.directoryList = builder.directoryList;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return directoryList
         */
        public java.util.List<DirectoryList> getDirectoryList() {
            return this.directoryList;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DirectoryList> directoryList; 
            private Long topicId; 
            private String topicName; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.directoryList = model.directoryList;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
                this.totalCount = model.totalCount;
            } 

            /**
             * DirectoryList.
             */
            public Builder directoryList(java.util.List<DirectoryList> directoryList) {
                this.directoryList = directoryList;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
