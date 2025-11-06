// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveSingleTaskForTransferOutByAuthorizationCodeRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForTransferOutByAuthorizationCodeRequest</p>
 */
public class SaveSingleTaskForTransferOutByAuthorizationCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private SaveSingleTaskForTransferOutByAuthorizationCodeRequest(Builder builder) {
        super(builder);
        this.authorizationCode = builder.authorizationCode;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForTransferOutByAuthorizationCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationCode
     */
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForTransferOutByAuthorizationCodeRequest, Builder> {
        private String authorizationCode; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForTransferOutByAuthorizationCodeRequest request) {
            super(request);
            this.authorizationCode = request.authorizationCode;
            this.domainName = request.domainName;
        } 

        /**
         * <p>Schema of Response</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test2o#Lck</p>
         */
        public Builder authorizationCode(String authorizationCode) {
            this.putQueryParameter("AuthorizationCode", authorizationCode);
            this.authorizationCode = authorizationCode;
            return this;
        }

        /**
         * <p>The transfer key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public SaveSingleTaskForTransferOutByAuthorizationCodeRequest build() {
            return new SaveSingleTaskForTransferOutByAuthorizationCodeRequest(this);
        } 

    } 

}
