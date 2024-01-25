// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiearth_meteorology20210928.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GridQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GridQueryResponseBody</p>
 */
public class GridQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private Long code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GridQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GridQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
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

    public static final class Builder {
        private Long code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * module.
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GridQueryResponseBody build() {
            return new GridQueryResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("dataType")
        private String dataType;

        @NameInMap("element")
        private String element;

        @NameInMap("elementUnit")
        private String elementUnit;

        @NameInMap("forecastTimestamp")
        private String forecastTimestamp;

        @NameInMap("latitude")
        private Double latitude;

        @NameInMap("longitude")
        private Double longitude;

        @NameInMap("reportTimestamp")
        private String reportTimestamp;

        @NameInMap("value")
        private Double value;

        private List(Builder builder) {
            this.dataType = builder.dataType;
            this.element = builder.element;
            this.elementUnit = builder.elementUnit;
            this.forecastTimestamp = builder.forecastTimestamp;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.reportTimestamp = builder.reportTimestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return element
         */
        public String getElement() {
            return this.element;
        }

        /**
         * @return elementUnit
         */
        public String getElementUnit() {
            return this.elementUnit;
        }

        /**
         * @return forecastTimestamp
         */
        public String getForecastTimestamp() {
            return this.forecastTimestamp;
        }

        /**
         * @return latitude
         */
        public Double getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Double getLongitude() {
            return this.longitude;
        }

        /**
         * @return reportTimestamp
         */
        public String getReportTimestamp() {
            return this.reportTimestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dataType; 
            private String element; 
            private String elementUnit; 
            private String forecastTimestamp; 
            private Double latitude; 
            private Double longitude; 
            private String reportTimestamp; 
            private Double value; 

            /**
             * dataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * element.
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * elementUnit.
             */
            public Builder elementUnit(String elementUnit) {
                this.elementUnit = elementUnit;
                return this;
            }

            /**
             * forecastTimestamp.
             */
            public Builder forecastTimestamp(String forecastTimestamp) {
                this.forecastTimestamp = forecastTimestamp;
                return this;
            }

            /**
             * latitude.
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * longitude.
             */
            public Builder longitude(Double longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * reportTimestamp.
             */
            public Builder reportTimestamp(String reportTimestamp) {
                this.reportTimestamp = reportTimestamp;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNo")
        private Integer pageNo;

        @NameInMap("pageSize")
        private Integer pageSize;

        private Module(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNo; 
            private Integer pageSize; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
