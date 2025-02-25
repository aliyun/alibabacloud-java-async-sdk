// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupResourceNumRequest} extends {@link RequestModel}
 *
 * <p>GetGroupResourceNumRequest</p>
 */
public class GetGroupResourceNumRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    @Validation(required = true)
    private String businessGroupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetGroupResourceNumRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupResourceNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetGroupResourceNumRequest, Builder> {
        private String businessGroupId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetGroupResourceNumRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.operaUid = request.operaUid;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetGroupResourceNumRequest build() {
            return new GetGroupResourceNumRequest(this);
        } 

    } 

}
