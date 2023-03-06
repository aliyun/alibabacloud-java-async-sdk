// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogstashPluginsResponseBody</p>
 */
public class ListLogstashPluginsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListLogstashPluginsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogstashPluginsResponseBody create() {
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
         * The returned results.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListLogstashPluginsResponseBody build() {
            return new ListLogstashPluginsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("source")
        private String source;

        @NameInMap("specificationUrl")
        private String specificationUrl;

        @NameInMap("state")
        private String state;

        private Result(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.source = builder.source;
            this.specificationUrl = builder.specificationUrl;
            this.state = builder.state;
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
         * @return specificationUrl
         */
        public String getSpecificationUrl() {
            return this.specificationUrl;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String source; 
            private String specificationUrl; 
            private String state; 

            /**
             * The description of the plug-in.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the plug-in.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The source of the plug-in.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The address of the documentation for the plug-in.
             */
            public Builder specificationUrl(String specificationUrl) {
                this.specificationUrl = specificationUrl;
                return this;
            }

            /**
             * The status of the plug-in. Valid values:
             * <p>
             * 
             * *   INSTALLED: Installed
             * *   UNINSTALLED: Not installed
             * *   INSTALLING: The instance is being installed.
             * *   UNINSTALLING: The instance is being uninstalled.
             * *   UPGRADING: The backup gateway is being upgraded.
             * *   FAILED: Installation failed
             * *   UNKNOWN: The cluster is lost and cannot be created.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
