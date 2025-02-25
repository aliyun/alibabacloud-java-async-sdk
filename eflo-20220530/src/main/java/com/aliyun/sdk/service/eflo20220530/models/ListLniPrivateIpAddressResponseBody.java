// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListLniPrivateIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ListLniPrivateIpAddressResponseBody</p>
 */
public class ListLniPrivateIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLniPrivateIpAddressResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLniPrivateIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>You don&quot;t have the permission to do this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLniPrivateIpAddressResponseBody build() {
            return new ListLniPrivateIpAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLniPrivateIpAddressResponseBody} extends {@link TeaModel}
     *
     * <p>ListLniPrivateIpAddressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IpAddressMac")
        private String ipAddressMac;

        @com.aliyun.core.annotation.NameInMap("IpName")
        private String ipName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.ipAddressMac = builder.ipAddressMac;
            this.ipName = builder.ipName;
            this.message = builder.message;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.privateIpAddress = builder.privateIpAddress;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ipAddressMac
         */
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        /**
         * @return ipName
         */
        public String getIpName() {
            return this.ipName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreate; 
            private String ipAddressMac; 
            private String ipName; 
            private String message; 
            private String networkInterfaceId; 
            private String privateIpAddress; 
            private String regionId; 
            private String status; 

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the data address was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1651734291000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>MAC address of the secondary private network</p>
             * 
             * <strong>example:</strong>
             * <p>00-ff-84-15-ba-67</p>
             */
            public Builder ipAddressMac(String ipAddressMac) {
                this.ipAddressMac = ipAddressMac;
                return this;
            }

            /**
             * <p>IP unique identifier</p>
             * 
             * <strong>example:</strong>
             * <p>sip-1hq1ql7vz</p>
             */
            public Builder ipName(String ipName) {
                this.ipName = ipName;
                return this;
            }

            /**
             * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Lingjun network interface controller ID</p>
             * 
             * <strong>example:</strong>
             * <p>lni-bp11hq1ql7vza3k4xz7q</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>Secondary private IP address of Lingjun network interface controller</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.5.92</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLniPrivateIpAddressResponseBody} extends {@link TeaModel}
     *
     * <p>ListLniPrivateIpAddressResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long total; 

            /**
             * <p>The returned result.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
