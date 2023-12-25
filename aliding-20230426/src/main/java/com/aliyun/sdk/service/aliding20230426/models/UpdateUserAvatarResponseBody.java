// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserAvatarResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserAvatarResponseBody</p>
 */
public class UpdateUserAvatarResponseBody extends TeaModel {
    @NameInMap("errcode")
    private String errcode;

    @NameInMap("errmsg")
    private String errmsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private UpdateUserAvatarResponseBody(Builder builder) {
        this.errcode = builder.errcode;
        this.errmsg = builder.errmsg;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserAvatarResponseBody create() {
        return builder().build();
    }

    /**
     * @return errcode
     */
    public String getErrcode() {
        return this.errcode;
    }

    /**
     * @return errmsg
     */
    public String getErrmsg() {
        return this.errmsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String errcode; 
        private String errmsg; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * errcode.
         */
        public Builder errcode(String errcode) {
            this.errcode = errcode;
            return this;
        }

        /**
         * errmsg.
         */
        public Builder errmsg(String errmsg) {
            this.errmsg = errmsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public UpdateUserAvatarResponseBody build() {
            return new UpdateUserAvatarResponseBody(this);
        } 

    } 

}
