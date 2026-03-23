// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link JudgeXingTianBusinessRequest} extends {@link RequestModel}
 *
 * <p>JudgeXingTianBusinessRequest</p>
 */
public class JudgeXingTianBusinessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealmId")
    private String realmId;

    private JudgeXingTianBusinessRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.realmId = builder.realmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JudgeXingTianBusinessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return realmId
     */
    public String getRealmId() {
        return this.realmId;
    }

    public static final class Builder extends Request.Builder<JudgeXingTianBusinessRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String realmId; 

        private Builder() {
            super();
        } 

        private Builder(JudgeXingTianBusinessRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.realmId = request.realmId;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * RealmId.
         */
        public Builder realmId(String realmId) {
            this.putQueryParameter("RealmId", realmId);
            this.realmId = realmId;
            return this;
        }

        @Override
        public JudgeXingTianBusinessRequest build() {
            return new JudgeXingTianBusinessRequest(this);
        } 

    } 

}
