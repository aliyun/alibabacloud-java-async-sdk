// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRealSceneInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteRealSceneInfoRequest</p>
 */
public class DeleteRealSceneInfoRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteRealSceneInfoRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRealSceneInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DeleteRealSceneInfoRequest, Builder> {
        private String id; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRealSceneInfoRequest request) {
            super(request);
            this.id = request.id;
            this.operaUid = request.operaUid;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public DeleteRealSceneInfoRequest build() {
            return new DeleteRealSceneInfoRequest(this);
        } 

    } 

}
