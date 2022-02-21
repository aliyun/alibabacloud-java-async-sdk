// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSecurityEventsRequest</p>
 */
public class HandleSecurityEventsRequest extends Request {
    @Query
    @NameInMap("OperationCode")
    @Validation(required = true)
    private String operationCode;

    @Query
    @NameInMap("OperationParams")
    private String operationParams;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityEvent")
    private java.util.List < SecurityEvent> securityEvent;

    private HandleSecurityEventsRequest(Builder builder) {
        super(builder);
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.regionId = builder.regionId;
        this.securityEvent = builder.securityEvent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSecurityEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationParams
     */
    public String getOperationParams() {
        return this.operationParams;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityEvent
     */
    public java.util.List < SecurityEvent> getSecurityEvent() {
        return this.securityEvent;
    }

    public static final class Builder extends Request.Builder<HandleSecurityEventsRequest, Builder> {
        private String operationCode; 
        private String operationParams; 
        private String regionId; 
        private java.util.List < SecurityEvent> securityEvent; 

        private Builder() {
            super();
        } 

        private Builder(HandleSecurityEventsRequest response) {
            super(response);
            this.operationCode = response.operationCode;
            this.operationParams = response.operationParams;
            this.regionId = response.regionId;
            this.securityEvent = response.securityEvent;
        } 

        /**
         * OperationCode.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * OperationParams.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityEvent.
         */
        public Builder securityEvent(java.util.List < SecurityEvent> securityEvent) {
            this.putQueryParameter("SecurityEvent", securityEvent);
            this.securityEvent = securityEvent;
            return this;
        }

        @Override
        public HandleSecurityEventsRequest build() {
            return new HandleSecurityEventsRequest(this);
        } 

    } 

    public static class SecurityEvent extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("SecurityEventId")
        private String securityEventId;

        private SecurityEvent(Builder builder) {
            this.desktopId = builder.desktopId;
            this.securityEventId = builder.securityEventId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEvent create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return securityEventId
         */
        public String getSecurityEventId() {
            return this.securityEventId;
        }

        public static final class Builder {
            private String desktopId; 
            private String securityEventId; 

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * SecurityEventId.
             */
            public Builder securityEventId(String securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            public SecurityEvent build() {
                return new SecurityEvent(this);
            } 

        } 

    }
}
