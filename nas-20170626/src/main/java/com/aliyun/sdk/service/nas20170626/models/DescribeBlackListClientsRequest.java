// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListClientsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlackListClientsRequest</p>
 */
public class DescribeBlackListClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIP")
    private String clientIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeBlackListClientsRequest(Builder builder) {
        super(builder);
        this.clientIP = builder.clientIP;
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackListClientsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeBlackListClientsRequest, Builder> {
        private String clientIP; 
        private String fileSystemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlackListClientsRequest request) {
            super(request);
            this.clientIP = request.clientIP;
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
        } 

        /**
         * The IP address of the client.
         */
        public Builder clientIP(String clientIP) {
            this.putQueryParameter("ClientIP", clientIP);
            this.clientIP = clientIP;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The ID of the region where the file system resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeBlackListClientsRequest build() {
            return new DescribeBlackListClientsRequest(this);
        } 

    } 

}
