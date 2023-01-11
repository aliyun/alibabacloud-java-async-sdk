// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardStatusStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardStatusStatisticsResponseBody</p>
 */
public class GetCardStatusStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCardStatusStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardStatusStatisticsResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
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
        private String errorMessage; 
        private String localizedMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCardStatusStatisticsResponseBody build() {
            return new GetCardStatusStatisticsResponseBody(this);
        } 

    } 

    public static class ErrorStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ErrorStopStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorStopStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ErrorStopStatisticsDTO build() {
                return new ErrorStopStatisticsDTO(this);
            } 

        } 

    }
    public static class ExhaustStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ExhaustStopStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExhaustStopStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ExhaustStopStatisticsDTO build() {
                return new ExhaustStopStatisticsDTO(this);
            } 

        } 

    }
    public static class ExpireStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ExpireStopStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpireStopStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ExpireStopStatisticsDTO build() {
                return new ExpireStopStatisticsDTO(this);
            } 

        } 

    }
    public static class FlowOutStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private FlowOutStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowOutStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public FlowOutStatisticsDTO build() {
                return new FlowOutStatisticsDTO(this);
            } 

        } 

    }
    public static class ManageStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ManageStopStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManageStopStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ManageStopStatisticsDTO build() {
                return new ManageStopStatisticsDTO(this);
            } 

        } 

    }
    public static class RiskWaringStatisticsDTO extends TeaModel {
        @NameInMap("LeftFlowPercentageWarnCount")
        private Long leftFlowPercentageWarnCount;

        @NameInMap("StopCount")
        private Long stopCount;

        @NameInMap("WaringTotalCount")
        private Long waringTotalCount;

        @NameInMap("WarningCount")
        private Long warningCount;

        private RiskWaringStatisticsDTO(Builder builder) {
            this.leftFlowPercentageWarnCount = builder.leftFlowPercentageWarnCount;
            this.stopCount = builder.stopCount;
            this.waringTotalCount = builder.waringTotalCount;
            this.warningCount = builder.warningCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskWaringStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return leftFlowPercentageWarnCount
         */
        public Long getLeftFlowPercentageWarnCount() {
            return this.leftFlowPercentageWarnCount;
        }

        /**
         * @return stopCount
         */
        public Long getStopCount() {
            return this.stopCount;
        }

        /**
         * @return waringTotalCount
         */
        public Long getWaringTotalCount() {
            return this.waringTotalCount;
        }

        /**
         * @return warningCount
         */
        public Long getWarningCount() {
            return this.warningCount;
        }

        public static final class Builder {
            private Long leftFlowPercentageWarnCount; 
            private Long stopCount; 
            private Long waringTotalCount; 
            private Long warningCount; 

            /**
             * LeftFlowPercentageWarnCount.
             */
            public Builder leftFlowPercentageWarnCount(Long leftFlowPercentageWarnCount) {
                this.leftFlowPercentageWarnCount = leftFlowPercentageWarnCount;
                return this;
            }

            /**
             * StopCount.
             */
            public Builder stopCount(Long stopCount) {
                this.stopCount = stopCount;
                return this;
            }

            /**
             * WaringTotalCount.
             */
            public Builder waringTotalCount(Long waringTotalCount) {
                this.waringTotalCount = waringTotalCount;
                return this;
            }

            /**
             * WarningCount.
             */
            public Builder warningCount(Long warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            public RiskWaringStatisticsDTO build() {
                return new RiskWaringStatisticsDTO(this);
            } 

        } 

    }
    public static class SingCardPeriodLeftFlowWarnDTO extends TeaModel {
        @NameInMap("LessFlowPercentage10Count")
        private Long lessFlowPercentage10Count;

        @NameInMap("LessFlowPercentage30Count")
        private Long lessFlowPercentage30Count;

        private SingCardPeriodLeftFlowWarnDTO(Builder builder) {
            this.lessFlowPercentage10Count = builder.lessFlowPercentage10Count;
            this.lessFlowPercentage30Count = builder.lessFlowPercentage30Count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingCardPeriodLeftFlowWarnDTO create() {
            return builder().build();
        }

        /**
         * @return lessFlowPercentage10Count
         */
        public Long getLessFlowPercentage10Count() {
            return this.lessFlowPercentage10Count;
        }

        /**
         * @return lessFlowPercentage30Count
         */
        public Long getLessFlowPercentage30Count() {
            return this.lessFlowPercentage30Count;
        }

        public static final class Builder {
            private Long lessFlowPercentage10Count; 
            private Long lessFlowPercentage30Count; 

            /**
             * LessFlowPercentage10Count.
             */
            public Builder lessFlowPercentage10Count(Long lessFlowPercentage10Count) {
                this.lessFlowPercentage10Count = lessFlowPercentage10Count;
                return this;
            }

            /**
             * LessFlowPercentage30Count.
             */
            public Builder lessFlowPercentage30Count(Long lessFlowPercentage30Count) {
                this.lessFlowPercentage30Count = lessFlowPercentage30Count;
                return this;
            }

            public SingCardPeriodLeftFlowWarnDTO build() {
                return new SingCardPeriodLeftFlowWarnDTO(this);
            } 

        } 

    }
    public static class UnCertifiedStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private UnCertifiedStopStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnCertifiedStopStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public UnCertifiedStopStatisticsDTO build() {
                return new UnCertifiedStopStatisticsDTO(this);
            } 

        } 

    }
    public static class UnbindResumeStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private UnbindResumeStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnbindResumeStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public UnbindResumeStatisticsDTO build() {
                return new UnbindResumeStatisticsDTO(this);
            } 

        } 

    }
    public static class WeekWarnStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        private Long poolCount;

        @NameInMap("SameFlowCardCount")
        private Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        private Long singleCardCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private WeekWarnStatisticsDTO(Builder builder) {
            this.poolCount = builder.poolCount;
            this.sameFlowCardCount = builder.sameFlowCardCount;
            this.singleCardCount = builder.singleCardCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeekWarnStatisticsDTO create() {
            return builder().build();
        }

        /**
         * @return poolCount
         */
        public Long getPoolCount() {
            return this.poolCount;
        }

        /**
         * @return sameFlowCardCount
         */
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        /**
         * @return singleCardCount
         */
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long poolCount; 
            private Long sameFlowCardCount; 
            private Long singleCardCount; 
            private Long totalCount; 

            /**
             * PoolCount.
             */
            public Builder poolCount(Long poolCount) {
                this.poolCount = poolCount;
                return this;
            }

            /**
             * SameFlowCardCount.
             */
            public Builder sameFlowCardCount(Long sameFlowCardCount) {
                this.sameFlowCardCount = sameFlowCardCount;
                return this;
            }

            /**
             * SingleCardCount.
             */
            public Builder singleCardCount(Long singleCardCount) {
                this.singleCardCount = singleCardCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public WeekWarnStatisticsDTO build() {
                return new WeekWarnStatisticsDTO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ErrorStopStatisticsDTO")
        private ErrorStopStatisticsDTO errorStopStatisticsDTO;

        @NameInMap("ExhaustStopStatisticsDTO")
        private ExhaustStopStatisticsDTO exhaustStopStatisticsDTO;

        @NameInMap("ExpireStopStatisticsDTO")
        private ExpireStopStatisticsDTO expireStopStatisticsDTO;

        @NameInMap("FlowOutStatisticsDTO")
        private FlowOutStatisticsDTO flowOutStatisticsDTO;

        @NameInMap("ManageStopStatisticsDTO")
        private ManageStopStatisticsDTO manageStopStatisticsDTO;

        @NameInMap("RiskWaringStatisticsDTO")
        private RiskWaringStatisticsDTO riskWaringStatisticsDTO;

        @NameInMap("SingCardPeriodLeftFlowWarnDTO")
        private SingCardPeriodLeftFlowWarnDTO singCardPeriodLeftFlowWarnDTO;

        @NameInMap("UnCertifiedStopStatisticsDTO")
        private UnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO;

        @NameInMap("UnbindResumeStatisticsDTO")
        private UnbindResumeStatisticsDTO unbindResumeStatisticsDTO;

        @NameInMap("WeekWarnStatisticsDTO")
        private WeekWarnStatisticsDTO weekWarnStatisticsDTO;

        private Data(Builder builder) {
            this.errorStopStatisticsDTO = builder.errorStopStatisticsDTO;
            this.exhaustStopStatisticsDTO = builder.exhaustStopStatisticsDTO;
            this.expireStopStatisticsDTO = builder.expireStopStatisticsDTO;
            this.flowOutStatisticsDTO = builder.flowOutStatisticsDTO;
            this.manageStopStatisticsDTO = builder.manageStopStatisticsDTO;
            this.riskWaringStatisticsDTO = builder.riskWaringStatisticsDTO;
            this.singCardPeriodLeftFlowWarnDTO = builder.singCardPeriodLeftFlowWarnDTO;
            this.unCertifiedStopStatisticsDTO = builder.unCertifiedStopStatisticsDTO;
            this.unbindResumeStatisticsDTO = builder.unbindResumeStatisticsDTO;
            this.weekWarnStatisticsDTO = builder.weekWarnStatisticsDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorStopStatisticsDTO
         */
        public ErrorStopStatisticsDTO getErrorStopStatisticsDTO() {
            return this.errorStopStatisticsDTO;
        }

        /**
         * @return exhaustStopStatisticsDTO
         */
        public ExhaustStopStatisticsDTO getExhaustStopStatisticsDTO() {
            return this.exhaustStopStatisticsDTO;
        }

        /**
         * @return expireStopStatisticsDTO
         */
        public ExpireStopStatisticsDTO getExpireStopStatisticsDTO() {
            return this.expireStopStatisticsDTO;
        }

        /**
         * @return flowOutStatisticsDTO
         */
        public FlowOutStatisticsDTO getFlowOutStatisticsDTO() {
            return this.flowOutStatisticsDTO;
        }

        /**
         * @return manageStopStatisticsDTO
         */
        public ManageStopStatisticsDTO getManageStopStatisticsDTO() {
            return this.manageStopStatisticsDTO;
        }

        /**
         * @return riskWaringStatisticsDTO
         */
        public RiskWaringStatisticsDTO getRiskWaringStatisticsDTO() {
            return this.riskWaringStatisticsDTO;
        }

        /**
         * @return singCardPeriodLeftFlowWarnDTO
         */
        public SingCardPeriodLeftFlowWarnDTO getSingCardPeriodLeftFlowWarnDTO() {
            return this.singCardPeriodLeftFlowWarnDTO;
        }

        /**
         * @return unCertifiedStopStatisticsDTO
         */
        public UnCertifiedStopStatisticsDTO getUnCertifiedStopStatisticsDTO() {
            return this.unCertifiedStopStatisticsDTO;
        }

        /**
         * @return unbindResumeStatisticsDTO
         */
        public UnbindResumeStatisticsDTO getUnbindResumeStatisticsDTO() {
            return this.unbindResumeStatisticsDTO;
        }

        /**
         * @return weekWarnStatisticsDTO
         */
        public WeekWarnStatisticsDTO getWeekWarnStatisticsDTO() {
            return this.weekWarnStatisticsDTO;
        }

        public static final class Builder {
            private ErrorStopStatisticsDTO errorStopStatisticsDTO; 
            private ExhaustStopStatisticsDTO exhaustStopStatisticsDTO; 
            private ExpireStopStatisticsDTO expireStopStatisticsDTO; 
            private FlowOutStatisticsDTO flowOutStatisticsDTO; 
            private ManageStopStatisticsDTO manageStopStatisticsDTO; 
            private RiskWaringStatisticsDTO riskWaringStatisticsDTO; 
            private SingCardPeriodLeftFlowWarnDTO singCardPeriodLeftFlowWarnDTO; 
            private UnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO; 
            private UnbindResumeStatisticsDTO unbindResumeStatisticsDTO; 
            private WeekWarnStatisticsDTO weekWarnStatisticsDTO; 

            /**
             * ErrorStopStatisticsDTO.
             */
            public Builder errorStopStatisticsDTO(ErrorStopStatisticsDTO errorStopStatisticsDTO) {
                this.errorStopStatisticsDTO = errorStopStatisticsDTO;
                return this;
            }

            /**
             * ExhaustStopStatisticsDTO.
             */
            public Builder exhaustStopStatisticsDTO(ExhaustStopStatisticsDTO exhaustStopStatisticsDTO) {
                this.exhaustStopStatisticsDTO = exhaustStopStatisticsDTO;
                return this;
            }

            /**
             * ExpireStopStatisticsDTO.
             */
            public Builder expireStopStatisticsDTO(ExpireStopStatisticsDTO expireStopStatisticsDTO) {
                this.expireStopStatisticsDTO = expireStopStatisticsDTO;
                return this;
            }

            /**
             * FlowOutStatisticsDTO.
             */
            public Builder flowOutStatisticsDTO(FlowOutStatisticsDTO flowOutStatisticsDTO) {
                this.flowOutStatisticsDTO = flowOutStatisticsDTO;
                return this;
            }

            /**
             * ManageStopStatisticsDTO.
             */
            public Builder manageStopStatisticsDTO(ManageStopStatisticsDTO manageStopStatisticsDTO) {
                this.manageStopStatisticsDTO = manageStopStatisticsDTO;
                return this;
            }

            /**
             * RiskWaringStatisticsDTO.
             */
            public Builder riskWaringStatisticsDTO(RiskWaringStatisticsDTO riskWaringStatisticsDTO) {
                this.riskWaringStatisticsDTO = riskWaringStatisticsDTO;
                return this;
            }

            /**
             * SingCardPeriodLeftFlowWarnDTO.
             */
            public Builder singCardPeriodLeftFlowWarnDTO(SingCardPeriodLeftFlowWarnDTO singCardPeriodLeftFlowWarnDTO) {
                this.singCardPeriodLeftFlowWarnDTO = singCardPeriodLeftFlowWarnDTO;
                return this;
            }

            /**
             * UnCertifiedStopStatisticsDTO.
             */
            public Builder unCertifiedStopStatisticsDTO(UnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO) {
                this.unCertifiedStopStatisticsDTO = unCertifiedStopStatisticsDTO;
                return this;
            }

            /**
             * UnbindResumeStatisticsDTO.
             */
            public Builder unbindResumeStatisticsDTO(UnbindResumeStatisticsDTO unbindResumeStatisticsDTO) {
                this.unbindResumeStatisticsDTO = unbindResumeStatisticsDTO;
                return this;
            }

            /**
             * WeekWarnStatisticsDTO.
             */
            public Builder weekWarnStatisticsDTO(WeekWarnStatisticsDTO weekWarnStatisticsDTO) {
                this.weekWarnStatisticsDTO = weekWarnStatisticsDTO;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
