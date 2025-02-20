// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link LineageInfo} extends {@link TeaModel}
 *
 * <p>LineageInfo</p>
 */
public class LineageInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("edges")
    private Edge edges;

    @com.aliyun.core.annotation.NameInMap("jobInfos")
    private java.util.List<JobInfo> jobInfos;

    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List<Node> nodes;

    private LineageInfo(Builder builder) {
        this.edges = builder.edges;
        this.jobInfos = builder.jobInfos;
        this.nodes = builder.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageInfo create() {
        return builder().build();
    }

    /**
     * @return edges
     */
    public Edge getEdges() {
        return this.edges;
    }

    /**
     * @return jobInfos
     */
    public java.util.List<JobInfo> getJobInfos() {
        return this.jobInfos;
    }

    /**
     * @return nodes
     */
    public java.util.List<Node> getNodes() {
        return this.nodes;
    }

    public static final class Builder {
        private Edge edges; 
        private java.util.List<JobInfo> jobInfos; 
        private java.util.List<Node> nodes; 

        /**
         * edges.
         */
        public Builder edges(Edge edges) {
            this.edges = edges;
            return this;
        }

        /**
         * jobInfos.
         */
        public Builder jobInfos(java.util.List<JobInfo> jobInfos) {
            this.jobInfos = jobInfos;
            return this;
        }

        /**
         * nodes.
         */
        public Builder nodes(java.util.List<Node> nodes) {
            this.nodes = nodes;
            return this;
        }

        public LineageInfo build() {
            return new LineageInfo(this);
        } 

    } 

}
