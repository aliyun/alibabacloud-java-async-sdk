// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderQosProductRequest} extends {@link RequestModel}
 *
 * <p>OrderQosProductRequest</p>
 */
public class OrderQosProductRequest extends Request {
    @Body
    @NameInMap("AliUid")
    private Long aliUid;

    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("IPv6")
    private String iPv6;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("IpType")
    private String ipType;

    @Body
    @NameInMap("MobileNumber")
    private String mobileNumber;

    @Body
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @Body
    @NameInMap("PrivateIpv4")
    private String privateIpv4;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    @Query
    @NameInMap("Provice")
    private String provice;

    @Body
    @NameInMap("PublicIpv4")
    private String publicIpv4;

    @Body
    @NameInMap("QosRequestId")
    @Validation(required = true)
    private String qosRequestId;

    @Body
    @NameInMap("TargetIpList")
    private java.util.List < String > targetIpList;

    @Body
    @NameInMap("Token")
    private String token;

    @Body
    @NameInMap("UnitNum")
    private Integer unitNum;

    private OrderQosProductRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.channelId = builder.channelId;
        this.iPv6 = builder.iPv6;
        this.instanceId = builder.instanceId;
        this.ipType = builder.ipType;
        this.mobileNumber = builder.mobileNumber;
        this.operator = builder.operator;
        this.privateIpv4 = builder.privateIpv4;
        this.productId = builder.productId;
        this.provice = builder.provice;
        this.publicIpv4 = builder.publicIpv4;
        this.qosRequestId = builder.qosRequestId;
        this.targetIpList = builder.targetIpList;
        this.token = builder.token;
        this.unitNum = builder.unitNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderQosProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return iPv6
     */
    public String getIPv6() {
        return this.iPv6;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return privateIpv4
     */
    public String getPrivateIpv4() {
        return this.privateIpv4;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return provice
     */
    public String getProvice() {
        return this.provice;
    }

    /**
     * @return publicIpv4
     */
    public String getPublicIpv4() {
        return this.publicIpv4;
    }

    /**
     * @return qosRequestId
     */
    public String getQosRequestId() {
        return this.qosRequestId;
    }

    /**
     * @return targetIpList
     */
    public java.util.List < String > getTargetIpList() {
        return this.targetIpList;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return unitNum
     */
    public Integer getUnitNum() {
        return this.unitNum;
    }

    public static final class Builder extends Request.Builder<OrderQosProductRequest, Builder> {
        private Long aliUid; 
        private String channelId; 
        private String iPv6; 
        private String instanceId; 
        private String ipType; 
        private String mobileNumber; 
        private String operator; 
        private String privateIpv4; 
        private String productId; 
        private String provice; 
        private String publicIpv4; 
        private String qosRequestId; 
        private java.util.List < String > targetIpList; 
        private String token; 
        private Integer unitNum; 

        private Builder() {
            super();
        } 

        private Builder(OrderQosProductRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.channelId = request.channelId;
            this.iPv6 = request.iPv6;
            this.instanceId = request.instanceId;
            this.ipType = request.ipType;
            this.mobileNumber = request.mobileNumber;
            this.operator = request.operator;
            this.privateIpv4 = request.privateIpv4;
            this.productId = request.productId;
            this.provice = request.provice;
            this.publicIpv4 = request.publicIpv4;
            this.qosRequestId = request.qosRequestId;
            this.targetIpList = request.targetIpList;
            this.token = request.token;
            this.unitNum = request.unitNum;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 渠道ID
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * C端v6 IP（移动场景下可以携带）
         */
        public Builder iPv6(String iPv6) {
            this.putBodyParameter("IPv6", iPv6);
            this.iPv6 = iPv6;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IP类型
         */
        public Builder ipType(String ipType) {
            this.putBodyParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * C端手机号
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putBodyParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * C端用户私网IP（联通场景下必须携带)
         */
        public Builder privateIpv4(String privateIpv4) {
            this.putBodyParameter("PrivateIpv4", privateIpv4);
            this.privateIpv4 = privateIpv4;
            return this;
        }

        /**
         * 产品ID
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Provice.
         */
        public Builder provice(String provice) {
            this.putQueryParameter("Provice", provice);
            this.provice = provice;
            return this;
        }

        /**
         * C端用户公网IP（联通场景下必须携带）
         */
        public Builder publicIpv4(String publicIpv4) {
            this.putBodyParameter("PublicIpv4", publicIpv4);
            this.publicIpv4 = publicIpv4;
            return this;
        }

        /**
         * 客户侧生成的QoS请求ID，需要保证请求幂等性，确保不同请求间该参数值唯一
         */
        public Builder qosRequestId(String qosRequestId) {
            this.putBodyParameter("QosRequestId", qosRequestId);
            this.qosRequestId = qosRequestId;
            return this;
        }

        /**
         * 移动场景目前ip
         */
        public Builder targetIpList(java.util.List < String > targetIpList) {
            this.putBodyParameter("TargetIpList", targetIpList);
            this.targetIpList = targetIpList;
            return this;
        }

        /**
         * token获取
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * 请求次数
         */
        public Builder unitNum(Integer unitNum) {
            this.putBodyParameter("UnitNum", unitNum);
            this.unitNum = unitNum;
            return this;
        }

        @Override
        public OrderQosProductRequest build() {
            return new OrderQosProductRequest(this);
        } 

    } 

}
