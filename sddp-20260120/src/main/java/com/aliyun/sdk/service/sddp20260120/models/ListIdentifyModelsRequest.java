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
         * FeatureType.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * FilterAuditModel.
         */
        public Builder filterAuditModel(Boolean filterAuditModel) {
            this.putQueryParameter("FilterAuditModel", filterAuditModel);
            this.filterAuditModel = filterAuditModel;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * TemplateId.
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
