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
 * {@link StopAlertResponseBody} extends {@link TeaModel}
 *
 * <p>StopAlertResponseBody</p>
 */
public class StopAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("status")
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

        private Builder(StopAlertResponseBody model) {
            this.msg = model.msg;
            this.status = model.status;
        } 

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The operation result. Valid values:</p>
         * <ul>
         * <li>True: The operation is successful.</li>
         * <li>False: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
