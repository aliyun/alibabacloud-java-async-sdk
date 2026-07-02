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
 * {@link AuthenticateRequest} extends {@link RequestModel}
 *
 * <p>AuthenticateRequest</p>
 */
public class AuthenticateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateCode")
    private String operateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorTypeEnum")
    private String operatorTypeEnum;

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

    private AuthenticateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.operateCode = builder.operateCode;
        this.operatorTypeEnum = builder.operatorTypeEnum;
        this.productCode = builder.productCode;
        this.requestFromApp = builder.requestFromApp;
        this.requestWay = builder.requestWay;
        this.userNo = builder.userNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthenticateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return operateCode
     */
    public String getOperateCode() {
        return this.operateCode;
    }

    /**
     * @return operatorTypeEnum
     */
    public String getOperatorTypeEnum() {
        return this.operatorTypeEnum;
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

    public static final class Builder extends Request.Builder<AuthenticateRequest, Builder> {
        private String instanceId; 
        private String language; 
        private String operateCode; 
        private String operatorTypeEnum; 
        private String productCode; 
        private String requestFromApp; 
        private String requestWay; 
        private String userNo; 

        private Builder() {
            super();
        } 

        private Builder(AuthenticateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.operateCode = request.operateCode;
            this.operatorTypeEnum = request.operatorTypeEnum;
            this.productCode = request.productCode;
            this.requestFromApp = request.requestFromApp;
            this.requestWay = request.requestWay;
            this.userNo = request.userNo;
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
         * OperateCode.
         */
        public Builder operateCode(String operateCode) {
            this.putQueryParameter("OperateCode", operateCode);
            this.operateCode = operateCode;
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
        public AuthenticateRequest build() {
            return new AuthenticateRequest(this);
        } 

    } 

}
