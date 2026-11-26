// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link AuthLoginWithThirdUserInfoRequest} extends {@link RequestModel}
 *
 * <p>AuthLoginWithThirdUserInfoRequest</p>
 */
public class AuthLoginWithThirdUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdUserIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdUserIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdUserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdUserType;

    private AuthLoginWithThirdUserInfoRequest(Builder builder) {
        super(builder);
        this.extInfo = builder.extInfo;
        this.sceneCode = builder.sceneCode;
        this.thirdUserIdentifier = builder.thirdUserIdentifier;
        this.thirdUserType = builder.thirdUserType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithThirdUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extInfo
     */
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return thirdUserIdentifier
     */
    public String getThirdUserIdentifier() {
        return this.thirdUserIdentifier;
    }

    /**
     * @return thirdUserType
     */
    public String getThirdUserType() {
        return this.thirdUserType;
    }

    public static final class Builder extends Request.Builder<AuthLoginWithThirdUserInfoRequest, Builder> {
        private java.util.Map<String, ?> extInfo; 
        private String sceneCode; 
        private String thirdUserIdentifier; 
        private String thirdUserType; 

        private Builder() {
            super();
        } 

        private Builder(AuthLoginWithThirdUserInfoRequest request) {
            super(request);
            this.extInfo = request.extInfo;
            this.sceneCode = request.sceneCode;
            this.thirdUserIdentifier = request.thirdUserIdentifier;
            this.thirdUserType = request.thirdUserType;
        } 

        /**
         * <p>Extension information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            String extInfoShrink = shrink(extInfo, "ExtInfo", "json");
            this.putBodyParameter("ExtInfo", extInfoShrink);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>Scene code, which must be requested from Tmall Genie in advance</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wechat_ecology_openness</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>Third-party User Identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>o5qxy6EItZBasv2VZAf-MGwllHL4</p>
         */
        public Builder thirdUserIdentifier(String thirdUserIdentifier) {
            this.putBodyParameter("ThirdUserIdentifier", thirdUserIdentifier);
            this.thirdUserIdentifier = thirdUserIdentifier;
            return this;
        }

        /**
         * <p>Third-party User Type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>weChatUser</p>
         */
        public Builder thirdUserType(String thirdUserType) {
            this.putBodyParameter("ThirdUserType", thirdUserType);
            this.thirdUserType = thirdUserType;
            return this;
        }

        @Override
        public AuthLoginWithThirdUserInfoRequest build() {
            return new AuthLoginWithThirdUserInfoRequest(this);
        } 

    } 

}
