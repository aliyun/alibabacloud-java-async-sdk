// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RankPreviewQueryResponseBody} extends {@link TeaModel}
 *
 * <p>RankPreviewQueryResponseBody</p>
 */
public class RankPreviewQueryResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private RankPreviewQueryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RankPreviewQueryResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RankPreviewQueryResponseBody build() {
            return new RankPreviewQueryResponseBody(this);
        } 

    } 

}
