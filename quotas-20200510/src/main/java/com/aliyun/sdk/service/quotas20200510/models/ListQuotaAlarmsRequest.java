// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaAlarmsRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaAlarmsRequest</p>
 */
public class ListQuotaAlarmsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmName")
    private String alarmName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaDimensions")
    private java.util.List < QuotaDimensions> quotaDimensions;

    private ListQuotaAlarmsRequest(Builder builder) {
        super(builder);
        this.alarmName = builder.alarmName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaDimensions = builder.quotaDimensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaAlarmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmName
     */
    public String getAlarmName() {
        return this.alarmName;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return quotaActionCode
     */
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    /**
     * @return quotaDimensions
     */
    public java.util.List < QuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public static final class Builder extends Request.Builder<ListQuotaAlarmsRequest, Builder> {
        private String alarmName; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private java.util.List < QuotaDimensions> quotaDimensions; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaAlarmsRequest request) {
            super(request);
            this.alarmName = request.alarmName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaDimensions = request.quotaDimensions;
        } 

        /**
         * The name of the alert.
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * The maximum number of records that you want to return for the query.
         * <p>
         * 
         * Valid values: 1 to 200. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query.
         * <p>
         * 
         * > An empty value indicates that the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * >  To query the abbreviation of an Alibaba Cloud service name, call the [ListProducts](~~440554~~) operation and check the value of `ProductCode` in the response.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The quota ID.
         * <p>
         * 
         * > 
         * 
         * *   To obtain the quota ID of a cloud service, call the [ListProductQuotas](~~440554~~) operation and check the value of `QuotaActionCode` in the response.
         * 
         * *   If you specify this parameter, you must specify `ProductCode`.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * The quota dimensions.
         */
        public Builder quotaDimensions(java.util.List < QuotaDimensions> quotaDimensions) {
            this.putBodyParameter("QuotaDimensions", quotaDimensions);
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        @Override
        public ListQuotaAlarmsRequest build() {
            return new ListQuotaAlarmsRequest(this);
        } 

    } 

    public static class QuotaDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QuotaDimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaDimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   This parameter is required if you set the `ProductCode` parameter to `ecs`, `ecs-spec`, `actiontrail`, or `ess`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   This parameter is required if you set the `ProductCode` parameter to `ecs`, `ecs-spec`, `actiontrail`, or `ess`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QuotaDimensions build() {
                return new QuotaDimensions(this);
            } 

        } 

    }
}
