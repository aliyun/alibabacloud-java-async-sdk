// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDomainUsedPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainUsedPortsResponseBody</p>
 */
public class DescribeDomainUsedPortsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsedPorts")
    private java.util.List<Integer> usedPorts;

    private DescribeDomainUsedPortsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usedPorts = builder.usedPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainUsedPortsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usedPorts
     */
    public java.util.List<Integer> getUsedPorts() {
        return this.usedPorts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Integer> usedPorts; 

        private Builder() {
        } 

        private Builder(DescribeDomainUsedPortsResponseBody model) {
            this.requestId = model.requestId;
            this.usedPorts = model.usedPorts;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsedPorts.
         */
        public Builder usedPorts(java.util.List<Integer> usedPorts) {
            this.usedPorts = usedPorts;
            return this;
        }

        public DescribeDomainUsedPortsResponseBody build() {
            return new DescribeDomainUsedPortsResponseBody(this);
        } 

    } 

}
