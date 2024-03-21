// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnWafGroupRequest</p>
 */
public class CreateDcdnWafGroupRequest extends Request {
    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Subscribe")
    private String subscribe;

    @Body
    @NameInMap("TemplateId")
    private Long templateId;

    private CreateDcdnWafGroupRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.subscribe = builder.subscribe;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnWafGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return subscribe
     */
    public String getSubscribe() {
        return this.subscribe;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateDcdnWafGroupRequest, Builder> {
        private String name; 
        private String subscribe; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnWafGroupRequest request) {
            super(request);
            this.name = request.name;
            this.subscribe = request.subscribe;
            this.templateId = request.templateId;
        } 

        /**
         * The name of the WAF rule group. The name can be up to 128 characters in length. This parameter is required when you create a custom WAF rule group.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to enable subscription. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         * 
         * When you replicate a custom rule group, do not specify this parameter.
         */
        public Builder subscribe(String subscribe) {
            this.putBodyParameter("Subscribe", subscribe);
            this.subscribe = subscribe;
            return this;
        }

        /**
         * The ID of the rule group to be replicated. This parameter is required when you replicate a custom WAF rule group. You can call the [DescribeDcdnWafGroups](~~DescribeDcdnWafGroups~~) operation to query the ID of the rule group. If no template is used, set the value to 0 or do not specify this parameter.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateDcdnWafGroupRequest build() {
            return new CreateDcdnWafGroupRequest(this);
        } 

    } 

}
