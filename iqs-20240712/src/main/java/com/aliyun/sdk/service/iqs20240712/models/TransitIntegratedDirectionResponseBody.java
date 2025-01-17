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
 * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
 *
 * <p>TransitIntegratedDirectionResponseBody</p>
 */
public class TransitIntegratedDirectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private TransitIntegratedDirectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransitIntegratedDirectionResponseBody create() {
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
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Integer errorCode; 
        private String errorMessage; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(Integer errorCode) {
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
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

        public TransitIntegratedDirectionResponseBody build() {
            return new TransitIntegratedDirectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
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
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class PathsCost extends TeaModel {
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

        private PathsCost(Builder builder) {
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

        public static PathsCost create() {
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

            public PathsCost build() {
                return new PathsCost(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Exit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Exit(Builder builder) {
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exit create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String location; 
            private String name; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Exit build() {
                return new Exit(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class ArrivalStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exit")
        private Exit exit;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ArrivalStop(Builder builder) {
            this.exit = builder.exit;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrivalStop create() {
            return builder().build();
        }

        /**
         * @return exit
         */
        public Exit getExit() {
            return this.exit;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Exit exit; 
            private String id; 
            private String location; 
            private String name; 

            /**
             * exit.
             */
            public Builder exit(Exit exit) {
                this.exit = exit;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ArrivalStop build() {
                return new ArrivalStop(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class BuslinesCost extends TeaModel {
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

        private BuslinesCost(Builder builder) {
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

        public static BuslinesCost create() {
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

            public BuslinesCost build() {
                return new BuslinesCost(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Entrance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Entrance(Builder builder) {
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entrance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String location; 
            private String name; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Entrance build() {
                return new Entrance(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class DepartureStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entrance")
        private Entrance entrance;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private DepartureStop(Builder builder) {
            this.entrance = builder.entrance;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepartureStop create() {
            return builder().build();
        }

        /**
         * @return entrance
         */
        public Entrance getEntrance() {
            return this.entrance;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Entrance entrance; 
            private String id; 
            private String location; 
            private String name; 

            /**
             * entrance.
             */
            public Builder entrance(Entrance entrance) {
                this.entrance = entrance;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DepartureStop build() {
                return new DepartureStop(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Polyline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("polyline")
        private String polyline;

        private Polyline(Builder builder) {
            this.polyline = builder.polyline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polyline create() {
            return builder().build();
        }

        /**
         * @return polyline
         */
        public String getPolyline() {
            return this.polyline;
        }

        public static final class Builder {
            private String polyline; 

            /**
             * polyline.
             */
            public Builder polyline(String polyline) {
                this.polyline = polyline;
                return this;
            }

            public Polyline build() {
                return new Polyline(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class ViaStops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ViaStops(Builder builder) {
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViaStops create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String location; 
            private String name; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ViaStops build() {
                return new ViaStops(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Buslines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrivalStop")
        private ArrivalStop arrivalStop;

        @com.aliyun.core.annotation.NameInMap("busTimeTips")
        private String busTimeTips;

        @com.aliyun.core.annotation.NameInMap("bustimetag")
        private String bustimetag;

        @com.aliyun.core.annotation.NameInMap("cost")
        private BuslinesCost cost;

        @com.aliyun.core.annotation.NameInMap("departureStop")
        private DepartureStop departureStop;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("polyline")
        private Polyline polyline;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("viaNum")
        private String viaNum;

        @com.aliyun.core.annotation.NameInMap("viaStops")
        private java.util.List<ViaStops> viaStops;

        private Buslines(Builder builder) {
            this.arrivalStop = builder.arrivalStop;
            this.busTimeTips = builder.busTimeTips;
            this.bustimetag = builder.bustimetag;
            this.cost = builder.cost;
            this.departureStop = builder.departureStop;
            this.distanceMeter = builder.distanceMeter;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.polyline = builder.polyline;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.viaNum = builder.viaNum;
            this.viaStops = builder.viaStops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Buslines create() {
            return builder().build();
        }

        /**
         * @return arrivalStop
         */
        public ArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        /**
         * @return busTimeTips
         */
        public String getBusTimeTips() {
            return this.busTimeTips;
        }

        /**
         * @return bustimetag
         */
        public String getBustimetag() {
            return this.bustimetag;
        }

        /**
         * @return cost
         */
        public BuslinesCost getCost() {
            return this.cost;
        }

        /**
         * @return departureStop
         */
        public DepartureStop getDepartureStop() {
            return this.departureStop;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return polyline
         */
        public Polyline getPolyline() {
            return this.polyline;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return viaNum
         */
        public String getViaNum() {
            return this.viaNum;
        }

        /**
         * @return viaStops
         */
        public java.util.List<ViaStops> getViaStops() {
            return this.viaStops;
        }

        public static final class Builder {
            private ArrivalStop arrivalStop; 
            private String busTimeTips; 
            private String bustimetag; 
            private BuslinesCost cost; 
            private DepartureStop departureStop; 
            private String distanceMeter; 
            private String endTime; 
            private String id; 
            private String name; 
            private Polyline polyline; 
            private String startTime; 
            private String type; 
            private String viaNum; 
            private java.util.List<ViaStops> viaStops; 

            /**
             * arrivalStop.
             */
            public Builder arrivalStop(ArrivalStop arrivalStop) {
                this.arrivalStop = arrivalStop;
                return this;
            }

            /**
             * busTimeTips.
             */
            public Builder busTimeTips(String busTimeTips) {
                this.busTimeTips = busTimeTips;
                return this;
            }

            /**
             * bustimetag.
             */
            public Builder bustimetag(String bustimetag) {
                this.bustimetag = bustimetag;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(BuslinesCost cost) {
                this.cost = cost;
                return this;
            }

            /**
             * departureStop.
             */
            public Builder departureStop(DepartureStop departureStop) {
                this.departureStop = departureStop;
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
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * polyline.
             */
            public Builder polyline(Polyline polyline) {
                this.polyline = polyline;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * viaNum.
             */
            public Builder viaNum(String viaNum) {
                this.viaNum = viaNum;
                return this;
            }

            /**
             * viaStops.
             */
            public Builder viaStops(java.util.List<ViaStops> viaStops) {
                this.viaStops = viaStops;
                return this;
            }

            public Buslines build() {
                return new Buslines(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Bus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buslines")
        private java.util.List<Buslines> buslines;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        private Bus(Builder builder) {
            this.buslines = builder.buslines;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bus create() {
            return builder().build();
        }

        /**
         * @return buslines
         */
        public java.util.List<Buslines> getBuslines() {
            return this.buslines;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        public static final class Builder {
            private java.util.List<Buslines> buslines; 
            private String index; 

            /**
             * buslines.
             */
            public Builder buslines(java.util.List<Buslines> buslines) {
                this.buslines = buslines;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            public Bus build() {
                return new Bus(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class RailwayArrivalStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        private RailwayArrivalStop(Builder builder) {
            this.adcode = builder.adcode;
            this.end = builder.end;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RailwayArrivalStop create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String adcode; 
            private String end; 
            private String id; 
            private String location; 
            private String name; 
            private String time; 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * <p>end</p>
             * 
             * <strong>example:</strong>
             * <p>1699410466578</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public RailwayArrivalStop build() {
                return new RailwayArrivalStop(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class RailwayDepartureStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        private RailwayDepartureStop(Builder builder) {
            this.adcode = builder.adcode;
            this.id = builder.id;
            this.location = builder.location;
            this.name = builder.name;
            this.start = builder.start;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RailwayDepartureStop create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String adcode; 
            private String id; 
            private String location; 
            private String name; 
            private String start; 
            private String time; 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public RailwayDepartureStop build() {
                return new RailwayDepartureStop(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Spaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("cost")
        private String cost;

        private Spaces(Builder builder) {
            this.code = builder.code;
            this.cost = builder.cost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spaces create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return cost
         */
        public String getCost() {
            return this.cost;
        }

        public static final class Builder {
            private String code; 
            private String cost; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            public Spaces build() {
                return new Spaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Railway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrivalStop")
        private RailwayArrivalStop arrivalStop;

        @com.aliyun.core.annotation.NameInMap("departureStop")
        private RailwayDepartureStop departureStop;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("spaces")
        private java.util.List<Spaces> spaces;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("trip")
        private String trip;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Railway(Builder builder) {
            this.arrivalStop = builder.arrivalStop;
            this.departureStop = builder.departureStop;
            this.distanceMeter = builder.distanceMeter;
            this.id = builder.id;
            this.index = builder.index;
            this.name = builder.name;
            this.spaces = builder.spaces;
            this.time = builder.time;
            this.trip = builder.trip;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Railway create() {
            return builder().build();
        }

        /**
         * @return arrivalStop
         */
        public RailwayArrivalStop getArrivalStop() {
            return this.arrivalStop;
        }

        /**
         * @return departureStop
         */
        public RailwayDepartureStop getDepartureStop() {
            return this.departureStop;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spaces
         */
        public java.util.List<Spaces> getSpaces() {
            return this.spaces;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return trip
         */
        public String getTrip() {
            return this.trip;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private RailwayArrivalStop arrivalStop; 
            private RailwayDepartureStop departureStop; 
            private String distanceMeter; 
            private String id; 
            private String index; 
            private String name; 
            private java.util.List<Spaces> spaces; 
            private String time; 
            private String trip; 
            private String type; 

            /**
             * arrivalStop.
             */
            public Builder arrivalStop(RailwayArrivalStop arrivalStop) {
                this.arrivalStop = arrivalStop;
                return this;
            }

            /**
             * departureStop.
             */
            public Builder departureStop(RailwayDepartureStop departureStop) {
                this.departureStop = departureStop;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * spaces.
             */
            public Builder spaces(java.util.List<Spaces> spaces) {
                this.spaces = spaces;
                return this;
            }

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * trip.
             */
            public Builder trip(String trip) {
                this.trip = trip;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Railway build() {
                return new Railway(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Taxi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destinationName")
        private String destinationName;

        @com.aliyun.core.annotation.NameInMap("destinationPoint")
        private String destinationPoint;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("driveTimeSecond")
        private String driveTimeSecond;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("originName")
        private String originName;

        @com.aliyun.core.annotation.NameInMap("originPoint")
        private String originPoint;

        @com.aliyun.core.annotation.NameInMap("price")
        private String price;

        private Taxi(Builder builder) {
            this.destinationName = builder.destinationName;
            this.destinationPoint = builder.destinationPoint;
            this.distanceMeter = builder.distanceMeter;
            this.driveTimeSecond = builder.driveTimeSecond;
            this.index = builder.index;
            this.originName = builder.originName;
            this.originPoint = builder.originPoint;
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taxi create() {
            return builder().build();
        }

        /**
         * @return destinationName
         */
        public String getDestinationName() {
            return this.destinationName;
        }

        /**
         * @return destinationPoint
         */
        public String getDestinationPoint() {
            return this.destinationPoint;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return driveTimeSecond
         */
        public String getDriveTimeSecond() {
            return this.driveTimeSecond;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return originName
         */
        public String getOriginName() {
            return this.originName;
        }

        /**
         * @return originPoint
         */
        public String getOriginPoint() {
            return this.originPoint;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String destinationName; 
            private String destinationPoint; 
            private String distanceMeter; 
            private String driveTimeSecond; 
            private String index; 
            private String originName; 
            private String originPoint; 
            private String price; 

            /**
             * destinationName.
             */
            public Builder destinationName(String destinationName) {
                this.destinationName = destinationName;
                return this;
            }

            /**
             * destinationPoint.
             */
            public Builder destinationPoint(String destinationPoint) {
                this.destinationPoint = destinationPoint;
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
             * driveTimeSecond.
             */
            public Builder driveTimeSecond(String driveTimeSecond) {
                this.driveTimeSecond = driveTimeSecond;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * originName.
             */
            public Builder originName(String originName) {
                this.originName = originName;
                return this;
            }

            /**
             * originPoint.
             */
            public Builder originPoint(String originPoint) {
                this.originPoint = originPoint;
                return this;
            }

            /**
             * price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            public Taxi build() {
                return new Taxi(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class WalkingCost extends TeaModel {
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

        private WalkingCost(Builder builder) {
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

        public static WalkingCost create() {
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

            public WalkingCost build() {
                return new WalkingCost(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
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
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class StepsPolyline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("polyline")
        private String polyline;

        private StepsPolyline(Builder builder) {
            this.polyline = builder.polyline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepsPolyline create() {
            return builder().build();
        }

        /**
         * @return polyline
         */
        public String getPolyline() {
            return this.polyline;
        }

        public static final class Builder {
            private String polyline; 

            /**
             * polyline.
             */
            public Builder polyline(String polyline) {
                this.polyline = polyline;
                return this;
            }

            public StepsPolyline build() {
                return new StepsPolyline(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private StepsCost cost;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("orientation")
        private String orientation;

        @com.aliyun.core.annotation.NameInMap("polyline")
        private StepsPolyline polyline;

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
        public StepsPolyline getPolyline() {
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
            private StepsPolyline polyline; 
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
             * polyline.
             */
            public Builder polyline(StepsPolyline polyline) {
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
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Walking extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private WalkingCost cost;

        @com.aliyun.core.annotation.NameInMap("destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("steps")
        private java.util.List<Steps> steps;

        private Walking(Builder builder) {
            this.cost = builder.cost;
            this.destination = builder.destination;
            this.distanceMeter = builder.distanceMeter;
            this.index = builder.index;
            this.origin = builder.origin;
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Walking create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public WalkingCost getCost() {
            return this.cost;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private WalkingCost cost; 
            private String destination; 
            private String distanceMeter; 
            private String index; 
            private String origin; 
            private java.util.List<Steps> steps; 

            /**
             * cost.
             */
            public Builder cost(WalkingCost cost) {
                this.cost = cost;
                return this;
            }

            /**
             * destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
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
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * steps.
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            public Walking build() {
                return new Walking(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Segments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bus")
        private Bus bus;

        @com.aliyun.core.annotation.NameInMap("railway")
        private Railway railway;

        @com.aliyun.core.annotation.NameInMap("taxi")
        private Taxi taxi;

        @com.aliyun.core.annotation.NameInMap("walking")
        private Walking walking;

        private Segments(Builder builder) {
            this.bus = builder.bus;
            this.railway = builder.railway;
            this.taxi = builder.taxi;
            this.walking = builder.walking;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segments create() {
            return builder().build();
        }

        /**
         * @return bus
         */
        public Bus getBus() {
            return this.bus;
        }

        /**
         * @return railway
         */
        public Railway getRailway() {
            return this.railway;
        }

        /**
         * @return taxi
         */
        public Taxi getTaxi() {
            return this.taxi;
        }

        /**
         * @return walking
         */
        public Walking getWalking() {
            return this.walking;
        }

        public static final class Builder {
            private Bus bus; 
            private Railway railway; 
            private Taxi taxi; 
            private Walking walking; 

            /**
             * bus.
             */
            public Builder bus(Bus bus) {
                this.bus = bus;
                return this;
            }

            /**
             * railway.
             */
            public Builder railway(Railway railway) {
                this.railway = railway;
                return this;
            }

            /**
             * taxi.
             */
            public Builder taxi(Taxi taxi) {
                this.taxi = taxi;
                return this;
            }

            /**
             * walking.
             */
            public Builder walking(Walking walking) {
                this.walking = walking;
                return this;
            }

            public Segments build() {
                return new Segments(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private PathsCost cost;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("nightflag")
        private String nightflag;

        @com.aliyun.core.annotation.NameInMap("segments")
        private java.util.List<Segments> segments;

        @com.aliyun.core.annotation.NameInMap("walkingDistanceMeter")
        private String walkingDistanceMeter;

        private Paths(Builder builder) {
            this.cost = builder.cost;
            this.distanceMeter = builder.distanceMeter;
            this.nightflag = builder.nightflag;
            this.segments = builder.segments;
            this.walkingDistanceMeter = builder.walkingDistanceMeter;
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
        public PathsCost getCost() {
            return this.cost;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
        }

        /**
         * @return nightflag
         */
        public String getNightflag() {
            return this.nightflag;
        }

        /**
         * @return segments
         */
        public java.util.List<Segments> getSegments() {
            return this.segments;
        }

        /**
         * @return walkingDistanceMeter
         */
        public String getWalkingDistanceMeter() {
            return this.walkingDistanceMeter;
        }

        public static final class Builder {
            private PathsCost cost; 
            private String distanceMeter; 
            private String nightflag; 
            private java.util.List<Segments> segments; 
            private String walkingDistanceMeter; 

            /**
             * cost.
             */
            public Builder cost(PathsCost cost) {
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
             * nightflag.
             */
            public Builder nightflag(String nightflag) {
                this.nightflag = nightflag;
                return this;
            }

            /**
             * segments.
             */
            public Builder segments(java.util.List<Segments> segments) {
                this.segments = segments;
                return this;
            }

            /**
             * walkingDistanceMeter.
             */
            public Builder walkingDistanceMeter(String walkingDistanceMeter) {
                this.walkingDistanceMeter = walkingDistanceMeter;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link TransitIntegratedDirectionResponseBody} extends {@link TeaModel}
     *
     * <p>TransitIntegratedDirectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private Cost cost;

        @com.aliyun.core.annotation.NameInMap("count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("destinationLatitude")
        private String destinationLatitude;

        @com.aliyun.core.annotation.NameInMap("destinationLongitude")
        private String destinationLongitude;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("originLatitude")
        private String originLatitude;

        @com.aliyun.core.annotation.NameInMap("originLongitude")
        private String originLongitude;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<Paths> paths;

        private Data(Builder builder) {
            this.cost = builder.cost;
            this.count = builder.count;
            this.destinationLatitude = builder.destinationLatitude;
            this.destinationLongitude = builder.destinationLongitude;
            this.distanceMeter = builder.distanceMeter;
            this.originLatitude = builder.originLatitude;
            this.originLongitude = builder.originLongitude;
            this.paths = builder.paths;
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
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
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

        public static final class Builder {
            private Cost cost; 
            private String count; 
            private String destinationLatitude; 
            private String destinationLongitude; 
            private String distanceMeter; 
            private String originLatitude; 
            private String originLongitude; 
            private java.util.List<Paths> paths; 

            /**
             * cost.
             */
            public Builder cost(Cost cost) {
                this.cost = cost;
                return this;
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
             * distanceMeter.
             */
            public Builder distanceMeter(String distanceMeter) {
                this.distanceMeter = distanceMeter;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
