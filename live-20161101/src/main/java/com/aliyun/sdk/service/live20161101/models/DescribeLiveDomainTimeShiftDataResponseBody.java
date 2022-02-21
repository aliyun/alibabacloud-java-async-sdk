// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainTimeShiftDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainTimeShiftDataResponseBody</p>
 */
public class DescribeLiveDomainTimeShiftDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeShiftData")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeShiftData.
         */
        public Builder timeShiftData(TimeShiftData timeShiftData) {
            this.timeShiftData = timeShiftData;
            return this;
        }

        public DescribeLiveDomainTimeShiftDataResponseBody build() {
            return new DescribeLiveDomainTimeShiftDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Size")
        private String size;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Type")
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

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Type.
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
    public static class TimeShiftData extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

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
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public TimeShiftData build() {
                return new TimeShiftData(this);
            } 

        } 

    }
}
