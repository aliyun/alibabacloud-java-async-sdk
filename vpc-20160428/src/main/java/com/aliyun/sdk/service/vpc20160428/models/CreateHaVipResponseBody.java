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
 * {@link CreateHaVipResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHaVipResponseBody</p>
 */
public class CreateHaVipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HaVipId")
    private String haVipId;

    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHaVipResponseBody(Builder builder) {
        this.haVipId = builder.haVipId;
        this.ipAddress = builder.ipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHaVipResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String haVipId; 
        private String ipAddress; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHaVipResponseBody model) {
            this.haVipId = model.haVipId;
            this.ipAddress = model.ipAddress;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-2zeo05qre24nhrqpy****</p>
         */
        public Builder haVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }

        /**
         * <p>The IP address of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.10</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C44F62BE-9CE7-4277-B117-69243F3988BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHaVipResponseBody build() {
            return new CreateHaVipResponseBody(this);
        } 

    } 

}
