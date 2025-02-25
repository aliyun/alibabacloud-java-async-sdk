// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiagnosisSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSQLInfoResponseBody</p>
 */
public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosisSQLInfo")
    private String diagnosisSQLInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StageInfos")
    private java.util.List < StageInfos> stageInfos;

    private DescribeDiagnosisSQLInfoResponseBody(Builder builder) {
        this.diagnosisSQLInfo = builder.diagnosisSQLInfo;
        this.requestId = builder.requestId;
        this.stageInfos = builder.stageInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisSQLInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosisSQLInfo
     */
    public String getDiagnosisSQLInfo() {
        return this.diagnosisSQLInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stageInfos
     */
    public java.util.List < StageInfos> getStageInfos() {
        return this.stageInfos;
    }

    public static final class Builder {
        private String diagnosisSQLInfo; 
        private String requestId; 
        private java.util.List < StageInfos> stageInfos; 

        /**
         * <p>Execution details of the SQL statement, including the SQL statement text, statistics, execution plan, and operator information.</p>
         */
        public Builder diagnosisSQLInfo(String diagnosisSQLInfo) {
            this.diagnosisSQLInfo = diagnosisSQLInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Execution details of the query by stage.</p>
         */
        public Builder stageInfos(java.util.List < StageInfos> stageInfos) {
            this.stageInfos = stageInfos;
            return this;
        }

        public DescribeDiagnosisSQLInfoResponseBody build() {
            return new DescribeDiagnosisSQLInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosisSQLInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosisSQLInfoResponseBody</p>
     */
    public static class StageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputDataSize")
        private Long inputDataSize;

        @com.aliyun.core.annotation.NameInMap("InputRows")
        private Long inputRows;

        @com.aliyun.core.annotation.NameInMap("OperatorCost")
        private Long operatorCost;

        @com.aliyun.core.annotation.NameInMap("OutputDataSize")
        private Long outputDataSize;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Double progress;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private StageInfos(Builder builder) {
            this.inputDataSize = builder.inputDataSize;
            this.inputRows = builder.inputRows;
            this.operatorCost = builder.operatorCost;
            this.outputDataSize = builder.outputDataSize;
            this.outputRows = builder.outputRows;
            this.peakMemory = builder.peakMemory;
            this.progress = builder.progress;
            this.stageId = builder.stageId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageInfos create() {
            return builder().build();
        }

        /**
         * @return inputDataSize
         */
        public Long getInputDataSize() {
            return this.inputDataSize;
        }

        /**
         * @return inputRows
         */
        public Long getInputRows() {
            return this.inputRows;
        }

        /**
         * @return operatorCost
         */
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        /**
         * @return outputDataSize
         */
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return progress
         */
        public Double getProgress() {
            return this.progress;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long inputDataSize; 
            private Long inputRows; 
            private Long operatorCost; 
            private Long outputDataSize; 
            private Long outputRows; 
            private Long peakMemory; 
            private Double progress; 
            private String stageId; 
            private String state; 

            /**
             * <p>The total amount of input data in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2341</p>
             */
            public Builder inputDataSize(Long inputDataSize) {
                this.inputDataSize = inputDataSize;
                return this;
            }

            /**
             * <p>The total number of input rows in the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * <p>The total amount of time consumed by all operators in the stage. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2341</p>
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * <p>The total amount of output data in the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>12344</p>
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * <p>The total number of output rows in the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>231</p>
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * <p>The total peak memory of the stage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3421</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The execution progress of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder progress(Double progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Stage[26]</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The state of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public StageInfos build() {
                return new StageInfos(this);
            } 

        } 

    }
}
