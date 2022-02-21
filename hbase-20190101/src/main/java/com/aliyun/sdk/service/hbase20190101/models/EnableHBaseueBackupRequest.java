// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHBaseueBackupRequest} extends {@link RequestModel}
 *
 * <p>EnableHBaseueBackupRequest</p>
 */
public class EnableHBaseueBackupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ColdStorageSize")
    private Integer coldStorageSize;

    @Query
    @NameInMap("HbaseueClusterId")
    @Validation(required = true)
    private String hbaseueClusterId;

    @Query
    @NameInMap("NodeCount")
    @Validation(required = true)
    private Integer nodeCount;

    private EnableHBaseueBackupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.coldStorageSize = builder.coldStorageSize;
        this.hbaseueClusterId = builder.hbaseueClusterId;
        this.nodeCount = builder.nodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableHBaseueBackupRequest create() {
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
     * @return coldStorageSize
     */
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return hbaseueClusterId
     */
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public static final class Builder extends Request.Builder<EnableHBaseueBackupRequest, Builder> {
        private String clientToken; 
        private Integer coldStorageSize; 
        private String hbaseueClusterId; 
        private Integer nodeCount; 

        private Builder() {
            super();
        } 

        private Builder(EnableHBaseueBackupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.coldStorageSize = response.coldStorageSize;
            this.hbaseueClusterId = response.hbaseueClusterId;
            this.nodeCount = response.nodeCount;
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
         * ColdStorageSize.
         */
        public Builder coldStorageSize(Integer coldStorageSize) {
            this.putQueryParameter("ColdStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * HbaseueClusterId.
         */
        public Builder hbaseueClusterId(String hbaseueClusterId) {
            this.putQueryParameter("HbaseueClusterId", hbaseueClusterId);
            this.hbaseueClusterId = hbaseueClusterId;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        @Override
        public EnableHBaseueBackupRequest build() {
            return new EnableHBaseueBackupRequest(this);
        } 

    } 

}
