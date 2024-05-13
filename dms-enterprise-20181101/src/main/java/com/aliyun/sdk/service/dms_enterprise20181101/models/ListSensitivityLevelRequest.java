// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitivityLevelRequest} extends {@link RequestModel}
 *
 * <p>ListSensitivityLevelRequest</p>
 */
public class ListSensitivityLevelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ListSensitivityLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitivityLevelRequest create() {
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
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListSensitivityLevelRequest, Builder> {
        private String regionId; 
        private Long templateId; 
        private String templateType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSensitivityLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.tid = request.tid;
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
         * The ID of the classification template. You can call the [ListClassificationTemplates](~~460613~~) operation to query the ID of the classification template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The type of the classification template. You can call the [ListClassificationTemplates](~~460613~~) operation to query the type of the classification template.
         * <p>
         * 
         * Valid values:
         * 
         * *   USER_DEFINE: a custom template.
         * *   INNER: a built-in template.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~) in the topic "Manage DMS tenants."
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListSensitivityLevelRequest build() {
            return new ListSensitivityLevelRequest(this);
        } 

    } 

}
