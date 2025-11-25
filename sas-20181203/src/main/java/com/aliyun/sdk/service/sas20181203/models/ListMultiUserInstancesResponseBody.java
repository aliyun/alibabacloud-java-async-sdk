// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiUserInstancesResponseBody</p>
 */
public class ListMultiUserInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DaInstance")
    private DaInstance daInstance;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaleInstanceList")
    private java.util.List<SaleInstanceList> saleInstanceList;

    private ListMultiUserInstancesResponseBody(Builder builder) {
        this.daInstance = builder.daInstance;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.saleInstanceList = builder.saleInstanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiUserInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return daInstance
     */
    public DaInstance getDaInstance() {
        return this.daInstance;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saleInstanceList
     */
    public java.util.List<SaleInstanceList> getSaleInstanceList() {
        return this.saleInstanceList;
    }

    public static final class Builder {
        private DaInstance daInstance; 
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<SaleInstanceList> saleInstanceList; 

        private Builder() {
        } 

        private Builder(ListMultiUserInstancesResponseBody model) {
            this.daInstance = model.daInstance;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.saleInstanceList = model.saleInstanceList;
        } 

        /**
         * DaInstance.
         */
        public Builder daInstance(DaInstance daInstance) {
            this.daInstance = daInstance;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * SaleInstanceList.
         */
        public Builder saleInstanceList(java.util.List<SaleInstanceList> saleInstanceList) {
            this.saleInstanceList = saleInstanceList;
            return this;
        }

        public ListMultiUserInstancesResponseBody build() {
            return new ListMultiUserInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class AntiRansomwareCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private AntiRansomwareCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AntiRansomwareCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(AntiRansomwareCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public AntiRansomwareCapacity build() {
                return new AntiRansomwareCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class CspmCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private CspmCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CspmCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(CspmCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public CspmCapacity build() {
                return new CspmCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class HoneypotCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private HoneypotCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(HoneypotCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public HoneypotCapacity build() {
                return new HoneypotCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class ImageScanCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private ImageScanCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScanCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(ImageScanCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public ImageScanCapacity build() {
                return new ImageScanCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class RaspCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private RaspCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RaspCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(RaspCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public RaspCapacity build() {
                return new RaspCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SdkCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SdkCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SdkCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SdkCapacity build() {
                return new SdkCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SlsCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SlsCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SlsCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SlsCapacity build() {
                return new SlsCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class ThreatAnalysisCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private ThreatAnalysisCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatAnalysisCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(ThreatAnalysisCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public ThreatAnalysisCapacity build() {
                return new ThreatAnalysisCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class ThreatAnalysisFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private ThreatAnalysisFlow(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatAnalysisFlow create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(ThreatAnalysisFlow model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public ThreatAnalysisFlow build() {
                return new ThreatAnalysisFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class CoreCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private CoreCount(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoreCount create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(CoreCount model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public CoreCount build() {
                return new CoreCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class EcsCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private EcsCount(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsCount create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(EcsCount model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public EcsCount build() {
                return new EcsCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class VersionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthBindType")
        private String authBindType;

        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private CoreCount coreCount;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private EcsCount ecsCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private VersionSummary(Builder builder) {
            this.authBindType = builder.authBindType;
            this.coreCount = builder.coreCount;
            this.ecsCount = builder.ecsCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSummary create() {
            return builder().build();
        }

        /**
         * @return authBindType
         */
        public String getAuthBindType() {
            return this.authBindType;
        }

        /**
         * @return coreCount
         */
        public CoreCount getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return ecsCount
         */
        public EcsCount getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authBindType; 
            private CoreCount coreCount; 
            private EcsCount ecsCount; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(VersionSummary model) {
                this.authBindType = model.authBindType;
                this.coreCount = model.coreCount;
                this.ecsCount = model.ecsCount;
                this.version = model.version;
            } 

            /**
             * AuthBindType.
             */
            public Builder authBindType(String authBindType) {
                this.authBindType = authBindType;
                return this;
            }

            /**
             * CoreCount.
             */
            public Builder coreCount(CoreCount coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * EcsCount.
             */
            public Builder ecsCount(EcsCount ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public VersionSummary build() {
                return new VersionSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class WebLockCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private WebLockCapacity(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebLockCapacity create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(WebLockCapacity model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public WebLockCapacity build() {
                return new WebLockCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class DaInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
        private AntiRansomwareCapacity antiRansomwareCapacity;

        @com.aliyun.core.annotation.NameInMap("CspmCapacity")
        private CspmCapacity cspmCapacity;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private HoneypotCapacity honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private ImageScanCapacity imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstancePurchaseType")
        private Integer instancePurchaseType;

        @com.aliyun.core.annotation.NameInMap("RaspCapacity")
        private RaspCapacity raspCapacity;

        @com.aliyun.core.annotation.NameInMap("SdkCapacity")
        private SdkCapacity sdkCapacity;

        @com.aliyun.core.annotation.NameInMap("SlsCapacity")
        private SlsCapacity slsCapacity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
        private ThreatAnalysisCapacity threatAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
        private ThreatAnalysisFlow threatAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private Integer userType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSummary")
        private java.util.List<VersionSummary> versionSummary;

        @com.aliyun.core.annotation.NameInMap("WebLockCapacity")
        private WebLockCapacity webLockCapacity;

        private DaInstance(Builder builder) {
            this.aliUid = builder.aliUid;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.cspmCapacity = builder.cspmCapacity;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceId = builder.instanceId;
            this.instancePurchaseType = builder.instancePurchaseType;
            this.raspCapacity = builder.raspCapacity;
            this.sdkCapacity = builder.sdkCapacity;
            this.slsCapacity = builder.slsCapacity;
            this.status = builder.status;
            this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
            this.threatAnalysisFlow = builder.threatAnalysisFlow;
            this.userType = builder.userType;
            this.version = builder.version;
            this.versionSummary = builder.versionSummary;
            this.webLockCapacity = builder.webLockCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DaInstance create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return antiRansomwareCapacity
         */
        public AntiRansomwareCapacity getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        /**
         * @return cspmCapacity
         */
        public CspmCapacity getCspmCapacity() {
            return this.cspmCapacity;
        }

        /**
         * @return honeypotCapacity
         */
        public HoneypotCapacity getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        /**
         * @return imageScanCapacity
         */
        public ImageScanCapacity getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instancePurchaseType
         */
        public Integer getInstancePurchaseType() {
            return this.instancePurchaseType;
        }

        /**
         * @return raspCapacity
         */
        public RaspCapacity getRaspCapacity() {
            return this.raspCapacity;
        }

        /**
         * @return sdkCapacity
         */
        public SdkCapacity getSdkCapacity() {
            return this.sdkCapacity;
        }

        /**
         * @return slsCapacity
         */
        public SlsCapacity getSlsCapacity() {
            return this.slsCapacity;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatAnalysisCapacity
         */
        public ThreatAnalysisCapacity getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        /**
         * @return threatAnalysisFlow
         */
        public ThreatAnalysisFlow getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSummary
         */
        public java.util.List<VersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        /**
         * @return webLockCapacity
         */
        public WebLockCapacity getWebLockCapacity() {
            return this.webLockCapacity;
        }

        public static final class Builder {
            private Long aliUid; 
            private AntiRansomwareCapacity antiRansomwareCapacity; 
            private CspmCapacity cspmCapacity; 
            private HoneypotCapacity honeypotCapacity; 
            private ImageScanCapacity imageScanCapacity; 
            private String instanceId; 
            private Integer instancePurchaseType; 
            private RaspCapacity raspCapacity; 
            private SdkCapacity sdkCapacity; 
            private SlsCapacity slsCapacity; 
            private Integer status; 
            private ThreatAnalysisCapacity threatAnalysisCapacity; 
            private ThreatAnalysisFlow threatAnalysisFlow; 
            private Integer userType; 
            private Integer version; 
            private java.util.List<VersionSummary> versionSummary; 
            private WebLockCapacity webLockCapacity; 

            private Builder() {
            } 

            private Builder(DaInstance model) {
                this.aliUid = model.aliUid;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.cspmCapacity = model.cspmCapacity;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceId = model.instanceId;
                this.instancePurchaseType = model.instancePurchaseType;
                this.raspCapacity = model.raspCapacity;
                this.sdkCapacity = model.sdkCapacity;
                this.slsCapacity = model.slsCapacity;
                this.status = model.status;
                this.threatAnalysisCapacity = model.threatAnalysisCapacity;
                this.threatAnalysisFlow = model.threatAnalysisFlow;
                this.userType = model.userType;
                this.version = model.version;
                this.versionSummary = model.versionSummary;
                this.webLockCapacity = model.webLockCapacity;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AntiRansomwareCapacity.
             */
            public Builder antiRansomwareCapacity(AntiRansomwareCapacity antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * CspmCapacity.
             */
            public Builder cspmCapacity(CspmCapacity cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
                return this;
            }

            /**
             * HoneypotCapacity.
             */
            public Builder honeypotCapacity(HoneypotCapacity honeypotCapacity) {
                this.honeypotCapacity = honeypotCapacity;
                return this;
            }

            /**
             * ImageScanCapacity.
             */
            public Builder imageScanCapacity(ImageScanCapacity imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstancePurchaseType.
             */
            public Builder instancePurchaseType(Integer instancePurchaseType) {
                this.instancePurchaseType = instancePurchaseType;
                return this;
            }

            /**
             * RaspCapacity.
             */
            public Builder raspCapacity(RaspCapacity raspCapacity) {
                this.raspCapacity = raspCapacity;
                return this;
            }

            /**
             * SdkCapacity.
             */
            public Builder sdkCapacity(SdkCapacity sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
                return this;
            }

            /**
             * SlsCapacity.
             */
            public Builder slsCapacity(SlsCapacity slsCapacity) {
                this.slsCapacity = slsCapacity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * ThreatAnalysisCapacity.
             */
            public Builder threatAnalysisCapacity(ThreatAnalysisCapacity threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * ThreatAnalysisFlow.
             */
            public Builder threatAnalysisFlow(ThreatAnalysisFlow threatAnalysisFlow) {
                this.threatAnalysisFlow = threatAnalysisFlow;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * VersionSummary.
             */
            public Builder versionSummary(java.util.List<VersionSummary> versionSummary) {
                this.versionSummary = versionSummary;
                return this;
            }

            /**
             * WebLockCapacity.
             */
            public Builder webLockCapacity(WebLockCapacity webLockCapacity) {
                this.webLockCapacity = webLockCapacity;
                return this;
            }

            public DaInstance build() {
                return new DaInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListAntiRansomwareCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListAntiRansomwareCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListAntiRansomwareCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListAntiRansomwareCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListAntiRansomwareCapacity build() {
                return new SaleInstanceListAntiRansomwareCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListCspmCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListCspmCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListCspmCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListCspmCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListCspmCapacity build() {
                return new SaleInstanceListCspmCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListHoneypotCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListHoneypotCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListHoneypotCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListHoneypotCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListHoneypotCapacity build() {
                return new SaleInstanceListHoneypotCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListImageScanCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListImageScanCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListImageScanCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListImageScanCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListImageScanCapacity build() {
                return new SaleInstanceListImageScanCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListRaspCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListRaspCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListRaspCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListRaspCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListRaspCapacity build() {
                return new SaleInstanceListRaspCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListSdkCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListSdkCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListSdkCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListSdkCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListSdkCapacity build() {
                return new SaleInstanceListSdkCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListSlsCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListSlsCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListSlsCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListSlsCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListSlsCapacity build() {
                return new SaleInstanceListSlsCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListThreatAnalysisCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListThreatAnalysisCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListThreatAnalysisCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListThreatAnalysisCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListThreatAnalysisCapacity build() {
                return new SaleInstanceListThreatAnalysisCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListThreatAnalysisFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListThreatAnalysisFlow(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListThreatAnalysisFlow create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListThreatAnalysisFlow model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListThreatAnalysisFlow build() {
                return new SaleInstanceListThreatAnalysisFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class VersionSummaryCoreCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private VersionSummaryCoreCount(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSummaryCoreCount create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(VersionSummaryCoreCount model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public VersionSummaryCoreCount build() {
                return new VersionSummaryCoreCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class VersionSummaryEcsCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assigned")
        private Long assigned;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private VersionSummaryEcsCount(Builder builder) {
            this.assigned = builder.assigned;
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSummaryEcsCount create() {
            return builder().build();
        }

        /**
         * @return assigned
         */
        public Long getAssigned() {
            return this.assigned;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long assigned; 
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(VersionSummaryEcsCount model) {
                this.assigned = model.assigned;
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Assigned.
             */
            public Builder assigned(Long assigned) {
                this.assigned = assigned;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public VersionSummaryEcsCount build() {
                return new VersionSummaryEcsCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListVersionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthBindType")
        private String authBindType;

        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private VersionSummaryCoreCount coreCount;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private VersionSummaryEcsCount ecsCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private SaleInstanceListVersionSummary(Builder builder) {
            this.authBindType = builder.authBindType;
            this.coreCount = builder.coreCount;
            this.ecsCount = builder.ecsCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListVersionSummary create() {
            return builder().build();
        }

        /**
         * @return authBindType
         */
        public String getAuthBindType() {
            return this.authBindType;
        }

        /**
         * @return coreCount
         */
        public VersionSummaryCoreCount getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return ecsCount
         */
        public VersionSummaryEcsCount getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authBindType; 
            private VersionSummaryCoreCount coreCount; 
            private VersionSummaryEcsCount ecsCount; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(SaleInstanceListVersionSummary model) {
                this.authBindType = model.authBindType;
                this.coreCount = model.coreCount;
                this.ecsCount = model.ecsCount;
                this.version = model.version;
            } 

            /**
             * AuthBindType.
             */
            public Builder authBindType(String authBindType) {
                this.authBindType = authBindType;
                return this;
            }

            /**
             * CoreCount.
             */
            public Builder coreCount(VersionSummaryCoreCount coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * EcsCount.
             */
            public Builder ecsCount(VersionSummaryEcsCount ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public SaleInstanceListVersionSummary build() {
                return new SaleInstanceListVersionSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceListWebLockCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private SaleInstanceListWebLockCapacity(Builder builder) {
            this.count = builder.count;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceListWebLockCapacity create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Long count; 
            private Long used; 

            private Builder() {
            } 

            private Builder(SaleInstanceListWebLockCapacity model) {
                this.count = model.count;
                this.used = model.used;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public SaleInstanceListWebLockCapacity build() {
                return new SaleInstanceListWebLockCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiUserInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiUserInstancesResponseBody</p>
     */
    public static class SaleInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
        private SaleInstanceListAntiRansomwareCapacity antiRansomwareCapacity;

        @com.aliyun.core.annotation.NameInMap("CspmCapacity")
        private SaleInstanceListCspmCapacity cspmCapacity;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private SaleInstanceListHoneypotCapacity honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private SaleInstanceListImageScanCapacity imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstancePurchaseType")
        private Integer instancePurchaseType;

        @com.aliyun.core.annotation.NameInMap("RaspCapacity")
        private SaleInstanceListRaspCapacity raspCapacity;

        @com.aliyun.core.annotation.NameInMap("SdkCapacity")
        private SaleInstanceListSdkCapacity sdkCapacity;

        @com.aliyun.core.annotation.NameInMap("SlsCapacity")
        private SaleInstanceListSlsCapacity slsCapacity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
        private SaleInstanceListThreatAnalysisCapacity threatAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
        private SaleInstanceListThreatAnalysisFlow threatAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private Integer userType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSummary")
        private java.util.List<SaleInstanceListVersionSummary> versionSummary;

        @com.aliyun.core.annotation.NameInMap("WebLockCapacity")
        private SaleInstanceListWebLockCapacity webLockCapacity;

        private SaleInstanceList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.cspmCapacity = builder.cspmCapacity;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceId = builder.instanceId;
            this.instancePurchaseType = builder.instancePurchaseType;
            this.raspCapacity = builder.raspCapacity;
            this.sdkCapacity = builder.sdkCapacity;
            this.slsCapacity = builder.slsCapacity;
            this.status = builder.status;
            this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
            this.threatAnalysisFlow = builder.threatAnalysisFlow;
            this.userType = builder.userType;
            this.version = builder.version;
            this.versionSummary = builder.versionSummary;
            this.webLockCapacity = builder.webLockCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInstanceList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return antiRansomwareCapacity
         */
        public SaleInstanceListAntiRansomwareCapacity getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        /**
         * @return cspmCapacity
         */
        public SaleInstanceListCspmCapacity getCspmCapacity() {
            return this.cspmCapacity;
        }

        /**
         * @return honeypotCapacity
         */
        public SaleInstanceListHoneypotCapacity getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        /**
         * @return imageScanCapacity
         */
        public SaleInstanceListImageScanCapacity getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instancePurchaseType
         */
        public Integer getInstancePurchaseType() {
            return this.instancePurchaseType;
        }

        /**
         * @return raspCapacity
         */
        public SaleInstanceListRaspCapacity getRaspCapacity() {
            return this.raspCapacity;
        }

        /**
         * @return sdkCapacity
         */
        public SaleInstanceListSdkCapacity getSdkCapacity() {
            return this.sdkCapacity;
        }

        /**
         * @return slsCapacity
         */
        public SaleInstanceListSlsCapacity getSlsCapacity() {
            return this.slsCapacity;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatAnalysisCapacity
         */
        public SaleInstanceListThreatAnalysisCapacity getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        /**
         * @return threatAnalysisFlow
         */
        public SaleInstanceListThreatAnalysisFlow getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSummary
         */
        public java.util.List<SaleInstanceListVersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        /**
         * @return webLockCapacity
         */
        public SaleInstanceListWebLockCapacity getWebLockCapacity() {
            return this.webLockCapacity;
        }

        public static final class Builder {
            private Long aliUid; 
            private SaleInstanceListAntiRansomwareCapacity antiRansomwareCapacity; 
            private SaleInstanceListCspmCapacity cspmCapacity; 
            private SaleInstanceListHoneypotCapacity honeypotCapacity; 
            private SaleInstanceListImageScanCapacity imageScanCapacity; 
            private String instanceId; 
            private Integer instancePurchaseType; 
            private SaleInstanceListRaspCapacity raspCapacity; 
            private SaleInstanceListSdkCapacity sdkCapacity; 
            private SaleInstanceListSlsCapacity slsCapacity; 
            private Integer status; 
            private SaleInstanceListThreatAnalysisCapacity threatAnalysisCapacity; 
            private SaleInstanceListThreatAnalysisFlow threatAnalysisFlow; 
            private Integer userType; 
            private Integer version; 
            private java.util.List<SaleInstanceListVersionSummary> versionSummary; 
            private SaleInstanceListWebLockCapacity webLockCapacity; 

            private Builder() {
            } 

            private Builder(SaleInstanceList model) {
                this.aliUid = model.aliUid;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.cspmCapacity = model.cspmCapacity;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceId = model.instanceId;
                this.instancePurchaseType = model.instancePurchaseType;
                this.raspCapacity = model.raspCapacity;
                this.sdkCapacity = model.sdkCapacity;
                this.slsCapacity = model.slsCapacity;
                this.status = model.status;
                this.threatAnalysisCapacity = model.threatAnalysisCapacity;
                this.threatAnalysisFlow = model.threatAnalysisFlow;
                this.userType = model.userType;
                this.version = model.version;
                this.versionSummary = model.versionSummary;
                this.webLockCapacity = model.webLockCapacity;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AntiRansomwareCapacity.
             */
            public Builder antiRansomwareCapacity(SaleInstanceListAntiRansomwareCapacity antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * CspmCapacity.
             */
            public Builder cspmCapacity(SaleInstanceListCspmCapacity cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
                return this;
            }

            /**
             * HoneypotCapacity.
             */
            public Builder honeypotCapacity(SaleInstanceListHoneypotCapacity honeypotCapacity) {
                this.honeypotCapacity = honeypotCapacity;
                return this;
            }

            /**
             * ImageScanCapacity.
             */
            public Builder imageScanCapacity(SaleInstanceListImageScanCapacity imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstancePurchaseType.
             */
            public Builder instancePurchaseType(Integer instancePurchaseType) {
                this.instancePurchaseType = instancePurchaseType;
                return this;
            }

            /**
             * RaspCapacity.
             */
            public Builder raspCapacity(SaleInstanceListRaspCapacity raspCapacity) {
                this.raspCapacity = raspCapacity;
                return this;
            }

            /**
             * SdkCapacity.
             */
            public Builder sdkCapacity(SaleInstanceListSdkCapacity sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
                return this;
            }

            /**
             * SlsCapacity.
             */
            public Builder slsCapacity(SaleInstanceListSlsCapacity slsCapacity) {
                this.slsCapacity = slsCapacity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * ThreatAnalysisCapacity.
             */
            public Builder threatAnalysisCapacity(SaleInstanceListThreatAnalysisCapacity threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * ThreatAnalysisFlow.
             */
            public Builder threatAnalysisFlow(SaleInstanceListThreatAnalysisFlow threatAnalysisFlow) {
                this.threatAnalysisFlow = threatAnalysisFlow;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * VersionSummary.
             */
            public Builder versionSummary(java.util.List<SaleInstanceListVersionSummary> versionSummary) {
                this.versionSummary = versionSummary;
                return this;
            }

            /**
             * WebLockCapacity.
             */
            public Builder webLockCapacity(SaleInstanceListWebLockCapacity webLockCapacity) {
                this.webLockCapacity = webLockCapacity;
                return this;
            }

            public SaleInstanceList build() {
                return new SaleInstanceList(this);
            } 

        } 

    }
}
