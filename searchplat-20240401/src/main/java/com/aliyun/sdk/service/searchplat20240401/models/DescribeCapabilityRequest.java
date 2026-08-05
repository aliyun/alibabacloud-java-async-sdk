// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link DescribeCapabilityRequest} extends {@link RequestModel}
 *
 * <p>DescribeCapabilityRequest</p>
 */
public class DescribeCapabilityRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemCategory;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemName;

    private DescribeCapabilityRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.itemCategory = builder.itemCategory;
        this.itemName = builder.itemName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapabilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return itemCategory
     */
    public String getItemCategory() {
        return this.itemCategory;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    public static final class Builder extends Request.Builder<DescribeCapabilityRequest, Builder> {
        private String workspaceName; 
        private String itemCategory; 
        private String itemName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCapabilityRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.itemCategory = request.itemCategory;
            this.itemName = request.itemName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ai_search_agent</p>
         */
        public Builder itemCategory(String itemCategory) {
            this.putPathParameter("itemCategory", itemCategory);
            this.itemCategory = itemCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es_knowledge_base</p>
         */
        public Builder itemName(String itemName) {
            this.putPathParameter("itemName", itemName);
            this.itemName = itemName;
            return this;
        }

        @Override
        public DescribeCapabilityRequest build() {
            return new DescribeCapabilityRequest(this);
        } 

    } 

}
