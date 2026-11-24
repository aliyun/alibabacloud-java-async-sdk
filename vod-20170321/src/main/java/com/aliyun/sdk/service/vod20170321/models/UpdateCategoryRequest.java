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
         * <p>The category ID. You can specify only one category ID. You can obtain the category ID by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> &gt; <strong>Audio/Video and Image Categories</strong> or <strong>Short Video Material Categories</strong> to view the category ID.</li>
         * <li>The category ID is returned when you call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category.</li>
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
         * <p>The category name.</p>
         * <ul>
         * <li>The name can be up to 64 bytes in length.</li>
         * <li>The name must be encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Landscape</p>
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
