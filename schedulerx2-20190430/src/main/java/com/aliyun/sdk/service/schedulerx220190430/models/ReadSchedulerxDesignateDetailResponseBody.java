// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ReadSchedulerxDesignateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ReadSchedulerxDesignateDetailResponseBody</p>
 */
public class ReadSchedulerxDesignateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadSchedulerxDesignateDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadSchedulerxDesignateDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadSchedulerxDesignateDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadSchedulerxDesignateDetailResponseBody build() {
            return new ReadSchedulerxDesignateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadSchedulerxDesignateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxDesignateDetailResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxDesignateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxDesignateDetailResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuLoad1")
        private Double cpuLoad1;

        @com.aliyun.core.annotation.NameInMap("CpuLoad5")
        private Double cpuLoad5;

        @com.aliyun.core.annotation.NameInMap("CpuProcessors")
        private Integer cpuProcessors;

        @com.aliyun.core.annotation.NameInMap("DiskMax")
        private Integer diskMax;

        @com.aliyun.core.annotation.NameInMap("DiskUsage")
        private Double diskUsage;

        @com.aliyun.core.annotation.NameInMap("DiskUsed")
        private Integer diskUsed;

        @com.aliyun.core.annotation.NameInMap("ExecCount")
        private Long execCount;

        @com.aliyun.core.annotation.NameInMap("Heap1Usage")
        private Double heap1Usage;

        @com.aliyun.core.annotation.NameInMap("Heap1Used")
        private Double heap1Used;

        @com.aliyun.core.annotation.NameInMap("Heap5Usage")
        private Double heap5Usage;

        @com.aliyun.core.annotation.NameInMap("HeapMax")
        private Integer heapMax;

        @com.aliyun.core.annotation.NameInMap("SharePoolAvailableSize")
        private Integer sharePoolAvailableSize;

        @com.aliyun.core.annotation.NameInMap("SharePoolQueueSize")
        private Integer sharePoolQueueSize;

