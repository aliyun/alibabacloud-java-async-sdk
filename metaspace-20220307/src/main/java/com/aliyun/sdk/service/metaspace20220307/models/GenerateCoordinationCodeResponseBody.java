// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

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
 * {@link GenerateCoordinationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateCoordinationCodeResponseBody</p>
 */
public class GenerateCoordinationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CoordinationCode")
    private String coordinationCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateCoordinationCodeResponseBody(Builder builder) {
        this.coordinationCode = builder.coordinationCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCoordinationCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return coordinationCode
     */
    public String getCoordinationCode() {
        return this.coordinationCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String coordinationCode; 
        private String requestId; 

        /**
         * CoordinationCode.
         */
        public Builder coordinationCode(String coordinationCode) {
            this.coordinationCode = coordinationCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateCoordinationCodeResponseBody build() {
            return new GenerateCoordinationCodeResponseBody(this);
        } 

    } 

}
