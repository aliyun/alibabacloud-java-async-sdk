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
    @ParentIgnore("AccessControlPolicy")
    @NameInMap("Owner")
    private Owner owner;

    @ParentIgnore("AccessControlPolicy,AccessControlList")
    @NameInMap("Grant")
    private ObjectACL ACL;


    private GetObjectAclResponseBody(Builder builder) {
        this.owner = builder.owner;
        this.ACL = builder.ACL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return owner
     */
    public Owner owner() {
        return this.owner;
    }

    /**
     * @return ACL
     */
    public ObjectACL ACL() {
        return this.ACL;
    }

    public static final class Builder {
        private Owner owner; 
        private ObjectACL ACL; 

        /**
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>Grant.</p>
         */
        public Builder ACL(ObjectACL ACL) {
            this.ACL = ACL;
            return this;
        }

        public GetObjectAclResponseBody build() {
            return new GetObjectAclResponseBody(this);
        } 

    } 

}
