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
 * {@link QuerySensClassificationRequest} extends {@link RequestModel}
 *
 * <p>QuerySensClassificationRequest</p>
 */
public class QuerySensClassificationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QuerySensClassificationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySensClassificationRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QuerySensClassificationRequest, Builder> {
        private String regionId; 
        private String templateId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySensClassificationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
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
         * <p>The ID of the template defined by Data Security Guard. You can call the <a href="https://help.aliyun.com/document_detail/2743948.html">QueryDefaultTemplate</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1970541-6cf5-4d23-b101-d5b66f6e1024</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QuerySensClassificationRequest build() {
            return new QuerySensClassificationRequest(this);
        } 

    } 

}
