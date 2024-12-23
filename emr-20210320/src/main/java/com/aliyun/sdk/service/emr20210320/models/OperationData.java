// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link OperationData} extends {@link TeaModel}
 *
 * <p>OperationData</p>
 */
public class OperationData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actualDeliveredAmounts")
    private Integer actualDeliveredAmounts;

    @com.aliyun.core.annotation.NameInMap("toBeDeliveredAmounts")
    private Integer toBeDeliveredAmounts;

    private OperationData(Builder builder) {
        this.actualDeliveredAmounts = builder.actualDeliveredAmounts;
        this.toBeDeliveredAmounts = builder.toBeDeliveredAmounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationData create() {
        return builder().build();
    }

    /**
     * @return actualDeliveredAmounts
     */
    public Integer getActualDeliveredAmounts() {
        return this.actualDeliveredAmounts;
    }

    /**
     * @return toBeDeliveredAmounts
     */
    public Integer getToBeDeliveredAmounts() {
        return this.toBeDeliveredAmounts;
    }

    public static final class Builder {
        private Integer actualDeliveredAmounts; 
        private Integer toBeDeliveredAmounts; 

        /**
         * actualDeliveredAmounts.
         */
        public Builder actualDeliveredAmounts(Integer actualDeliveredAmounts) {
            this.actualDeliveredAmounts = actualDeliveredAmounts;
            return this;
        }

        /**
         * toBeDeliveredAmounts.
         */
        public Builder toBeDeliveredAmounts(Integer toBeDeliveredAmounts) {
            this.toBeDeliveredAmounts = toBeDeliveredAmounts;
            return this;
        }

        public OperationData build() {
            return new OperationData(this);
        } 

    } 

}
