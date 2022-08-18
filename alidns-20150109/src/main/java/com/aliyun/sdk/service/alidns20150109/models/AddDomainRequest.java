// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDomainRequest</p>
 */
public class AddDomainRequest extends Request {
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

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AddDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainRequest create() {
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<AddDomainRequest, Builder> {
        private String domainName; 
        private String groupId; 
        private String lang; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.resourceGroupId = request.resourceGroupId;
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

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public AddDomainRequest build() {
            return new AddDomainRequest(this);
        } 

    } 

}
