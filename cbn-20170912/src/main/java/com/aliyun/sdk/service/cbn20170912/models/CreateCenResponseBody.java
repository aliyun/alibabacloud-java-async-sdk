// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenResponseBody</p>
 */
public class CreateCenResponseBody extends TeaModel {
    @NameInMap("CenId")
    private String cenId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCenResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cenId; 
        private String requestId; 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCenResponseBody build() {
            return new CreateCenResponseBody(this);
        } 

    } 

}
