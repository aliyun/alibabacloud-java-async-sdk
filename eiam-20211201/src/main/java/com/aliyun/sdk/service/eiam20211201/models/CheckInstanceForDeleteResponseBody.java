// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CheckInstanceForDeleteResponseBody} extends {@link TeaModel}
 *
 * <p>CheckInstanceForDeleteResponseBody</p>
 */
public class CheckInstanceForDeleteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckInstanceResult")
    private CheckInstanceResult checkInstanceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckInstanceForDeleteResponseBody(Builder builder) {
        this.checkInstanceResult = builder.checkInstanceResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceForDeleteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkInstanceResult
     */
    public CheckInstanceResult getCheckInstanceResult() {
        return this.checkInstanceResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckInstanceResult checkInstanceResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckInstanceForDeleteResponseBody model) {
            this.checkInstanceResult = model.checkInstanceResult;
            this.requestId = model.requestId;
        } 

        /**
         * CheckInstanceResult.
         */
        public Builder checkInstanceResult(CheckInstanceResult checkInstanceResult) {
            this.checkInstanceResult = checkInstanceResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckInstanceForDeleteResponseBody build() {
            return new CheckInstanceForDeleteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckInstanceForDeleteResponseBody} extends {@link TeaModel}
     *
     * <p>CheckInstanceForDeleteResponseBody</p>
     */
    public static class RestrictScenarios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HelpfulConsoleUrl")
        private String helpfulConsoleUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("RestrictReason")
        private String restrictReason;

        private RestrictScenarios(Builder builder) {
            this.helpfulConsoleUrl = builder.helpfulConsoleUrl;
            this.resourceId = builder.resourceId;
            this.restrictReason = builder.restrictReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestrictScenarios create() {
            return builder().build();
        }

        /**
         * @return helpfulConsoleUrl
         */
        public String getHelpfulConsoleUrl() {
            return this.helpfulConsoleUrl;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return restrictReason
         */
        public String getRestrictReason() {
            return this.restrictReason;
        }

        public static final class Builder {
            private String helpfulConsoleUrl; 
            private String resourceId; 
            private String restrictReason; 

            private Builder() {
            } 

            private Builder(RestrictScenarios model) {
                this.helpfulConsoleUrl = model.helpfulConsoleUrl;
                this.resourceId = model.resourceId;
                this.restrictReason = model.restrictReason;
            } 

            /**
             * <p>有帮助的控制台地址，可以管理对应的资源，从而解除实例删除限制。可能返回为空，不一定所有的资源ID都有管理地址返回。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://console-rpa.aliyun.com/">https://console-rpa.aliyun.com/</a></p>
             */
            public Builder helpfulConsoleUrl(String helpfulConsoleUrl) {
                this.helpfulConsoleUrl = helpfulConsoleUrl;
                return this;
            }

            /**
             * <p>导致实例删除受限的资源ID。</p>
             * 
             * <strong>example:</strong>
             * <p>eas-r-nguosqgr75ndg784k8</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>针对实例删除受限的原因文字描述。</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_product_dependency</p>
             */
            public Builder restrictReason(String restrictReason) {
                this.restrictReason = restrictReason;
                return this;
            }

            public RestrictScenarios build() {
                return new RestrictScenarios(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckInstanceForDeleteResponseBody} extends {@link TeaModel}
     *
     * <p>CheckInstanceForDeleteResponseBody</p>
     */
    public static class CheckInstanceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deletable")
        private Boolean deletable;

        @com.aliyun.core.annotation.NameInMap("RestrictScenarios")
        private java.util.List<RestrictScenarios> restrictScenarios;

        private CheckInstanceResult(Builder builder) {
            this.deletable = builder.deletable;
            this.restrictScenarios = builder.restrictScenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckInstanceResult create() {
            return builder().build();
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return restrictScenarios
         */
        public java.util.List<RestrictScenarios> getRestrictScenarios() {
            return this.restrictScenarios;
        }

        public static final class Builder {
            private Boolean deletable; 
            private java.util.List<RestrictScenarios> restrictScenarios; 

            private Builder() {
            } 

            private Builder(CheckInstanceResult model) {
                this.deletable = model.deletable;
                this.restrictScenarios = model.restrictScenarios;
            } 

            /**
             * <p>true表示实例可以被删除；false表示实例不可被删除，具体查看RestrictScenarios属性。</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * <p>true表示实例可以被删除；false表示实例不可被删除，具体查看RestrictScenarios属性。</p>
             */
            public Builder restrictScenarios(java.util.List<RestrictScenarios> restrictScenarios) {
                this.restrictScenarios = restrictScenarios;
                return this;
            }

            public CheckInstanceResult build() {
                return new CheckInstanceResult(this);
            } 

        } 

    }
}
