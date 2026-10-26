// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListIdentifyModelsRequest} extends {@link RequestModel}
 *
 * <p>ListIdentifyModelsRequest</p>
 */
public class ListIdentifyModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterAuditModel")
    private Boolean filterAuditModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private ListIdentifyModelsRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.filterAuditModel = builder.filterAuditModel;
        this.lang = builder.lang;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentifyModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return filterAuditModel
     */
    public Boolean getFilterAuditModel() {
        return this.filterAuditModel;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ListIdentifyModelsRequest, Builder> {
        private Integer featureType; 
        private Boolean filterAuditModel; 
        private String lang; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentifyModelsRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.filterAuditModel = request.filterAuditModel;
            this.lang = request.lang;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The reserved feature type parameter. This parameter is not used to filter results in the current query and does not need to be specified for column encryption calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>Specifies whether to restrict the results to recognition models supported in audit scenarios. If you set this parameter to true, models supported for auditing, such as mobile phone numbers, ID cards, and bank cards, are filtered. This parameter is optional for column encryption scenarios.</p>
         */
        public Builder filterAuditModel(Boolean filterAuditModel) {
            this.putQueryParameter("FilterAuditModel", filterAuditModel);
            this.filterAuditModel = filterAuditModel;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values: zh: Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the data classification template. You can obtain the ID from Items[].Id in the response of the ListTemplates operation. The ID must be consistent with the selected sensitivity level and recognition model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ListIdentifyModelsRequest build() {
            return new ListIdentifyModelsRequest(this);
        } 

    } 

}
