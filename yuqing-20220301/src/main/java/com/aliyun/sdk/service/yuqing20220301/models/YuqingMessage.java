// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link YuqingMessage} extends {@link TeaModel}
 *
 * <p>YuqingMessage</p>
 */
public class YuqingMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("appScore")
    private Long appScore;

    @com.aliyun.core.annotation.NameInMap("appStoreName")
    private String appStoreName;

    @com.aliyun.core.annotation.NameInMap("atAuthorNames")
    private java.util.List < String > atAuthorNames;

    @com.aliyun.core.annotation.NameInMap("audioCount")
    private Integer audioCount;

    @com.aliyun.core.annotation.NameInMap("authorAvatarUrl")
    private String authorAvatarUrl;

    @com.aliyun.core.annotation.NameInMap("authorFollowersCount")
    private Long authorFollowersCount;

    @com.aliyun.core.annotation.NameInMap("authorFriendsCount")
    private Long authorFriendsCount;

    @com.aliyun.core.annotation.NameInMap("authorGender")
    private String authorGender;

    @com.aliyun.core.annotation.NameInMap("authorId")
    private String authorId;

    @com.aliyun.core.annotation.NameInMap("authorLikesCount")
    private Long authorLikesCount;

    @com.aliyun.core.annotation.NameInMap("authorName")
    private String authorName;

    @com.aliyun.core.annotation.NameInMap("authorProfileUrl")
    private String authorProfileUrl;

    @com.aliyun.core.annotation.NameInMap("authorStatusesCount")
    private Long authorStatusesCount;

    @com.aliyun.core.annotation.NameInMap("authorVerified")
    private Boolean authorVerified;

    @com.aliyun.core.annotation.NameInMap("authorVerifyType")
    private Integer authorVerifyType;

    @com.aliyun.core.annotation.NameInMap("contentAudioText")
    private String contentAudioText;

    @com.aliyun.core.annotation.NameInMap("contentAudioUrls")
    private String contentAudioUrls;

    @com.aliyun.core.annotation.NameInMap("contentImageText")
    private String contentImageText;

    @com.aliyun.core.annotation.NameInMap("contentImageUrls")
    private String contentImageUrls;

    @com.aliyun.core.annotation.NameInMap("contentLang")
    private String contentLang;

    @com.aliyun.core.annotation.NameInMap("contentLen")
    private Long contentLen;

    @com.aliyun.core.annotation.NameInMap("contentVideoText")
    private String contentVideoText;

    @com.aliyun.core.annotation.NameInMap("contentVideoUrls")
    private String contentVideoUrls;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("docAnswersCount")
    private Long docAnswersCount;

    @com.aliyun.core.annotation.NameInMap("docAreas")
    private java.util.List < String > docAreas;

    @com.aliyun.core.annotation.NameInMap("docCoinCount")
    private Long docCoinCount;

    @com.aliyun.core.annotation.NameInMap("docCommentsCount")
    private Long docCommentsCount;

    @com.aliyun.core.annotation.NameInMap("docContent")
    private String docContent;

    @com.aliyun.core.annotation.NameInMap("docContentBrief")
    private String docContentBrief;

    @com.aliyun.core.annotation.NameInMap("docContentSign")
    private String docContentSign;

    @com.aliyun.core.annotation.NameInMap("docId")
    private String docId;

    @com.aliyun.core.annotation.NameInMap("docLikesCount")
    private Long docLikesCount;

    @com.aliyun.core.annotation.NameInMap("docPlayCount")
    private Long docPlayCount;

    @com.aliyun.core.annotation.NameInMap("docReadingCount")
    private Long docReadingCount;

    @com.aliyun.core.annotation.NameInMap("docReadsCount")
    private Long docReadsCount;

    @com.aliyun.core.annotation.NameInMap("docRepostsCount")
    private Long docRepostsCount;

    @com.aliyun.core.annotation.NameInMap("docReprintName")
    private String docReprintName;

    @com.aliyun.core.annotation.NameInMap("docSelfContentSign")
    private String docSelfContentSign;

    @com.aliyun.core.annotation.NameInMap("docTitle")
    private String docTitle;

    @com.aliyun.core.annotation.NameInMap("docUrl")
    private String docUrl;

    @com.aliyun.core.annotation.NameInMap("emotionScore")
    private Double emotionScore;

    @com.aliyun.core.annotation.NameInMap("emotionType")
    private Integer emotionType;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map < String, String > extInfo;

    @com.aliyun.core.annotation.NameInMap("finEventCount")
    private Integer finEventCount;

    @com.aliyun.core.annotation.NameInMap("financeEventList")
    private java.util.List < YuqingFinanceEvent > financeEventList;

    @com.aliyun.core.annotation.NameInMap("highlightKeywords")
    private java.util.List < String > highlightKeywords;

    @com.aliyun.core.annotation.NameInMap("imageCount")
    private Integer imageCount;

    @com.aliyun.core.annotation.NameInMap("influenceScore")
    private Double influenceScore;

    @com.aliyun.core.annotation.NameInMap("mediaHosts")
    private java.util.List < String > mediaHosts;

    @com.aliyun.core.annotation.NameInMap("mediaInfluenceLevel")
    private Integer mediaInfluenceLevel;

    @com.aliyun.core.annotation.NameInMap("mediaName")
    private String mediaName;

    @com.aliyun.core.annotation.NameInMap("mediaPropagationLevel")
    private Integer mediaPropagationLevel;

    @com.aliyun.core.annotation.NameInMap("mediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("messageType")
    private String messageType;

    @com.aliyun.core.annotation.NameInMap("parentDocId")
    private String parentDocId;

    @com.aliyun.core.annotation.NameInMap("propagationScore")
    private Double propagationScore;

    @com.aliyun.core.annotation.NameInMap("publishTime")
    private Long publishTime;

    @com.aliyun.core.annotation.NameInMap("relevanceScore")
    private Double relevanceScore;

    @com.aliyun.core.annotation.NameInMap("reportMaterialTags")
    private java.util.List < String > reportMaterialTags;

    @com.aliyun.core.annotation.NameInMap("repostList")
    private java.util.List < String > repostList;

    @com.aliyun.core.annotation.NameInMap("similarNumber")
    private Integer similarNumber;

    @com.aliyun.core.annotation.NameInMap("topics")
    private java.util.List < String > topics;

    @com.aliyun.core.annotation.NameInMap("videoCount")
    private Integer videoCount;

    @com.aliyun.core.annotation.NameInMap("weiboCommentId")
    private String weiboCommentId;

    @com.aliyun.core.annotation.NameInMap("weiboMid")
    private String weiboMid;

    private YuqingMessage(Builder builder) {
        this.appName = builder.appName;
        this.appScore = builder.appScore;
        this.appStoreName = builder.appStoreName;
        this.atAuthorNames = builder.atAuthorNames;
        this.audioCount = builder.audioCount;
        this.authorAvatarUrl = builder.authorAvatarUrl;
        this.authorFollowersCount = builder.authorFollowersCount;
        this.authorFriendsCount = builder.authorFriendsCount;
        this.authorGender = builder.authorGender;
        this.authorId = builder.authorId;
        this.authorLikesCount = builder.authorLikesCount;
        this.authorName = builder.authorName;
        this.authorProfileUrl = builder.authorProfileUrl;
        this.authorStatusesCount = builder.authorStatusesCount;
        this.authorVerified = builder.authorVerified;
        this.authorVerifyType = builder.authorVerifyType;
        this.contentAudioText = builder.contentAudioText;
        this.contentAudioUrls = builder.contentAudioUrls;
        this.contentImageText = builder.contentImageText;
        this.contentImageUrls = builder.contentImageUrls;
        this.contentLang = builder.contentLang;
        this.contentLen = builder.contentLen;
        this.contentVideoText = builder.contentVideoText;
        this.contentVideoUrls = builder.contentVideoUrls;
        this.createTime = builder.createTime;
        this.docAnswersCount = builder.docAnswersCount;
        this.docAreas = builder.docAreas;
        this.docCoinCount = builder.docCoinCount;
        this.docCommentsCount = builder.docCommentsCount;
        this.docContent = builder.docContent;
        this.docContentBrief = builder.docContentBrief;
        this.docContentSign = builder.docContentSign;
        this.docId = builder.docId;
        this.docLikesCount = builder.docLikesCount;
        this.docPlayCount = builder.docPlayCount;
        this.docReadingCount = builder.docReadingCount;
        this.docReadsCount = builder.docReadsCount;
        this.docRepostsCount = builder.docRepostsCount;
        this.docReprintName = builder.docReprintName;
        this.docSelfContentSign = builder.docSelfContentSign;
        this.docTitle = builder.docTitle;
        this.docUrl = builder.docUrl;
        this.emotionScore = builder.emotionScore;
        this.emotionType = builder.emotionType;
        this.extInfo = builder.extInfo;
        this.finEventCount = builder.finEventCount;
        this.financeEventList = builder.financeEventList;
        this.highlightKeywords = builder.highlightKeywords;
        this.imageCount = builder.imageCount;
        this.influenceScore = builder.influenceScore;
        this.mediaHosts = builder.mediaHosts;
        this.mediaInfluenceLevel = builder.mediaInfluenceLevel;
        this.mediaName = builder.mediaName;
        this.mediaPropagationLevel = builder.mediaPropagationLevel;
        this.mediaType = builder.mediaType;
        this.messageType = builder.messageType;
        this.parentDocId = builder.parentDocId;
        this.propagationScore = builder.propagationScore;
        this.publishTime = builder.publishTime;
        this.relevanceScore = builder.relevanceScore;
        this.reportMaterialTags = builder.reportMaterialTags;
        this.repostList = builder.repostList;
        this.similarNumber = builder.similarNumber;
        this.topics = builder.topics;
        this.videoCount = builder.videoCount;
        this.weiboCommentId = builder.weiboCommentId;
        this.weiboMid = builder.weiboMid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static YuqingMessage create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appScore
     */
    public Long getAppScore() {
        return this.appScore;
    }

    /**
     * @return appStoreName
     */
    public String getAppStoreName() {
        return this.appStoreName;
    }

    /**
     * @return atAuthorNames
     */
    public java.util.List < String > getAtAuthorNames() {
        return this.atAuthorNames;
    }

    /**
     * @return audioCount
     */
    public Integer getAudioCount() {
        return this.audioCount;
    }

    /**
     * @return authorAvatarUrl
     */
    public String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    /**
     * @return authorFollowersCount
     */
    public Long getAuthorFollowersCount() {
        return this.authorFollowersCount;
    }

    /**
     * @return authorFriendsCount
     */
    public Long getAuthorFriendsCount() {
        return this.authorFriendsCount;
    }

    /**
     * @return authorGender
     */
    public String getAuthorGender() {
        return this.authorGender;
    }

    /**
     * @return authorId
     */
    public String getAuthorId() {
        return this.authorId;
    }

    /**
     * @return authorLikesCount
     */
    public Long getAuthorLikesCount() {
        return this.authorLikesCount;
    }

    /**
     * @return authorName
     */
    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * @return authorProfileUrl
     */
    public String getAuthorProfileUrl() {
        return this.authorProfileUrl;
    }

    /**
     * @return authorStatusesCount
     */
    public Long getAuthorStatusesCount() {
        return this.authorStatusesCount;
    }

    /**
     * @return authorVerified
     */
    public Boolean getAuthorVerified() {
        return this.authorVerified;
    }

    /**
     * @return authorVerifyType
     */
    public Integer getAuthorVerifyType() {
        return this.authorVerifyType;
    }

    /**
     * @return contentAudioText
     */
    public String getContentAudioText() {
        return this.contentAudioText;
    }

    /**
     * @return contentAudioUrls
     */
    public String getContentAudioUrls() {
        return this.contentAudioUrls;
    }

    /**
     * @return contentImageText
     */
    public String getContentImageText() {
        return this.contentImageText;
    }

    /**
     * @return contentImageUrls
     */
    public String getContentImageUrls() {
        return this.contentImageUrls;
    }

    /**
     * @return contentLang
     */
    public String getContentLang() {
        return this.contentLang;
    }

    /**
     * @return contentLen
     */
    public Long getContentLen() {
        return this.contentLen;
    }

    /**
     * @return contentVideoText
     */
    public String getContentVideoText() {
        return this.contentVideoText;
    }

    /**
     * @return contentVideoUrls
     */
    public String getContentVideoUrls() {
        return this.contentVideoUrls;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return docAnswersCount
     */
    public Long getDocAnswersCount() {
        return this.docAnswersCount;
    }

    /**
     * @return docAreas
     */
    public java.util.List < String > getDocAreas() {
        return this.docAreas;
    }

    /**
     * @return docCoinCount
     */
    public Long getDocCoinCount() {
        return this.docCoinCount;
    }

    /**
     * @return docCommentsCount
     */
    public Long getDocCommentsCount() {
        return this.docCommentsCount;
    }

    /**
     * @return docContent
     */
    public String getDocContent() {
        return this.docContent;
    }

    /**
     * @return docContentBrief
     */
    public String getDocContentBrief() {
        return this.docContentBrief;
    }

    /**
     * @return docContentSign
     */
    public String getDocContentSign() {
        return this.docContentSign;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return docLikesCount
     */
    public Long getDocLikesCount() {
        return this.docLikesCount;
    }

    /**
     * @return docPlayCount
     */
    public Long getDocPlayCount() {
        return this.docPlayCount;
    }

    /**
     * @return docReadingCount
     */
    public Long getDocReadingCount() {
        return this.docReadingCount;
    }

    /**
     * @return docReadsCount
     */
    public Long getDocReadsCount() {
        return this.docReadsCount;
    }

    /**
     * @return docRepostsCount
     */
    public Long getDocRepostsCount() {
        return this.docRepostsCount;
    }

    /**
     * @return docReprintName
     */
    public String getDocReprintName() {
        return this.docReprintName;
    }

    /**
     * @return docSelfContentSign
     */
    public String getDocSelfContentSign() {
        return this.docSelfContentSign;
    }

    /**
     * @return docTitle
     */
    public String getDocTitle() {
        return this.docTitle;
    }

    /**
     * @return docUrl
     */
    public String getDocUrl() {
        return this.docUrl;
    }

    /**
     * @return emotionScore
     */
    public Double getEmotionScore() {
        return this.emotionScore;
    }

    /**
     * @return emotionType
     */
    public Integer getEmotionType() {
        return this.emotionType;
    }

    /**
     * @return extInfo
     */
    public java.util.Map < String, String > getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return finEventCount
     */
    public Integer getFinEventCount() {
        return this.finEventCount;
    }

    /**
     * @return financeEventList
     */
    public java.util.List < YuqingFinanceEvent > getFinanceEventList() {
        return this.financeEventList;
    }

    /**
     * @return highlightKeywords
     */
    public java.util.List < String > getHighlightKeywords() {
        return this.highlightKeywords;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return influenceScore
     */
    public Double getInfluenceScore() {
        return this.influenceScore;
    }

    /**
     * @return mediaHosts
     */
    public java.util.List < String > getMediaHosts() {
        return this.mediaHosts;
    }

    /**
     * @return mediaInfluenceLevel
     */
    public Integer getMediaInfluenceLevel() {
        return this.mediaInfluenceLevel;
    }

    /**
     * @return mediaName
     */
    public String getMediaName() {
        return this.mediaName;
    }

    /**
     * @return mediaPropagationLevel
     */
    public Integer getMediaPropagationLevel() {
        return this.mediaPropagationLevel;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return parentDocId
     */
    public String getParentDocId() {
        return this.parentDocId;
    }

    /**
     * @return propagationScore
     */
    public Double getPropagationScore() {
        return this.propagationScore;
    }

    /**
     * @return publishTime
     */
    public Long getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return relevanceScore
     */
    public Double getRelevanceScore() {
        return this.relevanceScore;
    }

    /**
     * @return reportMaterialTags
     */
    public java.util.List < String > getReportMaterialTags() {
        return this.reportMaterialTags;
    }

    /**
     * @return repostList
     */
    public java.util.List < String > getRepostList() {
        return this.repostList;
    }

    /**
     * @return similarNumber
     */
    public Integer getSimilarNumber() {
        return this.similarNumber;
    }

    /**
     * @return topics
     */
    public java.util.List < String > getTopics() {
        return this.topics;
    }

    /**
     * @return videoCount
     */
    public Integer getVideoCount() {
        return this.videoCount;
    }

    /**
     * @return weiboCommentId
     */
    public String getWeiboCommentId() {
        return this.weiboCommentId;
    }

    /**
     * @return weiboMid
     */
    public String getWeiboMid() {
        return this.weiboMid;
    }

    public static final class Builder {
        private String appName; 
        private Long appScore; 
        private String appStoreName; 
        private java.util.List < String > atAuthorNames; 
        private Integer audioCount; 
        private String authorAvatarUrl; 
        private Long authorFollowersCount; 
        private Long authorFriendsCount; 
        private String authorGender; 
        private String authorId; 
        private Long authorLikesCount; 
        private String authorName; 
        private String authorProfileUrl; 
        private Long authorStatusesCount; 
        private Boolean authorVerified; 
        private Integer authorVerifyType; 
        private String contentAudioText; 
        private String contentAudioUrls; 
        private String contentImageText; 
        private String contentImageUrls; 
        private String contentLang; 
        private Long contentLen; 
        private String contentVideoText; 
        private String contentVideoUrls; 
        private Long createTime; 
        private Long docAnswersCount; 
        private java.util.List < String > docAreas; 
        private Long docCoinCount; 
        private Long docCommentsCount; 
        private String docContent; 
        private String docContentBrief; 
        private String docContentSign; 
        private String docId; 
        private Long docLikesCount; 
        private Long docPlayCount; 
        private Long docReadingCount; 
        private Long docReadsCount; 
        private Long docRepostsCount; 
        private String docReprintName; 
        private String docSelfContentSign; 
        private String docTitle; 
        private String docUrl; 
        private Double emotionScore; 
        private Integer emotionType; 
        private java.util.Map < String, String > extInfo; 
        private Integer finEventCount; 
        private java.util.List < YuqingFinanceEvent > financeEventList; 
        private java.util.List < String > highlightKeywords; 
        private Integer imageCount; 
        private Double influenceScore; 
        private java.util.List < String > mediaHosts; 
        private Integer mediaInfluenceLevel; 
        private String mediaName; 
        private Integer mediaPropagationLevel; 
        private String mediaType; 
        private String messageType; 
        private String parentDocId; 
        private Double propagationScore; 
        private Long publishTime; 
        private Double relevanceScore; 
        private java.util.List < String > reportMaterialTags; 
        private java.util.List < String > repostList; 
        private Integer similarNumber; 
        private java.util.List < String > topics; 
        private Integer videoCount; 
        private String weiboCommentId; 
        private String weiboMid; 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * appScore.
         */
        public Builder appScore(Long appScore) {
            this.appScore = appScore;
            return this;
        }

        /**
         * appStoreName.
         */
        public Builder appStoreName(String appStoreName) {
            this.appStoreName = appStoreName;
            return this;
        }

        /**
         * atAuthorNames.
         */
        public Builder atAuthorNames(java.util.List < String > atAuthorNames) {
            this.atAuthorNames = atAuthorNames;
            return this;
        }

        /**
         * audioCount.
         */
        public Builder audioCount(Integer audioCount) {
            this.audioCount = audioCount;
            return this;
        }

        /**
         * authorAvatarUrl.
         */
        public Builder authorAvatarUrl(String authorAvatarUrl) {
            this.authorAvatarUrl = authorAvatarUrl;
            return this;
        }

        /**
         * authorFollowersCount.
         */
        public Builder authorFollowersCount(Long authorFollowersCount) {
            this.authorFollowersCount = authorFollowersCount;
            return this;
        }

        /**
         * authorFriendsCount.
         */
        public Builder authorFriendsCount(Long authorFriendsCount) {
            this.authorFriendsCount = authorFriendsCount;
            return this;
        }

        /**
         * authorGender.
         */
        public Builder authorGender(String authorGender) {
            this.authorGender = authorGender;
            return this;
        }

        /**
         * authorId.
         */
        public Builder authorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        /**
         * authorLikesCount.
         */
        public Builder authorLikesCount(Long authorLikesCount) {
            this.authorLikesCount = authorLikesCount;
            return this;
        }

        /**
         * authorName.
         */
        public Builder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        /**
         * authorProfileUrl.
         */
        public Builder authorProfileUrl(String authorProfileUrl) {
            this.authorProfileUrl = authorProfileUrl;
            return this;
        }

        /**
         * authorStatusesCount.
         */
        public Builder authorStatusesCount(Long authorStatusesCount) {
            this.authorStatusesCount = authorStatusesCount;
            return this;
        }

        /**
         * authorVerified.
         */
        public Builder authorVerified(Boolean authorVerified) {
            this.authorVerified = authorVerified;
            return this;
        }

        /**
         * authorVerifyType.
         */
        public Builder authorVerifyType(Integer authorVerifyType) {
            this.authorVerifyType = authorVerifyType;
            return this;
        }

        /**
         * contentAudioText.
         */
        public Builder contentAudioText(String contentAudioText) {
            this.contentAudioText = contentAudioText;
            return this;
        }

        /**
         * contentAudioUrls.
         */
        public Builder contentAudioUrls(String contentAudioUrls) {
            this.contentAudioUrls = contentAudioUrls;
            return this;
        }

        /**
         * contentImageText.
         */
        public Builder contentImageText(String contentImageText) {
            this.contentImageText = contentImageText;
            return this;
        }

        /**
         * contentImageUrls.
         */
        public Builder contentImageUrls(String contentImageUrls) {
            this.contentImageUrls = contentImageUrls;
            return this;
        }

        /**
         * contentLang.
         */
        public Builder contentLang(String contentLang) {
            this.contentLang = contentLang;
            return this;
        }

        /**
         * contentLen.
         */
        public Builder contentLen(Long contentLen) {
            this.contentLen = contentLen;
            return this;
        }

        /**
         * contentVideoText.
         */
        public Builder contentVideoText(String contentVideoText) {
            this.contentVideoText = contentVideoText;
            return this;
        }

        /**
         * contentVideoUrls.
         */
        public Builder contentVideoUrls(String contentVideoUrls) {
            this.contentVideoUrls = contentVideoUrls;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * docAnswersCount.
         */
        public Builder docAnswersCount(Long docAnswersCount) {
            this.docAnswersCount = docAnswersCount;
            return this;
        }

        /**
         * docAreas.
         */
        public Builder docAreas(java.util.List < String > docAreas) {
            this.docAreas = docAreas;
            return this;
        }

        /**
         * docCoinCount.
         */
        public Builder docCoinCount(Long docCoinCount) {
            this.docCoinCount = docCoinCount;
            return this;
        }

        /**
         * docCommentsCount.
         */
        public Builder docCommentsCount(Long docCommentsCount) {
            this.docCommentsCount = docCommentsCount;
            return this;
        }

        /**
         * docContent.
         */
        public Builder docContent(String docContent) {
            this.docContent = docContent;
            return this;
        }

        /**
         * docContentBrief.
         */
        public Builder docContentBrief(String docContentBrief) {
            this.docContentBrief = docContentBrief;
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
         * docId.
         */
        public Builder docId(String docId) {
            this.docId = docId;
            return this;
        }

        /**
         * docLikesCount.
         */
        public Builder docLikesCount(Long docLikesCount) {
            this.docLikesCount = docLikesCount;
            return this;
        }

        /**
         * docPlayCount.
         */
        public Builder docPlayCount(Long docPlayCount) {
            this.docPlayCount = docPlayCount;
            return this;
        }

        /**
         * docReadingCount.
         */
        public Builder docReadingCount(Long docReadingCount) {
            this.docReadingCount = docReadingCount;
            return this;
        }

        /**
         * docReadsCount.
         */
        public Builder docReadsCount(Long docReadsCount) {
            this.docReadsCount = docReadsCount;
            return this;
        }

        /**
         * docRepostsCount.
         */
        public Builder docRepostsCount(Long docRepostsCount) {
            this.docRepostsCount = docRepostsCount;
            return this;
        }

        /**
         * docReprintName.
         */
        public Builder docReprintName(String docReprintName) {
            this.docReprintName = docReprintName;
            return this;
        }

        /**
         * docSelfContentSign.
         */
        public Builder docSelfContentSign(String docSelfContentSign) {
            this.docSelfContentSign = docSelfContentSign;
            return this;
        }

        /**
         * docTitle.
         */
        public Builder docTitle(String docTitle) {
            this.docTitle = docTitle;
            return this;
        }

        /**
         * docUrl.
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }

        /**
         * emotionScore.
         */
        public Builder emotionScore(Double emotionScore) {
            this.emotionScore = emotionScore;
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
         * extInfo.
         */
        public Builder extInfo(java.util.Map < String, String > extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * finEventCount.
         */
        public Builder finEventCount(Integer finEventCount) {
            this.finEventCount = finEventCount;
            return this;
        }

        /**
         * financeEventList.
         */
        public Builder financeEventList(java.util.List < YuqingFinanceEvent > financeEventList) {
            this.financeEventList = financeEventList;
            return this;
        }

        /**
         * highlightKeywords.
         */
        public Builder highlightKeywords(java.util.List < String > highlightKeywords) {
            this.highlightKeywords = highlightKeywords;
            return this;
        }

        /**
         * imageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * influenceScore.
         */
        public Builder influenceScore(Double influenceScore) {
            this.influenceScore = influenceScore;
            return this;
        }

        /**
         * mediaHosts.
         */
        public Builder mediaHosts(java.util.List < String > mediaHosts) {
            this.mediaHosts = mediaHosts;
            return this;
        }

        /**
         * mediaInfluenceLevel.
         */
        public Builder mediaInfluenceLevel(Integer mediaInfluenceLevel) {
            this.mediaInfluenceLevel = mediaInfluenceLevel;
            return this;
        }

        /**
         * mediaName.
         */
        public Builder mediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }

        /**
         * mediaPropagationLevel.
         */
        public Builder mediaPropagationLevel(Integer mediaPropagationLevel) {
            this.mediaPropagationLevel = mediaPropagationLevel;
            return this;
        }

        /**
         * mediaType.
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * messageType.
         */
        public Builder messageType(String messageType) {
            this.messageType = messageType;
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
         * propagationScore.
         */
        public Builder propagationScore(Double propagationScore) {
            this.propagationScore = propagationScore;
            return this;
        }

        /**
         * publishTime.
         */
        public Builder publishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * relevanceScore.
         */
        public Builder relevanceScore(Double relevanceScore) {
            this.relevanceScore = relevanceScore;
            return this;
        }

        /**
         * reportMaterialTags.
         */
        public Builder reportMaterialTags(java.util.List < String > reportMaterialTags) {
            this.reportMaterialTags = reportMaterialTags;
            return this;
        }

        /**
         * repostList.
         */
        public Builder repostList(java.util.List < String > repostList) {
            this.repostList = repostList;
            return this;
        }

        /**
         * similarNumber.
         */
        public Builder similarNumber(Integer similarNumber) {
            this.similarNumber = similarNumber;
            return this;
        }

        /**
         * topics.
         */
        public Builder topics(java.util.List < String > topics) {
            this.topics = topics;
            return this;
        }

        /**
         * videoCount.
         */
        public Builder videoCount(Integer videoCount) {
            this.videoCount = videoCount;
            return this;
        }

        /**
         * weiboCommentId.
         */
        public Builder weiboCommentId(String weiboCommentId) {
            this.weiboCommentId = weiboCommentId;
            return this;
        }

        /**
         * weiboMid.
         */
        public Builder weiboMid(String weiboMid) {
            this.weiboMid = weiboMid;
            return this;
        }

        public YuqingMessage build() {
            return new YuqingMessage(this);
        } 

    } 

}
