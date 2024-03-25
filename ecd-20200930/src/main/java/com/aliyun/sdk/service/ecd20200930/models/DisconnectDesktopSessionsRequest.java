// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisconnectDesktopSessionsRequest} extends {@link RequestModel}
 *
 * <p>DisconnectDesktopSessionsRequest</p>
 */
public class DisconnectDesktopSessionsRequest extends Request {
    @Query
    @NameInMap("PreCheck")
    private Boolean preCheck;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Sessions")
    @Validation(required = true)
    private java.util.List < Sessions> sessions;

    private DisconnectDesktopSessionsRequest(Builder builder) {
        super(builder);
        this.preCheck = builder.preCheck;
        this.regionId = builder.regionId;
        this.sessions = builder.sessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisconnectDesktopSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preCheck
     */
    public Boolean getPreCheck() {
        return this.preCheck;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessions
     */
    public java.util.List < Sessions> getSessions() {
        return this.sessions;
    }

    public static final class Builder extends Request.Builder<DisconnectDesktopSessionsRequest, Builder> {
        private Boolean preCheck; 
        private String regionId; 
        private java.util.List < Sessions> sessions; 

        private Builder() {
            super();
        } 

        private Builder(DisconnectDesktopSessionsRequest request) {
            super(request);
            this.preCheck = request.preCheck;
            this.regionId = request.regionId;
            this.sessions = request.sessions;
        } 

        /**
         * Specifies whether to perform precheck. If you perform precheck, the system does not disconnect from desktop sessions. Only the sessions that do not meet specific conditions are returned.
         */
        public Builder preCheck(Boolean preCheck) {
            this.putQueryParameter("PreCheck", preCheck);
            this.preCheck = preCheck;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The session details.
         */
        public Builder sessions(java.util.List < Sessions> sessions) {
            this.putQueryParameter("Sessions", sessions);
            this.sessions = sessions;
            return this;
        }

        @Override
        public DisconnectDesktopSessionsRequest build() {
            return new DisconnectDesktopSessionsRequest(this);
        } 

    } 

    public static class Sessions extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("EndUserId")
        private String endUserId;

        private Sessions(Builder builder) {
            this.desktopId = builder.desktopId;
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String desktopId; 
            private String endUserId; 

            /**
             * The cloud desktop ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The end user ID.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
