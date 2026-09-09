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
 * {@link GetAbnormalEventsCountRequest} extends {@link RequestModel}
 *
 * <p>GetAbnormalEventsCountRequest</p>
 */
public class GetAbnormalEventsCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    private Float end;

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

    private GetAbnormalEventsCountRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.cluster = builder.cluster;
        this.end = builder.end;
        this.instance = builder.instance;
        this.level = builder.level;
        this.namespace = builder.namespace;
        this.pod = builder.pod;
        this.showPod = builder.showPod;
        this.start = builder.start;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAbnormalEventsCountRequest create() {
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
     * @return end
     */
    public Float getEnd() {
        return this.end;
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

    public static final class Builder extends Request.Builder<GetAbnormalEventsCountRequest, Builder> {
        private String xDebugId; 
        private String cluster; 
        private Float end; 
        private String instance; 
        private String level; 
        private String namespace; 
        private String pod; 
        private Integer showPod; 
        private Float start; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(GetAbnormalEventsCountRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.cluster = request.cluster;
            this.end = request.end;
            this.instance = request.instance;
            this.level = request.level;
            this.namespace = request.namespace;
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
         * <p>2ijff4be-bf24-4070-89ca-c47c879b0g32</p>
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("cluster", cluster);
            this.cluster = cluster;
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
         * <p>The severity level of abnormal events.</p>
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
         * <p>Specifies whether to display abnormal events of the pod.</p>
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
        public GetAbnormalEventsCountRequest build() {
            return new GetAbnormalEventsCountRequest(this);
        } 

    } 

}
