// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerCriteriaResponseBody</p>
 */
public class DescribeContainerCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerCriteriaResponseBody create() {
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
         * An array that consists of information about the filter condition.
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

        public DescribeContainerCriteriaResponseBody build() {
            return new DescribeContainerCriteriaResponseBody(this);
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
             * The name of the search condition. Valid values:
             * <p>
             * 
             * *   **instanceId**: the ID of the container instance.
             * *   **clusterId**: the cluster ID.
             * *   **regionId**: the ID of the region in which the container resides.
             * *   **clusterName**: the name of the cluster.
             * *   **image**: the name of the image.
             * *   **imageRepoName**: the name of the image repository.
             * *   **imageRepoNamespace**: the namespace of the image repository.
             * *   **imageRepoTag**: the tag of the image repository.
             * *   **imageDigest**: the image digest.
             * *   **ClusterType**: the type of the cluster.
             * *   **hostIp**: the public IP address.
             * *   **pod**: the pod.
             * *   **podIp**: the IP address of the pod.
             * *   **containerId**: the container ID.
             * *   **vulStatus**: indicates whether vulnerabilities exist in the container.
             * *   **alarmStatus**: indicates whether alerts are generated for the container.
             * *   **riskStatus**: indicates whether risks exist in the container.
             * *   **riskLevel**: the risk level of the container.
             * *   **containerScope**: the type of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the search condition. Valid values:
             * <p>
             * 
             * *   **input**: The search condition needs to be specified.
             * *   **select**: The search condition is an option that can be selected from the drop-down list.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The values of the search condition. This parameter is returned only if the value of **Type** is set to **select**.
             * <p>
             * 
             * > If the value of **Type** is set to **input**, the return value of this parameter is empty.
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
