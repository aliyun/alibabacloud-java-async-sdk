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
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    private Float end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance;

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

    private GetAbnormalEventsCountRequest(Builder builder) {
        super(builder);
        this.cluster = builder.cluster;
        this.end = builder.end;
        this.instance = builder.instance;
        this.namespace = builder.namespace;
        this.pod = builder.pod;
        this.showPod = builder.showPod;
        this.start = builder.start;
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

    public static final class Builder extends Request.Builder<GetAbnormalEventsCountRequest, Builder> {
        private String cluster; 
        private Float end; 
        private String instance; 
        private String namespace; 
        private String pod; 
        private Integer showPod; 
        private Float start; 

        private Builder() {
            super();
        } 

        private Builder(GetAbnormalEventsCountRequest request) {
            super(request);
            this.cluster = request.cluster;
            this.end = request.end;
            this.instance = request.instance;
            this.namespace = request.namespace;
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
         * end.
         */
        public Builder end(Float end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
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
        public GetAbnormalEventsCountRequest build() {
            return new GetAbnormalEventsCountRequest(this);
        } 

    } 

}
