// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSQLInfoResponseBody</p>
 */
public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @NameInMap("DiagnosisSQLInfo")
    private String diagnosisSQLInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StageInfos")
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
         * The queried execution information, including the SQL statement, statistics, execution plan, and operator information.
         */
        public Builder diagnosisSQLInfo(String diagnosisSQLInfo) {
            this.diagnosisSQLInfo = diagnosisSQLInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried execution information by stage.
         */
        public Builder stageInfos(java.util.List < StageInfos> stageInfos) {
            this.stageInfos = stageInfos;
            return this;
        }

        public DescribeDiagnosisSQLInfoResponseBody build() {
            return new DescribeDiagnosisSQLInfoResponseBody(this);
        } 

    } 

    public static class StageInfos extends TeaModel {
        @NameInMap("InputDataSize")
        private Long inputDataSize;

        @NameInMap("InputRows")
        private Long inputRows;

        @NameInMap("OperatorCost")
        private Long operatorCost;

        @NameInMap("OutputDataSize")
        private Long outputDataSize;

        @NameInMap("OutputRows")
        private Long outputRows;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("Progress")
        private Double progress;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("State")
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
             * The total amount of input data in the stage. Unit: bytes.
             */
            public Builder inputDataSize(Long inputDataSize) {
                this.inputDataSize = inputDataSize;
                return this;
            }

            /**
             * The total number of input rows in the stage.
             */
            public Builder inputRows(Long inputRows) {
                this.inputRows = inputRows;
                return this;
            }

            /**
             * The total amount of time consumed by all operators in the stage. Unit: milliseconds.
             */
            public Builder operatorCost(Long operatorCost) {
                this.operatorCost = operatorCost;
                return this;
            }

            /**
             * The total amount of output data in the stage. Unit: bytes.
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * The total number of output rows in the stage.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * The total peak memory of the stage. Unit: bytes.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The execution progress of the stage.
             */
            public Builder progress(Double progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The stage ID.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The state of the stage.
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
