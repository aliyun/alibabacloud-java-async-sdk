// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnDomainBizInfoRequest} extends {@link RequestModel}
 *
 * <p>SetScdnDomainBizInfoRequest</p>
 */
public class SetScdnDomainBizInfoRequest extends Request {
    @Query
    @NameInMap("BizName")
    @Validation(required = true)
    private String bizName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetScdnDomainBizInfoRequest(Builder builder) {
        super(builder);
        this.bizName = builder.bizName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScdnDomainBizInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetScdnDomainBizInfoRequest, Builder> {
        private String bizName; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetScdnDomainBizInfoRequest response) {
            super(response);
            this.bizName = response.bizName;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
        } 

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putQueryParameter("BizName", bizName);
            this.bizName = bizName;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetScdnDomainBizInfoRequest build() {
            return new SetScdnDomainBizInfoRequest(this);
        } 

    } 

}
