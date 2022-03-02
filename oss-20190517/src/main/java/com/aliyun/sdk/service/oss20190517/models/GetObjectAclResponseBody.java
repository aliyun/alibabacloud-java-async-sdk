// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetObjectAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetObjectAclResponseBody</p>
 */
public class GetObjectAclResponseBody extends TeaModel {
    @ParentIgnore("AccessControlPolicy,AccessControlList")
    @NameInMap("Grant")
    private String ACL;

    @ParentIgnore("AccessControlPolicy")
    @NameInMap("Owner")
    private Owner owner;

    private GetObjectAclResponseBody(Builder builder) {
        this.ACL = builder.ACL;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return ACL
     */
    public String getACL() {
        return this.ACL;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    public static final class Builder {
        private String ACL; 
        private Owner owner; 

        /**
         * Grant.
         */
        public Builder ACL(String ACL) {
            this.ACL = ACL;
            return this;
        }

        /**
         * Grant.
         */
        public Builder ACL(ObjectACL ACL) {
            this.ACL = ACL.getValue();
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public GetObjectAclResponseBody build() {
            return new GetObjectAclResponseBody(this);
        } 

    } 

}
