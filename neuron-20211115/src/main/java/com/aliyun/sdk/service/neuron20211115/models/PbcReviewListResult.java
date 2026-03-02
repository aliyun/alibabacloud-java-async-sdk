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
 * {@link PbcReviewListResult} extends {@link TeaModel}
 *
 * <p>PbcReviewListResult</p>
 */
public class PbcReviewListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<PbcReview> data;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private PbcReviewListResult(Builder builder) {
        this.data = builder.data;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcReviewListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<PbcReview> getData() {
        return this.data;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<PbcReview> data; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(PbcReviewListResult model) {
            this.data = model.data;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<PbcReview> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>总数量</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PbcReviewListResult build() {
            return new PbcReviewListResult(this);
        } 

    } 

}
