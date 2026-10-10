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
         * <p>The data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>B_USER_NOT_FOUND_EXCEPTION</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>用户不存在</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A5E9849-A2F0-551D-A7D8-1A8118557BAB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1323</p>
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>身边事物环境</p>
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
    public static class SectionTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("labelName")
        private String labelName;

        private SectionTopic(Builder builder) {
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SectionTopic create() {
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

            private Builder(SectionTopic model) {
                this.labelId = model.labelId;
                this.labelName = model.labelName;
            } 

            /**
             * <p>The label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1329</p>
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>自我介绍</p>
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            public SectionTopic build() {
                return new SectionTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class Section extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private Object children;

        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("directoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("topic")
        private java.util.List<SectionTopic> topic;

        private Section(Builder builder) {
            this.children = builder.children;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Section create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public Object getChildren() {
            return this.children;
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
        public java.util.List<SectionTopic> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Object children; 
            private String directoryId; 
            private String directoryName; 
            private java.util.List<SectionTopic> topic; 

            private Builder() {
            } 

            private Builder(Section model) {
                this.children = model.children;
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topic = model.topic;
            } 

            /**
             * <p>Child nodes for backward compatibility. This property is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>可能存在的子元素，兼容数据使用，不一定存在</p>
             */
            public Builder children(Object children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>05758807ed8e11eebe6e0c42a106bb02</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>section 2</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The topic.</p>
             */
            public Builder topic(java.util.List<SectionTopic> topic) {
                this.topic = topic;
                return this;
            }

            public Section build() {
                return new Section(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class UnitTopic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("labelName")
        private String labelName;

        private UnitTopic(Builder builder) {
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitTopic create() {
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

            private Builder(UnitTopic model) {
                this.labelId = model.labelId;
                this.labelName = model.labelName;
            } 

            /**
             * <p>The label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1326</p>
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>自我介绍</p>
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            public UnitTopic build() {
                return new UnitTopic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantBookDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantBookDirectoriesResponseBody</p>
     */
    public static class Unit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("directoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("section")
        private java.util.List<Section> section;

        @com.aliyun.core.annotation.NameInMap("topic")
        private java.util.List<UnitTopic> topic;

        private Unit(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.section = builder.section;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Unit create() {
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
         * @return section
         */
        public java.util.List<Section> getSection() {
            return this.section;
        }

        /**
         * @return topic
         */
        public java.util.List<UnitTopic> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String directoryId; 
            private String directoryName; 
            private java.util.List<Section> section; 
            private java.util.List<UnitTopic> topic; 

            private Builder() {
            } 

            private Builder(Unit model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.section = model.section;
                this.topic = model.topic;
            } 

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>05758807ed8e11eebe6e0c42a106bb02</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>unit 2</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The section.</p>
             */
            public Builder section(java.util.List<Section> section) {
                this.section = section;
                return this;
            }

            /**
             * <p>The topic.</p>
             */
            public Builder topic(java.util.List<UnitTopic> topic) {
                this.topic = topic;
                return this;
            }

            public Unit build() {
                return new Unit(this);
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

        @com.aliyun.core.annotation.NameInMap("unit")
        private java.util.List<Unit> unit;

        private DirectoryTree(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topic = builder.topic;
            this.unit = builder.unit;
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

        /**
         * @return unit
         */
        public java.util.List<Unit> getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String directoryId; 
            private String directoryName; 
            private java.util.List<Topic> topic; 
            private java.util.List<Unit> unit; 

            private Builder() {
            } 

            private Builder(DirectoryTree model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topic = model.topic;
                this.unit = model.unit;
            } 

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>05758807ed8e11eebe6e0c42a106bb02</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>2 Jobs</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The topic.</p>
             */
            public Builder topic(java.util.List<Topic> topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The unit.</p>
             */
            public Builder unit(java.util.List<Unit> unit) {
                this.unit = unit;
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
             * <p>The book ID.</p>
             * 
             * <strong>example:</strong>
             * <p>55857</p>
             */
            public Builder bookId(String bookId) {
                this.bookId = bookId;
                return this;
            }

            /**
             * <p>The book volume. <code>0</code> indicates a single-volume edition, <code>1</code> indicates Volume 1, and <code>2</code> indicates Volume 2.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bookVolume(String bookVolume) {
                this.bookVolume = bookVolume;
                return this;
            }

            /**
             * <p>The edition.</p>
             * 
             * <strong>example:</strong>
             * <p>2010-1(2)</p>
             */
            public Builder edition(String edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>The grade. Valid values: 1–9.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder grade(String grade) {
                this.grade = grade;
                return this;
            }

            /**
             * <p>The impression.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-1(10)</p>
             */
            public Builder impression(String impression) {
                this.impression = impression;
                return this;
            }

            /**
             * <p>The International Standard Book Number (ISBN).</p>
             * 
             * <strong>example:</strong>
             * <p>9787544413695</p>
             */
            public Builder isbn(String isbn) {
                this.isbn = isbn;
                return this;
            }

            /**
             * <p>The publisher.</p>
             * 
             * <strong>example:</strong>
             * <p>人民教育出版社</p>
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * <p>The subject.</p>
             * 
             * <strong>example:</strong>
             * <p>ENGLISH</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>人教版</p>
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
             * <p>The directory tree.</p>
             */
            public Builder directoryTree(java.util.List<DirectoryTree> directoryTree) {
                this.directoryTree = directoryTree;
                return this;
            }

            /**
             * <p>The edition details.</p>
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
