// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentNodeRequest</p>
 */
public class DeleteEnvironmentNodeRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("nodeUID")
    @Validation(required = true)
    private String nodeUID;

    private DeleteEnvironmentNodeRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.nodeUID = builder.nodeUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return nodeUID
     */
    public String getNodeUID() {
        return this.nodeUID;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentNodeRequest, Builder> {
        private String uid; 
        private String nodeUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentNodeRequest request) {
            super(request);
            this.uid = request.uid;
            this.nodeUID = request.nodeUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * nodeUID.
         */
        public Builder nodeUID(String nodeUID) {
            this.putPathParameter("nodeUID", nodeUID);
            this.nodeUID = nodeUID;
            return this;
        }

        @Override
        public DeleteEnvironmentNodeRequest build() {
            return new DeleteEnvironmentNodeRequest(this);
        } 

    } 

}
