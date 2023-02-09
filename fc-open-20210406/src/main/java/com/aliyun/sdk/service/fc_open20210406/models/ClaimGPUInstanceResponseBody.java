// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClaimGPUInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ClaimGPUInstanceResponseBody</p>
 */
public class ClaimGPUInstanceResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("publicIp")
    private String publicIp;

    private ClaimGPUInstanceResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.instanceId = builder.instanceId;
        this.publicIp = builder.publicIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClaimGPUInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    public static final class Builder {
        private String createdTime; 
        private String instanceId; 
        private String publicIp; 

        /**
         * The time when the product instance is created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The ID of the instance that you query.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The public IP address of the server.
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        public ClaimGPUInstanceResponseBody build() {
            return new ClaimGPUInstanceResponseBody(this);
        } 

    } 

}
