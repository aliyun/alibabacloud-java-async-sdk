// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateCenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenResponseBody</p>
 */
public class CreateCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCenResponseBody model) {
            this.cenId = model.cenId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-dc4vwznpwbobrl****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
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
