// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link DeleteTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplatesRequest</p>
 */
public class DeleteTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDeleteExecutions")
    private Boolean autoDeleteExecutions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateNames;

    private DeleteTemplatesRequest(Builder builder) {
        super(builder);
        this.autoDeleteExecutions = builder.autoDeleteExecutions;
        this.regionId = builder.regionId;
        this.templateNames = builder.templateNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeleteExecutions
     */
    public Boolean getAutoDeleteExecutions() {
        return this.autoDeleteExecutions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateNames
     */
    public String getTemplateNames() {
        return this.templateNames;
    }

    public static final class Builder extends Request.Builder<DeleteTemplatesRequest, Builder> {
        private Boolean autoDeleteExecutions; 
        private String regionId; 
        private String templateNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplatesRequest request) {
            super(request);
            this.autoDeleteExecutions = request.autoDeleteExecutions;
            this.regionId = request.regionId;
            this.templateNames = request.templateNames;
        } 

        /**
         * <p>Specifies whether to delete the related executions when a template is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoDeleteExecutions(Boolean autoDeleteExecutions) {
            this.putQueryParameter("AutoDeleteExecutions", autoDeleteExecutions);
            this.autoDeleteExecutions = autoDeleteExecutions;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The names of the templates to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;t1&quot;,&quot;t2&quot;]</p>
         */
        public Builder templateNames(String templateNames) {
            this.putQueryParameter("TemplateNames", templateNames);
            this.templateNames = templateNames;
            return this;
        }

        @Override
        public DeleteTemplatesRequest build() {
            return new DeleteTemplatesRequest(this);
        } 

    } 

}
