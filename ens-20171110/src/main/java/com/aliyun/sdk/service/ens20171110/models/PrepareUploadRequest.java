// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link PrepareUploadRequest} extends {@link RequestModel}
 *
 * <p>PrepareUploadRequest</p>
 */
public class PrepareUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    private PrepareUploadRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.clientIp = builder.clientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepareUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    public static final class Builder extends Request.Builder<PrepareUploadRequest, Builder> {
        private String bucketName; 
        private String clientIp; 

        private Builder() {
            super();
        } 

        private Builder(PrepareUploadRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.clientIp = request.clientIp;
        } 

        /**
         * <p>The bucket name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The client\&quot;s IP address. Use this parameter when the client\&quot;s IP address differs from the IP address used to call the API. For example, a server obtains authorization and then sends it to a client.</p>
         * 
         * <strong>example:</strong>
         * <p>180.166.XX.XX</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        @Override
        public PrepareUploadRequest build() {
            return new PrepareUploadRequest(this);
        } 

    } 

}
