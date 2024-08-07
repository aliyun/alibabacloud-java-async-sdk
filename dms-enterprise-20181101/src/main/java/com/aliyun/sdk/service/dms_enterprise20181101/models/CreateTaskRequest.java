// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GraphParam")
    private String graphParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeContent")
    private String nodeContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeOutput")
    private String nodeOutput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeVariables")
    private String timeVariables;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.graphParam = builder.graphParam;
        this.nodeContent = builder.nodeContent;
        this.nodeName = builder.nodeName;
        this.nodeOutput = builder.nodeOutput;
        this.nodeType = builder.nodeType;
        this.tid = builder.tid;
        this.timeVariables = builder.timeVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return graphParam
     */
    public String getGraphParam() {
        return this.graphParam;
    }

    /**
     * @return nodeContent
     */
    public String getNodeContent() {
        return this.nodeContent;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeOutput
     */
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return timeVariables
     */
    public String getTimeVariables() {
        return this.timeVariables;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private String graphParam; 
        private String nodeContent; 
        private String nodeName; 
        private String nodeOutput; 
        private String nodeType; 
        private Long tid; 
        private String timeVariables; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.graphParam = request.graphParam;
            this.nodeContent = request.nodeContent;
            this.nodeName = request.nodeName;
            this.nodeOutput = request.nodeOutput;
            this.nodeType = request.nodeType;
            this.tid = request.tid;
            this.timeVariables = request.timeVariables;
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
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The position of the node on the Directed Acyclic Graph (DAG).
         */
        public Builder graphParam(String graphParam) {
            this.putQueryParameter("GraphParam", graphParam);
            this.graphParam = graphParam;
            return this;
        }

        /**
         * The configuration of the node.
         */
        public Builder nodeContent(String nodeContent) {
            this.putQueryParameter("NodeContent", nodeContent);
            this.nodeContent = nodeContent;
            return this;
        }

        /**
         * The name of the node that you want to create.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The output variables configured for the task.
         */
        public Builder nodeOutput(String nodeOutput) {
            this.putQueryParameter("NodeOutput", nodeOutput);
            this.nodeOutput = nodeOutput;
            return this;
        }

        /**
         * The type of the node that you want to create. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * The tenant ID.
         * <p>
         * 
         * >  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The time variables configured for the node.
         */
        public Builder timeVariables(String timeVariables) {
            this.putQueryParameter("TimeVariables", timeVariables);
            this.timeVariables = timeVariables;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
