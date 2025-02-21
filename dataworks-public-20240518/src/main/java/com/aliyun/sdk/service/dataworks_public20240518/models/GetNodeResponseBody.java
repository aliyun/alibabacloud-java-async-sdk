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
 * {@link GetNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeResponseBody</p>
 */
public class GetNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Node")
    private Node node;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNodeResponseBody(Builder builder) {
        this.node = builder.node;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return node
     */
    public Node getNode() {
        return this.node;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Node node; 
        private String requestId; 

        /**
         * <p>The information about the node.</p>
         */
        public Builder node(Node node) {
            this.node = node;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodeResponseBody build() {
            return new GetNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Node(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.spec = builder.spec;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
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
        public Long getId() {
            return this.id;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long createTime; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String spec; 
            private Long taskId; 

            /**
             * <p>The time when the node was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700539206000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the node was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700539206000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Node name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>196596664824XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The FlowSpec field information about this node. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;version&quot;: &quot;1.1.0&quot;,
             *     &quot;kind&quot;: &quot;Node&quot;,
             *     &quot;spec&quot;: {
             *         &quot;nodes&quot;: [
             *             {
             *                 &quot;recurrence&quot;: &quot;Normal&quot;,
             *                 &quot;id&quot;: &quot;860438872620113XXXX&quot;,
             *                 &quot;timeout&quot;: 0,
             *                 &quot;instanceMode&quot;: &quot;T+1&quot;,
             *                 &quot;rerunMode&quot;: &quot;Allowed&quot;,
             *                 &quot;rerunTimes&quot;: 3,
             *                 &quot;rerunInterval&quot;: 180000,
             *                 &quot;datasource&quot;: {
             *                     &quot;name&quot;: &quot;odps_test&quot;,
             *                     &quot;type&quot;: &quot;odps&quot;
             *                 },
             *                 &quot;script&quot;: {
             *                     &quot;language&quot;: &quot;odps-sql&quot;,
             *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/ODPS_SQL_Test&quot;,
             *                     &quot;runtime&quot;: {
             *                         &quot;command&quot;: &quot;ODPS_SQL&quot;,
             *                         &quot;commandTypeId&quot;: 10
             *                     },
             *                     &quot;content&quot;: &quot;select now();&quot;,
             *                     &quot;id&quot;: &quot;853573334108680XXXX&quot;
             *                 },
             *                 &quot;trigger&quot;: {
             *                     &quot;type&quot;: &quot;Scheduler&quot;,
             *                     &quot;id&quot;: &quot;543680677872062XXXX&quot;,
             *                     &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
             *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
             *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
             *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
             *                     &quot;delaySeconds&quot;: 0
             *                 },
             *                 &quot;runtimeResource&quot;: {
             *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;,
             *                     &quot;id&quot;: &quot;623731286945488XXXX&quot;,
             *                     &quot;resourceGroupId&quot;: &quot;7201XXXX&quot;
             *                 },
             *                 &quot;name&quot;: &quot;ODPS_SQL_Test&quot;,
             *                 &quot;owner&quot;: &quot;110755000425XXXX&quot;,
             *                 &quot;metadata&quot;: {
             *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;,
             *                     &quot;ownerName&quot;: &quot;<a href="mailto:XXXXX@test.XXX.com">XXXXX@test.XXX.com</a>&quot;,
             *                     &quot;projectId&quot;: &quot;307XXX&quot;
             *                 },
             *                 &quot;inputs&quot;: {
             *                     &quot;nodeOutputs&quot;: [
             *                         {
             *                             &quot;data&quot;: &quot;lwttest_standard_root&quot;,
             *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;
             *                         }
             *                     ]
             *                 },
             *                 &quot;outputs&quot;: {
             *                     &quot;nodeOutputs&quot;: [
             *                         {
             *                             &quot;data&quot;: &quot;860438872620113XXXX&quot;,
             *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
             *                             &quot;refTableName&quot;: &quot;ODPS_SQL_Test&quot;,
             *                             &quot;isDefault&quot;: true
             *                         }
             *                     ]
             *                 }
             *             }
             *         ],
             *         &quot;flow&quot;: [
             *             {
             *                 &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;,
             *                 &quot;depends&quot;: [
             *                     {
             *                         &quot;type&quot;: &quot;Normal&quot;,
             *                         &quot;output&quot;: &quot;lwttest_standard_root&quot;
             *                     }
             *                 ]
             *             }
             *         ]
             *     },
             *     &quot;metadata&quot;: {
             *         &quot;uuid&quot;: &quot;860438872620113XXXX&quot;
             *     }
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The Id of the scheduled task after the node is published.</p>
             * 
             * <strong>example:</strong>
             * <p>700006680527</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
