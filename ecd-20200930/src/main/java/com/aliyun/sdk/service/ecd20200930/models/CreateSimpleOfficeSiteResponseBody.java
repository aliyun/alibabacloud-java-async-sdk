// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimpleOfficeSiteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimpleOfficeSiteResponseBody</p>
 */
public class CreateSimpleOfficeSiteResponseBody extends TeaModel {
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSimpleOfficeSiteResponseBody(Builder builder) {
        this.officeSiteId = builder.officeSiteId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimpleOfficeSiteResponseBody create() {
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

        public CreateSimpleOfficeSiteResponseBody build() {
            return new CreateSimpleOfficeSiteResponseBody(this);
        } 

    } 

}
