// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceBuildLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceBuildLogsResponseBody</p>
 */
public class ListServiceBuildLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildLogs")
    private java.util.List<BuildLogs> buildLogs;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListServiceBuildLogsResponseBody(Builder builder) {
        this.buildLogs = builder.buildLogs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceBuildLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildLogs
     */
    public java.util.List<BuildLogs> getBuildLogs() {
        return this.buildLogs;
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

    public static final class Builder {
        private java.util.List<BuildLogs> buildLogs; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListServiceBuildLogsResponseBody model) {
            this.buildLogs = model.buildLogs;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * BuildLogs.
         */
        public Builder buildLogs(java.util.List<BuildLogs> buildLogs) {
            this.buildLogs = buildLogs;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListServiceBuildLogsResponseBody build() {
            return new ListServiceBuildLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceBuildLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceBuildLogsResponseBody</p>
     */
    public static class BuildLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildStep")
        private String buildStep;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private BuildLogs(Builder builder) {
            this.buildStep = builder.buildStep;
            this.content = builder.content;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildLogs create() {
            return builder().build();
        }

        /**
         * @return buildStep
         */
        public String getBuildStep() {
            return this.buildStep;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String buildStep; 
            private String content; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(BuildLogs model) {
                this.buildStep = model.buildStep;
                this.content = model.content;
                this.timestamp = model.timestamp;
            } 

            /**
             * BuildStep.
             */
            public Builder buildStep(String buildStep) {
                this.buildStep = buildStep;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public BuildLogs build() {
                return new BuildLogs(this);
            } 

        } 

    }
}
