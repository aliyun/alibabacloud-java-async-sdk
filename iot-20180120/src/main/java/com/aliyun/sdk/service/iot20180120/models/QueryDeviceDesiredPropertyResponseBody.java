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
 * {@link QueryDeviceDesiredPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceDesiredPropertyResponseBody</p>
 */
public class QueryDeviceDesiredPropertyResponseBody extends TeaModel {
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

    private QueryDeviceDesiredPropertyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceDesiredPropertyResponseBody create() {
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

        private Builder(QueryDeviceDesiredPropertyResponseBody model) {
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
         * <p>The data returned in the <strong>List</strong> parameter if the call is successful.</p>
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

        public QueryDeviceDesiredPropertyResponseBody build() {
            return new QueryDeviceDesiredPropertyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceDesiredPropertyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDesiredPropertyResponseBody</p>
     */
    public static class DesiredPropertyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private DesiredPropertyInfo(Builder builder) {
            this.dataType = builder.dataType;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.time = builder.time;
            this.unit = builder.unit;
            this.value = builder.value;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesiredPropertyInfo create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
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
        public String getValue() {
            return this.value;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String dataType; 
            private String identifier; 
            private String name; 
            private String time; 
            private String unit; 
            private String value; 
            private Long version; 

            private Builder() {
            } 

            private Builder(DesiredPropertyInfo model) {
                this.dataType = model.dataType;
                this.identifier = model.identifier;
                this.name = model.name;
                this.time = model.time;
                this.unit = model.unit;
                this.value = model.value;
                this.version = model.version;
            } 

            /**
             * <p>The data type of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>int</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The identifier of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>Temperature</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>airconditioning</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the desired value of the property was last modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579335899000</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The unit of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>℃</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The desired value of the property.</p>
             * <blockquote>
             * <p> If you call the <a href="https://help.aliyun.com/document_detail/477431.html">ClearDeviceDesiredProperty</a> operation to delete the desired value of the property, the <strong>Value</strong> parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The version of the desired value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public DesiredPropertyInfo build() {
                return new DesiredPropertyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceDesiredPropertyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDesiredPropertyResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredPropertyInfo")
        private java.util.List<DesiredPropertyInfo> desiredPropertyInfo;

        private List(Builder builder) {
            this.desiredPropertyInfo = builder.desiredPropertyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return desiredPropertyInfo
         */
        public java.util.List<DesiredPropertyInfo> getDesiredPropertyInfo() {
            return this.desiredPropertyInfo;
        }

        public static final class Builder {
            private java.util.List<DesiredPropertyInfo> desiredPropertyInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.desiredPropertyInfo = model.desiredPropertyInfo;
            } 

            /**
             * DesiredPropertyInfo.
             */
            public Builder desiredPropertyInfo(java.util.List<DesiredPropertyInfo> desiredPropertyInfo) {
                this.desiredPropertyInfo = desiredPropertyInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceDesiredPropertyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceDesiredPropertyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        private Data(Builder builder) {
            this.list = builder.list;
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

        public static final class Builder {
            private List list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>The desired property information returned in the <strong>DesiredPropertyInfo</strong> parameter.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
