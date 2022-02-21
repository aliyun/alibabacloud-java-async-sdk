// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindImagesRequest} extends {@link RequestModel}
 *
 * <p>FindImagesRequest</p>
 */
public class FindImagesRequest extends Request {
    @Query
    @NameInMap("AddressLineContentsMatch")
    private String addressLineContentsMatch;

    @Query
    @NameInMap("AgeRange")
    private String ageRange;

    @Query
    @NameInMap("CreateTimeRange")
    private String createTimeRange;

    @Query
    @NameInMap("Emotion")
    private String emotion;

    @Query
    @NameInMap("ExternalId")
    private String externalId;

    @Query
    @NameInMap("FacesModifyTimeRange")
    private String facesModifyTimeRange;

    @Query
    @NameInMap("Gender")
    private String gender;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("ImageSizeRange")
    private String imageSizeRange;

    @Query
    @NameInMap("ImageTimeRange")
    private String imageTimeRange;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("LocationBoundary")
    private String locationBoundary;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("ModifyTimeRange")
    private String modifyTimeRange;

    @Query
    @NameInMap("OCRContentsMatch")
    private String OCRContentsMatch;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RemarksAPrefix")
    private String remarksAPrefix;

    @Query
    @NameInMap("RemarksArrayAIn")
    private String remarksArrayAIn;

    @Query
    @NameInMap("RemarksArrayBIn")
    private String remarksArrayBIn;

    @Query
    @NameInMap("RemarksBPrefix")
    private String remarksBPrefix;

    @Query
    @NameInMap("RemarksCPrefix")
    private String remarksCPrefix;

    @Query
    @NameInMap("RemarksDPrefix")
    private String remarksDPrefix;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("SourceUriPrefix")
    private String sourceUriPrefix;

    @Query
    @NameInMap("TagNames")
    private String tagNames;

    @Query
    @NameInMap("TagsModifyTimeRange")
    private String tagsModifyTimeRange;

