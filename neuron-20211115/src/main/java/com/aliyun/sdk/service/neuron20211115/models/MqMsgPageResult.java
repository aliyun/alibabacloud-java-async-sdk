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
 * {@link MqMsgPageResult} extends {@link TeaModel}
 *
 * <p>MqMsgPageResult</p>
 */
public class MqMsgPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MqMsgDigests")
    private java.util.List<MqMsgDigest> mqMsgDigests;

    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MqMsgPageResult(Builder builder) {
        this.mqMsgDigests = builder.mqMsgDigests;
        this.intTotal = builder.intTotal;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqMsgPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqMsgDigests
     */
    public java.util.List<MqMsgDigest> getMqMsgDigests() {
        return this.mqMsgDigests;
    }

    /**
     * @return intTotal
     */
    public Integer getIntTotal() {
        return this.intTotal;
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
        private java.util.List<MqMsgDigest> mqMsgDigests; 
        private Integer intTotal; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MqMsgPageResult model) {
            this.mqMsgDigests = model.mqMsgDigests;
            this.intTotal = model.intTotal;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * MqMsgDigests.
         */
        public Builder mqMsgDigests(java.util.List<MqMsgDigest> mqMsgDigests) {
            this.mqMsgDigests = mqMsgDigests;
            return this;
        }

        /**
         * intTotal.
         */
        public Builder intTotal(Integer intTotal) {
            this.intTotal = intTotal;
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

        public MqMsgPageResult build() {
            return new MqMsgPageResult(this);
        } 

    } 

}
