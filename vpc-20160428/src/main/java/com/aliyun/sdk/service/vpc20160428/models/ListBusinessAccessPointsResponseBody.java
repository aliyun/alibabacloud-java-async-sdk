// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessAccessPointsResponseBody</p>
 */
public class ListBusinessAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessAccessPoints")
    private java.util.List < BusinessAccessPoints> businessAccessPoints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBusinessAccessPointsResponseBody(Builder builder) {
        this.businessAccessPoints = builder.businessAccessPoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBusinessAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessAccessPoints
     */
    public java.util.List < BusinessAccessPoints> getBusinessAccessPoints() {
        return this.businessAccessPoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BusinessAccessPoints> businessAccessPoints; 
        private String requestId; 

        /**
         * The list of access points.
         */
        public Builder businessAccessPoints(java.util.List < BusinessAccessPoints> businessAccessPoints) {
            this.businessAccessPoints = businessAccessPoints;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBusinessAccessPointsResponseBody build() {
            return new ListBusinessAccessPointsResponseBody(this);
        } 

    } 

    public static class BusinessAccessPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AccessPointName")
        private String accessPointName;

        @com.aliyun.core.annotation.NameInMap("CloudBoxInstanceIds")
        private String cloudBoxInstanceIds;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private Double latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private Double longitude;

        @com.aliyun.core.annotation.NameInMap("SupportLineOperator")
        private String supportLineOperator;

        @com.aliyun.core.annotation.NameInMap("SupportPortTypes")
        private String supportPortTypes;

        private BusinessAccessPoints(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.accessPointName = builder.accessPointName;
            this.cloudBoxInstanceIds = builder.cloudBoxInstanceIds;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.supportLineOperator = builder.supportLineOperator;
            this.supportPortTypes = builder.supportPortTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessAccessPoints create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return accessPointName
         */
        public String getAccessPointName() {
            return this.accessPointName;
        }

        /**
         * @return cloudBoxInstanceIds
         */
        public String getCloudBoxInstanceIds() {
            return this.cloudBoxInstanceIds;
        }

        /**
         * @return latitude
         */
        public Double getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Double getLongitude() {
            return this.longitude;
        }

        /**
         * @return supportLineOperator
         */
        public String getSupportLineOperator() {
            return this.supportLineOperator;
        }

        /**
         * @return supportPortTypes
         */
        public String getSupportPortTypes() {
            return this.supportPortTypes;
        }

        public static final class Builder {
            private String accessPointId; 
            private String accessPointName; 
            private String cloudBoxInstanceIds; 
            private Double latitude; 
            private Double longitude; 
            private String supportLineOperator; 
            private String supportPortTypes; 

            /**
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The name of the access point.
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * The ID of the cloud box.
             * <p>
             * 
             * >  You can query this parameter if the Express Connect circuits and access points are of the cloud box type.
             */
            public Builder cloudBoxInstanceIds(String cloudBoxInstanceIds) {
                this.cloudBoxInstanceIds = cloudBoxInstanceIds;
                return this;
            }

            /**
             * The latitude of the access point.
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * The longitude of the access point.
             */
            public Builder longitude(Double longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * The connectivity provider of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **CT**: China Telecom.
             * *   **CU**: China Unicom.
             * *   **CM**: China Mobile.
             * *   **CO**: other connectivity providers in the Chinese mainland.
             * *   **Equinix**: Equinix.
             * *   **Other**: other connectivity providers outside the Chinese mainland.
             */
            public Builder supportLineOperator(String supportLineOperator) {
                this.supportLineOperator = supportLineOperator;
                return this;
            }

            /**
             * The port type supported by the access point. Valid values:
             * <p>
             * 
             * *   **100Base-T**: 100 Mbit/s copper Ethernet port
             * *   **1000Base-T**: 1,000 Mbit/s copper Ethernet port
             * *   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)
             * *   **10GBase-T**: 10,000 Mbit/s copper Ethernet port
             * *   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)
             * *   **40GBase-LR**: 40,000 Mbit/s single-mode optical port
             * *   **100GBase-LR**: 100,000 Mbit/s single-mode optical port
             * 
             * >  To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.
             */
            public Builder supportPortTypes(String supportPortTypes) {
                this.supportPortTypes = supportPortTypes;
                return this;
            }

            public BusinessAccessPoints build() {
                return new BusinessAccessPoints(this);
            } 

        } 

    }
}
