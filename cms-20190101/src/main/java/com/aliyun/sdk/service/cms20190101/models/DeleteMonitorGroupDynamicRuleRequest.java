// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMonitorGroupDynamicRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupDynamicRuleRequest</p>
 */
public class DeleteMonitorGroupDynamicRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    private DeleteMonitorGroupDynamicRuleRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupDynamicRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupDynamicRuleRequest, Builder> {
        private String category; 
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupDynamicRuleRequest request) {
            super(request);
            this.category = request.category;
            this.groupId = request.groupId;
        } 

        /**
         * <p>The service to which the rule applies. Valid values: ecs, rds, and slb.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DeleteMonitorGroupDynamicRuleRequest build() {
            return new DeleteMonitorGroupDynamicRuleRequest(this);
        } 

    } 

}
