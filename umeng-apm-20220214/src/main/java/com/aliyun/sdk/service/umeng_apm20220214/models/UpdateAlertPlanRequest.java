// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertPlanRequest</p>
 */
public class UpdateAlertPlanRequest extends Request {
    @Query
    @NameInMap("dataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("planId")
    @Validation(required = true)
    private Long planId;

    @Query
    @NameInMap("versions")
    @Validation(required = true)
    private String versions;

    private UpdateAlertPlanRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.planId = builder.planId;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<UpdateAlertPlanRequest, Builder> {
        private String dataSourceId; 
        private Long planId; 
        private String versions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertPlanRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.planId = request.planId;
            this.versions = request.versions;
        } 

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(Long planId) {
            this.putQueryParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * versions.
         */
        public Builder versions(String versions) {
            this.putQueryParameter("versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public UpdateAlertPlanRequest build() {
            return new UpdateAlertPlanRequest(this);
        } 

    } 

}
