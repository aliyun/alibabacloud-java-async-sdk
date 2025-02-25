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
 * {@link ListTriggersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTriggersResponseBody</p>
 */
public class ListTriggersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Triggers")
    private java.util.List<DataIngestion> triggers;

    private ListTriggersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.triggers = builder.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggers
     */
    public java.util.List<DataIngestion> getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<DataIngestion> triggers; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <p>If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F480BFAF-E778-5079-93AD-1E4631******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The triggers.</p>
         */
        public Builder triggers(java.util.List<DataIngestion> triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListTriggersResponseBody build() {
            return new ListTriggersResponseBody(this);
        } 

    } 

}
