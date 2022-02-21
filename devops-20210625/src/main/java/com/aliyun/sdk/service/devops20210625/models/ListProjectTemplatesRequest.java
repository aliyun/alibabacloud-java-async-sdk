// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListProjectTemplatesRequest</p>
 */
public class ListProjectTemplatesRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("category")
    @Validation(required = true)
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

        private Builder(ListProjectTemplatesRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.category = response.category;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 模板类型
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
