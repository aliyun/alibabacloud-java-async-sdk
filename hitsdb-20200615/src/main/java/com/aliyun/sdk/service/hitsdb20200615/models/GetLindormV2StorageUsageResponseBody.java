// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLindormV2StorageUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormV2StorageUsageResponseBody</p>
 */
public class GetLindormV2StorageUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CapacityByDiskCategory")
    private java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

    @com.aliyun.core.annotation.NameInMap("InstanceStorageZoneMap")
    private java.util.Map<String, ?> instanceStorageZoneMap;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageByDiskCategory")
    private java.util.List<java.util.Map<String, ?>> usageByDiskCategory;

    private GetLindormV2StorageUsageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.capacityByDiskCategory = builder.capacityByDiskCategory;
        this.instanceStorageZoneMap = builder.instanceStorageZoneMap;
        this.requestId = builder.requestId;
        this.usageByDiskCategory = builder.usageByDiskCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormV2StorageUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return capacityByDiskCategory
     */
    public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
        return this.capacityByDiskCategory;
    }

    /**
     * @return instanceStorageZoneMap
     */
    public java.util.Map<String, ?> getInstanceStorageZoneMap() {
        return this.instanceStorageZoneMap;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageByDiskCategory
     */
    public java.util.List<java.util.Map<String, ?>> getUsageByDiskCategory() {
        return this.usageByDiskCategory;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<java.util.Map<String, ?>> capacityByDiskCategory; 
        private java.util.Map<String, ?> instanceStorageZoneMap; 
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> usageByDiskCategory; 

        private Builder() {
        } 

        private Builder(GetLindormV2StorageUsageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.capacityByDiskCategory = model.capacityByDiskCategory;
            this.instanceStorageZoneMap = model.instanceStorageZoneMap;
            this.requestId = model.requestId;
            this.usageByDiskCategory = model.usageByDiskCategory;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * CapacityByDiskCategory.
         */
        public Builder capacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
            this.capacityByDiskCategory = capacityByDiskCategory;
            return this;
        }

        /**
         * InstanceStorageZoneMap.
         */
        public Builder instanceStorageZoneMap(java.util.Map<String, ?> instanceStorageZoneMap) {
            this.instanceStorageZoneMap = instanceStorageZoneMap;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageByDiskCategory.
         */
        public Builder usageByDiskCategory(java.util.List<java.util.Map<String, ?>> usageByDiskCategory) {
            this.usageByDiskCategory = usageByDiskCategory;
            return this;
        }

        public GetLindormV2StorageUsageResponseBody build() {
            return new GetLindormV2StorageUsageResponseBody(this);
        } 

    } 

}