    private FindImagesRequest(Builder builder) {
        super(builder);
        this.addressLineContentsMatch = builder.addressLineContentsMatch;
        this.ageRange = builder.ageRange;
        this.createTimeRange = builder.createTimeRange;
        this.emotion = builder.emotion;
        this.externalId = builder.externalId;
        this.facesModifyTimeRange = builder.facesModifyTimeRange;
        this.gender = builder.gender;
        this.groupId = builder.groupId;
        this.imageSizeRange = builder.imageSizeRange;
        this.imageTimeRange = builder.imageTimeRange;
        this.limit = builder.limit;
        this.locationBoundary = builder.locationBoundary;
        this.marker = builder.marker;
        this.modifyTimeRange = builder.modifyTimeRange;
        this.OCRContentsMatch = builder.OCRContentsMatch;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.remarksAPrefix = builder.remarksAPrefix;
        this.remarksArrayAIn = builder.remarksArrayAIn;
        this.remarksArrayBIn = builder.remarksArrayBIn;
        this.remarksBPrefix = builder.remarksBPrefix;
        this.remarksCPrefix = builder.remarksCPrefix;
        this.remarksDPrefix = builder.remarksDPrefix;
        this.setId = builder.setId;
        this.sourceType = builder.sourceType;
        this.sourceUriPrefix = builder.sourceUriPrefix;
        this.tagNames = builder.tagNames;
        this.tagsModifyTimeRange = builder.tagsModifyTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressLineContentsMatch
     */
    public String getAddressLineContentsMatch() {
        return this.addressLineContentsMatch;
    }

    /**
     * @return ageRange
     */
    public String getAgeRange() {
        return this.ageRange;
    }

    /**
     * @return createTimeRange
     */
    public String getCreateTimeRange() {
        return this.createTimeRange;
    }

    /**
     * @return emotion
     */
    public String getEmotion() {
        return this.emotion;
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return facesModifyTimeRange
     */
    public String getFacesModifyTimeRange() {
        return this.facesModifyTimeRange;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return imageSizeRange
     */
    public String getImageSizeRange() {
        return this.imageSizeRange;
    }

    /**
     * @return imageTimeRange
     */
    public String getImageTimeRange() {
        return this.imageTimeRange;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return locationBoundary
     */
    public String getLocationBoundary() {
        return this.locationBoundary;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return modifyTimeRange
     */
    public String getModifyTimeRange() {
        return this.modifyTimeRange;
    }

    /**
     * @return OCRContentsMatch
     */
    public String getOCRContentsMatch() {
        return this.OCRContentsMatch;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return remarksAPrefix
     */
    public String getRemarksAPrefix() {
        return this.remarksAPrefix;
    }

    /**
     * @return remarksArrayAIn
     */
    public String getRemarksArrayAIn() {
        return this.remarksArrayAIn;
    }

    /**
     * @return remarksArrayBIn
     */
    public String getRemarksArrayBIn() {
        return this.remarksArrayBIn;
    }

    /**
     * @return remarksBPrefix
     */
    public String getRemarksBPrefix() {
        return this.remarksBPrefix;
    }

    /**
     * @return remarksCPrefix
     */
    public String getRemarksCPrefix() {
        return this.remarksCPrefix;
    }

    /**
     * @return remarksDPrefix
     */
    public String getRemarksDPrefix() {
        return this.remarksDPrefix;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceUriPrefix
     */
    public String getSourceUriPrefix() {
        return this.sourceUriPrefix;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    /**
     * @return tagsModifyTimeRange
     */
    public String getTagsModifyTimeRange() {
        return this.tagsModifyTimeRange;
    }

    public static final class Builder extends Request.Builder<FindImagesRequest, Builder> {
        private String addressLineContentsMatch; 
        private String ageRange; 
        private String createTimeRange; 
        private String emotion; 
        private String externalId; 
        private String facesModifyTimeRange; 
        private String gender; 
        private String groupId; 
        private String imageSizeRange; 
        private String imageTimeRange; 
        private Integer limit; 
        private String locationBoundary; 
        private String marker; 
        private String modifyTimeRange; 
        private String OCRContentsMatch; 
        private String order; 
        private String orderBy; 
        private String project; 
        private String regionId; 
        private String remarksAPrefix; 
        private String remarksArrayAIn; 
        private String remarksArrayBIn; 
        private String remarksBPrefix; 
        private String remarksCPrefix; 
        private String remarksDPrefix; 
        private String setId; 
        private String sourceType; 
        private String sourceUriPrefix; 
        private String tagNames; 
        private String tagsModifyTimeRange; 

        private Builder() {
            super();
        } 

        private Builder(FindImagesRequest response) {
            super(response);
            this.addressLineContentsMatch = response.addressLineContentsMatch;
            this.ageRange = response.ageRange;
            this.createTimeRange = response.createTimeRange;
            this.emotion = response.emotion;
            this.externalId = response.externalId;
            this.facesModifyTimeRange = response.facesModifyTimeRange;
            this.gender = response.gender;
            this.groupId = response.groupId;
            this.imageSizeRange = response.imageSizeRange;
            this.imageTimeRange = response.imageTimeRange;
            this.limit = response.limit;
            this.locationBoundary = response.locationBoundary;
            this.marker = response.marker;
            this.modifyTimeRange = response.modifyTimeRange;
            this.OCRContentsMatch = response.OCRContentsMatch;
            this.order = response.order;
            this.orderBy = response.orderBy;
            this.project = response.project;
            this.regionId = response.regionId;
            this.remarksAPrefix = response.remarksAPrefix;
            this.remarksArrayAIn = response.remarksArrayAIn;
            this.remarksArrayBIn = response.remarksArrayBIn;
            this.remarksBPrefix = response.remarksBPrefix;
            this.remarksCPrefix = response.remarksCPrefix;
            this.remarksDPrefix = response.remarksDPrefix;
            this.setId = response.setId;
            this.sourceType = response.sourceType;
            this.sourceUriPrefix = response.sourceUriPrefix;
            this.tagNames = response.tagNames;
            this.tagsModifyTimeRange = response.tagsModifyTimeRange;
        } 

        /**
         * AddressLineContentsMatch.
         */
        public Builder addressLineContentsMatch(String addressLineContentsMatch) {
            this.putQueryParameter("AddressLineContentsMatch", addressLineContentsMatch);
            this.addressLineContentsMatch = addressLineContentsMatch;
            return this;
        }

        /**
         * AgeRange.
         */
        public Builder ageRange(String ageRange) {
            this.putQueryParameter("AgeRange", ageRange);
            this.ageRange = ageRange;
            return this;
        }

        /**
         * CreateTimeRange.
         */
        public Builder createTimeRange(String createTimeRange) {
            this.putQueryParameter("CreateTimeRange", createTimeRange);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * Emotion.
         */
        public Builder emotion(String emotion) {
            this.putQueryParameter("Emotion", emotion);
            this.emotion = emotion;
            return this;
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
         * FacesModifyTimeRange.
         */
        public Builder facesModifyTimeRange(String facesModifyTimeRange) {
            this.putQueryParameter("FacesModifyTimeRange", facesModifyTimeRange);
            this.facesModifyTimeRange = facesModifyTimeRange;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(String gender) {
            this.putQueryParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ImageSizeRange.
         */
        public Builder imageSizeRange(String imageSizeRange) {
            this.putQueryParameter("ImageSizeRange", imageSizeRange);
            this.imageSizeRange = imageSizeRange;
            return this;
        }

        /**
         * ImageTimeRange.
         */
        public Builder imageTimeRange(String imageTimeRange) {
            this.putQueryParameter("ImageTimeRange", imageTimeRange);
            this.imageTimeRange = imageTimeRange;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * LocationBoundary.
         */
        public Builder locationBoundary(String locationBoundary) {
            this.putQueryParameter("LocationBoundary", locationBoundary);
            this.locationBoundary = locationBoundary;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * ModifyTimeRange.
         */
        public Builder modifyTimeRange(String modifyTimeRange) {
            this.putQueryParameter("ModifyTimeRange", modifyTimeRange);
            this.modifyTimeRange = modifyTimeRange;
            return this;
        }

        /**
         * OCRContentsMatch.
         */
        public Builder OCRContentsMatch(String OCRContentsMatch) {
            this.putQueryParameter("OCRContentsMatch", OCRContentsMatch);
            this.OCRContentsMatch = OCRContentsMatch;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
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
         * RemarksAPrefix.
         */
        public Builder remarksAPrefix(String remarksAPrefix) {
            this.putQueryParameter("RemarksAPrefix", remarksAPrefix);
            this.remarksAPrefix = remarksAPrefix;
            return this;
        }

        /**
         * RemarksArrayAIn.
         */
        public Builder remarksArrayAIn(String remarksArrayAIn) {
            this.putQueryParameter("RemarksArrayAIn", remarksArrayAIn);
            this.remarksArrayAIn = remarksArrayAIn;
            return this;
        }

        /**
         * RemarksArrayBIn.
         */
        public Builder remarksArrayBIn(String remarksArrayBIn) {
            this.putQueryParameter("RemarksArrayBIn", remarksArrayBIn);
            this.remarksArrayBIn = remarksArrayBIn;
            return this;
        }

        /**
         * RemarksBPrefix.
         */
        public Builder remarksBPrefix(String remarksBPrefix) {
            this.putQueryParameter("RemarksBPrefix", remarksBPrefix);
            this.remarksBPrefix = remarksBPrefix;
            return this;
        }

        /**
         * RemarksCPrefix.
         */
        public Builder remarksCPrefix(String remarksCPrefix) {
            this.putQueryParameter("RemarksCPrefix", remarksCPrefix);
            this.remarksCPrefix = remarksCPrefix;
            return this;
        }

        /**
         * RemarksDPrefix.
         */
        public Builder remarksDPrefix(String remarksDPrefix) {
            this.putQueryParameter("RemarksDPrefix", remarksDPrefix);
            this.remarksDPrefix = remarksDPrefix;
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
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SourceUriPrefix.
         */
        public Builder sourceUriPrefix(String sourceUriPrefix) {
            this.putQueryParameter("SourceUriPrefix", sourceUriPrefix);
            this.sourceUriPrefix = sourceUriPrefix;
            return this;
        }

        /**
         * TagNames.
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        /**
         * TagsModifyTimeRange.
         */
        public Builder tagsModifyTimeRange(String tagsModifyTimeRange) {
            this.putQueryParameter("TagsModifyTimeRange", tagsModifyTimeRange);
            this.tagsModifyTimeRange = tagsModifyTimeRange;
            return this;
        }

        @Override
        public FindImagesRequest build() {
            return new FindImagesRequest(this);
        } 

    } 

}