        private Metrics(Builder builder) {
            this.cpuLoad1 = builder.cpuLoad1;
            this.cpuLoad5 = builder.cpuLoad5;
            this.cpuProcessors = builder.cpuProcessors;
            this.diskMax = builder.diskMax;
            this.diskUsage = builder.diskUsage;
            this.diskUsed = builder.diskUsed;
            this.execCount = builder.execCount;
            this.heap1Usage = builder.heap1Usage;
            this.heap1Used = builder.heap1Used;
            this.heap5Usage = builder.heap5Usage;
            this.heapMax = builder.heapMax;
            this.sharePoolAvailableSize = builder.sharePoolAvailableSize;
            this.sharePoolQueueSize = builder.sharePoolQueueSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return cpuLoad1
         */
        public Double getCpuLoad1() {
            return this.cpuLoad1;
        }

        /**
         * @return cpuLoad5
         */
        public Double getCpuLoad5() {
            return this.cpuLoad5;
        }

        /**
         * @return cpuProcessors
         */
        public Integer getCpuProcessors() {
            return this.cpuProcessors;
        }

        /**
         * @return diskMax
         */
        public Integer getDiskMax() {
            return this.diskMax;
        }

        /**
         * @return diskUsage
         */
        public Double getDiskUsage() {
            return this.diskUsage;
        }

        /**
         * @return diskUsed
         */
        public Integer getDiskUsed() {
            return this.diskUsed;
        }

        /**
         * @return execCount
         */
        public Long getExecCount() {
            return this.execCount;
        }

        /**
         * @return heap1Usage
         */
        public Double getHeap1Usage() {
            return this.heap1Usage;
        }

        /**
         * @return heap1Used
         */
        public Double getHeap1Used() {
            return this.heap1Used;
        }

        /**
         * @return heap5Usage
         */
        public Double getHeap5Usage() {
            return this.heap5Usage;
        }

        /**
         * @return heapMax
         */
        public Integer getHeapMax() {
            return this.heapMax;
        }

        /**
         * @return sharePoolAvailableSize
         */
        public Integer getSharePoolAvailableSize() {
            return this.sharePoolAvailableSize;
        }

        /**
         * @return sharePoolQueueSize
         */
        public Integer getSharePoolQueueSize() {
            return this.sharePoolQueueSize;
        }

        public static final class Builder {
            private Double cpuLoad1; 
            private Double cpuLoad5; 
            private Integer cpuProcessors; 
            private Integer diskMax; 
            private Double diskUsage; 
            private Integer diskUsed; 
            private Long execCount; 
            private Double heap1Usage; 
            private Double heap1Used; 
            private Double heap5Usage; 
            private Integer heapMax; 
            private Integer sharePoolAvailableSize; 
            private Integer sharePoolQueueSize; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.cpuLoad1 = model.cpuLoad1;
                this.cpuLoad5 = model.cpuLoad5;
                this.cpuProcessors = model.cpuProcessors;
                this.diskMax = model.diskMax;
                this.diskUsage = model.diskUsage;
                this.diskUsed = model.diskUsed;
                this.execCount = model.execCount;
                this.heap1Usage = model.heap1Usage;
                this.heap1Used = model.heap1Used;
                this.heap5Usage = model.heap5Usage;
                this.heapMax = model.heapMax;
                this.sharePoolAvailableSize = model.sharePoolAvailableSize;
                this.sharePoolQueueSize = model.sharePoolQueueSize;
            } 

            /**
             * CpuLoad1.
             */
            public Builder cpuLoad1(Double cpuLoad1) {
                this.cpuLoad1 = cpuLoad1;
                return this;
            }

            /**
             * CpuLoad5.
             */
            public Builder cpuLoad5(Double cpuLoad5) {
                this.cpuLoad5 = cpuLoad5;
                return this;
            }

            /**
             * CpuProcessors.
             */
            public Builder cpuProcessors(Integer cpuProcessors) {
                this.cpuProcessors = cpuProcessors;
                return this;
            }

            /**
             * DiskMax.
             */
            public Builder diskMax(Integer diskMax) {
                this.diskMax = diskMax;
                return this;
            }

            /**
             * DiskUsage.
             */
            public Builder diskUsage(Double diskUsage) {
                this.diskUsage = diskUsage;
                return this;
            }

            /**
             * DiskUsed.
             */
            public Builder diskUsed(Integer diskUsed) {
                this.diskUsed = diskUsed;
                return this;
            }

            /**
             * ExecCount.
             */
            public Builder execCount(Long execCount) {
                this.execCount = execCount;
                return this;
            }

            /**
             * Heap1Usage.
             */
            public Builder heap1Usage(Double heap1Usage) {
                this.heap1Usage = heap1Usage;
                return this;
            }

            /**
             * Heap1Used.
             */
            public Builder heap1Used(Double heap1Used) {
                this.heap1Used = heap1Used;
                return this;
            }

            /**
             * Heap5Usage.
             */
            public Builder heap5Usage(Double heap5Usage) {
                this.heap5Usage = heap5Usage;
                return this;
            }

            /**
             * HeapMax.
             */
            public Builder heapMax(Integer heapMax) {
                this.heapMax = heapMax;
                return this;
            }

            /**
             * SharePoolAvailableSize.
             */
            public Builder sharePoolAvailableSize(Integer sharePoolAvailableSize) {
                this.sharePoolAvailableSize = sharePoolAvailableSize;
                return this;
            }

            /**
             * SharePoolQueueSize.
             */
            public Builder sharePoolQueueSize(Integer sharePoolQueueSize) {
                this.sharePoolQueueSize = sharePoolQueueSize;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxDesignateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxDesignateDetailResponseBody</p>
     */
    public static class DesignateDetailVos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Busy")
        private String busy;

        @com.aliyun.core.annotation.NameInMap("Checked")
        private Boolean checked;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        @com.aliyun.core.annotation.NameInMap("Offline")
        private Boolean offline;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Starter")
        private String starter;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DesignateDetailVos(Builder builder) {
            this.busy = builder.busy;
            this.checked = builder.checked;
            this.key = builder.key;
            this.metrics = builder.metrics;
            this.offline = builder.offline;
            this.size = builder.size;
            this.starter = builder.starter;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesignateDetailVos create() {
            return builder().build();
        }

        /**
         * @return busy
         */
        public String getBusy() {
            return this.busy;
        }

        /**
         * @return checked
         */
        public Boolean getChecked() {
            return this.checked;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        /**
         * @return offline
         */
        public Boolean getOffline() {
            return this.offline;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return starter
         */
        public String getStarter() {
            return this.starter;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String busy; 
            private Boolean checked; 
            private String key; 
            private Metrics metrics; 
            private Boolean offline; 
            private Integer size; 
            private String starter; 
            private String version; 

            private Builder() {
            } 

            private Builder(DesignateDetailVos model) {
                this.busy = model.busy;
                this.checked = model.checked;
                this.key = model.key;
                this.metrics = model.metrics;
                this.offline = model.offline;
                this.size = model.size;
                this.starter = model.starter;
                this.version = model.version;
            } 

            /**
             * Busy.
             */
            public Builder busy(String busy) {
                this.busy = busy;
                return this;
            }

            /**
             * Checked.
             */
            public Builder checked(Boolean checked) {
                this.checked = checked;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * Offline.
             */
            public Builder offline(Boolean offline) {
                this.offline = offline;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Starter.
             */
            public Builder starter(String starter) {
                this.starter = starter;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DesignateDetailVos build() {
                return new DesignateDetailVos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxDesignateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxDesignateDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesignateDetailVos")
        private java.util.List<DesignateDetailVos> designateDetailVos;

        private Data(Builder builder) {
            this.designateDetailVos = builder.designateDetailVos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return designateDetailVos
         */
        public java.util.List<DesignateDetailVos> getDesignateDetailVos() {
            return this.designateDetailVos;
        }

        public static final class Builder {
            private java.util.List<DesignateDetailVos> designateDetailVos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.designateDetailVos = model.designateDetailVos;
            } 

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder designateDetailVos(java.util.List<DesignateDetailVos> designateDetailVos) {
                this.designateDetailVos = designateDetailVos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
