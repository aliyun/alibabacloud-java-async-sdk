// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryUserGroupListByParentIdRequest} extends {@link RequestModel}
 *
 * <p>QueryUserGroupListByParentIdRequest</p>
 */
public class QueryUserGroupListByParentIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentUserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentUserGroupId;

    private QueryUserGroupListByParentIdRequest(Builder builder) {
        super(builder);
        this.parentUserGroupId = builder.parentUserGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGroupListByParentIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentUserGroupId
     */
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    public static final class Builder extends Request.Builder<QueryUserGroupListByParentIdRequest, Builder> {
        private String parentUserGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserGroupListByParentIdRequest request) {
            super(request);
            this.parentUserGroupId = request.parentUserGroupId;
        } 

        /**
         * <p>The ID of the parent user group.</p>
         * <ul>
         * <li>If you enter the ID of the parent user group, you can obtain the information of the child user group under this ID.</li>
         * <li>If you enter -1, you can obtain the sub-user group information under the root directory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        public Builder parentUserGroupId(String parentUserGroupId) {
            this.putQueryParameter("ParentUserGroupId", parentUserGroupId);
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }

        @Override
        public QueryUserGroupListByParentIdRequest build() {
            return new QueryUserGroupListByParentIdRequest(this);
        } 

    } 

}
