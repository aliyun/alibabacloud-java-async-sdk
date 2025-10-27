// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyBrowserInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyBrowserInstanceGroupRequest</p>
 */
public class ModifyBrowserInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserConfig")
    private BrowserConfig browserConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String browserInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudBrowserName")
    private String cloudBrowserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private Network network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timers")
    private java.util.List<Timers> timers;

    private ModifyBrowserInstanceGroupRequest(Builder builder) {
        super(builder);
        this.browserConfig = builder.browserConfig;
        this.browserInstanceGroupId = builder.browserInstanceGroupId;
        this.cloudBrowserName = builder.cloudBrowserName;
        this.network = builder.network;
        this.policy = builder.policy;
        this.timers = builder.timers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBrowserInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserConfig
     */
    public BrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    /**
     * @return browserInstanceGroupId
     */
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    /**
     * @return cloudBrowserName
     */
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    /**
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return timers
     */
    public java.util.List<Timers> getTimers() {
        return this.timers;
    }

    public static final class Builder extends Request.Builder<ModifyBrowserInstanceGroupRequest, Builder> {
        private BrowserConfig browserConfig; 
        private String browserInstanceGroupId; 
        private String cloudBrowserName; 
        private Network network; 
        private Policy policy; 
        private java.util.List<Timers> timers; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBrowserInstanceGroupRequest request) {
            super(request);
            this.browserConfig = request.browserConfig;
            this.browserInstanceGroupId = request.browserInstanceGroupId;
            this.cloudBrowserName = request.cloudBrowserName;
            this.network = request.network;
            this.policy = request.policy;
            this.timers = request.timers;
        } 

        /**
         * BrowserConfig.
         */
        public Builder browserConfig(BrowserConfig browserConfig) {
            String browserConfigShrink = shrink(browserConfig, "BrowserConfig", "json");
            this.putQueryParameter("BrowserConfig", browserConfigShrink);
            this.browserConfig = browserConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0bz55ixxxxx9xi9w9</p>
         */
        public Builder browserInstanceGroupId(String browserInstanceGroupId) {
            this.putQueryParameter("BrowserInstanceGroupId", browserInstanceGroupId);
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }

        /**
         * CloudBrowserName.
         */
        public Builder cloudBrowserName(String cloudBrowserName) {
            this.putBodyParameter("CloudBrowserName", cloudBrowserName);
            this.cloudBrowserName = cloudBrowserName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putQueryParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * Timers.
         */
        public Builder timers(java.util.List<Timers> timers) {
            String timersShrink = shrink(timers, "Timers", "json");
            this.putQueryParameter("Timers", timersShrink);
            this.timers = timers;
            return this;
        }

        @Override
        public ModifyBrowserInstanceGroupRequest build() {
            return new ModifyBrowserInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class Bookmarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BookmarkFolder")
        private String bookmarkFolder;

        @com.aliyun.core.annotation.NameInMap("BookmarkId")
        private String bookmarkId;

        @com.aliyun.core.annotation.NameInMap("BookmarkName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bookmarkName;

        @com.aliyun.core.annotation.NameInMap("BookmarkURL")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bookmarkURL;

        private Bookmarks(Builder builder) {
            this.bookmarkFolder = builder.bookmarkFolder;
            this.bookmarkId = builder.bookmarkId;
            this.bookmarkName = builder.bookmarkName;
            this.bookmarkURL = builder.bookmarkURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bookmarks create() {
            return builder().build();
        }

        /**
         * @return bookmarkFolder
         */
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        /**
         * @return bookmarkId
         */
        public String getBookmarkId() {
            return this.bookmarkId;
        }

        /**
         * @return bookmarkName
         */
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        /**
         * @return bookmarkURL
         */
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

        public static final class Builder {
            private String bookmarkFolder; 
            private String bookmarkId; 
            private String bookmarkName; 
            private String bookmarkURL; 

            private Builder() {
            } 

            private Builder(Bookmarks model) {
                this.bookmarkFolder = model.bookmarkFolder;
                this.bookmarkId = model.bookmarkId;
                this.bookmarkName = model.bookmarkName;
                this.bookmarkURL = model.bookmarkURL;
            } 

            /**
             * BookmarkFolder.
             */
            public Builder bookmarkFolder(String bookmarkFolder) {
                this.bookmarkFolder = bookmarkFolder;
                return this;
            }

            /**
             * BookmarkId.
             */
            public Builder bookmarkId(String bookmarkId) {
                this.bookmarkId = bookmarkId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bookmarkName(String bookmarkName) {
                this.bookmarkName = bookmarkName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder bookmarkURL(String bookmarkURL) {
                this.bookmarkURL = bookmarkURL;
                return this;
            }

            public Bookmarks build() {
                return new Bookmarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class BrowserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bookmarks")
        private java.util.List<Bookmarks> bookmarks;

        @com.aliyun.core.annotation.NameInMap("BrowserParam")
        private String browserParam;

        @com.aliyun.core.annotation.NameInMap("Homepage")
        private String homepage;

        @com.aliyun.core.annotation.NameInMap("RemoveBookmarks")
        private java.util.List<String> removeBookmarks;

        private BrowserConfig(Builder builder) {
            this.bookmarks = builder.bookmarks;
            this.browserParam = builder.browserParam;
            this.homepage = builder.homepage;
            this.removeBookmarks = builder.removeBookmarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserConfig create() {
            return builder().build();
        }

        /**
         * @return bookmarks
         */
        public java.util.List<Bookmarks> getBookmarks() {
            return this.bookmarks;
        }

        /**
         * @return browserParam
         */
        public String getBrowserParam() {
            return this.browserParam;
        }

        /**
         * @return homepage
         */
        public String getHomepage() {
            return this.homepage;
        }

        /**
         * @return removeBookmarks
         */
        public java.util.List<String> getRemoveBookmarks() {
            return this.removeBookmarks;
        }

        public static final class Builder {
            private java.util.List<Bookmarks> bookmarks; 
            private String browserParam; 
            private String homepage; 
            private java.util.List<String> removeBookmarks; 

            private Builder() {
            } 

            private Builder(BrowserConfig model) {
                this.bookmarks = model.bookmarks;
                this.browserParam = model.browserParam;
                this.homepage = model.homepage;
                this.removeBookmarks = model.removeBookmarks;
            } 

            /**
             * Bookmarks.
             */
            public Builder bookmarks(java.util.List<Bookmarks> bookmarks) {
                this.bookmarks = bookmarks;
                return this;
            }

            /**
             * BrowserParam.
             */
            public Builder browserParam(String browserParam) {
                this.browserParam = browserParam;
                return this;
            }

            /**
             * Homepage.
             */
            public Builder homepage(String homepage) {
                this.homepage = homepage;
                return this;
            }

            /**
             * RemoveBookmarks.
             */
            public Builder removeBookmarks(java.util.List<String> removeBookmarks) {
                this.removeBookmarks = removeBookmarks;
                return this;
            }

            public BrowserConfig build() {
                return new BrowserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class RestrictedURLs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestrictedURLId")
        private String restrictedURLId;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private RestrictedURLs(Builder builder) {
            this.restrictedURLId = builder.restrictedURLId;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestrictedURLs create() {
            return builder().build();
        }

        /**
         * @return restrictedURLId
         */
        public String getRestrictedURLId() {
            return this.restrictedURLId;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String restrictedURLId; 
            private String URL; 

            private Builder() {
            } 

            private Builder(RestrictedURLs model) {
                this.restrictedURLId = model.restrictedURLId;
                this.URL = model.URL;
            } 

            /**
             * RestrictedURLId.
             */
            public Builder restrictedURLId(String restrictedURLId) {
                this.restrictedURLId = restrictedURLId;
                return this;
            }

            /**
             * URL.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public RestrictedURLs build() {
                return new RestrictedURLs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRestriction")
        private String accessRestriction;

        @com.aliyun.core.annotation.NameInMap("RemoveRestrictedURLIds")
        private java.util.List<String> removeRestrictedURLIds;

        @com.aliyun.core.annotation.NameInMap("RestrictedURLs")
        private java.util.List<RestrictedURLs> restrictedURLs;

        private Network(Builder builder) {
            this.accessRestriction = builder.accessRestriction;
            this.removeRestrictedURLIds = builder.removeRestrictedURLIds;
            this.restrictedURLs = builder.restrictedURLs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessRestriction
         */
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        /**
         * @return removeRestrictedURLIds
         */
        public java.util.List<String> getRemoveRestrictedURLIds() {
            return this.removeRestrictedURLIds;
        }

        /**
         * @return restrictedURLs
         */
        public java.util.List<RestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        public static final class Builder {
            private String accessRestriction; 
            private java.util.List<String> removeRestrictedURLIds; 
            private java.util.List<RestrictedURLs> restrictedURLs; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessRestriction = model.accessRestriction;
                this.removeRestrictedURLIds = model.removeRestrictedURLIds;
                this.restrictedURLs = model.restrictedURLs;
            } 

            /**
             * AccessRestriction.
             */
            public Builder accessRestriction(String accessRestriction) {
                this.accessRestriction = accessRestriction;
                return this;
            }

            /**
             * RemoveRestrictedURLIds.
             */
            public Builder removeRestrictedURLIds(java.util.List<String> removeRestrictedURLIds) {
                this.removeRestrictedURLIds = removeRestrictedURLIds;
                return this;
            }

            /**
             * RestrictedURLs.
             */
            public Builder restrictedURLs(java.util.List<RestrictedURLs> restrictedURLs) {
                this.restrictedURLs = restrictedURLs;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class ClipboardPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ClipboardReadLimit")
        private Integer clipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("ClipboardScope")
        private String clipboardScope;

        @com.aliyun.core.annotation.NameInMap("ClipboardWriteLimit")
        private Integer clipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("FileClipboard")
        private String fileClipboard;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboard")
        private String richTextClipboard;

        @com.aliyun.core.annotation.NameInMap("TextClipboard")
        private String textClipboard;

        private ClipboardPolicy(Builder builder) {
            this.clipboard = builder.clipboard;
            this.clipboardReadLimit = builder.clipboardReadLimit;
            this.clipboardScope = builder.clipboardScope;
            this.clipboardWriteLimit = builder.clipboardWriteLimit;
            this.fileClipboard = builder.fileClipboard;
            this.richTextClipboard = builder.richTextClipboard;
            this.textClipboard = builder.textClipboard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipboardPolicy create() {
            return builder().build();
        }

        /**
         * @return clipboard
         */
        public String getClipboard() {
            return this.clipboard;
        }

        /**
         * @return clipboardReadLimit
         */
        public Integer getClipboardReadLimit() {
            return this.clipboardReadLimit;
        }

        /**
         * @return clipboardScope
         */
        public String getClipboardScope() {
            return this.clipboardScope;
        }

        /**
         * @return clipboardWriteLimit
         */
        public Integer getClipboardWriteLimit() {
            return this.clipboardWriteLimit;
        }

        /**
         * @return fileClipboard
         */
        public String getFileClipboard() {
            return this.fileClipboard;
        }

        /**
         * @return richTextClipboard
         */
        public String getRichTextClipboard() {
            return this.richTextClipboard;
        }

        /**
         * @return textClipboard
         */
        public String getTextClipboard() {
            return this.textClipboard;
        }

        public static final class Builder {
            private String clipboard; 
            private Integer clipboardReadLimit; 
            private String clipboardScope; 
            private Integer clipboardWriteLimit; 
            private String fileClipboard; 
            private String richTextClipboard; 
            private String textClipboard; 

            private Builder() {
            } 

            private Builder(ClipboardPolicy model) {
                this.clipboard = model.clipboard;
                this.clipboardReadLimit = model.clipboardReadLimit;
                this.clipboardScope = model.clipboardScope;
                this.clipboardWriteLimit = model.clipboardWriteLimit;
                this.fileClipboard = model.fileClipboard;
                this.richTextClipboard = model.richTextClipboard;
                this.textClipboard = model.textClipboard;
            } 

            /**
             * Clipboard.
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * ClipboardReadLimit.
             */
            public Builder clipboardReadLimit(Integer clipboardReadLimit) {
                this.clipboardReadLimit = clipboardReadLimit;
                return this;
            }

            /**
             * ClipboardScope.
             */
            public Builder clipboardScope(String clipboardScope) {
                this.clipboardScope = clipboardScope;
                return this;
            }

            /**
             * ClipboardWriteLimit.
             */
            public Builder clipboardWriteLimit(Integer clipboardWriteLimit) {
                this.clipboardWriteLimit = clipboardWriteLimit;
                return this;
            }

            /**
             * FileClipboard.
             */
            public Builder fileClipboard(String fileClipboard) {
                this.fileClipboard = fileClipboard;
                return this;
            }

            /**
             * RichTextClipboard.
             */
            public Builder richTextClipboard(String richTextClipboard) {
                this.richTextClipboard = richTextClipboard;
                return this;
            }

            /**
             * TextClipboard.
             */
            public Builder textClipboard(String textClipboard) {
                this.textClipboard = textClipboard;
                return this;
            }

            public ClipboardPolicy build() {
                return new ClipboardPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class VideoPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        private VideoPolicy(Builder builder) {
            this.frameRate = builder.frameRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPolicy create() {
            return builder().build();
        }

        /**
         * @return frameRate
         */
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public static final class Builder {
            private Integer frameRate; 

            private Builder() {
            } 

            private Builder(VideoPolicy model) {
                this.frameRate = model.frameRate;
            } 

            /**
             * FrameRate.
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            public VideoPolicy build() {
                return new VideoPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class WatermarkPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WatermarkSwitch")
        private String watermarkSwitch;

        @com.aliyun.core.annotation.NameInMap("WatermarkTypes")
        private java.util.List<String> watermarkTypes;

        private WatermarkPolicy(Builder builder) {
            this.watermarkSwitch = builder.watermarkSwitch;
            this.watermarkTypes = builder.watermarkTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkPolicy create() {
            return builder().build();
        }

        /**
         * @return watermarkSwitch
         */
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        /**
         * @return watermarkTypes
         */
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

        public static final class Builder {
            private String watermarkSwitch; 
            private java.util.List<String> watermarkTypes; 

            private Builder() {
            } 

            private Builder(WatermarkPolicy model) {
                this.watermarkSwitch = model.watermarkSwitch;
                this.watermarkTypes = model.watermarkTypes;
            } 

            /**
             * WatermarkSwitch.
             */
            public Builder watermarkSwitch(String watermarkSwitch) {
                this.watermarkSwitch = watermarkSwitch;
                return this;
            }

            /**
             * WatermarkTypes.
             */
            public Builder watermarkTypes(java.util.List<String> watermarkTypes) {
                this.watermarkTypes = watermarkTypes;
                return this;
            }

            public WatermarkPolicy build() {
                return new WatermarkPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipboardPolicy")
        private ClipboardPolicy clipboardPolicy;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSession")
        private String disconnectKeepSession;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSessionTime")
        private Integer disconnectKeepSessionTime;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        @com.aliyun.core.annotation.NameInMap("VideoPolicy")
        private VideoPolicy videoPolicy;

        @com.aliyun.core.annotation.NameInMap("WatermarkPolicy")
        private WatermarkPolicy watermarkPolicy;

        private Policy(Builder builder) {
            this.clipboardPolicy = builder.clipboardPolicy;
            this.disconnectKeepSession = builder.disconnectKeepSession;
            this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.policyId = builder.policyId;
            this.policyVersion = builder.policyVersion;
            this.videoPolicy = builder.videoPolicy;
            this.watermarkPolicy = builder.watermarkPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return clipboardPolicy
         */
        public ClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        /**
         * @return disconnectKeepSession
         */
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        /**
         * @return disconnectKeepSessionTime
         */
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        /**
         * @return html5FileTransfer
         */
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return videoPolicy
         */
        public VideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        /**
         * @return watermarkPolicy
         */
        public WatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

        public static final class Builder {
            private ClipboardPolicy clipboardPolicy; 
            private String disconnectKeepSession; 
            private Integer disconnectKeepSessionTime; 
            private String html5FileTransfer; 
            private String policyId; 
            private String policyVersion; 
            private VideoPolicy videoPolicy; 
            private WatermarkPolicy watermarkPolicy; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.clipboardPolicy = model.clipboardPolicy;
                this.disconnectKeepSession = model.disconnectKeepSession;
                this.disconnectKeepSessionTime = model.disconnectKeepSessionTime;
                this.html5FileTransfer = model.html5FileTransfer;
                this.policyId = model.policyId;
                this.policyVersion = model.policyVersion;
                this.videoPolicy = model.videoPolicy;
                this.watermarkPolicy = model.watermarkPolicy;
            } 

            /**
             * ClipboardPolicy.
             */
            public Builder clipboardPolicy(ClipboardPolicy clipboardPolicy) {
                this.clipboardPolicy = clipboardPolicy;
                return this;
            }

            /**
             * DisconnectKeepSession.
             */
            public Builder disconnectKeepSession(String disconnectKeepSession) {
                this.disconnectKeepSession = disconnectKeepSession;
                return this;
            }

            /**
             * DisconnectKeepSessionTime.
             */
            public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
                this.disconnectKeepSessionTime = disconnectKeepSessionTime;
                return this;
            }

            /**
             * Html5FileTransfer.
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyVersion.
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * VideoPolicy.
             */
            public Builder videoPolicy(VideoPolicy videoPolicy) {
                this.videoPolicy = videoPolicy;
                return this;
            }

            /**
             * WatermarkPolicy.
             */
            public Builder watermarkPolicy(WatermarkPolicy watermarkPolicy) {
                this.watermarkPolicy = watermarkPolicy;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyBrowserInstanceGroupRequest</p>
     */
    public static class Timers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private Timers(Builder builder) {
            this.interval = builder.interval;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timers create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private Integer interval; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(Timers model) {
                this.interval = model.interval;
                this.timerType = model.timerType;
            } 

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * TimerType.
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public Timers build() {
                return new Timers(this);
            } 

        } 

    }
}
