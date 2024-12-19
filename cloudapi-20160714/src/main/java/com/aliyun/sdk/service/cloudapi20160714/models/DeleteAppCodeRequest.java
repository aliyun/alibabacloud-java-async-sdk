// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DeleteAppCodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppCodeRequest</p>
 */
public class DeleteAppCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private DeleteAppCodeRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppCodeRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DeleteAppCodeRequest, Builder> {
        private String appCode; 
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppCodeRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appId = request.appId;
        } 

        /**
         * <p>The application AppCode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0d13f021c5cd4997831a9717e75b0663</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111265074</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DeleteAppCodeRequest build() {
            return new DeleteAppCodeRequest(this);
        } 

    } 

}
