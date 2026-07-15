// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateCpfsAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCpfsAccessPointResponseBody</p>
 */
public class CreateCpfsAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    private String accessPointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCpfsAccessPointResponseBody(Builder builder) {
        this.accessPointId = builder.accessPointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCpfsAccessPointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessPointId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCpfsAccessPointResponseBody model) {
            this.accessPointId = model.accessPointId;
            this.requestId = model.requestId;
        } 

        /**
         * AccessPointId.
         */
        public Builder accessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCpfsAccessPointResponseBody build() {
            return new CreateCpfsAccessPointResponseBody(this);
        } 

    } 

}
