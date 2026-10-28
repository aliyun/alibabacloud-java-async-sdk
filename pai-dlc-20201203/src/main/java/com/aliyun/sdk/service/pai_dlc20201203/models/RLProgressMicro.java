// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLProgressMicro} extends {@link TeaModel}
 *
 * <p>RLProgressMicro</p>
 */
public class RLProgressMicro extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private RLProgressMicro(Builder builder) {
        this.current = builder.current;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressMicro create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer current; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(RLProgressMicro model) {
            this.current = model.current;
            this.total = model.total;
        } 

        /**
         * <p>The current micro-batch ordinal number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * <p>The micro-batch total count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public RLProgressMicro build() {
            return new RLProgressMicro(this);
        } 

    } 

}
