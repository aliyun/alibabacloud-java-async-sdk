// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link GetUsersCountRequest} extends {@link RequestModel}
 *
 * <p>GetUsersCountRequest</p>
 */
public class GetUsersCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    private GetUsersCountRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.businessChannel = builder.businessChannel;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsersCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<GetUsersCountRequest, Builder> {
        private String bizType; 
        private String businessChannel; 
        private String solutionId; 

        private Builder() {
            super();
        } 

        private Builder(GetUsersCountRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.businessChannel = request.businessChannel;
            this.solutionId = request.solutionId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * SolutionId.
         */
        public Builder solutionId(String solutionId) {
            this.putBodyParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public GetUsersCountRequest build() {
            return new GetUsersCountRequest(this);
        } 

    } 

}
