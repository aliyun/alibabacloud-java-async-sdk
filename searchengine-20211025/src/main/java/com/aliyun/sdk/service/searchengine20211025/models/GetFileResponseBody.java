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
 * {@link GetFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileResponseBody</p>
 */
public class GetFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFileResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The index information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetFileResponseBody build() {
            return new GetFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("dataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("extend")
        private java.util.Map<String, java.util.List<String>> extend;

        @com.aliyun.core.annotation.NameInMap("fullPathName")
        private String fullPathName;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Boolean isDir;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("partition")
        private Long partition;

        private Result(Builder builder) {
            this.content = builder.content;
            this.dataSource = builder.dataSource;
            this.extend = builder.extend;
            this.fullPathName = builder.fullPathName;
            this.isDir = builder.isDir;
            this.name = builder.name;
            this.partition = builder.partition;
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
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return extend
         */
        public java.util.Map<String, java.util.List<String>> getExtend() {
            return this.extend;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partition
         */
        public Long getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private String content; 
            private String dataSource; 
            private java.util.Map<String, java.util.List<String>> extend; 
            private String fullPathName; 
            private Boolean isDir; 
            private String name; 
            private Long partition; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.dataSource = model.dataSource;
                this.extend = model.extend;
                this.fullPathName = model.fullPathName;
                this.isDir = model.isDir;
                this.name = model.name;
                this.partition = model.partition;
            } 

            /**
             * <p>The file content.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-2r42p5oi202_xijie_test</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>Extended information</p>
             */
            public Builder extend(java.util.Map<String, java.util.List<String>> extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The full path of the file.</p>
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
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-2r42ostoc01_qrs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20210828</p>
             */
            public Builder partition(Long partition) {
                this.partition = partition;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
