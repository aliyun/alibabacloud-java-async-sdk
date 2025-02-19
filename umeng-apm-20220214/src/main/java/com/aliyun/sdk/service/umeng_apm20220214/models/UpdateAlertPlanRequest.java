// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

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
 * {@link UpdateAlertPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertPlanRequest</p>
 */
public class UpdateAlertPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versions")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5fb6001a73749c24fd9cb356</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18288</p>
         */
        public Builder planId(Long planId) {
            this.putQueryParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1.1.0,1.2.0,1.3.0&quot;</p>
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
