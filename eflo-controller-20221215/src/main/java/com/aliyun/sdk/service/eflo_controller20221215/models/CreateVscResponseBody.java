// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateVscResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVscResponseBody</p>
 */
public class CreateVscResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VscId")
    private String vscId;

    private CreateVscResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vscId = builder.vscId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVscResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    public static final class Builder {
        private String requestId; 
        private String vscId; 

        private Builder() {
        } 

        private Builder(CreateVscResponseBody model) {
            this.requestId = model.requestId;
            this.vscId = model.vscId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VscId.
         */
        public Builder vscId(String vscId) {
            this.vscId = vscId;
            return this;
        }

        public CreateVscResponseBody build() {
            return new CreateVscResponseBody(this);
        } 

    } 

}
