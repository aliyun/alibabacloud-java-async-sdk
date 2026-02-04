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
 * {@link GetInstanceModuleInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceModuleInfoResponseBody</p>
 */
public class GetInstanceModuleInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceModuleInfoResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceModuleInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceModuleInfoResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceModuleInfoResponseBody build() {
            return new GetInstanceModuleInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceModuleInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceModuleInfoResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureKey")
        private String featureKey;

        @com.aliyun.core.annotation.NameInMap("FeatureStatus")
        private String featureStatus;

        private Features(Builder builder) {
            this.featureKey = builder.featureKey;
            this.featureStatus = builder.featureStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return featureKey
         */
        public String getFeatureKey() {
            return this.featureKey;
        }

        /**
         * @return featureStatus
         */
        public String getFeatureStatus() {
            return this.featureStatus;
        }

        public static final class Builder {
            private String featureKey; 
            private String featureStatus; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.featureKey = model.featureKey;
                this.featureStatus = model.featureStatus;
            } 

            /**
             * <p>二级模块标识</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:license:module:application:standard:oidc</p>
             */
            public Builder featureKey(String featureKey) {
                this.featureKey = featureKey;
                return this;
            }

            /**
             * <p>二级模块状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder featureStatus(String featureStatus) {
                this.featureStatus = featureStatus;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceModuleInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceModuleInfoResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<Features> features;

        @com.aliyun.core.annotation.NameInMap("ModuleKey")
        private String moduleKey;

        @com.aliyun.core.annotation.NameInMap("ModuleStatus")
        private String moduleStatus;

        private Module(Builder builder) {
            this.features = builder.features;
            this.moduleKey = builder.moduleKey;
            this.moduleStatus = builder.moduleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.List<Features> getFeatures() {
            return this.features;
        }

        /**
         * @return moduleKey
         */
        public String getModuleKey() {
            return this.moduleKey;
        }

        /**
         * @return moduleStatus
         */
        public String getModuleStatus() {
            return this.moduleStatus;
        }

        public static final class Builder {
            private java.util.List<Features> features; 
            private String moduleKey; 
            private String moduleStatus; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.features = model.features;
                this.moduleKey = model.moduleKey;
                this.moduleStatus = model.moduleStatus;
            } 

            /**
             * <p>二级模块信息</p>
             */
            public Builder features(java.util.List<Features> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>模块状态</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:license:module:application</p>
             */
            public Builder moduleKey(String moduleKey) {
                this.moduleKey = moduleKey;
                return this;
            }

            /**
             * <p>一级模块状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder moduleStatus(String moduleStatus) {
                this.moduleStatus = moduleStatus;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
