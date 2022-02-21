// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIfEcsTypeSupportHtConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetIfEcsTypeSupportHtConfigResponseBody</p>
 */
public class GetIfEcsTypeSupportHtConfigResponseBody extends TeaModel {
    @NameInMap("DefaultHtEnabled")
    private Boolean defaultHtEnabled;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportHtConfig")
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

        /**
         * DefaultHtEnabled.
         */
        public Builder defaultHtEnabled(Boolean defaultHtEnabled) {
            this.defaultHtEnabled = defaultHtEnabled;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportHtConfig.
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
