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
 * {@link MqTopicSubsPageResult} extends {@link TeaModel}
 *
 * <p>MqTopicSubsPageResult</p>
 */
public class MqTopicSubsPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MqTopicSubsDigests")
    private java.util.List<MqTopicSubsDigest> mqTopicSubsDigests;

    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MqTopicSubsPageResult(Builder builder) {
        this.mqTopicSubsDigests = builder.mqTopicSubsDigests;
        this.intTotal = builder.intTotal;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqTopicSubsPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mqTopicSubsDigests
     */
    public java.util.List<MqTopicSubsDigest> getMqTopicSubsDigests() {
        return this.mqTopicSubsDigests;
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
        private java.util.List<MqTopicSubsDigest> mqTopicSubsDigests; 
        private Integer intTotal; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MqTopicSubsPageResult model) {
            this.mqTopicSubsDigests = model.mqTopicSubsDigests;
            this.intTotal = model.intTotal;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * MqTopicSubsDigests.
         */
        public Builder mqTopicSubsDigests(java.util.List<MqTopicSubsDigest> mqTopicSubsDigests) {
            this.mqTopicSubsDigests = mqTopicSubsDigests;
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

        public MqTopicSubsPageResult build() {
            return new MqTopicSubsPageResult(this);
        } 

    } 

}
