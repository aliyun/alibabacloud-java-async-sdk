// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoSqlOptimizeStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoSqlOptimizeStatusRequest</p>
 */
public class UpdateAutoSqlOptimizeStatusRequest extends Request {
    @Query
    @NameInMap("Instances")
    @Validation(required = true)
    private String instances;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    private UpdateAutoSqlOptimizeStatusRequest(Builder builder) {
        super(builder);
        this.instances = builder.instances;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoSqlOptimizeStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateAutoSqlOptimizeStatusRequest, Builder> {
        private String instances; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoSqlOptimizeStatusRequest request) {
            super(request);
            this.instances = request.instances;
            this.status = request.status;
        } 

        /**
         * The database instance IDs. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You can specify up to 50 instance IDs.
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The status of the automatic SQL optimization feature. Valid values:
         * <p>
         * 
         * *   **0**: The automatic SQL optimization feature is disabled.
         * *   **1**: **SQL diagnosis and automatic index creation** is specified.
         * *   **3**: **SQL diagnosis only** is specified.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateAutoSqlOptimizeStatusRequest build() {
            return new UpdateAutoSqlOptimizeStatusRequest(this);
        } 

    } 

}
