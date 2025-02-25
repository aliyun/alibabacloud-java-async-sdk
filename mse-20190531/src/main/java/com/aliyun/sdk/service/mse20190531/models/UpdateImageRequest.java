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
 * {@link UpdateImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageRequest</p>
 */
public class UpdateImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionCode;

    private UpdateImageRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<UpdateImageRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
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
         * <p>The ID of the destination cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-8e8e9060</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The destination version number.</p>
         * <blockquote>
         * <p>You must call the GetImage operation to obtain the maximum destination version number that corresponds to MaxVersionCode.</p>
         * </blockquote>
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
        public UpdateImageRequest build() {
            return new UpdateImageRequest(this);
        } 

    } 

}
