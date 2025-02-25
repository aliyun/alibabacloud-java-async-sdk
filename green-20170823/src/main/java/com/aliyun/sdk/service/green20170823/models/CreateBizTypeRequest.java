// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBizTypeRequest} extends {@link RequestModel}
 *
 * <p>CreateBizTypeRequest</p>
 */
public class CreateBizTypeRequest extends Request {
    @Query
    @NameInMap("BizTypeImport")
    private String bizTypeImport;

    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("CiteTemplate")
    private Boolean citeTemplate;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IndustryInfo")
    private String industryInfo;

    private CreateBizTypeRequest(Builder builder) {
        super(builder);
        this.bizTypeImport = builder.bizTypeImport;
        this.bizTypeName = builder.bizTypeName;
        this.citeTemplate = builder.citeTemplate;
        this.description = builder.description;
        this.industryInfo = builder.industryInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBizTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeImport
     */
    public String getBizTypeImport() {
        return this.bizTypeImport;
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    /**
     * @return citeTemplate
     */
    public Boolean getCiteTemplate() {
        return this.citeTemplate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return industryInfo
     */
    public String getIndustryInfo() {
        return this.industryInfo;
    }

    public static final class Builder extends Request.Builder<CreateBizTypeRequest, Builder> {
        private String bizTypeImport; 
        private String bizTypeName; 
        private Boolean citeTemplate; 
        private String description; 
        private String industryInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateBizTypeRequest request) {
            super(request);
            this.bizTypeImport = request.bizTypeImport;
            this.bizTypeName = request.bizTypeName;
            this.citeTemplate = request.citeTemplate;
            this.description = request.description;
            this.industryInfo = request.industryInfo;
        } 

        /**
         * BizTypeImport.
         */
        public Builder bizTypeImport(String bizTypeImport) {
            this.putQueryParameter("BizTypeImport", bizTypeImport);
            this.bizTypeImport = bizTypeImport;
            return this;
        }

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * CiteTemplate.
         */
        public Builder citeTemplate(Boolean citeTemplate) {
            this.putQueryParameter("CiteTemplate", citeTemplate);
            this.citeTemplate = citeTemplate;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IndustryInfo.
         */
        public Builder industryInfo(String industryInfo) {
            this.putQueryParameter("IndustryInfo", industryInfo);
            this.industryInfo = industryInfo;
            return this;
        }

        @Override
        public CreateBizTypeRequest build() {
            return new CreateBizTypeRequest(this);
        } 

    } 

}
