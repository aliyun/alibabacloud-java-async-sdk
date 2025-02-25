// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayNFSClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayNFSClientsResponseBody</p>
 */
public class DescribeGatewayNFSClientsResponseBody extends TeaModel {
    @NameInMap("ClientInfoList")
    private ClientInfoList clientInfoList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Version3Enabled")
    private Boolean version3Enabled;

    @NameInMap("Version40Enabled")
    private Boolean version40Enabled;

    @NameInMap("Version41Enabled")
    private Boolean version41Enabled;

    private DescribeGatewayNFSClientsResponseBody(Builder builder) {
        this.clientInfoList = builder.clientInfoList;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.version3Enabled = builder.version3Enabled;
        this.version40Enabled = builder.version40Enabled;
        this.version41Enabled = builder.version41Enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayNFSClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientInfoList
     */
    public ClientInfoList getClientInfoList() {
        return this.clientInfoList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return version3Enabled
     */
    public Boolean getVersion3Enabled() {
        return this.version3Enabled;
    }

    /**
     * @return version40Enabled
     */
    public Boolean getVersion40Enabled() {
        return this.version40Enabled;
    }

    /**
     * @return version41Enabled
     */
    public Boolean getVersion41Enabled() {
        return this.version41Enabled;
    }

    public static final class Builder {
        private ClientInfoList clientInfoList; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Boolean version3Enabled; 
        private Boolean version40Enabled; 
        private Boolean version41Enabled; 

        /**
         * ClientInfoList.
         */
        public Builder clientInfoList(ClientInfoList clientInfoList) {
            this.clientInfoList = clientInfoList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Version3Enabled.
         */
        public Builder version3Enabled(Boolean version3Enabled) {
            this.version3Enabled = version3Enabled;
            return this;
        }

        /**
         * Version40Enabled.
         */
        public Builder version40Enabled(Boolean version40Enabled) {
            this.version40Enabled = version40Enabled;
            return this;
        }

        /**
         * Version41Enabled.
         */
        public Builder version41Enabled(Boolean version41Enabled) {
            this.version41Enabled = version41Enabled;
            return this;
        }

        public DescribeGatewayNFSClientsResponseBody build() {
            return new DescribeGatewayNFSClientsResponseBody(this);
        } 

    } 

    public static class ClientInfo extends TeaModel {
        @NameInMap("ClientIpAddr")
        private String clientIpAddr;

        @NameInMap("HasNFSv3")
        private Boolean hasNFSv3;

        @NameInMap("HasNFSv40")
        private Boolean hasNFSv40;

        @NameInMap("HasNFSv41")
        private Boolean hasNFSv41;

        private ClientInfo(Builder builder) {
            this.clientIpAddr = builder.clientIpAddr;
            this.hasNFSv3 = builder.hasNFSv3;
            this.hasNFSv40 = builder.hasNFSv40;
            this.hasNFSv41 = builder.hasNFSv41;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfo create() {
            return builder().build();
        }

        /**
         * @return clientIpAddr
         */
        public String getClientIpAddr() {
            return this.clientIpAddr;
        }

        /**
         * @return hasNFSv3
         */
        public Boolean getHasNFSv3() {
            return this.hasNFSv3;
        }

        /**
         * @return hasNFSv40
         */
        public Boolean getHasNFSv40() {
            return this.hasNFSv40;
        }

        /**
         * @return hasNFSv41
         */
        public Boolean getHasNFSv41() {
            return this.hasNFSv41;
        }

        public static final class Builder {
            private String clientIpAddr; 
            private Boolean hasNFSv3; 
            private Boolean hasNFSv40; 
            private Boolean hasNFSv41; 

            /**
             * ClientIpAddr.
             */
            public Builder clientIpAddr(String clientIpAddr) {
                this.clientIpAddr = clientIpAddr;
                return this;
            }

            /**
             * HasNFSv3.
             */
            public Builder hasNFSv3(Boolean hasNFSv3) {
                this.hasNFSv3 = hasNFSv3;
                return this;
            }

            /**
             * HasNFSv40.
             */
            public Builder hasNFSv40(Boolean hasNFSv40) {
                this.hasNFSv40 = hasNFSv40;
                return this;
            }

            /**
             * HasNFSv41.
             */
            public Builder hasNFSv41(Boolean hasNFSv41) {
                this.hasNFSv41 = hasNFSv41;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
    public static class ClientInfoList extends TeaModel {
        @NameInMap("ClientInfo")
        private java.util.List < ClientInfo> clientInfo;

        private ClientInfoList(Builder builder) {
            this.clientInfo = builder.clientInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfoList create() {
            return builder().build();
        }

        /**
         * @return clientInfo
         */
        public java.util.List < ClientInfo> getClientInfo() {
            return this.clientInfo;
        }

        public static final class Builder {
            private java.util.List < ClientInfo> clientInfo; 

            /**
             * ClientInfo.
             */
            public Builder clientInfo(java.util.List < ClientInfo> clientInfo) {
                this.clientInfo = clientInfo;
                return this;
            }

            public ClientInfoList build() {
                return new ClientInfoList(this);
            } 

        } 

    }
}
