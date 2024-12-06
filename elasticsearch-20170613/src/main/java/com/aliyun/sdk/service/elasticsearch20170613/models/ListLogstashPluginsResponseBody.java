// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLogstashPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogstashPluginsResponseBody</p>
 */
public class ListLogstashPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The address of the documentation for the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>99407AB-2FA9-489E-A259-40CF6DCC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the plug-in. Valid values:</p>
         * <ul>
         * <li>INSTALLED: Installed</li>
         * <li>UNINSTALLED: Not installed</li>
         * <li>INSTALLING: The instance is being installed.</li>
         * <li>UNINSTALLING: The instance is being uninstalled.</li>
         * <li>UPGRADING: The backup gateway is being upgraded.</li>
         * <li>FAILED: Installation failed</li>
         * <li>UNKNOWN: The cluster is lost and cannot be created.</li>
         * </ul>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListLogstashPluginsResponseBody build() {
            return new ListLogstashPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogstashPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogstashPluginsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("specificationUrl")
        private String specificationUrl;

        @com.aliyun.core.annotation.NameInMap("state")
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
             * <p>The source of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>The clone filter is for duplicating events.</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.html">https://xxx.html</a></p>
             */
            public Builder specificationUrl(String specificationUrl) {
                this.specificationUrl = specificationUrl;
                return this;
            }

            /**
             * state.
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
