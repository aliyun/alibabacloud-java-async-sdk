// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link WafQuotaInteger} extends {@link TeaModel}
 *
 * <p>WafQuotaInteger</p>
 */
public class WafQuotaInteger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Equal")
    private Integer equal;

    @com.aliyun.core.annotation.NameInMap("GreaterThan")
    private Integer greaterThan;

    @com.aliyun.core.annotation.NameInMap("GreaterThanOrEqual")
    private Integer greaterThanOrEqual;

    @com.aliyun.core.annotation.NameInMap("LessThan")
    private Integer lessThan;

    @com.aliyun.core.annotation.NameInMap("LessThanOrEqual")
    private Integer lessThanOrEqual;

    private WafQuotaInteger(Builder builder) {
        this.equal = builder.equal;
        this.greaterThan = builder.greaterThan;
        this.greaterThanOrEqual = builder.greaterThanOrEqual;
        this.lessThan = builder.lessThan;
        this.lessThanOrEqual = builder.lessThanOrEqual;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafQuotaInteger create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return equal
     */
    public Integer getEqual() {
        return this.equal;
    }

    /**
     * @return greaterThan
     */
    public Integer getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * @return greaterThanOrEqual
     */
    public Integer getGreaterThanOrEqual() {
        return this.greaterThanOrEqual;
    }

    /**
     * @return lessThan
     */
    public Integer getLessThan() {
        return this.lessThan;
    }

    /**
     * @return lessThanOrEqual
     */
    public Integer getLessThanOrEqual() {
        return this.lessThanOrEqual;
    }

    public static final class Builder {
        private Integer equal; 
        private Integer greaterThan; 
        private Integer greaterThanOrEqual; 
        private Integer lessThan; 
        private Integer lessThanOrEqual; 

        private Builder() {
        } 

        private Builder(WafQuotaInteger model) {
            this.equal = model.equal;
            this.greaterThan = model.greaterThan;
            this.greaterThanOrEqual = model.greaterThanOrEqual;
            this.lessThan = model.lessThan;
            this.lessThanOrEqual = model.lessThanOrEqual;
        } 

        /**
         * Equal.
         */
        public Builder equal(Integer equal) {
            this.equal = equal;
            return this;
        }

        /**
         * GreaterThan.
         */
        public Builder greaterThan(Integer greaterThan) {
            this.greaterThan = greaterThan;
            return this;
        }

        /**
         * GreaterThanOrEqual.
         */
        public Builder greaterThanOrEqual(Integer greaterThanOrEqual) {
            this.greaterThanOrEqual = greaterThanOrEqual;
            return this;
        }

        /**
         * LessThan.
         */
        public Builder lessThan(Integer lessThan) {
            this.lessThan = lessThan;
            return this;
        }

        /**
         * LessThanOrEqual.
         */
        public Builder lessThanOrEqual(Integer lessThanOrEqual) {
            this.lessThanOrEqual = lessThanOrEqual;
            return this;
        }

        public WafQuotaInteger build() {
            return new WafQuotaInteger(this);
        } 

    } 

}
