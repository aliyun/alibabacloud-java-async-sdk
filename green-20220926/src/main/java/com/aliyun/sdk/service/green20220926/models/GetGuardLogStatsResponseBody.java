// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetGuardLogStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetGuardLogStatsResponseBody</p>
 */
public class GetGuardLogStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGuardLogStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGuardLogStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGuardLogStatsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGuardLogStatsResponseBody build() {
            return new GetGuardLogStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGuardLogStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetGuardLogStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryRegion")
        private String deliveryRegion;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("LogAnalysisConfig")
        private java.util.Map<String, ?> logAnalysisConfig;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("PendingStorage")
        private Long pendingStorage;

        @com.aliyun.core.annotation.NameInMap("PreserveStorage")
        private Long preserveStorage;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("TotalStorage")
        private Long totalStorage;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Long ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UsedStorage")
        private Long usedStorage;

        private Data(Builder builder) {
            this.deliveryRegion = builder.deliveryRegion;
            this.enable = builder.enable;
            this.logAnalysisConfig = builder.logAnalysisConfig;
            this.logStoreName = builder.logStoreName;
            this.pendingStorage = builder.pendingStorage;
            this.preserveStorage = builder.preserveStorage;
            this.project = builder.project;
            this.totalStorage = builder.totalStorage;
            this.ttl = builder.ttl;
            this.type = builder.type;
            this.uid = builder.uid;
            this.usedStorage = builder.usedStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliveryRegion
         */
        public String getDeliveryRegion() {
            return this.deliveryRegion;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return logAnalysisConfig
         */
        public java.util.Map<String, ?> getLogAnalysisConfig() {
            return this.logAnalysisConfig;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return pendingStorage
         */
        public Long getPendingStorage() {
            return this.pendingStorage;
        }

        /**
         * @return preserveStorage
         */
        public Long getPreserveStorage() {
            return this.preserveStorage;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return totalStorage
         */
        public Long getTotalStorage() {
            return this.totalStorage;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return usedStorage
         */
        public Long getUsedStorage() {
            return this.usedStorage;
        }

        public static final class Builder {
            private String deliveryRegion; 
            private Boolean enable; 
            private java.util.Map<String, ?> logAnalysisConfig; 
            private String logStoreName; 
            private Long pendingStorage; 
            private Long preserveStorage; 
            private String project; 
            private Long totalStorage; 
            private Long ttl; 
            private String type; 
            private String uid; 
            private Long usedStorage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deliveryRegion = model.deliveryRegion;
                this.enable = model.enable;
                this.logAnalysisConfig = model.logAnalysisConfig;
                this.logStoreName = model.logStoreName;
                this.pendingStorage = model.pendingStorage;
                this.preserveStorage = model.preserveStorage;
                this.project = model.project;
                this.totalStorage = model.totalStorage;
                this.ttl = model.ttl;
                this.type = model.type;
                this.uid = model.uid;
                this.usedStorage = model.usedStorage;
            } 

            /**
             * DeliveryRegion.
             */
            public Builder deliveryRegion(String deliveryRegion) {
                this.deliveryRegion = deliveryRegion;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * LogAnalysisConfig.
             */
            public Builder logAnalysisConfig(java.util.Map<String, ?> logAnalysisConfig) {
                this.logAnalysisConfig = logAnalysisConfig;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * PendingStorage.
             */
            public Builder pendingStorage(Long pendingStorage) {
                this.pendingStorage = pendingStorage;
                return this;
            }

            /**
             * PreserveStorage.
             */
            public Builder preserveStorage(Long preserveStorage) {
                this.preserveStorage = preserveStorage;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * TotalStorage.
             */
            public Builder totalStorage(Long totalStorage) {
                this.totalStorage = totalStorage;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>UID。</p>
             * 
             * <strong>example:</strong>
             * <p>1643953****74290</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UsedStorage.
             */
            public Builder usedStorage(Long usedStorage) {
                this.usedStorage = usedStorage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
