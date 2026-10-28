// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
    private java.util.List<QuotaDimensions> quotaDimensions;

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
    public java.util.List<QuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public static final class Builder extends Request.Builder<ListQuotaAlarmsRequest, Builder> {
        private String alarmName; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private java.util.List<QuotaDimensions> quotaDimensions; 

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
         * <p>The name of the quota usage alert.</p>
         * 
         * <strong>example:</strong>
         * <p>q_hvnoqv alarm</p>
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * <p>The maximum number of records to return.</p>
         * <p>Valid values: 1 to 200. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that specifies the start point of the query.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the query starts from the beginning.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <blockquote>
         * <p>To obtain the abbreviation of an Alibaba Cloud service name, see the <code>ProductCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * <blockquote>
         * <ul>
         * <li><p>To obtain the quota ID of an Alibaba Cloud service, see the <code>QuotaActionCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </li>
         * <li><p>If you specify this parameter, you must also specify <code>ProductCode</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>q_hvnoqv</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota dimensions.</p>
         */
        public Builder quotaDimensions(java.util.List<QuotaDimensions> quotaDimensions) {
            this.putBodyParameter("QuotaDimensions", quotaDimensions);
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        @Override
        public ListQuotaAlarmsRequest build() {
            return new ListQuotaAlarmsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaAlarmsRequest} extends {@link TeaModel}
     *
     * <p>ListQuotaAlarmsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(QuotaDimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension.</p>
             * <blockquote>
             * <ul>
             * <li><p>The number of key-value pairs that you can specify for the quota dimensions varies based on the Alibaba Cloud service.</p>
             * </li>
             * <li><p>If you set <code>ProductCode</code> to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value for the quota dimension.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * <blockquote>
             * <ul>
             * <li><p>The number of key-value pairs that you can specify for the quota dimensions varies based on the Alibaba Cloud service.</p>
             * </li>
             * <li><p>If you set <code>ProductCode</code> to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and value for the quota dimension.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
