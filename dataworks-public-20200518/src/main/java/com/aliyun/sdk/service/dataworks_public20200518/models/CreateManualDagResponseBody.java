// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateManualDagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateManualDagResponseBody</p>
 */
public class CreateManualDagResponseBody extends TeaModel {
    @NameInMap("DagId")
    private Long dagId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateManualDagResponseBody(Builder builder) {
        this.dagId = builder.dagId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManualDagResponseBody create() {
        return builder().build();
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long dagId; 
        private String requestId; 

        /**
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateManualDagResponseBody build() {
            return new CreateManualDagResponseBody(this);
        } 

    } 

}
