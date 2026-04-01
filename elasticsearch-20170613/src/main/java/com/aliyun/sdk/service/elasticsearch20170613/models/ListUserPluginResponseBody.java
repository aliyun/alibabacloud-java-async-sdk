// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListUserPluginResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPluginResponseBody</p>
 */
public class ListUserPluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.Map<String, ?> headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListUserPluginResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPluginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, ?> getHeaders() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private java.util.Map<String, ?> headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListUserPluginResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Headers.
         */
        public Builder headers(java.util.Map<String, ?> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListUserPluginResponseBody build() {
            return new ListUserPluginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserPluginResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPluginResponseBody</p>
     */
    public static class BingoPlugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elasticsearchVersion")
        private String elasticsearchVersion;

        @com.aliyun.core.annotation.NameInMap("fileVersion")
        private String fileVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private BingoPlugins(Builder builder) {
            this.description = builder.description;
            this.elasticsearchVersion = builder.elasticsearchVersion;
            this.fileVersion = builder.fileVersion;
            this.name = builder.name;
            this.source = builder.source;
            this.state = builder.state;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BingoPlugins create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticsearchVersion
         */
        public String getElasticsearchVersion() {
            return this.elasticsearchVersion;
        }

        /**
         * @return fileVersion
         */
        public String getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String elasticsearchVersion; 
            private String fileVersion; 
            private String name; 
            private String source; 
            private String state; 
            private String version; 

            private Builder() {
            } 

            private Builder(BingoPlugins model) {
                this.description = model.description;
                this.elasticsearchVersion = model.elasticsearchVersion;
                this.fileVersion = model.fileVersion;
                this.name = model.name;
                this.source = model.source;
                this.state = model.state;
                this.version = model.version;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * elasticsearchVersion.
             */
            public Builder elasticsearchVersion(String elasticsearchVersion) {
                this.elasticsearchVersion = elasticsearchVersion;
                return this;
            }

            /**
             * fileVersion.
             */
            public Builder fileVersion(String fileVersion) {
                this.fileVersion = fileVersion;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BingoPlugins build() {
                return new BingoPlugins(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserPluginResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPluginResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bingoPlugins")
        private java.util.List<BingoPlugins> bingoPlugins;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Result(Builder builder) {
            this.bingoPlugins = builder.bingoPlugins;
            this.name = builder.name;
            this.source = builder.source;
            this.state = builder.state;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bingoPlugins
         */
        public java.util.List<BingoPlugins> getBingoPlugins() {
            return this.bingoPlugins;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<BingoPlugins> bingoPlugins; 
            private String name; 
            private String source; 
            private String state; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bingoPlugins = model.bingoPlugins;
                this.name = model.name;
                this.source = model.source;
                this.state = model.state;
                this.version = model.version;
            } 

            /**
             * bingoPlugins.
             */
            public Builder bingoPlugins(java.util.List<BingoPlugins> bingoPlugins) {
                this.bingoPlugins = bingoPlugins;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
