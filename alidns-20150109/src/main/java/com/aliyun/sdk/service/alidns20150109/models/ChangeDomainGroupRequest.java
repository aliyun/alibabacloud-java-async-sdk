// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeDomainGroupRequest</p>
 */
public class ChangeDomainGroupRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private ChangeDomainGroupRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDomainGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ChangeDomainGroupRequest, Builder> {
        private String domainName; 
        private String groupId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ChangeDomainGroupRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.lang = request.lang;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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

        @Override
        public ChangeDomainGroupRequest build() {
            return new ChangeDomainGroupRequest(this);
        } 

    } 

}
