// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
 */
public class ListTextbookAssistantBookDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListTextbookAssistantBookDirectoriesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantBookDirectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTextbookAssistantBookDirectoriesResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0A5E9849-A2F0-551D-A7D8-1A8118557BAB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTextbookAssistantBookDirectoriesResponseBody build() {
            return new ListTextbookAssistantBookDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class Topic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("labelName")
        private String labelName;

        private Topic(Builder builder) {
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topic create() {
            return builder().build();
        }

        /**
         * @return labelId
         */
        public String getLabelId() {
            return this.labelId;
        }

        /**
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        public static final class Builder {
            private String labelId; 
            private String labelName; 

            private Builder() {
            } 

            private Builder(Topic model) {
                this.labelId = model.labelId;
                this.labelName = model.labelName;
            } 

            /**
             * labelId.
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * labelName.
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            public Topic build() {
                return new Topic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class DirectoryTree extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("directoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("topic")
        private java.util.List<Topic> topic;

        private DirectoryTree(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryTree create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return topic
         */
        public java.util.List<Topic> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String directoryId; 
            private String directoryName; 
            private java.util.List<Topic> topic; 

            private Builder() {
            } 

            private Builder(DirectoryTree model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topic = model.topic;
            } 

            /**
             * directoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * directoryName.
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * topic.
             */
            public Builder topic(java.util.List<Topic> topic) {
                this.topic = topic;
                return this;
            }

            public DirectoryTree build() {
                return new DirectoryTree(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class EditionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bookId")
        private String bookId;

        @com.aliyun.core.annotation.NameInMap("bookVolume")
        private String bookVolume;

        @com.aliyun.core.annotation.NameInMap("edition")
        private String edition;

        @com.aliyun.core.annotation.NameInMap("grade")
        private String grade;

        @com.aliyun.core.annotation.NameInMap("impression")
        private String impression;

        @com.aliyun.core.annotation.NameInMap("isbn")
        private String isbn;

        @com.aliyun.core.annotation.NameInMap("publisher")
        private String publisher;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private EditionInfo(Builder builder) {
            this.bookId = builder.bookId;
            this.bookVolume = builder.bookVolume;
            this.edition = builder.edition;
            this.grade = builder.grade;
            this.impression = builder.impression;
            this.isbn = builder.isbn;
            this.publisher = builder.publisher;
            this.subject = builder.subject;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditionInfo create() {
            return builder().build();
        }

        /**
         * @return bookId
         */
        public String getBookId() {
            return this.bookId;
        }

        /**
         * @return bookVolume
         */
        public String getBookVolume() {
            return this.bookVolume;
        }

        /**
         * @return edition
         */
        public String getEdition() {
            return this.edition;
        }

        /**
         * @return grade
         */
        public String getGrade() {
            return this.grade;
        }

        /**
         * @return impression
         */
        public String getImpression() {
            return this.impression;
        }

        /**
         * @return isbn
         */
        public String getIsbn() {
            return this.isbn;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String bookId; 
            private String bookVolume; 
            private String edition; 
            private String grade; 
            private String impression; 
            private String isbn; 
            private String publisher; 
            private String subject; 
            private String version; 

            private Builder() {
            } 

            private Builder(EditionInfo model) {
                this.bookId = model.bookId;
                this.bookVolume = model.bookVolume;
                this.edition = model.edition;
                this.grade = model.grade;
                this.impression = model.impression;
                this.isbn = model.isbn;
                this.publisher = model.publisher;
                this.subject = model.subject;
                this.version = model.version;
            } 

            /**
             * bookId.
             */
            public Builder bookId(String bookId) {
                this.bookId = bookId;
                return this;
            }

            /**
             * bookVolume.
             */
            public Builder bookVolume(String bookVolume) {
                this.bookVolume = bookVolume;
                return this;
            }

            /**
             * edition.
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * grade.
             */
            public Builder grade(String grade) {
                this.grade = grade;
                return this;
            }

            /**
             * impression.
             */
            public Builder impression(String impression) {
                this.impression = impression;
                return this;
            }

            /**
             * isbn.
             */
            public Builder isbn(String isbn) {
                this.isbn = isbn;
                return this;
            }

            /**
             * publisher.
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public EditionInfo build() {
                return new EditionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directoryTree")
        private java.util.List<DirectoryTree> directoryTree;

        @com.aliyun.core.annotation.NameInMap("editionInfo")
        private EditionInfo editionInfo;

        private Data(Builder builder) {
            this.directoryTree = builder.directoryTree;
            this.editionInfo = builder.editionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return directoryTree
         */
        public java.util.List<DirectoryTree> getDirectoryTree() {
            return this.directoryTree;
        }

        /**
         * @return editionInfo
         */
        public EditionInfo getEditionInfo() {
            return this.editionInfo;
        }

        public static final class Builder {
            private java.util.List<DirectoryTree> directoryTree; 
            private EditionInfo editionInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.directoryTree = model.directoryTree;
                this.editionInfo = model.editionInfo;
            } 

            /**
             * directoryTree.
             */
            public Builder directoryTree(java.util.List<DirectoryTree> directoryTree) {
                this.directoryTree = directoryTree;
                return this;
            }

            /**
             * editionInfo.
             */
            public Builder editionInfo(EditionInfo editionInfo) {
                this.editionInfo = editionInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
