// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    public java.util.List < InventoryConfiguration > getInventoryConfigurations() {
        return this.inventoryConfigurations;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextContinuationToken
     */
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public static final class Builder {
        private java.util.List < InventoryConfiguration > inventoryConfigurations; 
        private Boolean isTruncated; 
        private String nextContinuationToken; 

        /**
         * InventoryConfiguration.
         */
        public Builder inventoryConfigurations(java.util.List < InventoryConfiguration > inventoryConfigurations) {
            this.inventoryConfigurations = inventoryConfigurations;
            return this;
        }

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * NextContinuationToken.
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
