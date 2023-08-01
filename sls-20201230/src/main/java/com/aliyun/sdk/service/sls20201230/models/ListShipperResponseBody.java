// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListShipperResponseBody} extends {@link TeaModel}
 *
 * <p>ListShipperResponseBody</p>
 */
public class ListShipperResponseBody extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("shipper")
    private java.util.List < String > shipper;

    @NameInMap("total")
    private Long total;

    private ListShipperResponseBody(Builder builder) {
        this.count = builder.count;
        this.shipper = builder.shipper;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShipperResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return shipper
     */
    public java.util.List < String > getShipper() {
        return this.shipper;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List < String > shipper; 
        private Long total; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * shipper.
         */
        public Builder shipper(java.util.List < String > shipper) {
            this.shipper = shipper;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListShipperResponseBody build() {
            return new ListShipperResponseBody(this);
        } 

    } 

}
