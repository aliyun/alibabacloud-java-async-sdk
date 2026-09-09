// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAbnormalyEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAbnormalyEventsRequest</p>
 */
public class ListAbnormalyEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Integer current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    private Float end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pod")
    private String pod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showPod")
    private Integer showPod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start")
    private Float start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListAbnormalyEventsRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.cluster = builder.cluster;
        this.current = builder.current;
        this.end = builder.end;
        this.event = builder.event;
        this.instance = builder.instance;
        this.level = builder.level;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.pod = builder.pod;
        this.showPod = builder.showPod;
        this.start = builder.start;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAbnormalyEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return end
     */
    public Float getEnd() {
        return this.end;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pod
     */
    public String getPod() {
        return this.pod;
    }

    /**
     * @return showPod
     */
    public Integer getShowPod() {
        return this.showPod;
    }

    /**
     * @return start
     */
    public Float getStart() {
        return this.start;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListAbnormalyEventsRequest, Builder> {
        private String xDebugId; 
        private String cluster; 
        private Integer current; 
        private Float end; 
        private String event; 
        private String instance; 
        private String level; 
        private String namespace; 
        private Integer pageSize; 
        private String pod; 
        private Integer showPod; 
        private Float start; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListAbnormalyEventsRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.cluster = request.cluster;
            this.current = request.current;
            this.end = request.end;
            this.event = request.event;
            this.instance = request.instance;
            this.level = request.level;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.pod = request.pod;
            this.showPod = request.showPod;
            this.start = request.start;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2d33d4be-bf54-4070-82ca-c1dc2d8b1562</p>
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The current page number. This parameter is present during paginated queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Integer current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1725801327754</p>
         */
        public Builder end(Float end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The name of the anomaly event.</p>
         * 
         * <strong>example:</strong>
         * <p>节点根文件系统使用检测</p>
         */
        public Builder event(String event) {
            this.putQueryParameter("event", event);
            this.event = event;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        public Builder instance(String instance) {
            this.putQueryParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * <p>The level of the anomaly event.</p>
         * 
         * <strong>example:</strong>
         * <p>potential</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The namespace of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 5. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pod</p>
         */
        public Builder pod(String pod) {
            this.putQueryParameter("pod", pod);
            this.pod = pod;
            return this;
        }

        /**
         * <p>Specifies whether to display pod anomaly events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder showPod(Integer showPod) {
            this.putQueryParameter("showPod", showPod);
            this.showPod = showPod;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        public Builder start(Float start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public ListAbnormalyEventsRequest build() {
            return new ListAbnormalyEventsRequest(this);
        } 

    } 

}
