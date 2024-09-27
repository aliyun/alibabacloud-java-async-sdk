// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityAnalysisResponseBody</p>
 */
public class GetDataQualityAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDataQualityAnalysisResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityAnalysisResponseBody create() {
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
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>4A0AEC56-5C9A-5D47-93DF-7227836FFF82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityAnalysisResponseBody build() {
            return new GetDataQualityAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class Score extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("g1")
        private Double g1;

        @com.aliyun.core.annotation.NameInMap("g2")
        private Double g2;

        @com.aliyun.core.annotation.NameInMap("g3")
        private Double g3;

        @com.aliyun.core.annotation.NameInMap("g4")
        private Double g4;

        private Score(Builder builder) {
            this.g1 = builder.g1;
            this.g2 = builder.g2;
            this.g3 = builder.g3;
            this.g4 = builder.g4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Score create() {
            return builder().build();
        }

        /**
         * @return g1
         */
        public Double getG1() {
            return this.g1;
        }

        /**
         * @return g2
         */
        public Double getG2() {
            return this.g2;
        }

        /**
         * @return g3
         */
        public Double getG3() {
            return this.g3;
        }

        /**
         * @return g4
         */
        public Double getG4() {
            return this.g4;
        }

        public static final class Builder {
            private Double g1; 
            private Double g2; 
            private Double g3; 
            private Double g4; 

            /**
             * <p>Data quality evaluation indicator 1: activity data credibility.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder g1(Double g1) {
                this.g1 = g1;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 2: data factor reliability.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder g2(Double g2) {
                this.g2 = g2;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 3: time representativeness.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder g3(Double g3) {
                this.g3 = g3;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 4: geographic representativeness.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder g4(Double g4) {
                this.g4 = g4;
                return this;
            }

            public Score build() {
                return new Score(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class DataQuality extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inventory")
        private String inventory;

        @com.aliyun.core.annotation.NameInMap("score")
        private Score score;

        private DataQuality(Builder builder) {
            this.inventory = builder.inventory;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQuality create() {
            return builder().build();
        }

        /**
         * @return inventory
         */
        public String getInventory() {
            return this.inventory;
        }

        /**
         * @return score
         */
        public Score getScore() {
            return this.score;
        }

        public static final class Builder {
            private String inventory; 
            private Score score; 

            /**
             * <p>Inventory name</p>
             * 
             * <strong>example:</strong>
             * <p>energy</p>
             */
            public Builder inventory(String inventory) {
                this.inventory = inventory;
                return this;
            }

            /**
             * <p>Score. The distribution ranges from 1 to 5. A value closer to 1 indicates better data quality.</p>
             */
            public Builder score(Score score) {
                this.score = score;
                return this;
            }

            public DataQuality build() {
                return new DataQuality(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class DataQualityResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data_quality_score")
        private Double dataQualityScore;

        @com.aliyun.core.annotation.NameInMap("g1")
        private Double g1;

        @com.aliyun.core.annotation.NameInMap("g2")
        private Double g2;

        @com.aliyun.core.annotation.NameInMap("g3")
        private Double g3;

        @com.aliyun.core.annotation.NameInMap("g4")
        private Double g4;

        private DataQualityResult(Builder builder) {
            this.dataQualityScore = builder.dataQualityScore;
            this.g1 = builder.g1;
            this.g2 = builder.g2;
            this.g3 = builder.g3;
            this.g4 = builder.g4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityResult create() {
            return builder().build();
        }

        /**
         * @return dataQualityScore
         */
        public Double getDataQualityScore() {
            return this.dataQualityScore;
        }

        /**
         * @return g1
         */
        public Double getG1() {
            return this.g1;
        }

        /**
         * @return g2
         */
        public Double getG2() {
            return this.g2;
        }

        /**
         * @return g3
         */
        public Double getG3() {
            return this.g3;
        }

        /**
         * @return g4
         */
        public Double getG4() {
            return this.g4;
        }

        public static final class Builder {
            private Double dataQualityScore; 
            private Double g1; 
            private Double g2; 
            private Double g3; 
            private Double g4; 

            /**
             * <p>The score. This parameter is applicable to DQR results. The distribution ranges from 1 to 5. A value closer to 1 indicates better data quality. The number of valid digits is kept to four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2345</p>
             */
            public Builder dataQualityScore(Double dataQualityScore) {
                this.dataQualityScore = dataQualityScore;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 1: activity data credibility.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2345</p>
             */
            public Builder g1(Double g1) {
                this.g1 = g1;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 2: data factor reliability.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2345</p>
             */
            public Builder g2(Double g2) {
                this.g2 = g2;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 3: time representativeness.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2345</p>
             */
            public Builder g3(Double g3) {
                this.g3 = g3;
                return this;
            }

            /**
             * <p>Data quality evaluation indicator 4: geographic representativeness.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2345</p>
             */
            public Builder g4(Double g4) {
                this.g4 = g4;
                return this;
            }

            public DataQualityResult build() {
                return new DataQualityResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class SensitivityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("inventory")
        private String inventory;

        @com.aliyun.core.annotation.NameInMap("reductionList")
        private java.util.List < String > reductionList;

        @com.aliyun.core.annotation.NameInMap("sensitivity")
        private Double sensitivity;

        private SensitivityList(Builder builder) {
            this.id = builder.id;
            this.inventory = builder.inventory;
            this.reductionList = builder.reductionList;
            this.sensitivity = builder.sensitivity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitivityList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inventory
         */
        public String getInventory() {
            return this.inventory;
        }

        /**
         * @return reductionList
         */
        public java.util.List < String > getReductionList() {
            return this.reductionList;
        }

        /**
         * @return sensitivity
         */
        public Double getSensitivity() {
            return this.sensitivity;
        }

        public static final class Builder {
            private String id; 
            private String inventory; 
            private java.util.List < String > reductionList; 
            private Double sensitivity; 

            /**
             * <p>Inventory id</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the inventory item.</p>
             * 
             * <strong>example:</strong>
             * <p>energy</p>
             */
            public Builder inventory(String inventory) {
                this.inventory = inventory;
                return this;
            }

            /**
             * <p>List of emission reduction measures.</p>
             */
            public Builder reductionList(java.util.List < String > reductionList) {
                this.reductionList = reductionList;
                return this;
            }

            /**
             * <p>Sensitivity percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>91.7</p>
             */
            public Builder sensitivity(Double sensitivity) {
                this.sensitivity = sensitivity;
                return this;
            }

            public SensitivityList build() {
                return new SensitivityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class UncertaintyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inventory")
        private String inventory;

        @com.aliyun.core.annotation.NameInMap("uncertaintyContribution")
        private String uncertaintyContribution;

        private UncertaintyValues(Builder builder) {
            this.inventory = builder.inventory;
            this.uncertaintyContribution = builder.uncertaintyContribution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UncertaintyValues create() {
            return builder().build();
        }

        /**
         * @return inventory
         */
        public String getInventory() {
            return this.inventory;
        }

        /**
         * @return uncertaintyContribution
         */
        public String getUncertaintyContribution() {
            return this.uncertaintyContribution;
        }

        public static final class Builder {
            private String inventory; 
            private String uncertaintyContribution; 

            /**
             * <p>The name of the inventory. Format: process name / inventory name.</p>
             * 
             * <strong>example:</strong>
             * <p>process-1/inventory-1</p>
             */
            public Builder inventory(String inventory) {
                this.inventory = inventory;
                return this;
            }

            /**
             * <p>Inventory uncertainty absolute contribution size. The impact of the quality of each inventory data on the carbon footprint results in the modeling process, when the uncertain contribution of a list is large, please improve its data quality as much as possible to improve the accuracy of carbon footprint analysis. The meaning of &quot;1.4964&quot; is not determined to contribute 1.4964 kgCO₂ e/unit, where unit is the unit of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4964</p>
             */
            public Builder uncertaintyContribution(String uncertaintyContribution) {
                this.uncertaintyContribution = uncertaintyContribution;
                return this;
            }

            public UncertaintyValues build() {
                return new UncertaintyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAnalysisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataQuality")
        private java.util.List < DataQuality> dataQuality;

        @com.aliyun.core.annotation.NameInMap("dataQualityResult")
        private DataQualityResult dataQualityResult;

        @com.aliyun.core.annotation.NameInMap("sensitivityList")
        private java.util.List < SensitivityList> sensitivityList;

        @com.aliyun.core.annotation.NameInMap("uncertainty")
        private String uncertainty;

        @com.aliyun.core.annotation.NameInMap("uncertaintyValues")
        private java.util.List < UncertaintyValues> uncertaintyValues;

        private Data(Builder builder) {
            this.dataQuality = builder.dataQuality;
            this.dataQualityResult = builder.dataQualityResult;
            this.sensitivityList = builder.sensitivityList;
            this.uncertainty = builder.uncertainty;
            this.uncertaintyValues = builder.uncertaintyValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataQuality
         */
        public java.util.List < DataQuality> getDataQuality() {
            return this.dataQuality;
        }

        /**
         * @return dataQualityResult
         */
        public DataQualityResult getDataQualityResult() {
            return this.dataQualityResult;
        }

        /**
         * @return sensitivityList
         */
        public java.util.List < SensitivityList> getSensitivityList() {
            return this.sensitivityList;
        }

        /**
         * @return uncertainty
         */
        public String getUncertainty() {
            return this.uncertainty;
        }

        /**
         * @return uncertaintyValues
         */
        public java.util.List < UncertaintyValues> getUncertaintyValues() {
            return this.uncertaintyValues;
        }

        public static final class Builder {
            private java.util.List < DataQuality> dataQuality; 
            private DataQualityResult dataQualityResult; 
            private java.util.List < SensitivityList> sensitivityList; 
            private String uncertainty; 
            private java.util.List < UncertaintyValues> uncertaintyValues; 

            /**
             * <p>Score of each inventory.</p>
             */
            public Builder dataQuality(java.util.List < DataQuality> dataQuality) {
                this.dataQuality = dataQuality;
                return this;
            }

            /**
             * <p>Data quality result.</p>
             */
            public Builder dataQualityResult(DataQualityResult dataQualityResult) {
                this.dataQualityResult = dataQualityResult;
                return this;
            }

            /**
             * <p>Sensitivity analysis list</p>
             */
            public Builder sensitivityList(java.util.List < SensitivityList> sensitivityList) {
                this.sensitivityList = sensitivityList;
                return this;
            }

            /**
             * <p>Uncertainty value. The model&quot;s overall percentage uncertainty results. &quot;10.00%&quot; symbolizes a 10.00% uncertainty, indicating that the carbon footprint lies within ±10.00%. This is derived from a weighted aggregation of individual inventory uncertainties.</p>
             * 
             * <strong>example:</strong>
             * <p>10.00</p>
             */
            public Builder uncertainty(String uncertainty) {
                this.uncertainty = uncertainty;
                return this;
            }

            /**
             * <p>Uncertainty list</p>
             */
            public Builder uncertaintyValues(java.util.List < UncertaintyValues> uncertaintyValues) {
                this.uncertaintyValues = uncertaintyValues;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
