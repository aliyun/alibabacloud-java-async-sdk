// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeStageModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStageModelsResponseBody</p>
 */
public class DescribeStageModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StageModelInfoList")
    private java.util.List<StageModelInfoList> stageModelInfoList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStageModelsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stageModelInfoList = builder.stageModelInfoList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStageModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stageModelInfoList
     */
    public java.util.List<StageModelInfoList> getStageModelInfoList() {
        return this.stageModelInfoList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<StageModelInfoList> stageModelInfoList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeStageModelsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.stageModelInfoList = model.stageModelInfoList;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StageModelInfoList.
         */
        public Builder stageModelInfoList(java.util.List<StageModelInfoList> stageModelInfoList) {
            this.stageModelInfoList = stageModelInfoList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStageModelsResponseBody build() {
            return new DescribeStageModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStageModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStageModelsResponseBody</p>
     */
    public static class StageModelInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("StageAlias")
        private String stageAlias;

        @com.aliyun.core.annotation.NameInMap("StageModelId")
        private String stageModelId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private StageModelInfoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.stageAlias = builder.stageAlias;
            this.stageModelId = builder.stageModelId;
            this.stageName = builder.stageName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageModelInfoList create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return stageAlias
         */
        public String getStageAlias() {
            return this.stageAlias;
        }

        /**
         * @return stageModelId
         */
        public String getStageModelId() {
            return this.stageModelId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String modifiedTime; 
            private String stageAlias; 
            private String stageModelId; 
            private String stageName; 
            private String type; 

            private Builder() {
            } 

            private Builder(StageModelInfoList model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.modifiedTime = model.modifiedTime;
                this.stageAlias = model.stageAlias;
                this.stageModelId = model.stageModelId;
                this.stageName = model.stageName;
                this.type = model.type;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * StageAlias.
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
                return this;
            }

            /**
             * StageModelId.
             */
            public Builder stageModelId(String stageModelId) {
                this.stageModelId = stageModelId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StageModelInfoList build() {
                return new StageModelInfoList(this);
            } 

        } 

    }
}
