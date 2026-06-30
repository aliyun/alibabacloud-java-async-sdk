// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListRayLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRayLogsResponseBody</p>
 */
public class ListRayLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRayLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayLogsResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRayLogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRayLogsResponseBody build() {
            return new ListRayLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRayLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayLogsResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isDir")
        private Boolean isDir;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("timeModified")
        private Long timeModified;

        private ObjectList(Builder builder) {
            this.isDir = builder.isDir;
            this.name = builder.name;
            this.path = builder.path;
            this.size = builder.size;
            this.timeModified = builder.timeModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return isDir
         */
        public Boolean getIsDir() {
            return this.isDir;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return timeModified
         */
        public Long getTimeModified() {
            return this.timeModified;
        }

        public static final class Builder {
            private Boolean isDir; 
            private String name; 
            private String path; 
            private Long size; 
            private Long timeModified; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.isDir = model.isDir;
                this.name = model.name;
                this.path = model.path;
                this.size = model.size;
                this.timeModified = model.timeModified;
            } 

            /**
             * isDir.
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * timeModified.
             */
            public Builder timeModified(Long timeModified) {
                this.timeModified = timeModified;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRayLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("delimiter")
        private String delimiter;

        @com.aliyun.core.annotation.NameInMap("isTruncated")
        private Boolean isTruncated;

        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxKeys")
        private Long maxKeys;

        @com.aliyun.core.annotation.NameInMap("nextMarker")
        private String nextMarker;

        @com.aliyun.core.annotation.NameInMap("objectList")
        private java.util.List<ObjectList> objectList;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.delimiter = builder.delimiter;
            this.isTruncated = builder.isTruncated;
            this.marker = builder.marker;
            this.maxKeys = builder.maxKeys;
            this.nextMarker = builder.nextMarker;
            this.objectList = builder.objectList;
            this.prefix = builder.prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return delimiter
         */
        public String getDelimiter() {
            return this.delimiter;
        }

        /**
         * @return isTruncated
         */
        public Boolean getIsTruncated() {
            return this.isTruncated;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxKeys
         */
        public Long getMaxKeys() {
            return this.maxKeys;
        }

        /**
         * @return nextMarker
         */
        public String getNextMarker() {
            return this.nextMarker;
        }

        /**
         * @return objectList
         */
        public java.util.List<ObjectList> getObjectList() {
            return this.objectList;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        public static final class Builder {
            private String bucketName; 
            private String delimiter; 
            private Boolean isTruncated; 
            private String marker; 
            private Long maxKeys; 
            private String nextMarker; 
            private java.util.List<ObjectList> objectList; 
            private String prefix; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.delimiter = model.delimiter;
                this.isTruncated = model.isTruncated;
                this.marker = model.marker;
                this.maxKeys = model.maxKeys;
                this.nextMarker = model.nextMarker;
                this.objectList = model.objectList;
                this.prefix = model.prefix;
            } 

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * delimiter.
             */
            public Builder delimiter(String delimiter) {
                this.delimiter = delimiter;
                return this;
            }

            /**
             * isTruncated.
             */
            public Builder isTruncated(Boolean isTruncated) {
                this.isTruncated = isTruncated;
                return this;
            }

            /**
             * marker.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * maxKeys.
             */
            public Builder maxKeys(Long maxKeys) {
                this.maxKeys = maxKeys;
                return this;
            }

            /**
             * nextMarker.
             */
            public Builder nextMarker(String nextMarker) {
                this.nextMarker = nextMarker;
                return this;
            }

            /**
             * objectList.
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
