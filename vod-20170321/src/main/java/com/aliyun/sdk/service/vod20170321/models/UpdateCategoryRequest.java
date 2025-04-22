// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateCategoryRequest</p>
 */
public class UpdateCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cateName;

    private UpdateCategoryRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.cateName = builder.cateName;
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
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return cateName
     */
    public String getCateName() {
        return this.cateName;
    }

    public static final class Builder extends Request.Builder<UpdateCategoryRequest, Builder> {
        private Long cateId; 
        private String cateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCategoryRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.cateName = request.cateName;
        } 

        /**
         * <p>The ID of the category. You can specify only one ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. Choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the <strong>Audio and Video / Image Category</strong> or <strong>Short Video Material Category</strong> tab, view the category ID.</li>
         * <li>Obtain the category ID from the response to the <a href="~~AddCategory~~">AddCategory</a> operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10020****</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The name of the category.</p>
         * <ul>
         * <li>The value can be up to 64 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beauty</p>
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        @Override
        public UpdateCategoryRequest build() {
            return new UpdateCategoryRequest(this);
        } 

    } 

}
