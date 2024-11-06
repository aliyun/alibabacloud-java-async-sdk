// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafGroupRequest</p>
 */
public class ModifyDcdnWafGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
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
         * <p>The ID of the custom WAF rule group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000110</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the custom WAF rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The incremental modifications of the rules in the custom WAF rule group. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;All&quot;:false,&quot;Op&quot;:&quot;del&quot;,&quot;List&quot;:&quot;900109&quot;}</p>
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
