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
 * {@link PdpPbcListResult} extends {@link TeaModel}
 *
 * <p>PdpPbcListResult</p>
 */
public class PdpPbcListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pdpPbcs")
    private java.util.List<PdpPbc> pdpPbcs;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private PdpPbcListResult(Builder builder) {
        this.pdpPbcs = builder.pdpPbcs;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpPbcListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pdpPbcs
     */
    public java.util.List<PdpPbc> getPdpPbcs() {
        return this.pdpPbcs;
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
        private java.util.List<PdpPbc> pdpPbcs; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(PdpPbcListResult model) {
            this.pdpPbcs = model.pdpPbcs;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * pdpPbcs.
         */
        public Builder pdpPbcs(java.util.List<PdpPbc> pdpPbcs) {
            this.pdpPbcs = pdpPbcs;
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

        public PdpPbcListResult build() {
            return new PdpPbcListResult(this);
        } 

    } 

}
