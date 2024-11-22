// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateListRequest} extends {@link RequestModel}
 *
 * <p>CreateListRequest</p>
 */
public class CreateListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < String > items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Kind")
    private String kind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateListRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.items = builder.items;
        this.kind = builder.kind;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateListRequest create() {
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
     * @return items
     */
    public java.util.List < String > getItems() {
        return this.items;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateListRequest, Builder> {
        private String description; 
        private java.util.List < String > items; 
        private String kind; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateListRequest request) {
            super(request);
            this.description = request.description;
            this.items = request.items;
            this.kind = request.kind;
            this.name = request.name;
        } 

        /**
         * <p>The description of the list that you want to create.</p>
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
         * <p>The items in the list that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        public Builder items(java.util.List < String > items) {
            String itemsShrink = shrink(items, "Items", "json");
            this.putBodyParameter("Items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * <p>The type of the list that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder kind(String kind) {
            this.putBodyParameter("Kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>The name of the list that you want to create.</p>
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
        public CreateListRequest build() {
            return new CreateListRequest(this);
        } 

    } 

}
