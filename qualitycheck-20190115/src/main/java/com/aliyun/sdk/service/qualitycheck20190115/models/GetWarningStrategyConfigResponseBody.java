// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWarningStrategyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetWarningStrategyConfigResponseBody</p>
 */
public class GetWarningStrategyConfigResponseBody extends TeaModel {
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

    private GetWarningStrategyConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWarningStrategyConfigResponseBody create() {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetWarningStrategyConfigResponseBody build() {
            return new GetWarningStrategyConfigResponseBody(this);
        } 

    } 

    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RangeNum")
        private Long rangeNum;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Range(Builder builder) {
            this.rangeNum = builder.rangeNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return rangeNum
         */
        public Long getRangeNum() {
            return this.rangeNum;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private Long rangeNum; 
            private Long type; 

            /**
             * RangeNum.
             */
            public Builder rangeNum(Long rangeNum) {
                this.rangeNum = rangeNum;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    public static class WarningStrategyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("DurationExpression")
        private Long durationExpression;

        @com.aliyun.core.annotation.NameInMap("HitNumber")
        private Long hitNumber;

        @com.aliyun.core.annotation.NameInMap("HitNumberExpression")
        private Long hitNumberExpression;

        @com.aliyun.core.annotation.NameInMap("HitRuleList")
        private String hitRuleList;

        @com.aliyun.core.annotation.NameInMap("HitType")
        private Long hitType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Range")
        private Range range;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private WarningStrategyList(Builder builder) {
            this.code = builder.code;
            this.duration = builder.duration;
            this.durationExpression = builder.durationExpression;
            this.hitNumber = builder.hitNumber;
            this.hitNumberExpression = builder.hitNumberExpression;
            this.hitRuleList = builder.hitRuleList;
            this.hitType = builder.hitType;
            this.id = builder.id;
            this.range = builder.range;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningStrategyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return durationExpression
         */
        public Long getDurationExpression() {
            return this.durationExpression;
        }

        /**
         * @return hitNumber
         */
        public Long getHitNumber() {
            return this.hitNumber;
        }

        /**
         * @return hitNumberExpression
         */
        public Long getHitNumberExpression() {
            return this.hitNumberExpression;
        }

        /**
         * @return hitRuleList
         */
        public String getHitRuleList() {
            return this.hitRuleList;
        }

        /**
         * @return hitType
         */
        public Long getHitType() {
            return this.hitType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private Long duration; 
            private Long durationExpression; 
            private Long hitNumber; 
            private Long hitNumberExpression; 
            private String hitRuleList; 
            private Long hitType; 
            private Long id; 
            private Range range; 
            private Long status; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * DurationExpression.
             */
            public Builder durationExpression(Long durationExpression) {
                this.durationExpression = durationExpression;
                return this;
            }

            /**
             * HitNumber.
             */
            public Builder hitNumber(Long hitNumber) {
                this.hitNumber = hitNumber;
                return this;
            }

            /**
             * HitNumberExpression.
             */
            public Builder hitNumberExpression(Long hitNumberExpression) {
                this.hitNumberExpression = hitNumberExpression;
                return this;
            }

            /**
             * HitRuleList.
             */
            public Builder hitRuleList(String hitRuleList) {
                this.hitRuleList = hitRuleList;
                return this;
            }

            /**
             * HitType.
             */
            public Builder hitType(Long hitType) {
                this.hitType = hitType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public WarningStrategyList build() {
                return new WarningStrategyList(this);
            } 

        } 

    }
    public static class DataWarningStrategyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("warningStrategyList")
        private java.util.List < WarningStrategyList> warningStrategyList;

        private DataWarningStrategyList(Builder builder) {
            this.warningStrategyList = builder.warningStrategyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataWarningStrategyList create() {
            return builder().build();
        }

        /**
         * @return warningStrategyList
         */
        public java.util.List < WarningStrategyList> getWarningStrategyList() {
            return this.warningStrategyList;
        }

        public static final class Builder {
            private java.util.List < WarningStrategyList> warningStrategyList; 

            /**
             * warningStrategyList.
             */
            public Builder warningStrategyList(java.util.List < WarningStrategyList> warningStrategyList) {
                this.warningStrategyList = warningStrategyList;
                return this;
            }

            public DataWarningStrategyList build() {
                return new DataWarningStrategyList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IntervalTime")
        private Long intervalTime;

        @com.aliyun.core.annotation.NameInMap("Lambda")
        private String lambda;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("MaxNumber")
        private Long maxNumber;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WarningStrategyList")
        private DataWarningStrategyList warningStrategyList;

        private Data(Builder builder) {
            this.id = builder.id;
            this.intervalTime = builder.intervalTime;
            this.lambda = builder.lambda;
            this.level = builder.level;
            this.maxNumber = builder.maxNumber;
            this.name = builder.name;
            this.warningStrategyList = builder.warningStrategyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intervalTime
         */
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return maxNumber
         */
        public Long getMaxNumber() {
            return this.maxNumber;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return warningStrategyList
         */
        public DataWarningStrategyList getWarningStrategyList() {
            return this.warningStrategyList;
        }

        public static final class Builder {
            private Long id; 
            private Long intervalTime; 
            private String lambda; 
            private Long level; 
            private Long maxNumber; 
            private String name; 
            private DataWarningStrategyList warningStrategyList; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IntervalTime.
             */
            public Builder intervalTime(Long intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * MaxNumber.
             */
            public Builder maxNumber(Long maxNumber) {
                this.maxNumber = maxNumber;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * WarningStrategyList.
             */
            public Builder warningStrategyList(DataWarningStrategyList warningStrategyList) {
                this.warningStrategyList = warningStrategyList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
