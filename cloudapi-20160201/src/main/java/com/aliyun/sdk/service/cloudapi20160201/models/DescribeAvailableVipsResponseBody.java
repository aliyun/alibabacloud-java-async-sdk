// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableVipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableVipsResponseBody</p>
 */
public class DescribeAvailableVipsResponseBody extends TeaModel {
    @NameInMap("AvailableVips")
    private AvailableVips availableVips;

    private DescribeAvailableVipsResponseBody(Builder builder) {
        this.availableVips = builder.availableVips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableVipsResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableVips
     */
    public AvailableVips getAvailableVips() {
        return this.availableVips;
    }

    public static final class Builder {
        private AvailableVips availableVips; 

        /**
         * AvailableVips.
         */
        public Builder availableVips(AvailableVips availableVips) {
            this.availableVips = availableVips;
            return this;
        }

        public DescribeAvailableVipsResponseBody build() {
            return new DescribeAvailableVipsResponseBody(this);
        } 

    } 

    public static class AvailableVips extends TeaModel {
        @NameInMap("AvailableVip")
        private java.util.List < String > availableVip;

        private AvailableVips(Builder builder) {
            this.availableVip = builder.availableVip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableVips create() {
            return builder().build();
        }

        /**
         * @return availableVip
         */
        public java.util.List < String > getAvailableVip() {
            return this.availableVip;
        }

        public static final class Builder {
            private java.util.List < String > availableVip; 

            /**
             * AvailableVip.
             */
            public Builder availableVip(java.util.List < String > availableVip) {
                this.availableVip = availableVip;
                return this;
            }

            public AvailableVips build() {
                return new AvailableVips(this);
            } 

        } 

    }
}
