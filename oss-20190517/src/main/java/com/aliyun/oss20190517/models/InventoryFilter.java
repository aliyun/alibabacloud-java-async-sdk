// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InventoryFilter} extends {@link TeaModel}
 *
 * <p>InventoryFilter</p>
 */
public class InventoryFilter extends TeaModel {
    @NameInMap("Prefix")
    private String prefix;


    private InventoryFilter(Builder builder) {
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryFilter create() {
        return builder().build();
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    public static final class Builder {
        private String prefix; 

        /**
         * <p>The prefix specified in the inventory rule</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public InventoryFilter build() {
            return new InventoryFilter(this);
        } 

    } 

}
