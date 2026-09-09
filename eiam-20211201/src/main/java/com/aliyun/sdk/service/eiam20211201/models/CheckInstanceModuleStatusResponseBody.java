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
 * {@link CheckInstanceModuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckInstanceModuleStatusResponseBody</p>
 */
public class CheckInstanceModuleStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckInstanceModuleStatusResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceModuleStatusResponseBody create() {
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

        private Builder(CheckInstanceModuleStatusResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status information.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckInstanceModuleStatusResponseBody build() {
            return new CheckInstanceModuleStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckInstanceModuleStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CheckInstanceModuleStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleStatus")
        private String moduleStatus;

        private Module(Builder builder) {
            this.moduleStatus = builder.moduleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return moduleStatus
         */
        public String getModuleStatus() {
            return this.moduleStatus;
        }

        public static final class Builder {
            private String moduleStatus; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.moduleStatus = model.moduleStatus;
            } 

            /**
             * <p>The module status.</p>
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
