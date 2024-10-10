// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>An array that consists of information about the filter condition.</p>
         */
        public Builder criteriaList(java.util.List < CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerCriteriaResponseBody build() {
            return new DescribeContainerCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerCriteriaResponseBody</p>
     */
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
             * <p>The name of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>instanceId</strong>: the ID of the container instance.</li>
             * <li><strong>clusterId</strong>: the cluster ID.</li>
             * <li><strong>regionId</strong>: the ID of the region in which the container resides.</li>
             * <li><strong>clusterName</strong>: the name of the cluster.</li>
             * <li><strong>image</strong>: the name of the image.</li>
             * <li><strong>imageRepoName</strong>: the name of the image repository.</li>
             * <li><strong>imageRepoNamespace</strong>: the namespace of the image repository.</li>
             * <li><strong>imageRepoTag</strong>: the tag of the image repository.</li>
             * <li><strong>imageDigest</strong>: the image digest.</li>
             * <li><strong>ClusterType</strong>: the type of the cluster.</li>
             * <li><strong>hostIp</strong>: the public IP address.</li>
             * <li><strong>pod</strong>: the pod.</li>
             * <li><strong>podIp</strong>: the IP address of the pod.</li>
             * <li><strong>containerId</strong>: the container ID.</li>
             * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist in the container.</li>
             * <li><strong>alarmStatus</strong>: indicates whether alerts are generated for the container.</li>
             * <li><strong>riskStatus</strong>: indicates whether risks exist in the container.</li>
             * <li><strong>riskLevel</strong>: the risk level of the container.</li>
             * <li><strong>containerScope</strong>: the type of the container.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>clusterId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: The search condition needs to be specified.</li>
             * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is set to <strong>select</strong>.</p>
             * <blockquote>
             * <p>If the value of <strong>Type</strong> is set to <strong>input</strong>, the return value of this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes,NotManagedKubernetes,PrivateKubernetes</p>
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
