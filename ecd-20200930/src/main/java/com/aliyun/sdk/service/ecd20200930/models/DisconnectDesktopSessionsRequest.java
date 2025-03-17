// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DisconnectDesktopSessionsRequest} extends {@link RequestModel}
 *
 * <p>DisconnectDesktopSessionsRequest</p>
 */
public class DisconnectDesktopSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreCheck")
    private Boolean preCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sessions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Sessions> sessions;

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
    public java.util.List<Sessions> getSessions() {
        return this.sessions;
    }

    public static final class Builder extends Request.Builder<DisconnectDesktopSessionsRequest, Builder> {
        private Boolean preCheck; 
        private String regionId; 
        private java.util.List<Sessions> sessions; 

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
         * <p>Specifies whether to perform precheck. If you perform precheck, the system does not disconnect from desktop sessions. Only the sessions that do not meet specific conditions are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder preCheck(Boolean preCheck) {
            this.putQueryParameter("PreCheck", preCheck);
            this.preCheck = preCheck;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session details.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.putQueryParameter("Sessions", sessions);
            this.sessions = sessions;
            return this;
        }

        @Override
        public DisconnectDesktopSessionsRequest build() {
            return new DisconnectDesktopSessionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DisconnectDesktopSessionsRequest} extends {@link TeaModel}
     *
     * <p>DisconnectDesktopSessionsRequest</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
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

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.desktopId = model.desktopId;
                this.endUserId = model.endUserId;
            } 

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-90g15fkhsxxxn0unj</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wy01</p>
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
