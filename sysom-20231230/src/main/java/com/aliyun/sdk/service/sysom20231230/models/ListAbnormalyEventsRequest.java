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
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Integer current;

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

    private ListAbnormalyEventsRequest(Builder builder) {
        super(builder);
        this.cluster = builder.cluster;
        this.current = builder.current;
        this.end = builder.end;
        this.instance = builder.instance;
        this.level = builder.level;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.pod = builder.pod;
        this.showPod = builder.showPod;
        this.start = builder.start;
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

    public static final class Builder extends Request.Builder<ListAbnormalyEventsRequest, Builder> {
        private String cluster; 
        private Integer current; 
        private Float end; 
        private String instance; 
        private String level; 
        private String namespace; 
        private Integer pageSize; 
        private String pod; 
        private Integer showPod; 
        private Float start; 

        private Builder() {
            super();
        } 

        private Builder(ListAbnormalyEventsRequest request) {
            super(request);
            this.cluster = request.cluster;
            this.current = request.current;
            this.end = request.end;
            this.instance = request.instance;
            this.level = request.level;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.pod = request.pod;
            this.showPod = request.showPod;
            this.start = request.start;
        } 

        /**
         * cluster.
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * current.
         */
        public Builder current(Integer current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * end.
         */
        public Builder end(Float end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * instance.
         */
        public Builder instance(String instance) {
            this.putQueryParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * pod.
         */
        public Builder pod(String pod) {
            this.putQueryParameter("pod", pod);
            this.pod = pod;
            return this;
        }

        /**
         * showPod.
         */
        public Builder showPod(Integer showPod) {
            this.putQueryParameter("showPod", showPod);
            this.showPod = showPod;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Float start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListAbnormalyEventsRequest build() {
            return new ListAbnormalyEventsRequest(this);
        } 

    } 

}
