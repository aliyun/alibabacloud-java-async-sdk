// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeSavingsPlansCoverageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansCoverageTotalResponseBody</p>
 */
public class DescribeSavingsPlansCoverageTotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSavingsPlansCoverageTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansCoverageTotalResponseBody build() {
            return new DescribeSavingsPlansCoverageTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalResponseBody</p>
     */
    public static class PeriodCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Float percentage;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        private PeriodCoverage(Builder builder) {
            this.percentage = builder.percentage;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodCoverage create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Float getPercentage() {
            return this.percentage;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Float percentage; 
            private String period; 

            /**
             * <p>The coverage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder percentage(Float percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The period.</p>
             * <p>The value is in the format of yyyyMMddHH.</p>
             * 
             * <strong>example:</strong>
             * <p>2021071500</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            public PeriodCoverage build() {
                return new PeriodCoverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSavingsPlansCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalResponseBody</p>
     */
    public static class TotalCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @com.aliyun.core.annotation.NameInMap("DeductAmount")
        private Float deductAmount;

        private TotalCoverage(Builder builder) {
            this.coveragePercentage = builder.coveragePercentage;
            this.deductAmount = builder.deductAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalCoverage create() {
            return builder().build();
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        /**
         * @return deductAmount
         */
        public Float getDeductAmount() {
            return this.deductAmount;
        }

        public static final class Builder {
            private Float coveragePercentage; 
            private Float deductAmount; 

            /**
             * <p>The total coverage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * <p>The total deducted amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder deductAmount(Float deductAmount) {
                this.deductAmount = deductAmount;
                return this;
            }

            public TotalCoverage build() {
                return new TotalCoverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSavingsPlansCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodCoverage")
        private java.util.List<PeriodCoverage> periodCoverage;

        @com.aliyun.core.annotation.NameInMap("TotalCoverage")
        private TotalCoverage totalCoverage;

        private Data(Builder builder) {
            this.periodCoverage = builder.periodCoverage;
            this.totalCoverage = builder.totalCoverage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return periodCoverage
         */
        public java.util.List<PeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        /**
         * @return totalCoverage
         */
        public TotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

        public static final class Builder {
            private java.util.List<PeriodCoverage> periodCoverage; 
            private TotalCoverage totalCoverage; 

            /**
             * <p>The coverage in different periods.</p>
             */
            public Builder periodCoverage(java.util.List<PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * <p>The coverage summary.</p>
             */
            public Builder totalCoverage(TotalCoverage totalCoverage) {
                this.totalCoverage = totalCoverage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
