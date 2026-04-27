// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudAgentLoginRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentLoginRequest</p>
 */
public class CloudAgentLoginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindTel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindTel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bindType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginStatus")
    private Long loginStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseDescription")
    private String pauseDescription;

    private CloudAgentLoginRequest(Builder builder) {
        super(builder);
        this.bindTel = builder.bindTel;
        this.bindType = builder.bindType;
        this.cno = builder.cno;
        this.enterpriseId = builder.enterpriseId;
        this.loginStatus = builder.loginStatus;
        this.pauseDescription = builder.pauseDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentLoginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindTel
     */
    public String getBindTel() {
        return this.bindTel;
    }

    /**
     * @return bindType
     */
    public Long getBindType() {
        return this.bindType;
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return loginStatus
     */
    public Long getLoginStatus() {
        return this.loginStatus;
    }

    /**
     * @return pauseDescription
     */
    public String getPauseDescription() {
        return this.pauseDescription;
    }

    public static final class Builder extends Request.Builder<CloudAgentLoginRequest, Builder> {
        private String bindTel; 
        private Long bindType; 
        private String cno; 
        private Long enterpriseId; 
        private Long loginStatus; 
        private String pauseDescription; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentLoginRequest request) {
            super(request);
            this.bindTel = request.bindTel;
            this.bindType = request.bindType;
            this.cno = request.cno;
            this.enterpriseId = request.enterpriseId;
            this.loginStatus = request.loginStatus;
            this.pauseDescription = request.pauseDescription;
        } 

        /**
         * <p>绑定电话</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder bindTel(String bindTel) {
            this.putQueryParameter("BindTel", bindTel);
            this.bindTel = bindTel;
            return this;
        }

        /**
         * <p>取值 1.普通电话,2.分机,3.webrtc </br>说明：绑定类型如果是分机则必须先让分机电话设备注册成功。如果绑定类型为webrtc，就算调用接口成功也是无法呼叫的。如果在企业设置页面开启了自适应绑定电话类型，则系统会根据绑定的号码来找到对应的绑定类型，使用系统找到的绑定类型，此处的设置优先级低。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bindType(Long bindType) {
            this.putQueryParameter("BindType", bindType);
            this.bindType = bindType;
            return this;
        }

        /**
         * <p>座席工号；取值3-10位正整数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>登录状态，1：置闲，2：置忙，默认为1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder loginStatus(Long loginStatus) {
            this.putQueryParameter("LoginStatus", loginStatus);
            this.loginStatus = loginStatus;
            return this;
        }

        /**
         * <p>置忙描述</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder pauseDescription(String pauseDescription) {
            this.putQueryParameter("PauseDescription", pauseDescription);
            this.pauseDescription = pauseDescription;
            return this;
        }

        @Override
        public CloudAgentLoginRequest build() {
            return new CloudAgentLoginRequest(this);
        } 

    } 

}
