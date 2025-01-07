// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListSystemRuleAggregationTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemRuleAggregationTypesResponseBody</p>
 */
public class ListSystemRuleAggregationTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregationTypeList")
    private java.util.List<AggregationTypeList> aggregationTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSystemRuleAggregationTypesResponseBody(Builder builder) {
        this.aggregationTypeList = builder.aggregationTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemRuleAggregationTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregationTypeList
     */
    public java.util.List<AggregationTypeList> getAggregationTypeList() {
        return this.aggregationTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AggregationTypeList> aggregationTypeList; 
        private String requestId; 

        /**
         * <p>An array that consists of the aggregation types.</p>
         */
        public Builder aggregationTypeList(java.util.List<AggregationTypeList> aggregationTypeList) {
            this.aggregationTypeList = aggregationTypeList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1427F3BE-8A7E-57F9-BD4E-590B00D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSystemRuleAggregationTypesResponseBody build() {
            return new ListSystemRuleAggregationTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemRuleAggregationTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemRuleAggregationTypesResponseBody</p>
     */
    public static class AggregationTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AggregationTypeList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregationTypeList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 

            /**
             * <p>The ID of the aggregation type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the aggregation type.</p>
             * 
             * <strong>example:</strong>
             * <p>Remote control****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AggregationTypeList build() {
                return new AggregationTypeList(this);
            } 

        } 

    }
}
