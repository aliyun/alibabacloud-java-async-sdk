// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDBCollectionRequest} extends {@link RequestModel}
 *
 * <p>RenameDBCollectionRequest</p>
 */
public class RenameDBCollectionRequest extends Request {
    @Body
    @NameInMap("NewCollection")
    @Validation(required = true)
    private String newCollection;

    @Body
    @NameInMap("OriginCollection")
    @Validation(required = true)
    private String originCollection;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private RenameDBCollectionRequest(Builder builder) {
        super(builder);
        this.newCollection = builder.newCollection;
        this.originCollection = builder.originCollection;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameDBCollectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newCollection
     */
    public String getNewCollection() {
        return this.newCollection;
    }

    /**
     * @return originCollection
     */
    public String getOriginCollection() {
        return this.originCollection;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<RenameDBCollectionRequest, Builder> {
        private String newCollection; 
        private String originCollection; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(RenameDBCollectionRequest request) {
            super(request);
            this.newCollection = request.newCollection;
            this.originCollection = request.originCollection;
            this.spaceId = request.spaceId;
        } 

        /**
         * NewCollection.
         */
        public Builder newCollection(String newCollection) {
            this.putBodyParameter("NewCollection", newCollection);
            this.newCollection = newCollection;
            return this;
        }

        /**
         * OriginCollection.
         */
        public Builder originCollection(String originCollection) {
            this.putBodyParameter("OriginCollection", originCollection);
            this.originCollection = originCollection;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public RenameDBCollectionRequest build() {
            return new RenameDBCollectionRequest(this);
        } 

    } 

}
