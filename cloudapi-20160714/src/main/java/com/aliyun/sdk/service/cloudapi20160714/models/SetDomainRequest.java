// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRequest</p>
 */
public class SetDomainRequest extends Request {
    @Query
    @NameInMap("BindStageName")
    private String bindStageName;

    @Query
    @NameInMap("CustomDomainType")
    private String customDomainType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IsForce")
    private Boolean isForce;

    @Query
    @NameInMap("IsHttpRedirectToHttps")
    private Boolean isHttpRedirectToHttps;

    private SetDomainRequest(Builder builder) {
        super(builder);
        this.bindStageName = builder.bindStageName;
        this.customDomainType = builder.customDomainType;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.isForce = builder.isForce;
        this.isHttpRedirectToHttps = builder.isHttpRedirectToHttps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindStageName
     */
    public String getBindStageName() {
        return this.bindStageName;
    }

    /**
     * @return customDomainType
     */
    public String getCustomDomainType() {
        return this.customDomainType;
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
     * @return isForce
     */
    public Boolean getIsForce() {
        return this.isForce;
    }

    /**
     * @return isHttpRedirectToHttps
     */
    public Boolean getIsHttpRedirectToHttps() {
        return this.isHttpRedirectToHttps;
    }

    public static final class Builder extends Request.Builder<SetDomainRequest, Builder> {
        private String bindStageName; 
        private String customDomainType; 
        private String domainName; 
        private String groupId; 
        private Boolean isForce; 
        private Boolean isHttpRedirectToHttps; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRequest request) {
            super(request);
            this.bindStageName = request.bindStageName;
            this.customDomainType = request.customDomainType;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.isForce = request.isForce;
            this.isHttpRedirectToHttps = request.isHttpRedirectToHttps;
        } 

        /**
         * BindStageName.
         */
        public Builder bindStageName(String bindStageName) {
            this.putQueryParameter("BindStageName", bindStageName);
            this.bindStageName = bindStageName;
            return this;
        }

        /**
         * CustomDomainType.
         */
        public Builder customDomainType(String customDomainType) {
            this.putQueryParameter("CustomDomainType", customDomainType);
            this.customDomainType = customDomainType;
            return this;
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
         * IsForce.
         */
        public Builder isForce(Boolean isForce) {
            this.putQueryParameter("IsForce", isForce);
            this.isForce = isForce;
            return this;
        }

        /**
         * IsHttpRedirectToHttps.
         */
        public Builder isHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
            this.putQueryParameter("IsHttpRedirectToHttps", isHttpRedirectToHttps);
            this.isHttpRedirectToHttps = isHttpRedirectToHttps;
            return this;
        }

        @Override
        public SetDomainRequest build() {
            return new SetDomainRequest(this);
        } 

    } 

}
