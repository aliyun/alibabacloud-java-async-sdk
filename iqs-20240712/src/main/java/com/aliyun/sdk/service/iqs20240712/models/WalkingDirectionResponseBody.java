// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WalkingDirectionResponseBody} extends {@link TeaModel}
 *
 * <p>WalkingDirectionResponseBody</p>
 */
public class WalkingDirectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private WalkingDirectionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WalkingDirectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public WalkingDirectionResponseBody build() {
            return new WalkingDirectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link WalkingDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>WalkingDirectionResponseBody</p>
     */
    public static class Cost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("durationSecond")
        private String durationSecond;

        @com.aliyun.core.annotation.NameInMap("taxiFee")
        private String taxiFee;

        @com.aliyun.core.annotation.NameInMap("tollDistanceMeter")
        private String tollDistanceMeter;

        @com.aliyun.core.annotation.NameInMap("tollRoads")
        private String tollRoads;

        @com.aliyun.core.annotation.NameInMap("tolls")
        private String tolls;

        @com.aliyun.core.annotation.NameInMap("trafficLights")
        private String trafficLights;

        @com.aliyun.core.annotation.NameInMap("transitFee")
        private String transitFee;

        private Cost(Builder builder) {
            this.durationSecond = builder.durationSecond;
            this.taxiFee = builder.taxiFee;
            this.tollDistanceMeter = builder.tollDistanceMeter;
            this.tollRoads = builder.tollRoads;
            this.tolls = builder.tolls;
            this.trafficLights = builder.trafficLights;
            this.transitFee = builder.transitFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cost create() {
            return builder().build();
        }

        /**
         * @return durationSecond
         */
        public String getDurationSecond() {
            return this.durationSecond;
        }

        /**
         * @return taxiFee
         */
        public String getTaxiFee() {
            return this.taxiFee;
        }

        /**
         * @return tollDistanceMeter
         */
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        /**
         * @return tollRoads
         */
        public String getTollRoads() {
            return this.tollRoads;
        }

        /**
         * @return tolls
         */
        public String getTolls() {
            return this.tolls;
        }

        /**
         * @return trafficLights
         */
        public String getTrafficLights() {
            return this.trafficLights;
        }

        /**
         * @return transitFee
         */
        public String getTransitFee() {
            return this.transitFee;
        }

        public static final class Builder {
            private String durationSecond; 
            private String taxiFee; 
            private String tollDistanceMeter; 
            private String tollRoads; 
            private String tolls; 
            private String trafficLights; 
            private String transitFee; 

            /**
             * durationSecond.
             */
            public Builder durationSecond(String durationSecond) {
                this.durationSecond = durationSecond;
                return this;
            }

            /**
             * taxiFee.
             */
            public Builder taxiFee(String taxiFee) {
                this.taxiFee = taxiFee;
                return this;
            }

            /**
             * tollDistanceMeter.
             */
            public Builder tollDistanceMeter(String tollDistanceMeter) {
                this.tollDistanceMeter = tollDistanceMeter;
                return this;
            }

            /**
             * tollRoads.
             */
            public Builder tollRoads(String tollRoads) {
                this.tollRoads = tollRoads;
                return this;
            }

            /**
             * tolls.
             */
            public Builder tolls(String tolls) {
                this.tolls = tolls;
                return this;
            }

            /**
             * trafficLights.
             */
            public Builder trafficLights(String trafficLights) {
                this.trafficLights = trafficLights;
                return this;
            }

            /**
             * transitFee.
             */
            public Builder transitFee(String transitFee) {
                this.transitFee = transitFee;
                return this;
            }

            public Cost build() {
                return new Cost(this);
            } 

        } 

    }
    /**
     * 
     * {@link WalkingDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>WalkingDirectionResponseBody</p>
     */
    public static class StepsCost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("durationSecond")
        private String durationSecond;

        @com.aliyun.core.annotation.NameInMap("taxiFee")
        private String taxiFee;

        @com.aliyun.core.annotation.NameInMap("tollDistanceMeter")
        private String tollDistanceMeter;

        @com.aliyun.core.annotation.NameInMap("tollRoads")
        private String tollRoads;

        @com.aliyun.core.annotation.NameInMap("tolls")
        private String tolls;

        @com.aliyun.core.annotation.NameInMap("trafficLights")
        private String trafficLights;

        @com.aliyun.core.annotation.NameInMap("transitFee")
        private String transitFee;

