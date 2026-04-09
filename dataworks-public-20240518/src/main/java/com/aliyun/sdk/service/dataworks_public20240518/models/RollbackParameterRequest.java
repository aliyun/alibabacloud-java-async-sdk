// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RollbackParameterRequest} extends {@link RequestModel}
 *
 * <p>RollbackParameterRequest</p>
 */
public class RollbackParameterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RollbackVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rollbackVersion;

    private RollbackParameterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.rollbackVersion = builder.rollbackVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackParameterRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return rollbackVersion
     */
    public Integer getRollbackVersion() {
        return this.rollbackVersion;
    }

    public static final class Builder extends Request.Builder<RollbackParameterRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Integer rollbackVersion; 

        private Builder() {
            super();
        } 

        private Builder(RollbackParameterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.rollbackVersion = request.rollbackVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rollbackVersion(Integer rollbackVersion) {
            this.putBodyParameter("RollbackVersion", rollbackVersion);
            this.rollbackVersion = rollbackVersion;
            return this;
        }

        @Override
        public RollbackParameterRequest build() {
            return new RollbackParameterRequest(this);
        } 

    } 

}
