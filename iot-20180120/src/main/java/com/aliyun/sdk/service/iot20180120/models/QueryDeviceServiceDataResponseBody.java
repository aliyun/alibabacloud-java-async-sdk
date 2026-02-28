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
 * {@link QueryDeviceServiceDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceServiceDataResponseBody</p>
 */
public class QueryDeviceServiceDataResponseBody extends TeaModel {
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

    private QueryDeviceServiceDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceServiceDataResponseBody create() {
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

        private Builder(QueryDeviceServiceDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The service call records returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request. The ID uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
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

        public QueryDeviceServiceDataResponseBody build() {
            return new QueryDeviceServiceDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceServiceDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceServiceDataResponseBody</p>
     */
    public static class ServiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("InputData")
        private String inputData;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputData")
        private String outputData;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ServiceInfo(Builder builder) {
            this.identifier = builder.identifier;
            this.inputData = builder.inputData;
            this.name = builder.name;
            this.outputData = builder.outputData;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return inputData
         */
        public String getInputData() {
            return this.inputData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputData
         */
        public String getOutputData() {
            return this.outputData;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String identifier; 
            private String inputData; 
            private String name; 
            private String outputData; 
            private String time; 

            private Builder() {
            } 

            private Builder(ServiceInfo model) {
                this.identifier = model.identifier;
                this.inputData = model.inputData;
                this.name = model.name;
                this.outputData = model.outputData;
                this.time = model.time;
            } 

            /**
             * <p>The identifier of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Set</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The input parameter of the service. The value is a string in the MAP format. Syntax: <code>key:value</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;LightAdjustLevel&quot;:123}</p>
             */
            public Builder inputData(String inputData) {
                this.inputData = inputData;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output parameter of the service. The value is a string in the MAP format. Syntax: <code>key:value</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;code&quot;:200,&quot;data&quot;:{},&quot;id&quot;:&quot;100686&quot;,&quot;message&quot;:&quot;success&quot;,&quot;version&quot;:&quot;1.0&quot;}</p>
             */
            public Builder outputData(String outputData) {
                this.outputData = outputData;
                return this;
            }

            /**
             * <p>The time when the service was called.</p>
             * 
             * <strong>example:</strong>
             * <p>1579249499000</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceServiceDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceServiceDataResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceInfo")
        private java.util.List<ServiceInfo> serviceInfo;

        private List(Builder builder) {
            this.serviceInfo = builder.serviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return serviceInfo
         */
        public java.util.List<ServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

        public static final class Builder {
            private java.util.List<ServiceInfo> serviceInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.serviceInfo = model.serviceInfo;
            } 

            /**
             * ServiceInfo.
             */
            public Builder serviceInfo(java.util.List<ServiceInfo> serviceInfo) {
                this.serviceInfo = serviceInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceServiceDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceServiceDataResponseBody</p>
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
             * <p>The array of service call records. Each element represents a service call record.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The start time of service call records on the next page. </p>
             * <p>If you call the QueryDeviceServiceData operation to query the service call records on the next page, you must set the <strong>StartTime</strong> parameter to the value of this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1579335899000</p>
             */
            public Builder nextTime(Long nextTime) {
                this.nextTime = nextTime;
                return this;
            }

            /**
             * <p>Indicates whether the next page exists.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
