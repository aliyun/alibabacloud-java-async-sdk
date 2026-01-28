// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link DeleteAuthorizationResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAuthorizationResourceRequest</p>
 */
public class DeleteAuthorizationResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private DeleteAuthorizationResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationResourceId = builder.authorizationResourceId;
        this.authorizationRuleId = builder.authorizationRuleId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAuthorizationResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authorizationResourceId
     */
    public String getAuthorizationResourceId() {
        return this.authorizationResourceId;
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteAuthorizationResourceRequest, Builder> {
        private String regionId; 
        private String authorizationResourceId; 
        private String authorizationRuleId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAuthorizationResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationResourceId = request.authorizationResourceId;
            this.authorizationRuleId = request.authorizationRuleId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>授权资源标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
         */
        public Builder authorizationResourceId(String authorizationResourceId) {
            this.putQueryParameter("AuthorizationResourceId", authorizationResourceId);
            this.authorizationResourceId = authorizationResourceId;
            return this;
        }

        /**
         * <p>授权规则标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.putQueryParameter("AuthorizationRuleId", authorizationRuleId);
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteAuthorizationResourceRequest build() {
            return new DeleteAuthorizationResourceRequest(this);
        } 

    } 

}
