// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListCatalogsRequest} extends {@link RequestModel}
 *
 * <p>ListCatalogsRequest</p>
 */
public class ListCatalogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListCatalogsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.environment = builder.environment;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListCatalogsRequest, Builder> {
        private String workspaceId; 
        private String environment; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCatalogsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.environment = request.environment;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * environment.
         */
        public Builder environment(String environment) {
            this.putQueryParameter("environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListCatalogsRequest build() {
            return new ListCatalogsRequest(this);
        } 

    } 

}
