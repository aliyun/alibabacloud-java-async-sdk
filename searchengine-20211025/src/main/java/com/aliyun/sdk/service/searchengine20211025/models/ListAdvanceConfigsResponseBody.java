// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAdvanceConfigsResponseBody</p>
 */
public class ListAdvanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListAdvanceConfigsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of advanced configurations.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListAdvanceConfigsResponseBody build() {
            return new ListAdvanceConfigsResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fullPathName")
        private String fullPathName;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Boolean isDir;

        @com.aliyun.core.annotation.NameInMap("isTemplate")
        private Boolean isTemplate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Files(Builder builder) {
            this.fullPathName = builder.fullPathName;
            this.isDir = builder.isDir;
            this.isTemplate = builder.isTemplate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fullPathName
         */
        public String getFullPathName() {
            return this.fullPathName;
        }

        /**
         * @return isDir
         */
        public Boolean getIsDir() {
            return this.isDir;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String fullPathName; 
            private Boolean isDir; 
            private Boolean isTemplate; 
            private String name; 

            /**
             * The name of the absolute path.
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * Indicates whether it is a directory. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * Indicates whether it is a template. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("advanceConfigType")
        private String advanceConfigType;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List < Files> files;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.advanceConfigType = builder.advanceConfigType;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.creator = builder.creator;
            this.desc = builder.desc;
            this.files = builder.files;
            this.name = builder.name;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return advanceConfigType
         */
        public String getAdvanceConfigType() {
            return this.advanceConfigType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return files
         */
        public java.util.List < Files> getFiles() {
            return this.files;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String advanceConfigType; 
            private String content; 
            private String contentType; 
            private String creator; 
            private String desc; 
            private java.util.List < Files> files; 
            private String name; 
            private String status; 
            private Long updateTime; 

            /**
             * advanceConfigType.
             */
            public Builder advanceConfigType(String advanceConfigType) {
                this.advanceConfigType = advanceConfigType;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The description.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The list of file names.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * The name of the advanced configuration.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The state of the advanced configuration. Valid values: drafting, used, unused, and trash. drafting indicates that the advanced configuration is a draft. used indicates that the advanced configuration is in use. unused indicates that the advanced configuration is unused. trash indicates that the advanced configuration is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
