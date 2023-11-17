// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTreeDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTreeDataResponseBody</p>
 */
public class QueryTreeDataResponseBody extends TeaModel {
    @NameInMap("Playbooks")
    private String playbooks;

    @NameInMap("RequestId")
    private String requestId;

    private QueryTreeDataResponseBody(Builder builder) {
        this.playbooks = builder.playbooks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTreeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbooks
     */
    public String getPlaybooks() {
        return this.playbooks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String playbooks; 
        private String requestId; 

        /**
         * Playbooks.
         */
        public Builder playbooks(String playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTreeDataResponseBody build() {
            return new QueryTreeDataResponseBody(this);
        } 

    } 

}
