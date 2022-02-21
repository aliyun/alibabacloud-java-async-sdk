// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomerGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerGatewayResponseBody</p>
 */
public class DescribeCustomerGatewayResponseBody extends TeaModel {
    @NameInMap("Asn")
    private Long asn;

    @NameInMap("AuthKey")
    private String authKey;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @NameInMap("Description")
    private String description;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCustomerGatewayResponseBody(Builder builder) {
        this.asn = builder.asn;
        this.authKey = builder.authKey;
        this.createTime = builder.createTime;
        this.customerGatewayId = builder.customerGatewayId;
        this.description = builder.description;
        this.ipAddress = builder.ipAddress;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return asn
     */
    public Long getAsn() {
        return this.asn;
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long asn; 
        private String authKey; 
        private Long createTime; 
        private String customerGatewayId; 
        private String description; 
        private String ipAddress; 
        private String name; 
        private String requestId; 

        /**
         * Asn.
         */
        public Builder asn(Long asn) {
            this.asn = asn;
            return this;
        }

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CustomerGatewayId.
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * IpAddress.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomerGatewayResponseBody build() {
            return new DescribeCustomerGatewayResponseBody(this);
        } 

    } 

}
