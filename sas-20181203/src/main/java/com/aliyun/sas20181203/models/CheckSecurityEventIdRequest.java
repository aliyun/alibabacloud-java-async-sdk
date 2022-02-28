// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSecurityEventIdRequest} extends {@link RequestModel}
 *
 * <p>CheckSecurityEventIdRequest</p>
 */
public class CheckSecurityEventIdRequest extends Request {
    @Query
    @NameInMap("SecurityEventIds")
    private java.util.List < String > securityEventIds;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private CheckSecurityEventIdRequest(Builder builder) {
        super(builder);
        this.securityEventIds = builder.securityEventIds;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSecurityEventIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityEventIds
     */
    public java.util.List < String > getSecurityEventIds() {
        return this.securityEventIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CheckSecurityEventIdRequest, Builder> {
        private java.util.List < String > securityEventIds; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CheckSecurityEventIdRequest response) {
            super(response);
            this.securityEventIds = response.securityEventIds;
            this.uuid = response.uuid;
        } 

        /**
         * SecurityEventIds.
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CheckSecurityEventIdRequest build() {
            return new CheckSecurityEventIdRequest(this);
        } 

    } 

}
