// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketsResponseBody</p>
 */
public class ListBucketsResponseBody extends TeaModel {
    @ParentIgnore("ListAllMyBucketsResult,Buckets")
    @NameInMap("Bucket")
    private java.util.List < Bucket > buckets;

    @ParentIgnore("ListAllMyBucketsResult")
    @NameInMap("Owner")
    private Owner owner;


    private ListBucketsResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return buckets
     */
    public java.util.List < Bucket > getBuckets() {
        return this.buckets;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    public static final class Builder {
        private java.util.List < Bucket > buckets; 
        private Owner owner; 

        /**
         * <p>Bucket.</p>
         */
        public Builder buckets(java.util.List < Bucket > buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public ListBucketsResponseBody build() {
            return new ListBucketsResponseBody(this);
        } 

    } 

}
