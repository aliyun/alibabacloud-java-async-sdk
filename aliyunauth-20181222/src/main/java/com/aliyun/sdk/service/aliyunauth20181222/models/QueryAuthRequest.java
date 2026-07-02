// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222.models;

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
 * {@link QueryAuthRequest} extends {@link RequestModel}
 *
 * <p>QueryAuthRequest</p>
 */
public class QueryAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizNo")
    private String bizNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorTypeEnum")
    private String operatorTypeEnum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderVid")
    private String orderVid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestFromApp")
    private String requestFromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestWay")
    private String requestWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNo")
    private String userNo;

    private QueryAuthRequest(Builder builder) {
        super(builder);
        this.bizNo = builder.bizNo;
        this.channel = builder.channel;
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.operatorTypeEnum = builder.operatorTypeEnum;
        this.orderVid = builder.orderVid;
        this.productCode = builder.productCode;
        this.requestFromApp = builder.requestFromApp;
        this.requestWay = builder.requestWay;
        this.userNo = builder.userNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizNo
     */
    public String getBizNo() {
        return this.bizNo;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return operatorTypeEnum
     */
    public String getOperatorTypeEnum() {
        return this.operatorTypeEnum;
    }

    /**
     * @return orderVid
     */
    public String getOrderVid() {
        return this.orderVid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return requestFromApp
     */
    public String getRequestFromApp() {
        return this.requestFromApp;
    }

    /**
     * @return requestWay
     */
    public String getRequestWay() {
        return this.requestWay;
    }

    /**
     * @return userNo
     */
    public String getUserNo() {
        return this.userNo;
    }

    public static final class Builder extends Request.Builder<QueryAuthRequest, Builder> {
        private String bizNo; 
        private String channel; 
        private String instanceId; 
        private String language; 
        private String operatorTypeEnum; 
        private String orderVid; 
        private String productCode; 
        private String requestFromApp; 
        private String requestWay; 
        private String userNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuthRequest request) {
            super(request);
            this.bizNo = request.bizNo;
            this.channel = request.channel;
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.operatorTypeEnum = request.operatorTypeEnum;
            this.orderVid = request.orderVid;
            this.productCode = request.productCode;
            this.requestFromApp = request.requestFromApp;
            this.requestWay = request.requestWay;
            this.userNo = request.userNo;
        } 

        /**
         * BizNo.
         */
        public Builder bizNo(String bizNo) {
            this.putQueryParameter("BizNo", bizNo);
            this.bizNo = bizNo;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * OperatorTypeEnum.
         */
        public Builder operatorTypeEnum(String operatorTypeEnum) {
            this.putQueryParameter("OperatorTypeEnum", operatorTypeEnum);
            this.operatorTypeEnum = operatorTypeEnum;
            return this;
        }

        /**
         * OrderVid.
         */
        public Builder orderVid(String orderVid) {
            this.putQueryParameter("OrderVid", orderVid);
            this.orderVid = orderVid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * RequestFromApp.
         */
        public Builder requestFromApp(String requestFromApp) {
            this.putQueryParameter("RequestFromApp", requestFromApp);
            this.requestFromApp = requestFromApp;
            return this;
        }

        /**
         * RequestWay.
         */
        public Builder requestWay(String requestWay) {
            this.putQueryParameter("RequestWay", requestWay);
            this.requestWay = requestWay;
            return this;
        }

        /**
         * UserNo.
         */
        public Builder userNo(String userNo) {
            this.putQueryParameter("UserNo", userNo);
            this.userNo = userNo;
            return this;
        }

        @Override
        public QueryAuthRequest build() {
            return new QueryAuthRequest(this);
        } 

    } 

}
