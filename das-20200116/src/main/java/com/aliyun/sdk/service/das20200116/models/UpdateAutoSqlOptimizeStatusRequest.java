// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAutoSqlOptimizeStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoSqlOptimizeStatusRequest</p>
 */
public class UpdateAutoSqlOptimizeStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The database instance IDs. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can specify up to 50 instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp10usoc1erj7****,rm-bp10usoc1erj7****</p>
         */
        public Builder instances(String instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The status of the automatic SQL optimization feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The automatic SQL optimization feature is disabled.</li>
         * <li><strong>1</strong>: <strong>SQL diagnosis and automatic index creation</strong> is specified.</li>
         * <li><strong>3</strong>: <strong>SQL diagnosis only</strong> is specified.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
