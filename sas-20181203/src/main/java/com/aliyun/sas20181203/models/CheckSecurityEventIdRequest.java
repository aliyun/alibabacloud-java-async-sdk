// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private java.util.List < String > securityEventIds; 
        private String uuid; 

        /**
         * <p>SecurityEventIds.</p>
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public CheckSecurityEventIdRequest build() {
            return new CheckSecurityEventIdRequest(this);
        } 

    } 

}
