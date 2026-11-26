// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetWeatherResponseBody} extends {@link TeaModel}
 *
 * <p>GetWeatherResponseBody</p>
 */
public class GetWeatherResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetWeatherResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWeatherResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetWeatherResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>HttpCode</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>调用成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>F7E2****B7C94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>model data</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetWeatherResponseBody build() {
            return new GetWeatherResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWeatherResponseBody} extends {@link TeaModel}
     *
     * <p>GetWeatherResponseBody</p>
     */
    public static class Temperature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private String current;

        @com.aliyun.core.annotation.NameInMap("CurrentDesc")
        private String currentDesc;

        @com.aliyun.core.annotation.NameInMap("High")
        private String high;

        @com.aliyun.core.annotation.NameInMap("HighDesc")
        private String highDesc;

        @com.aliyun.core.annotation.NameInMap("Logical")
        private String logical;

        @com.aliyun.core.annotation.NameInMap("Low")
        private String low;

        @com.aliyun.core.annotation.NameInMap("LowDesc")
        private String lowDesc;

        private Temperature(Builder builder) {
            this.current = builder.current;
            this.currentDesc = builder.currentDesc;
            this.high = builder.high;
            this.highDesc = builder.highDesc;
            this.logical = builder.logical;
            this.low = builder.low;
            this.lowDesc = builder.lowDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Temperature create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return currentDesc
         */
        public String getCurrentDesc() {
            return this.currentDesc;
        }

        /**
         * @return high
         */
        public String getHigh() {
            return this.high;
        }

        /**
         * @return highDesc
         */
        public String getHighDesc() {
            return this.highDesc;
        }

        /**
         * @return logical
         */
        public String getLogical() {
            return this.logical;
        }

        /**
         * @return low
         */
        public String getLow() {
            return this.low;
        }

        /**
         * @return lowDesc
         */
        public String getLowDesc() {
            return this.lowDesc;
        }

        public static final class Builder {
            private String current; 
            private String currentDesc; 
            private String high; 
            private String highDesc; 
            private String logical; 
            private String low; 
            private String lowDesc; 

            private Builder() {
            } 

            private Builder(Temperature model) {
                this.current = model.current;
                this.currentDesc = model.currentDesc;
                this.high = model.high;
                this.highDesc = model.highDesc;
                this.logical = model.logical;
                this.low = model.low;
                this.lowDesc = model.lowDesc;
            } 

            /**
             * <p>Current temperature value</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * <p>Description of the current temperature value</p>
             * 
             * <strong>example:</strong>
             * <p>36度</p>
             */
            public Builder currentDesc(String currentDesc) {
                this.currentDesc = currentDesc;
                return this;
            }

            /**
             * <p>Maximum temperature value</p>
             * 
             * <strong>example:</strong>
             * <p>37</p>
             */
            public Builder high(String high) {
                this.high = high;
                return this;
            }

            /**
             * <p>Description of the maximum temperature value</p>
             * 
             * <strong>example:</strong>
             * <p>37度</p>
             */
            public Builder highDesc(String highDesc) {
                this.highDesc = highDesc;
                return this;
            }

            /**
             * <p>Temperature with logic, as follows:</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder logical(String logical) {
                this.logical = logical;
                return this;
            }

            /**
             * <p>Lowest temperature</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder low(String low) {
                this.low = low;
                return this;
            }

            /**
             * <p>Description of the lowest temperature</p>
             * 
             * <strong>example:</strong>
             * <p>28度</p>
             */
            public Builder lowDesc(String lowDesc) {
                this.lowDesc = lowDesc;
                return this;
            }

            public Temperature build() {
                return new Temperature(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWeatherResponseBody} extends {@link TeaModel}
     *
     * <p>GetWeatherResponseBody</p>
     */
    public static class Weather extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Weather(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Weather create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Weather model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>Weather code: for example, &quot;000,100&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>000</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Weather name description: &quot;Sunny (000), Multicloud (100), Overcast (101), Rain (200), Light rain (201), Light to moderate rain (202), Moderate rain (203), Moderate to heavy rain (204), Heavy rain (205), Heavy to storm rain (206), Storm rain (207), Heavy storm rain (209), Severe storm rain (211), Showers (212), Thunderstorms (213), Freezing rain (214), Snow (300), Sleet (301), Snow showers (302), Light snow (303), Light to moderate snow (304), Moderate snow (305), Heavy snow (307), Blizzard (309), Fog (400), Dust (501), Sand blowing (502), Sandstorm (503), Severe sandstorm (504), Mostly sunny (000), Partly cloudy (100), Light showers (212), Lightning (213), Ice pellets (214), Thunderstorms with hail (215), Light snow showers (302), Freezing fog (400), Haze (500), Dust whirls (502), Localized showers (212), Thunderstorm (213), Ice needles (214), Hail (215), Intense showers (212)&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>晴</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Weather build() {
                return new Weather(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWeatherResponseBody} extends {@link TeaModel}
     *
     * <p>GetWeatherResponseBody</p>
     */
    public static class CurrentMeteorology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Temperature temperature;

        @com.aliyun.core.annotation.NameInMap("Weather")
        private Weather weather;

        private CurrentMeteorology(Builder builder) {
            this.temperature = builder.temperature;
            this.weather = builder.weather;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentMeteorology create() {
            return builder().build();
        }

        /**
         * @return temperature
         */
        public Temperature getTemperature() {
            return this.temperature;
        }

        /**
         * @return weather
         */
        public Weather getWeather() {
            return this.weather;
        }

        public static final class Builder {
            private Temperature temperature; 
            private Weather weather; 

            private Builder() {
            } 

            private Builder(CurrentMeteorology model) {
                this.temperature = model.temperature;
                this.weather = model.weather;
            } 

            /**
             * <p>Temperature</p>
             */
            public Builder temperature(Temperature temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>Daytime weather</p>
             */
            public Builder weather(Weather weather) {
                this.weather = weather;
                return this;
            }

            public CurrentMeteorology build() {
                return new CurrentMeteorology(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWeatherResponseBody} extends {@link TeaModel}
     *
     * <p>GetWeatherResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentMeteorology")
        private CurrentMeteorology currentMeteorology;

        private Result(Builder builder) {
            this.currentMeteorology = builder.currentMeteorology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentMeteorology
         */
        public CurrentMeteorology getCurrentMeteorology() {
            return this.currentMeteorology;
        }

        public static final class Builder {
            private CurrentMeteorology currentMeteorology; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.currentMeteorology = model.currentMeteorology;
            } 

            /**
             * <p>Current weather</p>
             */
            public Builder currentMeteorology(CurrentMeteorology currentMeteorology) {
                this.currentMeteorology = currentMeteorology;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
