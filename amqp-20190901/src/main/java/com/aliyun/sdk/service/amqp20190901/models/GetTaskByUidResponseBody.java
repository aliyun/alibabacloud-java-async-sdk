// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetTaskByUidResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskByUidResponseBody</p>
 */
public class GetTaskByUidResponseBody extends TeaModel {
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

    private GetTaskByUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskByUidResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTaskByUidResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
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

        public GetTaskByUidResponseBody build() {
            return new GetTaskByUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskByUidResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskByUidResponseBody</p>
     */
    public static class ImportDefinitionTaskDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingNum")
        private Integer bindingNum;

        @com.aliyun.core.annotation.NameInMap("ExchangeNum")
        private Integer exchangeNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImportType")
        private Integer importType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("QueueNum")
        private Integer queueNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        @com.aliyun.core.annotation.NameInMap("VhostNum")
        private Integer vhostNum;

        private ImportDefinitionTaskDO(Builder builder) {
            this.bindingNum = builder.bindingNum;
            this.exchangeNum = builder.exchangeNum;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.importType = builder.importType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.queueNum = builder.queueNum;
            this.status = builder.status;
            this.userId = builder.userId;
            this.vhostName = builder.vhostName;
            this.vhostNum = builder.vhostNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportDefinitionTaskDO create() {
            return builder().build();
        }

        /**
         * @return bindingNum
         */
        public Integer getBindingNum() {
            return this.bindingNum;
        }

        /**
         * @return exchangeNum
         */
        public Integer getExchangeNum() {
            return this.exchangeNum;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return importType
         */
        public Integer getImportType() {
            return this.importType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return queueNum
         */
        public Integer getQueueNum() {
            return this.queueNum;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return vhostName
         */
        public String getVhostName() {
            return this.vhostName;
        }

        /**
         * @return vhostNum
         */
        public Integer getVhostNum() {
            return this.vhostNum;
        }

        public static final class Builder {
            private Integer bindingNum; 
            private Integer exchangeNum; 
            private String gmtCreate; 
            private Long id; 
            private Integer importType; 
            private String instanceId; 
            private String instanceName; 
            private Integer queueNum; 
            private Integer status; 
            private Long userId; 
            private String vhostName; 
            private Integer vhostNum; 

            private Builder() {
            } 

            private Builder(ImportDefinitionTaskDO model) {
                this.bindingNum = model.bindingNum;
                this.exchangeNum = model.exchangeNum;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.importType = model.importType;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.queueNum = model.queueNum;
                this.status = model.status;
                this.userId = model.userId;
                this.vhostName = model.vhostName;
                this.vhostNum = model.vhostNum;
            } 

            /**
             * BindingNum.
             */
            public Builder bindingNum(Integer bindingNum) {
                this.bindingNum = bindingNum;
                return this;
            }

            /**
             * ExchangeNum.
             */
            public Builder exchangeNum(Integer exchangeNum) {
                this.exchangeNum = exchangeNum;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * ImportType.
             */
            public Builder importType(Integer importType) {
                this.importType = importType;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * QueueNum.
             */
            public Builder queueNum(Integer queueNum) {
                this.queueNum = queueNum;
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
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VhostName.
             */
            public Builder vhostName(String vhostName) {
                this.vhostName = vhostName;
                return this;
            }

            /**
             * VhostNum.
             */
            public Builder vhostNum(Integer vhostNum) {
                this.vhostNum = vhostNum;
                return this;
            }

            public ImportDefinitionTaskDO build() {
                return new ImportDefinitionTaskDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskByUidResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskByUidResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImportDefinitionTaskDO")
        private java.util.List<ImportDefinitionTaskDO> importDefinitionTaskDO;

        private VoList(Builder builder) {
            this.importDefinitionTaskDO = builder.importDefinitionTaskDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return importDefinitionTaskDO
         */
        public java.util.List<ImportDefinitionTaskDO> getImportDefinitionTaskDO() {
            return this.importDefinitionTaskDO;
        }

        public static final class Builder {
            private java.util.List<ImportDefinitionTaskDO> importDefinitionTaskDO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.importDefinitionTaskDO = model.importDefinitionTaskDO;
            } 

            /**
             * ImportDefinitionTaskDO.
             */
            public Builder importDefinitionTaskDO(java.util.List<ImportDefinitionTaskDO> importDefinitionTaskDO) {
                this.importDefinitionTaskDO = importDefinitionTaskDO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskByUidResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskByUidResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private VoList voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voList = builder.voList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voList
         */
        public VoList getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 
            private VoList voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voList = model.voList;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoList.
             */
            public Builder voList(VoList voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
