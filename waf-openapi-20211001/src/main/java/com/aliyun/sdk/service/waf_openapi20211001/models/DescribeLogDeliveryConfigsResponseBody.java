// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeLogDeliveryConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogDeliveryConfigsResponseBody</p>
 */
public class DescribeLogDeliveryConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryConfigs")
    private java.util.List<DeliveryConfigs> deliveryConfigs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLogDeliveryConfigsResponseBody(Builder builder) {
        this.deliveryConfigs = builder.deliveryConfigs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogDeliveryConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryConfigs
     */
    public java.util.List<DeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DeliveryConfigs> deliveryConfigs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLogDeliveryConfigsResponseBody model) {
            this.deliveryConfigs = model.deliveryConfigs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the log delivery configuration.</p>
         */
        public Builder deliveryConfigs(java.util.List<DeliveryConfigs> deliveryConfigs) {
            this.deliveryConfigs = deliveryConfigs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogDeliveryConfigsResponseBody build() {
            return new DescribeLogDeliveryConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogDeliveryConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogDeliveryConfigsResponseBody</p>
     */
    public static class DeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryDetail")
        private String deliveryDetail;

        @com.aliyun.core.annotation.NameInMap("DeliveryName")
        private String deliveryName;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

        private DeliveryConfigs(Builder builder) {
            this.deliveryDetail = builder.deliveryDetail;
            this.deliveryName = builder.deliveryName;
            this.deliveryType = builder.deliveryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return deliveryDetail
         */
        public String getDeliveryDetail() {
            return this.deliveryDetail;
        }

        /**
         * @return deliveryName
         */
        public String getDeliveryName() {
            return this.deliveryName;
        }

        /**
         * @return deliveryType
         */
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public static final class Builder {
            private String deliveryDetail; 
            private String deliveryName; 
            private String deliveryType; 

            private Builder() {
            } 

            private Builder(DeliveryConfigs model) {
                this.deliveryDetail = model.deliveryDetail;
                this.deliveryName = model.deliveryName;
                this.deliveryType = model.deliveryType;
            } 

            /**
             * <p>The content of the log delivery configuration. The value is a JSON string that contains multiple parameters.</p>
             * <blockquote>
             * <p> This parameter is the same as the <strong>DeliveryDetail</strong> parameter of the <strong>CreateLogDeliveryConfig</strong> operation. For more information, see <strong>Parameter description for log delivery configuration</strong> of the <a href="~~CreateLogDeliveryConfig~~">CreateLogDeliveryConfig</a> operation.</p>
             * </blockquote>
             */
            public Builder deliveryDetail(String deliveryDetail) {
                this.deliveryDetail = deliveryDetail;
                return this;
            }

            /**
             * <p>The name of the log delivery configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder deliveryName(String deliveryName) {
                this.deliveryName = deliveryName;
                return this;
            }

            /**
             * <p>The type of the log delivery configuration. Valid values:</p>
             * <ul>
             * <li><strong>syslog</strong>: Logs are delivered to a syslog service.</li>
             * <li><strong>kafka</strong>: Logs are delivered to a Kafka service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kafka</p>
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            public DeliveryConfigs build() {
                return new DeliveryConfigs(this);
            } 

        } 

    }
}
