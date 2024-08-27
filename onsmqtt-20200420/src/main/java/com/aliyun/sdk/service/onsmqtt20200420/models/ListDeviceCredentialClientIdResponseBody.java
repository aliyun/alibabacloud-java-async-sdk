// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * DeviceCredentialClientIdList.
         */
        public Builder deviceCredentialClientIdList(DeviceCredentialClientIdList deviceCredentialClientIdList) {
            this.deviceCredentialClientIdList = deviceCredentialClientIdList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceCredentialClientIdResponseBody build() {
            return new ListDeviceCredentialClientIdResponseBody(this);
        } 

    } 

    public static class DeviceCredentialClientIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIdList")
        private java.util.List < String > clientIdList;

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
        public java.util.List < String > getClientIdList() {
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
            private java.util.List < String > clientIdList; 
            private String nextToken; 
            private String pageNo; 
            private String pageSize; 
            private String total; 

            /**
             * ClientIdList.
             */
            public Builder clientIdList(java.util.List < String > clientIdList) {
                this.clientIdList = clientIdList;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(String pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
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
