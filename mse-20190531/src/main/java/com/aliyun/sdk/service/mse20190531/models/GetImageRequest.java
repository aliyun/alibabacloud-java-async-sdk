// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetImageRequest} extends {@link RequestModel}
 *
 * <p>GetImageRequest</p>
 */
public class GetImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionCode;

    private GetImageRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<GetImageRequest, Builder> {
        private String acceptLanguage; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetImageRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.versionCode = request.versionCode;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The version number of the current instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZooKeeper_3_5_5</p>
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        @Override
        public GetImageRequest build() {
            return new GetImageRequest(this);
        } 

    } 

}
