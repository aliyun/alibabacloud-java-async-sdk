// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link AddClientToBlackListRequest} extends {@link RequestModel}
 *
 * <p>AddClientToBlackListRequest</p>
 */
public class AddClientToBlackListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddClientToBlackListRequest(Builder builder) {
        super(builder);
        this.clientIP = builder.clientIP;
        this.clientToken = builder.clientToken;
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClientToBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIP
     */
    public String getClientIP() {
        return this.clientIP;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddClientToBlackListRequest, Builder> {
        private String clientIP; 
        private String clientToken; 
        private String fileSystemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddClientToBlackListRequest request) {
            super(request);
            this.clientIP = request.clientIP;
            this.clientToken = request.clientToken;
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IP address of the client to add.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0</p>
         */
        public Builder clientIP(String clientIP) {
            this.putQueryParameter("ClientIP", clientIP);
            this.clientIP = clientIP;
            return this;
        }

        /**
         * <p>This parameter ensures the idempotency of each request. A ClientToken is generated for each client. Make sure that each ClientToken is unique between different requests. The parameter can be a maximum of 64 characters in length and contain ASCII characters.</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/25693.htm">How to ensure idempotence</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404a348</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the region where the file system resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddClientToBlackListRequest build() {
            return new AddClientToBlackListRequest(this);
        } 

    } 

}
