// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateContextStoreResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContextStoreResponseBody</p>
 */
public class UpdateContextStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("strategyVersion")
    private Integer strategyVersion;

    private UpdateContextStoreResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
        this.strategyVersion = builder.strategyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyVersion
     */
    public Integer getStrategyVersion() {
        return this.strategyVersion;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 
        private Integer strategyVersion; 

        private Builder() {
        } 

        private Builder(UpdateContextStoreResponseBody model) {
            this.config = model.config;
            this.requestId = model.requestId;
            this.strategyVersion = model.strategyVersion;
        } 

        /**
         * <p>The configuration properties after the runtime recall switch is updated. This block is not returned for other library update operations.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate this request during troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The strategy version number that takes effect after the update for the memory type. If the strategy remains unchanged, the version number is the same as before the update.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder strategyVersion(Integer strategyVersion) {
            this.strategyVersion = strategyVersion;
            return this;
        }

        public UpdateContextStoreResponseBody build() {
            return new UpdateContextStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runtimeRecallEnabled")
        private Boolean runtimeRecallEnabled;

        @com.aliyun.core.annotation.NameInMap("runtimeRecallRevision")
        private Long runtimeRecallRevision;

        private Config(Builder builder) {
            this.runtimeRecallEnabled = builder.runtimeRecallEnabled;
            this.runtimeRecallRevision = builder.runtimeRecallRevision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return runtimeRecallEnabled
         */
        public Boolean getRuntimeRecallEnabled() {
            return this.runtimeRecallEnabled;
        }

        /**
         * @return runtimeRecallRevision
         */
        public Long getRuntimeRecallRevision() {
            return this.runtimeRecallRevision;
        }

        public static final class Builder {
            private Boolean runtimeRecallEnabled; 
            private Long runtimeRecallRevision; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.runtimeRecallEnabled = model.runtimeRecallEnabled;
                this.runtimeRecallRevision = model.runtimeRecallRevision;
            } 

            /**
             * <p>Indicates whether runtime recall is allowed after the experience library is updated.</p>
             */
            public Builder runtimeRecallEnabled(Boolean runtimeRecallEnabled) {
                this.runtimeRecallEnabled = runtimeRecallEnabled;
                return this;
            }

            /**
             * <p>The runtime recall property version that takes effect after this update.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runtimeRecallRevision(Long runtimeRecallRevision) {
                this.runtimeRecallRevision = runtimeRecallRevision;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
