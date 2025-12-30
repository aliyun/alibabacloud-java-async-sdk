// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ChatBIConfigQueryTablesRequest} extends {@link RequestModel}
 *
 * <p>ChatBIConfigQueryTablesRequest</p>
 */
public class ChatBIConfigQueryTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputField")
    private String inputField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    private ChatBIConfigQueryTablesRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.inputField = builder.inputField;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIConfigQueryTablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return inputField
     */
    public String getInputField() {
        return this.inputField;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<ChatBIConfigQueryTablesRequest, Builder> {
        private String dbName; 
        private String inputField; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIConfigQueryTablesRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.inputField = request.inputField;
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * InputField.
         */
        public Builder inputField(String inputField) {
            this.putQueryParameter("InputField", inputField);
            this.inputField = inputField;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public ChatBIConfigQueryTablesRequest build() {
            return new ChatBIConfigQueryTablesRequest(this);
        } 

    } 

}
