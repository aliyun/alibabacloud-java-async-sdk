// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListCategoriesRequest</p>
 */
public class ListCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListCategoriesRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCategoriesRequest, Builder> {
        private String categoryId; 
        private String instanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCategoriesRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the ticket category. Specify this parameter to return information about the subcategories of the specified category. If you leave this parameter empty, information about all categories in the instance is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>43c2671b-<em><strong>-</strong></em>-86d0-6bd187905cc8</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The category type.</p>
         * 
         * <strong>example:</strong>
         * <p>Ticket</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCategoriesRequest build() {
            return new ListCategoriesRequest(this);
        } 

    } 

}
