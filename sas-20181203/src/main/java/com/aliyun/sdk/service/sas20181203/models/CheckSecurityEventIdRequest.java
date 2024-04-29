// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSecurityEventIdRequest} extends {@link RequestModel}
 *
 * <p>CheckSecurityEventIdRequest</p>
 */
public class CheckSecurityEventIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    private java.util.List < String > securityEventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CheckSecurityEventIdRequest request) {
            super(request);
            this.securityEventIds = request.securityEventIds;
            this.uuid = request.uuid;
        } 

        /**
         * The IDs of alert events. You can specify up to 100 IDs. If you do not specify this parameter, the value of the response parameter **Data** is **false**. The value false indicates that no alert events are generated on the server.
         * <p>
         * 
         * > You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the IDs of alert events.
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
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
