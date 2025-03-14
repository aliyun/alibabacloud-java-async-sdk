// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DisableCustomBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>DisableCustomBlockRecordRequest</p>
 */
public class DisableCustomBlockRecordRequest extends Request {
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

    private DisableCustomBlockRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCustomBlockRecordRequest create() {
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

    public static final class Builder extends Request.Builder<DisableCustomBlockRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DisableCustomBlockRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The IP address that is specified in the policy.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCustomBlockRecords~~">DescribeCustomBlockRecords</a> operation to query the IP address.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62.233.XX.XX</p>
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * <p>The traffic direction that is specified in the policy. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound</li>
         * <li><strong>out</strong>: outbound</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
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
        public DisableCustomBlockRecordRequest build() {
            return new DisableCustomBlockRecordRequest(this);
        } 

    } 

}
