// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>SaveDomainGroupRequest</p>
 */
public class SaveDomainGroupRequest extends Request {
    @Query
    @NameInMap("DomainGroupId")
    private Long domainGroupId;

    @Query
    @NameInMap("DomainGroupName")
    private String domainGroupName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveDomainGroupRequest(Builder builder) {
        super(builder);
        this.domainGroupId = builder.domainGroupId;
        this.domainGroupName = builder.domainGroupName;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveDomainGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainGroupId
     */
    public Long getDomainGroupId() {
        return this.domainGroupId;
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveDomainGroupRequest, Builder> {
        private Long domainGroupId; 
        private String domainGroupName; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveDomainGroupRequest request) {
            super(request);
            this.domainGroupId = request.domainGroupId;
            this.domainGroupName = request.domainGroupName;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainGroupId.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveDomainGroupRequest build() {
            return new SaveDomainGroupRequest(this);
        } 

    } 

}
