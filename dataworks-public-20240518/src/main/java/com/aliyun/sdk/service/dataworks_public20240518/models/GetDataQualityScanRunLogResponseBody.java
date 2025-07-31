// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataQualityScanRunLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityScanRunLogResponseBody</p>
 */
public class GetDataQualityScanRunLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogSegment")
    private LogSegment logSegment;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityScanRunLogResponseBody(Builder builder) {
        this.logSegment = builder.logSegment;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityScanRunLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logSegment
     */
    public LogSegment getLogSegment() {
        return this.logSegment;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogSegment logSegment; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityScanRunLogResponseBody model) {
            this.logSegment = model.logSegment;
            this.requestId = model.requestId;
        } 

        /**
         * LogSegment.
         */
        public Builder logSegment(LogSegment logSegment) {
            this.logSegment = logSegment;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityScanRunLogResponseBody build() {
            return new GetDataQualityScanRunLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityScanRunLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityScanRunLogResponseBody</p>
     */
    public static class LogSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        @com.aliyun.core.annotation.NameInMap("NextOffset")
        private Long nextOffset;

        private LogSegment(Builder builder) {
            this.log = builder.log;
            this.nextOffset = builder.nextOffset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogSegment create() {
            return builder().build();
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return nextOffset
         */
        public Long getNextOffset() {
            return this.nextOffset;
        }

        public static final class Builder {
            private String log; 
            private Long nextOffset; 

            private Builder() {
            } 

            private Builder(LogSegment model) {
                this.log = model.log;
                this.nextOffset = model.nextOffset;
            } 

            /**
             * Log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * NextOffset.
             */
            public Builder nextOffset(Long nextOffset) {
                this.nextOffset = nextOffset;
                return this;
            }

            public LogSegment build() {
                return new LogSegment(this);
            } 

        } 

    }
}
