// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetCriteriaResponseBody</p>
 */
public class GetCloudAssetCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List < CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetCriteriaResponseBody create() {
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
         * An array consisting of the information about the filter conditions that are used to search for cloud assets.
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

        public GetCloudAssetCriteriaResponseBody build() {
            return new GetCloudAssetCriteriaResponseBody(this);
        } 

    } 

    public static class CriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultiValues")
        private String multiValues;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * The name of the filter condition. Valid values:
             * <p>
             * 
             * *   **instanceId**: the ID of the instance
             * *   **instanceName**: the name of an instance
             * *   **internetIp**: the public IP address
             * *   **riskStatus**: the risk status
             * *   **vendorRegionId**: the region ID by service provider
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
             * The values of the search condition. This parameter is returned only if the value of **Type** is **select**.
             * <p>
             * 
             * >  If the value of **Type** is **input**, the value of this parameter is an empty string.
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
