// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListProjectTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListProjectTemplatesRequest</p>
 */
public class ListProjectTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    private ListProjectTemplatesRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.category = builder.category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    public static final class Builder extends Request.Builder<ListProjectTemplatesRequest, Builder> {
        private String organizationId; 
        private String category; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectTemplatesRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.category = request.category;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        @Override
        public ListProjectTemplatesRequest build() {
            return new ListProjectTemplatesRequest(this);
        } 

    } 

}
