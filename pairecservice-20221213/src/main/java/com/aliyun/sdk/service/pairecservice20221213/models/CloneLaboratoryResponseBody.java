// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CloneLaboratoryResponseBody} extends {@link TeaModel}
 *
 * <p>CloneLaboratoryResponseBody</p>
 */
public class CloneLaboratoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    private String laboratoryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneLaboratoryResponseBody(Builder builder) {
        this.laboratoryId = builder.laboratoryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneLaboratoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String laboratoryId; 
        private String requestId; 

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneLaboratoryResponseBody build() {
            return new CloneLaboratoryResponseBody(this);
        } 

    } 

}
