// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnUserProtectInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnUserProtectInfoResponseBody</p>
 */
public class DescribeScdnUserProtectInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceDDoS")
    private Integer serviceDDoS;

    private DescribeScdnUserProtectInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceDDoS = builder.serviceDDoS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnUserProtectInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceDDoS
     */
    public Integer getServiceDDoS() {
        return this.serviceDDoS;
    }

    public static final class Builder {
        private String requestId; 
        private Integer serviceDDoS; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceDDoS.
         */
        public Builder serviceDDoS(Integer serviceDDoS) {
            this.serviceDDoS = serviceDDoS;
            return this;
        }

        public DescribeScdnUserProtectInfoResponseBody build() {
            return new DescribeScdnUserProtectInfoResponseBody(this);
        } 

    } 

}
