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
 * {@link PluginAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>PluginAnalysisResponseBody</p>
 */
public class PluginAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private PluginAnalysisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PluginAnalysisResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(PluginAnalysisResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
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

        public PluginAnalysisResponseBody build() {
            return new PluginAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PluginAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>PluginAnalysisResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elasticsearchVersion")
        private String elasticsearchVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("securityPolicy")
        private String securityPolicy;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Result(Builder builder) {
            this.description = builder.description;
            this.elasticsearchVersion = builder.elasticsearchVersion;
            this.name = builder.name;
            this.securityPolicy = builder.securityPolicy;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityPolicy
         */
        public String getSecurityPolicy() {
            return this.securityPolicy;
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
            private String name; 
            private String securityPolicy; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.elasticsearchVersion = model.elasticsearchVersion;
                this.name = model.name;
                this.securityPolicy = model.securityPolicy;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * securityPolicy.
             */
            public Builder securityPolicy(String securityPolicy) {
                this.securityPolicy = securityPolicy;
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
