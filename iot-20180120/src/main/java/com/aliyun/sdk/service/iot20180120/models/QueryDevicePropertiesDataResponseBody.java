// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicePropertiesDataResponseBody</p>
 */
public class QueryDevicePropertiesDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("NextTime")
    private Long nextTime;

    @NameInMap("NextValid")
    private Boolean nextValid;

    @NameInMap("PropertyDataInfos")
    private PropertyDataInfos propertyDataInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDevicePropertiesDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.nextTime = builder.nextTime;
        this.nextValid = builder.nextValid;
        this.propertyDataInfos = builder.propertyDataInfos;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePropertiesDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nextTime
     */
    public Long getNextTime() {
        return this.nextTime;
    }

    /**
     * @return nextValid
     */
    public Boolean getNextValid() {
        return this.nextValid;
    }

    /**
     * @return propertyDataInfos
     */
    public PropertyDataInfos getPropertyDataInfos() {
        return this.propertyDataInfos;
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
        private String errorMessage; 
        private Long nextTime; 
        private Boolean nextValid; 
        private PropertyDataInfos propertyDataInfos; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * NextTime.
         */
        public Builder nextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }

        /**
         * NextValid.
         */
        public Builder nextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }

        /**
         * PropertyDataInfos.
         */
        public Builder propertyDataInfos(PropertyDataInfos propertyDataInfos) {
            this.propertyDataInfos = propertyDataInfos;
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

        public QueryDevicePropertiesDataResponseBody build() {
            return new QueryDevicePropertiesDataResponseBody(this);
        } 

    } 

    public static class PropertyInfo extends TeaModel {
        @NameInMap("Time")
        private Long time;

        @NameInMap("Value")
        private String value;

        private PropertyInfo(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyInfo create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyInfo build() {
                return new PropertyInfo(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("PropertyInfo")
        private java.util.List < PropertyInfo> propertyInfo;

        private List(Builder builder) {
            this.propertyInfo = builder.propertyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return propertyInfo
         */
        public java.util.List < PropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

        public static final class Builder {
            private java.util.List < PropertyInfo> propertyInfo; 

            /**
             * PropertyInfo.
             */
            public Builder propertyInfo(java.util.List < PropertyInfo> propertyInfo) {
                this.propertyInfo = propertyInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PropertyDataInfo extends TeaModel {
        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("List")
        private List list;

        private PropertyDataInfo(Builder builder) {
            this.identifier = builder.identifier;
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyDataInfo create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        public static final class Builder {
            private String identifier; 
            private List list; 

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            public PropertyDataInfo build() {
                return new PropertyDataInfo(this);
            } 

        } 

    }
    public static class PropertyDataInfos extends TeaModel {
        @NameInMap("PropertyDataInfo")
        private java.util.List < PropertyDataInfo> propertyDataInfo;

        private PropertyDataInfos(Builder builder) {
            this.propertyDataInfo = builder.propertyDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyDataInfos create() {
            return builder().build();
        }

        /**
         * @return propertyDataInfo
         */
        public java.util.List < PropertyDataInfo> getPropertyDataInfo() {
            return this.propertyDataInfo;
        }

        public static final class Builder {
            private java.util.List < PropertyDataInfo> propertyDataInfo; 

            /**
             * PropertyDataInfo.
             */
            public Builder propertyDataInfo(java.util.List < PropertyDataInfo> propertyDataInfo) {
                this.propertyDataInfo = propertyDataInfo;
                return this;
            }

            public PropertyDataInfos build() {
                return new PropertyDataInfos(this);
            } 

        } 

    }
}
