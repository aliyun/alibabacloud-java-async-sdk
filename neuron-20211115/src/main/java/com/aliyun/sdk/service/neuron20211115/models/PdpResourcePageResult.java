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
 * {@link PdpResourcePageResult} extends {@link TeaModel}
 *
 * <p>PdpResourcePageResult</p>
 */
public class PdpResourcePageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<PdpResource> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private PdpResourcePageResult(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpResourcePageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<PdpResource> getList() {
        return this.list;
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
        private java.util.List<PdpResource> list; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(PdpResourcePageResult model) {
            this.list = model.list;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * list.
         */
        public Builder list(java.util.List<PdpResource> list) {
            this.list = list;
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

        public PdpResourcePageResult build() {
            return new PdpResourcePageResult(this);
        } 

    } 

}
