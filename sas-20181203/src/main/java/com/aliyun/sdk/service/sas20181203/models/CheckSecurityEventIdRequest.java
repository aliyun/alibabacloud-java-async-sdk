// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CheckSecurityEventIdRequest} extends {@link RequestModel}
 *
 * <p>CheckSecurityEventIdRequest</p>
 */
public class CheckSecurityEventIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    private java.util.List<String> securityEventIds;

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
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CheckSecurityEventIdRequest, Builder> {
        private java.util.List<String> securityEventIds; 
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
         * <p>The IDs of alert events. You can specify up to 100 IDs. If you do not specify this parameter, the value of the response parameter <strong>Data</strong> is <strong>false</strong>. The value false indicates that no alert events are generated on the server.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the IDs of alert events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1234567&quot;,&quot;98765432&quot;]</p>
         */
        public Builder securityEventIds(java.util.List<String> securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>96ad2473-bc60-45ba-ad1c-932e2866****</p>
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
