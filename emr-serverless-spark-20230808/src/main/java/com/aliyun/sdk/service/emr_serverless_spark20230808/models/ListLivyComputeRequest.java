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
 * {@link ListLivyComputeRequest} extends {@link RequestModel}
 *
 * <p>ListLivyComputeRequest</p>
 */
public class ListLivyComputeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListLivyComputeRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivyComputeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListLivyComputeRequest, Builder> {
        private String workspaceBizId; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListLivyComputeRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceBizId.
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
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
        public ListLivyComputeRequest build() {
            return new ListLivyComputeRequest(this);
        } 

    } 

}
