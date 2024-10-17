// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLineageRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteLineageRelationRequest</p>
 */
public class DeleteLineageRelationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestEntityQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destEntityQualifiedName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationshipGuid")
    private String relationshipGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationshipType")
    private String relationshipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcEntityQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcEntityQualifiedName;

    private DeleteLineageRelationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destEntityQualifiedName = builder.destEntityQualifiedName;
        this.relationshipGuid = builder.relationshipGuid;
        this.relationshipType = builder.relationshipType;
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
     * @return relationshipType
     */
    public String getRelationshipType() {
        return this.relationshipType;
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
        private String relationshipType; 
        private String srcEntityQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLineageRelationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destEntityQualifiedName = request.destEntityQualifiedName;
            this.relationshipGuid = request.relationshipGuid;
            this.relationshipType = request.relationshipType;
            this.srcEntityQualifiedName = request.srcEntityQualifiedName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique identifier of the destination entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-report.report123</p>
         */
        public Builder destEntityQualifiedName(String destEntityQualifiedName) {
            this.putQueryParameter("DestEntityQualifiedName", destEntityQualifiedName);
            this.destEntityQualifiedName = destEntityQualifiedName;
            return this;
        }

        /**
         * <p>The unique identifier of the lineage.</p>
         * 
         * <strong>example:</strong>
         * <p>dfazcdfdfccdedd</p>
         */
        public Builder relationshipGuid(String relationshipGuid) {
            this.putQueryParameter("RelationshipGuid", relationshipGuid);
            this.relationshipGuid = relationshipGuid;
            return this;
        }

        /**
         * RelationshipType.
         */
        public Builder relationshipType(String relationshipType) {
            this.putQueryParameter("RelationshipType", relationshipType);
            this.relationshipType = relationshipType;
            return this;
        }

        /**
         * <p>The unique identifier of the source entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table.project.table</p>
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
