// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFaceGroupsResponseBody</p>
 */
public class ListFaceGroupsResponseBody extends TeaModel {
    @NameInMap("FaceGroups")
    private java.util.List < FaceGroups> faceGroups;

    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    private ListFaceGroupsResponseBody(Builder builder) {
        this.faceGroups = builder.faceGroups;
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return faceGroups
     */
    public java.util.List < FaceGroups> getFaceGroups() {
        return this.faceGroups;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FaceGroups> faceGroups; 
        private String nextMarker; 
        private String requestId; 

        /**
         * FaceGroups.
         */
        public Builder faceGroups(java.util.List < FaceGroups> faceGroups) {
            this.faceGroups = faceGroups;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFaceGroupsResponseBody build() {
            return new ListFaceGroupsResponseBody(this);
        } 

    } 

    public static class FaceBoundary extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Left")
        private Integer left;

        @NameInMap("Top")
        private Integer top;

        @NameInMap("Width")
        private Integer width;

        private FaceBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceBoundary create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public FaceBoundary build() {
                return new FaceBoundary(this);
            } 

        } 

    }
    public static class GroupCoverFace extends TeaModel {
        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FaceBoundary")
        private FaceBoundary faceBoundary;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("ImageHeight")
        private Long imageHeight;

        @NameInMap("ImageUri")
        private String imageUri;

        @NameInMap("ImageWidth")
        private Long imageWidth;

        private GroupCoverFace(Builder builder) {
            this.externalId = builder.externalId;
            this.faceBoundary = builder.faceBoundary;
            this.faceId = builder.faceId;
            this.imageHeight = builder.imageHeight;
            this.imageUri = builder.imageUri;
            this.imageWidth = builder.imageWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupCoverFace create() {
            return builder().build();
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return faceBoundary
         */
        public FaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return imageHeight
         */
        public Long getImageHeight() {
            return this.imageHeight;
        }

        /**
         * @return imageUri
         */
        public String getImageUri() {
            return this.imageUri;
        }

        /**
         * @return imageWidth
         */
        public Long getImageWidth() {
            return this.imageWidth;
        }

        public static final class Builder {
            private String externalId; 
            private FaceBoundary faceBoundary; 
            private String faceId; 
            private Long imageHeight; 
            private String imageUri; 
            private Long imageWidth; 

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * FaceBoundary.
             */
            public Builder faceBoundary(FaceBoundary faceBoundary) {
                this.faceBoundary = faceBoundary;
                return this;
            }

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * ImageHeight.
             */
            public Builder imageHeight(Long imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            /**
             * ImageUri.
             */
            public Builder imageUri(String imageUri) {
                this.imageUri = imageUri;
                return this;
            }

            /**
             * ImageWidth.
             */
            public Builder imageWidth(Long imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            public GroupCoverFace build() {
                return new GroupCoverFace(this);
            } 

        } 

    }
    public static class FaceGroups extends TeaModel {
        @NameInMap("AverageAge")
        private Float averageAge;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FaceCount")
        private Integer faceCount;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("GroupCoverFace")
        private GroupCoverFace groupCoverFace;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ImageCount")
        private Integer imageCount;

        @NameInMap("MaxAge")
        private Float maxAge;

        @NameInMap("MinAge")
        private Float minAge;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("RemarksA")
        private String remarksA;

        @NameInMap("RemarksArrayA")
        private String remarksArrayA;

        @NameInMap("RemarksArrayB")
        private String remarksArrayB;

        @NameInMap("RemarksB")
        private String remarksB;

        @NameInMap("RemarksC")
        private String remarksC;

        @NameInMap("RemarksD")
        private String remarksD;

        private FaceGroups(Builder builder) {
            this.averageAge = builder.averageAge;
            this.createTime = builder.createTime;
            this.externalId = builder.externalId;
            this.faceCount = builder.faceCount;
            this.gender = builder.gender;
            this.groupCoverFace = builder.groupCoverFace;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.imageCount = builder.imageCount;
            this.maxAge = builder.maxAge;
            this.minAge = builder.minAge;
            this.modifyTime = builder.modifyTime;
            this.remarksA = builder.remarksA;
            this.remarksArrayA = builder.remarksArrayA;
            this.remarksArrayB = builder.remarksArrayB;
            this.remarksB = builder.remarksB;
            this.remarksC = builder.remarksC;
            this.remarksD = builder.remarksD;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceGroups create() {
            return builder().build();
        }

        /**
         * @return averageAge
         */
        public Float getAverageAge() {
            return this.averageAge;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return faceCount
         */
        public Integer getFaceCount() {
            return this.faceCount;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return groupCoverFace
         */
        public GroupCoverFace getGroupCoverFace() {
            return this.groupCoverFace;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return maxAge
         */
        public Float getMaxAge() {
            return this.maxAge;
        }

        /**
         * @return minAge
         */
        public Float getMinAge() {
            return this.minAge;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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

        public static final class Builder {
            private Float averageAge; 
            private String createTime; 
            private String externalId; 
            private Integer faceCount; 
            private String gender; 
            private GroupCoverFace groupCoverFace; 
            private String groupId; 
            private String groupName; 
            private Integer imageCount; 
            private Float maxAge; 
            private Float minAge; 
            private String modifyTime; 
            private String remarksA; 
            private String remarksArrayA; 
            private String remarksArrayB; 
            private String remarksB; 
            private String remarksC; 
            private String remarksD; 

            /**
             * AverageAge.
             */
            public Builder averageAge(Float averageAge) {
                this.averageAge = averageAge;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * FaceCount.
             */
            public Builder faceCount(Integer faceCount) {
                this.faceCount = faceCount;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * GroupCoverFace.
             */
            public Builder groupCoverFace(GroupCoverFace groupCoverFace) {
                this.groupCoverFace = groupCoverFace;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * MaxAge.
             */
            public Builder maxAge(Float maxAge) {
                this.maxAge = maxAge;
                return this;
            }

            /**
             * MinAge.
             */
            public Builder minAge(Float minAge) {
                this.minAge = minAge;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * RemarksA.
             */
            public Builder remarksA(String remarksA) {
                this.remarksA = remarksA;
                return this;
            }

            /**
             * RemarksArrayA.
             */
            public Builder remarksArrayA(String remarksArrayA) {
                this.remarksArrayA = remarksArrayA;
                return this;
            }

            /**
             * RemarksArrayB.
             */
            public Builder remarksArrayB(String remarksArrayB) {
                this.remarksArrayB = remarksArrayB;
                return this;
            }

            /**
             * RemarksB.
             */
            public Builder remarksB(String remarksB) {
                this.remarksB = remarksB;
                return this;
            }

            /**
             * RemarksC.
             */
            public Builder remarksC(String remarksC) {
                this.remarksC = remarksC;
                return this;
            }

            /**
             * RemarksD.
             */
            public Builder remarksD(String remarksD) {
                this.remarksD = remarksD;
                return this;
            }

            public FaceGroups build() {
                return new FaceGroups(this);
            } 

        } 

    }
}
