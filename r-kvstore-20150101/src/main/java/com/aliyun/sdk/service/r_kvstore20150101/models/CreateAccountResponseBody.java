// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccountResponseBody</p>
 */
public class CreateAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcountName")
    private String acountName;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccountResponseBody(Builder builder) {
        this.acountName = builder.acountName;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return acountName
     */
    public String getAcountName() {
        return this.acountName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acountName; 
        private String instanceId; 
        private String requestId; 

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>demoaccount</p>
         */
        public Builder acountName(String acountName) {
            this.acountName = acountName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccountResponseBody build() {
            return new CreateAccountResponseBody(this);
        } 

    } 

}
