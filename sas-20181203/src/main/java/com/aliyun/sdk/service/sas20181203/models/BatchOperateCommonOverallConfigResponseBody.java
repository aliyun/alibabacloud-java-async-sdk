// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchOperateCommonOverallConfigResponseBody} extends {@link TeaModel}
 *
 * <p>BatchOperateCommonOverallConfigResponseBody</p>
 */
public class BatchOperateCommonOverallConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchOperateCommonOverallConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOperateCommonOverallConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>765EDBDE-1686-5DBA-B76F-2E0E6E7E1B96</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchOperateCommonOverallConfigResponseBody build() {
            return new BatchOperateCommonOverallConfigResponseBody(this);
        } 

    } 

}
