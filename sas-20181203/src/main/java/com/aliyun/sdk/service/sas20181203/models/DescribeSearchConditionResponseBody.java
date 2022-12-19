// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * An array that consists of the filter conditions.
         */
        public Builder conditionList(java.util.List < ConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
             * The type of the filter condition. Valid values:
             * <p>
             * 
             * *   **system**: default filter condition
             * *   **user**: custom filter condition
             */
            public Builder conditionType(String conditionType) {
                this.conditionType = conditionType;
                return this;
            }

            /**
             * The filter condition. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **filterParams**: the parameters of the filter condition. The value of this field is in the JSON format and contains the following fields:
             * 
             *     *   **labelKey**: the key for rendering.
             * 
             *     *   **label**: the display name.
             * 
             *     *   **value**: the value of the filter condition. The value of this field is in the JSON format and contains the following fields:
             * 
             *         *   **name**: the name of the filter item.
             *         *   **value**: the value of the filter item.
             * 
             * *   **LogicalExp**: the logical relationship among the filter conditions. Valid values:
             * 
             *     *   **AND**: The filter conditions are evaluated by using a logical **AND**.
             *     *   **OR**: The filter conditions are evaluated by using a logical **OR**.
             * 
             * >  If the value of **ConditionType** is **system**, **labelKey** is returned. The labelKey field is used only for internationalization rendering.
             */
            public Builder filterConditions(String filterConditions) {
                this.filterConditions = filterConditions;
                return this;
            }

            /**
             * The name of the filter condition.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The key of the filter condition name.
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
