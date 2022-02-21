// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateCategoryRequest</p>
 */
public class UpdateCategoryRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateCategoryRequest, Builder> {
        private Long categoryId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCategoryRequest response) {
            super(response);
            this.categoryId = response.categoryId;
            this.name = response.name;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateCategoryRequest build() {
            return new UpdateCategoryRequest(this);
        } 

    } 

}
