// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodMultiUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodMultiUsageDataResponseBody</p>
 */
public class DescribeVodMultiUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("MultiUsageData")
    private MultiUsageData multiUsageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodMultiUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.multiUsageData = builder.multiUsageData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodMultiUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return multiUsageData
     */
    public MultiUsageData getMultiUsageData() {
        return this.multiUsageData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private MultiUsageData multiUsageData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeVodMultiUsageDataResponseBody model) {
            this.endTime = model.endTime;
            this.multiUsageData = model.multiUsageData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * MultiUsageData.
         */
        public Builder multiUsageData(MultiUsageData multiUsageData) {
            this.multiUsageData = multiUsageData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodMultiUsageDataResponseBody build() {
            return new DescribeVodMultiUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodMultiUsageDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private DataModule(Builder builder) {
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private Long value; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.value = model.value;
                this.valueType = model.valueType;
            } 

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodMultiUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodMultiUsageDataResponseBody</p>
     */
    public static class MultiUsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private MultiUsageData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiUsageData create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            private Builder() {
            } 

            private Builder(MultiUsageData model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public MultiUsageData build() {
                return new MultiUsageData(this);
            } 

        } 

    }
}
