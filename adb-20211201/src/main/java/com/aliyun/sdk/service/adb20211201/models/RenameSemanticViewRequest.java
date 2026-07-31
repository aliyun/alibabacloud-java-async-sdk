// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link RenameSemanticViewRequest} extends {@link RequestModel}
 *
 * <p>RenameSemanticViewRequest</p>
 */
public class RenameSemanticViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newSchemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newViewName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldSchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oldSchemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oldViewName;

    private RenameSemanticViewRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.newSchemaName = builder.newSchemaName;
        this.newViewName = builder.newViewName;
        this.oldSchemaName = builder.oldSchemaName;
        this.oldViewName = builder.oldViewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameSemanticViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return newSchemaName
     */
    public String getNewSchemaName() {
        return this.newSchemaName;
    }

    /**
     * @return newViewName
     */
    public String getNewViewName() {
        return this.newViewName;
    }

    /**
     * @return oldSchemaName
     */
    public String getOldSchemaName() {
        return this.oldSchemaName;
    }

    /**
     * @return oldViewName
     */
    public String getOldViewName() {
        return this.oldViewName;
    }

    public static final class Builder extends Request.Builder<RenameSemanticViewRequest, Builder> {
        private String DBClusterId; 
        private String newSchemaName; 
        private String newViewName; 
        private String oldSchemaName; 
        private String oldViewName; 

        private Builder() {
            super();
        } 

        private Builder(RenameSemanticViewRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.newSchemaName = request.newSchemaName;
            this.newViewName = request.newViewName;
            this.oldSchemaName = request.oldSchemaName;
            this.oldViewName = request.oldViewName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1u8c0mgfg58****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_sv</p>
         */
        public Builder newSchemaName(String newSchemaName) {
            this.putQueryParameter("NewSchemaName", newSchemaName);
            this.newSchemaName = newSchemaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new_sv_name</p>
         */
        public Builder newViewName(String newViewName) {
            this.putQueryParameter("NewViewName", newViewName);
            this.newViewName = newViewName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_sv_old</p>
         */
        public Builder oldSchemaName(String oldSchemaName) {
            this.putQueryParameter("OldSchemaName", oldSchemaName);
            this.oldSchemaName = oldSchemaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>old_sv_name</p>
         */
        public Builder oldViewName(String oldViewName) {
            this.putQueryParameter("OldViewName", oldViewName);
            this.oldViewName = oldViewName;
            return this;
        }

        @Override
        public RenameSemanticViewRequest build() {
            return new RenameSemanticViewRequest(this);
        } 

    } 

}
