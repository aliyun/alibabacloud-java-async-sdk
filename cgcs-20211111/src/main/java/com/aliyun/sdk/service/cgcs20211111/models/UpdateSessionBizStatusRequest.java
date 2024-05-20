// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSessionBizStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSessionBizStatusRequest</p>
 */
public class UpdateSessionBizStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizStatus")
    private String bizStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platformSessionId;

    private UpdateSessionBizStatusRequest(Builder builder) {
        super(builder);
        this.bizStatus = builder.bizStatus;
        this.platformSessionId = builder.platformSessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionBizStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizStatus
     */
    public String getBizStatus() {
        return this.bizStatus;
    }

    /**
     * @return platformSessionId
     */
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public static final class Builder extends Request.Builder<UpdateSessionBizStatusRequest, Builder> {
        private String bizStatus; 
        private String platformSessionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSessionBizStatusRequest request) {
            super(request);
            this.bizStatus = request.bizStatus;
            this.platformSessionId = request.platformSessionId;
        } 

        /**
         * BizStatus.
         */
        public Builder bizStatus(String bizStatus) {
            this.putQueryParameter("BizStatus", bizStatus);
            this.bizStatus = bizStatus;
            return this;
        }

        /**
         * PlatformSessionId.
         */
        public Builder platformSessionId(String platformSessionId) {
            this.putQueryParameter("PlatformSessionId", platformSessionId);
            this.platformSessionId = platformSessionId;
            return this;
        }

        @Override
        public UpdateSessionBizStatusRequest build() {
            return new UpdateSessionBizStatusRequest(this);
        } 

    } 

}
