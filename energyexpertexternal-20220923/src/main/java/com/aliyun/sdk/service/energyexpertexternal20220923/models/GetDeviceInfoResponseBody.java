// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceInfoResponseBody</p>
 */
public class GetDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDeviceInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeviceInfoResponseBody build() {
            return new GetDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceInfoResponseBody</p>
     */
    public static class RecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("paramName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("statisticsDate")
        private String statisticsDate;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(RecordList model) {
                this.identifier = model.identifier;
                this.paramName = model.paramName;
                this.statisticsDate = model.statisticsDate;
                this.type = model.type;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The device identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Ia</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>Phase A current</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The date on which the statistics were collected.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-26 00:00:00</p>
             */
            public Builder statisticsDate(String statisticsDate) {
                this.statisticsDate = statisticsDate;
                return this;
            }

            /**
             * <p>The type of the measuring point.</p>
             * 
             * <strong>example:</strong>
             * <p>DOUBLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unit of the parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the measuring point.</p>
             * 
             * <strong>example:</strong>
             * <p>20.00</p>
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
    /**
     * 
     * {@link GetDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("deviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("firstTypeName")
        private String firstTypeName;

        @com.aliyun.core.annotation.NameInMap("recordList")
        private java.util.List<RecordList> recordList;

        @com.aliyun.core.annotation.NameInMap("secondTypeName")
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
        public java.util.List<RecordList> getRecordList() {
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
            private java.util.List<RecordList> recordList; 
            private String secondTypeName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceId = model.deviceId;
                this.deviceName = model.deviceName;
                this.firstTypeName = model.firstTypeName;
                this.recordList = model.recordList;
                this.secondTypeName = model.secondTypeName;
            } 

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>pn_69873</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Main transformer 4#</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The level 1 meter type.</p>
             * 
             * <strong>example:</strong>
             * <p>Electric meter</p>
             */
            public Builder firstTypeName(String firstTypeName) {
                this.firstTypeName = firstTypeName;
                return this;
            }

            /**
             * <p>The device parameters.</p>
             */
            public Builder recordList(java.util.List<RecordList> recordList) {
                this.recordList = recordList;
                return this;
            }

            /**
             * <p>The level 2 meter type.</p>
             * 
             * <strong>example:</strong>
             * <p>Gateway meter</p>
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
