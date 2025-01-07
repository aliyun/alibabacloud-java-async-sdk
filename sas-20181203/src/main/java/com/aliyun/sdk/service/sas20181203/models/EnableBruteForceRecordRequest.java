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
 * {@link EnableBruteForceRecordRequest} extends {@link RequestModel}
 *
 * <p>EnableBruteForceRecordRequest</p>
 */
public class EnableBruteForceRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bound")
    private String bound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private EnableBruteForceRecordRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.bound = builder.bound;
        this.id = builder.id;
        this.port = builder.port;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBruteForceRecordRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<EnableBruteForceRecordRequest, Builder> {
        private String blockIp; 
        private String bound; 
        private Long id; 
        private String port; 
        private Long resourceOwnerId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(EnableBruteForceRecordRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.bound = request.bound;
            this.id = request.id;
            this.port = request.port;
            this.resourceOwnerId = request.resourceOwnerId;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The IP address that is specified in the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61.155.XX.XX</p>
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
         * <p>The ID of the policy that you want to enable.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeBruteForceRecords~~">DescribeBruteForceRecords</a> operation to query the IDs of policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>116602XX</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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

        /**
         * <p>The UUID of the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>71046acb-8bff-4c3b-9163-24deb007****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public EnableBruteForceRecordRequest build() {
            return new EnableBruteForceRecordRequest(this);
        } 

    } 

}
