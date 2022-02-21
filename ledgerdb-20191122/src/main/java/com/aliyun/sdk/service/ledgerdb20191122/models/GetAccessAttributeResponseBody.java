// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessAttributeResponseBody</p>
 */
public class GetAccessAttributeResponseBody extends TeaModel {
    @NameInMap("EnableOpenAccess")
    private String enableOpenAccess;

    @NameInMap("LedgerId")
    private String ledgerId;

    @NameInMap("OpenUri")
    private String openUri;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccessAttributeResponseBody(Builder builder) {
        this.enableOpenAccess = builder.enableOpenAccess;
        this.ledgerId = builder.ledgerId;
        this.openUri = builder.openUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableOpenAccess
     */
    public String getEnableOpenAccess() {
        return this.enableOpenAccess;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return openUri
     */
    public String getOpenUri() {
        return this.openUri;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enableOpenAccess; 
        private String ledgerId; 
        private String openUri; 
        private String requestId; 

        /**
         * EnableOpenAccess.
         */
        public Builder enableOpenAccess(String enableOpenAccess) {
            this.enableOpenAccess = enableOpenAccess;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * OpenUri.
         */
        public Builder openUri(String openUri) {
            this.openUri = openUri;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessAttributeResponseBody build() {
            return new GetAccessAttributeResponseBody(this);
        } 

    } 

}
