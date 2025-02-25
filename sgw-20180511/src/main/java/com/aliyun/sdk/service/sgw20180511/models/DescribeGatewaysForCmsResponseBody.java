// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysForCmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaysForCmsResponseBody</p>
 */
public class DescribeGatewaysForCmsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Gateways")
    private Gateways gateways;

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

    private DescribeGatewaysForCmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.gateways = builder.gateways;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaysForCmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gateways
     */
    public Gateways getGateways() {
        return this.gateways;
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

    public static final class Builder {
        private String code; 
        private Gateways gateways; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Gateways.
         */
        public Builder gateways(Gateways gateways) {
            this.gateways = gateways;
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

        public DescribeGatewaysForCmsResponseBody build() {
            return new DescribeGatewaysForCmsResponseBody(this);
        } 

    } 

    public static class Gateway extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("Name")
        private String name;

        private Gateway(Builder builder) {
            this.description = builder.description;
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateway create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String gatewayId; 
            private String name; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Gateway build() {
                return new Gateway(this);
            } 

        } 

    }
    public static class Gateways extends TeaModel {
        @NameInMap("Gateway")
        private java.util.List < Gateway> gateway;

        private Gateways(Builder builder) {
            this.gateway = builder.gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateways create() {
            return builder().build();
        }

        /**
         * @return gateway
         */
        public java.util.List < Gateway> getGateway() {
            return this.gateway;
        }

        public static final class Builder {
            private java.util.List < Gateway> gateway; 

            /**
             * Gateway.
             */
            public Builder gateway(java.util.List < Gateway> gateway) {
                this.gateway = gateway;
                return this;
            }

            public Gateways build() {
                return new Gateways(this);
            } 

        } 

    }
}
