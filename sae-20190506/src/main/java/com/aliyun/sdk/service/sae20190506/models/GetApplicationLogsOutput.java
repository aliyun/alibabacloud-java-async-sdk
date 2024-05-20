// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationLogsOutput} extends {@link TeaModel}
 *
 * <p>GetApplicationLogsOutput</p>
 */
public class GetApplicationLogsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logEntrys")
    private java.util.List < LogEntry > logEntrys;

    @com.aliyun.core.annotation.NameInMap("nextOffset")
    private Long nextOffset;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetApplicationLogsOutput(Builder builder) {
        this.logEntrys = builder.logEntrys;
        this.nextOffset = builder.nextOffset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationLogsOutput create() {
        return builder().build();
    }

    /**
     * @return logEntrys
     */
    public java.util.List < LogEntry > getLogEntrys() {
        return this.logEntrys;
    }

    /**
     * @return nextOffset
     */
    public Long getNextOffset() {
        return this.nextOffset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LogEntry > logEntrys; 
        private Long nextOffset; 
        private String requestId; 

        /**
         * logEntrys.
         */
        public Builder logEntrys(java.util.List < LogEntry > logEntrys) {
            this.logEntrys = logEntrys;
            return this;
        }

        /**
         * nextOffset.
         */
        public Builder nextOffset(Long nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationLogsOutput build() {
            return new GetApplicationLogsOutput(this);
        } 

    } 

}
