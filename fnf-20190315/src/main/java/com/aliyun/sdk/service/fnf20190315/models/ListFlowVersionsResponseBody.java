// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ListFlowVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowVersionsResponseBody</p>
 */
public class ListFlowVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowVersions")
    private java.util.List<FlowVersions> flowVersions;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFlowVersionsResponseBody(Builder builder) {
        this.flowVersions = builder.flowVersions;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowVersions
     */
    public java.util.List<FlowVersions> getFlowVersions() {
        return this.flowVersions;
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
        private java.util.List<FlowVersions> flowVersions; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFlowVersionsResponseBody model) {
            this.flowVersions = model.flowVersions;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * FlowVersions.
         */
        public Builder flowVersions(java.util.List<FlowVersions> flowVersions) {
            this.flowVersions = flowVersions;
            return this;
        }

        /**
         * <p>list token</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFlowVersionsResponseBody build() {
            return new ListFlowVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowVersionsResponseBody</p>
     */
    public static class FlowVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private FlowVersions(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowVersions create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String version; 

            private Builder() {
            } 

            private Builder(FlowVersions model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.version = model.version;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public FlowVersions build() {
                return new FlowVersions(this);
            } 

        } 

    }
}
