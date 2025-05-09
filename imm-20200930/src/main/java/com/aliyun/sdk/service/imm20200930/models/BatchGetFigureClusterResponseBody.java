// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link BatchGetFigureClusterResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetFigureClusterResponseBody</p>
 */
public class BatchGetFigureClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FigureClusters")
    private java.util.List<FigureCluster> figureClusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetFigureClusterResponseBody(Builder builder) {
        this.figureClusters = builder.figureClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetFigureClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return figureClusters
     */
    public java.util.List<FigureCluster> getFigureClusters() {
        return this.figureClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FigureCluster> figureClusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchGetFigureClusterResponseBody model) {
            this.figureClusters = model.figureClusters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The clusters.</p>
         */
        public Builder figureClusters(java.util.List<FigureCluster> figureClusters) {
            this.figureClusters = figureClusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetFigureClusterResponseBody build() {
            return new BatchGetFigureClusterResponseBody(this);
        } 

    } 

}
