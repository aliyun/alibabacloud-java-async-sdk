// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrgConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrgConstituteResponseBody</p>
 */
public class GetOrgConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private OrgEmission data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetOrgConstituteResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrgConstituteResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public OrgEmission getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OrgEmission data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(OrgEmission data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOrgConstituteResponseBody build() {
            return new GetOrgConstituteResponseBody(this);
        } 

    } 

}
