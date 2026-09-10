// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterEncryptionKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterEncryptionKeyRequest</p>
 */
public class DescribeDBClusterEncryptionKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    private DescribeDBClusterEncryptionKeyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterEncryptionKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterEncryptionKeyRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterEncryptionKeyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>A client token to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f******************</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a>Operation to query the details of all clusters in your account, including cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public DescribeDBClusterEncryptionKeyRequest build() {
            return new DescribeDBClusterEncryptionKeyRequest(this);
        } 

    } 

}
