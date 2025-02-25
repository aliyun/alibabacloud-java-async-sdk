// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalDatabaseNetworkResponseBody</p>
 */
public class CreateGlobalDatabaseNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GDNId")
    private String GDNId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGlobalDatabaseNetworkResponseBody(Builder builder) {
        this.GDNId = builder.GDNId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDatabaseNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return GDNId
     */
    public String getGDNId() {
        return this.GDNId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String GDNId; 
        private String requestId; 

        /**
         * <p>The ID of the GDN.</p>
         * 
         * <strong>example:</strong>
         * <p>gd-m5ex5wqfqbou*****</p>
         */
        public Builder GDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGlobalDatabaseNetworkResponseBody build() {
            return new CreateGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

}
