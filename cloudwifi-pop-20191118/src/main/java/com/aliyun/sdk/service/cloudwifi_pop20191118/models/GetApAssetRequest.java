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
 * {@link GetApAssetRequest} extends {@link RequestModel}
 *
 * <p>GetApAssetRequest</p>
 */
public class GetApAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apMac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    private GetApAssetRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
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

    public static final class Builder extends Request.Builder<GetApAssetRequest, Builder> {
        private String apMac; 
        private String appCode; 
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(GetApAssetRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.appCode = request.appCode;
            this.appName = request.appName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14:15:14:15:14:15</p>
         */
        public Builder apMac(String apMac) {
            this.putQueryParameter("ApMac", apMac);
            this.apMac = apMac;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXIIII</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ISV</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        @Override
        public GetApAssetRequest build() {
            return new GetApAssetRequest(this);
        } 

    } 

}
