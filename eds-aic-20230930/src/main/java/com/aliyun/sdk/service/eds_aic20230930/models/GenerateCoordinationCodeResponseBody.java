// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
    @com.aliyun.core.annotation.NameInMap("CoordinatorCode")
    private String coordinatorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateCoordinationCodeResponseBody(Builder builder) {
        this.coordinatorCode = builder.coordinatorCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCoordinationCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinatorCode
     */
    public String getCoordinatorCode() {
        return this.coordinatorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String coordinatorCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateCoordinationCodeResponseBody model) {
            this.coordinatorCode = model.coordinatorCode;
            this.requestId = model.requestId;
        } 

        /**
         * CoordinatorCode.
         */
        public Builder coordinatorCode(String coordinatorCode) {
            this.coordinatorCode = coordinatorCode;
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
