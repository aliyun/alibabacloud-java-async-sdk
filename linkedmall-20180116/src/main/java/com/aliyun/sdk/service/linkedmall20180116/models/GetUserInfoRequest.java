// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserInfoRequest</p>
 */
public class GetUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryJson")
    private String queryJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserFlag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userFlag;

    private GetUserInfoRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bizId = builder.bizId;
        this.queryJson = builder.queryJson;
        this.userFlag = builder.userFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return queryJson
     */
    public String getQueryJson() {
        return this.queryJson;
    }

    /**
     * @return userFlag
     */
    public String getUserFlag() {
        return this.userFlag;
    }

    public static final class Builder extends Request.Builder<GetUserInfoRequest, Builder> {
        private String appName; 
        private String bizId; 
        private String queryJson; 
        private String userFlag; 

        private Builder() {
            super();
        } 

        private Builder(GetUserInfoRequest request) {
            super(request);
            this.appName = request.appName;
            this.bizId = request.bizId;
            this.queryJson = request.queryJson;
            this.userFlag = request.userFlag;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alipay</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * QueryJson.
         */
        public Builder queryJson(String queryJson) {
            this.putBodyParameter("QueryJson", queryJson);
            this.queryJson = queryJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder userFlag(String userFlag) {
            this.putQueryParameter("UserFlag", userFlag);
            this.userFlag = userFlag;
            return this;
        }

        @Override
        public GetUserInfoRequest build() {
            return new GetUserInfoRequest(this);
        } 

    } 

}
