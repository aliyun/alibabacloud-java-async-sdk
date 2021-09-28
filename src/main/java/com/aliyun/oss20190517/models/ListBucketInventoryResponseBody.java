// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListBucketInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketInventoryResponseBody</p>
 */
public class ListBucketInventoryResponseBody extends TeaModel {
    @ParentIgnore("ListInventoryConfigurationsResult")
    @NameInMap("InventoryConfiguration")
    private java.util.List < InventoryConfiguration > inventoryConfigurations;

    @ParentIgnore("ListInventoryConfigurationsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListInventoryConfigurationsResult")
    @NameInMap("NextContinuationToken")
    private String nextContinuationToken;


    private ListBucketInventoryResponseBody(Builder builder) {
        this.inventoryConfigurations = builder.inventoryConfigurations;
        this.isTruncated = builder.isTruncated;
        this.nextContinuationToken = builder.nextContinuationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketInventoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return inventoryConfigurations
     */
    public java.util.List < InventoryConfiguration > inventoryConfigurations() {
        return this.inventoryConfigurations;
    }

    /**
     * @return isTruncated
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextContinuationToken
     */
    public String nextContinuationToken() {
        return this.nextContinuationToken;
    }

    public static final class Builder {
        private java.util.List < InventoryConfiguration > inventoryConfigurations; 
        private Boolean isTruncated; 
        private String nextContinuationToken; 

        /**
         * <p>InventoryConfiguration.</p>
         */
        public Builder inventoryConfigurations(java.util.List < InventoryConfiguration > inventoryConfigurations) {
            this.inventoryConfigurations = inventoryConfigurations;
            return this;
        }

        /**
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>NextContinuationToken.</p>
         */
        public Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
            return this;
        }

        public ListBucketInventoryResponseBody build() {
            return new ListBucketInventoryResponseBody(this);
        } 

    } 

}
