// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountFactoryBaselinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountFactoryBaselinesResponseBody</p>
 */
public class ListAccountFactoryBaselinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Baselines")
    private java.util.List < Baselines> baselines;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountFactoryBaselinesResponseBody(Builder builder) {
        this.baselines = builder.baselines;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountFactoryBaselinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselines
     */
    public java.util.List < Baselines> getBaselines() {
        return this.baselines;
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
        private java.util.List < Baselines> baselines; 
        private String nextToken; 
        private String requestId; 

        /**
         * An array that consists of baselines.
         */
        public Builder baselines(java.util.List < Baselines> baselines) {
            this.baselines = baselines;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountFactoryBaselinesResponseBody build() {
            return new ListAccountFactoryBaselinesResponseBody(this);
        } 

    } 

    public static class Baselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private String baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Baselines(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baselines create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public String getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String baselineId; 
            private String baselineName; 
            private String createTime; 
            private String description; 
            private String type; 
            private String updateTime; 

            /**
             * The baseline ID.
             */
            public Builder baselineId(String baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * The time at which the baseline was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the baseline.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The type of the baseline. Valid values:
             * <p>
             * 
             * *   System: default baseline
             * *   Custom: custom baseline
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the baseline was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Baselines build() {
                return new Baselines(this);
            } 

        } 

    }
}
