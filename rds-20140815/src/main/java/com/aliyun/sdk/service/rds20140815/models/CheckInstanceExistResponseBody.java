// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CheckInstanceExistResponseBody} extends {@link TeaModel}
 *
 * <p>CheckInstanceExistResponseBody</p>
 */
public class CheckInstanceExistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsExistInstance")
    private Boolean isExistInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckInstanceExistResponseBody(Builder builder) {
        this.isExistInstance = builder.isExistInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceExistResponseBody create() {
        return builder().build();
    }

    /**
     * @return isExistInstance
     */
    public Boolean getIsExistInstance() {
        return this.isExistInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isExistInstance; 
        private String requestId; 

        /**
         * <p>Indicates whether the instance exists. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance exists.</li>
         * <li><strong>false</strong>: The instance does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isExistInstance(Boolean isExistInstance) {
            this.isExistInstance = isExistInstance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>11439B36-F703-49EB-8656-D3C87BE28B57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckInstanceExistResponseBody build() {
            return new CheckInstanceExistResponseBody(this);
        } 

    } 

}
