// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAlertResponseBody} extends {@link TeaModel}
 *
 * <p>StopAlertResponseBody</p>
 */
public class StopAlertResponseBody extends TeaModel {
    @NameInMap("msg")
    private String msg;

    @NameInMap("status")
    private Boolean status;

    private StopAlertResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAlertResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String msg; 
        private Boolean status; 

        /**
         * The error message returned if the call fails.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * A value of True indicates that the call succeeds. A value of False indicates that the call failed.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public StopAlertResponseBody build() {
            return new StopAlertResponseBody(this);
        } 

    } 

}
