// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link UpdateProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectConfigRequest</p>
 */
public class UpdateProjectConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommonTransferConfig")
    private CommonTransferConfig commonTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FullTransferConfig")
    private FullTransferConfig fullTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncrTransferConfig")
    private IncrTransferConfig incrTransferConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReverseIncrTransferConfig")
    private ReverseIncrTransferConfig reverseIncrTransferConfig;

    private UpdateProjectConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.commonTransferConfig = builder.commonTransferConfig;
        this.fullTransferConfig = builder.fullTransferConfig;
        this.id = builder.id;
        this.incrTransferConfig = builder.incrTransferConfig;
        this.reverseIncrTransferConfig = builder.reverseIncrTransferConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return commonTransferConfig
     */
    public CommonTransferConfig getCommonTransferConfig() {
        return this.commonTransferConfig;
    }

    /**
     * @return fullTransferConfig
     */
    public FullTransferConfig getFullTransferConfig() {
        return this.fullTransferConfig;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return incrTransferConfig
     */
    public IncrTransferConfig getIncrTransferConfig() {
        return this.incrTransferConfig;
    }

    /**
     * @return reverseIncrTransferConfig
     */
    public ReverseIncrTransferConfig getReverseIncrTransferConfig() {
        return this.reverseIncrTransferConfig;
    }

    public static final class Builder extends Request.Builder<UpdateProjectConfigRequest, Builder> {
        private String regionId; 
        private CommonTransferConfig commonTransferConfig; 
        private FullTransferConfig fullTransferConfig; 
        private String id; 
        private IncrTransferConfig incrTransferConfig; 
        private ReverseIncrTransferConfig reverseIncrTransferConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.commonTransferConfig = request.commonTransferConfig;
            this.fullTransferConfig = request.fullTransferConfig;
            this.id = request.id;
            this.incrTransferConfig = request.incrTransferConfig;
            this.reverseIncrTransferConfig = request.reverseIncrTransferConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CommonTransferConfig.
         */
        public Builder commonTransferConfig(CommonTransferConfig commonTransferConfig) {
            String commonTransferConfigShrink = shrink(commonTransferConfig, "CommonTransferConfig", "json");
            this.putBodyParameter("CommonTransferConfig", commonTransferConfigShrink);
            this.commonTransferConfig = commonTransferConfig;
            return this;
        }

        /**
         * FullTransferConfig.
         */
        public Builder fullTransferConfig(FullTransferConfig fullTransferConfig) {
            String fullTransferConfigShrink = shrink(fullTransferConfig, "FullTransferConfig", "json");
            this.putBodyParameter("FullTransferConfig", fullTransferConfigShrink);
            this.fullTransferConfig = fullTransferConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np_fe****</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IncrTransferConfig.
         */
        public Builder incrTransferConfig(IncrTransferConfig incrTransferConfig) {
            String incrTransferConfigShrink = shrink(incrTransferConfig, "IncrTransferConfig", "json");
            this.putBodyParameter("IncrTransferConfig", incrTransferConfigShrink);
            this.incrTransferConfig = incrTransferConfig;
            return this;
        }

        /**
         * ReverseIncrTransferConfig.
         */
        public Builder reverseIncrTransferConfig(ReverseIncrTransferConfig reverseIncrTransferConfig) {
            String reverseIncrTransferConfigShrink = shrink(reverseIncrTransferConfig, "ReverseIncrTransferConfig", "json");
            this.putBodyParameter("ReverseIncrTransferConfig", reverseIncrTransferConfigShrink);
            this.reverseIncrTransferConfig = reverseIncrTransferConfig;
            return this;
        }

        @Override
        public UpdateProjectConfigRequest build() {
            return new UpdateProjectConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProjectConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectConfigRequest</p>
     */
    public static class CommonTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SinkStoreFormat")
        private String sinkStoreFormat;

        @com.aliyun.core.annotation.NameInMap("SourceStoreFormat")
        private String sourceStoreFormat;

        private CommonTransferConfig(Builder builder) {
            this.sinkStoreFormat = builder.sinkStoreFormat;
            this.sourceStoreFormat = builder.sourceStoreFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonTransferConfig create() {
            return builder().build();
        }

        /**
         * @return sinkStoreFormat
         */
        public String getSinkStoreFormat() {
            return this.sinkStoreFormat;
        }

        /**
         * @return sourceStoreFormat
         */
        public String getSourceStoreFormat() {
            return this.sourceStoreFormat;
        }

        public static final class Builder {
            private String sinkStoreFormat; 
            private String sourceStoreFormat; 

            private Builder() {
            } 

            private Builder(CommonTransferConfig model) {
                this.sinkStoreFormat = model.sinkStoreFormat;
                this.sourceStoreFormat = model.sourceStoreFormat;
            } 

            /**
             * SinkStoreFormat.
             */
            public Builder sinkStoreFormat(String sinkStoreFormat) {
                this.sinkStoreFormat = sinkStoreFormat;
                return this;
            }

            /**
             * SourceStoreFormat.
             */
            public Builder sourceStoreFormat(String sourceStoreFormat) {
                this.sourceStoreFormat = sourceStoreFormat;
                return this;
            }

            public CommonTransferConfig build() {
                return new CommonTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateProjectConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectConfigRequest</p>
     */
    public static class FullTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexDDLConcurrencyLimit")
        private Integer indexDDLConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrentIndexDDLs")
        private Integer maxConcurrentIndexDDLs;

        @com.aliyun.core.annotation.NameInMap("ReadWorkerNum")
        private Integer readWorkerNum;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        @com.aliyun.core.annotation.NameInMap("WriteWorkerNum")
        private Integer writeWorkerNum;

        private FullTransferConfig(Builder builder) {
            this.indexDDLConcurrencyLimit = builder.indexDDLConcurrencyLimit;
            this.maxConcurrentIndexDDLs = builder.maxConcurrentIndexDDLs;
            this.readWorkerNum = builder.readWorkerNum;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
            this.writeWorkerNum = builder.writeWorkerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullTransferConfig create() {
            return builder().build();
        }

        /**
         * @return indexDDLConcurrencyLimit
         */
        public Integer getIndexDDLConcurrencyLimit() {
            return this.indexDDLConcurrencyLimit;
        }

        /**
         * @return maxConcurrentIndexDDLs
         */
        public Integer getMaxConcurrentIndexDDLs() {
            return this.maxConcurrentIndexDDLs;
        }

        /**
         * @return readWorkerNum
         */
        public Integer getReadWorkerNum() {
            return this.readWorkerNum;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        /**
         * @return writeWorkerNum
         */
        public Integer getWriteWorkerNum() {
            return this.writeWorkerNum;
        }

        public static final class Builder {
            private Integer indexDDLConcurrencyLimit; 
            private Integer maxConcurrentIndexDDLs; 
            private Integer readWorkerNum; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 
            private Integer writeWorkerNum; 

            private Builder() {
            } 

            private Builder(FullTransferConfig model) {
                this.indexDDLConcurrencyLimit = model.indexDDLConcurrencyLimit;
                this.maxConcurrentIndexDDLs = model.maxConcurrentIndexDDLs;
                this.readWorkerNum = model.readWorkerNum;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
                this.writeWorkerNum = model.writeWorkerNum;
            } 

            /**
             * IndexDDLConcurrencyLimit.
             */
            public Builder indexDDLConcurrencyLimit(Integer indexDDLConcurrencyLimit) {
                this.indexDDLConcurrencyLimit = indexDDLConcurrencyLimit;
                return this;
            }

            /**
             * MaxConcurrentIndexDDLs.
             */
            public Builder maxConcurrentIndexDDLs(Integer maxConcurrentIndexDDLs) {
                this.maxConcurrentIndexDDLs = maxConcurrentIndexDDLs;
                return this;
            }

            /**
             * ReadWorkerNum.
             */
            public Builder readWorkerNum(Integer readWorkerNum) {
                this.readWorkerNum = readWorkerNum;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            /**
             * WriteWorkerNum.
             */
            public Builder writeWorkerNum(Integer writeWorkerNum) {
                this.writeWorkerNum = writeWorkerNum;
                return this;
            }

            public FullTransferConfig build() {
                return new FullTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateProjectConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectConfigRequest</p>
     */
    public static class IncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrSyncThreadCount")
        private Integer incrSyncThreadCount;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List<String> recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List<String> supportDDLTypes;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        private IncrTransferConfig(Builder builder) {
            this.incrSyncThreadCount = builder.incrSyncThreadCount;
            this.recordTypeWhiteList = builder.recordTypeWhiteList;
            this.supportDDLTypes = builder.supportDDLTypes;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrTransferConfig create() {
            return builder().build();
        }

        /**
         * @return incrSyncThreadCount
         */
        public Integer getIncrSyncThreadCount() {
            return this.incrSyncThreadCount;
        }

        /**
         * @return recordTypeWhiteList
         */
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public static final class Builder {
            private Integer incrSyncThreadCount; 
            private java.util.List<String> recordTypeWhiteList; 
            private java.util.List<String> supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

            private Builder() {
            } 

            private Builder(IncrTransferConfig model) {
                this.incrSyncThreadCount = model.incrSyncThreadCount;
                this.recordTypeWhiteList = model.recordTypeWhiteList;
                this.supportDDLTypes = model.supportDDLTypes;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
            } 

            /**
             * IncrSyncThreadCount.
             */
            public Builder incrSyncThreadCount(Integer incrSyncThreadCount) {
                this.incrSyncThreadCount = incrSyncThreadCount;
                return this;
            }

            /**
             * RecordTypeWhiteList.
             */
            public Builder recordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List<String> supportDDLTypes) {
                this.supportDDLTypes = supportDDLTypes;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            public IncrTransferConfig build() {
                return new IncrTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateProjectConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectConfigRequest</p>
     */
    public static class ReverseIncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrSyncThreadCount")
        private Integer incrSyncThreadCount;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List<String> recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List<String> supportDDLTypes;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        private ReverseIncrTransferConfig(Builder builder) {
            this.incrSyncThreadCount = builder.incrSyncThreadCount;
            this.recordTypeWhiteList = builder.recordTypeWhiteList;
            this.supportDDLTypes = builder.supportDDLTypes;
            this.throttleIOPS = builder.throttleIOPS;
            this.throttleRps = builder.throttleRps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseIncrTransferConfig create() {
            return builder().build();
        }

        /**
         * @return incrSyncThreadCount
         */
        public Integer getIncrSyncThreadCount() {
            return this.incrSyncThreadCount;
        }

        /**
         * @return recordTypeWhiteList
         */
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        /**
         * @return throttleIOPS
         */
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        /**
         * @return throttleRps
         */
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public static final class Builder {
            private Integer incrSyncThreadCount; 
            private java.util.List<String> recordTypeWhiteList; 
            private java.util.List<String> supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

            private Builder() {
            } 

            private Builder(ReverseIncrTransferConfig model) {
                this.incrSyncThreadCount = model.incrSyncThreadCount;
                this.recordTypeWhiteList = model.recordTypeWhiteList;
                this.supportDDLTypes = model.supportDDLTypes;
                this.throttleIOPS = model.throttleIOPS;
                this.throttleRps = model.throttleRps;
            } 

            /**
             * IncrSyncThreadCount.
             */
            public Builder incrSyncThreadCount(Integer incrSyncThreadCount) {
                this.incrSyncThreadCount = incrSyncThreadCount;
                return this;
            }

            /**
             * RecordTypeWhiteList.
             */
            public Builder recordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List<String> supportDDLTypes) {
                this.supportDDLTypes = supportDDLTypes;
                return this;
            }

            /**
             * ThrottleIOPS.
             */
            public Builder throttleIOPS(Integer throttleIOPS) {
                this.throttleIOPS = throttleIOPS;
                return this;
            }

            /**
             * ThrottleRps.
             */
            public Builder throttleRps(Integer throttleRps) {
                this.throttleRps = throttleRps;
                return this;
            }

            public ReverseIncrTransferConfig build() {
                return new ReverseIncrTransferConfig(this);
            } 

        } 

    }
}
