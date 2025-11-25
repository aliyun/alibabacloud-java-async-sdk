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
 * {@link ListCloudAssetMatchOperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAssetMatchOperatorsResponseBody</p>
 */
public class ListCloudAssetMatchOperatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MatchTypeOperators")
    private java.util.List<MatchTypeOperators> matchTypeOperators;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCloudAssetMatchOperatorsResponseBody(Builder builder) {
        this.matchTypeOperators = builder.matchTypeOperators;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAssetMatchOperatorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchTypeOperators
     */
    public java.util.List<MatchTypeOperators> getMatchTypeOperators() {
        return this.matchTypeOperators;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<MatchTypeOperators> matchTypeOperators; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCloudAssetMatchOperatorsResponseBody model) {
            this.matchTypeOperators = model.matchTypeOperators;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>List of operator types</p>
         */
        public Builder matchTypeOperators(java.util.List<MatchTypeOperators> matchTypeOperators) {
            this.matchTypeOperators = matchTypeOperators;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudAssetMatchOperatorsResponseBody build() {
            return new ListCloudAssetMatchOperatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAssetMatchOperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetMatchOperatorsResponseBody</p>
     */
    public static class MatchOperators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputPattern")
        private String inputPattern;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MatchOperators(Builder builder) {
            this.inputPattern = builder.inputPattern;
            this.name = builder.name;
            this.showName = builder.showName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchOperators create() {
            return builder().build();
        }

        /**
         * @return inputPattern
         */
        public String getInputPattern() {
            return this.inputPattern;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String inputPattern; 
            private String name; 
            private String showName; 
            private String value; 

            private Builder() {
            } 

            private Builder(MatchOperators model) {
                this.inputPattern = model.inputPattern;
                this.name = model.name;
                this.showName = model.showName;
                this.value = model.value;
            } 

            /**
             * <p>Operation data types. Values: </p>
             * <ul>
             * <li>LIST type:</li>
             * </ul>
             * <ol>
             * <li>For Name as LIST_CONTAINS, the value is: LIST </li>
             * <li>For Name as LIST_LENGTH_GT, the value is: PRIMITIVE </li>
             * <li>For Name as LIST_LENGTH_LT, the value is: PRIMITIVE </li>
             * <li>For Name as LIST_NOT_CONTAINS, the value is: LIST</li>
             * </ol>
             * <ul>
             * <li>STRING type:</li>
             * </ul>
             * <ol>
             * <li>For Name as STRING_NOT_IN, the value is: LIST </li>
             * <li>For Name as STRING_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as STRING_IN, the value is: LIST </li>
             * <li>For Name as STRING_NOT_EQ, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>BOOLEAN type:</li>
             * </ul>
             * <ol>
             * <li>For Name as BOOLEAN_NOT_IN, the value is: LIST </li>
             * <li>For Name as BOOLEAN_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as BOOLEAN_IN, the value is: LIST </li>
             * <li>For Name as BOOLEAN_NOT_EQ, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>FLOAT type:</li>
             * </ul>
             * <ol>
             * <li>For Name as FLOAT_NOT_IN, the value is: LIST </li>
             * <li>For Name as FLOAT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as FLOAT_IN, the value is: LIST </li>
             * <li>For Name as FLOAT_NOT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as FLOAT_GT, the value is: PRIMITIVE </li>
             * <li>For Name as FLOAT_GTE, the value is: PRIMITIVE </li>
             * <li>For Name as FLOAT_LT, the value is: PRIMITIVE </li>
             * <li>For Name as FLOAT_LTE, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>DOUBLE type:</li>
             * </ul>
             * <ol>
             * <li>For Name as DOUBLE_NOT_IN, the value is: LIST </li>
             * <li>For Name as DOUBLE_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as DOUBLE_IN, the value is: LIST </li>
             * <li>For Name as DOUBLE_NOT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as DOUBLE_GT, the value is: PRIMITIVE </li>
             * <li>For Name as DOUBLE_GTE, the value is: PRIMITIVE </li>
             * <li>For Name as DOUBLE_LT, the value is: PRIMITIVE 8. For Name as DOUBLE_LTE, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>INTEGER type:</li>
             * </ul>
             * <ol>
             * <li>For Name as INTEGER_NOT_IN, the value is: LIST </li>
             * <li>For Name as INTEGER_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_IN, the value is: LIST </li>
             * <li>For Name as INTEGER_NOT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_GT, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_GTE, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_LT, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_LTE, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>LONG type:</li>
             * </ul>
             * <ol>
             * <li>For Name as LONG_NOT_IN, the value is: LIST </li>
             * <li>For Name as LONG_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as LONG_IN, the value is: LIST </li>
             * <li>For Name as LONG_NOT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as LONG_GT, the value is: PRIMITIVE </li>
             * <li>For Name as LONG_GTE, the value is: PRIMITIVE </li>
             * <li>For Name as LONG_LT, the value is: PRIMITIVE </li>
             * <li>For Name as LONG_LTE, the value is: PRIMITIVE</li>
             * </ol>
             * <ul>
             * <li>INTEGER type (repeated):</li>
             * </ul>
             * <ol>
             * <li>For Name as INTEGER_NOT_IN, the value is: LIST </li>
             * <li>For Name as INTEGER_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_IN, the value is: LIST </li>
             * <li>For Name as INTEGER_NOT_EQ, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_GT, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_GTE, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_LT, the value is: PRIMITIVE </li>
             * <li>For Name as INTEGER_LTE, the value is: PRIMITIVE</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>PRIMITIVE</p>
             */
            public Builder inputPattern(String inputPattern) {
                this.inputPattern = inputPattern;
                return this;
            }

            /**
             * <p>Unique name of the operator. Values: - LIST type: </p>
             * <ol>
             * <li>LIST_CONTAINS: contains </li>
             * <li>LIST_LENGTH_GT: length greater than </li>
             * <li>LIST_LENGTH_LT: length less than </li>
             * <li>LIST_NOT_CONTAINS: does not contain</li>
             * </ol>
             * <ul>
             * <li>STRING type:</li>
             * </ul>
             * <ol>
             * <li>STRING_NOT_IN: not in list </li>
             * <li>STRING_EQ: equals </li>
             * <li>STRING_IN: in list </li>
             * <li>STRING_NOT_EQ: not equal</li>
             * </ol>
             * <ul>
             * <li>BOOLEAN type:</li>
             * </ul>
             * <ol>
             * <li>BOOLEAN_NOT_IN: not in list </li>
             * <li>BOOLEAN_EQ: equals </li>
             * <li>BOOLEAN_IN: in list </li>
             * <li>BOOLEAN_NOT_EQ: not equal</li>
             * </ol>
             * <ul>
             * <li>FLOAT type: 1. FLOAT_NOT_IN: not in list</li>
             * </ul>
             * <ol start="2">
             * <li>FLOAT_EQ: equals 3. FLOAT_IN: in list </li>
             * <li>FLOAT_NOT_EQ: not equal </li>
             * <li>FLOAT_GT: greater than </li>
             * <li>FLOAT_GTE: greater than or equal to </li>
             * <li>FLOAT_LT: less than </li>
             * <li>FLOAT_LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>DOUBLE type:</li>
             * </ul>
             * <ol>
             * <li>DOUBLE_NOT_IN: not in list </li>
             * <li>DOUBLE_EQ: equals </li>
             * <li>DOUBLE_IN: in list </li>
             * <li>DOUBLE_NOT_EQ: not equal </li>
             * <li>DOUBLE_GT: greater than </li>
             * <li>DOUBLE_GTE: greater than or equal to 7
             * . DOUBLE_LT: less than </li>
             * <li>DOUBLE_LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>INTEGER type:</li>
             * </ul>
             * <ol>
             * <li>INTEGER_NOT_IN: not in list </li>
             * <li>INTEGER_EQ: equals </li>
             * <li>INTEGER_IN: in list </li>
             * <li>INTEGER_NOT_EQ: not equal </li>
             * <li>INTEGER_GT: greater than </li>
             * <li>INTEGER_GTE: greater than or equal to </li>
             * <li>INTEGER_LT: less than </li>
             * <li>INTEGER_LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>LONG type:</li>
             * </ul>
             * <ol>
             * <li>LONG_NOT_IN: not in list </li>
             * <li>LONG_EQ: equals </li>
             * <li>LONG_IN: in list </li>
             * <li>LONG_NOT_EQ: not equal </li>
             * <li>LONG_GT: greater than </li>
             * <li>LONG_GTE: greater than or equal to </li>
             * <li>LONG_LT: less than </li>
             * <li>LONG_LTE: less than or equal to<details></li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>LIST_CONTAINS</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operator display name. Values: - For LIST type: </p>
             * <ol>
             * <li>Contains: includes </li>
             * <li>SizeGreaterThan: size greater than </li>
             * <li>SizeLessThan: size less than </li>
             * <li>NotContains: does not include</li>
             * </ol>
             * <ul>
             * <li>For STRING type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal</li>
             * </ol>
             * <ul>
             * <li>For BOOLEAN type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal</li>
             * </ol>
             * <ul>
             * <li>For FLOAT type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal </li>
             * <li><blockquote>
             * <p>: greater than </p>
             * </blockquote>
             * </li>
             * <li><blockquote>
             * <p>=: greater than or equal to </p>
             * </blockquote>
             * </li>
             * <li>&lt;: less than </li>
             * <li>&lt;=: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For DOUBLE type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal </li>
             * <li><blockquote>
             * <p>: greater than </p>
             * </blockquote>
             * </li>
             * <li><blockquote>
             * <p>=: greater than or equal to </p>
             * </blockquote>
             * </li>
             * <li>&lt;: less than </li>
             * <li>&lt;=: less than or equal to (Note: There seems to be a repetition here, likely meant to be &quot;&lt;=&quot; for &quot;less than or equal to&quot;)</li>
             * </ol>
             * <ul>
             * <li>For INTEGER type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal </li>
             * <li><blockquote>
             * <p>: greater than </p>
             * </blockquote>
             * </li>
             * <li><blockquote>
             * <p>=: greater than or equal to </p>
             * </blockquote>
             * </li>
             * <li>&lt;: less than </li>
             * <li>&lt;=: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For LONG type:</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal </li>
             * <li><blockquote>
             * <p>: greater than </p>
             * </blockquote>
             * </li>
             * <li><blockquote>
             * <p>=: greater than or equal to </p>
             * </blockquote>
             * </li>
             * <li>&lt;: less than </li>
             * <li>&lt;=: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For INTEGER type (repeated):</li>
             * </ul>
             * <ol>
             * <li>NotIn: not in the list </li>
             * <li>Equals: equals </li>
             * <li>In: in the list </li>
             * <li>NotEquals: does not equal </li>
             * <li><blockquote>
             * <p>: greater than </p>
             * </blockquote>
             * </li>
             * <li><blockquote>
             * <p>=: greater than or equal to </p>
             * </blockquote>
             * </li>
             * <li>&lt;: less than </li>
             * <li>&lt;=: less than or equal to</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Contains</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>Operator value. Options: - For LIST type: </p>
             * <ol>
             * <li>CONTAINS: contains </li>
             * <li>LENGTH_GT: length greater than </li>
             * <li>LENGTH_LT: length less than </li>
             * <li>NOT_CONTAINS: does not contain</li>
             * </ol>
             * <ul>
             * <li>For STRING type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal</li>
             * </ol>
             * <ul>
             * <li>For BOOLEAN type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal</li>
             * </ol>
             * <ul>
             * <li>For FLOAT type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal </li>
             * <li>GT: greater than </li>
             * <li>GTE: greater than or equal to </li>
             * <li>LT: less than </li>
             * <li>LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For DOUBLE type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal </li>
             * <li>GT: greater than </li>
             * <li>GTE: greater than or equal to </li>
             * <li>LT: less than </li>
             * <li>LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For INTEGER type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal </li>
             * <li>GT: greater than </li>
             * <li>GTE: greater than or equal to </li>
             * <li>LT: less than </li>
             * <li>LTE: less than or equal to</li>
             * </ol>
             * <ul>
             * <li>For LONG type:</li>
             * </ul>
             * <ol>
             * <li>NOT_IN: not in the list </li>
             * <li>EQ: equals </li>
             * <li>IN: in the list </li>
             * <li>NOT_EQ: does not equal </li>
             * <li>GT: greater than </li>
             * <li>GTE: greater than or equal to </li>
             * <li>LT: less than </li>
             * <li>LTE: less than or equal to</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>CONTAINS</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchOperators build() {
                return new MatchOperators(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAssetMatchOperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetMatchOperatorsResponseBody</p>
     */
    public static class MatchTypeOperators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchOperators")
        private java.util.List<MatchOperators> matchOperators;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MatchTypeOperators(Builder builder) {
            this.matchOperators = builder.matchOperators;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchTypeOperators create() {
            return builder().build();
        }

        /**
         * @return matchOperators
         */
        public java.util.List<MatchOperators> getMatchOperators() {
            return this.matchOperators;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<MatchOperators> matchOperators; 
            private String type; 

            private Builder() {
            } 

            private Builder(MatchTypeOperators model) {
                this.matchOperators = model.matchOperators;
                this.type = model.type;
            } 

            /**
             * <p>List of operators</p>
             */
            public Builder matchOperators(java.util.List<MatchOperators> matchOperators) {
                this.matchOperators = matchOperators;
                return this;
            }

            /**
             * <p>The type used by the operator. Values:</p>
             * <ul>
             * <li>LIST </li>
             * <li>MAP </li>
             * <li>STRING </li>
             * <li>BOOLEAN </li>
             * <li>FLOAT </li>
             * <li>DOUBLE </li>
             * <li>INTEGER </li>
             * <li>LONG</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LIST</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MatchTypeOperators build() {
                return new MatchTypeOperators(this);
            } 

        } 

    }
}
