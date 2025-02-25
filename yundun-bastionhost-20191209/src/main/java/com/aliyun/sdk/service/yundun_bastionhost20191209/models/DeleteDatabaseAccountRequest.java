// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabaseAccountRequest</p>
 */
public class DeleteDatabaseAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountId = builder.databaseAccountId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatabaseAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountId
     */
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
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

    public static final class Builder extends Request.Builder<DeleteDatabaseAccountRequest, Builder> {
        private String databaseAccountId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountId = request.databaseAccountId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the database account that you want to delete.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder databaseAccountId(String databaseAccountId) {
            this.putQueryParameter("DatabaseAccountId", databaseAccountId);
            this.databaseAccountId = databaseAccountId;
            return this;
        }

        /**
         * <p>The ID of the bastion host from which you want to delete the database account.</p>
         * <blockquote>
         * <p>You can call the DescribeInstances operation to query the ID of the bastion host.</p>
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
         * <p>The region ID of the bastion host from which you want to delete the database account.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, <a href="https://help.aliyun.com/document_detail/40654.html">see Regions and zones</a>.</p>
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
        public DeleteDatabaseAccountRequest build() {
            return new DeleteDatabaseAccountRequest(this);
        } 

    } 

}
