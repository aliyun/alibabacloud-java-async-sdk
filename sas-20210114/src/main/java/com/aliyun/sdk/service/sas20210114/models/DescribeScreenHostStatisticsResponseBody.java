// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenHostStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenHostStatisticsResponseBody</p>
 */
public class DescribeScreenHostStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScreenHostStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenHostStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeScreenHostStatisticsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScreenHostStatisticsResponseBody build() {
            return new DescribeScreenHostStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenHostStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenHostStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SafeCount")
        private java.util.List<String> safeCount;

        @com.aliyun.core.annotation.NameInMap("SuspEventMachineNames")
        private java.util.List<String> suspEventMachineNames;

        @com.aliyun.core.annotation.NameInMap("SuspEventUuids")
        private java.util.List<String> suspEventUuids;

        @com.aliyun.core.annotation.NameInMap("WeaknessMachineNames")
        private java.util.List<String> weaknessMachineNames;

        @com.aliyun.core.annotation.NameInMap("WeaknessUuids")
        private java.util.List<String> weaknessUuids;

        private Data(Builder builder) {
            this.safeCount = builder.safeCount;
            this.suspEventMachineNames = builder.suspEventMachineNames;
            this.suspEventUuids = builder.suspEventUuids;
            this.weaknessMachineNames = builder.weaknessMachineNames;
            this.weaknessUuids = builder.weaknessUuids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return safeCount
         */
        public java.util.List<String> getSafeCount() {
            return this.safeCount;
        }

        /**
         * @return suspEventMachineNames
         */
        public java.util.List<String> getSuspEventMachineNames() {
            return this.suspEventMachineNames;
        }

        /**
         * @return suspEventUuids
         */
        public java.util.List<String> getSuspEventUuids() {
            return this.suspEventUuids;
        }

        /**
         * @return weaknessMachineNames
         */
        public java.util.List<String> getWeaknessMachineNames() {
            return this.weaknessMachineNames;
        }

        /**
         * @return weaknessUuids
         */
        public java.util.List<String> getWeaknessUuids() {
            return this.weaknessUuids;
        }

        public static final class Builder {
            private java.util.List<String> safeCount; 
            private java.util.List<String> suspEventMachineNames; 
            private java.util.List<String> suspEventUuids; 
            private java.util.List<String> weaknessMachineNames; 
            private java.util.List<String> weaknessUuids; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.safeCount = model.safeCount;
                this.suspEventMachineNames = model.suspEventMachineNames;
                this.suspEventUuids = model.suspEventUuids;
                this.weaknessMachineNames = model.weaknessMachineNames;
                this.weaknessUuids = model.weaknessUuids;
            } 

            /**
             * SafeCount.
             */
            public Builder safeCount(java.util.List<String> safeCount) {
                this.safeCount = safeCount;
                return this;
            }

            /**
             * SuspEventMachineNames.
             */
            public Builder suspEventMachineNames(java.util.List<String> suspEventMachineNames) {
                this.suspEventMachineNames = suspEventMachineNames;
                return this;
            }

            /**
             * SuspEventUuids.
             */
            public Builder suspEventUuids(java.util.List<String> suspEventUuids) {
                this.suspEventUuids = suspEventUuids;
                return this;
            }

            /**
             * WeaknessMachineNames.
             */
            public Builder weaknessMachineNames(java.util.List<String> weaknessMachineNames) {
                this.weaknessMachineNames = weaknessMachineNames;
                return this;
            }

            /**
             * WeaknessUuids.
             */
            public Builder weaknessUuids(java.util.List<String> weaknessUuids) {
                this.weaknessUuids = weaknessUuids;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
