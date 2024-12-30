// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskStatusResponseBody</p>
 */
public class GetTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetTaskStatusResponseBody(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        /**
         * <p>The state of the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>running</p>
         * <!-- -->
         * 
         * <p>: The task is</p>
         * <!-- -->
         * 
         * <p>running</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>failed</p>
         * <!-- -->
         * 
         * <p>: The task</p>
         * <!-- -->
         * 
         * <p>fails</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>succeeded</p>
         * <!-- -->
         * 
         * <p>: The task is</p>
         * <!-- -->
         * 
         * <p>successful</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetTaskStatusResponseBody build() {
            return new GetTaskStatusResponseBody(this);
        } 

    } 

}
