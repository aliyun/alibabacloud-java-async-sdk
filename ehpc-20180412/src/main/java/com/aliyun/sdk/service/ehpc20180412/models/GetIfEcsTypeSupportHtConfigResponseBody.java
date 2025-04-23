// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetIfEcsTypeSupportHtConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetIfEcsTypeSupportHtConfigResponseBody</p>
 */
public class GetIfEcsTypeSupportHtConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultHtEnabled")
    private Boolean defaultHtEnabled;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportHtConfig")
    private Boolean supportHtConfig;

    private GetIfEcsTypeSupportHtConfigResponseBody(Builder builder) {
        this.defaultHtEnabled = builder.defaultHtEnabled;
        this.instanceType = builder.instanceType;
        this.requestId = builder.requestId;
        this.supportHtConfig = builder.supportHtConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIfEcsTypeSupportHtConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultHtEnabled
     */
    public Boolean getDefaultHtEnabled() {
        return this.defaultHtEnabled;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportHtConfig
     */
    public Boolean getSupportHtConfig() {
        return this.supportHtConfig;
    }

    public static final class Builder {
        private Boolean defaultHtEnabled; 
        private String instanceType; 
        private String requestId; 
        private Boolean supportHtConfig; 

        private Builder() {
        } 

        private Builder(GetIfEcsTypeSupportHtConfigResponseBody model) {
            this.defaultHtEnabled = model.defaultHtEnabled;
            this.instanceType = model.instanceType;
            this.requestId = model.requestId;
            this.supportHtConfig = model.supportHtConfig;
        } 

        /**
         * <p>Indicates whether Hyper-Threading is enabled by default. Valid values:</p>
         * <ul>
         * <li>true: Hyper-Threading is enabled by default.</li>
         * <li>false: Hyper-Threading is disabled by default.</li>
         * </ul>
         * <blockquote>
         * <p> By default, Hyper-Threading is not enabled for Super Computing Cluster (SCC) instance families but is enabled for other instance families.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder defaultHtEnabled(Boolean defaultHtEnabled) {
            this.defaultHtEnabled = defaultHtEnabled;
            return this;
        }

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>80CA7A93-7291-4402-B63D-86DF334E0A1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether hyper-threading is supported. Valid values:</p>
         * <ul>
         * <li>true: Hyper-threading is supported.</li>
         * <li>false: Hyper-threading is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportHtConfig(Boolean supportHtConfig) {
            this.supportHtConfig = supportHtConfig;
            return this;
        }

        public GetIfEcsTypeSupportHtConfigResponseBody build() {
            return new GetIfEcsTypeSupportHtConfigResponseBody(this);
        } 

    } 

}
