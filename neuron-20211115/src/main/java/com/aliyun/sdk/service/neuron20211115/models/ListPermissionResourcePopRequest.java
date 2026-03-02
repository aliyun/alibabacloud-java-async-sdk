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
 * {@link ListPermissionResourcePopRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionResourcePopRequest</p>
 */
public class ListPermissionResourcePopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operatorType")
    private String operatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourcePrefix")
    private String resourcePrefix;

    private ListPermissionResourcePopRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.operatorId = builder.operatorId;
        this.operatorType = builder.operatorType;
        this.resourcePrefix = builder.resourcePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionResourcePopRequest create() {
        return builder().build();
    }

@Override
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
     * @return resourcePrefix
     */
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

    public static final class Builder extends Request.Builder<ListPermissionResourcePopRequest, Builder> {
        private String action; 
        private String operatorId; 
        private String operatorType; 
        private String resourcePrefix; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionResourcePopRequest request) {
            super(request);
            this.action = request.action;
            this.operatorId = request.operatorId;
            this.operatorType = request.operatorType;
            this.resourcePrefix = request.resourcePrefix;
        } 

        /**
         * action.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * operatorId.
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("operatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * operatorType.
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("operatorType", operatorType);
            this.operatorType = operatorType;
            return this;
        }

        /**
         * resourcePrefix.
         */
        public Builder resourcePrefix(String resourcePrefix) {
            this.putQueryParameter("resourcePrefix", resourcePrefix);
            this.resourcePrefix = resourcePrefix;
            return this;
        }

        @Override
        public ListPermissionResourcePopRequest build() {
            return new ListPermissionResourcePopRequest(this);
        } 

    } 

}
