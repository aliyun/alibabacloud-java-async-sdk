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
 * {@link PdpImagePageResult} extends {@link TeaModel}
 *
 * <p>PdpImagePageResult</p>
 */
public class PdpImagePageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<PdpImage> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private PdpImagePageResult(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpImagePageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<PdpImage> getData() {
        return this.data;
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
        private java.util.List<PdpImage> data; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(PdpImagePageResult model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<PdpImage> data) {
            this.data = data;
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

        public PdpImagePageResult build() {
            return new PdpImagePageResult(this);
        } 

    } 

}
