// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
 *
 * <p>BicyclingDirectionNovaResponseBody</p>
 */
public class BicyclingDirectionNovaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BicyclingDirectionNovaResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BicyclingDirectionNovaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BicyclingDirectionNovaResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BicyclingDirectionNovaResponseBody build() {
            return new BicyclingDirectionNovaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
     *
     * <p>BicyclingDirectionNovaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Cost model) {
                this.durationSecond = model.durationSecond;
                this.taxiFee = model.taxiFee;
                this.tollDistanceMeter = model.tollDistanceMeter;
                this.tollRoads = model.tollRoads;
                this.tolls = model.tolls;
                this.trafficLights = model.trafficLights;
                this.transitFee = model.transitFee;
            } 

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
     * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
     *
     * <p>BicyclingDirectionNovaResponseBody</p>
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

            private Builder() {
            } 

            private Builder(StepsCost model) {
                this.durationSecond = model.durationSecond;
                this.taxiFee = model.taxiFee;
                this.tollDistanceMeter = model.tollDistanceMeter;
                this.tollRoads = model.tollRoads;
                this.tolls = model.tolls;
                this.trafficLights = model.trafficLights;
                this.transitFee = model.transitFee;
            } 

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
     * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
     *
     * <p>BicyclingDirectionNovaResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private StepsCost cost;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("orientation")
        private String orientation;

        @com.aliyun.core.annotation.NameInMap("polyline")
        private String polyline;

        @com.aliyun.core.annotation.NameInMap("roadName")
        private String roadName;

        @com.aliyun.core.annotation.NameInMap("stepDistanceMeter")
        private String stepDistanceMeter;

        private Steps(Builder builder) {
            this.cost = builder.cost;
            this.instruction = builder.instruction;
            this.orientation = builder.orientation;
            this.polyline = builder.polyline;
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
         * @return polyline
         */
        public String getPolyline() {
            return this.polyline;
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
            private String polyline; 
            private String roadName; 
            private String stepDistanceMeter; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.cost = model.cost;
                this.instruction = model.instruction;
                this.orientation = model.orientation;
                this.polyline = model.polyline;
                this.roadName = model.roadName;
                this.stepDistanceMeter = model.stepDistanceMeter;
            } 

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
             * polyline.
             */
            public Builder polyline(String polyline) {
                this.polyline = polyline;
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
     * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
     *
     * <p>BicyclingDirectionNovaResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private Cost cost;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("durationSecond")
        private String durationSecond;

        @com.aliyun.core.annotation.NameInMap("restriction")
        private String restriction;

        @com.aliyun.core.annotation.NameInMap("steps")
        private java.util.List<Steps> steps;

        private Paths(Builder builder) {
            this.cost = builder.cost;
            this.distanceMeter = builder.distanceMeter;
            this.durationSecond = builder.durationSecond;
            this.restriction = builder.restriction;
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
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
         * @return durationSecond
         */
        public String getDurationSecond() {
            return this.durationSecond;
        }

        /**
         * @return restriction
         */
        public String getRestriction() {
            return this.restriction;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private Cost cost; 
            private String distanceMeter; 
            private String durationSecond; 
            private String restriction; 
            private java.util.List<Steps> steps; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.cost = model.cost;
                this.distanceMeter = model.distanceMeter;
                this.durationSecond = model.durationSecond;
                this.restriction = model.restriction;
                this.steps = model.steps;
            } 

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
             * durationSecond.
             */
            public Builder durationSecond(String durationSecond) {
                this.durationSecond = durationSecond;
                return this;
            }

            /**
             * restriction.
             */
            public Builder restriction(String restriction) {
                this.restriction = restriction;
                return this;
            }

            /**
             * steps.
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link BicyclingDirectionNovaResponseBody} extends {@link TeaModel}
     *
     * <p>BicyclingDirectionNovaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("destinationLatitude")
        private String destinationLatitude;

        @com.aliyun.core.annotation.NameInMap("destinationLongitude")
        private String destinationLongitude;

        @com.aliyun.core.annotation.NameInMap("originLatitude")
        private String originLatitude;

        @com.aliyun.core.annotation.NameInMap("originLongitude")
        private String originLongitude;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<Paths> paths;

        @com.aliyun.core.annotation.NameInMap("taxiCost")
        private String taxiCost;

        private Data(Builder builder) {
            this.count = builder.count;
            this.destinationLatitude = builder.destinationLatitude;
            this.destinationLongitude = builder.destinationLongitude;
            this.originLatitude = builder.originLatitude;
            this.originLongitude = builder.originLongitude;
            this.paths = builder.paths;
            this.taxiCost = builder.taxiCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return destinationLatitude
         */
        public String getDestinationLatitude() {
            return this.destinationLatitude;
        }

        /**
         * @return destinationLongitude
         */
        public String getDestinationLongitude() {
            return this.destinationLongitude;
        }

        /**
         * @return originLatitude
         */
        public String getOriginLatitude() {
            return this.originLatitude;
        }

        /**
         * @return originLongitude
         */
        public String getOriginLongitude() {
            return this.originLongitude;
        }

        /**
         * @return paths
         */
        public java.util.List<Paths> getPaths() {
            return this.paths;
        }

        /**
         * @return taxiCost
         */
        public String getTaxiCost() {
            return this.taxiCost;
        }

        public static final class Builder {
            private String count; 
            private String destinationLatitude; 
            private String destinationLongitude; 
            private String originLatitude; 
            private String originLongitude; 
            private java.util.List<Paths> paths; 
            private String taxiCost; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.destinationLatitude = model.destinationLatitude;
                this.destinationLongitude = model.destinationLongitude;
                this.originLatitude = model.originLatitude;
                this.originLongitude = model.originLongitude;
                this.paths = model.paths;
                this.taxiCost = model.taxiCost;
            } 

            /**
             * count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * destinationLatitude.
             */
            public Builder destinationLatitude(String destinationLatitude) {
                this.destinationLatitude = destinationLatitude;
                return this;
            }

            /**
             * destinationLongitude.
             */
            public Builder destinationLongitude(String destinationLongitude) {
                this.destinationLongitude = destinationLongitude;
                return this;
            }

            /**
             * originLatitude.
             */
            public Builder originLatitude(String originLatitude) {
                this.originLatitude = originLatitude;
                return this;
            }

            /**
             * originLongitude.
             */
            public Builder originLongitude(String originLongitude) {
                this.originLongitude = originLongitude;
                return this;
            }

            /**
             * paths.
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * taxiCost.
             */
            public Builder taxiCost(String taxiCost) {
                this.taxiCost = taxiCost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
