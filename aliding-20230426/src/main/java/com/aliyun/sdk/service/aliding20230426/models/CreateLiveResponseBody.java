// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateLiveResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveResponseBody</p>
 */
public class CreateLiveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("liveId")
    private String liveId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateLiveResponseBody(Builder builder) {
        this.liveId = builder.liveId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String liveId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLiveResponseBody model) {
            this.liveId = model.liveId;
            this.requestId = model.requestId;
        } 

        /**
         * liveId.
         */
        public Builder liveId(String liveId) {
            this.liveId = liveId;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLiveResponseBody build() {
            return new CreateLiveResponseBody(this);
        } 

    } 

}
