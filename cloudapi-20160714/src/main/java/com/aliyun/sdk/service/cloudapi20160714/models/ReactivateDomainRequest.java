// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReactivateDomainRequest} extends {@link RequestModel}
 *
 * <p>ReactivateDomainRequest</p>
 */
public class ReactivateDomainRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private ReactivateDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactivateDomainRequest create() {
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

    public static final class Builder extends Request.Builder<ReactivateDomainRequest, Builder> {
        private String domainName; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(ReactivateDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.groupId = request.groupId;
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

        @Override
        public ReactivateDomainRequest build() {
            return new ReactivateDomainRequest(this);
        } 

    } 

}
