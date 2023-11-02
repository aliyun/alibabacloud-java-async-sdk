// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisposeAndPlaybookResponseBody</p>
 */
public class DescribeDisposeAndPlaybookResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDisposeAndPlaybookResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisposeAndPlaybookResponseBody create() {
        return builder().build();
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

        public DescribeDisposeAndPlaybookResponseBody build() {
            return new DescribeDisposeAndPlaybookResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
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

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class PlaybookList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Name")
        private String name;

        @NameInMap("OpCode")
        private String opCode;

        @NameInMap("OpLevel")
        private String opLevel;

        @NameInMap("TaskConfig")
        private String taskConfig;

        @NameInMap("WafPlaybook")
        private Boolean wafPlaybook;

        private PlaybookList(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.opCode = builder.opCode;
            this.opLevel = builder.opLevel;
            this.taskConfig = builder.taskConfig;
            this.wafPlaybook = builder.wafPlaybook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaybookList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opCode
         */
        public String getOpCode() {
            return this.opCode;
        }

        /**
         * @return opLevel
         */
        public String getOpLevel() {
            return this.opLevel;
        }

        /**
         * @return taskConfig
         */
        public String getTaskConfig() {
            return this.taskConfig;
        }

        /**
         * @return wafPlaybook
         */
        public Boolean getWafPlaybook() {
            return this.wafPlaybook;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private String opCode; 
            private String opLevel; 
            private String taskConfig; 
            private Boolean wafPlaybook; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpCode.
             */
            public Builder opCode(String opCode) {
                this.opCode = opCode;
                return this;
            }

            /**
             * OpLevel.
             */
            public Builder opLevel(String opLevel) {
                this.opLevel = opLevel;
                return this;
            }

            /**
             * TaskConfig.
             */
            public Builder taskConfig(String taskConfig) {
                this.taskConfig = taskConfig;
                return this;
            }

            /**
             * WafPlaybook.
             */
            public Builder wafPlaybook(Boolean wafPlaybook) {
                this.wafPlaybook = wafPlaybook;
                return this;
            }

            public PlaybookList build() {
                return new PlaybookList(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @NameInMap("AlertNum")
        private Integer alertNum;

        @NameInMap("Dispose")
        private String dispose;

        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("EntityInfo")
        private java.util.Map < String, ? > entityInfo;

        @NameInMap("OpcodeMap")
        private java.util.Map < String, String > opcodeMap;

        @NameInMap("OpcodeSet")
        private java.util.List < String > opcodeSet;

        @NameInMap("PlaybookList")
        private java.util.List < PlaybookList> playbookList;

        @NameInMap("Scope")
        private java.util.List < ? > scope;

        private ResponseData(Builder builder) {
            this.alertNum = builder.alertNum;
            this.dispose = builder.dispose;
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.opcodeMap = builder.opcodeMap;
            this.opcodeSet = builder.opcodeSet;
            this.playbookList = builder.playbookList;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return dispose
         */
        public String getDispose() {
            return this.dispose;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityInfo
         */
        public java.util.Map < String, ? > getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return opcodeMap
         */
        public java.util.Map < String, String > getOpcodeMap() {
            return this.opcodeMap;
        }

        /**
         * @return opcodeSet
         */
        public java.util.List < String > getOpcodeSet() {
            return this.opcodeSet;
        }

        /**
         * @return playbookList
         */
        public java.util.List < PlaybookList> getPlaybookList() {
            return this.playbookList;
        }

        /**
         * @return scope
         */
        public java.util.List < ? > getScope() {
            return this.scope;
        }

        public static final class Builder {
            private Integer alertNum; 
            private String dispose; 
            private Long entityId; 
            private java.util.Map < String, ? > entityInfo; 
            private java.util.Map < String, String > opcodeMap; 
            private java.util.List < String > opcodeSet; 
            private java.util.List < PlaybookList> playbookList; 
            private java.util.List < ? > scope; 

            /**
             * AlertNum.
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * Dispose.
             */
            public Builder dispose(String dispose) {
                this.dispose = dispose;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityInfo.
             */
            public Builder entityInfo(java.util.Map < String, ? > entityInfo) {
                this.entityInfo = entityInfo;
                return this;
            }

            /**
             * OpcodeMap.
             */
            public Builder opcodeMap(java.util.Map < String, String > opcodeMap) {
                this.opcodeMap = opcodeMap;
                return this;
            }

            /**
             * OpcodeSet.
             */
            public Builder opcodeSet(java.util.List < String > opcodeSet) {
                this.opcodeSet = opcodeSet;
                return this;
            }

            /**
             * PlaybookList.
             */
            public Builder playbookList(java.util.List < PlaybookList> playbookList) {
                this.playbookList = playbookList;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(java.util.List < ? > scope) {
                this.scope = scope;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageInfo")
        private PageInfo pageInfo;

        @NameInMap("ResponseData")
        private java.util.List < ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List < ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List < ResponseData> responseData; 

            /**
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * ResponseData.
             */
            public Builder responseData(java.util.List < ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
