// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDdosMaxBurstGbpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosMaxBurstGbpsResponseBody</p>
 */
public class DescribeDdosMaxBurstGbpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("MaxBurstGbps")
    private String maxBurstGbps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDdosMaxBurstGbpsResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.maxBurstGbps = builder.maxBurstGbps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosMaxBurstGbpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxBurstGbps
     */
    public String getMaxBurstGbps() {
        return this.maxBurstGbps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String maxBurstGbps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDdosMaxBurstGbpsResponseBody model) {
            this.instanceId = model.instanceId;
            this.maxBurstGbps = model.maxBurstGbps;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxBurstGbps.
         */
        public Builder maxBurstGbps(String maxBurstGbps) {
            this.maxBurstGbps = maxBurstGbps;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B5D71671-B074-5702-A0F5-B923920FDDD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDdosMaxBurstGbpsResponseBody build() {
            return new DescribeDdosMaxBurstGbpsResponseBody(this);
        } 

    } 

}
