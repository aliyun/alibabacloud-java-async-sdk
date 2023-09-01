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
         * The information about the search conditions of assets.
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
             * *   **vendor**: providers.
             * *   **regionIds**: IDs of supported regions
             */
            public Builder multiValues(String multiValues) {
                this.multiValues = multiValues;
                return this;
            }

            /**
             * The name of the search condition. Valid values:
             * <p>
             * 
             * *   **internetIp**: the public IP address.
             * *   **intranetIp**: the private IP address.
             * *   **instanceName**: the name of the instance.
             * *   **instanceId**: the instance ID.
             * *   **vpcInstanceId**: the ID of the virtual private cloud (VPC) to which the instance belongs.
             * *   **osName**: the operating system.
             * *   **osType**: the operating system type.
             * *   **hcStatus**: indicates whether baseline risks exist.
             * *   **vulStatus**: indicates whether vulnerabilities exist.
             * *   **alarmStatus**: indicates whether security alerts exist.
             * *   **riskStatus**: indicates whether risks exist.
             * *   **clientStatus**: indicates the status of the client.
             * *   **runningStatus**: the running status of the asset.
             * *   **tagName**: the name of the tag.
             * *   **groupName**: the name of the server group.
             * *   **regionId**: the region ID.
             * *   **importance**: the importance of the asset.
             * *   **exposedStatus**: indicates whether the server is exposed.
             * *   **authVersion**: the authorization version.
             * *   **flag**: the cloud service provider.
             * *   **ipList**: the IP addresses.
             * *   **uuidList** :the UUID.
             * *   **tagKeyValue**: the ECS tag.
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
