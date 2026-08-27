// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link VerifyMigrationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMigrationTaskResponseBody</p>
 */
public class VerifyMigrationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private VerifyMigrationTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMigrationTaskResponseBody create() {
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

        private Builder(VerifyMigrationTaskResponseBody model) {
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
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyMigrationTaskResponseBody build() {
            return new VerifyMigrationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyMigrationTaskResponseBody</p>
     */
    public static class UnSupportedRouteRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("unSupportedAnnotations")
        private java.util.List<String> unSupportedAnnotations;

        private UnSupportedRouteRules(Builder builder) {
            this.name = builder.name;
            this.rule = builder.rule;
            this.unSupportedAnnotations = builder.unSupportedAnnotations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnSupportedRouteRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return unSupportedAnnotations
         */
        public java.util.List<String> getUnSupportedAnnotations() {
            return this.unSupportedAnnotations;
        }

        public static final class Builder {
            private String name; 
            private String rule; 
            private java.util.List<String> unSupportedAnnotations; 

            private Builder() {
            } 

            private Builder(UnSupportedRouteRules model) {
                this.name = model.name;
                this.rule = model.rule;
                this.unSupportedAnnotations = model.unSupportedAnnotations;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * unSupportedAnnotations.
             */
            public Builder unSupportedAnnotations(java.util.List<String> unSupportedAnnotations) {
                this.unSupportedAnnotations = unSupportedAnnotations;
                return this;
            }

            public UnSupportedRouteRules build() {
                return new UnSupportedRouteRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyMigrationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyMigrationTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isSupported")
        private Boolean isSupported;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("unSupportedRouteRules")
        private java.util.List<UnSupportedRouteRules> unSupportedRouteRules;

        private Data(Builder builder) {
            this.isSupported = builder.isSupported;
            this.message = builder.message;
            this.success = builder.success;
            this.unSupportedRouteRules = builder.unSupportedRouteRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isSupported
         */
        public Boolean getIsSupported() {
            return this.isSupported;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return unSupportedRouteRules
         */
        public java.util.List<UnSupportedRouteRules> getUnSupportedRouteRules() {
            return this.unSupportedRouteRules;
        }

        public static final class Builder {
            private Boolean isSupported; 
            private String message; 
            private Boolean success; 
            private java.util.List<UnSupportedRouteRules> unSupportedRouteRules; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.isSupported = model.isSupported;
                this.message = model.message;
                this.success = model.success;
                this.unSupportedRouteRules = model.unSupportedRouteRules;
            } 

            /**
             * isSupported.
             */
            public Builder isSupported(Boolean isSupported) {
                this.isSupported = isSupported;
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
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * unSupportedRouteRules.
             */
            public Builder unSupportedRouteRules(java.util.List<UnSupportedRouteRules> unSupportedRouteRules) {
                this.unSupportedRouteRules = unSupportedRouteRules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
