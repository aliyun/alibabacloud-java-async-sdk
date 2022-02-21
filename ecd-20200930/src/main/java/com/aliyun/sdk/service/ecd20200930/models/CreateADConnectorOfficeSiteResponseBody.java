// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorOfficeSiteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateADConnectorOfficeSiteResponseBody</p>
 */
public class CreateADConnectorOfficeSiteResponseBody extends TeaModel {
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateADConnectorOfficeSiteResponseBody(Builder builder) {
        this.officeSiteId = builder.officeSiteId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateADConnectorOfficeSiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String officeSiteId; 
        private String requestId; 

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateADConnectorOfficeSiteResponseBody build() {
            return new CreateADConnectorOfficeSiteResponseBody(this);
        } 

    } 

}
