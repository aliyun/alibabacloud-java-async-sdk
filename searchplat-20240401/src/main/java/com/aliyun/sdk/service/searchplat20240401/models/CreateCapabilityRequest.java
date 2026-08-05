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
 * {@link CreateCapabilityRequest} extends {@link RequestModel}
 *
 * <p>CreateCapabilityRequest</p>
 */
public class CreateCapabilityRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemDesc")
    private String itemDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemName")
    private String itemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemValue")
    private java.util.Map<String, ?> itemValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateCapabilityRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.itemCategory = builder.itemCategory;
        this.itemDesc = builder.itemDesc;
        this.itemName = builder.itemName;
        this.itemValue = builder.itemValue;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapabilityRequest create() {
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
     * @return itemDesc
     */
    public String getItemDesc() {
        return this.itemDesc;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return itemValue
     */
    public java.util.Map<String, ?> getItemValue() {
        return this.itemValue;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateCapabilityRequest, Builder> {
        private String workspaceName; 
        private String itemCategory; 
        private String itemDesc; 
        private String itemName; 
        private java.util.Map<String, ?> itemValue; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateCapabilityRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.itemCategory = request.itemCategory;
            this.itemDesc = request.itemDesc;
            this.itemName = request.itemName;
            this.itemValue = request.itemValue;
            this.dryRun = request.dryRun;
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
         * itemDesc.
         */
        public Builder itemDesc(String itemDesc) {
            this.putBodyParameter("itemDesc", itemDesc);
            this.itemDesc = itemDesc;
            return this;
        }

        /**
         * itemName.
         */
        public Builder itemName(String itemName) {
            this.putBodyParameter("itemName", itemName);
            this.itemName = itemName;
            return this;
        }

        /**
         * itemValue.
         */
        public Builder itemValue(java.util.Map<String, ?> itemValue) {
            this.putBodyParameter("itemValue", itemValue);
            this.itemValue = itemValue;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateCapabilityRequest build() {
            return new CreateCapabilityRequest(this);
        } 

    } 

}
