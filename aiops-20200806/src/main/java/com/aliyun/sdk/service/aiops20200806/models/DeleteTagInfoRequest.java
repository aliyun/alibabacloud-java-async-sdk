// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagInfoRequest</p>
 */
public class DeleteTagInfoRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TagId")
    private Long tagId;

    private DeleteTagInfoRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTagInfoRequest, Builder> {
        private String operaUid; 
        private Long tagId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagInfoRequest request) {
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
        public DeleteTagInfoRequest build() {
            return new DeleteTagInfoRequest(this);
        } 

    } 

}
