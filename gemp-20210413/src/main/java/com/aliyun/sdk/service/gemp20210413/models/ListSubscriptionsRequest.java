// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionsRequest</p>
 */
public class ListSubscriptionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notFilterScopeObjectDeleted")
    private Boolean notFilterScopeObjectDeleted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyObject")
    private String notifyObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyObjectType")
    private String notifyObjectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scopeObject")
    private String scopeObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionTitle")
    private String subscriptionTitle;

    private ListSubscriptionsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.notFilterScopeObjectDeleted = builder.notFilterScopeObjectDeleted;
        this.notifyObject = builder.notifyObject;
        this.notifyObjectType = builder.notifyObjectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scope = builder.scope;
        this.scopeObject = builder.scopeObject;
        this.subscriptionTitle = builder.subscriptionTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return notFilterScopeObjectDeleted
     */
    public Boolean getNotFilterScopeObjectDeleted() {
        return this.notFilterScopeObjectDeleted;
    }

    /**
     * @return notifyObject
     */
    public String getNotifyObject() {
        return this.notifyObject;
    }

    /**
     * @return notifyObjectType
     */
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return scopeObject
     */
    public String getScopeObject() {
        return this.scopeObject;
    }

    /**
     * @return subscriptionTitle
     */
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public static final class Builder extends Request.Builder<ListSubscriptionsRequest, Builder> {
        private String clientToken; 
        private Boolean notFilterScopeObjectDeleted; 
        private String notifyObject; 
        private String notifyObjectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scope; 
        private String scopeObject; 
        private String subscriptionTitle; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscriptionsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.notFilterScopeObjectDeleted = request.notFilterScopeObjectDeleted;
            this.notifyObject = request.notifyObject;
            this.notifyObjectType = request.notifyObjectType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scope = request.scope;
            this.scopeObject = request.scopeObject;
            this.subscriptionTitle = request.subscriptionTitle;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * notFilterScopeObjectDeleted.
         */
        public Builder notFilterScopeObjectDeleted(Boolean notFilterScopeObjectDeleted) {
            this.putBodyParameter("notFilterScopeObjectDeleted", notFilterScopeObjectDeleted);
            this.notFilterScopeObjectDeleted = notFilterScopeObjectDeleted;
            return this;
        }

        /**
         * notifyObject.
         */
        public Builder notifyObject(String notifyObject) {
            this.putBodyParameter("notifyObject", notifyObject);
            this.notifyObject = notifyObject;
            return this;
        }

        /**
         * notifyObjectType.
         */
        public Builder notifyObjectType(String notifyObjectType) {
            this.putBodyParameter("notifyObjectType", notifyObjectType);
            this.notifyObjectType = notifyObjectType;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * scopeObject.
         */
        public Builder scopeObject(String scopeObject) {
            this.putBodyParameter("scopeObject", scopeObject);
            this.scopeObject = scopeObject;
            return this;
        }

        /**
         * subscriptionTitle.
         */
        public Builder subscriptionTitle(String subscriptionTitle) {
            this.putBodyParameter("subscriptionTitle", subscriptionTitle);
            this.subscriptionTitle = subscriptionTitle;
            return this;
        }

        @Override
        public ListSubscriptionsRequest build() {
            return new ListSubscriptionsRequest(this);
        } 

    } 

}
