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
 * {@link CancelKyuubiSparkApplicationRequest} extends {@link RequestModel}
 *
 * <p>CancelKyuubiSparkApplicationRequest</p>
 */
public class CancelKyuubiSparkApplicationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
    private String kyuubiServiceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("applicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CancelKyuubiSparkApplicationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kyuubiServiceId = builder.kyuubiServiceId;
        this.applicationId = builder.applicationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelKyuubiSparkApplicationRequest create() {
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
     * @return kyuubiServiceId
     */
    public String getKyuubiServiceId() {
        return this.kyuubiServiceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CancelKyuubiSparkApplicationRequest, Builder> {
        private String workspaceId; 
        private String kyuubiServiceId; 
        private String applicationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelKyuubiSparkApplicationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kyuubiServiceId = request.kyuubiServiceId;
            this.applicationId = request.applicationId;
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
         * kyuubiServiceId.
         */
        public Builder kyuubiServiceId(String kyuubiServiceId) {
            this.putPathParameter("kyuubiServiceId", kyuubiServiceId);
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }

        /**
         * applicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
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
        public CancelKyuubiSparkApplicationRequest build() {
            return new CancelKyuubiSparkApplicationRequest(this);
        } 

    } 

}
