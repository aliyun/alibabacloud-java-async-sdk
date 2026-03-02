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
 * {@link MicroServicePageResult} extends {@link TeaModel}
 *
 * <p>MicroServicePageResult</p>
 */
public class MicroServicePageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MicroServiceDigests")
    private java.util.List<MicroServiceDigest> microServiceDigests;

    @com.aliyun.core.annotation.NameInMap("intTotal")
    private Integer intTotal;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MicroServicePageResult(Builder builder) {
        this.microServiceDigests = builder.microServiceDigests;
        this.intTotal = builder.intTotal;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MicroServicePageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return microServiceDigests
     */
    public java.util.List<MicroServiceDigest> getMicroServiceDigests() {
        return this.microServiceDigests;
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
        private java.util.List<MicroServiceDigest> microServiceDigests; 
        private Integer intTotal; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MicroServicePageResult model) {
            this.microServiceDigests = model.microServiceDigests;
            this.intTotal = model.intTotal;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * MicroServiceDigests.
         */
        public Builder microServiceDigests(java.util.List<MicroServiceDigest> microServiceDigests) {
            this.microServiceDigests = microServiceDigests;
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

        public MicroServicePageResult build() {
            return new MicroServicePageResult(this);
        } 

    } 

}
