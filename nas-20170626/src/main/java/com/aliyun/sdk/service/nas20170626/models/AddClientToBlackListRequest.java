// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClientToBlackListRequest} extends {@link RequestModel}
 *
 * <p>AddClientToBlackListRequest</p>
 */
public class AddClientToBlackListRequest extends Request {
    @Query
    @NameInMap("ClientIP")
    @Validation(required = true)
    private String clientIP;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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

        private Builder(AddClientToBlackListRequest response) {
            super(response);
            this.clientIP = response.clientIP;
            this.clientToken = response.clientToken;
            this.fileSystemId = response.fileSystemId;
            this.regionId = response.regionId;
        } 

        /**
         * ClientIP.
         */
        public Builder clientIP(String clientIP) {
            this.putQueryParameter("ClientIP", clientIP);
            this.clientIP = clientIP;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * RegionId.
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
