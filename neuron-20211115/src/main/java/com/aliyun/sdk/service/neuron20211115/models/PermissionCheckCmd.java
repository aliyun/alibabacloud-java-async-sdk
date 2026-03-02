// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PermissionCheckCmd} extends {@link TeaModel}
 *
 * <p>PermissionCheckCmd</p>
 */
public class PermissionCheckCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.NameInMap("operatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorId;

    @com.aliyun.core.annotation.NameInMap("operatorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorType;

    @com.aliyun.core.annotation.NameInMap("resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    private PermissionCheckCmd(Builder builder) {
        this.action = builder.action;
        this.operatorId = builder.operatorId;
        this.operatorType = builder.operatorType;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PermissionCheckCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder {
        private String action; 
        private String operatorId; 
        private String operatorType; 
        private String resource; 

        private Builder() {
        } 

        private Builder(PermissionCheckCmd model) {
            this.action = model.action;
            this.operatorId = model.operatorId;
            this.operatorType = model.operatorType;
            this.resource = model.resource;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>write</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>developer</p>
         */
        public Builder operatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>neuron:catalog:company/1:pbc/2</p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        public PermissionCheckCmd build() {
            return new PermissionCheckCmd(this);
        } 

    } 

}
