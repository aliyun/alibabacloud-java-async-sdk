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
 * {@link QueryClusterSpecificationRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterSpecificationRequest</p>
 */
public class QueryClusterSpecificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseVersion")
    private String mseVersion;

    private QueryClusterSpecificationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.connectType = builder.connectType;
        this.mseVersion = builder.mseVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterSpecificationRequest create() {
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
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    public static final class Builder extends Request.Builder<QueryClusterSpecificationRequest, Builder> {
        private String acceptLanguage; 
        private String connectType; 
        private String mseVersion; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterSpecificationRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.connectType = request.connectType;
            this.mseVersion = request.mseVersion;
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>slb</li>
         * <li>eni</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * <p>The edition of the MSE instance that you want to purchase.</p>
         * <ul>
         * <li>mse_pro: Professional Edition</li>
         * <li>mse_dev: Developer Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        @Override
        public QueryClusterSpecificationRequest build() {
            return new QueryClusterSpecificationRequest(this);
        } 

    } 

}
