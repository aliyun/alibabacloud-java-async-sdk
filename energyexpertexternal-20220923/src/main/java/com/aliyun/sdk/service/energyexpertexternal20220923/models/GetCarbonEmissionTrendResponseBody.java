// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetCarbonEmissionTrendResponseBody</p>
 */
public class GetCarbonEmissionTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCarbonEmissionTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCarbonEmissionTrendResponseBody create() {
        return builder().build();
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

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9bc20a5a-b26b-4c28-922a-7cd10b61f96f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCarbonEmissionTrendResponseBody build() {
            return new GetCarbonEmissionTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetCarbonEmissionTrendResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private Items(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.month = builder.month;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private Integer month; 
            private String year; 

            /**
             * <p>Carbon emissions.</p>
             * 
             * <strong>example:</strong>
             * <p>20.22</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The month.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetCarbonEmissionTrendResponseBody</p>
     */
    public static class ActualEmissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private ActualEmissionList(Builder builder) {
            this.items = builder.items;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActualEmissionList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String year; 

            /**
             * <p>Data item list.</p>
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public ActualEmissionList build() {
                return new ActualEmissionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetCarbonEmissionTrendResponseBody</p>
     */
    public static class TargetEmissionListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private TargetEmissionListItems(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.month = builder.month;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetEmissionListItems create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return month
         */
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private Integer month; 
            private String year; 

            /**
             * <p>Carbon emissions.</p>
             * 
             * <strong>example:</strong>
             * <p>20.22</p>
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * <p>The month.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public TargetEmissionListItems build() {
                return new TargetEmissionListItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetCarbonEmissionTrendResponseBody</p>
     */
    public static class TargetEmissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < TargetEmissionListItems> items;

        @com.aliyun.core.annotation.NameInMap("year")
        private String year;

        private TargetEmissionList(Builder builder) {
            this.items = builder.items;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetEmissionList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < TargetEmissionListItems> getItems() {
            return this.items;
        }

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private java.util.List < TargetEmissionListItems> items; 
            private String year; 

            /**
             * <p>Data item list.</p>
             */
            public Builder items(java.util.List < TargetEmissionListItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public TargetEmissionList build() {
                return new TargetEmissionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCarbonEmissionTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetCarbonEmissionTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualEmissionList")
        private java.util.List < ActualEmissionList> actualEmissionList;

        @com.aliyun.core.annotation.NameInMap("targetEmissionList")
        private java.util.List < TargetEmissionList> targetEmissionList;

        private Data(Builder builder) {
            this.actualEmissionList = builder.actualEmissionList;
            this.targetEmissionList = builder.targetEmissionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actualEmissionList
         */
        public java.util.List < ActualEmissionList> getActualEmissionList() {
            return this.actualEmissionList;
        }

        /**
         * @return targetEmissionList
         */
        public java.util.List < TargetEmissionList> getTargetEmissionList() {
            return this.targetEmissionList;
        }

        public static final class Builder {
            private java.util.List < ActualEmissionList> actualEmissionList; 
            private java.util.List < TargetEmissionList> targetEmissionList; 

            /**
             * <p>Actual emission list.</p>
             */
            public Builder actualEmissionList(java.util.List < ActualEmissionList> actualEmissionList) {
                this.actualEmissionList = actualEmissionList;
                return this;
            }

            /**
             * <p>Target Emission List.</p>
             */
            public Builder targetEmissionList(java.util.List < TargetEmissionList> targetEmissionList) {
                this.targetEmissionList = targetEmissionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
