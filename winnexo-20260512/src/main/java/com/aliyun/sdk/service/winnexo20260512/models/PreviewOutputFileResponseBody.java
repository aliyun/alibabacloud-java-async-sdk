// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreviewOutputFileResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewOutputFileResponseBody</p>
 */
public class PreviewOutputFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("degraded")
    private Boolean degraded;

    @com.aliyun.core.annotation.NameInMap("downloadExpiresAt")
    private String downloadExpiresAt;

    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("fileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("itemName")
    private String itemName;

    @com.aliyun.core.annotation.NameInMap("itemType")
    private String itemType;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("outputItemId")
    private String outputItemId;

    @com.aliyun.core.annotation.NameInMap("previewExpiresAt")
    private String previewExpiresAt;

    @com.aliyun.core.annotation.NameInMap("previewType")
    private String previewType;

    @com.aliyun.core.annotation.NameInMap("previewUrl")
    private String previewUrl;

    @com.aliyun.core.annotation.NameInMap("readState")
    private String readState;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("slides")
    private java.util.List<Slides> slides;

    @com.aliyun.core.annotation.NameInMap("unavailableReason")
    private String unavailableReason;

    @com.aliyun.core.annotation.NameInMap("version")
    private Version version;

    private PreviewOutputFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.degraded = builder.degraded;
        this.downloadExpiresAt = builder.downloadExpiresAt;
        this.downloadUrl = builder.downloadUrl;
        this.fileExt = builder.fileExt;
        this.gmtModified = builder.gmtModified;
        this.itemName = builder.itemName;
        this.itemType = builder.itemType;
        this.message = builder.message;
        this.outputItemId = builder.outputItemId;
        this.previewExpiresAt = builder.previewExpiresAt;
        this.previewType = builder.previewType;
        this.previewUrl = builder.previewUrl;
        this.readState = builder.readState;
        this.requestId = builder.requestId;
        this.slides = builder.slides;
        this.unavailableReason = builder.unavailableReason;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewOutputFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return degraded
     */
    public Boolean getDegraded() {
        return this.degraded;
    }

    /**
     * @return downloadExpiresAt
     */
    public String getDownloadExpiresAt() {
        return this.downloadExpiresAt;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outputItemId
     */
    public String getOutputItemId() {
        return this.outputItemId;
    }

    /**
     * @return previewExpiresAt
     */
    public String getPreviewExpiresAt() {
        return this.previewExpiresAt;
    }

    /**
     * @return previewType
     */
    public String getPreviewType() {
        return this.previewType;
    }

    /**
     * @return previewUrl
     */
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * @return readState
     */
    public String getReadState() {
        return this.readState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slides
     */
    public java.util.List<Slides> getSlides() {
        return this.slides;
    }

    /**
     * @return unavailableReason
     */
    public String getUnavailableReason() {
        return this.unavailableReason;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private Boolean degraded; 
        private String downloadExpiresAt; 
        private String downloadUrl; 
        private String fileExt; 
        private String gmtModified; 
        private String itemName; 
        private String itemType; 
        private String message; 
        private String outputItemId; 
        private String previewExpiresAt; 
        private String previewType; 
        private String previewUrl; 
        private String readState; 
        private String requestId; 
        private java.util.List<Slides> slides; 
        private String unavailableReason; 
        private Version version; 

        private Builder() {
        } 

        private Builder(PreviewOutputFileResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.degraded = model.degraded;
            this.downloadExpiresAt = model.downloadExpiresAt;
            this.downloadUrl = model.downloadUrl;
            this.fileExt = model.fileExt;
            this.gmtModified = model.gmtModified;
            this.itemName = model.itemName;
            this.itemType = model.itemType;
            this.message = model.message;
            this.outputItemId = model.outputItemId;
            this.previewExpiresAt = model.previewExpiresAt;
            this.previewType = model.previewType;
            this.previewUrl = model.previewUrl;
            this.readState = model.readState;
            this.requestId = model.requestId;
            this.slides = model.slides;
            this.unavailableReason = model.unavailableReason;
            this.version = model.version;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The text content. This parameter is used for the CONTENT type.</p>
         * 
         * <strong>example:</strong>
         * <h1>Quarterly Review</h1>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Indicates whether the preview is degraded to a download. A value of true indicates that the preview is degraded to a download and cannot be opened in an online previewer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder degraded(Boolean degraded) {
            this.degraded = degraded;
            return this;
        }

        /**
         * <p>The expiration time of the download ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T14:00:00+00:00</p>
         */
        public Builder downloadExpiresAt(String downloadExpiresAt) {
            this.downloadExpiresAt = downloadExpiresAt;
            return this;
        }

        /**
         * <p>The short-term signed download URL for the output. You can send a GET request to this URL before it expires.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/download/file">https://example.com/download/file</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The file name extension. This parameter is used for the OSS_IMM type.</p>
         * 
         * <strong>example:</strong>
         * <p>pptx</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>The modification time in ISO8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T13:00:00+00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly_Review.pptx</p>
         */
        public Builder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        /**
         * <p>The output item type. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>ppt</p>
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid request parameters</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The output item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputItemId</p>
         */
        public Builder outputItemId(String outputItemId) {
            this.outputItemId = outputItemId;
            return this;
        }

        /**
         * <p>The expiration time of the preview ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-16T14:00:00+00:00</p>
         */
        public Builder previewExpiresAt(String previewExpiresAt) {
            this.previewExpiresAt = previewExpiresAt;
            return this;
        }

        /**
         * <p>The preview type. Valid values: OSS_IMM, IMAGE, AUDIO, VIDEO, HTML, DING_TALK, VOICE_MEETING, and CONTENT.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS_IMM</p>
         */
        public Builder previewType(String previewType) {
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>The preview URL. This parameter is used for OSS_IMM, DING_TALK, and VOICE_MEETING.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>The read state. Valid values: AVAILABLE, PRUNED, PENDING, and UNVERSIONED.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder readState(String readState) {
            this.readState = readState;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of slides for the slide deck output.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder slides(java.util.List<Slides> slides) {
            this.slides = slides;
            return this;
        }

        /**
         * <p>The reason why the content is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>The output content is still being generated</p>
         */
        public Builder unavailableReason(String unavailableReason) {
            this.unavailableReason = unavailableReason;
            return this;
        }

        /**
         * <p>The optimistic version number.</p>
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public PreviewOutputFileResponseBody build() {
            return new PreviewOutputFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewOutputFileResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewOutputFileResponseBody</p>
     */
    public static class Slides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayText")
        private String displayText;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("slideId")
        private String slideId;

        @com.aliyun.core.annotation.NameInMap("slideIndex")
        private Long slideIndex;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Slides(Builder builder) {
            this.displayText = builder.displayText;
            this.imageUrl = builder.imageUrl;
            this.slideId = builder.slideId;
            this.slideIndex = builder.slideIndex;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slides create() {
            return builder().build();
        }

        /**
         * @return displayText
         */
        public String getDisplayText() {
            return this.displayText;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return slideId
         */
        public String getSlideId() {
            return this.slideId;
        }

        /**
         * @return slideIndex
         */
        public Long getSlideIndex() {
            return this.slideIndex;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String displayText; 
            private String imageUrl; 
            private String slideId; 
            private Long slideIndex; 
            private String status; 

            private Builder() {
            } 

            private Builder(Slides model) {
                this.displayText = model.displayText;
                this.imageUrl = model.imageUrl;
                this.slideId = model.slideId;
                this.slideIndex = model.slideIndex;
                this.status = model.status;
            } 

            /**
             * <p>The display text of the slide.</p>
             * 
             * <strong>example:</strong>
             * <p>Market Overview</p>
             */
            public Builder displayText(String displayText) {
                this.displayText = displayText;
                return this;
            }

            /**
             * <p>Specifies the detail level of the image. Valid values: low, high, and auto. Default value: auto.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/slide/1">https://example.com/slide/1</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The slide ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSlideId</p>
             */
            public Builder slideId(String slideId) {
                this.slideId = slideId;
                return this;
            }

            /**
             * <p>The slide order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder slideIndex(Long slideIndex) {
                this.slideIndex = slideIndex;
                return this;
            }

            /**
             * <p>The signing status. Valid values:</p>
             * <ul>
             * <li>CREATED: created but not signed</li>
             * <li>SUCCESS: signed successfully</li>
             * <li>STOP: terminated</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Slides build() {
                return new Slides(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewOutputFileResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewOutputFileResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("canBrowserOpen")
        private Boolean canBrowserOpen;

        @com.aliyun.core.annotation.NameInMap("canDownload")
        private Boolean canDownload;

        @com.aliyun.core.annotation.NameInMap("canEdit")
        private Boolean canEdit;

        @com.aliyun.core.annotation.NameInMap("canRestore")
        private Boolean canRestore;

        @com.aliyun.core.annotation.NameInMap("canSaveAsKnowledge")
        private Boolean canSaveAsKnowledge;

        @com.aliyun.core.annotation.NameInMap("canShare")
        private Boolean canShare;

        private Capabilities(Builder builder) {
            this.canBrowserOpen = builder.canBrowserOpen;
            this.canDownload = builder.canDownload;
            this.canEdit = builder.canEdit;
            this.canRestore = builder.canRestore;
            this.canSaveAsKnowledge = builder.canSaveAsKnowledge;
            this.canShare = builder.canShare;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return canBrowserOpen
         */
        public Boolean getCanBrowserOpen() {
            return this.canBrowserOpen;
        }

        /**
         * @return canDownload
         */
        public Boolean getCanDownload() {
            return this.canDownload;
        }

        /**
         * @return canEdit
         */
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        /**
         * @return canRestore
         */
        public Boolean getCanRestore() {
            return this.canRestore;
        }

        /**
         * @return canSaveAsKnowledge
         */
        public Boolean getCanSaveAsKnowledge() {
            return this.canSaveAsKnowledge;
        }

        /**
         * @return canShare
         */
        public Boolean getCanShare() {
            return this.canShare;
        }

        public static final class Builder {
            private Boolean canBrowserOpen; 
            private Boolean canDownload; 
            private Boolean canEdit; 
            private Boolean canRestore; 
            private Boolean canSaveAsKnowledge; 
            private Boolean canShare; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.canBrowserOpen = model.canBrowserOpen;
                this.canDownload = model.canDownload;
                this.canEdit = model.canEdit;
                this.canRestore = model.canRestore;
                this.canSaveAsKnowledge = model.canSaveAsKnowledge;
                this.canShare = model.canShare;
            } 

            /**
             * <p>Indicates whether the version can be opened in a browser.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canBrowserOpen(Boolean canBrowserOpen) {
                this.canBrowserOpen = canBrowserOpen;
                return this;
            }

            /**
             * <p>Indicates whether the version can be downloaded.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canDownload(Boolean canDownload) {
                this.canDownload = canDownload;
                return this;
            }

            /**
             * <p>Indicates whether the course can be edited or deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * <p>Indicates whether the version can be restored to the latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canRestore(Boolean canRestore) {
                this.canRestore = canRestore;
                return this;
            }

            /**
             * <p>Indicates whether the version can be saved as knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canSaveAsKnowledge(Boolean canSaveAsKnowledge) {
                this.canSaveAsKnowledge = canSaveAsKnowledge;
                return this;
            }

            /**
             * <p>Indicates whether the version can be shared.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canShare(Boolean canShare) {
                this.canShare = canShare;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewOutputFileResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewOutputFileResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("availability")
        private String availability;

        @com.aliyun.core.annotation.NameInMap("capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("contentRevision")
        private Long contentRevision;

        @com.aliyun.core.annotation.NameInMap("isLatest")
        private Boolean isLatest;

        @com.aliyun.core.annotation.NameInMap("latestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("readState")
        private String readState;

        @com.aliyun.core.annotation.NameInMap("selectedVersionId")
        private String selectedVersionId;

        @com.aliyun.core.annotation.NameInMap("sourceMessageId")
        private String sourceMessageId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("versionNo")
        private Long versionNo;

        private Version(Builder builder) {
            this.availability = builder.availability;
            this.capabilities = builder.capabilities;
            this.contentRevision = builder.contentRevision;
            this.isLatest = builder.isLatest;
            this.latestVersionId = builder.latestVersionId;
            this.readState = builder.readState;
            this.selectedVersionId = builder.selectedVersionId;
            this.sourceMessageId = builder.sourceMessageId;
            this.updatedAt = builder.updatedAt;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return availability
         */
        public String getAvailability() {
            return this.availability;
        }

        /**
         * @return capabilities
         */
        public Capabilities getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return contentRevision
         */
        public Long getContentRevision() {
            return this.contentRevision;
        }

        /**
         * @return isLatest
         */
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        /**
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return readState
         */
        public String getReadState() {
            return this.readState;
        }

        /**
         * @return selectedVersionId
         */
        public String getSelectedVersionId() {
            return this.selectedVersionId;
        }

        /**
         * @return sourceMessageId
         */
        public String getSourceMessageId() {
            return this.sourceMessageId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return versionNo
         */
        public Long getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private String availability; 
            private Capabilities capabilities; 
            private Long contentRevision; 
            private Boolean isLatest; 
            private String latestVersionId; 
            private String readState; 
            private String selectedVersionId; 
            private String sourceMessageId; 
            private String updatedAt; 
            private Long versionNo; 

            private Builder() {
            } 

            private Builder(Version model) {
                this.availability = model.availability;
                this.capabilities = model.capabilities;
                this.contentRevision = model.contentRevision;
                this.isLatest = model.isLatest;
                this.latestVersionId = model.latestVersionId;
                this.readState = model.readState;
                this.selectedVersionId = model.selectedVersionId;
                this.sourceMessageId = model.sourceMessageId;
                this.updatedAt = model.updatedAt;
                this.versionNo = model.versionNo;
            } 

            /**
             * <p>The number of remaining seats.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * <p>Specifies whether the model supports multiple tool calls in a single response.</p>
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The content revision number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentRevision(Long contentRevision) {
                this.contentRevision = contentRevision;
                return this;
            }

            /**
             * <p>Indicates whether the version is the latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLatest(Boolean isLatest) {
                this.isLatest = isLatest;
                return this;
            }

            /**
             * <p>The ID of the current latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleLatestVersionId</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>The read state of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder readState(String readState) {
                this.readState = readState;
                return this;
            }

            /**
             * <p>The ID of the version that is actually read.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleVersionId</p>
             */
            public Builder selectedVersionId(String selectedVersionId) {
                this.selectedVersionId = selectedVersionId;
                return this;
            }

            /**
             * <p>The ID of the message that generated this version.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleMessageId</p>
             */
            public Builder sourceMessageId(String sourceMessageId) {
                this.sourceMessageId = sourceMessageId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-16T13:00:00+00:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The version serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder versionNo(Long versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}
