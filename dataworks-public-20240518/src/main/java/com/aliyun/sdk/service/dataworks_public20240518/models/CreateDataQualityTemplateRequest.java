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
 * {@link CreateDataQualityTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDataQualityTemplateRequest</p>
 */
public class CreateDataQualityTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    private CreateDataQualityTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityTemplateRequest create() {
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<CreateDataQualityTemplateRequest, Builder> {
        private String regionId; 
        private String owner; 
        private Long projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataQualityTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.owner = request.owner;
            this.projectId = request.projectId;
            this.spec = request.spec;
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
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The Spec code for the detailed configuration of the rule template. For more information, see <a href="https://help.aliyun.com/document_detail/2963394.html">Data quality Spec configuration</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;assertion&quot;: &quot;anomaly detection fro id_not_null_cnt&quot;,
         *     &quot;id_not_null_cnt&quot;: {
         *         &quot;query&quot;: &quot;SELECT COUNT(*) AS cnt FROM ${tableName} WHERE dt = \&quot;$[yyyymmdd-1]\&quot;;&quot;
         *     },
         *     &quot;identity&quot;: &quot;819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a&quot;
         * }</p>
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateDataQualityTemplateRequest build() {
            return new CreateDataQualityTemplateRequest(this);
        } 

    } 

}
