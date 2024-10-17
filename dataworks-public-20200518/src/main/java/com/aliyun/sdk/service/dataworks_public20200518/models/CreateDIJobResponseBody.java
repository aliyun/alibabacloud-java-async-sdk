// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDIJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDIJobResponseBody</p>
 */
public class CreateDIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    private Long DIJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDIJobResponseBody(Builder builder) {
        this.DIJobId = builder.DIJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDIJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long DIJobId; 
        private String requestId; 

        /**
         * <p>The synchronization task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11792</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4F6AB6B3-41FB-5EBB-AFB2-0C98D49DA2BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDIJobResponseBody build() {
            return new CreateDIJobResponseBody(this);
        } 

    } 

}
