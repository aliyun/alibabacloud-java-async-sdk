// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLineageRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteLineageRelationRequest</p>
 */
public class DeleteLineageRelationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DestEntityQualifiedName")
    @Validation(required = true)
    private String destEntityQualifiedName;

    @Query
    @NameInMap("RelationshipGuid")
    private String relationshipGuid;

    @Query
    @NameInMap("SrcEntityQualifiedName")
    @Validation(required = true)
    private String srcEntityQualifiedName;

    private DeleteLineageRelationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destEntityQualifiedName = builder.destEntityQualifiedName;
        this.relationshipGuid = builder.relationshipGuid;
        this.srcEntityQualifiedName = builder.srcEntityQualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLineageRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return destEntityQualifiedName
     */
    public String getDestEntityQualifiedName() {
        return this.destEntityQualifiedName;
    }

    /**
     * @return relationshipGuid
     */
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    /**
     * @return srcEntityQualifiedName
     */
    public String getSrcEntityQualifiedName() {
        return this.srcEntityQualifiedName;
    }

    public static final class Builder extends Request.Builder<DeleteLineageRelationRequest, Builder> {
        private String regionId; 
        private String destEntityQualifiedName; 
        private String relationshipGuid; 
        private String srcEntityQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLineageRelationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destEntityQualifiedName = request.destEntityQualifiedName;
            this.relationshipGuid = request.relationshipGuid;
            this.srcEntityQualifiedName = request.srcEntityQualifiedName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DestEntityQualifiedName.
         */
        public Builder destEntityQualifiedName(String destEntityQualifiedName) {
            this.putQueryParameter("DestEntityQualifiedName", destEntityQualifiedName);
            this.destEntityQualifiedName = destEntityQualifiedName;
            return this;
        }

        /**
         * RelationshipGuid.
         */
        public Builder relationshipGuid(String relationshipGuid) {
            this.putQueryParameter("RelationshipGuid", relationshipGuid);
            this.relationshipGuid = relationshipGuid;
            return this;
        }

        /**
         * SrcEntityQualifiedName.
         */
        public Builder srcEntityQualifiedName(String srcEntityQualifiedName) {
            this.putQueryParameter("SrcEntityQualifiedName", srcEntityQualifiedName);
            this.srcEntityQualifiedName = srcEntityQualifiedName;
            return this;
        }

        @Override
        public DeleteLineageRelationRequest build() {
            return new DeleteLineageRelationRequest(this);
        } 

    } 

}
