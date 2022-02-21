// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountQuotaAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountQuotaAttributesResponseBody</p>
 */
public class DescribeAccountQuotaAttributesResponseBody extends TeaModel {
    @NameInMap("QuotaAttributes")
    private QuotaAttributes quotaAttributes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccountQuotaAttributesResponseBody(Builder builder) {
        this.quotaAttributes = builder.quotaAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountQuotaAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotaAttributes
     */
    public QuotaAttributes getQuotaAttributes() {
        return this.quotaAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QuotaAttributes quotaAttributes; 
        private String requestId; 

        /**
         * QuotaAttributes.
         */
        public Builder quotaAttributes(QuotaAttributes quotaAttributes) {
            this.quotaAttributes = quotaAttributes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountQuotaAttributesResponseBody build() {
            return new DescribeAccountQuotaAttributesResponseBody(this);
        } 

    } 

    public static class QuotaAttributes extends TeaModel {
        @NameInMap("EcsElasticQuotaEnable")
        private Boolean ecsElasticQuotaEnable;

        private QuotaAttributes(Builder builder) {
            this.ecsElasticQuotaEnable = builder.ecsElasticQuotaEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaAttributes create() {
            return builder().build();
        }

        /**
         * @return ecsElasticQuotaEnable
         */
        public Boolean getEcsElasticQuotaEnable() {
            return this.ecsElasticQuotaEnable;
        }

        public static final class Builder {
            private Boolean ecsElasticQuotaEnable; 

            /**
             * EcsElasticQuotaEnable.
             */
            public Builder ecsElasticQuotaEnable(Boolean ecsElasticQuotaEnable) {
                this.ecsElasticQuotaEnable = ecsElasticQuotaEnable;
                return this;
            }

            public QuotaAttributes build() {
                return new QuotaAttributes(this);
            } 

        } 

    }
}
