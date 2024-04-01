// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiMarketInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiMarketInstanceAttributeRequest</p>
 */
public class ModifyApiMarketInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private String aliUid;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceAttributes")
    @Validation(required = true)
    private String instanceAttributes;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyApiMarketInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.groupId = builder.groupId;
        this.instanceAttributes = builder.instanceAttributes;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiMarketInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceAttributes
     */
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyApiMarketInstanceAttributeRequest, Builder> {
        private String aliUid; 
        private String groupId; 
        private String instanceAttributes; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiMarketInstanceAttributeRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.groupId = request.groupId;
            this.instanceAttributes = request.instanceAttributes;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
         * InstanceAttributes.
         */
        public Builder instanceAttributes(String instanceAttributes) {
            this.putQueryParameter("InstanceAttributes", instanceAttributes);
            this.instanceAttributes = instanceAttributes;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ModifyApiMarketInstanceAttributeRequest build() {
            return new ModifyApiMarketInstanceAttributeRequest(this);
        } 

    } 

}
