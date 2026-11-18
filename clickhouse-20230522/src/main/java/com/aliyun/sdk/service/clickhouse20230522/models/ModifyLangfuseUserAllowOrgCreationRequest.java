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
 * {@link ModifyLangfuseUserAllowOrgCreationRequest} extends {@link RequestModel}
 *
 * <p>ModifyLangfuseUserAllowOrgCreationRequest</p>
 */
public class ModifyLangfuseUserAllowOrgCreationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowOrgCreation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean allowOrgCreation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyLangfuseUserAllowOrgCreationRequest(Builder builder) {
        super(builder);
        this.allowOrgCreation = builder.allowOrgCreation;
        this.DBInstanceId = builder.DBInstanceId;
        this.email = builder.email;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLangfuseUserAllowOrgCreationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowOrgCreation
     */
    public Boolean getAllowOrgCreation() {
        return this.allowOrgCreation;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyLangfuseUserAllowOrgCreationRequest, Builder> {
        private Boolean allowOrgCreation; 
        private String DBInstanceId; 
        private String email; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLangfuseUserAllowOrgCreationRequest request) {
            super(request);
            this.allowOrgCreation = request.allowOrgCreation;
            this.DBInstanceId = request.DBInstanceId;
            this.email = request.email;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether the user is allowed to create organizations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowOrgCreation(Boolean allowOrgCreation) {
            this.putQueryParameter("AllowOrgCreation", allowOrgCreation);
            this.allowOrgCreation = allowOrgCreation;
            return this;
        }

        /**
         * <p>The Langfuse instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-2ze1n52*******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The email address of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@company.com">alice@company.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public ModifyLangfuseUserAllowOrgCreationRequest build() {
            return new ModifyLangfuseUserAllowOrgCreationRequest(this);
        } 

    } 

}
