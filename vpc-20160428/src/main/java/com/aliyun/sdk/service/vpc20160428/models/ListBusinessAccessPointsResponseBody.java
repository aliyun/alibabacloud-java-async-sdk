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
         * <p>The list of all access point information for Express Connect circuits.</p>
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
    public static class OpticalModuleModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpticalModuleModel")
        private String opticalModuleModel;

        @com.aliyun.core.annotation.NameInMap("PortType")
        private String portType;

        private OpticalModuleModels(Builder builder) {
            this.opticalModuleModel = builder.opticalModuleModel;
            this.portType = builder.portType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpticalModuleModels create() {
            return builder().build();
        }

        /**
         * @return opticalModuleModel
         */
        public String getOpticalModuleModel() {
            return this.opticalModuleModel;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        public static final class Builder {
            private String opticalModuleModel; 
            private String portType; 

            private Builder() {
            } 

            private Builder(OpticalModuleModels model) {
                this.opticalModuleModel = model.opticalModuleModel;
                this.portType = model.portType;
            } 

            /**
             * <p>The optical module model supported by the Express Connect circuit access point. Valid values:
             * 1000Base-LX : 
             * SFP-GE-LR-SM1310,10KM
             * SFP-GE-ER-SM1310,40KM
             * SFP-GE-ZR-SM1550,80KM 
             * 10GBase-LR : 
             * SFP-10G-LR-SM1310,10KM
             * SFP-10G-ER-SM1550,40KM 
             * SFP-10G-ZR-SM1550,80KM<br>40GBase-LR : 
             * QSFP-40G-LR4-WDM1300,10KM
             * QSFP-40G-ER4-WDM1300,40KM
             * QSFP-40G-ZR4-WDM1300,80KM
             * 100GBase-LR : 
             * QSFP28-100G-LR4-WDM1300,10KM
             * QSFP28-100G-ER4-WDM1300,40KM
             * QSFP28-100G-ZR4-WDM1300,80KM.</p>
             * 
             * <strong>example:</strong>
             * <p>SFP-GE-LR-SM1310,10KM</p>
             */
            public Builder opticalModuleModel(String opticalModuleModel) {
                this.opticalModuleModel = opticalModuleModel;
                return this;
            }

            /**
             * <p>The port type supported by the optical module at the Express Connect circuit access point. Valid values:
             * ● 1000Base-LX: GE single-mode optical port.
             * ● 10GBase-LR: 10 GE single-mode optical port.
             * ● 40GBase-LR: 40 GE single-mode optical port.
             * ● 100GBase-LR: 100 GE single-mode optical port.</p>
             * 
             * <strong>example:</strong>
             * <p>1000Base-LX</p>
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            public OpticalModuleModels build() {
                return new OpticalModuleModels(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("OpticalModuleModels")
        private java.util.List<OpticalModuleModels> opticalModuleModels;

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
            this.opticalModuleModels = builder.opticalModuleModels;
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
         * @return opticalModuleModels
         */
        public java.util.List<OpticalModuleModels> getOpticalModuleModels() {
            return this.opticalModuleModels;
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
            private java.util.List<OpticalModuleModels> opticalModuleModels; 
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
                this.opticalModuleModels = model.opticalModuleModels;
                this.supportLineOperator = model.supportLineOperator;
                this.supportPortTypes = model.supportPortTypes;
            } 

            /**
             * <p>The ID of the Express Connect circuit access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-hangzhou-xs-B</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The name of the Express Connect circuit access point.</p>
             * 
             * <strong>example:</strong>
             * <p>杭州-萧山-B</p>
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * <p>The CloudBox instance ID.</p>
             * <blockquote>
             * <p>This parameter is available only when the queried Express Connect circuit and access point are CloudBox Express Connect circuits and CloudBox access points.</p>
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
             * <p>The collection of optical module models supported by the current access point.</p>
             */
            public Builder opticalModuleModels(java.util.List<OpticalModuleModels> opticalModuleModels) {
                this.opticalModuleModels = opticalModuleModels;
                return this;
            }

            /**
             * <p>The telecommunications service providers that support physical line access. Valid values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China Mobile.</li>
             * <li><strong>CO</strong>: Other Chinese providers.</li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: Other providers outside the Chinese mainland.</li>
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
             * <p>The port types available for purchase at the Express Connect circuit access point. Valid values:</p>
             * <ul>
             * <li><strong>100Base-T</strong>: 100M Ethernet port.</li>
             * <li><strong>1000Base-T</strong>: 1 GE electrical port.</li>
             * <li><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</li>
             * <li><strong>10GBase-T</strong>: 10 GE electrical port.</li>
             * <li><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</li>
             * <li><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</li>
             * <li><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</li>
             * </ul>
             * <blockquote>
             * <p> The creation of 40GBase-LR and 100GBase-LR ports depends on the actual backend port availability. Contact your account manager for details.</p>
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
