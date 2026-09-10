// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateMaintainWindowResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMaintainWindowResponseBody</p>
 */
public class UpdateMaintainWindowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    private String maintainWindowId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateMaintainWindowResponseBody(Builder builder) {
        this.maintainWindowId = builder.maintainWindowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMaintainWindowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maintainWindowId
     */
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String maintainWindowId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateMaintainWindowResponseBody model) {
            this.maintainWindowId = model.maintainWindowId;
            this.requestId = model.requestId;
        } 

        /**
         * maintainWindowId.
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.maintainWindowId = maintainWindowId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMaintainWindowResponseBody build() {
            return new UpdateMaintainWindowResponseBody(this);
        } 

    } 

}
