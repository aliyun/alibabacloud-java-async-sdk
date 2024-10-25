// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>EnableMetricRuleBlackListRequest</p>
 */
public class EnableMetricRuleBlackListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isEnable;

    private EnableMetricRuleBlackListRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.isEnable = builder.isEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMetricRuleBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public static final class Builder extends Request.Builder<EnableMetricRuleBlackListRequest, Builder> {
        private String id; 
        private Boolean isEnable; 

        private Builder() {
            super();
        } 

        private Builder(EnableMetricRuleBlackListRequest request) {
            super(request);
            this.id = request.id;
            this.isEnable = request.isEnable;
        } 

        /**
         * <p>The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.</p>
         * <p>For information about how to obtain the ID of a blacklist policy, see <a href="https://help.aliyun.com/document_detail/457257.html">DescribeMetricRuleBlackList</a>.</p>
         * <blockquote>
         * <p>You can also set this parameter to a JSON array. Example: <code>[&quot;a9ad2ac2-3ed9-11ed-b878-0242ac12****&quot;,&quot;5cb8a9a4-198f-4651-a353-f8b28788****&quot;]</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a9ad2ac2-3ed9-11ed-b878-0242ac12****</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether to enable the blacklist policy. Valid values:</p>
         * <ul>
         * <li>true: The blacklist policy is enabled.</li>
         * <li>false (default): The blacklist policy is disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isEnable(Boolean isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        @Override
        public EnableMetricRuleBlackListRequest build() {
            return new EnableMetricRuleBlackListRequest(this);
        } 

    } 

}