        private StepsCost(Builder builder) {
            this.durationSecond = builder.durationSecond;
            this.taxiFee = builder.taxiFee;
            this.tollDistanceMeter = builder.tollDistanceMeter;
            this.tollRoads = builder.tollRoads;
            this.tolls = builder.tolls;
            this.trafficLights = builder.trafficLights;
            this.transitFee = builder.transitFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepsCost create() {
            return builder().build();
        }

        /**
         * @return durationSecond
         */
        public String getDurationSecond() {
            return this.durationSecond;
        }

        /**
         * @return taxiFee
         */
        public String getTaxiFee() {
            return this.taxiFee;
        }

        /**
         * @return tollDistanceMeter
         */
        public String getTollDistanceMeter() {
            return this.tollDistanceMeter;
        }

        /**
         * @return tollRoads
         */
        public String getTollRoads() {
            return this.tollRoads;
        }

        /**
         * @return tolls
         */
        public String getTolls() {
            return this.tolls;
        }

        /**
         * @return trafficLights
         */
        public String getTrafficLights() {
            return this.trafficLights;
        }

        /**
         * @return transitFee
         */
        public String getTransitFee() {
            return this.transitFee;
        }

        public static final class Builder {
            private String durationSecond; 
            private String taxiFee; 
            private String tollDistanceMeter; 
            private String tollRoads; 
            private String tolls; 
            private String trafficLights; 
            private String transitFee; 

            /**
             * durationSecond.
             */
            public Builder durationSecond(String durationSecond) {
                this.durationSecond = durationSecond;
                return this;
            }

            /**
             * taxiFee.
             */
            public Builder taxiFee(String taxiFee) {
                this.taxiFee = taxiFee;
                return this;
            }

            /**
             * tollDistanceMeter.
             */
            public Builder tollDistanceMeter(String tollDistanceMeter) {
                this.tollDistanceMeter = tollDistanceMeter;
                return this;
            }

            /**
             * tollRoads.
             */
            public Builder tollRoads(String tollRoads) {
                this.tollRoads = tollRoads;
                return this;
            }

            /**
             * tolls.
             */
            public Builder tolls(String tolls) {
                this.tolls = tolls;
                return this;
            }

            /**
             * trafficLights.
             */
            public Builder trafficLights(String trafficLights) {
                this.trafficLights = trafficLights;
                return this;
            }

            /**
             * transitFee.
             */
            public Builder transitFee(String transitFee) {
                this.transitFee = transitFee;
                return this;
            }

            public StepsCost build() {
                return new StepsCost(this);
            } 

        } 

    }
    /**
     * 
     * {@link WalkingDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>WalkingDirectionResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private StepsCost cost;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("orientation")
        private String orientation;

        @com.aliyun.core.annotation.NameInMap("roadName")
        private String roadName;

        @com.aliyun.core.annotation.NameInMap("stepDistanceMeter")
        private String stepDistanceMeter;

        private Steps(Builder builder) {
            this.cost = builder.cost;
            this.instruction = builder.instruction;
            this.orientation = builder.orientation;
            this.roadName = builder.roadName;
            this.stepDistanceMeter = builder.stepDistanceMeter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public StepsCost getCost() {
            return this.cost;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return orientation
         */
        public String getOrientation() {
            return this.orientation;
        }

        /**
         * @return roadName
         */
        public String getRoadName() {
            return this.roadName;
        }

        /**
         * @return stepDistanceMeter
         */
        public String getStepDistanceMeter() {
            return this.stepDistanceMeter;
        }

        public static final class Builder {
            private StepsCost cost; 
            private String instruction; 
            private String orientation; 
            private String roadName; 
            private String stepDistanceMeter; 

            /**
             * cost.
             */
            public Builder cost(StepsCost cost) {
                this.cost = cost;
                return this;
            }

            /**
             * instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * orientation.
             */
            public Builder orientation(String orientation) {
                this.orientation = orientation;
                return this;
            }

            /**
             * roadName.
             */
            public Builder roadName(String roadName) {
                this.roadName = roadName;
                return this;
            }

            /**
             * stepDistanceMeter.
             */
            public Builder stepDistanceMeter(String stepDistanceMeter) {
                this.stepDistanceMeter = stepDistanceMeter;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link WalkingDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>WalkingDirectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private Cost cost;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("steps")
        private java.util.List < Steps> steps;

        private Data(Builder builder) {
            this.cost = builder.cost;
            this.distanceMeter = builder.distanceMeter;
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Cost getCost() {
            return this.cost;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return steps
         */
        public java.util.List < Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private Cost cost; 
            private String distanceMeter; 
            private java.util.List < Steps> steps; 

            /**
             * cost.
             */
            public Builder cost(Cost cost) {
                this.cost = cost;
                return this;
            }

            /**
             * distanceMeter.
             */
            public Builder distanceMeter(String distanceMeter) {
                this.distanceMeter = distanceMeter;
                return this;
            }

            /**
             * steps.
             */
            public Builder steps(java.util.List < Steps> steps) {
                this.steps = steps;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
