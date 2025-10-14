// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeEvaluateAndImportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEvaluateAndImportTasksResponseBody</p>
 */
public class DescribeEvaluateAndImportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Long totalNumber;

    private DescribeEvaluateAndImportTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEvaluateAndImportTasksResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return totalNumber
     */
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalNumber; 

        private Builder() {
        } 

        private Builder(DescribeEvaluateAndImportTasksResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalNumber.
         */
        public Builder totalNumber(Long totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public DescribeEvaluateAndImportTasksResponseBody build() {
            return new DescribeEvaluateAndImportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEvaluateAndImportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEvaluateAndImportTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Long gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SlinkDstDb")
        private String slinkDstDb;

        @com.aliyun.core.annotation.NameInMap("SlinkDstResId")
        private String slinkDstResId;

        @com.aliyun.core.annotation.NameInMap("SlinkDstUserName")
        private String slinkDstUserName;

        @com.aliyun.core.annotation.NameInMap("SlinkSrcDb")
        private String slinkSrcDb;

        @com.aliyun.core.annotation.NameInMap("SlinkSrcResId")
        private String slinkSrcResId;

        @com.aliyun.core.annotation.NameInMap("SlinkSrcResType")
        private String slinkSrcResType;

        @com.aliyun.core.annotation.NameInMap("SlinkSrcUserName")
        private String slinkSrcUserName;

        @com.aliyun.core.annotation.NameInMap("SlinkStage")
        private String slinkStage;

        @com.aliyun.core.annotation.NameInMap("SlinkStatus")
        private String slinkStatus;

        @com.aliyun.core.annotation.NameInMap("SlinkTaskDesc")
        private String slinkTaskDesc;

        @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
        private String slinkTaskId;

        @com.aliyun.core.annotation.NameInMap("SlinkType")
        private String slinkType;

        private Data(Builder builder) {
            this.bid = builder.bid;
            this.creator = builder.creator;
            this.deleted = builder.deleted;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.slinkDstDb = builder.slinkDstDb;
            this.slinkDstResId = builder.slinkDstResId;
            this.slinkDstUserName = builder.slinkDstUserName;
            this.slinkSrcDb = builder.slinkSrcDb;
            this.slinkSrcResId = builder.slinkSrcResId;
            this.slinkSrcResType = builder.slinkSrcResType;
            this.slinkSrcUserName = builder.slinkSrcUserName;
            this.slinkStage = builder.slinkStage;
            this.slinkStatus = builder.slinkStatus;
            this.slinkTaskDesc = builder.slinkTaskDesc;
            this.slinkTaskId = builder.slinkTaskId;
            this.slinkType = builder.slinkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return slinkDstDb
         */
        public String getSlinkDstDb() {
            return this.slinkDstDb;
        }

        /**
         * @return slinkDstResId
         */
        public String getSlinkDstResId() {
            return this.slinkDstResId;
        }

        /**
         * @return slinkDstUserName
         */
        public String getSlinkDstUserName() {
            return this.slinkDstUserName;
        }

        /**
         * @return slinkSrcDb
         */
        public String getSlinkSrcDb() {
            return this.slinkSrcDb;
        }

        /**
         * @return slinkSrcResId
         */
        public String getSlinkSrcResId() {
            return this.slinkSrcResId;
        }

        /**
         * @return slinkSrcResType
         */
        public String getSlinkSrcResType() {
            return this.slinkSrcResType;
        }

        /**
         * @return slinkSrcUserName
         */
        public String getSlinkSrcUserName() {
            return this.slinkSrcUserName;
        }

        /**
         * @return slinkStage
         */
        public String getSlinkStage() {
            return this.slinkStage;
        }

        /**
         * @return slinkStatus
         */
        public String getSlinkStatus() {
            return this.slinkStatus;
        }

        /**
         * @return slinkTaskDesc
         */
        public String getSlinkTaskDesc() {
            return this.slinkTaskDesc;
        }

        /**
         * @return slinkTaskId
         */
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        /**
         * @return slinkType
         */
        public String getSlinkType() {
            return this.slinkType;
        }

        public static final class Builder {
            private String bid; 
            private String creator; 
            private Boolean deleted; 
            private Long gmtCreated; 
            private Long gmtModified; 
            private Long id; 
            private String regionId; 
            private String slinkDstDb; 
            private String slinkDstResId; 
            private String slinkDstUserName; 
            private String slinkSrcDb; 
            private String slinkSrcResId; 
            private String slinkSrcResType; 
            private String slinkSrcUserName; 
            private String slinkStage; 
            private String slinkStatus; 
            private String slinkTaskDesc; 
            private String slinkTaskId; 
            private String slinkType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bid = model.bid;
                this.creator = model.creator;
                this.deleted = model.deleted;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.regionId = model.regionId;
                this.slinkDstDb = model.slinkDstDb;
                this.slinkDstResId = model.slinkDstResId;
                this.slinkDstUserName = model.slinkDstUserName;
                this.slinkSrcDb = model.slinkSrcDb;
                this.slinkSrcResId = model.slinkSrcResId;
                this.slinkSrcResType = model.slinkSrcResType;
                this.slinkSrcUserName = model.slinkSrcUserName;
                this.slinkStage = model.slinkStage;
                this.slinkStatus = model.slinkStatus;
                this.slinkTaskDesc = model.slinkTaskDesc;
                this.slinkTaskId = model.slinkTaskId;
                this.slinkType = model.slinkType;
            } 

            /**
             * Bid.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SlinkDstDb.
             */
            public Builder slinkDstDb(String slinkDstDb) {
                this.slinkDstDb = slinkDstDb;
                return this;
            }

            /**
             * SlinkDstResId.
             */
            public Builder slinkDstResId(String slinkDstResId) {
                this.slinkDstResId = slinkDstResId;
                return this;
            }

            /**
             * SlinkDstUserName.
             */
            public Builder slinkDstUserName(String slinkDstUserName) {
                this.slinkDstUserName = slinkDstUserName;
                return this;
            }

            /**
             * SlinkSrcDb.
             */
            public Builder slinkSrcDb(String slinkSrcDb) {
                this.slinkSrcDb = slinkSrcDb;
                return this;
            }

            /**
             * SlinkSrcResId.
             */
            public Builder slinkSrcResId(String slinkSrcResId) {
                this.slinkSrcResId = slinkSrcResId;
                return this;
            }

            /**
             * SlinkSrcResType.
             */
            public Builder slinkSrcResType(String slinkSrcResType) {
                this.slinkSrcResType = slinkSrcResType;
                return this;
            }

            /**
             * SlinkSrcUserName.
             */
            public Builder slinkSrcUserName(String slinkSrcUserName) {
                this.slinkSrcUserName = slinkSrcUserName;
                return this;
            }

            /**
             * SlinkStage.
             */
            public Builder slinkStage(String slinkStage) {
                this.slinkStage = slinkStage;
                return this;
            }

            /**
             * SlinkStatus.
             */
            public Builder slinkStatus(String slinkStatus) {
                this.slinkStatus = slinkStatus;
                return this;
            }

            /**
             * SlinkTaskDesc.
             */
            public Builder slinkTaskDesc(String slinkTaskDesc) {
                this.slinkTaskDesc = slinkTaskDesc;
                return this;
            }

            /**
             * SlinkTaskId.
             */
            public Builder slinkTaskId(String slinkTaskId) {
                this.slinkTaskId = slinkTaskId;
                return this;
            }

            /**
             * SlinkType.
             */
            public Builder slinkType(String slinkType) {
                this.slinkType = slinkType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
