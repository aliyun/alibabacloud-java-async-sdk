// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListNodePodsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodePodsResponseBody</p>
 */
public class ListNodePodsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodePodInfos")
    private java.util.List<NodePodInfo> nodePodInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodePodsResponseBody(Builder builder) {
        this.nodePodInfos = builder.nodePodInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePodsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodePodInfos
     */
    public java.util.List<NodePodInfo> getNodePodInfos() {
        return this.nodePodInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NodePodInfo> nodePodInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodePodsResponseBody model) {
            this.nodePodInfos = model.nodePodInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The node pod information.</p>
         */
        public Builder nodePodInfos(java.util.List<NodePodInfo> nodePodInfos) {
            this.nodePodInfos = nodePodInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodePodsResponseBody build() {
            return new ListNodePodsResponseBody(this);
        } 

    } 

}
