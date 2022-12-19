// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCriteriaResponseBody</p>
 */
public class DescribeCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCriteriaResponseBody create() {
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
         * An array that consists of the filter conditions.
         */
        public Builder criteriaList(java.util.List < CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCriteriaResponseBody build() {
            return new DescribeCriteriaResponseBody(this);
        } 

    } 

    public static class CriteriaList extends TeaModel {
        @NameInMap("MultiValues")
        private String multiValues;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private String values;

        private CriteriaList(Builder builder) {
            this.multiValues = builder.multiValues;
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
         * @return multiValues
         */
        public String getMultiValues() {
            return this.multiValues;
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
            private String multiValues; 
            private String name; 
            private String type; 
            private String values; 

            /**
             * The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **vendor**: providers
             * *   **regionIds**: IDs of supported regions
             */
            public Builder multiValues(String multiValues) {
                this.multiValues = multiValues;
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
             * The type of the filter condition. Valid values:
             * <p>
             * 
             * *   **input**: The filter condition needs to be specified.
             * *   **select**: The filter condition is an option that can be selected from the drop-down list.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The attribute values of the assets that match the keyword.
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
