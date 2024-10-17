// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSyntheticTaskMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskMonitorsResponseBody</p>
 */
public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSyntheticTaskMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticTaskMonitorsResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 
        private String requestId; 

        /**
         * <p>The status code returned.</p>
         * <ul>
         * <li>1001: The request was successful.</li>
         * <li>1002: The request failed.</li>
         * <li>1003: Parameter errors occurred.</li>
         * <li>1004: Authentication failed.</li>
         * <li>1006: The task does not exist.</li>
         * <li>1099: Internal errors occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the monitoring point.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSyntheticTaskMonitorsResponseBody build() {
            return new GetSyntheticTaskMonitorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSyntheticTaskMonitorsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskMonitorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Busy")
        private Long busy;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityCode")
        private Long cityCode;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Long clientType;

        @com.aliyun.core.annotation.NameInMap("District")
        private String district;

        @com.aliyun.core.annotation.NameInMap("NetServiceId")
        private Long netServiceId;

        @com.aliyun.core.annotation.NameInMap("NetServiceName")
        private String netServiceName;

        private Data(Builder builder) {
            this.busy = builder.busy;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.clientType = builder.clientType;
            this.district = builder.district;
            this.netServiceId = builder.netServiceId;
            this.netServiceName = builder.netServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return busy
         */
        public Long getBusy() {
            return this.busy;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCode
         */
        public Long getCityCode() {
            return this.cityCode;
        }

        /**
         * @return clientType
         */
        public Long getClientType() {
            return this.clientType;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return netServiceId
         */
        public Long getNetServiceId() {
            return this.netServiceId;
        }

        /**
         * @return netServiceName
         */
        public String getNetServiceName() {
            return this.netServiceName;
        }

        public static final class Builder {
            private Long busy; 
            private String city; 
            private Long cityCode; 
            private Long clientType; 
            private String district; 
            private Long netServiceId; 
            private String netServiceName; 

            /**
             * <p>The task status.</p>
             * <ul>
             * <li>0: active</li>
             * <li>1: busy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder busy(Long busy) {
                this.busy = busy;
                return this;
            }

            /**
             * <p>The name of the city to which the monitoring point belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The ID of the city to which the monitoring point belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1100101</p>
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The client type:</p>
             * <ul>
             * <li>1: IDC</li>
             * <li>2: Last mile</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clientType(Long clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The region to which the monitoring point belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * <p>The ID of the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder netServiceId(Long netServiceId) {
                this.netServiceId = netServiceId;
                return this;
            }

            /**
             * <p>The name of the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder netServiceName(String netServiceName) {
                this.netServiceName = netServiceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
