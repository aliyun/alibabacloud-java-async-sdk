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
 * {@link QueryDeviceOriginalPropertyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceOriginalPropertyStatusResponseBody</p>
 */
public class QueryDeviceOriginalPropertyStatusResponseBody extends TeaModel {
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

    private QueryDeviceOriginalPropertyStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceOriginalPropertyStatusResponseBody create() {
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

        private Builder(QueryDeviceOriginalPropertyStatusResponseBody model) {
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
         * <p>iot.common.InvalidPageParams</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call succeeds. For more information, see the parameters of the List parameter.</p>
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
         * <p>Indicates whether the call succeeds.</p>
         * <ul>
         * <li>true: The call succeeded.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceOriginalPropertyStatusResponseBody build() {
            return new QueryDeviceOriginalPropertyStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceOriginalPropertyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalPropertyStatusResponseBody</p>
     */
    public static class PropertyStatusDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(PropertyStatusDataInfo model) {
                this.identifier = model.identifier;
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The identifier of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>Temperture</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The time when the property was modified, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1517553572362</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
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
    /**
     * 
     * {@link QueryDeviceOriginalPropertyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalPropertyStatusResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyStatusDataInfo")
        private java.util.List<PropertyStatusDataInfo> propertyStatusDataInfo;

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
        public java.util.List<PropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

        public static final class Builder {
            private java.util.List<PropertyStatusDataInfo> propertyStatusDataInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.propertyStatusDataInfo = model.propertyStatusDataInfo;
            } 

            /**
             * PropertyStatusDataInfo.
             */
            public Builder propertyStatusDataInfo(java.util.List<PropertyStatusDataInfo> propertyStatusDataInfo) {
                this.propertyStatusDataInfo = propertyStatusDataInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceOriginalPropertyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalPropertyStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("NextValid")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.nextPageToken = model.nextPageToken;
                this.nextValid = model.nextValid;
            } 

            /**
             * <p>The array of property information. The information about each property is indicated by the <strong>PropertyStatusInfo</strong> parameter.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The identifier of the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>Bo***x44Qx</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>Indicates whether the next page exists.</p>
             * <ul>
             * <li><strong>true</strong>: The next page exists.</li>
             * <li><strong>false</strong>: The next page does not exist.</li>
             * </ul>
             * <p>If the value <strong><strong><strong>true</strong> is returned, you can add the value of the <strong>NextPageToken</strong> parameter</strong></strong> to the next query. This allows you to query the data that is not returned by the current query.</p>
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
