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
 * {@link GetMaintainWindowResponseBody} extends {@link TeaModel}
 *
 * <p>GetMaintainWindowResponseBody</p>
 */
public class GetMaintainWindowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maintainWindow")
    private MaintainWindowForView maintainWindow;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMaintainWindowResponseBody(Builder builder) {
        this.maintainWindow = builder.maintainWindow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMaintainWindowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maintainWindow
     */
    public MaintainWindowForView getMaintainWindow() {
        return this.maintainWindow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MaintainWindowForView maintainWindow; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMaintainWindowResponseBody model) {
            this.maintainWindow = model.maintainWindow;
            this.requestId = model.requestId;
        } 

        /**
         * maintainWindow.
         */
        public Builder maintainWindow(MaintainWindowForView maintainWindow) {
            this.maintainWindow = maintainWindow;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMaintainWindowResponseBody build() {
            return new GetMaintainWindowResponseBody(this);
        } 

    } 

}
