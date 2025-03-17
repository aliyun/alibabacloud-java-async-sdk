// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DLOrder} extends {@link TeaModel}
 *
 * <p>DLOrder</p>
 */
public class DLOrder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Col")
    private String col;

    @com.aliyun.core.annotation.NameInMap("Order")
    private Integer order;

    private DLOrder(Builder builder) {
        this.col = builder.col;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLOrder create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return col
     */
    public String getCol() {
        return this.col;
    }

    /**
     * @return order
     */
    public Integer getOrder() {
        return this.order;
    }

    public static final class Builder {
        private String col; 
        private Integer order; 

        private Builder() {
        } 

        private Builder(DLOrder model) {
            this.col = model.col;
            this.order = model.order;
        } 

        /**
         * Col.
         */
        public Builder col(String col) {
            this.col = col;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(Integer order) {
            this.order = order;
            return this;
        }

        public DLOrder build() {
            return new DLOrder(this);
        } 

    } 

}
