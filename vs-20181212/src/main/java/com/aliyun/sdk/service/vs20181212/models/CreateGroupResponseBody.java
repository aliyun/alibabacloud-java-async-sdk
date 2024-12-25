// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupResponseBody</p>
 */
public class CreateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

    @com.aliyun.core.annotation.NameInMap("GbIp")
    private String gbIp;

    @com.aliyun.core.annotation.NameInMap("GbPort")
    private Long gbPort;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGroupResponseBody(Builder builder) {
        this.gbId = builder.gbId;
        this.gbIp = builder.gbIp;
        this.gbPort = builder.gbPort;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return gbIp
     */
    public String getGbIp() {
        return this.gbIp;
    }

    /**
     * @return gbPort
     */
    public Long getGbPort() {
        return this.gbPort;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gbId; 
        private String gbIp; 
        private Long gbPort; 
        private String id; 
        private String requestId; 

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.gbId = gbId;
            return this;
        }

        /**
         * GbIp.
         */
        public Builder gbIp(String gbIp) {
            this.gbIp = gbIp;
            return this;
        }

        /**
         * GbPort.
         */
        public Builder gbPort(Long gbPort) {
            this.gbPort = gbPort;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGroupResponseBody build() {
            return new CreateGroupResponseBody(this);
        } 

    } 

}
