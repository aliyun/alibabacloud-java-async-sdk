// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchCondition} extends {@link TeaModel}
 *
 * <p>SearchCondition</p>
 */
public class SearchCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assKeywordList")
    private java.util.List < String > assKeywordList;

    @com.aliyun.core.annotation.NameInMap("atAuthorNameList")
    private java.util.List < String > atAuthorNameList;

    @com.aliyun.core.annotation.NameInMap("authorNameList")
    private java.util.List < String > authorNameList;

    @com.aliyun.core.annotation.NameInMap("commentsLevel")
    private Integer commentsLevel;

    @com.aliyun.core.annotation.NameInMap("contentLenLevel")
    private Integer contentLenLevel;

    @com.aliyun.core.annotation.NameInMap("createTimeEnd")
    private Long createTimeEnd;

    @com.aliyun.core.annotation.NameInMap("createTimeStart")
    private Long createTimeStart;

    @com.aliyun.core.annotation.NameInMap("docContentSign")
    private String docContentSign;

    @com.aliyun.core.annotation.NameInMap("docIdList")
    private java.util.List < String > docIdList;

    @com.aliyun.core.annotation.NameInMap("duplicateRemoval")
    private Boolean duplicateRemoval;

    @com.aliyun.core.annotation.NameInMap("emotionType")
    private Integer emotionType;

    @com.aliyun.core.annotation.NameInMap("enableKeywordHighlight")
    private Boolean enableKeywordHighlight;

    @com.aliyun.core.annotation.NameInMap("excludeAtAuthorNameList")
    private java.util.List < String > excludeAtAuthorNameList;

    @com.aliyun.core.annotation.NameInMap("excludeAuthorNameList")
    private java.util.List < String > excludeAuthorNameList;

    @com.aliyun.core.annotation.NameInMap("excludeHostNameList")
    private java.util.List < String > excludeHostNameList;

    @com.aliyun.core.annotation.NameInMap("excludeKeywordList")
    private java.util.List < String > excludeKeywordList;

    @com.aliyun.core.annotation.NameInMap("excludeKeywordListInTitle")
    private java.util.List < String > excludeKeywordListInTitle;

    @com.aliyun.core.annotation.NameInMap("excludeKeywordTagIds")
    private java.util.List < Long > excludeKeywordTagIds;

    @com.aliyun.core.annotation.NameInMap("excludeMaterialTagList")
    private java.util.List < String > excludeMaterialTagList;

    @com.aliyun.core.annotation.NameInMap("excludeMediaLibraryIdList")
    private java.util.List < String > excludeMediaLibraryIdList;

    @com.aliyun.core.annotation.NameInMap("excludeMediaNameList")
    private java.util.List < String > excludeMediaNameList;

    @com.aliyun.core.annotation.NameInMap("excludeMediaTypeList")
    private java.util.List < String > excludeMediaTypeList;

    @com.aliyun.core.annotation.NameInMap("excludeMessageTypeList")
    private java.util.List < String > excludeMessageTypeList;

    @com.aliyun.core.annotation.NameInMap("fieldConditions")
    private java.util.List < FieldCondition > fieldConditions;

    @com.aliyun.core.annotation.NameInMap("filterId")
    private Long filterId;

    @com.aliyun.core.annotation.NameInMap("hasAudio")
    private Boolean hasAudio;

    @com.aliyun.core.annotation.NameInMap("hasImage")
    private Boolean hasImage;

    @com.aliyun.core.annotation.NameInMap("hasMultiModeContent")
    private Boolean hasMultiModeContent;

    @com.aliyun.core.annotation.NameInMap("hasVideo")
    private Boolean hasVideo;

    @com.aliyun.core.annotation.NameInMap("hostNameList")
    private java.util.List < String > hostNameList;

    @com.aliyun.core.annotation.NameInMap("influenceLevel")
    private Long influenceLevel;

    @com.aliyun.core.annotation.NameInMap("keywordTagIds")
    private java.util.List < Long > keywordTagIds;

    @com.aliyun.core.annotation.NameInMap("likesLevel")
    private Integer likesLevel;

    @com.aliyun.core.annotation.NameInMap("materialTagList")
    private java.util.List < String > materialTagList;

    @com.aliyun.core.annotation.NameInMap("mediaLibraryIdList")
    private java.util.List < String > mediaLibraryIdList;

    @com.aliyun.core.annotation.NameInMap("mediaNameList")
    private java.util.List < String > mediaNameList;

    @com.aliyun.core.annotation.NameInMap("mediaTypeList")
    private java.util.List < String > mediaTypeList;

    @com.aliyun.core.annotation.NameInMap("messageTypeList")
    private java.util.List < String > messageTypeList;

    @com.aliyun.core.annotation.NameInMap("pageNow")
    private Integer pageNow;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("parentDocId")
    private String parentDocId;

    @com.aliyun.core.annotation.NameInMap("posKeywordList")
    private java.util.List < String > posKeywordList;

    @com.aliyun.core.annotation.NameInMap("posKeywordListInTitle")
    private java.util.List < String > posKeywordListInTitle;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("propagationLevel")
    private Long propagationLevel;

    @com.aliyun.core.annotation.NameInMap("publishTimeEnd")
    private Long publishTimeEnd;

    @com.aliyun.core.annotation.NameInMap("publishTimeStart")
    private Long publishTimeStart;

    @com.aliyun.core.annotation.NameInMap("readsLevel")
    private Integer readsLevel;

    @com.aliyun.core.annotation.NameInMap("relevanceLevel")
    private Integer relevanceLevel;

    @com.aliyun.core.annotation.NameInMap("repostLevel")
    private Integer repostLevel;

    @com.aliyun.core.annotation.NameInMap("sortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("sortByDirection")
    private String sortByDirection;

    @com.aliyun.core.annotation.NameInMap("topicList")
    private java.util.List < String > topicList;

    @com.aliyun.core.annotation.NameInMap("updateTimeEnd")
    private Long updateTimeEnd;

    @com.aliyun.core.annotation.NameInMap("updateTimeStart")
    private Long updateTimeStart;

    private SearchCondition(Builder builder) {
        this.assKeywordList = builder.assKeywordList;
        this.atAuthorNameList = builder.atAuthorNameList;
        this.authorNameList = builder.authorNameList;
        this.commentsLevel = builder.commentsLevel;
        this.contentLenLevel = builder.contentLenLevel;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.docContentSign = builder.docContentSign;
        this.docIdList = builder.docIdList;
        this.duplicateRemoval = builder.duplicateRemoval;
        this.emotionType = builder.emotionType;
        this.enableKeywordHighlight = builder.enableKeywordHighlight;
        this.excludeAtAuthorNameList = builder.excludeAtAuthorNameList;
        this.excludeAuthorNameList = builder.excludeAuthorNameList;
        this.excludeHostNameList = builder.excludeHostNameList;
        this.excludeKeywordList = builder.excludeKeywordList;
        this.excludeKeywordListInTitle = builder.excludeKeywordListInTitle;
        this.excludeKeywordTagIds = builder.excludeKeywordTagIds;
        this.excludeMaterialTagList = builder.excludeMaterialTagList;
        this.excludeMediaLibraryIdList = builder.excludeMediaLibraryIdList;
        this.excludeMediaNameList = builder.excludeMediaNameList;
        this.excludeMediaTypeList = builder.excludeMediaTypeList;
        this.excludeMessageTypeList = builder.excludeMessageTypeList;
        this.fieldConditions = builder.fieldConditions;
        this.filterId = builder.filterId;
        this.hasAudio = builder.hasAudio;
        this.hasImage = builder.hasImage;
        this.hasMultiModeContent = builder.hasMultiModeContent;
        this.hasVideo = builder.hasVideo;
        this.hostNameList = builder.hostNameList;
        this.influenceLevel = builder.influenceLevel;
        this.keywordTagIds = builder.keywordTagIds;
        this.likesLevel = builder.likesLevel;
        this.materialTagList = builder.materialTagList;
        this.mediaLibraryIdList = builder.mediaLibraryIdList;
        this.mediaNameList = builder.mediaNameList;
        this.mediaTypeList = builder.mediaTypeList;
        this.messageTypeList = builder.messageTypeList;
        this.pageNow = builder.pageNow;
        this.pageSize = builder.pageSize;
        this.parentDocId = builder.parentDocId;
        this.posKeywordList = builder.posKeywordList;
        this.posKeywordListInTitle = builder.posKeywordListInTitle;
        this.projectId = builder.projectId;
        this.propagationLevel = builder.propagationLevel;
        this.publishTimeEnd = builder.publishTimeEnd;
        this.publishTimeStart = builder.publishTimeStart;
        this.readsLevel = builder.readsLevel;
        this.relevanceLevel = builder.relevanceLevel;
        this.repostLevel = builder.repostLevel;
        this.sortBy = builder.sortBy;
        this.sortByDirection = builder.sortByDirection;
        this.topicList = builder.topicList;
        this.updateTimeEnd = builder.updateTimeEnd;
        this.updateTimeStart = builder.updateTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCondition create() {
        return builder().build();
    }

    /**
     * @return assKeywordList
     */
    public java.util.List < String > getAssKeywordList() {
        return this.assKeywordList;
    }

    /**
     * @return atAuthorNameList
     */
    public java.util.List < String > getAtAuthorNameList() {
        return this.atAuthorNameList;
    }

    /**
     * @return authorNameList
     */
    public java.util.List < String > getAuthorNameList() {
        return this.authorNameList;
    }

    /**
     * @return commentsLevel
     */
    public Integer getCommentsLevel() {
        return this.commentsLevel;
    }

    /**
     * @return contentLenLevel
     */
    public Integer getContentLenLevel() {
        return this.contentLenLevel;
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return docContentSign
     */
    public String getDocContentSign() {
        return this.docContentSign;
    }

    /**
     * @return docIdList
     */
    public java.util.List < String > getDocIdList() {
        return this.docIdList;
    }

    /**
     * @return duplicateRemoval
     */
    public Boolean getDuplicateRemoval() {
        return this.duplicateRemoval;
    }

    /**
     * @return emotionType
     */
    public Integer getEmotionType() {
        return this.emotionType;
    }

    /**
     * @return enableKeywordHighlight
     */
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    /**
     * @return excludeAtAuthorNameList
     */
    public java.util.List < String > getExcludeAtAuthorNameList() {
        return this.excludeAtAuthorNameList;
    }

    /**
     * @return excludeAuthorNameList
     */
    public java.util.List < String > getExcludeAuthorNameList() {
        return this.excludeAuthorNameList;
    }

    /**
     * @return excludeHostNameList
     */
    public java.util.List < String > getExcludeHostNameList() {
        return this.excludeHostNameList;
    }

    /**
     * @return excludeKeywordList
     */
    public java.util.List < String > getExcludeKeywordList() {
        return this.excludeKeywordList;
    }

    /**
     * @return excludeKeywordListInTitle
     */
    public java.util.List < String > getExcludeKeywordListInTitle() {
        return this.excludeKeywordListInTitle;
    }

    /**
     * @return excludeKeywordTagIds
     */
    public java.util.List < Long > getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
    }

    /**
     * @return excludeMaterialTagList
     */
    public java.util.List < String > getExcludeMaterialTagList() {
        return this.excludeMaterialTagList;
    }

    /**
     * @return excludeMediaLibraryIdList
     */
    public java.util.List < String > getExcludeMediaLibraryIdList() {
        return this.excludeMediaLibraryIdList;
    }

    /**
     * @return excludeMediaNameList
     */
    public java.util.List < String > getExcludeMediaNameList() {
        return this.excludeMediaNameList;
    }

    /**
     * @return excludeMediaTypeList
     */
    public java.util.List < String > getExcludeMediaTypeList() {
        return this.excludeMediaTypeList;
    }

    /**
     * @return excludeMessageTypeList
     */
    public java.util.List < String > getExcludeMessageTypeList() {
        return this.excludeMessageTypeList;
    }

    /**
     * @return fieldConditions
     */
    public java.util.List < FieldCondition > getFieldConditions() {
        return this.fieldConditions;
    }

    /**
     * @return filterId
     */
    public Long getFilterId() {
        return this.filterId;
    }

    /**
     * @return hasAudio
     */
    public Boolean getHasAudio() {
        return this.hasAudio;
    }

    /**
     * @return hasImage
     */
    public Boolean getHasImage() {
        return this.hasImage;
    }

    /**
     * @return hasMultiModeContent
     */
    public Boolean getHasMultiModeContent() {
        return this.hasMultiModeContent;
    }

    /**
     * @return hasVideo
     */
    public Boolean getHasVideo() {
        return this.hasVideo;
    }

    /**
     * @return hostNameList
     */
    public java.util.List < String > getHostNameList() {
        return this.hostNameList;
    }

    /**
     * @return influenceLevel
     */
    public Long getInfluenceLevel() {
        return this.influenceLevel;
    }

    /**
     * @return keywordTagIds
     */
    public java.util.List < Long > getKeywordTagIds() {
        return this.keywordTagIds;
    }

    /**
     * @return likesLevel
     */
    public Integer getLikesLevel() {
        return this.likesLevel;
    }

    /**
     * @return materialTagList
     */
    public java.util.List < String > getMaterialTagList() {
        return this.materialTagList;
    }

    /**
     * @return mediaLibraryIdList
     */
    public java.util.List < String > getMediaLibraryIdList() {
        return this.mediaLibraryIdList;
    }

    /**
     * @return mediaNameList
     */
    public java.util.List < String > getMediaNameList() {
        return this.mediaNameList;
    }

    /**
     * @return mediaTypeList
     */
    public java.util.List < String > getMediaTypeList() {
        return this.mediaTypeList;
    }

    /**
     * @return messageTypeList
     */
    public java.util.List < String > getMessageTypeList() {
        return this.messageTypeList;
    }

    /**
     * @return pageNow
     */
    public Integer getPageNow() {
        return this.pageNow;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentDocId
     */
    public String getParentDocId() {
        return this.parentDocId;
    }

    /**
     * @return posKeywordList
     */
    public java.util.List < String > getPosKeywordList() {
        return this.posKeywordList;
    }

    /**
     * @return posKeywordListInTitle
     */
    public java.util.List < String > getPosKeywordListInTitle() {
        return this.posKeywordListInTitle;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return propagationLevel
     */
    public Long getPropagationLevel() {
        return this.propagationLevel;
    }

    /**
     * @return publishTimeEnd
     */
    public Long getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    /**
     * @return publishTimeStart
     */
    public Long getPublishTimeStart() {
        return this.publishTimeStart;
    }

    /**
     * @return readsLevel
     */
    public Integer getReadsLevel() {
        return this.readsLevel;
    }

    /**
     * @return relevanceLevel
     */
    public Integer getRelevanceLevel() {
        return this.relevanceLevel;
    }

    /**
     * @return repostLevel
     */
    public Integer getRepostLevel() {
        return this.repostLevel;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortByDirection
     */
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    /**
     * @return topicList
     */
    public java.util.List < String > getTopicList() {
        return this.topicList;
    }

    /**
     * @return updateTimeEnd
     */
    public Long getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    /**
     * @return updateTimeStart
     */
    public Long getUpdateTimeStart() {
        return this.updateTimeStart;
    }

    public static final class Builder {
        private java.util.List < String > assKeywordList; 
        private java.util.List < String > atAuthorNameList; 
        private java.util.List < String > authorNameList; 
        private Integer commentsLevel; 
        private Integer contentLenLevel; 
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private String docContentSign; 
        private java.util.List < String > docIdList; 
        private Boolean duplicateRemoval; 
        private Integer emotionType; 
        private Boolean enableKeywordHighlight; 
        private java.util.List < String > excludeAtAuthorNameList; 
        private java.util.List < String > excludeAuthorNameList; 
        private java.util.List < String > excludeHostNameList; 
        private java.util.List < String > excludeKeywordList; 
        private java.util.List < String > excludeKeywordListInTitle; 
        private java.util.List < Long > excludeKeywordTagIds; 
        private java.util.List < String > excludeMaterialTagList; 
        private java.util.List < String > excludeMediaLibraryIdList; 
        private java.util.List < String > excludeMediaNameList; 
        private java.util.List < String > excludeMediaTypeList; 
        private java.util.List < String > excludeMessageTypeList; 
        private java.util.List < FieldCondition > fieldConditions; 
        private Long filterId; 
        private Boolean hasAudio; 
        private Boolean hasImage; 
        private Boolean hasMultiModeContent; 
        private Boolean hasVideo; 
        private java.util.List < String > hostNameList; 
        private Long influenceLevel; 
        private java.util.List < Long > keywordTagIds; 
        private Integer likesLevel; 
        private java.util.List < String > materialTagList; 
        private java.util.List < String > mediaLibraryIdList; 
        private java.util.List < String > mediaNameList; 
        private java.util.List < String > mediaTypeList; 
        private java.util.List < String > messageTypeList; 
        private Integer pageNow; 
        private Integer pageSize; 
        private String parentDocId; 
        private java.util.List < String > posKeywordList; 
        private java.util.List < String > posKeywordListInTitle; 
        private Long projectId; 
        private Long propagationLevel; 
        private Long publishTimeEnd; 
        private Long publishTimeStart; 
        private Integer readsLevel; 
        private Integer relevanceLevel; 
        private Integer repostLevel; 
        private String sortBy; 
        private String sortByDirection; 
        private java.util.List < String > topicList; 
        private Long updateTimeEnd; 
        private Long updateTimeStart; 

        /**
         * assKeywordList.
         */
        public Builder assKeywordList(java.util.List < String > assKeywordList) {
            this.assKeywordList = assKeywordList;
            return this;
        }

        /**
         * atAuthorNameList.
         */
        public Builder atAuthorNameList(java.util.List < String > atAuthorNameList) {
            this.atAuthorNameList = atAuthorNameList;
            return this;
        }

        /**
         * authorNameList.
         */
        public Builder authorNameList(java.util.List < String > authorNameList) {
            this.authorNameList = authorNameList;
            return this;
        }

        /**
         * commentsLevel.
         */
        public Builder commentsLevel(Integer commentsLevel) {
            this.commentsLevel = commentsLevel;
            return this;
        }

        /**
         * contentLenLevel.
         */
        public Builder contentLenLevel(Integer contentLenLevel) {
            this.contentLenLevel = contentLenLevel;
            return this;
        }

        /**
         * createTimeEnd.
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * createTimeStart.
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * docContentSign.
         */
        public Builder docContentSign(String docContentSign) {
            this.docContentSign = docContentSign;
            return this;
        }

        /**
         * docIdList.
         */
        public Builder docIdList(java.util.List < String > docIdList) {
            this.docIdList = docIdList;
            return this;
        }

        /**
         * duplicateRemoval.
         */
        public Builder duplicateRemoval(Boolean duplicateRemoval) {
            this.duplicateRemoval = duplicateRemoval;
            return this;
        }

        /**
         * emotionType.
         */
        public Builder emotionType(Integer emotionType) {
            this.emotionType = emotionType;
            return this;
        }

        /**
         * enableKeywordHighlight.
         */
        public Builder enableKeywordHighlight(Boolean enableKeywordHighlight) {
            this.enableKeywordHighlight = enableKeywordHighlight;
            return this;
        }

        /**
         * excludeAtAuthorNameList.
         */
        public Builder excludeAtAuthorNameList(java.util.List < String > excludeAtAuthorNameList) {
            this.excludeAtAuthorNameList = excludeAtAuthorNameList;
            return this;
        }

        /**
         * excludeAuthorNameList.
         */
        public Builder excludeAuthorNameList(java.util.List < String > excludeAuthorNameList) {
            this.excludeAuthorNameList = excludeAuthorNameList;
            return this;
        }

        /**
         * excludeHostNameList.
         */
        public Builder excludeHostNameList(java.util.List < String > excludeHostNameList) {
            this.excludeHostNameList = excludeHostNameList;
            return this;
        }

        /**
         * excludeKeywordList.
         */
        public Builder excludeKeywordList(java.util.List < String > excludeKeywordList) {
            this.excludeKeywordList = excludeKeywordList;
            return this;
        }

        /**
         * excludeKeywordListInTitle.
         */
        public Builder excludeKeywordListInTitle(java.util.List < String > excludeKeywordListInTitle) {
            this.excludeKeywordListInTitle = excludeKeywordListInTitle;
            return this;
        }

        /**
         * excludeKeywordTagIds.
         */
        public Builder excludeKeywordTagIds(java.util.List < Long > excludeKeywordTagIds) {
            this.excludeKeywordTagIds = excludeKeywordTagIds;
            return this;
        }

        /**
         * excludeMaterialTagList.
         */
        public Builder excludeMaterialTagList(java.util.List < String > excludeMaterialTagList) {
            this.excludeMaterialTagList = excludeMaterialTagList;
            return this;
        }

        /**
         * excludeMediaLibraryIdList.
         */
        public Builder excludeMediaLibraryIdList(java.util.List < String > excludeMediaLibraryIdList) {
            this.excludeMediaLibraryIdList = excludeMediaLibraryIdList;
            return this;
        }

        /**
         * excludeMediaNameList.
         */
        public Builder excludeMediaNameList(java.util.List < String > excludeMediaNameList) {
            this.excludeMediaNameList = excludeMediaNameList;
            return this;
        }

        /**
         * excludeMediaTypeList.
         */
        public Builder excludeMediaTypeList(java.util.List < String > excludeMediaTypeList) {
            this.excludeMediaTypeList = excludeMediaTypeList;
            return this;
        }

        /**
         * excludeMessageTypeList.
         */
        public Builder excludeMessageTypeList(java.util.List < String > excludeMessageTypeList) {
            this.excludeMessageTypeList = excludeMessageTypeList;
            return this;
        }

        /**
         * fieldConditions.
         */
        public Builder fieldConditions(java.util.List < FieldCondition > fieldConditions) {
            this.fieldConditions = fieldConditions;
            return this;
        }

        /**
         * filterId.
         */
        public Builder filterId(Long filterId) {
            this.filterId = filterId;
            return this;
        }

        /**
         * hasAudio.
         */
        public Builder hasAudio(Boolean hasAudio) {
            this.hasAudio = hasAudio;
            return this;
        }

        /**
         * hasImage.
         */
        public Builder hasImage(Boolean hasImage) {
            this.hasImage = hasImage;
            return this;
        }

        /**
         * hasMultiModeContent.
         */
        public Builder hasMultiModeContent(Boolean hasMultiModeContent) {
            this.hasMultiModeContent = hasMultiModeContent;
            return this;
        }

        /**
         * hasVideo.
         */
        public Builder hasVideo(Boolean hasVideo) {
            this.hasVideo = hasVideo;
            return this;
        }

        /**
         * hostNameList.
         */
        public Builder hostNameList(java.util.List < String > hostNameList) {
            this.hostNameList = hostNameList;
            return this;
        }

        /**
         * influenceLevel.
         */
        public Builder influenceLevel(Long influenceLevel) {
            this.influenceLevel = influenceLevel;
            return this;
        }

        /**
         * keywordTagIds.
         */
        public Builder keywordTagIds(java.util.List < Long > keywordTagIds) {
            this.keywordTagIds = keywordTagIds;
            return this;
        }

        /**
         * likesLevel.
         */
        public Builder likesLevel(Integer likesLevel) {
            this.likesLevel = likesLevel;
            return this;
        }

        /**
         * materialTagList.
         */
        public Builder materialTagList(java.util.List < String > materialTagList) {
            this.materialTagList = materialTagList;
            return this;
        }

        /**
         * mediaLibraryIdList.
         */
        public Builder mediaLibraryIdList(java.util.List < String > mediaLibraryIdList) {
            this.mediaLibraryIdList = mediaLibraryIdList;
            return this;
        }

        /**
         * mediaNameList.
         */
        public Builder mediaNameList(java.util.List < String > mediaNameList) {
            this.mediaNameList = mediaNameList;
            return this;
        }

        /**
         * mediaTypeList.
         */
        public Builder mediaTypeList(java.util.List < String > mediaTypeList) {
            this.mediaTypeList = mediaTypeList;
            return this;
        }

        /**
         * messageTypeList.
         */
        public Builder messageTypeList(java.util.List < String > messageTypeList) {
            this.messageTypeList = messageTypeList;
            return this;
        }

        /**
         * pageNow.
         */
        public Builder pageNow(Integer pageNow) {
            this.pageNow = pageNow;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * parentDocId.
         */
        public Builder parentDocId(String parentDocId) {
            this.parentDocId = parentDocId;
            return this;
        }

        /**
         * posKeywordList.
         */
        public Builder posKeywordList(java.util.List < String > posKeywordList) {
            this.posKeywordList = posKeywordList;
            return this;
        }

        /**
         * posKeywordListInTitle.
         */
        public Builder posKeywordListInTitle(java.util.List < String > posKeywordListInTitle) {
            this.posKeywordListInTitle = posKeywordListInTitle;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * propagationLevel.
         */
        public Builder propagationLevel(Long propagationLevel) {
            this.propagationLevel = propagationLevel;
            return this;
        }

        /**
         * publishTimeEnd.
         */
        public Builder publishTimeEnd(Long publishTimeEnd) {
            this.publishTimeEnd = publishTimeEnd;
            return this;
        }

        /**
         * publishTimeStart.
         */
        public Builder publishTimeStart(Long publishTimeStart) {
            this.publishTimeStart = publishTimeStart;
            return this;
        }

        /**
         * readsLevel.
         */
        public Builder readsLevel(Integer readsLevel) {
            this.readsLevel = readsLevel;
            return this;
        }

        /**
         * relevanceLevel.
         */
        public Builder relevanceLevel(Integer relevanceLevel) {
            this.relevanceLevel = relevanceLevel;
            return this;
        }

        /**
         * repostLevel.
         */
        public Builder repostLevel(Integer repostLevel) {
            this.repostLevel = repostLevel;
            return this;
        }

        /**
         * sortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * sortByDirection.
         */
        public Builder sortByDirection(String sortByDirection) {
            this.sortByDirection = sortByDirection;
            return this;
        }

        /**
         * topicList.
         */
        public Builder topicList(java.util.List < String > topicList) {
            this.topicList = topicList;
            return this;
        }

        /**
         * updateTimeEnd.
         */
        public Builder updateTimeEnd(Long updateTimeEnd) {
            this.updateTimeEnd = updateTimeEnd;
            return this;
        }

        /**
         * updateTimeStart.
         */
        public Builder updateTimeStart(Long updateTimeStart) {
            this.updateTimeStart = updateTimeStart;
            return this;
        }

        public SearchCondition build() {
            return new SearchCondition(this);
        } 

    } 

}
