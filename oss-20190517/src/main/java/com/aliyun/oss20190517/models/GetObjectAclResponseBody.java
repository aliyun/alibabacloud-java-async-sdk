// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetObjectAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetObjectAclResponseBody</p>
 */
public class GetObjectAclResponseBody extends TeaModel {
    @ParentIgnore("AccessControlPolicy,AccessControlList")
    @NameInMap("Grant")
    private ObjectACL ACL;

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
    public ObjectACL getACL() {
        return this.ACL;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    public static final class Builder {
        private ObjectACL ACL; 
        private Owner owner; 

        /**
         * <p>Grant.</p>
         */
        public Builder ACL(ObjectACL ACL) {
            this.ACL = ACL;
            return this;
        }

        /**
         * <p>Owner.</p>
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
