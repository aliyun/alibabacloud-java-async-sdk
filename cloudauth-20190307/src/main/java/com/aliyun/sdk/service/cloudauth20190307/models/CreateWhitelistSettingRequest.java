// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateWhitelistSettingRequest} extends {@link RequestModel}
 *
 * <p>CreateWhitelistSettingRequest</p>
 */
public class CreateWhitelistSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer validDay;

    private CreateWhitelistSettingRequest(Builder builder) {
        super(builder);
        this.certNo = builder.certNo;
        this.certifyId = builder.certifyId;
        this.lang = builder.lang;
        this.remark = builder.remark;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.sourceIp = builder.sourceIp;
        this.validDay = builder.validDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWhitelistSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return validDay
     */
    public Integer getValidDay() {
        return this.validDay;
    }

    public static final class Builder extends Request.Builder<CreateWhitelistSettingRequest, Builder> {
        private String certNo; 
        private String certifyId; 
        private String lang; 
        private String remark; 
        private Long sceneId; 
        private String serviceCode; 
        private String sourceIp; 
        private Integer validDay; 

        private Builder() {
            super();
        } 

        private Builder(CreateWhitelistSettingRequest request) {
            super(request);
            this.certNo = request.certNo;
            this.certifyId = request.certifyId;
            this.lang = request.lang;
            this.remark = request.remark;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.sourceIp = request.sourceIp;
            this.validDay = request.validDay;
        } 

        /**
         * <p>ID number to be whitelisted.</p>
         * 
         * <strong>example:</strong>
         * <p>44018219950810XXXX</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>Certificate ID, used for whitelisting this specific authenticated user.</p>
         * 
         * <strong>example:</strong>
         * <p>sha6d0405f42926084e396e76a037d00</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>User language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Whitelist remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>测试白名单。</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000014526</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Service type:</p>
         * <ul>
         * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
         * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Visitor&quot;s source IP address. No need to fill in, the system will automatically obtain it.</p>
         * 
         * <strong>example:</strong>
         * <p>27.115.63.58</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Number of valid days after creating the whitelist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder validDay(Integer validDay) {
            this.putQueryParameter("ValidDay", validDay);
            this.validDay = validDay;
            return this;
        }

        @Override
        public CreateWhitelistSettingRequest build() {
            return new CreateWhitelistSettingRequest(this);
        } 

    } 

}
