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
 * {@link MqTopicPageResult} extends {@link TeaModel}
 *
 * <p>MqTopicPageResult</p>
 */
public class MqTopicPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MqTopicDigests")
    private java.util.List<MqTopicDigest> mqTopicDigests;

    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MqTopicPageResult(Builder builder) {
        this.mqTopicDigests = builder.mqTopicDigests;
        this.intTotal = builder.intTotal;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqTopicPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqTopicDigests
     */
    public java.util.List<MqTopicDigest> getMqTopicDigests() {
        return this.mqTopicDigests;
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
        private java.util.List<MqTopicDigest> mqTopicDigests; 
        private Integer intTotal; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MqTopicPageResult model) {
            this.mqTopicDigests = model.mqTopicDigests;
            this.intTotal = model.intTotal;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * MqTopicDigests.
         */
        public Builder mqTopicDigests(java.util.List<MqTopicDigest> mqTopicDigests) {
            this.mqTopicDigests = mqTopicDigests;
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

        public MqTopicPageResult build() {
            return new MqTopicPageResult(this);
        } 

    } 

}
