// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetBaselineRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineRequest</p>
 */
public class GetBaselineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long baselineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private GetBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineId = builder.baselineId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineRequest create() {
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
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetBaselineRequest, Builder> {
        private String regionId; 
        private Long baselineId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineId = request.baselineId;
            this.projectId = request.projectId;
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
         * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the baseline belongs. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetBaselineRequest build() {
            return new GetBaselineRequest(this);
        } 

    } 

}
