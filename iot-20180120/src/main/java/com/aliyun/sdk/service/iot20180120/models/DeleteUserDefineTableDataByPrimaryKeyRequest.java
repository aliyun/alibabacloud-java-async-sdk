// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeleteUserDefineTableDataByPrimaryKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserDefineTableDataByPrimaryKeyRequest</p>
 */
public class DeleteUserDefineTableDataByPrimaryKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdentifier;

    private DeleteUserDefineTableDataByPrimaryKeyRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.iotInstanceId = builder.iotInstanceId;
        this.tableIdentifier = builder.tableIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDefineTableDataByPrimaryKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return tableIdentifier
     */
    public String getTableIdentifier() {
        return this.tableIdentifier;
    }

    public static final class Builder extends Request.Builder<DeleteUserDefineTableDataByPrimaryKeyRequest, Builder> {
        private java.util.Map<String, ?> conditions; 
        private String iotInstanceId; 
        private String tableIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserDefineTableDataByPrimaryKeyRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.iotInstanceId = request.iotInstanceId;
            this.tableIdentifier = request.tableIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder conditions(java.util.Map<String, ?> conditions) {
            String conditionsShrink = shrink(conditions, "Conditions", "json");
            this.putQueryParameter("Conditions", conditionsShrink);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableIdentifier(String tableIdentifier) {
            this.putQueryParameter("TableIdentifier", tableIdentifier);
            this.tableIdentifier = tableIdentifier;
            return this;
        }

        @Override
        public DeleteUserDefineTableDataByPrimaryKeyRequest build() {
            return new DeleteUserDefineTableDataByPrimaryKeyRequest(this);
        } 

    } 

}
