// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagBusinessGroupListRequest} extends {@link RequestModel}
 *
 * <p>GetTagBusinessGroupListRequest</p>
 */
public class GetTagBusinessGroupListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private Long tagId;

    private GetTagBusinessGroupListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagBusinessGroupListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return tagId
     */
    public Long getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<GetTagBusinessGroupListRequest, Builder> {
        private String operaUid; 
        private Long tagId; 

        private Builder() {
            super();
        } 

        private Builder(GetTagBusinessGroupListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.tagId = request.tagId;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(Long tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public GetTagBusinessGroupListRequest build() {
            return new GetTagBusinessGroupListRequest(this);
        } 

    } 

}
