// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSupplementDagrunInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetSupplementDagrunInstanceRequest</p>
 */
public class GetSupplementDagrunInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagrunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dagrunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetSupplementDagrunInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagrunId = builder.dagrunId;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupplementDagrunInstanceRequest create() {
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
     * @return dagrunId
     */
    public String getDagrunId() {
        return this.dagrunId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetSupplementDagrunInstanceRequest, Builder> {
        private String regionId; 
        private String dagrunId; 
        private String env; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSupplementDagrunInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagrunId = request.dagrunId;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
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
         * <p>Dagrun ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dr_2242792_14542</p>
         */
        public Builder dagrunId(String dagrunId) {
            this.putQueryParameter("DagrunId", dagrunId);
            this.dagrunId = dagrunId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public GetSupplementDagrunInstanceRequest build() {
            return new GetSupplementDagrunInstanceRequest(this);
        } 

    } 

}
