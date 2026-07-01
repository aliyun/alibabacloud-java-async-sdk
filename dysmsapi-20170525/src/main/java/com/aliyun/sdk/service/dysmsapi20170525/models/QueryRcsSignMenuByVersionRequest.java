// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QueryRcsSignMenuByVersionRequest} extends {@link RequestModel}
 *
 * <p>QueryRcsSignMenuByVersionRequest</p>
 */
public class QueryRcsSignMenuByVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RcsMenuVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rcsMenuVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    private QueryRcsSignMenuByVersionRequest(Builder builder) {
        super(builder);
        this.rcsMenuVersion = builder.rcsMenuVersion;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRcsSignMenuByVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rcsMenuVersion
     */
    public String getRcsMenuVersion() {
        return this.rcsMenuVersion;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<QueryRcsSignMenuByVersionRequest, Builder> {
        private String rcsMenuVersion; 
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(QueryRcsSignMenuByVersionRequest request) {
            super(request);
            this.rcsMenuVersion = request.rcsMenuVersion;
            this.signName = request.signName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder rcsMenuVersion(String rcsMenuVersion) {
            this.putQueryParameter("RcsMenuVersion", rcsMenuVersion);
            this.rcsMenuVersion = rcsMenuVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public QueryRcsSignMenuByVersionRequest build() {
            return new QueryRcsSignMenuByVersionRequest(this);
        } 

    } 

}
