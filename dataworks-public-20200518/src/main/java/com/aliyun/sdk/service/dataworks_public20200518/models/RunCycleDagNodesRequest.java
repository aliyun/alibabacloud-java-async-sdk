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
         * <li>SMS: text message.</li>
         * <li>MAIL: email.</li>
         * <li>SMS_MAIL: text message and email.</li>
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
         * <p>The Alarm Metric. Valid values:</p>
         * <ul>
         * <li>SUCCESS: Alerting on success.</li>
         * <li>FAILURE: Alerting on failed.</li>
         * <li>SUCCESS_FAILURE: Alerting on success or failed.</li>
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
         * <p>The start time of the node. This parameter is required only for hourly scheduled nodes. Format: HH:mm:ss. Valid values: 00:00:00 to 23:59:59.</p>
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
         * <p>The end time of the node. This parameter is required only for hourly scheduled nodes. Format: HH:mm:ss. Valid values: 00:00:00 to 23:59:59.</p>
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
         * <p>The number of concurrent nodes. Valid values: 2 to 10.</p>
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
         * <p>The end business date for data backfill. Format: yyyy-MM-dd 00:00:00.</p>
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
         * <p>The list of node IDs that do not require data backfill. Nodes in this list generate dry-run instances. After a dry-run instance is scheduled, it directly succeeds without executing the script content.</p>
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
         * <p>The node IDs for data backfill. Separate multiple node IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain node IDs.</p>
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
         * <p>A JSON string in which the key is the node ID and the value is the actual parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;74324&quot;:&quot;a=123 b=456&quot;}</p>
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * <p>Specifies whether nodes across multiple business dates can run in parallel.</p>
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
         * <p>The environment of the workspace. PROD indicates the production environment. DEV indicates the development environment.</p>
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
         * <p>The ID of the start node for data backfill. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
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
         * <p>The start business date for data backfill. Format: yyyy-MM-dd 00:00:00.</p>
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
         * <p>Specifies whether to immediately run instances whose scheduling time is in the future. If this parameter is set to true, instances with a scheduling time later than the current time run immediately. Otherwise, the instances wait until the scheduling time.</p>
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
