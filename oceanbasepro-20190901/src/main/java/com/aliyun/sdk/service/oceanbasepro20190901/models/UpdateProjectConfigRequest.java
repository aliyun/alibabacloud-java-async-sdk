// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectConfigRequest</p>
 */
public class UpdateProjectConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
         * FullTransferConfig.
         */
        public Builder fullTransferConfig(FullTransferConfig fullTransferConfig) {
            String fullTransferConfigShrink = shrink(fullTransferConfig, "FullTransferConfig", "json");
            this.putBodyParameter("FullTransferConfig", fullTransferConfigShrink);
            this.fullTransferConfig = fullTransferConfig;
            return this;
        }

        /**
         * Id.
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

    public static class FullTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadWorkerNum")
        private Integer readWorkerNum;

        @com.aliyun.core.annotation.NameInMap("ThrottleIOPS")
        private Integer throttleIOPS;

        @com.aliyun.core.annotation.NameInMap("ThrottleRps")
        private Integer throttleRps;

        @com.aliyun.core.annotation.NameInMap("WriteWorkerNum")
        private Integer writeWorkerNum;

        private FullTransferConfig(Builder builder) {
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
            private Integer readWorkerNum; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 
            private Integer writeWorkerNum; 

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
    public static class IncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrSyncThreadCount")
        private Integer incrSyncThreadCount;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List < String > recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List < String > supportDDLTypes;

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
        public java.util.List < String > getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List < String > getSupportDDLTypes() {
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
            private java.util.List < String > recordTypeWhiteList; 
            private java.util.List < String > supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

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
            public Builder recordTypeWhiteList(java.util.List < String > recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List < String > supportDDLTypes) {
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
    public static class ReverseIncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrSyncThreadCount")
        private Integer incrSyncThreadCount;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List < String > recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("SupportDDLTypes")
        private java.util.List < String > supportDDLTypes;

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
        public java.util.List < String > getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return supportDDLTypes
         */
        public java.util.List < String > getSupportDDLTypes() {
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
            private java.util.List < String > recordTypeWhiteList; 
            private java.util.List < String > supportDDLTypes; 
            private Integer throttleIOPS; 
            private Integer throttleRps; 

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
            public Builder recordTypeWhiteList(java.util.List < String > recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * SupportDDLTypes.
             */
            public Builder supportDDLTypes(java.util.List < String > supportDDLTypes) {
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
