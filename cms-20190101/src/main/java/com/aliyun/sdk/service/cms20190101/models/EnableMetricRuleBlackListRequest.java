// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>EnableMetricRuleBlackListRequest</p>
 */
public class EnableMetricRuleBlackListRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("IsEnable")
    @Validation(required = true)
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
         * The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.
         * <p>
         * 
         * For information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).
         * 
         * > You can also set this parameter to a JSON array. Example: `["a9ad2ac2-3ed9-11ed-b878-0242ac12****","5cb8a9a4-198f-4651-a353-f8b28788****"]`.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Specifies whether to enable the blacklist policy. Valid values:
         * <p>
         * 
         * *   true: The blacklist policy is enabled.
         * *   false (default): The blacklist policy is disabled.
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
