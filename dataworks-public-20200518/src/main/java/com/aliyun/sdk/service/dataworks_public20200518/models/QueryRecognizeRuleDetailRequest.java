// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecognizeRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryRecognizeRuleDetailRequest</p>
 */
public class QueryRecognizeRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sensitiveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QueryRecognizeRuleDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sensitiveName = builder.sensitiveName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognizeRuleDetailRequest create() {
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
     * @return sensitiveName
     */
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryRecognizeRuleDetailRequest, Builder> {
        private String regionId; 
        private String sensitiveName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecognizeRuleDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sensitiveName = request.sensitiveName;
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
         * The name of the sensitive field. To obtain the name of the sensitive field, call the [QuerySensNodeInfo](~~2747189~~) operation or log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Data Category and Sensitivity Level page.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the [DataWorks console](https://workbench.data.aliyun.com/console). Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryRecognizeRuleDetailRequest build() {
            return new QueryRecognizeRuleDetailRequest(this);
        } 

    } 

}
