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
 * {@link QueryInEffectQuthOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryInEffectQuthOrderRequest</p>
 */
public class QueryInEffectQuthOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorTypeEnum")
    private String operatorTypeEnum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestFromApp")
    private String requestFromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestWay")
    private String requestWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNo")
    private String userNo;

    private QueryInEffectQuthOrderRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.channel = builder.channel;
        this.language = builder.language;
        this.operatorTypeEnum = builder.operatorTypeEnum;
        this.requestFromApp = builder.requestFromApp;
        this.requestId = builder.requestId;
        this.requestWay = builder.requestWay;
        this.userNo = builder.userNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInEffectQuthOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
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
     * @return requestFromApp
     */
    public String getRequestFromApp() {
        return this.requestFromApp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder extends Request.Builder<QueryInEffectQuthOrderRequest, Builder> {
        private String bizCode; 
        private String channel; 
        private String language; 
        private String operatorTypeEnum; 
        private String requestFromApp; 
        private String requestId; 
        private String requestWay; 
        private String userNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryInEffectQuthOrderRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.channel = request.channel;
            this.language = request.language;
            this.operatorTypeEnum = request.operatorTypeEnum;
            this.requestFromApp = request.requestFromApp;
            this.requestId = request.requestId;
            this.requestWay = request.requestWay;
            this.userNo = request.userNo;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
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
         * RequestFromApp.
         */
        public Builder requestFromApp(String requestFromApp) {
            this.putQueryParameter("RequestFromApp", requestFromApp);
            this.requestFromApp = requestFromApp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
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
        public QueryInEffectQuthOrderRequest build() {
            return new QueryInEffectQuthOrderRequest(this);
        } 

    } 

}
