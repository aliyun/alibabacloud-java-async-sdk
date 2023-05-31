// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoCriteriaResponseBody</p>
 */
public class DescribeImageRepoCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageRepoCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoCriteriaResponseBody create() {
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
         * An array consisting of the filter conditions that are supported by the image repository.
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

        public DescribeImageRepoCriteriaResponseBody build() {
            return new DescribeImageRepoCriteriaResponseBody(this);
        } 

    } 

    public static class CriteriaList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
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
             * The name of the filter condition. Valid values:
             * <p>
             * 
             * *   **instanceId**: the ID of the image instance.
             * *   **repoName**: the name of the image repository.
             * *   **repoId**: the ID of the image repository.
             * *   **repoNamespace**: the namespace of the image repository.
             * *   **regionId**: the region of the image.
             * *   **vulStatus**: indicates whether vulnerabilities exist.
             * *   **alarmStatus**: indicates whether security alerts exist.
             * *   **hcStatus**: indicates whether baseline risks exist.
             * *   **riskStatus**: indicates whether risks exist.
             * *   **registryType**: the type of the image repository.
             * *   **ImageId**: the ID of the image.
             * *   **tag**: the tag of the image
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
             * The value of the filter condition. This parameter is returned only if the value of **Type** is **select**.
             * <p>
             * 
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
