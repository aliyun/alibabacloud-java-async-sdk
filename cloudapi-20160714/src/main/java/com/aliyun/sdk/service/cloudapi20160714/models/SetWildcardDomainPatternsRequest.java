// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWildcardDomainPatternsRequest} extends {@link RequestModel}
 *
 * <p>SetWildcardDomainPatternsRequest</p>
 */
public class SetWildcardDomainPatternsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("WildcardDomainPatterns")
    private String wildcardDomainPatterns;

    private SetWildcardDomainPatternsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.wildcardDomainPatterns = builder.wildcardDomainPatterns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWildcardDomainPatternsRequest create() {
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
     * @return wildcardDomainPatterns
     */
    public String getWildcardDomainPatterns() {
        return this.wildcardDomainPatterns;
    }

    public static final class Builder extends Request.Builder<SetWildcardDomainPatternsRequest, Builder> {
        private String domainName; 
        private String groupId; 
        private String wildcardDomainPatterns; 

        private Builder() {
            super();
        } 

        private Builder(SetWildcardDomainPatternsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.wildcardDomainPatterns = request.wildcardDomainPatterns;
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
         * WildcardDomainPatterns.
         */
        public Builder wildcardDomainPatterns(String wildcardDomainPatterns) {
            this.putQueryParameter("WildcardDomainPatterns", wildcardDomainPatterns);
            this.wildcardDomainPatterns = wildcardDomainPatterns;
            return this;
        }

        @Override
        public SetWildcardDomainPatternsRequest build() {
            return new SetWildcardDomainPatternsRequest(this);
        } 

    } 

}
