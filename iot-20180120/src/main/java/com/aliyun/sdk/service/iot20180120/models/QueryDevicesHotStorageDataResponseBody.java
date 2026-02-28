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
 * {@link QueryDevicesHotStorageDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicesHotStorageDataResponseBody</p>
 */
public class QueryDevicesHotStorageDataResponseBody extends TeaModel {
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

    private QueryDevicesHotStorageDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesHotStorageDataResponseBody create() {
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

        private Builder(QueryDevicesHotStorageDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryDevicesHotStorageDataResponseBody build() {
            return new QueryDevicesHotStorageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDevicesHotStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicesHotStorageDataResponseBody</p>
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
             * Time.
             */
            public Builder time(String time) {
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
    /**
     * 
     * {@link QueryDevicesHotStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicesHotStorageDataResponseBody</p>
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
     * {@link QueryDevicesHotStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDevicesHotStorageDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("NextValid")
        private Boolean nextValid;

        @com.aliyun.core.annotation.NameInMap("nextPageToken")
        private String nextPageToken;

        private Data(Builder builder) {
            this.list = builder.list;
            this.nextValid = builder.nextValid;
            this.nextPageToken = builder.nextPageToken;
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
         * @return nextValid
         */
        public Boolean getNextValid() {
            return this.nextValid;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public static final class Builder {
            private List list; 
            private Boolean nextValid; 
            private String nextPageToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.nextValid = model.nextValid;
                this.nextPageToken = model.nextPageToken;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
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
             * nextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
