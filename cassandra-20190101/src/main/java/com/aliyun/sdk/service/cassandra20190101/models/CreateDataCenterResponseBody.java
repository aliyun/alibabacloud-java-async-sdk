// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCenterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataCenterResponseBody</p>
 */
public class CreateDataCenterResponseBody extends TeaModel {
    @NameInMap("DataCenterId")
    private String dataCenterId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDataCenterResponseBody(Builder builder) {
        this.dataCenterId = builder.dataCenterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataCenterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataCenterId; 
        private String requestId; 

        /**
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataCenterResponseBody build() {
            return new CreateDataCenterResponseBody(this);
        } 

    } 

}
