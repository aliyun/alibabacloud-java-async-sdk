// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetUserViewMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserViewMetricsResponseBody</p>
 */
public class GetUserViewMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private UserViewMetric summary;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("UserMetrics")
    private java.util.List<UserViewMetric> userMetrics;

    private GetUserViewMetricsResponseBody(Builder builder) {
        this.resourceGroupId = builder.resourceGroupId;
        this.summary = builder.summary;
        this.total = builder.total;
        this.userMetrics = builder.userMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserViewMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return summary
     */
    public UserViewMetric getSummary() {
        return this.summary;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return userMetrics
     */
    public java.util.List<UserViewMetric> getUserMetrics() {
        return this.userMetrics;
    }

    public static final class Builder {
        private String resourceGroupId; 
        private UserViewMetric summary; 
        private Integer total; 
        private java.util.List<UserViewMetric> userMetrics; 

        private Builder() {
        } 

        private Builder(GetUserViewMetricsResponseBody model) {
            this.resourceGroupId = model.resourceGroupId;
            this.summary = model.summary;
            this.total = model.total;
            this.userMetrics = model.userMetrics;
        } 

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(UserViewMetric summary) {
            this.summary = summary;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * UserMetrics.
         */
        public Builder userMetrics(java.util.List<UserViewMetric> userMetrics) {
            this.userMetrics = userMetrics;
            return this;
        }

        public GetUserViewMetricsResponseBody build() {
            return new GetUserViewMetricsResponseBody(this);
        } 

    } 

}
