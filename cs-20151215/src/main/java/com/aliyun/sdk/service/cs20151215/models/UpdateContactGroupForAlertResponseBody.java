// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateContactGroupForAlertResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContactGroupForAlertResponseBody</p>
 */
public class UpdateContactGroupForAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Boolean status;

    private UpdateContactGroupForAlertResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactGroupForAlertResponseBody create() {
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
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public UpdateContactGroupForAlertResponseBody build() {
            return new UpdateContactGroupForAlertResponseBody(this);
        } 

    } 

}
