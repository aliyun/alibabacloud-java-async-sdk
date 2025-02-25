// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteHostAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteHostAccountRequest</p>
 */
public class DeleteHostAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteHostAccountRequest(Builder builder) {
        super(builder);
        this.hostAccountId = builder.hostAccountId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountId
     */
    public String getHostAccountId() {
        return this.hostAccountId;
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

    public static final class Builder extends Request.Builder<DeleteHostAccountRequest, Builder> {
        private String hostAccountId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHostAccountRequest request) {
            super(request);
            this.hostAccountId = request.hostAccountId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the host account that you want to remove.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query the ID of the host account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostAccountId(String hostAccountId) {
            this.putQueryParameter("HostAccountId", hostAccountId);
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * <p>The ID of the bastion host from which you want to remove the host account.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
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
         * <p>The region ID of the bastion host from which you want to remove the host account.</p>
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
        public DeleteHostAccountRequest build() {
            return new DeleteHostAccountRequest(this);
        } 

    } 

}
