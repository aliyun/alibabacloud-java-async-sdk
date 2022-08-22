// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveFilesResponseBody</p>
 */
public class ListLiveFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListLiveFilesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveFilesResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果。
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListLiveFilesResponseBody build() {
            return new ListLiveFilesResponseBody(this);
        } 

    } 

    public static class FileList extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Url")
        private String url;

        private FileList(Builder builder) {
            this.fileName = builder.fileName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String fileName; 
            private String url; 

            /**
             * 文件名称。
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件下载地址。
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("FileList")
        private java.util.List < FileList> fileList;

        private Result(Builder builder) {
            this.fileList = builder.fileList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return fileList
         */
        public java.util.List < FileList> getFileList() {
            return this.fileList;
        }

        public static final class Builder {
            private java.util.List < FileList> fileList; 

            /**
             * 文件列表。
             */
            public Builder fileList(java.util.List < FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
