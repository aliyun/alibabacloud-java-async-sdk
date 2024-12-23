// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

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
 * {@link AttachEaisEiResponseBody} extends {@link TeaModel}
 *
 * <p>AttachEaisEiResponseBody</p>
 */
public class AttachEaisEiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientInstanceId")
    private String clientInstanceId;

    @com.aliyun.core.annotation.NameInMap("EiInstanceId")
    private String eiInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachEaisEiResponseBody(Builder builder) {
        this.clientInstanceId = builder.clientInstanceId;
        this.eiInstanceId = builder.eiInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEaisEiResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientInstanceId
     */
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    /**
     * @return eiInstanceId
     */
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientInstanceId; 
        private String eiInstanceId; 
        private String requestId; 

        /**
         * ClientInstanceId.
         */
        public Builder clientInstanceId(String clientInstanceId) {
            this.clientInstanceId = clientInstanceId;
            return this;
        }

        /**
         * EiInstanceId.
         */
        public Builder eiInstanceId(String eiInstanceId) {
            this.eiInstanceId = eiInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachEaisEiResponseBody build() {
            return new AttachEaisEiResponseBody(this);
        } 

    } 

}
