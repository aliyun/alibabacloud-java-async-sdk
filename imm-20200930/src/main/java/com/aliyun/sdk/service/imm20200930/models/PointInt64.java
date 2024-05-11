// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PointInt64} extends {@link TeaModel}
 *
 * <p>PointInt64</p>
 */
public class PointInt64 extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("X")
    private Long x;

    @com.aliyun.core.annotation.NameInMap("Y")
    private Long y;

    private PointInt64(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PointInt64 create() {
        return builder().build();
    }

    /**
     * @return x
     */
    public Long getX() {
        return this.x;
    }

    /**
     * @return y
     */
    public Long getY() {
        return this.y;
    }

    public static final class Builder {
        private Long x; 
        private Long y; 

        /**
         * X.
         */
        public Builder x(Long x) {
            this.x = x;
            return this;
        }

        /**
         * Y.
         */
        public Builder y(Long y) {
            this.y = y;
            return this;
        }

        public PointInt64 build() {
            return new PointInt64(this);
        } 

    } 

}
