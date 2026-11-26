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
 * {@link LoginStateInfo} extends {@link TeaModel}
 *
 * <p>LoginStateInfo</p>
 */
public class LoginStateInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.NameInMap("ThirdUserIdentifier")
    private String thirdUserIdentifier;

    @com.aliyun.core.annotation.NameInMap("ThirdUserType")
    private String thirdUserType;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private LoginStateInfo(Builder builder) {
        this.sceneCode = builder.sceneCode;
        this.thirdUserIdentifier = builder.thirdUserIdentifier;
        this.thirdUserType = builder.thirdUserType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginStateInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String sceneCode; 
        private String thirdUserIdentifier; 
        private String thirdUserType; 
        private String userId; 

        private Builder() {
        } 

        private Builder(LoginStateInfo model) {
            this.sceneCode = model.sceneCode;
            this.thirdUserIdentifier = model.thirdUserIdentifier;
            this.thirdUserType = model.thirdUserType;
            this.userId = model.userId;
        } 

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * ThirdUserIdentifier.
         */
        public Builder thirdUserIdentifier(String thirdUserIdentifier) {
            this.thirdUserIdentifier = thirdUserIdentifier;
            return this;
        }

        /**
         * ThirdUserType.
         */
        public Builder thirdUserType(String thirdUserType) {
            this.thirdUserType = thirdUserType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public LoginStateInfo build() {
            return new LoginStateInfo(this);
        } 

    } 

}
