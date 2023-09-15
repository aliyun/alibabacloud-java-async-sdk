// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainGroupListRequest</p>
 */
public class QueryDomainGroupListRequest extends Request {
    @Query
    @NameInMap("DomainGroupName")
    private String domainGroupName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ShowDeletingGroup")
    private Boolean showDeletingGroup;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainGroupListRequest(Builder builder) {
        super(builder);
        this.domainGroupName = builder.domainGroupName;
        this.lang = builder.lang;
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
        private Boolean showDeletingGroup; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainGroupListRequest request) {
            super(request);
            this.domainGroupName = request.domainGroupName;
            this.lang = request.lang;
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
