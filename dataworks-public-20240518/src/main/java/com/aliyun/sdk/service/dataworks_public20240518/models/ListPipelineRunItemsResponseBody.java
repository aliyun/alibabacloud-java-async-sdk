// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListPipelineRunItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRunItemsResponseBody</p>
 */
public class ListPipelineRunItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPipelineRunItemsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRunItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPipelineRunItemsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to troubleshoot issues if errors occur.</p>
         * 
         * <strong>example:</strong>
         * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPipelineRunItemsResponseBody build() {
            return new ListPipelineRunItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunItemsResponseBody</p>
     */
    public static class PipelineRunItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private PipelineRunItems(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.message = builder.message;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.spec = builder.spec;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRunItems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long createTime; 
            private String id; 
            private String message; 
            private Long modifyTime; 
            private String name; 
            private String spec; 
            private String status; 
            private String type; 
            private Long version; 

            private Builder() {
            } 

            private Builder(PipelineRunItems model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.message = model.message;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.spec = model.spec;
                this.status = model.status;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The deployment creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1724984066000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique identifier of the deployment.</p>
             * <blockquote>
             * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The error message if the deployment failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Error Message</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the deployment was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1724984066000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The deployment name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The FlowSpec information describing this deployment. For detailed specifications, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;version&quot;: &quot;1.1.0&quot;, &quot;kind&quot;: &quot;Node&quot;, &quot;spec&quot;: { &quot;nodes&quot;: [ { &quot;recurrence&quot;: &quot;Normal&quot;, &quot;id&quot;: &quot;860438872620113XXXX&quot;, &quot;timeout&quot;: 0, &quot;instanceMode&quot;: &quot;T+1&quot;, &quot;rerunMode&quot;: &quot;Allowed&quot;, &quot;rerunTimes&quot;: 3, &quot;rerunInterval&quot;: 180000, &quot;datasource&quot;: { &quot;name&quot;: &quot;odps_test&quot;, &quot;type&quot;: &quot;odps&quot; }, &quot;script&quot;: { &quot;language&quot;: &quot;odps-sql&quot;, &quot;path&quot;: &quot;XX/OpenAPI_Test/ODPS_SQL_Test&quot;, &quot;runtime&quot;: { &quot;command&quot;: &quot;ODPS_SQL&quot;, &quot;commandTypeId&quot;: 10 }, &quot;content&quot;: &quot;select now();&quot;, &quot;id&quot;: &quot;853573334108680XXXX&quot; }, &quot;trigger&quot;: { &quot;type&quot;: &quot;Scheduler&quot;, &quot;id&quot;: &quot;543680677872062XXXX&quot;, &quot;cron&quot;: &quot;00 00 00 * * ?&quot;, &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;, &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;, &quot;timezone&quot;: &quot;Asia/Shanghai&quot;, &quot;delaySeconds&quot;: 0 }, &quot;runtimeResource&quot;: { &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;, &quot;id&quot;: &quot;623731286945488XXXX&quot;, &quot;resourceGroupId&quot;: &quot;7201XXXX&quot; }, &quot;name&quot;: &quot;ODPS_SQL_Test&quot;, &quot;owner&quot;: &quot;110755000425XXXX&quot;, &quot;metadata&quot;: { &quot;owner&quot;: &quot;110755000425XXXX&quot;, &quot;ownerName&quot;: &quot;<a href="mailto:XXXXX@test.XXX.com">XXXXX@test.XXX.com</a>&quot;, &quot;projectId&quot;: &quot;307XXX&quot; }, &quot;inputs&quot;: { &quot;nodeOutputs&quot;: [ { &quot;data&quot;: &quot;lwttest_standard_root&quot;, &quot;artifactType&quot;: &quot;NodeOutput&quot; } ] }, &quot;outputs&quot;: { &quot;nodeOutputs&quot;: [ { &quot;data&quot;: &quot;860438872620113XXXX&quot;, &quot;artifactType&quot;: &quot;NodeOutput&quot;, &quot;refTableName&quot;: &quot;ODPS_SQL_Test&quot;, &quot;isDefault&quot;: true } ] } } ], &quot;flow&quot;: [ { &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;, &quot;depends&quot;: [ { &quot;type&quot;: &quot;Normal&quot;, &quot;output&quot;: &quot;lwttest_standard_root&quot; } ] } ] }, &quot;metadata&quot;: { &quot;uuid&quot;: &quot;860438872620113XXXX&quot; } }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The deployment status. Valid values:</p>
             * <ul>
             * <li>Init: Initializing</li>
             * <li>Running</li>
             * <li>Success</li>
             * <li>Fail</li>
             * <li>Termination</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The deployment type. Valid values:</p>
             * <ul>
             * <li>Node</li>
             * <li>WorkflowDefinition: Workflow definition.</li>
             * <li>Resource</li>
             * <li>Function: The object is a function.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The deployment version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public PipelineRunItems build() {
                return new PipelineRunItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelineRunItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunItemsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PipelineRunItems")
        private java.util.List<PipelineRunItems> pipelineRunItems;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.pipelineRunItems = builder.pipelineRunItems;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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
         * @return pipelineRunItems
         */
        public java.util.List<PipelineRunItems> getPipelineRunItems() {
            return this.pipelineRunItems;
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
            private java.util.List<PipelineRunItems> pipelineRunItems; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.pipelineRunItems = model.pipelineRunItems;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * <p>The list of deployments.</p>
             */
            public Builder pipelineRunItems(java.util.List<PipelineRunItems> pipelineRunItems) {
                this.pipelineRunItems = pipelineRunItems;
                return this;
            }

            /**
             * <p>The total number of entries that match the conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
