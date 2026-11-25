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
         * <p>The detailed reason for the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The capacity information of each storage medium.</p>
         */
        public Builder capacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
            this.capacityByDiskCategory = capacityByDiskCategory;
            return this;
        }

        /**
         * <p>The capacity information of the multi-zone instance.
         * {&quot;ZoneId&quot;:{&quot;CapacityByDiskCategory&quot;:{...},&quot;UsageByDiskCategory&quot;:{...}}}</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;cn-hangzhou-i&quot;: {
         *       &quot;diskTypeCapacity&quot;: [
         *         {
         *           &quot;mode&quot;: &quot;CLOUD_STORAGE&quot;,
         *           &quot;perfLevel&quot;: &quot;PL1&quot;,
         *           &quot;usedCapacity&quot;: 0,
         *           &quot;category&quot;: &quot;PERF_CLOUD_ESSD_PL1&quot;,
         *           &quot;capacity&quot;: 4000
         *         }
         *       ],
         *       &quot;diskTypeUsage&quot;: [
         *         {
         *           &quot;usedLindormColumn3&quot;: 688935,
         *           &quot;usedLindormTable&quot;: 1086288931872,
         *           &quot;usedLindormTsdb&quot;: 0,
         *           &quot;usedOther&quot;: 0,
         *           &quot;usedLindormMessage3&quot;: 0,
         *           &quot;diskType&quot;: &quot;PerformanceCloudStorage&quot;,
         *           &quot;used&quot;: 1719816329046,
         *           &quot;usedLindormSearch3&quot;: 36339905446,
         *           &quot;usedLindormSpark&quot;: 2131936938,
         *           &quot;capacity&quot;: 4294967296000,
         *           &quot;usedLindormSearch&quot;: 0,
         *           &quot;usedLindormVector3&quot;: 595054865855
         *         }
         *       ]
         *     }
         *   }</p>
         */
        public Builder instanceStorageZoneMap(java.util.Map<String, ?> instanceStorageZoneMap) {
            this.instanceStorageZoneMap = instanceStorageZoneMap;
            return this;
        }

        /**
         * <p>The ID of the request. It is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>BDDB1954-002B-4249-B2DF-2CDDA0259668</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The usage information of each storage medium.</p>
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
