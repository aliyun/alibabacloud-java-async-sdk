// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DeleteSecurityIPGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityIPGroupRequest</p>
 */
public class DeleteSecurityIPGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalSecurityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    private DeleteSecurityIPGroupRequest(Builder builder) {
        super(builder);
        this.globalSecurityGroupId = builder.globalSecurityGroupId;
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityIPGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalSecurityGroupId
     */
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityIPGroupRequest, Builder> {
        private String globalSecurityGroupId; 
        private String regionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityIPGroupRequest request) {
            super(request);
            this.globalSecurityGroupId = request.globalSecurityGroupId;
            this.regionName = request.regionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>g-rcge12hbfooad3m****</p>
         */
        public Builder globalSecurityGroupId(String globalSecurityGroupId) {
            this.putQueryParameter("GlobalSecurityGroupId", globalSecurityGroupId);
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        @Override
        public DeleteSecurityIPGroupRequest build() {
            return new DeleteSecurityIPGroupRequest(this);
        } 

    } 

}
