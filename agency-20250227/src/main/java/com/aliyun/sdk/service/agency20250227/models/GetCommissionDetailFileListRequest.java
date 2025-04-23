// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetCommissionDetailFileListRequest} extends {@link RequestModel}
 *
 * <p>GetCommissionDetailFileListRequest</p>
 */
public class GetCommissionDetailFileListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillMonth")
    private String billMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssAccessKeyId")
    private String ossAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssAccessKeySecret")
    private String ossAccessKeySecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssRegion")
    private String ossRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssSecurityToken")
    private String ossSecurityToken;

    private GetCommissionDetailFileListRequest(Builder builder) {
        super(builder);
        this.billMonth = builder.billMonth;
        this.ossAccessKeyId = builder.ossAccessKeyId;
        this.ossAccessKeySecret = builder.ossAccessKeySecret;
        this.ossBucketName = builder.ossBucketName;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossRegion = builder.ossRegion;
        this.ossSecurityToken = builder.ossSecurityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommissionDetailFileListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billMonth
     */
    public String getBillMonth() {
        return this.billMonth;
    }

    /**
     * @return ossAccessKeyId
     */
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    /**
     * @return ossAccessKeySecret
     */
    public String getOssAccessKeySecret() {
        return this.ossAccessKeySecret;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossRegion
     */
    public String getOssRegion() {
        return this.ossRegion;
    }

    /**
     * @return ossSecurityToken
     */
    public String getOssSecurityToken() {
        return this.ossSecurityToken;
    }

    public static final class Builder extends Request.Builder<GetCommissionDetailFileListRequest, Builder> {
        private String billMonth; 
        private String ossAccessKeyId; 
        private String ossAccessKeySecret; 
        private String ossBucketName; 
        private String ossEndpoint; 
        private String ossRegion; 
        private String ossSecurityToken; 

        private Builder() {
            super();
        } 

        private Builder(GetCommissionDetailFileListRequest request) {
            super(request);
            this.billMonth = request.billMonth;
            this.ossAccessKeyId = request.ossAccessKeyId;
            this.ossAccessKeySecret = request.ossAccessKeySecret;
            this.ossBucketName = request.ossBucketName;
            this.ossEndpoint = request.ossEndpoint;
            this.ossRegion = request.ossRegion;
            this.ossSecurityToken = request.ossSecurityToken;
        } 

        /**
         * BillMonth.
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("BillMonth", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        /**
         * OssAccessKeyId.
         */
        public Builder ossAccessKeyId(String ossAccessKeyId) {
            this.putQueryParameter("OssAccessKeyId", ossAccessKeyId);
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }

        /**
         * OssAccessKeySecret.
         */
        public Builder ossAccessKeySecret(String ossAccessKeySecret) {
            this.putQueryParameter("OssAccessKeySecret", ossAccessKeySecret);
            this.ossAccessKeySecret = ossAccessKeySecret;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssRegion.
         */
        public Builder ossRegion(String ossRegion) {
            this.putQueryParameter("OssRegion", ossRegion);
            this.ossRegion = ossRegion;
            return this;
        }

        /**
         * OssSecurityToken.
         */
        public Builder ossSecurityToken(String ossSecurityToken) {
            this.putQueryParameter("OssSecurityToken", ossSecurityToken);
            this.ossSecurityToken = ossSecurityToken;
            return this;
        }

        @Override
        public GetCommissionDetailFileListRequest build() {
            return new GetCommissionDetailFileListRequest(this);
        } 

    } 

}
