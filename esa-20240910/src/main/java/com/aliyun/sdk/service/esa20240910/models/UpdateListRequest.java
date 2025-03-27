// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateListRequest} extends {@link RequestModel}
 *
 * <p>UpdateListRequest</p>
 */
public class UpdateListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdateListRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.id = builder.id;
        this.items = builder.items;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return items
     */
    public java.util.List<String> getItems() {
        return this.items;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateListRequest, Builder> {
        private String description; 
        private Long id; 
        private java.util.List<String> items; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListRequest request) {
            super(request);
            this.description = request.description;
            this.id = request.id;
            this.items = request.items;
            this.name = request.name;
        } 

        /**
         * <p>The new description of the list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the custom list, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The items in the updated list. The value is a JSON array.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        public Builder items(java.util.List<String> items) {
            String itemsShrink = shrink(items, "Items", "json");
            this.putBodyParameter("Items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * <p>The new name of the list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateListRequest build() {
            return new UpdateListRequest(this);
        } 

    } 

}
