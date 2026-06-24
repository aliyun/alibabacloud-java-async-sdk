// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link RejectPushRequest} extends {@link RequestModel}
 *
 * <p>RejectPushRequest</p>
 */
public class RejectPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushNo;

    private RejectPushRequest(Builder builder) {
        super(builder);
        this.pushNo = builder.pushNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pushNo
     */
    public String getPushNo() {
        return this.pushNo;
    }

    public static final class Builder extends Request.Builder<RejectPushRequest, Builder> {
        private String pushNo; 

        private Builder() {
            super();
        } 

        private Builder(RejectPushRequest request) {
            super(request);
            this.pushNo = request.pushNo;
        } 

        /**
         * <p>Push编号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>push_20250101_abc123</p>
         */
        public Builder pushNo(String pushNo) {
            this.putQueryParameter("PushNo", pushNo);
            this.pushNo = pushNo;
            return this;
        }

        @Override
        public RejectPushRequest build() {
            return new RejectPushRequest(this);
        } 

    } 

}
