// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductComponentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetProductComponentVersionRequest</p>
 */
public class GetProductComponentVersionRequest extends Request {
    @Path
    @NameInMap("relationUID")
    @Validation(required = true)
    private String relationUID;

    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private GetProductComponentVersionRequest(Builder builder) {
        super(builder);
        this.relationUID = builder.relationUID;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductComponentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relationUID
     */
    public String getRelationUID() {
        return this.relationUID;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetProductComponentVersionRequest, Builder> {
        private String relationUID; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetProductComponentVersionRequest request) {
            super(request);
            this.relationUID = request.relationUID;
            this.uid = request.uid;
        } 

        /**
         * relationUID.
         */
        public Builder relationUID(String relationUID) {
            this.putPathParameter("relationUID", relationUID);
            this.relationUID = relationUID;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetProductComponentVersionRequest build() {
            return new GetProductComponentVersionRequest(this);
        } 

    } 

}
