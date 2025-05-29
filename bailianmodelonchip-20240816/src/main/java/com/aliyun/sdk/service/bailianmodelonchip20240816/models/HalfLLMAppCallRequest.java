// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link HalfLLMAppCallRequest} extends {@link RequestModel}
 *
 * <p>HalfLLMAppCallRequest</p>
 */
public class HalfLLMAppCallRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizParam")
    private java.util.Map<String, String> bizParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelTypeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> modelTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private HalfLLMAppCallRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bizParam = builder.bizParam;
        this.deviceName = builder.deviceName;
        this.modelTypeList = builder.modelTypeList;
        this.productKey = builder.productKey;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HalfLLMAppCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bizParam
     */
    public java.util.Map<String, String> getBizParam() {
        return this.bizParam;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return modelTypeList
     */
    public java.util.List<String> getModelTypeList() {
        return this.modelTypeList;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<HalfLLMAppCallRequest, Builder> {
        private String appId; 
        private java.util.Map<String, String> bizParam; 
        private String deviceName; 
        private java.util.List<String> modelTypeList; 
        private String productKey; 
        private String sessionId; 
        private String tenantId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(HalfLLMAppCallRequest request) {
            super(request);
            this.appId = request.appId;
            this.bizParam = request.bizParam;
            this.deviceName = request.deviceName;
            this.modelTypeList = request.modelTypeList;
            this.productKey = request.productKey;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.text = request.text;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b883e6dcf14041fba390c1f795493c6b</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * bizParam.
         */
        public Builder bizParam(java.util.Map<String, String> bizParam) {
            String bizParamShrink = shrink(bizParam, "bizParam", "json");
            this.putBodyParameter("bizParam", bizParamShrink);
            this.bizParam = bizParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modelTypeList(java.util.List<String> modelTypeList) {
            String modelTypeListShrink = shrink(modelTypeList, "modelTypeList", "json");
            this.putBodyParameter("modelTypeList", modelTypeListShrink);
            this.modelTypeList = modelTypeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2oImhCz4f8XCviiM</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>678699541713794</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("text", text);
            this.text = text;
            return this;
        }

        @Override
        public HalfLLMAppCallRequest build() {
            return new HalfLLMAppCallRequest(this);
        } 

    } 

}
