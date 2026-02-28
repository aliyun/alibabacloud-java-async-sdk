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
 * {@link QueryDevicePropertyDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicePropertyDataResponseBody</p>
 */
public class QueryDevicePropertyDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDevicePropertyDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePropertyDataResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDevicePropertyDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * <p>The property data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Indicates whether the call was successful.</p>
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

        public QueryDevicePropertyDataResponseBody build() {
            return new QueryDevicePropertyDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDevicePropertyDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertyDataResponseBody</p>
     */
    public static class PropertyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

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
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            private Builder() {
            } 

            private Builder(PropertyInfo model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The time when the property was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1516541885630</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
     * {@link QueryDevicePropertyDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertyDataResponseBody</p>
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
     * {@link QueryDevicePropertyDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicePropertyDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("NextTime")
        private Long nextTime;

        @com.aliyun.core.annotation.NameInMap("NextValid")
        private Boolean nextValid;

        private Data(Builder builder) {
            this.list = builder.list;
            this.nextTime = builder.nextTime;
            this.nextValid = builder.nextValid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
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

        public static final class Builder {
            private List list; 
            private Long nextTime; 
            private Boolean nextValid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.nextTime = model.nextTime;
                this.nextValid = model.nextValid;
            } 

            /**
             * <p>The list of property records.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The start time of the property records on the next page. </p>
             * <ul>
             * <li>If the <strong>Asc</strong> parameter is set to <strong>0</strong>, you can specify this value for the <strong>EndTime</strong> parameter when you call this operation again to query the next page of property records.</li>
             * <li>If the <strong>Asc</strong> parameter is set to <strong>1</strong>, you can specify this value for the <strong>StartTime</strong> parameter when you call this operation again to query the next page of property records.</li>
             * </ul>
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
             * <li><strong>true</strong>: The next page exists. If the return value of the NextValid parameter is true, the value of the <strong>NextTime</strong> parameter is returned. For more information, see the description of the <strong>NextTime</strong> parameter in this topic.</li>
             * <li><strong>false</strong>: The next page does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder nextValid(Boolean nextValid) {
                this.nextValid = nextValid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
