// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveShowFromShowListResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveShowFromShowListResponseBody</p>
 */
public class RemoveShowFromShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowId")
    private String showId;

    private RemoveShowFromShowListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.showId = builder.showId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveShowFromShowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    public static final class Builder {
        private String requestId; 
        private String showId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowId.
         */
        public Builder showId(String showId) {
            this.showId = showId;
            return this;
        }

        public RemoveShowFromShowListResponseBody build() {
            return new RemoveShowFromShowListResponseBody(this);
        } 

    } 

}
