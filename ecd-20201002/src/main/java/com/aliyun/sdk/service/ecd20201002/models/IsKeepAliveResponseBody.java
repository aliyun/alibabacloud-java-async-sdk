// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link IsKeepAliveResponseBody} extends {@link TeaModel}
 *
 * <p>IsKeepAliveResponseBody</p>
 */
public class IsKeepAliveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsKeepAlive")
    private Boolean isKeepAlive;

    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private IsKeepAliveResponseBody(Builder builder) {
        this.isKeepAlive = builder.isKeepAlive;
        this.officeSiteId = builder.officeSiteId;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsKeepAliveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isKeepAlive
     */
    public Boolean getIsKeepAlive() {
        return this.isKeepAlive;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private Boolean isKeepAlive; 
        private String officeSiteId; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(IsKeepAliveResponseBody model) {
            this.isKeepAlive = model.isKeepAlive;
            this.officeSiteId = model.officeSiteId;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
        } 

        /**
         * IsKeepAlive.
         */
        public Builder isKeepAlive(Boolean isKeepAlive) {
            this.isKeepAlive = isKeepAlive;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public IsKeepAliveResponseBody build() {
            return new IsKeepAliveResponseBody(this);
        } 

    } 

}
