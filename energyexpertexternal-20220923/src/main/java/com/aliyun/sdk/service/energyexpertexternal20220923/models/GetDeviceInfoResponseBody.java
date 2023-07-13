// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceInfoResponseBody</p>
 */
public class GetDeviceInfoResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetDeviceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceInfoResponseBody create() {
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Integer httpCode; 
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
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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

        public GetDeviceInfoResponseBody build() {
            return new GetDeviceInfoResponseBody(this);
        } 

    } 

    public static class RecordList extends TeaModel {
        @NameInMap("identifier")
        private String identifier;

        @NameInMap("paramName")
        private String paramName;

        @NameInMap("statisticsDate")
        private String statisticsDate;

        @NameInMap("type")
        private String type;

        @NameInMap("unit")
        private String unit;

        @NameInMap("value")
        private Double value;

        private RecordList(Builder builder) {
            this.identifier = builder.identifier;
            this.paramName = builder.paramName;
            this.statisticsDate = builder.statisticsDate;
            this.type = builder.type;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordList create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return statisticsDate
         */
        public String getStatisticsDate() {
            return this.statisticsDate;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String identifier; 
            private String paramName; 
            private String statisticsDate; 
            private String type; 
            private String unit; 
            private Double value; 

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * paramName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * statisticsDate.
             */
            public Builder statisticsDate(String statisticsDate) {
                this.statisticsDate = statisticsDate;
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
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("deviceId")
        private String deviceId;

        @NameInMap("deviceName")
        private String deviceName;

        @NameInMap("firstTypeName")
        private String firstTypeName;

        @NameInMap("recordList")
        private java.util.List < RecordList> recordList;

        @NameInMap("secondTypeName")
        private String secondTypeName;

        private Data(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.firstTypeName = builder.firstTypeName;
            this.recordList = builder.recordList;
            this.secondTypeName = builder.secondTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return firstTypeName
         */
        public String getFirstTypeName() {
            return this.firstTypeName;
        }

        /**
         * @return recordList
         */
        public java.util.List < RecordList> getRecordList() {
            return this.recordList;
        }

        /**
         * @return secondTypeName
         */
        public String getSecondTypeName() {
            return this.secondTypeName;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private String firstTypeName; 
            private java.util.List < RecordList> recordList; 
            private String secondTypeName; 

            /**
             * deviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * deviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * firstTypeName.
             */
            public Builder firstTypeName(String firstTypeName) {
                this.firstTypeName = firstTypeName;
                return this;
            }

            /**
             * recordList.
             */
            public Builder recordList(java.util.List < RecordList> recordList) {
                this.recordList = recordList;
                return this;
            }

            /**
             * secondTypeName.
             */
            public Builder secondTypeName(String secondTypeName) {
                this.secondTypeName = secondTypeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
