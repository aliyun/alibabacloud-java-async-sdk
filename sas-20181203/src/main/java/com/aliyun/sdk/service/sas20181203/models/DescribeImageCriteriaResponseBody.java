// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageCriteriaResponseBody</p>
 */
public class DescribeImageCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCriteriaResponseBody create() {
        return builder().build();
    }

    /**
     * @return criteriaList
     */
    public java.util.List < CriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CriteriaList> criteriaList; 
        private String requestId; 

        /**
         * The list of the search conditions.
         */
        public Builder criteriaList(java.util.List < CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageCriteriaResponseBody build() {
            return new DescribeImageCriteriaResponseBody(this);
        } 

    } 

    public static class CriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private CriteriaList(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CriteriaList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String values; 

            /**
             * The name of the search condition.
             * <p>
             * - **tag**: the tag of the image
             * - **digest**: the digest of the image
             * - **vulStatus**: the status of the vulnerability
             * - **alarmStatus**: the status of the alert
             * - **riskStatus**: the status of the risk
             * - **registryType**: the type of the image repository
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the search condition. Valid values:
             * <p>
             * - **input**: The search condition needs to be specified.
             * - **select**: The search condition is an option that can be selected from the drop-down list.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The values of the search condition. This parameter is returned only if the value of Type is select.
             * <p>
             * > If the value of **Type** is **input**, the value of this parameter is an empty string.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public CriteriaList build() {
                return new CriteriaList(this);
            } 

        } 

    }
}
