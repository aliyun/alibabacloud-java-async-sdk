// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604.models;

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
 * {@link AddDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>AddDocumentsResponseBody</p>
 */
public class AddDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AddDocumentsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static AddDocumentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddDocumentsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * accessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Integer code) {
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
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * requestId.
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

        public AddDocumentsResponseBody build() {
            return new AddDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>AddDocumentsResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunkCount")
        private Integer chunkCount;

        @com.aliyun.core.annotation.NameInMap("chunkMethod")
        private String chunkMethod;

        @com.aliyun.core.annotation.NameInMap("datasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("run")
        private String run;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("suffix")
        private String suffix;

        @com.aliyun.core.annotation.NameInMap("thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("tokenCount")
        private Integer tokenCount;

        private Documents(Builder builder) {
            this.chunkCount = builder.chunkCount;
            this.chunkMethod = builder.chunkMethod;
            this.datasetId = builder.datasetId;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
            this.progress = builder.progress;
            this.run = builder.run;
            this.size = builder.size;
            this.suffix = builder.suffix;
            this.thumbnail = builder.thumbnail;
            this.tokenCount = builder.tokenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return chunkCount
         */
        public Integer getChunkCount() {
            return this.chunkCount;
        }

        /**
         * @return chunkMethod
         */
        public String getChunkMethod() {
            return this.chunkMethod;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return run
         */
        public String getRun() {
            return this.run;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return tokenCount
         */
        public Integer getTokenCount() {
            return this.tokenCount;
        }

        public static final class Builder {
            private Integer chunkCount; 
            private String chunkMethod; 
            private String datasetId; 
            private String id; 
            private String location; 
            private String name; 
            private Float progress; 
            private String run; 
            private Long size; 
            private String suffix; 
            private String thumbnail; 
            private Integer tokenCount; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.chunkCount = model.chunkCount;
                this.chunkMethod = model.chunkMethod;
                this.datasetId = model.datasetId;
                this.id = model.id;
                this.location = model.location;
                this.name = model.name;
                this.progress = model.progress;
                this.run = model.run;
                this.size = model.size;
                this.suffix = model.suffix;
                this.thumbnail = model.thumbnail;
                this.tokenCount = model.tokenCount;
            } 

            /**
             * chunkCount.
             */
            public Builder chunkCount(Integer chunkCount) {
                this.chunkCount = chunkCount;
                return this;
            }

            /**
             * chunkMethod.
             */
            public Builder chunkMethod(String chunkMethod) {
                this.chunkMethod = chunkMethod;
                return this;
            }

            /**
             * datasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * run.
             */
            public Builder run(String run) {
                this.run = run;
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
             * suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * tokenCount.
             */
            public Builder tokenCount(Integer tokenCount) {
                this.tokenCount = tokenCount;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>AddDocumentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("documents")
        private java.util.List<Documents> documents;

        @com.aliyun.core.annotation.NameInMap("errors")
        private java.util.List<String> errors;

        private Data(Builder builder) {
            this.documents = builder.documents;
            this.errors = builder.errors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documents
         */
        public java.util.List<Documents> getDocuments() {
            return this.documents;
        }

        /**
         * @return errors
         */
        public java.util.List<String> getErrors() {
            return this.errors;
        }

        public static final class Builder {
            private java.util.List<Documents> documents; 
            private java.util.List<String> errors; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documents = model.documents;
                this.errors = model.errors;
            } 

            /**
             * documents.
             */
            public Builder documents(java.util.List<Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * errors.
             */
            public Builder errors(java.util.List<String> errors) {
                this.errors = errors;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
