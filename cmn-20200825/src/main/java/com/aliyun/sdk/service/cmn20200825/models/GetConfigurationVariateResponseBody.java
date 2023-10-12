// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigurationVariateResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigurationVariateResponseBody</p>
 */
public class GetConfigurationVariateResponseBody extends TeaModel {
    @NameInMap("ConfigurationVariate")
    private ConfigurationVariate configurationVariate;

    @NameInMap("RequestId")
    private String requestId;

    private GetConfigurationVariateResponseBody(Builder builder) {
        this.configurationVariate = builder.configurationVariate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigurationVariateResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationVariate
     */
    public ConfigurationVariate getConfigurationVariate() {
        return this.configurationVariate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigurationVariate configurationVariate; 
        private String requestId; 

        /**
         * ConfigurationVariate.
         */
        public Builder configurationVariate(ConfigurationVariate configurationVariate) {
            this.configurationVariate = configurationVariate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigurationVariateResponseBody build() {
            return new GetConfigurationVariateResponseBody(this);
        } 

    } 

    public static class ConfigurationVariate extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("FormatFunction")
        private String formatFunction;

        @NameInMap("VariateName")
        private String variateName;

        private ConfigurationVariate(Builder builder) {
            this.comment = builder.comment;
            this.formatFunction = builder.formatFunction;
            this.variateName = builder.variateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationVariate create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return formatFunction
         */
        public String getFormatFunction() {
            return this.formatFunction;
        }

        /**
         * @return variateName
         */
        public String getVariateName() {
            return this.variateName;
        }

        public static final class Builder {
            private String comment; 
            private String formatFunction; 
            private String variateName; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * FormatFunction.
             */
            public Builder formatFunction(String formatFunction) {
                this.formatFunction = formatFunction;
                return this;
            }

            /**
             * VariateName.
             */
            public Builder variateName(String variateName) {
                this.variateName = variateName;
                return this;
            }

            public ConfigurationVariate build() {
                return new ConfigurationVariate(this);
            } 

        } 

    }
}
