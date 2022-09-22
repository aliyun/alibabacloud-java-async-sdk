// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterSpecificationRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterSpecificationRequest</p>
 */
public class QueryClusterSpecificationRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConnectType")
    private String connectType;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    private QueryClusterSpecificationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.connectType = builder.connectType;
        this.mseSessionId = builder.mseSessionId;
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
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
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
        private String mseSessionId; 
        private String mseVersion; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterSpecificationRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.connectType = request.connectType;
            this.mseSessionId = request.mseSessionId;
            this.mseVersion = request.mseVersion;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * 网络连接类型
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * MseVersion.
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
