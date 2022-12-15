// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AirportSearchResponseBody} extends {@link TeaModel}
 *
 * <p>AirportSearchResponseBody</p>
 */
public class AirportSearchResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private AirportSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AirportSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ��ע������ı�ע����Խ����˵��
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module。
         */
        public Builder module(Module module) {
            this.module = module;
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
         * �ɹ���ʶ���ɷ�������ã������쳣ʱΪfalse�����Ϊnull����Ϊfalse��
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public AirportSearchResponseBody build() {
            return new AirportSearchResponseBody(this);
        } 

    } 

    public static class Cities extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("distance")
        private Integer distance;

        @NameInMap("name")
        private String name;

        @NameInMap("travel_name")
        private String travelName;

        private Cities(Builder builder) {
            this.code = builder.code;
            this.distance = builder.distance;
            this.name = builder.name;
            this.travelName = builder.travelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return distance
         */
        public Integer getDistance() {
            return this.distance;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return travelName
         */
        public String getTravelName() {
            return this.travelName;
        }

        public static final class Builder {
            private String code; 
            private Integer distance; 
            private String name; 
            private String travelName; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 与搜索城市距离，单位千米，只在邻近机场推荐有值
             */
            public Builder distance(Integer distance) {
                this.distance = distance;
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
             * 邻近机场城市，只在邻近机场推荐有值
             */
            public Builder travelName(String travelName) {
                this.travelName = travelName;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("cities")
        private java.util.List < Cities> cities;

        @NameInMap("nearby")
        private Boolean nearby;

        private Module(Builder builder) {
            this.cities = builder.cities;
            this.nearby = builder.nearby;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return cities
         */
        public java.util.List < Cities> getCities() {
            return this.cities;
        }

        /**
         * @return nearby
         */
        public Boolean getNearby() {
            return this.nearby;
        }

        public static final class Builder {
            private java.util.List < Cities> cities; 
            private Boolean nearby; 

            /**
             * cities.
             */
            public Builder cities(java.util.List < Cities> cities) {
                this.cities = cities;
                return this;
            }

            /**
             * 是否为邻近城市
             */
            public Builder nearby(Boolean nearby) {
                this.nearby = nearby;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
