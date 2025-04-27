// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceDdosCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceDdosCountResponseBody</p>
 */
public class DescribeRCInstanceDdosCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosCount")
    private DdosCount ddosCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCInstanceDdosCountResponseBody(Builder builder) {
        this.ddosCount = builder.ddosCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceDdosCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRCInstanceDdosCountResponseBody model) {
            this.ddosCount = model.ddosCount;
            this.requestId = model.requestId;
        } 

        /**
         * DdosCount.
         */
        public Builder ddosCount(DdosCount ddosCount) {
            this.ddosCount = ddosCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCInstanceDdosCountResponseBody build() {
            return new DescribeRCInstanceDdosCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceDdosCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceDdosCountResponseBody</p>
     */
    public static class DdosCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackholeCount")
        private String blackholeCount;

        @com.aliyun.core.annotation.NameInMap("DefenseCount")
        private String defenseCount;

        @com.aliyun.core.annotation.NameInMap("InstacenCount")
        private String instacenCount;

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
        public String getBlackholeCount() {
            return this.blackholeCount;
        }

        /**
         * @return defenseCount
         */
        public String getDefenseCount() {
            return this.defenseCount;
        }

        /**
         * @return instacenCount
         */
        public String getInstacenCount() {
            return this.instacenCount;
        }

        public static final class Builder {
            private String blackholeCount; 
            private String defenseCount; 
            private String instacenCount; 

            private Builder() {
            } 

            private Builder(DdosCount model) {
                this.blackholeCount = model.blackholeCount;
                this.defenseCount = model.defenseCount;
                this.instacenCount = model.instacenCount;
            } 

            /**
             * BlackholeCount.
             */
            public Builder blackholeCount(String blackholeCount) {
                this.blackholeCount = blackholeCount;
                return this;
            }

            /**
             * DefenseCount.
             */
            public Builder defenseCount(String defenseCount) {
                this.defenseCount = defenseCount;
                return this;
            }

            /**
             * InstacenCount.
             */
            public Builder instacenCount(String instacenCount) {
                this.instacenCount = instacenCount;
                return this;
            }

            public DdosCount build() {
                return new DdosCount(this);
            } 

        } 

    }
}
