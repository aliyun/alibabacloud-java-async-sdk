// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>EnableCustomBlockRecordRequest</p>
 */
public class EnableCustomBlockRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bound")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private EnableCustomBlockRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCustomBlockRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockIp
     */
    public String getBlockIp() {
        return this.blockIp;
    }

    /**
     * @return bound
     */
    public String getBound() {
        return this.bound;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<EnableCustomBlockRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(EnableCustomBlockRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The IP address that is specified in the policy.
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * The traffic direction that is specified in the policy. Valid values:
         * <p>
         * 
         * *   **in**: inbound
         * *   **out**: outbound
         */
        public Builder bound(String bound) {
            this.putQueryParameter("Bound", bound);
            this.bound = bound;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public EnableCustomBlockRecordRequest build() {
            return new EnableCustomBlockRecordRequest(this);
        } 

    } 

}
