// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemRuleAggregationTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemRuleAggregationTypesResponseBody</p>
 */
public class ListSystemRuleAggregationTypesResponseBody extends TeaModel {
    @NameInMap("AggregationTypeList")
    private java.util.List < AggregationTypeList> aggregationTypeList;

    @NameInMap("RequestId")
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
    public java.util.List < AggregationTypeList> getAggregationTypeList() {
        return this.aggregationTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AggregationTypeList> aggregationTypeList; 
        private String requestId; 

        /**
         * An array that consists of the aggregation types.
         */
        public Builder aggregationTypeList(java.util.List < AggregationTypeList> aggregationTypeList) {
            this.aggregationTypeList = aggregationTypeList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSystemRuleAggregationTypesResponseBody build() {
            return new ListSystemRuleAggregationTypesResponseBody(this);
        } 

    } 

    public static class AggregationTypeList extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
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
             * The ID of the aggregation type.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the aggregation type.
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
