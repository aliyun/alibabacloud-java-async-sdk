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
 * {@link ListPermissionResourceForFrontRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionResourceForFrontRequest</p>
 */
public class ListPermissionResourceForFrontRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private String enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operatorType")
    private String operatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourcePrefix")
    private String resourcePrefix;

    private ListPermissionResourceForFrontRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.enterpriseId = builder.enterpriseId;
        this.operatorId = builder.operatorId;
        this.operatorType = builder.operatorType;
        this.queryType = builder.queryType;
        this.resourcePrefix = builder.resourcePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionResourceForFrontRequest create() {
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
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return this.enterpriseId;
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
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return resourcePrefix
     */
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

    public static final class Builder extends Request.Builder<ListPermissionResourceForFrontRequest, Builder> {
        private String action; 
        private String enterpriseId; 
        private String operatorId; 
        private String operatorType; 
        private String queryType; 
        private String resourcePrefix; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionResourceForFrontRequest request) {
            super(request);
            this.action = request.action;
            this.enterpriseId = request.enterpriseId;
            this.operatorId = request.operatorId;
            this.operatorType = request.operatorType;
            this.queryType = request.queryType;
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
         * enterpriseId.
         */
        public Builder enterpriseId(String enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
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
         * queryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("queryType", queryType);
            this.queryType = queryType;
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
        public ListPermissionResourceForFrontRequest build() {
            return new ListPermissionResourceForFrontRequest(this);
        } 

    } 

}
