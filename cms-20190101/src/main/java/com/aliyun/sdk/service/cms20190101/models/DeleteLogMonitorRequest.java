// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogMonitorRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogMonitorRequest</p>
 */
public class DeleteLogMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long logId;

    private DeleteLogMonitorRequest(Builder builder) {
        super(builder);
        this.logId = builder.logId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logId
     */
    public Long getLogId() {
        return this.logId;
    }

    public static final class Builder extends Request.Builder<DeleteLogMonitorRequest, Builder> {
        private Long logId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogMonitorRequest request) {
            super(request);
            this.logId = request.logId;
        } 

        /**
         * The ID returned by Log Service.
         */
        public Builder logId(Long logId) {
            this.putQueryParameter("LogId", logId);
            this.logId = logId;
            return this;
        }

        @Override
        public DeleteLogMonitorRequest build() {
            return new DeleteLogMonitorRequest(this);
        } 

    } 

}
