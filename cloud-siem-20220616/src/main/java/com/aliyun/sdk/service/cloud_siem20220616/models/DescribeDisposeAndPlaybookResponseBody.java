// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisposeAndPlaybookResponseBody</p>
 */
public class DescribeDisposeAndPlaybookResponseBody extends TeaModel {
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

        private Builder(DescribeDisposeAndPlaybookResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDisposeAndPlaybookResponseBody build() {
            return new DescribeDisposeAndPlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisposeAndPlaybookResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisposeAndPlaybookResponseBody</p>
     */
    public static class PlaybookList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private String available;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpCode")
        private String opCode;

        @com.aliyun.core.annotation.NameInMap("OpLevel")
        private String opLevel;

        @com.aliyun.core.annotation.NameInMap("ParamConfig")
        private java.util.List<?> paramConfig;

        @com.aliyun.core.annotation.NameInMap("TaskConfig")
        private String taskConfig;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("WafPlaybook")
        private Boolean wafPlaybook;

        private PlaybookList(Builder builder) {
            this.available = builder.available;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.opCode = builder.opCode;
            this.opLevel = builder.opLevel;
            this.paramConfig = builder.paramConfig;
            this.taskConfig = builder.taskConfig;
            this.uuid = builder.uuid;
            this.wafPlaybook = builder.wafPlaybook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaybookList create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public String getAvailable() {
            return this.available;
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
         * @return paramConfig
         */
        public java.util.List<?> getParamConfig() {
            return this.paramConfig;
        }

        /**
         * @return taskConfig
         */
        public String getTaskConfig() {
            return this.taskConfig;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return wafPlaybook
         */
        public Boolean getWafPlaybook() {
            return this.wafPlaybook;
        }

        public static final class Builder {
            private String available; 
            private String description; 
            private String displayName; 
            private String name; 
            private String opCode; 
            private String opLevel; 
            private java.util.List<?> paramConfig; 
            private String taskConfig; 
            private String uuid; 
            private Boolean wafPlaybook; 

            private Builder() {
            } 

            private Builder(PlaybookList model) {
                this.available = model.available;
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.opCode = model.opCode;
                this.opLevel = model.opLevel;
                this.paramConfig = model.paramConfig;
                this.taskConfig = model.taskConfig;
                this.uuid = model.uuid;
                this.wafPlaybook = model.wafPlaybook;
            } 

            /**
             * Available.
             */
            public Builder available(String available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The playbook description.</p>
             * 
             * <strong>example:</strong>
             * <p>WafBlockIP</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>WafBlockIP</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The playbook name, which is the unique identifier of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>kill_process_isolate_file</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The opcode of the playbook, which corresponds to the opcode of the playbook recommended for entity handling.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder opCode(String opCode) {
                this.opCode = opCode;
                return this;
            }

            /**
             * <p>Indicates whether quick event handling is selected by default. Valid values:</p>
             * <ul>
             * <li>2: Quick event handling is selected.</li>
             * <li>1: Quick event handling is displayed but not selected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder opLevel(String opLevel) {
                this.opLevel = opLevel;
                return this;
            }

            /**
             * <p>The playbook parameters and the corresponding properties.</p>
             */
            public Builder paramConfig(java.util.List<?> paramConfig) {
                this.paramConfig = paramConfig;
                return this;
            }

            /**
             * <p>The opcode configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;opCode&quot;:&quot;3&quot;}</p>
             */
            public Builder taskConfig(String taskConfig) {
                this.taskConfig = taskConfig;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>Indicates whether the playbook is intended for Web Application Firewall (WAF). Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisposeAndPlaybookResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Integer alertNum;

        @com.aliyun.core.annotation.NameInMap("Dispose")
        private String dispose;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("EntityInfo")
        private java.util.Map<String, ?> entityInfo;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("OpcodeMap")
        private java.util.Map<String, String> opcodeMap;

        @com.aliyun.core.annotation.NameInMap("OpcodeSet")
        private java.util.List<String> opcodeSet;

        @com.aliyun.core.annotation.NameInMap("PlaybookList")
        private java.util.List<PlaybookList> playbookList;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List<?> scope;

        private ResponseData(Builder builder) {
            this.alertNum = builder.alertNum;
            this.dispose = builder.dispose;
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.entityType = builder.entityType;
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
        public java.util.Map<String, ?> getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return opcodeMap
         */
        public java.util.Map<String, String> getOpcodeMap() {
            return this.opcodeMap;
        }

        /**
         * @return opcodeSet
         */
        public java.util.List<String> getOpcodeSet() {
            return this.opcodeSet;
        }

        /**
         * @return playbookList
         */
        public java.util.List<PlaybookList> getPlaybookList() {
            return this.playbookList;
        }

        /**
         * @return scope
         */
        public java.util.List<?> getScope() {
            return this.scope;
        }

        public static final class Builder {
            private Integer alertNum; 
            private String dispose; 
            private Long entityId; 
            private java.util.Map<String, ?> entityInfo; 
            private String entityType; 
            private java.util.Map<String, String> opcodeMap; 
            private java.util.List<String> opcodeSet; 
            private java.util.List<PlaybookList> playbookList; 
            private java.util.List<?> scope; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertNum = model.alertNum;
                this.dispose = model.dispose;
                this.entityId = model.entityId;
                this.entityInfo = model.entityInfo;
                this.entityType = model.entityType;
                this.opcodeMap = model.opcodeMap;
                this.opcodeSet = model.opcodeSet;
                this.playbookList = model.playbookList;
                this.scope = model.scope;
            } 

            /**
             * <p>The number of alerts that are associated with the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * <p>The object for handling.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder dispose(String dispose) {
                this.dispose = dispose;
                return this;
            }

            /**
             * <p>The entity ID</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;file_path&quot;: &quot;c:/www/leixi.jsp&quot;,&quot;file_hash&quot;: &quot;aa0ca926ad948cd820e0a3d9a18c09d0&quot;,&quot;host_uuid&quot;: &quot;efed2cf7-0b77-45d9-a97b-d2cf246bcbb3&quot;,&quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;,&quot;host_name&quot;: &quot;launch-advisor-20230531&quot;}</p>
             */
            public Builder entityInfo(java.util.Map<String, ?> entityInfo) {
                this.entityInfo = entityInfo;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The key-value pairs each of which consists of opcode and oplevel.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder opcodeMap(java.util.Map<String, String> opcodeMap) {
                this.opcodeMap = opcodeMap;
                return this;
            }

            /**
             * <p>The codes of the playbooks that are recommended for entity handling.</p>
             * 
             * <strong>example:</strong>
             * <p>[1,3]</p>
             */
            public Builder opcodeSet(java.util.List<String> opcodeSet) {
                this.opcodeSet = opcodeSet;
                return this;
            }

            /**
             * <p>The playbooks that can handle the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;云安全中心-云服务器安全&quot;,&quot;code&quot;:&quot;1&quot;}]</p>
             */
            public Builder playbookList(java.util.List<PlaybookList> playbookList) {
                this.playbookList = playbookList;
                return this;
            }

            /**
             * <p>The IDs of the users who can handle objects.</p>
             * 
             * <strong>example:</strong>
             * <p>176618589410****</p>
             */
            public Builder scope(java.util.List<?> scope) {
                this.scope = scope;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisposeAndPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisposeAndPlaybookResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

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
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
