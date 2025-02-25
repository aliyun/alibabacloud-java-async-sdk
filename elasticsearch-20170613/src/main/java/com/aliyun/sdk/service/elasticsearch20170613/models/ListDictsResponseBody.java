// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDictsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDictsResponseBody</p>
 */
public class ListDictsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListDictsResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDictsResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The header of the response.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2937F832-F39E-41EF-89BA-B528342A2A3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDictsResponseBody build() {
            return new ListDictsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDictsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDictsResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDictsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDictsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * <p>The link that is used to download the dictionary over the Internet. The link is valid for 90s.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://test_bucket.oss-cn-hangzhou.aliyuncs.com/AliyunEs/test.dic?Expires=162573****&OSSAccessKeyId=LTAI*****V9&Signature=PNPO********BBGsJDO4V3VfU4sE%3D">http://test_bucket.oss-cn-hangzhou.aliyuncs.com/AliyunEs/test.dic?Expires=162573****&amp;OSSAccessKeyId=LTAI*****V9&amp;Signature=PNPO********BBGsJDO4V3VfU4sE%3D</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The size of the dictionary file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>2782602</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The name of the dictionary file.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_MAIN.dic</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>ORIGIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the IK dictionary. Valid values:</p>
             * <ul>
             * <li>MAIN: main dictionary</li>
             * <li>STOP: stopword list</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MAIN</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
