// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ListProtectedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProtectedResourcesResponseBody</p>
 */
public class ListProtectedResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtectedResources")
    private java.util.List<ProtectedResources> protectedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProtectedResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.protectedResources = builder.protectedResources;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectedResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protectedResources
     */
    public java.util.List<ProtectedResources> getProtectedResources() {
        return this.protectedResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private java.util.List<ProtectedResources> protectedResources; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProtectedResourcesResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.protectedResources = model.protectedResources;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The maximum number of results to return per query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The return message. A value of successful indicates success. If an error occurs, the corresponding error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJJ************MX0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of protected resources.</p>
         */
        public Builder protectedResources(java.util.List<ProtectedResources> protectedResources) {
            this.protectedResources = protectedResources;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB09****-<strong><strong>-</strong></strong>-****-********6C38</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of protected resources.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProtectedResourcesResponseBody build() {
            return new ListProtectedResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProtectedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedResourcesResponseBody</p>
     */
    public static class ProtectedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPlanCount")
        private Long backupPlanCount;

        @com.aliyun.core.annotation.NameInMap("CreatedByProduct")
        private String createdByProduct;

        @com.aliyun.core.annotation.NameInMap("ProtectedDataSize")
        private Long protectedDataSize;

        @com.aliyun.core.annotation.NameInMap("ProtectedResourceId")
        private String protectedResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private Long snapshotCount;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private ProtectedResources(Builder builder) {
            this.backupPlanCount = builder.backupPlanCount;
            this.createdByProduct = builder.createdByProduct;
            this.protectedDataSize = builder.protectedDataSize;
            this.protectedResourceId = builder.protectedResourceId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceRegionId = builder.resourceRegionId;
            this.snapshotCount = builder.snapshotCount;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectedResources create() {
            return builder().build();
        }

        /**
         * @return backupPlanCount
         */
        public Long getBackupPlanCount() {
            return this.backupPlanCount;
        }

        /**
         * @return createdByProduct
         */
        public String getCreatedByProduct() {
            return this.createdByProduct;
        }

        /**
         * @return protectedDataSize
         */
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        /**
         * @return protectedResourceId
         */
        public String getProtectedResourceId() {
            return this.protectedResourceId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return snapshotCount
         */
        public Long getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private Long backupPlanCount; 
            private String createdByProduct; 
            private Long protectedDataSize; 
            private String protectedResourceId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceRegionId; 
            private Long snapshotCount; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(ProtectedResources model) {
                this.backupPlanCount = model.backupPlanCount;
                this.createdByProduct = model.createdByProduct;
                this.protectedDataSize = model.protectedDataSize;
                this.protectedResourceId = model.protectedResourceId;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceRegionId = model.resourceRegionId;
                this.snapshotCount = model.snapshotCount;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The number of backup plans.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backupPlanCount(Long backupPlanCount) {
                this.backupPlanCount = backupPlanCount;
                return this;
            }

            /**
             * <p>The product capability to which the resource belongs. Valid values:</p>
             * <ul>
             * <li><strong>HBR</strong>: Cloud Backup standard capabilities.</li>
             * <li><strong>BASIC</strong>: ECS File Backup Essential Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder createdByProduct(String createdByProduct) {
                this.createdByProduct = createdByProduct;
                return this;
            }

            /**
             * <p>The protected data volume, in bytes. This parameter is supported only for ECS File Backup Essential Edition.</p>
             * <ul>
             * <li><strong>SourceType=ECS_FILE</strong>: the storage capacity of the backed-up block storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * <p>The ID of the protected resource.</p>
             * 
             * <strong>example:</strong>
             * <p>pr-0004************gs61</p>
             */
            public Builder protectedResourceId(String protectedResourceId) {
                this.protectedResourceId = protectedResourceId;
                return this;
            }

            /**
             * <p>The resource ID. The meaning of this parameter varies based on the value of SourceType:</p>
             * <ul>
             * <li><strong>SourceType=ECS_FILE</strong>: the ECS instance ID.</li>
             * <li><strong>SourceType=COMMON_FILE_SYSTEM</strong>: the CPFS data source ID.</li>
             * <li><strong>SourceType=COMMON_NAS</strong>: the on-premises NAS data source ID.</li>
             * <li><strong>SourceType=File</strong>: the on-premises server client ID.</li>
             * <li><strong>SourceType=NAS</strong>: the Alibaba Cloud NAS file system ID.</li>
             * <li><strong>SourceType=OSS</strong>: the OSS bucket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-wz95************7zrd</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The UID of the user to whom the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1024********0703</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The ID of the region to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The number of backup snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder snapshotCount(Long snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * <p>The type of backup feature. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: ECS file backup.</li>
             * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
             * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
             * <li><strong>File</strong>: On-premises file backup.</li>
             * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
             * <li><strong>OSS</strong>: OSS backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public ProtectedResources build() {
                return new ProtectedResources(this);
            } 

        } 

    }
}
