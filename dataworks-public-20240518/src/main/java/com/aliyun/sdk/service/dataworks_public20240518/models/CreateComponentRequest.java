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
 * {@link CreateComponentRequest} extends {@link RequestModel}
 *
 * <p>CreateComponentRequest</p>
 */
public class CreateComponentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private CreateComponentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComponentRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateComponentRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Long projectId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateComponentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.spec = request.spec;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/2852607.html">ListProjects</a> operation to obtain the ID.</p>
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
         * <p>The FlowSpec information for this UDF function. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;kind&quot;: &quot;Component&quot;,
         *     &quot;name&quot;: &quot;com1&quot;,
         *     &quot;spec&quot;: {
         *         &quot;components&quot;: [
         *             {
         *                 &quot;name&quot;: &quot;test11&quot;,
         *                 &quot;id&quot;: &quot;1234&quot;,
         *                 &quot;owner&quot;: &quot;1234456&quot;,
         *                 &quot;description&quot;: &quot;&quot;,
         *                 &quot;script&quot;: {
         *                     &quot;language&quot;: &quot;odps-sql&quot;,
         *                     &quot;path&quot;: &quot;test11&quot;,
         *                     &quot;content&quot;: &quot;select &quot;@@{bizdate}&quot;, &quot;@@{my_input_table}&quot;&quot;,
         *                     &quot;runtime&quot;: {
         *                         &quot;command&quot;: &quot;SQL_COMPONENT&quot;
         *                     }
         *                 },
         *                 &quot;inputs&quot;: [
         *                     {
         *                         &quot;name&quot;: &quot;bizdate&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     },
         *                     {
         *                         &quot;name&quot;: &quot;my_input_table&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     }
         *                 ],
         *                 &quot;outputs&quot;: [
         *                     {
         *                         &quot;name&quot;: &quot;my_output_table1&quot;,
         *                         &quot;type&quot;: &quot;string&quot;
         *                     }
         *                 ]
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
        public CreateComponentRequest build() {
            return new CreateComponentRequest(this);
        } 

    } 

}
