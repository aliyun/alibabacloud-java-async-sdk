// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnablePolicyTypeResponseBody} extends {@link TeaModel}
 *
 * <p>EnablePolicyTypeResponseBody</p>
 */
public class EnablePolicyTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnablePolicyTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnablePolicyTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnablePolicyTypeResponseBody build() {
            return new EnablePolicyTypeResponseBody(this);
        } 

    } 

}
