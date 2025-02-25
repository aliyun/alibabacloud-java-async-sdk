// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosCountResponseBody</p>
 */
public class DescribeDdosCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosCount")
    private DdosCount ddosCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDdosCountResponseBody(Builder builder) {
        this.ddosCount = builder.ddosCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return ddosCount
     */
    public DdosCount getDdosCount() {
        return this.ddosCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DdosCount ddosCount; 
        private String requestId; 

        /**
         * The number of assets that are under DDoS attacks.
         */
        public Builder ddosCount(DdosCount ddosCount) {
            this.ddosCount = ddosCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDdosCountResponseBody build() {
            return new DescribeDdosCountResponseBody(this);
        } 

    } 

    public static class DdosCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackholeCount")
        private Integer blackholeCount;

        @com.aliyun.core.annotation.NameInMap("DefenseCount")
        private Integer defenseCount;

        @com.aliyun.core.annotation.NameInMap("InstacenCount")
        private Integer instacenCount;

        private DdosCount(Builder builder) {
            this.blackholeCount = builder.blackholeCount;
            this.defenseCount = builder.defenseCount;
            this.instacenCount = builder.instacenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosCount create() {
            return builder().build();
        }

        /**
         * @return blackholeCount
         */
        public Integer getBlackholeCount() {
            return this.blackholeCount;
        }

        /**
         * @return defenseCount
         */
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        /**
         * @return instacenCount
         */
        public Integer getInstacenCount() {
            return this.instacenCount;
        }

        public static final class Builder {
            private Integer blackholeCount; 
            private Integer defenseCount; 
            private Integer instacenCount; 

            /**
             * The number of assets for which blackhole filtering is triggered.
             */
            public Builder blackholeCount(Integer blackholeCount) {
                this.blackholeCount = blackholeCount;
                return this;
            }

            /**
             * The number of assets for which traffic scrubbing is triggered.
             */
            public Builder defenseCount(Integer defenseCount) {
                this.defenseCount = defenseCount;
                return this;
            }

            /**
             * The total number of assets.
             */
            public Builder instacenCount(Integer instacenCount) {
                this.instacenCount = instacenCount;
                return this;
            }

            public DdosCount build() {
                return new DdosCount(this);
            } 

        } 

    }
}
