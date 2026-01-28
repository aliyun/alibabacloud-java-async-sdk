// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryDomainGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainGroupListRequest</p>
 */
public class QueryDomainGroupListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainGroupName")
    private String domainGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByType")
    private String orderByType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKeyType")
    private String orderKeyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDeletingGroup")
    private Boolean showDeletingGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainGroupListRequest(Builder builder) {
        super(builder);
        this.domainGroupName = builder.domainGroupName;
        this.lang = builder.lang;
        this.orderByType = builder.orderByType;
        this.orderKeyType = builder.orderKeyType;
        this.showDeletingGroup = builder.showDeletingGroup;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainGroupListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainGroupName
     */
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderByType
     */
    public String getOrderByType() {
        return this.orderByType;
    }

    /**
     * @return orderKeyType
     */
    public String getOrderKeyType() {
        return this.orderKeyType;
    }

    /**
     * @return showDeletingGroup
     */
    public Boolean getShowDeletingGroup() {
        return this.showDeletingGroup;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainGroupListRequest, Builder> {
        private String domainGroupName; 
        private String lang; 
        private String orderByType; 
        private String orderKeyType; 
        private Boolean showDeletingGroup; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainGroupListRequest request) {
            super(request);
            this.domainGroupName = request.domainGroupName;
            this.lang = request.lang;
            this.orderByType = request.orderByType;
            this.orderKeyType = request.orderKeyType;
            this.showDeletingGroup = request.showDeletingGroup;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainGroupName.
         */
        public Builder domainGroupName(String domainGroupName) {
            this.putQueryParameter("DomainGroupName", domainGroupName);
            this.domainGroupName = domainGroupName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OrderByType.
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * OrderKeyType.
         */
        public Builder orderKeyType(String orderKeyType) {
            this.putQueryParameter("OrderKeyType", orderKeyType);
            this.orderKeyType = orderKeyType;
            return this;
        }

        /**
         * ShowDeletingGroup.
         */
        public Builder showDeletingGroup(Boolean showDeletingGroup) {
            this.putQueryParameter("ShowDeletingGroup", showDeletingGroup);
            this.showDeletingGroup = showDeletingGroup;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryDomainGroupListRequest build() {
            return new QueryDomainGroupListRequest(this);
        } 

    } 

}
