// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageRequest</p>
 */
public class UpdateImageRequest extends Request {
    @Query
    @NameInMap("ExternalId")
    private String externalId;

    @Query
    @NameInMap("Faces")
    private java.util.List < Faces> faces;

    @Query
    @NameInMap("ImageUri")
    @Validation(required = true)
    private String imageUri;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RemarksA")
    private String remarksA;

    @Query
    @NameInMap("RemarksArrayA")
    private String remarksArrayA;

    @Query
    @NameInMap("RemarksArrayB")
    private String remarksArrayB;

    @Query
    @NameInMap("RemarksB")
    private String remarksB;

    @Query
    @NameInMap("RemarksC")
    private String remarksC;

    @Query
    @NameInMap("RemarksD")
    private String remarksD;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("SourcePosition")
    private String sourcePosition;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("SourceUri")
    private String sourceUri;

    private UpdateImageRequest(Builder builder) {
        super(builder);
        this.externalId = builder.externalId;
        this.faces = builder.faces;
        this.imageUri = builder.imageUri;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.remarksA = builder.remarksA;
        this.remarksArrayA = builder.remarksArrayA;
        this.remarksArrayB = builder.remarksArrayB;
        this.remarksB = builder.remarksB;
        this.remarksC = builder.remarksC;
        this.remarksD = builder.remarksD;
        this.setId = builder.setId;
        this.sourcePosition = builder.sourcePosition;
        this.sourceType = builder.sourceType;
        this.sourceUri = builder.sourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return faces
     */
    public java.util.List < Faces> getFaces() {
        return this.faces;
    }

    /**
     * @return imageUri
     */
    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remarksA
     */
    public String getRemarksA() {
        return this.remarksA;
    }

    /**
     * @return remarksArrayA
     */
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    /**
     * @return remarksArrayB
     */
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    /**
     * @return remarksB
     */
    public String getRemarksB() {
        return this.remarksB;
    }

    /**
     * @return remarksC
     */
    public String getRemarksC() {
        return this.remarksC;
    }

    /**
     * @return remarksD
     */
    public String getRemarksD() {
        return this.remarksD;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return sourcePosition
     */
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceUri
     */
    public String getSourceUri() {
        return this.sourceUri;
    }

    public static final class Builder extends Request.Builder<UpdateImageRequest, Builder> {
        private String externalId; 
        private java.util.List < Faces> faces; 
        private String imageUri; 
        private String project; 
        private String regionId; 
        private String remarksA; 
        private String remarksArrayA; 
        private String remarksArrayB; 
        private String remarksB; 
        private String remarksC; 
        private String remarksD; 
        private String setId; 
        private String sourcePosition; 
        private String sourceType; 
        private String sourceUri; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageRequest response) {
            super(response);
            this.externalId = response.externalId;
            this.faces = response.faces;
            this.imageUri = response.imageUri;
            this.project = response.project;
            this.regionId = response.regionId;
            this.remarksA = response.remarksA;
            this.remarksArrayA = response.remarksArrayA;
            this.remarksArrayB = response.remarksArrayB;
            this.remarksB = response.remarksB;
            this.remarksC = response.remarksC;
            this.remarksD = response.remarksD;
            this.setId = response.setId;
            this.sourcePosition = response.sourcePosition;
            this.sourceType = response.sourceType;
            this.sourceUri = response.sourceUri;
        } 

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * Faces.
         */
        public Builder faces(java.util.List < Faces> faces) {
            this.putQueryParameter("Faces", faces);
            this.faces = faces;
            return this;
        }

        /**
         * ImageUri.
         */
        public Builder imageUri(String imageUri) {
            this.putQueryParameter("ImageUri", imageUri);
            this.imageUri = imageUri;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
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
         * RemarksA.
         */
        public Builder remarksA(String remarksA) {
            this.putQueryParameter("RemarksA", remarksA);
            this.remarksA = remarksA;
            return this;
        }

        /**
         * RemarksArrayA.
         */
        public Builder remarksArrayA(String remarksArrayA) {
            this.putQueryParameter("RemarksArrayA", remarksArrayA);
            this.remarksArrayA = remarksArrayA;
            return this;
        }

        /**
         * RemarksArrayB.
         */
        public Builder remarksArrayB(String remarksArrayB) {
            this.putQueryParameter("RemarksArrayB", remarksArrayB);
            this.remarksArrayB = remarksArrayB;
            return this;
        }

        /**
         * RemarksB.
         */
        public Builder remarksB(String remarksB) {
            this.putQueryParameter("RemarksB", remarksB);
            this.remarksB = remarksB;
            return this;
        }

        /**
         * RemarksC.
         */
        public Builder remarksC(String remarksC) {
            this.putQueryParameter("RemarksC", remarksC);
            this.remarksC = remarksC;
            return this;
        }

        /**
         * RemarksD.
         */
        public Builder remarksD(String remarksD) {
            this.putQueryParameter("RemarksD", remarksD);
            this.remarksD = remarksD;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        /**
         * SourcePosition.
         */
        public Builder sourcePosition(String sourcePosition) {
            this.putQueryParameter("SourcePosition", sourcePosition);
            this.sourcePosition = sourcePosition;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SourceUri.
         */
        public Builder sourceUri(String sourceUri) {
            this.putQueryParameter("SourceUri", sourceUri);
            this.sourceUri = sourceUri;
            return this;
        }

        @Override
        public UpdateImageRequest build() {
            return new UpdateImageRequest(this);
        } 

    } 

    public static class Faces extends TeaModel {
        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("GroupId")
        private String groupId;

        private Faces(Builder builder) {
            this.faceId = builder.faceId;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private String faceId; 
            private String groupId; 

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
}
