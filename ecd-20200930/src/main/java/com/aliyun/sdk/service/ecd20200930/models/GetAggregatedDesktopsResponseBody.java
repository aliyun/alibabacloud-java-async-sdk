// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GetAggregatedDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregatedDesktopsResponseBody</p>
 */
public class GetAggregatedDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aggregations")
    private Aggregations aggregations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregatedDesktopsResponseBody(Builder builder) {
        this.aggregations = builder.aggregations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregatedDesktopsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregations
     */
    public Aggregations getAggregations() {
        return this.aggregations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Aggregations aggregations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAggregatedDesktopsResponseBody model) {
            this.aggregations = model.aggregations;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of aggregation field information.</p>
         * <blockquote>
         * <p>Notice: When you use an aggregate query, only aggregation results are returned. The list of matched metadata is not returned.</p>
         * </blockquote>
         */
        public Builder aggregations(Aggregations aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3147E094-C1F7-5001-8F04-C8CEE75D6552</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregatedDesktopsResponseBody build() {
            return new GetAggregatedDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregatedDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregatedDesktopsResponseBody</p>
     */
    public static class Aggregations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopAggregation")
        private java.util.List<java.util.Map<String, String>> desktopAggregation;

        private Aggregations(Builder builder) {
            this.desktopAggregation = builder.desktopAggregation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregations create() {
            return builder().build();
        }

        /**
         * @return desktopAggregation
         */
        public java.util.List<java.util.Map<String, String>> getDesktopAggregation() {
            return this.desktopAggregation;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, String>> desktopAggregation; 

            private Builder() {
            } 

            private Builder(Aggregations model) {
                this.desktopAggregation = model.desktopAggregation;
            } 

            /**
             * <p>The aggregation results.</p>
             */
            public Builder desktopAggregation(java.util.List<java.util.Map<String, String>> desktopAggregation) {
                this.desktopAggregation = desktopAggregation;
                return this;
            }

            public Aggregations build() {
                return new Aggregations(this);
            } 

        } 

    }
}
