// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link GetAdvanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdvanceConfigResponseBody</p>
 */
public class GetAdvanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetAdvanceConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvanceConfigResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAdvanceConfigResponseBody build() {
            return new GetAdvanceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAdvanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAdvanceConfigResponseBody</p>
     */
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
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * <p>Indicates whether the file is a directory.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * <p>Indicates whether the file is a container.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-2r42ostoc01_qrs</p>
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
    /**
     * 
     * {@link GetAdvanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAdvanceConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
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
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
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
            private String content; 
            private String contentType; 
            private String desc; 
            private java.util.List<Files> files; 
            private String name; 
            private String status; 
            private Long updateTime; 

            /**
             * <p>The content of the advanced configuration that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;url&quot;:&quot;<a href="http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar%5C%22%7D">http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar\&quot;}</a></p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The type of the configuration content. Valid values: FILE, GIT, HTTP, and ODPS.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The description of the advanced configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>close alarm, chiji id 37080</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The files.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The name of the advanced configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-0ju2s170b03_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the advanced configuration. Valid values: drafting: The advanced configuration is in the draft state. used: The advanced configuration is being used. unused: The advanced configuration is not used. trash: The advanced configuration is being deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>0,1,3,6,8</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the advanced configuration was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
