// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DeleteLangfuseInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteLangfuseInstanceRequest</p>
 */
public class DeleteLangfuseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfirmDeleteAiGateway")
    private Boolean confirmDeleteAiGateway;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteLangfuseInstanceRequest(Builder builder) {
        super(builder);
        this.confirmDeleteAiGateway = builder.confirmDeleteAiGateway;
        this.DBInstanceId = builder.DBInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLangfuseInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirmDeleteAiGateway
     */
    public Boolean getConfirmDeleteAiGateway() {
        return this.confirmDeleteAiGateway;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteLangfuseInstanceRequest, Builder> {
        private Boolean confirmDeleteAiGateway; 
        private String DBInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLangfuseInstanceRequest request) {
            super(request);
            this.confirmDeleteAiGateway = request.confirmDeleteAiGateway;
            this.DBInstanceId = request.DBInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * ConfirmDeleteAiGateway.
         */
        public Builder confirmDeleteAiGateway(Boolean confirmDeleteAiGateway) {
            this.putQueryParameter("ConfirmDeleteAiGateway", confirmDeleteAiGateway);
            this.confirmDeleteAiGateway = confirmDeleteAiGateway;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
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
        public DeleteLangfuseInstanceRequest build() {
            return new DeleteLangfuseInstanceRequest(this);
        } 

    } 

}
