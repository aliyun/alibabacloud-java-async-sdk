// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicePropertiesDataResponseBody</p>
 */
public class QueryDevicePropertiesDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NextTime")
    private Long nextTime;

    @com.aliyun.core.annotation.NameInMap("NextValid")
    private Boolean nextValid;

    @com.aliyun.core.annotation.NameInMap("PropertyDataInfos")
    private PropertyDataInfos propertyDataInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryDevicePropertiesDataResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.nextTime = model.nextTime;
            this.nextValid = model.nextValid;
            this.propertyDataInfos = model.propertyDataInfos;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The start time to query on the next page.</p>
         * <p>You can use the value of the <strong>NextTime</strong> parameter as the value of the <strong>StartTime</strong> parameter when you query the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1579249499000</p>
         */
        public Builder nextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }

        /**
         * <p>Indicates whether the next page exists.</p>
         * <ul>
         * <li><strong>true</strong>: The next page exists.</li>
         * <li><strong>false</strong>: The next page does not exist.</li>
         * </ul>
         * <p>If the return value of the <strong>NextValid</strong> parameter is <strong>true</strong>, you can use the value of the <strong>NextTime</strong> parameter as the value of the <strong>StartTime</strong> parameter when you query the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }

        /**
         * <p>The list of property records returned if the call is successful. For more information, see <strong>PropertyDataInfo</strong>.</p>
         */
        public Builder propertyDataInfos(PropertyDataInfos propertyDataInfos) {
            this.propertyDataInfos = propertyDataInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. </p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDevicePropertiesDataResponseBody build() {
            return new QueryDevicePropertiesDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertiesDataResponseBody</p>
     */
    public static class PropertyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(PropertyInfo model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The time when the property was submitted. The value is a timestamp in milliseconds, such as 1579249499000.</p>
             * 
             * <strong>example:</strong>
             * <p>1579249499000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>21.3</p>
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
    /**
     * 
     * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertiesDataResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyInfo")
        private java.util.List<PropertyInfo> propertyInfo;

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
        public java.util.List<PropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

        public static final class Builder {
            private java.util.List<PropertyInfo> propertyInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.propertyInfo = model.propertyInfo;
            } 

            /**
             * PropertyInfo.
             */
            public Builder propertyInfo(java.util.List<PropertyInfo> propertyInfo) {
                this.propertyInfo = propertyInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertiesDataResponseBody</p>
     */
    public static class PropertyDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("List")
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

            private Builder() {
            } 

            private Builder(PropertyDataInfo model) {
                this.identifier = model.identifier;
                this.list = model.list;
            } 

            /**
             * <p>The identifier of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>temperature</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The list of property records.</p>
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
    /**
     * 
     * {@link QueryDevicePropertiesDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertiesDataResponseBody</p>
     */
    public static class PropertyDataInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyDataInfo")
        private java.util.List<PropertyDataInfo> propertyDataInfo;

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
        public java.util.List<PropertyDataInfo> getPropertyDataInfo() {
            return this.propertyDataInfo;
        }

        public static final class Builder {
            private java.util.List<PropertyDataInfo> propertyDataInfo; 

            private Builder() {
            } 

            private Builder(PropertyDataInfos model) {
                this.propertyDataInfo = model.propertyDataInfo;
            } 

            /**
             * PropertyDataInfo.
             */
            public Builder propertyDataInfo(java.util.List<PropertyDataInfo> propertyDataInfo) {
                this.propertyDataInfo = propertyDataInfo;
                return this;
            }

            public PropertyDataInfos build() {
                return new PropertyDataInfos(this);
            } 

        } 

    }
}
