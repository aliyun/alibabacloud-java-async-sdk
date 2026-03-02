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
 * {@link PdpLanesPageResult} extends {@link TeaModel}
 *
 * <p>PdpLanesPageResult</p>
 */
public class PdpLanesPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pdpLanes")
    private java.util.List<PdpLaneInfo> pdpLanes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private PdpLanesPageResult(Builder builder) {
        this.pdpLanes = builder.pdpLanes;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLanesPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pdpLanes
     */
    public java.util.List<PdpLaneInfo> getPdpLanes() {
        return this.pdpLanes;
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
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<PdpLaneInfo> pdpLanes; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(PdpLanesPageResult model) {
            this.pdpLanes = model.pdpLanes;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * pdpLanes.
         */
        public Builder pdpLanes(java.util.List<PdpLaneInfo> pdpLanes) {
            this.pdpLanes = pdpLanes;
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
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PdpLanesPageResult build() {
            return new PdpLanesPageResult(this);
        } 

    } 

}
