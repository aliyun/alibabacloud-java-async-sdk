// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainGroupRequest</p>
 */
public class DeleteDomainGroupRequest extends Request {
    @Query
    @NameInMap("DomainGroupId")
    @Validation(required = true)
    private Long domainGroupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private DeleteDomainGroupRequest(Builder builder) {
        super(builder);
        this.domainGroupId = builder.domainGroupId;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDomainGroupRequest, Builder> {
        private Long domainGroupId; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainGroupRequest request) {
            super(request);
            this.domainGroupId = request.domainGroupId;
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
        public DeleteDomainGroupRequest build() {
            return new DeleteDomainGroupRequest(this);
        } 

    } 

}
