// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFigureClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetFigureClusterResponseBody</p>
 */
public class GetFigureClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FigureCluster")
    private FigureCluster figureCluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFigureClusterResponseBody(Builder builder) {
        this.figureCluster = builder.figureCluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFigureClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return figureCluster
     */
    public FigureCluster getFigureCluster() {
        return this.figureCluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FigureCluster figureCluster; 
        private String requestId; 

        /**
         * FigureCluster.
         */
        public Builder figureCluster(FigureCluster figureCluster) {
            this.figureCluster = figureCluster;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFigureClusterResponseBody build() {
            return new GetFigureClusterResponseBody(this);
        } 

    } 

}
