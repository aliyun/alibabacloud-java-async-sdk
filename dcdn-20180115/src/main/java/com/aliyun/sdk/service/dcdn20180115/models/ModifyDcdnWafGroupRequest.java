// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafGroupRequest</p>
 */
public class ModifyDcdnWafGroupRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Rules")
    private String rules;

    private ModifyDcdnWafGroupRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyDcdnWafGroupRequest, Builder> {
        private Long id; 
        private String name; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDcdnWafGroupRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.rules = request.rules;
        } 

        /**
         * The ID of the custom WAF rule group.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the custom WAF rule group.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The incremental modification of the rules in the custom WAF rule group. The value is a string in the JSON format.
         */
        public Builder rules(String rules) {
            this.putBodyParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyDcdnWafGroupRequest build() {
            return new ModifyDcdnWafGroupRequest(this);
        } 

    } 

}
