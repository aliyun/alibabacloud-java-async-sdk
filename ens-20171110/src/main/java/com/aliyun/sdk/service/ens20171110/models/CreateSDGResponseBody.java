// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSDGResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSDGResponseBody</p>
 */
public class CreateSDGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SDGId")
    private String SDGId;

    private CreateSDGResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSDGResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder {
        private String requestId; 
        private String SDGId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the generated SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }

        public CreateSDGResponseBody build() {
            return new CreateSDGResponseBody(this);
        } 

    } 

}
