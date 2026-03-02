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
 * {@link ServerInstanceResult} extends {@link TeaModel}
 *
 * <p>ServerInstanceResult</p>
 */
public class ServerInstanceResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("ips")
    private java.util.List<String> ips;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ServerInstanceResult(Builder builder) {
        this.intTotal = builder.intTotal;
        this.ips = builder.ips;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServerInstanceResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intTotal
     */
    public Integer getIntTotal() {
        return this.intTotal;
    }

    /**
     * @return ips
     */
    public java.util.List<String> getIps() {
        return this.ips;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer intTotal; 
        private java.util.List<String> ips; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ServerInstanceResult model) {
            this.intTotal = model.intTotal;
            this.ips = model.ips;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * intTotal.
         */
        public Builder intTotal(Integer intTotal) {
            this.intTotal = intTotal;
            return this;
        }

        /**
         * ips.
         */
        public Builder ips(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ServerInstanceResult build() {
            return new ServerInstanceResult(this);
        } 

    } 

}
