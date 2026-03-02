// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MicroServiceDigest} extends {@link TeaModel}
 *
 * <p>MicroServiceDigest</p>
 */
public class MicroServiceDigest extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("laneMqGroupInfos")
    private LaneMqGroupInfo laneMqGroupInfos;

    private MicroServiceDigest(Builder builder) {
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.laneMqGroupInfos = builder.laneMqGroupInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MicroServiceDigest create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return laneMqGroupInfos
     */
    public LaneMqGroupInfo getLaneMqGroupInfos() {
        return this.laneMqGroupInfos;
    }

    public static final class Builder {
        private Long serviceId; 
        private String serviceName; 
        private LaneMqGroupInfo laneMqGroupInfos; 

        private Builder() {
        } 

        private Builder(MicroServiceDigest model) {
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.laneMqGroupInfos = model.laneMqGroupInfos;
        } 

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * laneMqGroupInfos.
         */
        public Builder laneMqGroupInfos(LaneMqGroupInfo laneMqGroupInfos) {
            this.laneMqGroupInfos = laneMqGroupInfos;
            return this;
        }

        public MicroServiceDigest build() {
            return new MicroServiceDigest(this);
        } 

    } 

}
