// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesHotStorageDataStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicesHotStorageDataStatusResponseBody</p>
 */
public class QueryDevicesHotStorageDataStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDevicesHotStorageDataStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesHotStorageDataStatusResponseBody create() {
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

        public QueryDevicesHotStorageDataStatusResponseBody build() {
            return new QueryDevicesHotStorageDataStatusResponseBody(this);
        } 

    } 

    public static class PropertyStatusDataInfo extends TeaModel {
        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Value")
        private String value;

        private PropertyStatusDataInfo(Builder builder) {
            this.identifier = builder.identifier;
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyStatusDataInfo create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
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
            private String identifier; 
            private Long time; 
            private String value; 

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

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

            public PropertyStatusDataInfo build() {
                return new PropertyStatusDataInfo(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("PropertyStatusDataInfo")
        private java.util.List < PropertyStatusDataInfo> propertyStatusDataInfo;

        private List(Builder builder) {
            this.propertyStatusDataInfo = builder.propertyStatusDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return propertyStatusDataInfo
         */
        public java.util.List < PropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

        public static final class Builder {
            private java.util.List < PropertyStatusDataInfo> propertyStatusDataInfo; 

            /**
             * PropertyStatusDataInfo.
             */
            public Builder propertyStatusDataInfo(java.util.List < PropertyStatusDataInfo> propertyStatusDataInfo) {
                this.propertyStatusDataInfo = propertyStatusDataInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("NextPageToken")
        private String nextPageToken;

        @NameInMap("NextValid")
        private Boolean nextValid;

        private Data(Builder builder) {
            this.list = builder.list;
            this.nextPageToken = builder.nextPageToken;
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
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return nextValid
         */
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public static final class Builder {
            private List list; 
            private String nextPageToken; 
            private Boolean nextValid; 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * NextValid.
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
