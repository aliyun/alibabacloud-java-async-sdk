// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleStatusRequest</p>
 */
public class ModifyRuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the sensitive data detection rule.</p>
         * <blockquote>
         * <p>You can query the ID of the sensitive data detection rule by calling the <strong>DescribeRules</strong> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12341</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the sensitive data detection rule. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can query the ID of the sensitive data detection rule by calling the <strong>DescribeRules</strong> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>Specifies whether to enable or disable the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the sensitive data detection rule.</li>
         * <li><strong>1</strong>: enables the sensitive data detection rule.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
