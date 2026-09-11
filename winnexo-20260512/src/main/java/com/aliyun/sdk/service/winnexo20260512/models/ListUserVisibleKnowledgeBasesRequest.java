// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserVisibleKnowledgeBasesRequest} extends {@link RequestModel}
 *
 * <p>ListUserVisibleKnowledgeBasesRequest</p>
 */
public class ListUserVisibleKnowledgeBasesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListUserVisibleKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserVisibleKnowledgeBasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListUserVisibleKnowledgeBasesRequest, Builder> {
        private String keyword; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserVisibleKnowledgeBasesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The keyword for fuzzy match on form component data.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductKnowledge</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. Pass it explicitly in winnexo-cli by using --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListUserVisibleKnowledgeBasesRequest build() {
            return new ListUserVisibleKnowledgeBasesRequest(this);
        } 

    } 

}
