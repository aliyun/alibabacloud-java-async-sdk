// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckTimeDimensionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckTimeDimensionStatisticResponseBody</p>
 */
public class GetCheckTimeDimensionStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeDimensionStatisticDTO")
    private TimeDimensionStatisticDTO timeDimensionStatisticDTO;

    private GetCheckTimeDimensionStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeDimensionStatisticDTO = builder.timeDimensionStatisticDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckTimeDimensionStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeDimensionStatisticDTO
     */
    public TimeDimensionStatisticDTO getTimeDimensionStatisticDTO() {
        return this.timeDimensionStatisticDTO;
    }

    public static final class Builder {
        private String requestId; 
        private TimeDimensionStatisticDTO timeDimensionStatisticDTO; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeDimensionStatisticDTO.
         */
        public Builder timeDimensionStatisticDTO(TimeDimensionStatisticDTO timeDimensionStatisticDTO) {
            this.timeDimensionStatisticDTO = timeDimensionStatisticDTO;
            return this;
        }

        public GetCheckTimeDimensionStatisticResponseBody build() {
            return new GetCheckTimeDimensionStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckTimeDimensionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckTimeDimensionStatisticResponseBody</p>
     */
    public static class StatisticDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private StatisticDatas(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticDatas create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Integer value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public StatisticDatas build() {
                return new StatisticDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckTimeDimensionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckTimeDimensionStatisticResponseBody</p>
     */
    public static class TimeDimensionStatisticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataTime")
        private Long dataTime;

        @com.aliyun.core.annotation.NameInMap("StatisticDatas")
        private java.util.List<StatisticDatas> statisticDatas;

        private TimeDimensionStatisticItems(Builder builder) {
            this.dataTime = builder.dataTime;
            this.statisticDatas = builder.statisticDatas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeDimensionStatisticItems create() {
            return builder().build();
        }

        /**
         * @return dataTime
         */
        public Long getDataTime() {
            return this.dataTime;
        }

        /**
         * @return statisticDatas
         */
        public java.util.List<StatisticDatas> getStatisticDatas() {
            return this.statisticDatas;
        }

        public static final class Builder {
            private Long dataTime; 
            private java.util.List<StatisticDatas> statisticDatas; 

            /**
             * DataTime.
             */
            public Builder dataTime(Long dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * StatisticDatas.
             */
            public Builder statisticDatas(java.util.List<StatisticDatas> statisticDatas) {
                this.statisticDatas = statisticDatas;
                return this;
            }

            public TimeDimensionStatisticItems build() {
                return new TimeDimensionStatisticItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckTimeDimensionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckTimeDimensionStatisticResponseBody</p>
     */
    public static class TimeDimensionStatisticDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dates")
        private java.util.List<Long> dates;

        @com.aliyun.core.annotation.NameInMap("StatisticType")
        private String statisticType;

        @com.aliyun.core.annotation.NameInMap("TimeDimensionStatisticItems")
        private java.util.List<TimeDimensionStatisticItems> timeDimensionStatisticItems;

        private TimeDimensionStatisticDTO(Builder builder) {
            this.dates = builder.dates;
            this.statisticType = builder.statisticType;
            this.timeDimensionStatisticItems = builder.timeDimensionStatisticItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeDimensionStatisticDTO create() {
            return builder().build();
        }

        /**
         * @return dates
         */
        public java.util.List<Long> getDates() {
            return this.dates;
        }

        /**
         * @return statisticType
         */
        public String getStatisticType() {
            return this.statisticType;
        }

        /**
         * @return timeDimensionStatisticItems
         */
        public java.util.List<TimeDimensionStatisticItems> getTimeDimensionStatisticItems() {
            return this.timeDimensionStatisticItems;
        }

        public static final class Builder {
            private java.util.List<Long> dates; 
            private String statisticType; 
            private java.util.List<TimeDimensionStatisticItems> timeDimensionStatisticItems; 

            /**
             * Dates.
             */
            public Builder dates(java.util.List<Long> dates) {
                this.dates = dates;
                return this;
            }

            /**
             * StatisticType.
             */
            public Builder statisticType(String statisticType) {
                this.statisticType = statisticType;
                return this;
            }

            /**
             * TimeDimensionStatisticItems.
             */
            public Builder timeDimensionStatisticItems(java.util.List<TimeDimensionStatisticItems> timeDimensionStatisticItems) {
                this.timeDimensionStatisticItems = timeDimensionStatisticItems;
                return this;
            }

            public TimeDimensionStatisticDTO build() {
                return new TimeDimensionStatisticDTO(this);
            } 

        } 

    }
}
