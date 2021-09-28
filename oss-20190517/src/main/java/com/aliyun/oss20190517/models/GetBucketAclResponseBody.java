// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketAclResponseBody</p>
 */
public class GetBucketAclResponseBody extends TeaModel {
    @ParentIgnore("AccessControlPolicy")
    @NameInMap("Owner")
    private Owner owner;

    @ParentIgnore("AccessControlPolicy")
    @NameInMap("AccessControlList")
    private AccessControlList accessControlList;


    private GetBucketAclResponseBody(Builder builder) {
        this.owner = builder.owner;
        this.accessControlList = builder.accessControlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return owner
     */
    public Owner owner() {
        return this.owner;
    }

    /**
     * @return accessControlList
     */
    public AccessControlList accessControlList() {
        return this.accessControlList;
    }

    public static final class Builder {
        private Owner owner; 
        private AccessControlList accessControlList; 

        /**
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>AccessControlList.</p>
         */
        public Builder accessControlList(AccessControlList accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }

        public GetBucketAclResponseBody build() {
            return new GetBucketAclResponseBody(this);
        } 

    } 

    public static class AccessControlList extends TeaModel {
        @NameInMap("Grant")
        private BucketACL grant;


        private AccessControlList(Builder builder) {
            this.grant = builder.grant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessControlList create() {
            return builder().build();
        }

        /**
         * @return grant
         */
        public BucketACL grant() {
            return this.grant;
        }

        public static final class Builder {
            private BucketACL grant; 

            /**
             * <p>Grant.</p>
             */
            public Builder grant(BucketACL grant) {
                this.grant = grant;
                return this;
            }

            public AccessControlList build() {
                return new AccessControlList(this);
            } 

        } 

    }
}
