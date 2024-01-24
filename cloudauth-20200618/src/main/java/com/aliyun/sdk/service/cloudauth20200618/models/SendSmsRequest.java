// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsRequest} extends {@link RequestModel}
 *
 * <p>SendSmsRequest</p>
 */
public class SendSmsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Mobile")
    @Validation(required = true)
    private String mobile;

    @Body
    @NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @Body
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Body
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Body
    @NameInMap("TemplateParam")
    private String templateParam;

    private SendSmsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.outerOrderNo = builder.outerOrderNo;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    public static final class Builder extends Request.Builder<SendSmsRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String outerOrderNo; 
        private String signName; 
        private String templateCode; 
        private String templateParam; 

        private Builder() {
            super();
        } 

        private Builder(SendSmsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobile = request.mobile;
            this.outerOrderNo = request.outerOrderNo;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putBodyParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putBodyParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParam.
         */
        public Builder templateParam(String templateParam) {
            this.putBodyParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        @Override
        public SendSmsRequest build() {
            return new SendSmsRequest(this);
        } 

    } 

}
