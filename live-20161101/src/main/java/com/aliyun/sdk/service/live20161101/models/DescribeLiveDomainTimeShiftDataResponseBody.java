// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainTimeShiftDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainTimeShiftDataResponseBody</p>
 */
public class DescribeLiveDomainTimeShiftDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeShiftData")
    private TimeShiftData timeShiftData;

    private DescribeLiveDomainTimeShiftDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeShiftData = builder.timeShiftData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainTimeShiftDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeShiftData
     */
    public TimeShiftData getTimeShiftData() {
        return this.timeShiftData;
    }

    public static final class Builder {
        private String requestId; 
        private TimeShiftData timeShiftData; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainTimeShiftDataResponseBody model) {
            this.requestId = model.requestId;
            this.timeShiftData = model.timeShiftData;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8AE1CB3A-6510-442E-A6B9-EF03D05B3E09</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time shifting usage data that was collected for each time interval.</p>
         */
        public Builder timeShiftData(TimeShiftData timeShiftData) {
            this.timeShiftData = timeShiftData;
            return this;
        }

        public DescribeLiveDomainTimeShiftDataResponseBody build() {
            return new DescribeLiveDomainTimeShiftDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainTimeShiftDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainTimeShiftDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataModule(Builder builder) {
            this.size = builder.size;
            this.timeStamp = builder.timeStamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String size; 
            private String timeStamp; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataModule model) {
                this.size = model.size;
                this.timeStamp = model.timeStamp;
                this.type = model.type;
            } 

            /**
             * <p>The storage used for time shifting. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1664165660</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-03T00:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The type of time shifting. Examples: HLS_D1 and HLS_D7.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS_D7</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainTimeShiftDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainTimeShiftDataResponseBody</p>
     */
    public static class TimeShiftData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private TimeShiftData(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeShiftData create() {
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

            private Builder(TimeShiftData model) {
                this.dataModule = model.dataModule;
            } 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public TimeShiftData build() {
                return new TimeShiftData(this);
            } 

        } 

    }
}
