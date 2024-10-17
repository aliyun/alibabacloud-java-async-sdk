// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetCustomTemplateRequest</p>
 */
public class GetCustomTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtype")
    private Integer subtype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private GetCustomTemplateRequest(Builder builder) {
        super(builder);
        this.subtype = builder.subtype;
        this.templateId = builder.templateId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subtype
     */
    public Integer getSubtype() {
        return this.subtype;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCustomTemplateRequest, Builder> {
        private Integer subtype; 
        private String templateId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomTemplateRequest request) {
            super(request);
            this.subtype = request.subtype;
            this.templateId = request.templateId;
            this.type = request.type;
        } 

        /**
         * Subtype.
         */
        public Builder subtype(Integer subtype) {
            this.putQueryParameter("Subtype", subtype);
            this.subtype = subtype;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCustomTemplateRequest build() {
            return new GetCustomTemplateRequest(this);
        } 

    } 

}
