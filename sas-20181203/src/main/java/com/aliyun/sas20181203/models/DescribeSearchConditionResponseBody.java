// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSearchConditionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSearchConditionResponseBody</p>
 */
public class DescribeSearchConditionResponseBody extends TeaModel {
    @NameInMap("ConditionList")
    private java.util.List < ConditionList> conditionList;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeSearchConditionResponseBody(Builder builder) {
        this.conditionList = builder.conditionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSearchConditionResponseBody create() {
        return builder().build();
    }

    /**
     * @return conditionList
     */
    public java.util.List < ConditionList> getConditionList() {
        return this.conditionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConditionList> conditionList; 
        private String requestId; 

        /**
         * <p>ConditionList.</p>
         */
        public Builder conditionList(java.util.List < ConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSearchConditionResponseBody build() {
            return new DescribeSearchConditionResponseBody(this);
        } 

    } 

    public static class ConditionList extends TeaModel {
        @NameInMap("ConditionType")
        private String conditionType;

        @NameInMap("FilterConditions")
        private String filterConditions;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameKey")
        private String nameKey;


        private ConditionList(Builder builder) {
            this.conditionType = builder.conditionType;
            this.filterConditions = builder.filterConditions;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionList create() {
            return builder().build();
        }

        /**
         * @return conditionType
         */
        public String getConditionType() {
            return this.conditionType;
        }

        /**
         * @return filterConditions
         */
        public String getFilterConditions() {
            return this.filterConditions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        public static final class Builder {
            private String conditionType; 
            private String filterConditions; 
            private String name; 
            private String nameKey; 

            /**
             * <p>ConditionType.</p>
             */
            public Builder conditionType(String conditionType) {
                this.conditionType = conditionType;
                return this;
            }

            /**
             * <p>FilterConditions.</p>
             */
            public Builder filterConditions(String filterConditions) {
                this.filterConditions = filterConditions;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>NameKey.</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            public ConditionList build() {
                return new ConditionList(this);
            } 

        } 

    }
}
