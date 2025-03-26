// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListBusinessAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessAccessPointsResponseBody</p>
 */
public class ListBusinessAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessAccessPoints")
    private java.util.List<BusinessAccessPoints> businessAccessPoints;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessAccessPoints
     */
    public java.util.List<BusinessAccessPoints> getBusinessAccessPoints() {
        return this.businessAccessPoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BusinessAccessPoints> businessAccessPoints; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListBusinessAccessPointsResponseBody model) {
            this.businessAccessPoints = model.businessAccessPoints;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of access points.</p>
         */
        public Builder businessAccessPoints(java.util.List<BusinessAccessPoints> businessAccessPoints) {
            this.businessAccessPoints = businessAccessPoints;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>611CB80C-B6A9-43DB-9E38-0B0AC3D9B58F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBusinessAccessPointsResponseBody build() {
            return new ListBusinessAccessPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBusinessAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBusinessAccessPointsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BusinessAccessPoints model) {
                this.accessPointId = model.accessPointId;
                this.accessPointName = model.accessPointName;
                this.cloudBoxInstanceIds = model.cloudBoxInstanceIds;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
                this.supportLineOperator = model.supportLineOperator;
                this.supportPortTypes = model.supportPortTypes;
            } 

            /**
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-hangzhou-xs-B</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The name of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou-xs-B</p>
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * <p>The ID of the cloud box.</p>
             * <blockquote>
             * <p> You can query this parameter if the Express Connect circuits and access points are of the cloud box type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cb-****</p>
             */
            public Builder cloudBoxInstanceIds(String cloudBoxInstanceIds) {
                this.cloudBoxInstanceIds = cloudBoxInstanceIds;
                return this;
            }

            /**
             * <p>The latitude of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>30.198416</p>
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * <p>The longitude of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>120.247514</p>
             */
            public Builder longitude(Double longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China Mobile.</li>
             * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CT</p>
             */
            public Builder supportLineOperator(String supportLineOperator) {
                this.supportLineOperator = supportLineOperator;
                return this;
            }

            /**
             * <p>The port type supported by the access point. Valid values:</p>
             * <ul>
             * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
             * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
             * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
             * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
             * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
             * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
             * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
             * </ul>
             * <blockquote>
             * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000Base-T</p>
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
