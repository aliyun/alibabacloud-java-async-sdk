// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationVerticallyRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationVerticallyRequest</p>
 */
public class RescaleApplicationVerticallyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memory;

    private RescaleApplicationVerticallyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationVerticallyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationVerticallyRequest, Builder> {
        private String appId; 
        private String cpu; 
        private String memory; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationVerticallyRequest request) {
            super(request);
            this.appId = request.appId;
            this.cpu = request.cpu;
            this.memory = request.memory;
        } 

        /**
         * The application ID.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The destination CPU specification. Unit: millicore.
         */
        public Builder cpu(String cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The destination memory size. Unit: MB.
         */
        public Builder memory(String memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        @Override
        public RescaleApplicationVerticallyRequest build() {
            return new RescaleApplicationVerticallyRequest(this);
        } 

    } 

}
