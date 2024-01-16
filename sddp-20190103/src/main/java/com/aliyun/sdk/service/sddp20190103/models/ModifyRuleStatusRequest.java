// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleStatusRequest</p>
 */
public class ModifyRuleStatusRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Ids")
    private String ids;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    private ModifyRuleStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleStatusRequest create() {
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
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyRuleStatusRequest, Builder> {
        private Long id; 
        private String ids; 
        private String lang; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRuleStatusRequest request) {
            super(request);
            this.id = request.id;
            this.ids = request.ids;
            this.lang = request.lang;
            this.status = request.status;
        } 

        /**
         * The ID of the sensitive data detection rule.
         * <p>
         * 
         * > You can query the ID of the sensitive data detection rule by calling the **DescribeRules** operation.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The ID of the sensitive data detection rule. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can query the ID of the sensitive data detection rule by calling the **DescribeRules** operation.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to enable or disable the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **0**: disables the sensitive data detection rule.
         * *   **1**: enables the sensitive data detection rule.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyRuleStatusRequest build() {
            return new ModifyRuleStatusRequest(this);
        } 

    } 

}
