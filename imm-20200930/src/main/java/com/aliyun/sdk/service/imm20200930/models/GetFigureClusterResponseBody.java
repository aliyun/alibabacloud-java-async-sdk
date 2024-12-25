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
         * <p>The information about the face clustering task.</p>
         */
        public Builder figureCluster(FigureCluster figureCluster) {
            this.figureCluster = figureCluster;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
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
