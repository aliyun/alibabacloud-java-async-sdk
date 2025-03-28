// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link RunCycleDagNodesRequest} extends {@link RequestModel}
 *
 * <p>RunCycleDagNodesRequest</p>
 */
public class RunCycleDagNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertNoticeType")
    private String alertNoticeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizBeginTime")
    private String bizBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizEndTime")
    private String bizEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConcurrentRuns")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer concurrentRuns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndBizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endBizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeNodeIds")
    private String excludeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeNodeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String includeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeParams")
    private String nodeParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean parallelism;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RootNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long rootNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartBizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startBizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartFutureInstanceImmediately")
    private Boolean startFutureInstanceImmediately;

    private RunCycleDagNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNoticeType = builder.alertNoticeType;
        this.alertType = builder.alertType;
        this.bizBeginTime = builder.bizBeginTime;
        this.bizEndTime = builder.bizEndTime;
        this.concurrentRuns = builder.concurrentRuns;
        this.endBizDate = builder.endBizDate;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.includeNodeIds = builder.includeNodeIds;
        this.name = builder.name;
        this.nodeParams = builder.nodeParams;
        this.parallelism = builder.parallelism;
        this.projectEnv = builder.projectEnv;
        this.rootNodeId = builder.rootNodeId;
        this.startBizDate = builder.startBizDate;
        this.startFutureInstanceImmediately = builder.startFutureInstanceImmediately;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCycleDagNodesRequest create() {
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
     * @return alertNoticeType
     */
    public String getAlertNoticeType() {
        return this.alertNoticeType;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return bizBeginTime
     */
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    /**
     * @return bizEndTime
     */
    public String getBizEndTime() {
        return this.bizEndTime;
    }

    /**
     * @return concurrentRuns
     */
    public Integer getConcurrentRuns() {
        return this.concurrentRuns;
    }

    /**
     * @return endBizDate
     */
    public String getEndBizDate() {
        return this.endBizDate;
    }

    /**
     * @return excludeNodeIds
     */
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    /**
     * @return includeNodeIds
     */
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeParams
     */
    public String getNodeParams() {
        return this.nodeParams;
    }

    /**
     * @return parallelism
     */
    public Boolean getParallelism() {
        return this.parallelism;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return rootNodeId
     */
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    /**
     * @return startBizDate
     */
    public String getStartBizDate() {
        return this.startBizDate;
    }

    /**
     * @return startFutureInstanceImmediately
     */
    public Boolean getStartFutureInstanceImmediately() {
        return this.startFutureInstanceImmediately;
    }

    public static final class Builder extends Request.Builder<RunCycleDagNodesRequest, Builder> {
        private String regionId; 
        private String alertNoticeType; 
        private String alertType; 
        private String bizBeginTime; 
        private String bizEndTime; 
        private Integer concurrentRuns; 
        private String endBizDate; 
        private String excludeNodeIds; 
        private String includeNodeIds; 
        private String name; 
        private String nodeParams; 
        private Boolean parallelism; 
        private String projectEnv; 
        private Long rootNodeId; 
        private String startBizDate; 
        private Boolean startFutureInstanceImmediately; 

        private Builder() {
            super();
        } 

        private Builder(RunCycleDagNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNoticeType = request.alertNoticeType;
            this.alertType = request.alertType;
            this.bizBeginTime = request.bizBeginTime;
            this.bizEndTime = request.bizEndTime;
            this.concurrentRuns = request.concurrentRuns;
            this.endBizDate = request.endBizDate;
            this.excludeNodeIds = request.excludeNodeIds;
            this.includeNodeIds = request.includeNodeIds;
            this.name = request.name;
            this.nodeParams = request.nodeParams;
            this.parallelism = request.parallelism;
            this.projectEnv = request.projectEnv;
            this.rootNodeId = request.rootNodeId;
            this.startBizDate = request.startBizDate;
            this.startFutureInstanceImmediately = request.startFutureInstanceImmediately;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The alert notification method. Valid values:</p>
         * <ul>
         * <li>SMS</li>
         * <li>MAIL</li>
         * <li>SMS_MAIL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        public Builder alertNoticeType(String alertNoticeType) {
            this.putBodyParameter("AlertNoticeType", alertNoticeType);
            this.alertNoticeType = alertNoticeType;
            return this;
        }

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>SUCCESS: An alert is generated when data backfill succeeds.</li>
         * <li>FAILURE: An alert is generated when data backfill fails.</li>
         * <li>SUCCESS_FAILURE: An alert is generated regardless of whether data backfill succeeds or fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILURE</p>
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The time when the node starts to run. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        public Builder bizBeginTime(String bizBeginTime) {
            this.putBodyParameter("BizBeginTime", bizBeginTime);
            this.bizBeginTime = bizBeginTime;
            return this;
        }

        /**
         * <p>The time when the node stops running. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00:00</p>
         */
        public Builder bizEndTime(String bizEndTime) {
            this.putBodyParameter("BizEndTime", bizEndTime);
            this.bizEndTime = bizEndTime;
            return this;
        }

        /**
         * <p>The number of nodes that can run in parallel. Valid values: 2 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder concurrentRuns(Integer concurrentRuns) {
            this.putBodyParameter("ConcurrentRuns", concurrentRuns);
            this.concurrentRuns = concurrentRuns;
            return this;
        }

        /**
         * <p>The data timestamp at which data is no longer backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-21 00:00:00</p>
         */
        public Builder endBizDate(String endBizDate) {
            this.putBodyParameter("EndBizDate", endBizDate);
            this.endBizDate = endBizDate;
            return this;
        }

        /**
         * <p>The IDs of the nodes for which no data needs to be backfilled. The system generates dry-run instances for all these nodes. After these dry-run instances are scheduled, the statuses of these instances are directly set to successful, but the script is not run.</p>
         * 
         * <strong>example:</strong>
         * <p>1234,123465</p>
         */
        public Builder excludeNodeIds(String excludeNodeIds) {
            this.putBodyParameter("ExcludeNodeIds", excludeNodeIds);
            this.excludeNodeIds = excludeNodeIds;
            return this;
        }

        /**
         * <p>The ID of the node for which you want to backfill data. If you want to backfill data for multiple nodes, separate the IDs of the nodes with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74324,74325</p>
         */
        public Builder includeNodeIds(String includeNodeIds) {
            this.putBodyParameter("IncludeNodeIds", includeNodeIds);
            this.includeNodeIds = includeNodeIds;
            return this;
        }

        /**
         * <p>The name of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xm_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The parameters that need to be configured for the node. Set this parameter to a JSON string. The key indicates the ID of the node, and the value indicates the actual values of the parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{74324:&quot;a=123 b=456&quot;}</p>
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * <p>Specifies whether data can be backfilled for multiple nodes at the same time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelism(Boolean parallelism) {
            this.putBodyParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The ID of the node for which data is first backfilled. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder rootNodeId(Long rootNodeId) {
            this.putBodyParameter("RootNodeId", rootNodeId);
            this.rootNodeId = rootNodeId;
            return this;
        }

        /**
         * <p>The data timestamp at which data starts to be backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-20 00:00:00</p>
         */
        public Builder startBizDate(String startBizDate) {
            this.putBodyParameter("StartBizDate", startBizDate);
            this.startBizDate = startBizDate;
            return this;
        }

        /**
         * <p>Specifies whether to immediately run an instance that is scheduled to run in the future. If you set this parameter to true, the instance that is scheduled to run in the future is run immediately. Otherwise, the instance is run as scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder startFutureInstanceImmediately(Boolean startFutureInstanceImmediately) {
            this.putBodyParameter("StartFutureInstanceImmediately", startFutureInstanceImmediately);
            this.startFutureInstanceImmediately = startFutureInstanceImmediately;
            return this;
        }

        @Override
        public RunCycleDagNodesRequest build() {
            return new RunCycleDagNodesRequest(this);
        } 

    } 

}
