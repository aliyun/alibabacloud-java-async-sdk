// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAegisContainerPluginRuleCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>GetAegisContainerPluginRuleCriteriaResponseBody</p>
 */
public class GetAegisContainerPluginRuleCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAegisContainerPluginRuleCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAegisContainerPluginRuleCriteriaResponseBody create() {
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
         * <p>The information about the search condition.</p>
         */
        public Builder criteriaList(java.util.List < CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DA8133CC-CCA0-5CF2-BF64-FE7D52C44***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAegisContainerPluginRuleCriteriaResponseBody build() {
            return new GetAegisContainerPluginRuleCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAegisContainerPluginRuleCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAegisContainerPluginRuleCriteriaResponseBody</p>
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
             * <li><strong>clusterType</strong>: the type of the cluster.</li>
             * <li><strong>hostIp</strong>: the public IP address.</li>
             * <li><strong>pod</strong>: the pod.</li>
             * <li><strong>podIp</strong>: the IP address of the pod.</li>
             * <li><strong>containerId</strong>: the container ID.</li>
             * <li><strong>containerScope</strong>: the type of the container.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>containerScope</p>
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
             * <p>select</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The values.</p>
             * 
             * <strong>example:</strong>
             * <p>NO,YES</p>
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
