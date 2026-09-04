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
 * {@link RLProgressProcessed} extends {@link TeaModel}
 *
 * <p>RLProgressProcessed</p>
 */
public class RLProgressProcessed extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Done")
    private Integer done;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private RLProgressProcessed(Builder builder) {
        this.done = builder.done;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressProcessed create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return done
     */
    public Integer getDone() {
        return this.done;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer done; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(RLProgressProcessed model) {
            this.done = model.done;
            this.total = model.total;
        } 

        /**
         * <p>已处理条数</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder done(Integer done) {
            this.done = done;
            return this;
        }

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public RLProgressProcessed build() {
            return new RLProgressProcessed(this);
        } 

    } 

}
