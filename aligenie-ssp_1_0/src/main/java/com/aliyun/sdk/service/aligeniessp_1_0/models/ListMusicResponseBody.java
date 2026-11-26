// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListMusicResponseBody} extends {@link TeaModel}
 *
 * <p>ListMusicResponseBody</p>
 */
public class ListMusicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListMusicResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMusicResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListMusicResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the alarm service</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>音乐类型名称为空</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>collection of ringtone query results</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMusicResponseBody build() {
            return new ListMusicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMusicResponseBody} extends {@link TeaModel}
     *
     * <p>ListMusicResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MusicId")
        private Long musicId;

        @com.aliyun.core.annotation.NameInMap("MusicName")
        private String musicName;

        @com.aliyun.core.annotation.NameInMap("MusicType")
        private Long musicType;

        @com.aliyun.core.annotation.NameInMap("MusicTypeName")
        private String musicTypeName;

        @com.aliyun.core.annotation.NameInMap("MusicUrl")
        private String musicUrl;

        private Model(Builder builder) {
            this.musicId = builder.musicId;
            this.musicName = builder.musicName;
            this.musicType = builder.musicType;
            this.musicTypeName = builder.musicTypeName;
            this.musicUrl = builder.musicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return musicId
         */
        public Long getMusicId() {
            return this.musicId;
        }

        /**
         * @return musicName
         */
        public String getMusicName() {
            return this.musicName;
        }

        /**
         * @return musicType
         */
        public Long getMusicType() {
            return this.musicType;
        }

        /**
         * @return musicTypeName
         */
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        /**
         * @return musicUrl
         */
        public String getMusicUrl() {
            return this.musicUrl;
        }

        public static final class Builder {
            private Long musicId; 
            private String musicName; 
            private Long musicType; 
            private String musicTypeName; 
            private String musicUrl; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.musicId = model.musicId;
                this.musicName = model.musicName;
                this.musicType = model.musicType;
                this.musicTypeName = model.musicTypeName;
                this.musicUrl = model.musicUrl;
            } 

            /**
             * <p>Ringtone ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicId(Long musicId) {
                this.musicId = musicId;
                return this;
            }

            /**
             * <p>Ringtone name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder musicName(String musicName) {
                this.musicName = musicName;
                return this;
            }

            /**
             * <p>Ringtone category ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder musicType(Long musicType) {
                this.musicType = musicType;
                return this;
            }

            /**
             * <p>Ringtone category name</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder musicTypeName(String musicTypeName) {
                this.musicTypeName = musicTypeName;
                return this;
            }

            /**
             * <p>Ringtone URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx">http://xx</a></p>
             */
            public Builder musicUrl(String musicUrl) {
                this.musicUrl = musicUrl;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMusicResponseBody} extends {@link TeaModel}
     *
     * <p>ListMusicResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Model")
        private java.util.List<Model> model;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.currentPage = builder.currentPage;
            this.model = builder.model;
            this.pageCount = builder.pageCount;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return model
         */
        public java.util.List<Model> getModel() {
            return this.model;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<Model> model; 
            private Integer pageCount; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.currentPage = model.currentPage;
                this.model = model.model;
                this.pageCount = model.pageCount;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Current page</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>List of ringtones</p>
             */
            public Builder model(java.util.List<Model> model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Total number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * <p>Number of entries per page: maximum value is 100; values exceeding 100 are treated as 100</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of entries</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
