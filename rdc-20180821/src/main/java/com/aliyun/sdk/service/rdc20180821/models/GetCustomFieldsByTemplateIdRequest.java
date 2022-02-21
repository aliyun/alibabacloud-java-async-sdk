// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomFieldsByTemplateIdRequest} extends {@link RequestModel}
 *
 * <p>GetCustomFieldsByTemplateIdRequest</p>
 */
public class GetCustomFieldsByTemplateIdRequest extends Request {
    @Body
    @NameInMap("AKProjectId")
    @Validation(required = true)
    private Integer AKProjectId;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Integer templateId;

    private GetCustomFieldsByTemplateIdRequest(Builder builder) {
        super(builder);
        this.AKProjectId = builder.AKProjectId;
        this.corpIdentifier = builder.corpIdentifier;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomFieldsByTemplateIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AKProjectId
     */
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetCustomFieldsByTemplateIdRequest, Builder> {
        private Integer AKProjectId; 
        private String corpIdentifier; 
        private Integer templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomFieldsByTemplateIdRequest response) {
            super(response);
            this.AKProjectId = response.AKProjectId;
            this.corpIdentifier = response.corpIdentifier;
            this.templateId = response.templateId;
        } 

        /**
         * AKProjectId.
         */
        public Builder AKProjectId(Integer AKProjectId) {
            this.putBodyParameter("AKProjectId", AKProjectId);
            this.AKProjectId = AKProjectId;
            return this;
        }

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetCustomFieldsByTemplateIdRequest build() {
            return new GetCustomFieldsByTemplateIdRequest(this);
        } 

    } 

}
