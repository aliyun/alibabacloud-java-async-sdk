// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowRequest</p>
 */
public class ModifyFlowRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Categories")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > categories;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    private ModifyFlowRequest(Builder builder) {
        super(builder);
        this.categories = builder.categories;
        this.custSpaceId = builder.custSpaceId;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public java.util.List < String > getCategories() {
        return this.categories;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    public static final class Builder extends Request.Builder<ModifyFlowRequest, Builder> {
        private java.util.List < String > categories; 
        private String custSpaceId; 
        private String flowId; 
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowRequest request) {
            super(request);
            this.categories = request.categories;
            this.custSpaceId = request.custSpaceId;
            this.flowId = request.flowId;
            this.flowName = request.flowName;
        } 

        /**
         * The categories of the Flow.
         */
        public Builder categories(java.util.List < String > categories) {
            String categoriesShrink = shrink(categories, "Categories", "json");
            this.putBodyParameter("Categories", categoriesShrink);
            this.categories = categories;
            return this;
        }

        /**
         * The space ID of the user within the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The Flow ID.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The name of the Flow.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        @Override
        public ModifyFlowRequest build() {
            return new ModifyFlowRequest(this);
        } 

    } 

}
