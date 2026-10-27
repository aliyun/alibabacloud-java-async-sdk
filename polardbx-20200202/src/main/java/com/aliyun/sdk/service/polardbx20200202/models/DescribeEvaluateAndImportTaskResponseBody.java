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
 * {@link DescribeEvaluateAndImportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEvaluateAndImportTaskResponseBody</p>
 */
public class DescribeEvaluateAndImportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEvaluateAndImportTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEvaluateAndImportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeEvaluateAndImportTaskResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. This parameter is empty when the request succeeds. When the request fails, an exception message is returned, such as an error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73559800-****-11ec-bd40-99cfcff3fe1e</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEvaluateAndImportTaskResponseBody build() {
            return new DescribeEvaluateAndImportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEvaluateAndImportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEvaluateAndImportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

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
            this.context = builder.context;
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
         * @return context
         */
        public String getContext() {
            return this.context;
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
            private String context; 
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
                this.context = model.context;
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
             * <p>The business ID of the import task.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The summary information.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;structureImportResult\&quot;:{\&quot;status\&quot;:\&quot;finish\&quot;,\&quot;finishedNum\&quot;:382,\&quot;totalNum\&quot;:382,\&quot;percentage\&quot;:100},\&quot;switchTips\&quot;:\&quot;Forward switchover is allowed only when the forward synchronization latency is low\&quot;,\&quot;autoTableSuggestionSwitch\&quot;:false,\&quot;structureAlterationMap\&quot;:{},\&quot;acceptFilterMap\&quot;:{\&quot;fr_import\&quot;:[\&quot;dy_dr_new\&quot;],\&quot;e3plus_drp_prod_new\&quot;:[],\&quot;qbtong_prod\&quot;:[],\&quot;e3plus_account_prod\&quot;:[],\&quot;e3plus_drp_prod\&quot;:[]},\&quot;structChunkMap\&quot;:{},\&quot;count\&quot;:1,\&quot;requestId\&quot;:\&quot;9380D025-C9B1-51D6-A4B9-733C4879CC4A\&quot;}&quot;,</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The creator of the import task.</p>
             * 
             * <strong>example:</strong>
             * <p>346650</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Indicates whether the import task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The timestamp when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-08T15:00Z</p>
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1605080537000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>76251</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the slink destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>fr_import</p>
             */
            public Builder slinkDstDb(String slinkDstDb) {
                this.slinkDstDb = slinkDstDb;
                return this;
            }

            /**
             * <p>The instance ID of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrehc60jz5zye</p>
             */
            public Builder slinkDstResId(String slinkDstResId) {
                this.slinkDstResId = slinkDstResId;
                return this;
            }

            /**
             * <p>The username for the data connection of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>dts_dtdba</p>
             */
            public Builder slinkDstUserName(String slinkDstUserName) {
                this.slinkDstUserName = slinkDstUserName;
                return this;
            }

            /**
             * <p>The name of the slink source database.</p>
             * 
             * <strong>example:</strong>
             * <p>fr_import</p>
             */
            public Builder slinkSrcDb(String slinkSrcDb) {
                this.slinkSrcDb = slinkSrcDb;
                return this;
            }

            /**
             * <p>The instance ID of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>drdshbga69378w4p</p>
             */
            public Builder slinkSrcResId(String slinkSrcResId) {
                this.slinkSrcResId = slinkSrcResId;
                return this;
            }

            /**
             * <p>The resource type of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>POLARX1</p>
             */
            public Builder slinkSrcResType(String slinkSrcResType) {
                this.slinkSrcResType = slinkSrcResType;
                return this;
            }

            /**
             * <p>The username for the data connection of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>dtdba</p>
             */
            public Builder slinkSrcUserName(String slinkSrcUserName) {
                this.slinkSrcUserName = slinkSrcUserName;
                return this;
            }

            /**
             * <p>The stage of the synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_IMPORT_RUNNING</p>
             */
            public Builder slinkStage(String slinkStage) {
                this.slinkStage = slinkStage;
                return this;
            }

            /**
             * <p>The running status of the synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>IMPORT_RUNNING</p>
             */
            public Builder slinkStatus(String slinkStatus) {
                this.slinkStatus = slinkStatus;
                return this;
            }

            /**
             * <p>The description of the slink task.</p>
             * 
             * <strong>example:</strong>
             * <p>drdsprod_to_2.0</p>
             */
            public Builder slinkTaskDesc(String slinkTaskDesc) {
                this.slinkTaskDesc = slinkTaskDesc;
                return this;
            }

            /**
             * <p>The slink task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>etx-szr2rr6i*****</p>
             */
            public Builder slinkTaskId(String slinkTaskId) {
                this.slinkTaskId = slinkTaskId;
                return this;
            }

            /**
             * <p>The synchronization type.</p>
             * 
             * <strong>example:</strong>
             * <p>evaluate_import</p>
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
