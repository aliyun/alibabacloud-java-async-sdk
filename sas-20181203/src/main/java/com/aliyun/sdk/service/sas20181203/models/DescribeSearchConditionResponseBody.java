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
 * {@link DescribeSearchConditionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSearchConditionResponseBody</p>
 */
public class DescribeSearchConditionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionList")
    private java.util.List<ConditionList> conditionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ConditionList> getConditionList() {
        return this.conditionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConditionList> conditionList; 
        private String requestId; 

        /**
         * <p>An array that consists of the filter conditions.</p>
         */
        public Builder conditionList(java.util.List<ConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3AEC47AF-8CFA-485E-AC9A-3A8ABC06EA7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSearchConditionResponseBody build() {
            return new DescribeSearchConditionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSearchConditionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSearchConditionResponseBody</p>
     */
    public static class ConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionType")
        private String conditionType;

        @com.aliyun.core.annotation.NameInMap("FilterConditions")
        private String filterConditions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameKey")
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
             * <p>The type of the filter condition. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: default filter conditions.</li>
             * <li><strong>user</strong>: custom filter conditions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder conditionType(String conditionType) {
                this.conditionType = conditionType;
                return this;
            }

            /**
             * <p>The filter condition. The value of this parameter is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><p><strong>filterParams</strong>: the parameters of the filter condition. The value of this field is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><p><strong>labelKey</strong>: the key for rendering.</p>
             * </li>
             * <li><p><strong>label</strong>: the display name.</p>
             * </li>
             * <li><p><strong>value</strong>: the value of the filter condition. The value of this field is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>name</strong>: the name of the filter item.</li>
             * <li><strong>value</strong>: the value of the filter item.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>LogicalExp</strong>: the logical relationship among the filter conditions. Valid values:</p>
             * <ul>
             * <li><strong>AND</strong>: The filter conditions are evaluated by using a logical <strong>AND</strong>.</li>
             * <li><strong>OR</strong>: The filter conditions are evaluated by using a logical <strong>OR</strong>.</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p> If the value of <strong>ConditionType</strong> is <strong>system</strong>, <strong>labelKey</strong> is returned. The labelKey field is used only for internationalization rendering.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;filterParams&quot;:[{&quot;labelKey&quot;:&quot;a|b&quot;,&quot;value&quot;:&quot;{\&quot;name\&quot;:\&quot;sadsasd\&quot;,\&quot;value\&quot;:\&quot;dasdsdas\&quot;}&quot;}],&quot;LogicalExp&quot;:&quot;OR&quot;}</p>
             */
            public Builder filterConditions(String filterConditions) {
                this.filterConditions = filterConditions;
                return this;
            }

            /**
             * <p>The filter condition name.</p>
             * 
             * <strong>example:</strong>
             * <p>StopMachine</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The key of the filter condition name.</p>
             * 
             * <strong>example:</strong>
             * <p>stop_machine</p>
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
