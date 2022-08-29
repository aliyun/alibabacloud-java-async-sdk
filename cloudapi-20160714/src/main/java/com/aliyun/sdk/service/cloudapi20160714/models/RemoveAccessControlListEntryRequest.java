// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAccessControlListEntryRequest} extends {@link RequestModel}
 *
 * <p>RemoveAccessControlListEntryRequest</p>
 */
public class RemoveAccessControlListEntryRequest extends Request {
    @Query
    @NameInMap("AclEntrys")
    private String aclEntrys;

    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    private RemoveAccessControlListEntryRequest(Builder builder) {
        super(builder);
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAccessControlListEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntrys
     */
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    public static final class Builder extends Request.Builder<RemoveAccessControlListEntryRequest, Builder> {
        private String aclEntrys; 
        private String aclId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAccessControlListEntryRequest request) {
            super(request);
            this.aclEntrys = request.aclEntrys;
            this.aclId = request.aclId;
        } 

        /**
         * AclEntrys.
         */
        public Builder aclEntrys(String aclEntrys) {
            this.putQueryParameter("AclEntrys", aclEntrys);
            this.aclEntrys = aclEntrys;
            return this;
        }

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        @Override
        public RemoveAccessControlListEntryRequest build() {
            return new RemoveAccessControlListEntryRequest(this);
        } 

    } 

}
