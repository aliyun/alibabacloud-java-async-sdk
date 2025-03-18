// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link StartAlertResponseBody} extends {@link TeaModel}
 *
 * <p>StartAlertResponseBody</p>
 */
public class StartAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Boolean status;

    private StartAlertResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAlertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartAlertResponseBody model) {
            this.msg = model.msg;
            this.status = model.status;
        } 

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public StartAlertResponseBody build() {
            return new StartAlertResponseBody(this);
        } 

    } 

}
