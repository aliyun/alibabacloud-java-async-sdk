// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link CreateMaYiBlockRequest} extends {@link RequestModel}
 *
 * <p>CreateMaYiBlockRequest</p>
 */
public class CreateMaYiBlockRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockId")
    private String blockId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockTimes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BlockTimes> blockTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorEmpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String creatorEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Director")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> director;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultVersion")
    private String faultVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Information")
    private java.util.List<String> information;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scope")
    private Scope scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateMaYiBlockRequest(Builder builder) {
        super(builder);
        this.blockId = builder.blockId;
        this.blockTimes = builder.blockTimes;
        this.blockType = builder.blockType;
        this.creatorEmpId = builder.creatorEmpId;
        this.director = builder.director;
        this.faultVersion = builder.faultVersion;
        this.information = builder.information;
        this.reason = builder.reason;
        this.scope = builder.scope;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaYiBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockId
     */
    public String getBlockId() {
        return this.blockId;
    }

    /**
     * @return blockTimes
     */
    public java.util.List<BlockTimes> getBlockTimes() {
        return this.blockTimes;
    }

    /**
     * @return blockType
     */
    public String getBlockType() {
        return this.blockType;
    }

    /**
     * @return creatorEmpId
     */
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    /**
     * @return director
     */
    public java.util.List<String> getDirector() {
        return this.director;
    }

    /**
     * @return faultVersion
     */
    public String getFaultVersion() {
        return this.faultVersion;
    }

    /**
     * @return information
     */
    public java.util.List<String> getInformation() {
        return this.information;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return scope
     */
    public Scope getScope() {
        return this.scope;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMaYiBlockRequest, Builder> {
        private String blockId; 
        private java.util.List<BlockTimes> blockTimes; 
        private String blockType; 
        private String creatorEmpId; 
        private java.util.List<String> director; 
        private String faultVersion; 
        private java.util.List<String> information; 
        private String reason; 
        private Scope scope; 
        private String title; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMaYiBlockRequest request) {
            super(request);
            this.blockId = request.blockId;
            this.blockTimes = request.blockTimes;
            this.blockType = request.blockType;
            this.creatorEmpId = request.creatorEmpId;
            this.director = request.director;
            this.faultVersion = request.faultVersion;
            this.information = request.information;
            this.reason = request.reason;
            this.scope = request.scope;
            this.title = request.title;
            this.type = request.type;
        } 

        /**
         * BlockId.
         */
        public Builder blockId(String blockId) {
            this.putBodyParameter("BlockId", blockId);
            this.blockId = blockId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder blockTimes(java.util.List<BlockTimes> blockTimes) {
            this.putBodyParameter("BlockTimes", blockTimes);
            this.blockTimes = blockTimes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder blockType(String blockType) {
            this.putBodyParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder creatorEmpId(String creatorEmpId) {
            this.putBodyParameter("CreatorEmpId", creatorEmpId);
            this.creatorEmpId = creatorEmpId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder director(java.util.List<String> director) {
            this.putBodyParameter("Director", director);
            this.director = director;
            return this;
        }

        /**
         * FaultVersion.
         */
        public Builder faultVersion(String faultVersion) {
            this.putBodyParameter("FaultVersion", faultVersion);
            this.faultVersion = faultVersion;
            return this;
        }

        /**
         * Information.
         */
        public Builder information(java.util.List<String> information) {
            this.putBodyParameter("Information", information);
            this.information = information;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(Scope scope) {
            String scopeShrink = shrink(scope, "Scope", "json");
            this.putBodyParameter("Scope", scopeShrink);
            this.scope = scope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMaYiBlockRequest build() {
            return new CreateMaYiBlockRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMaYiBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateMaYiBlockRequest</p>
     */
    public static class BlockTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private BlockTimes(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockTimes create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(BlockTimes model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public BlockTimes build() {
                return new BlockTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMaYiBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateMaYiBlockRequest</p>
     */
    public static class GroupBlockScopeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Az")
        private String az;

        @com.aliyun.core.annotation.NameInMap("Idc")
        private String idc;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private GroupBlockScopeParams(Builder builder) {
            this.az = builder.az;
            this.idc = builder.idc;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupBlockScopeParams create() {
            return builder().build();
        }

        /**
         * @return az
         */
        public String getAz() {
            return this.az;
        }

        /**
         * @return idc
         */
        public String getIdc() {
            return this.idc;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String az; 
            private String idc; 
            private String region; 

            private Builder() {
            } 

            private Builder(GroupBlockScopeParams model) {
                this.az = model.az;
                this.idc = model.idc;
                this.region = model.region;
            } 

            /**
             * Az.
             */
            public Builder az(String az) {
                this.az = az;
                return this;
            }

            /**
             * Idc.
             */
            public Builder idc(String idc) {
                this.idc = idc;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public GroupBlockScopeParams build() {
                return new GroupBlockScopeParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMaYiBlockRequest} extends {@link TeaModel}
     *
     * <p>CreateMaYiBlockRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupBlockScopeParams")
        private java.util.List<GroupBlockScopeParams> groupBlockScopeParams;

        private Scope(Builder builder) {
            this.groupBlockScopeParams = builder.groupBlockScopeParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return groupBlockScopeParams
         */
        public java.util.List<GroupBlockScopeParams> getGroupBlockScopeParams() {
            return this.groupBlockScopeParams;
        }

        public static final class Builder {
            private java.util.List<GroupBlockScopeParams> groupBlockScopeParams; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.groupBlockScopeParams = model.groupBlockScopeParams;
            } 

            /**
             * GroupBlockScopeParams.
             */
            public Builder groupBlockScopeParams(java.util.List<GroupBlockScopeParams> groupBlockScopeParams) {
                this.groupBlockScopeParams = groupBlockScopeParams;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
}
