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
 * {@link NeuronDraftRecordPageResult} extends {@link TeaModel}
 *
 * <p>NeuronDraftRecordPageResult</p>
 */
public class NeuronDraftRecordPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<NeuronDraftRecord> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private NeuronDraftRecordPageResult(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronDraftRecordPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<NeuronDraftRecord> getData() {
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
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<NeuronDraftRecord> data; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(NeuronDraftRecordPageResult model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<NeuronDraftRecord> data) {
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
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public NeuronDraftRecordPageResult build() {
            return new NeuronDraftRecordPageResult(this);
        } 

    } 

}
