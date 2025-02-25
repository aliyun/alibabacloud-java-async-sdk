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
 * {@link UpdateFunctionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionRequest</p>
 */
public class UpdateFunctionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private UpdateFunctionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateFunctionRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Long projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.projectId = request.projectId;
            this.spec = request.spec;
        } 

        /**
         * <p>代表region的资源属性字段</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the UDF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
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

        /**
         * <p>The FlowSpec field information about the UDF. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;version&quot;: &quot;1.1.0&quot;,
         *     &quot;kind&quot;: &quot;Function&quot;,
         *     &quot;spec&quot;: {
         *         &quot;functions&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;FunctionName&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;content&quot;: &quot;{&quot;name&quot;: &quot;FunctionName&quot;, &quot;datasource&quot;: {&quot;type&quot;: &quot;odps&quot;, &quot;name&quot;: &quot;odps_first&quot;}, &quot;runtimeResource&quot;: {&quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;}}&quot;,
         *                     &quot;path&quot;: &quot;XXX/OpenAPI/Function/FunctionName&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;ODPS_FUNCTION&quot;
         *                     }
         *                 },
         *                 &quot;datasource&quot;: {
         *                     &quot;name&quot;: &quot;odps_first&quot;,
         *                     &quot;type&quot;: &quot;odps&quot;
         *                 },
         *                 &quot;runtimeResource&quot;: {
         *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
         *                 }
         *             }
         *         ]
         *     }
         * }</p>
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public UpdateFunctionRequest build() {
            return new UpdateFunctionRequest(this);
        } 

    } 

}
