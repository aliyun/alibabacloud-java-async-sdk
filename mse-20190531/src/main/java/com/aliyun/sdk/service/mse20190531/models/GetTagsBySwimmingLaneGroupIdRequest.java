// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagsBySwimmingLaneGroupIdRequest} extends {@link RequestModel}
 *
 * <p>GetTagsBySwimmingLaneGroupIdRequest</p>
 */
public class GetTagsBySwimmingLaneGroupIdRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    private GetTagsBySwimmingLaneGroupIdRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagsBySwimmingLaneGroupIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<GetTagsBySwimmingLaneGroupIdRequest, Builder> {
        private String acceptLanguage; 
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetTagsBySwimmingLaneGroupIdRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.groupId = request.groupId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetTagsBySwimmingLaneGroupIdRequest build() {
            return new GetTagsBySwimmingLaneGroupIdRequest(this);
        } 

    } 

}
