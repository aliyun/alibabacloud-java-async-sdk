// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionsRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionsRequest</p>
 */
public class ListSubscriptionsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("notifyObject")
    private String notifyObject;

    @Body
    @NameInMap("notifyObjectType")
    private String notifyObjectType;

    @Body
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("scope")
    private String scope;

    @Body
    @NameInMap("scopeObject")
    private String scopeObject;

    @Body
    @NameInMap("subscriptionTitle")
    private String subscriptionTitle;

    private ListSubscriptionsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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

        private Builder(ListSubscriptionsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.notifyObject = response.notifyObject;
            this.notifyObjectType = response.notifyObjectType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.scope = response.scope;
            this.scopeObject = response.scopeObject;
            this.subscriptionTitle = response.subscriptionTitle;
        } 

        /**
         * ????????????
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder notifyObject(String notifyObject) {
            this.putBodyParameter("notifyObject", notifyObject);
            this.notifyObject = notifyObject;
            return this;
        }

        /**
         * ??????????????????notifyWhoType:0????????? 1??????
         */
        public Builder notifyObjectType(String notifyObjectType) {
            this.putBodyParameter("notifyObjectType", notifyObjectType);
            this.notifyObjectType = notifyObjectType;
            return this;
        }

        /**
         * ?????????
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ????????????
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ?????????????????? 0??????1??????2????????????
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder scopeObject(String scopeObject) {
            this.putBodyParameter("scopeObject", scopeObject);
            this.scopeObject = scopeObject;
            return this;
        }

        /**
         * ???????????????
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
