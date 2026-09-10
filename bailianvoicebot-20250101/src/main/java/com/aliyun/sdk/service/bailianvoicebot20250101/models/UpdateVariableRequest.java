// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link UpdateVariableRequest} extends {@link RequestModel}
 *
 * <p>UpdateVariableRequest</p>
 */
public class UpdateVariableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VariableId")
    private String variableId;

    private UpdateVariableRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVariableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<UpdateVariableRequest, Builder> {
        private String businessUnitId; 
        private String description; 
        private String displayName; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVariableRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.description = request.description;
            this.displayName = request.displayName;
            this.variableId = request.variableId;
        } 

        /**
         * <p>The ID of the Model Studio business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-0rxabdztx7rsdi7n</p>
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>用户当前年龄</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        public Builder variableId(String variableId) {
            this.putBodyParameter("VariableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public UpdateVariableRequest build() {
            return new UpdateVariableRequest(this);
        } 

    } 

}
