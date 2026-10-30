// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ModifyTransitRouterCapacityReservationsRequest} extends {@link RequestModel}
 *
 * <p>ModifyTransitRouterCapacityReservationsRequest</p>
 */
public class ModifyTransitRouterCapacityReservationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSets")
    private java.util.List<DeploymentSets> deploymentSets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumTransitRouterCapacities")
    private java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetCapacityReservations")
    private java.util.List<ResetCapacityReservations> resetCapacityReservations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private ModifyTransitRouterCapacityReservationsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deploymentSets = builder.deploymentSets;
        this.minimumTransitRouterCapacities = builder.minimumTransitRouterCapacities;
        this.resetCapacityReservations = builder.resetCapacityReservations;
        this.transitRouterId = builder.transitRouterId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTransitRouterCapacityReservationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deploymentSets
     */
    public java.util.List<DeploymentSets> getDeploymentSets() {
        return this.deploymentSets;
    }

    /**
     * @return minimumTransitRouterCapacities
     */
    public java.util.List<MinimumTransitRouterCapacities> getMinimumTransitRouterCapacities() {
        return this.minimumTransitRouterCapacities;
    }

    /**
     * @return resetCapacityReservations
     */
    public java.util.List<ResetCapacityReservations> getResetCapacityReservations() {
        return this.resetCapacityReservations;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ModifyTransitRouterCapacityReservationsRequest, Builder> {
        private String clientToken; 
        private java.util.List<DeploymentSets> deploymentSets; 
        private java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities; 
        private java.util.List<ResetCapacityReservations> resetCapacityReservations; 
        private String transitRouterId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTransitRouterCapacityReservationsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deploymentSets = request.deploymentSets;
            this.minimumTransitRouterCapacities = request.minimumTransitRouterCapacities;
            this.resetCapacityReservations = request.resetCapacityReservations;
            this.transitRouterId = request.transitRouterId;
            this.version = request.version;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the token on your client to ensure that the token is unique across different requests. The client token only supports ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the request ID of the API request as the client token. The request ID may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The deployment set information for the capacity reservation.</p>
         */
        public Builder deploymentSets(java.util.List<DeploymentSets> deploymentSets) {
            String deploymentSetsShrink = shrink(deploymentSets, "DeploymentSets", "json");
            this.putQueryParameter("DeploymentSets", deploymentSetsShrink);
            this.deploymentSets = deploymentSets;
            return this;
        }

        /**
         * <p>The reserved capacity for each zone in the capacity reservation.</p>
         */
        public Builder minimumTransitRouterCapacities(java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities) {
            String minimumTransitRouterCapacitiesShrink = shrink(minimumTransitRouterCapacities, "MinimumTransitRouterCapacities", "json");
            this.putQueryParameter("MinimumTransitRouterCapacities", minimumTransitRouterCapacitiesShrink);
            this.minimumTransitRouterCapacities = minimumTransitRouterCapacities;
            return this;
        }

        /**
         * <p>Cancels capacity reservations.</p>
         */
        public Builder resetCapacityReservations(java.util.List<ResetCapacityReservations> resetCapacityReservations) {
            String resetCapacityReservationsShrink = shrink(resetCapacityReservations, "ResetCapacityReservations", "json");
            this.putQueryParameter("ResetCapacityReservations", resetCapacityReservationsShrink);
            this.resetCapacityReservations = resetCapacityReservations;
            return this;
        }

        /**
         * <p>The ID of the transit router instance for forward routing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ModifyTransitRouterCapacityReservationsRequest build() {
            return new ModifyTransitRouterCapacityReservationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTransitRouterCapacityReservationsRequest} extends {@link TeaModel}
     *
     * <p>ModifyTransitRouterCapacityReservationsRequest</p>
     */
    public static class DeploymentSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentSetID")
        private String deploymentSetID;

        @com.aliyun.core.annotation.NameInMap("ZoneID")
        private String zoneID;

        private DeploymentSets(Builder builder) {
            this.deploymentSetID = builder.deploymentSetID;
            this.zoneID = builder.zoneID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentSets create() {
            return builder().build();
        }

        /**
         * @return deploymentSetID
         */
        public String getDeploymentSetID() {
            return this.deploymentSetID;
        }

        /**
         * @return zoneID
         */
        public String getZoneID() {
            return this.zoneID;
        }

        public static final class Builder {
            private String deploymentSetID; 
            private String zoneID; 

            private Builder() {
            } 

            private Builder(DeploymentSets model) {
                this.deploymentSetID = model.deploymentSetID;
                this.zoneID = model.zoneID;
            } 

            /**
             * <p>The ID of the deployment set instance used.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-badxcs*****</p>
             */
            public Builder deploymentSetID(String deploymentSetID) {
                this.deploymentSetID = deploymentSetID;
                return this;
            }

            /**
             * <p>The zone for which to modify the deployment set of the capacity reservation.</p>
             * <ul>
             * <li>To cancel the deployment set, specify the zone and leave the deployment set ID empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder zoneID(String zoneID) {
                this.zoneID = zoneID;
                return this;
            }

            public DeploymentSets build() {
                return new DeploymentSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTransitRouterCapacityReservationsRequest} extends {@link TeaModel}
     *
     * <p>ModifyTransitRouterCapacityReservationsRequest</p>
     */
    public static class DataProcessGbps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
        private Long target;

        private DataProcessGbps(Builder builder) {
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataProcessGbps create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Long target; 

            private Builder() {
            } 

            private Builder(DataProcessGbps model) {
                this.target = model.target;
            } 

            /**
             * <p>The target reserved capacity for the specified zone.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            public DataProcessGbps build() {
                return new DataProcessGbps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTransitRouterCapacityReservationsRequest} extends {@link TeaModel}
     *
     * <p>ModifyTransitRouterCapacityReservationsRequest</p>
     */
    public static class MinimumTransitRouterCapacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataProcessGbps")
        private DataProcessGbps dataProcessGbps;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MinimumTransitRouterCapacities(Builder builder) {
            this.dataProcessGbps = builder.dataProcessGbps;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinimumTransitRouterCapacities create() {
            return builder().build();
        }

        /**
         * @return dataProcessGbps
         */
        public DataProcessGbps getDataProcessGbps() {
            return this.dataProcessGbps;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private DataProcessGbps dataProcessGbps; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MinimumTransitRouterCapacities model) {
                this.dataProcessGbps = model.dataProcessGbps;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The reserved capacity for the specified zone.</p>
             */
            public Builder dataProcessGbps(DataProcessGbps dataProcessGbps) {
                this.dataProcessGbps = dataProcessGbps;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-l</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MinimumTransitRouterCapacities build() {
                return new MinimumTransitRouterCapacities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTransitRouterCapacityReservationsRequest} extends {@link TeaModel}
     *
     * <p>ModifyTransitRouterCapacityReservationsRequest</p>
     */
    public static class ResetCapacityReservations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ResetCapacityReservations(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResetCapacityReservations create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ResetCapacityReservations model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the zone for which to cancel the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ResetCapacityReservations build() {
                return new ResetCapacityReservations(this);
            } 

        } 

    }
}
