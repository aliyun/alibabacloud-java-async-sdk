// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExistRunningSQLEngineRequest} extends {@link RequestModel}
 *
 * <p>ExistRunningSQLEngineRequest</p>
 */
public class ExistRunningSQLEngineRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Body
    @NameInMap("ResourceGroupName")
    @Validation(required = true)
    private String resourceGroupName;

    private ExistRunningSQLEngineRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExistRunningSQLEngineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<ExistRunningSQLEngineRequest, Builder> {
        private String DBClusterId; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ExistRunningSQLEngineRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putBodyParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public ExistRunningSQLEngineRequest build() {
            return new ExistRunningSQLEngineRequest(this);
        } 

    } 

}
