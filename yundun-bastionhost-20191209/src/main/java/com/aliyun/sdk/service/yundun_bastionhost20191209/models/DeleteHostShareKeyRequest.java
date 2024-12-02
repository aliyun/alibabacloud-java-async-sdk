// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteHostShareKeyRequest</p>
 */
public class DeleteHostShareKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
    private String hostShareKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostShareKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostShareKeyId
     */
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteHostShareKeyRequest, Builder> {
        private String hostShareKeyId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHostShareKeyRequest request) {
            super(request);
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The shared key ID.</p>
         * <blockquote>
         * <p> You must specify this parameter. You can call the <a href="https://help.aliyun.com/document_detail/462973.html">ListHostShareKeys</a> operation to query the shared key ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11206</p>
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
        public DeleteHostShareKeyRequest build() {
            return new DeleteHostShareKeyRequest(this);
        } 

    } 

}
