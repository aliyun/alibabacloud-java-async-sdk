// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link ListDeviceCredentialClientIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceCredentialClientIdResponseBody</p>
 */
public class ListDeviceCredentialClientIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceCredentialClientIdList")
    private DeviceCredentialClientIdList deviceCredentialClientIdList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeviceCredentialClientIdResponseBody(Builder builder) {
        this.deviceCredentialClientIdList = builder.deviceCredentialClientIdList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceCredentialClientIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceCredentialClientIdList
     */
    public DeviceCredentialClientIdList getDeviceCredentialClientIdList() {
        return this.deviceCredentialClientIdList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceCredentialClientIdList deviceCredentialClientIdList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDeviceCredentialClientIdResponseBody model) {
            this.deviceCredentialClientIdList = model.deviceCredentialClientIdList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returns the information list.</p>
         */
        public Builder deviceCredentialClientIdList(DeviceCredentialClientIdList deviceCredentialClientIdList) {
            this.deviceCredentialClientIdList = deviceCredentialClientIdList;
            return this;
        }

        /**
         * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceCredentialClientIdResponseBody build() {
            return new ListDeviceCredentialClientIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceCredentialClientIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceCredentialClientIdResponseBody</p>
     */
    public static class DeviceCredentialClientIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIdList")
        private java.util.List<String> clientIdList;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private String pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private DeviceCredentialClientIdList(Builder builder) {
            this.clientIdList = builder.clientIdList;
            this.nextToken = builder.nextToken;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceCredentialClientIdList create() {
            return builder().build();
        }

        /**
         * @return clientIdList
         */
        public java.util.List<String> getClientIdList() {
            return this.clientIdList;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageNo
         */
        public String getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<String> clientIdList; 
            private String nextToken; 
            private String pageNo; 
            private String pageSize; 
            private String total; 

            private Builder() {
            } 

            private Builder(DeviceCredentialClientIdList model) {
                this.clientIdList = model.clientIdList;
                this.nextToken = model.nextToken;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>Client list.</p>
             */
            public Builder clientIdList(java.util.List<String> clientIdList) {
                this.clientIdList = clientIdList;
                return this;
            }

            /**
             * <p>Indicates whether there is a token (Token) for the next query. Values: </p>
             * <ul>
             * <li>For the first query and when there is no next query, this field does not need to be filled. </li>
             * <li>If there is a next query, the value should be the NextToken returned from the previous API call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>634dxxxxx75b5f</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The current page number of the returned query records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(String pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The maximum number of results to display per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of query results.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public DeviceCredentialClientIdList build() {
                return new DeviceCredentialClientIdList(this);
            } 

        } 

    }
}
