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
 * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetBrowserInstanceGroupResponseBody</p>
 */
public class GetBrowserInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupModel")
    private BrowserInstanceGroupModel browserInstanceGroupModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBrowserInstanceGroupResponseBody(Builder builder) {
        this.browserInstanceGroupModel = builder.browserInstanceGroupModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBrowserInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserInstanceGroupModel
     */
    public BrowserInstanceGroupModel getBrowserInstanceGroupModel() {
        return this.browserInstanceGroupModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BrowserInstanceGroupModel browserInstanceGroupModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBrowserInstanceGroupResponseBody model) {
            this.browserInstanceGroupModel = model.browserInstanceGroupModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the browser group.</p>
         */
        public Builder browserInstanceGroupModel(BrowserInstanceGroupModel browserInstanceGroupModel) {
            this.browserInstanceGroupModel = browserInstanceGroupModel;
            return this;
        }

        /**
         * <p>The request ID, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBrowserInstanceGroupResponseBody build() {
            return new GetBrowserInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class AuthorizedUserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalUserGroupCount")
        private Integer totalUserGroupCount;

        private AuthorizedUserInfo(Builder builder) {
            this.totalCount = builder.totalCount;
            this.totalUserGroupCount = builder.totalUserGroupCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedUserInfo create() {
            return builder().build();
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalUserGroupCount
         */
        public Integer getTotalUserGroupCount() {
            return this.totalUserGroupCount;
        }

        public static final class Builder {
            private Integer totalCount; 
            private Integer totalUserGroupCount; 

            private Builder() {
            } 

            private Builder(AuthorizedUserInfo model) {
                this.totalCount = model.totalCount;
                this.totalUserGroupCount = model.totalUserGroupCount;
            } 

            /**
             * <p>The total number of authorized users.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of authorized user groups.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalUserGroupCount(Integer totalUserGroupCount) {
                this.totalUserGroupCount = totalUserGroupCount;
                return this;
            }

            public AuthorizedUserInfo build() {
                return new AuthorizedUserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class Bookmarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BookmarkFolder")
        private String bookmarkFolder;

        @com.aliyun.core.annotation.NameInMap("BookmarkId")
        private String bookmarkId;

        @com.aliyun.core.annotation.NameInMap("BookmarkName")
        private String bookmarkName;

        @com.aliyun.core.annotation.NameInMap("BookmarkURL")
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
             * <p>The folder in which the bookmark resides.</p>
             * 
             * <strong>example:</strong>
             * <p>Work Portal</p>
             */
            public Builder bookmarkFolder(String bookmarkFolder) {
                this.bookmarkFolder = bookmarkFolder;
                return this;
            }

            /**
             * <p>The bookmark ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bm-12345</p>
             */
            public Builder bookmarkId(String bookmarkId) {
                this.bookmarkId = bookmarkId;
                return this;
            }

            /**
             * <p>The bookmark name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Official Website</p>
             */
            public Builder bookmarkName(String bookmarkName) {
                this.bookmarkName = bookmarkName;
                return this;
            }

            /**
             * <p>The URL of the bookmark.</p>
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
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class BrowserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bookmarks")
        private java.util.List<Bookmarks> bookmarks;

        @com.aliyun.core.annotation.NameInMap("BrowserParam")
        private String browserParam;

        @com.aliyun.core.annotation.NameInMap("CookiesSync")
        private String cookiesSync;

        @com.aliyun.core.annotation.NameInMap("Homepage")
        private String homepage;

        private BrowserConfig(Builder builder) {
            this.bookmarks = builder.bookmarks;
            this.browserParam = builder.browserParam;
            this.cookiesSync = builder.cookiesSync;
            this.homepage = builder.homepage;
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
         * @return cookiesSync
         */
        public String getCookiesSync() {
            return this.cookiesSync;
        }

        /**
         * @return homepage
         */
        public String getHomepage() {
            return this.homepage;
        }

        public static final class Builder {
            private java.util.List<Bookmarks> bookmarks; 
            private String browserParam; 
            private String cookiesSync; 
            private String homepage; 

            private Builder() {
            } 

            private Builder(BrowserConfig model) {
                this.bookmarks = model.bookmarks;
                this.browserParam = model.browserParam;
                this.cookiesSync = model.cookiesSync;
                this.homepage = model.homepage;
            } 

            /**
             * <p>The list of browser bookmarks. A maximum of 20 entries are returned. To query the complete bookmark list, call <code>ListBrowserBookmarks</code>.</p>
             */
            public Builder bookmarks(java.util.List<Bookmarks> bookmarks) {
                this.bookmarks = bookmarks;
                return this;
            }

            /**
             * <p>The browser startup parameters. For example, <code>--incognito</code> specifies the incognito window mode.</p>
             * 
             * <strong>example:</strong>
             * <p>--incognito</p>
             */
            public Builder browserParam(String browserParam) {
                this.browserParam = browserParam;
                return this;
            }

            /**
             * <p>The cookie synchronization configuration. The string <code>true</code> indicates that synchronization is enabled. The string <code>false</code> indicates that synchronization is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cookiesSync(String cookiesSync) {
                this.cookiesSync = cookiesSync;
                return this;
            }

            /**
             * <p>The homepage URL that opens when the browser starts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder homepage(String homepage) {
                this.homepage = homepage;
                return this;
            }

            public BrowserConfig build() {
                return new BrowserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class Duration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPayStage")
        private String currentPayStage;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Integer totalDuration;

        @com.aliyun.core.annotation.NameInMap("UsedDuration")
        private Integer usedDuration;

        private Duration(Builder builder) {
            this.currentPayStage = builder.currentPayStage;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.totalDuration = builder.totalDuration;
            this.usedDuration = builder.usedDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Duration create() {
            return builder().build();
        }

        /**
         * @return currentPayStage
         */
        public String getCurrentPayStage() {
            return this.currentPayStage;
        }

        /**
         * @return periodEndTime
         */
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        /**
         * @return periodStartTime
         */
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        /**
         * @return totalDuration
         */
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return usedDuration
         */
        public Integer getUsedDuration() {
            return this.usedDuration;
        }

        public static final class Builder {
            private String currentPayStage; 
            private String periodEndTime; 
            private String periodStartTime; 
            private Integer totalDuration; 
            private Integer usedDuration; 

            private Builder() {
            } 

            private Builder(Duration model) {
                this.currentPayStage = model.currentPayStage;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.totalDuration = model.totalDuration;
                this.usedDuration = model.usedDuration;
            } 

            /**
             * <p>The current payment stage of the plan. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder currentPayStage(String currentPayStage) {
                this.currentPayStage = currentPayStage;
                return this;
            }

            /**
             * <p>The end time of the plan period. This field does not apply to MAU scenarios and is not returned.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * <p>The start time of the plan period. This field does not apply to MAU scenarios and is not returned.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * <p>The total duration of the plan, in seconds. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder totalDuration(Integer totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>The used duration of the plan, in seconds. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder usedDuration(Integer usedDuration) {
                this.usedDuration = usedDuration;
                return this;
            }

            public Duration build() {
                return new Duration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
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
             * <p>The ID of the website access restriction entry.</p>
             * 
             * <strong>example:</strong>
             * <p>ru-12345</p>
             */
            public Builder restrictedURLId(String restrictedURLId) {
                this.restrictedURLId = restrictedURLId;
                return this;
            }

            /**
             * <p>The website URL in the access restriction entry.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
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
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRestriction")
        private String accessRestriction;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("RestrictedURLs")
        private java.util.List<RestrictedURLs> restrictedURLs;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Network(Builder builder) {
            this.accessRestriction = builder.accessRestriction;
            this.officeSiteId = builder.officeSiteId;
            this.restrictedURLs = builder.restrictedURLs;
            this.vSwitchIds = builder.vSwitchIds;
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
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return restrictedURLs
         */
        public java.util.List<RestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String accessRestriction; 
            private String officeSiteId; 
            private java.util.List<RestrictedURLs> restrictedURLs; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessRestriction = model.accessRestriction;
                this.officeSiteId = model.officeSiteId;
                this.restrictedURLs = model.restrictedURLs;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The website access restriction mode.</p>
             * <ul>
             * <li><code>ALLOW_ALL</code>: All domain names are allowed.</li>
             * <li><code>ALLOW_LIST</code>: Only websites in the allowlist are allowed.</li>
             * </ul>
             * <p>The returned value reflects the current configuration of the browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW_ALL</p>
             */
            public Builder accessRestriction(String accessRestriction) {
                this.accessRestriction = accessRestriction;
                return this;
            }

            /**
             * <p>The office network ID to which the browser group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-843734****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The website access restriction list. A maximum of 20 entries are returned. To query the complete list, call <code>ListBrowserRestrictedURLs</code>.</p>
             */
            public Builder restrictedURLs(java.util.List<RestrictedURLs> restrictedURLs) {
                this.restrictedURLs = restrictedURLs;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs used by the browser group. This is available for scenarios with custom network configurations.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class NodeInstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        private NodeInstanceType(Builder builder) {
            this.cpu = builder.cpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstanceType create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String cpu; 
            private Integer memory; 

            private Builder() {
            } 

            private Builder(NodeInstanceType model) {
                this.cpu = model.cpu;
                this.memory = model.memory;
            } 

            /**
             * <p>The CPU configuration of the node. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory configuration of the node. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public NodeInstanceType build() {
                return new NodeInstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        private String nodeAmount;

        @com.aliyun.core.annotation.NameInMap("NodeUsed")
        private String nodeUsed;

        private NodePool(Builder builder) {
            this.nodeAmount = builder.nodeAmount;
            this.nodeUsed = builder.nodeUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return nodeAmount
         */
        public String getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeUsed
         */
        public String getNodeUsed() {
            return this.nodeUsed;
        }

        public static final class Builder {
            private String nodeAmount; 
            private String nodeUsed; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.nodeAmount = model.nodeAmount;
                this.nodeUsed = model.nodeUsed;
            } 

            /**
             * <p>The total number of nodes. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder nodeAmount(String nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The number of used nodes. This field does not apply to MAU scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder nodeUsed(String nodeUsed) {
                this.nodeUsed = nodeUsed;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class AuthorizeAccessPolicyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        private AuthorizeAccessPolicyRules(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeAccessPolicyRules create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 
            private String policy; 

            private Builder() {
            } 

            private Builder(AuthorizeAccessPolicyRules model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
                this.policy = model.policy;
            } 

            /**
             * <p>The client source CIDR block that is allowed to access the browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client access rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Office network access</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The action of the client access rule.</p>
             * <ul>
             * <li><code>allow</code>: Access is allowed.</li>
             * <li><code>deny</code>: Access is denied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public AuthorizeAccessPolicyRules build() {
                return new AuthorizeAccessPolicyRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class ClientTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClientTypes(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientTypes create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClientTypes model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The client type.</p>
             * <ul>
             * <li><code>windows</code>: Windows client.</li>
             * <li><code>macos</code>: macOS client.</li>
             * <li><code>html5</code>: Web client.</li>
             * <li><code>linux</code>: Linux client.</li>
             * <li><code>android</code>: Android client.</li>
             * <li><code>ios</code>: iOS client.</li>
             * </ul>
             * <p>This field reflects the existing access configuration and does not indicate that all client types are available for the current product.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The access policy switch for the client type.</p>
             * <ul>
             * <li><code>on</code>: Access from this client type is allowed.</li>
             * <li><code>off</code>: Access from this client type is denied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientTypes build() {
                return new ClientTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class ClipboardPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ClipboardReadLimit")
        private Integer clipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("ClipboardScope")
        private String clipboardScope;

        @com.aliyun.core.annotation.NameInMap("ClipboardSizeUnit")
        private String clipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("ClipboardWriteLimit")
        private Integer clipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("FileClipboard")
        private String fileClipboard;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboard")
        private String richTextClipboard;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardLimit")
        private Integer richTextClipboardLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardReadLimit")
        private Integer richTextClipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardReadSizeUnit")
        private String richTextClipboardReadSizeUnit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardSizeUnit")
        private String richTextClipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardWriteLimit")
        private Integer richTextClipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardWriteSizeUnit")
        private String richTextClipboardWriteSizeUnit;

        @com.aliyun.core.annotation.NameInMap("TextClipboard")
        private String textClipboard;

        @com.aliyun.core.annotation.NameInMap("TextClipboardReadLimit")
        private Integer textClipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardReadSizeUnit")
        private String textClipboardReadSizeUnit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardWriteLimit")
        private Integer textClipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardWriteSizeUnit")
        private String textClipboardWriteSizeUnit;

        private ClipboardPolicy(Builder builder) {
            this.clipboard = builder.clipboard;
            this.clipboardReadLimit = builder.clipboardReadLimit;
            this.clipboardScope = builder.clipboardScope;
            this.clipboardSizeUnit = builder.clipboardSizeUnit;
            this.clipboardWriteLimit = builder.clipboardWriteLimit;
            this.fileClipboard = builder.fileClipboard;
            this.richTextClipboard = builder.richTextClipboard;
            this.richTextClipboardLimit = builder.richTextClipboardLimit;
            this.richTextClipboardReadLimit = builder.richTextClipboardReadLimit;
            this.richTextClipboardReadSizeUnit = builder.richTextClipboardReadSizeUnit;
            this.richTextClipboardSizeUnit = builder.richTextClipboardSizeUnit;
            this.richTextClipboardWriteLimit = builder.richTextClipboardWriteLimit;
            this.richTextClipboardWriteSizeUnit = builder.richTextClipboardWriteSizeUnit;
            this.textClipboard = builder.textClipboard;
            this.textClipboardReadLimit = builder.textClipboardReadLimit;
            this.textClipboardReadSizeUnit = builder.textClipboardReadSizeUnit;
            this.textClipboardWriteLimit = builder.textClipboardWriteLimit;
            this.textClipboardWriteSizeUnit = builder.textClipboardWriteSizeUnit;
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
         * @return clipboardSizeUnit
         */
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
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
         * @return richTextClipboardLimit
         */
        public Integer getRichTextClipboardLimit() {
            return this.richTextClipboardLimit;
        }

        /**
         * @return richTextClipboardReadLimit
         */
        public Integer getRichTextClipboardReadLimit() {
            return this.richTextClipboardReadLimit;
        }

        /**
         * @return richTextClipboardReadSizeUnit
         */
        public String getRichTextClipboardReadSizeUnit() {
            return this.richTextClipboardReadSizeUnit;
        }

        /**
         * @return richTextClipboardSizeUnit
         */
        public String getRichTextClipboardSizeUnit() {
            return this.richTextClipboardSizeUnit;
        }

        /**
         * @return richTextClipboardWriteLimit
         */
        public Integer getRichTextClipboardWriteLimit() {
            return this.richTextClipboardWriteLimit;
        }

        /**
         * @return richTextClipboardWriteSizeUnit
         */
        public String getRichTextClipboardWriteSizeUnit() {
            return this.richTextClipboardWriteSizeUnit;
        }

        /**
         * @return textClipboard
         */
        public String getTextClipboard() {
            return this.textClipboard;
        }

        /**
         * @return textClipboardReadLimit
         */
        public Integer getTextClipboardReadLimit() {
            return this.textClipboardReadLimit;
        }

        /**
         * @return textClipboardReadSizeUnit
         */
        public String getTextClipboardReadSizeUnit() {
            return this.textClipboardReadSizeUnit;
        }

        /**
         * @return textClipboardWriteLimit
         */
        public Integer getTextClipboardWriteLimit() {
            return this.textClipboardWriteLimit;
        }

        /**
         * @return textClipboardWriteSizeUnit
         */
        public String getTextClipboardWriteSizeUnit() {
            return this.textClipboardWriteSizeUnit;
        }

        public static final class Builder {
            private String clipboard; 
            private Integer clipboardReadLimit; 
            private String clipboardScope; 
            private String clipboardSizeUnit; 
            private Integer clipboardWriteLimit; 
            private String fileClipboard; 
            private String richTextClipboard; 
            private Integer richTextClipboardLimit; 
            private Integer richTextClipboardReadLimit; 
            private String richTextClipboardReadSizeUnit; 
            private String richTextClipboardSizeUnit; 
            private Integer richTextClipboardWriteLimit; 
            private String richTextClipboardWriteSizeUnit; 
            private String textClipboard; 
            private Integer textClipboardReadLimit; 
            private String textClipboardReadSizeUnit; 
            private Integer textClipboardWriteLimit; 
            private String textClipboardWriteSizeUnit; 

            private Builder() {
            } 

            private Builder(ClipboardPolicy model) {
                this.clipboard = model.clipboard;
                this.clipboardReadLimit = model.clipboardReadLimit;
                this.clipboardScope = model.clipboardScope;
                this.clipboardSizeUnit = model.clipboardSizeUnit;
                this.clipboardWriteLimit = model.clipboardWriteLimit;
                this.fileClipboard = model.fileClipboard;
                this.richTextClipboard = model.richTextClipboard;
                this.richTextClipboardLimit = model.richTextClipboardLimit;
                this.richTextClipboardReadLimit = model.richTextClipboardReadLimit;
                this.richTextClipboardReadSizeUnit = model.richTextClipboardReadSizeUnit;
                this.richTextClipboardSizeUnit = model.richTextClipboardSizeUnit;
                this.richTextClipboardWriteLimit = model.richTextClipboardWriteLimit;
                this.richTextClipboardWriteSizeUnit = model.richTextClipboardWriteSizeUnit;
                this.textClipboard = model.textClipboard;
                this.textClipboardReadLimit = model.textClipboardReadLimit;
                this.textClipboardReadSizeUnit = model.textClipboardReadSizeUnit;
                this.textClipboardWriteLimit = model.textClipboardWriteLimit;
                this.textClipboardWriteSizeUnit = model.textClipboardWriteSizeUnit;
            } 

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is denied.</li>
             * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
             * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder clipboardReadLimit(Integer clipboardReadLimit) {
                this.clipboardReadLimit = clipboardReadLimit;
                return this;
            }

            /**
             * <p>The clipboard control granularity.</p>
             * <ul>
             * <li><code>global</code>: Unified control.</li>
             * <li><code>grained</code>: Separate control by text, rich text, and file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>grained</p>
             */
            public Builder clipboardScope(String clipboardScope) {
                this.clipboardScope = clipboardScope;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder clipboardSizeUnit(String clipboardSizeUnit) {
                this.clipboardSizeUnit = clipboardSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder clipboardWriteLimit(Integer clipboardWriteLimit) {
                this.clipboardWriteLimit = clipboardWriteLimit;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is denied.</li>
             * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
             * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileClipboard(String fileClipboard) {
                this.fileClipboard = fileClipboard;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is denied.</li>
             * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
             * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder richTextClipboard(String richTextClipboard) {
                this.richTextClipboard = richTextClipboard;
                return this;
            }

            /**
             * <p>The rich text clipboard size limit.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder richTextClipboardLimit(Integer richTextClipboardLimit) {
                this.richTextClipboardLimit = richTextClipboardLimit;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder richTextClipboardReadLimit(Integer richTextClipboardReadLimit) {
                this.richTextClipboardReadLimit = richTextClipboardReadLimit;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardReadSizeUnit(String richTextClipboardReadSizeUnit) {
                this.richTextClipboardReadSizeUnit = richTextClipboardReadSizeUnit;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardSizeUnit(String richTextClipboardSizeUnit) {
                this.richTextClipboardSizeUnit = richTextClipboardSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder richTextClipboardWriteLimit(Integer richTextClipboardWriteLimit) {
                this.richTextClipboardWriteLimit = richTextClipboardWriteLimit;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardWriteSizeUnit(String richTextClipboardWriteSizeUnit) {
                this.richTextClipboardWriteSizeUnit = richTextClipboardWriteSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is denied.</li>
             * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
             * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder textClipboard(String textClipboard) {
                this.textClipboard = textClipboard;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder textClipboardReadLimit(Integer textClipboardReadLimit) {
                this.textClipboardReadLimit = textClipboardReadLimit;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder textClipboardReadSizeUnit(String textClipboardReadSizeUnit) {
                this.textClipboardReadSizeUnit = textClipboardReadSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder textClipboardWriteLimit(Integer textClipboardWriteLimit) {
                this.textClipboardWriteLimit = textClipboardWriteLimit;
                return this;
            }

            /**
             * <p>The unit of the clipboard size.</p>
             * <ul>
             * <li><code>B</code>: bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder textClipboardWriteSizeUnit(String textClipboardWriteSizeUnit) {
                this.textClipboardWriteSizeUnit = textClipboardWriteSizeUnit;
                return this;
            }

            public ClipboardPolicy build() {
                return new ClipboardPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
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
             * <p>The frame rate of browser sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
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
             * <p>The watermark switch. The value is case-insensitive.</p>
             * <ul>
             * <li><code>ON</code>: Watermark enabled.</li>
             * <li><code>OFF</code>: Watermark disabled.</li>
             * </ul>
             * <p>When disabled, the watermark content type list is not used.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder watermarkSwitch(String watermarkSwitch) {
                this.watermarkSwitch = watermarkSwitch;
                return this;
            }

            /**
             * <p>The list of watermark content types.</p>
             * <ul>
             * <li><code>EndUserId</code>: User ID.</li>
             * <li><code>InstanceGroupId</code>: Delivery group ID.</li>
             * <li><code>ClientTime</code>: Current time on the client.</li>
             * </ul>
             * <p>Use watermark types supported by the browser and client.</p>
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
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppContentProtection")
        private String appContentProtection;

        @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List<ClientTypes> clientTypes;

        @com.aliyun.core.annotation.NameInMap("ClipboardPolicy")
        private ClipboardPolicy clipboardPolicy;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSession")
        private String disconnectKeepSession;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSessionTime")
        private Integer disconnectKeepSessionTime;

        @com.aliyun.core.annotation.NameInMap("FileManager")
        private String fileManager;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnect")
        private String noOperationDisconnect;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnectTime")
        private Integer noOperationDisconnectTime;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        @com.aliyun.core.annotation.NameInMap("VideoPolicy")
        private VideoPolicy videoPolicy;

        @com.aliyun.core.annotation.NameInMap("WatermarkPolicy")
        private WatermarkPolicy watermarkPolicy;

        private Policy(Builder builder) {
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.clientTypes = builder.clientTypes;
            this.clipboardPolicy = builder.clipboardPolicy;
            this.disconnectKeepSession = builder.disconnectKeepSession;
            this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
            this.fileManager = builder.fileManager;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.noOperationDisconnect = builder.noOperationDisconnect;
            this.noOperationDisconnectTime = builder.noOperationDisconnectTime;
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
         * @return appContentProtection
         */
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        /**
         * @return authorizeAccessPolicyRules
         */
        public java.util.List<AuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        /**
         * @return clientTypes
         */
        public java.util.List<ClientTypes> getClientTypes() {
            return this.clientTypes;
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
         * @return fileManager
         */
        public String getFileManager() {
            return this.fileManager;
        }

        /**
         * @return html5FileTransfer
         */
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        /**
         * @return noOperationDisconnect
         */
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        /**
         * @return noOperationDisconnectTime
         */
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
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
            private String appContentProtection; 
            private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List<ClientTypes> clientTypes; 
            private ClipboardPolicy clipboardPolicy; 
            private String disconnectKeepSession; 
            private Integer disconnectKeepSessionTime; 
            private String fileManager; 
            private String html5FileTransfer; 
            private String noOperationDisconnect; 
            private Integer noOperationDisconnectTime; 
            private String policyId; 
            private String policyVersion; 
            private VideoPolicy videoPolicy; 
            private WatermarkPolicy watermarkPolicy; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.appContentProtection = model.appContentProtection;
                this.authorizeAccessPolicyRules = model.authorizeAccessPolicyRules;
                this.clientTypes = model.clientTypes;
                this.clipboardPolicy = model.clipboardPolicy;
                this.disconnectKeepSession = model.disconnectKeepSession;
                this.disconnectKeepSessionTime = model.disconnectKeepSessionTime;
                this.fileManager = model.fileManager;
                this.html5FileTransfer = model.html5FileTransfer;
                this.noOperationDisconnect = model.noOperationDisconnect;
                this.noOperationDisconnectTime = model.noOperationDisconnectTime;
                this.policyId = model.policyId;
                this.policyVersion = model.policyVersion;
                this.videoPolicy = model.videoPolicy;
                this.watermarkPolicy = model.watermarkPolicy;
            } 

            /**
             * <p>The screenshot protection switch.</p>
             * <ul>
             * <li><code>on</code>: Screenshot protection is enabled.</li>
             * <li><code>off</code>: Screenshot protection is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * <p>The client access IP address whitelist rules.</p>
             */
            public Builder authorizeAccessPolicyRules(java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * <p>The list of client access control configurations.</p>
             */
            public Builder clientTypes(java.util.List<ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>The clipboard transfer direction, content type, and size limit settings. read indicates transfer from the local PC to the cloud browser. write indicates transfer from the cloud browser to the local PC.</p>
             */
            public Builder clipboardPolicy(ClipboardPolicy clipboardPolicy) {
                this.clipboardPolicy = clipboardPolicy;
                return this;
            }

            /**
             * <p>The data retention policy for sessions after disconnection.</p>
             * <ul>
             * <li><code>customTime</code>: The session is retained for the duration specified by <code>DisconnectKeepSessionTime</code>.</li>
             * <li><code>persistent</code>: The session is not subject to automatic release based on disconnection duration.</li>
             * </ul>
             * <p><strong>Note:</strong> The <code>persistent</code> option is still subject to authorization and other release policies.</p>
             * 
             * <strong>example:</strong>
             * <p>customTime</p>
             */
            public Builder disconnectKeepSession(String disconnectKeepSession) {
                this.disconnectKeepSession = disconnectKeepSession;
                return this;
            }

            /**
             * <p>The session retention duration after disconnection. Unit: seconds. This value is for viewing the configuration only and does not indicate that this parameter can be set through the create operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
                this.disconnectKeepSessionTime = disconnectKeepSessionTime;
                return this;
            }

            /**
             * <p>The floating ball file manager switch.</p>
             * <ul>
             * <li><code>on</code>: Enabled.</li>
             * <li><code>off</code>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileManager(String fileManager) {
                this.fileManager = fileManager;
                return this;
            }

            /**
             * <p>The file transfer policy for the web client.</p>
             * <ul>
             * <li><code>off</code>: Transfer is denied.</li>
             * <li><code>upload</code>: Only upload is allowed.</li>
             * <li><code>download</code>: Only download is allowed.</li>
             * <li><code>full</code>: Both upload and download are allowed.</li>
             * </ul>
             * <p>Configure this parameter together with the clipboard policy.</p>
             * 
             * <strong>example:</strong>
             * <p>full</p>
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * <p>The switch for automatic disconnection upon no operation. The value is case-insensitive.</p>
             * <ul>
             * <li><code>on</code>: Enabled.</li>
             * <li><code>off</code>: Disabled.</li>
             * </ul>
             * <p>When enabled, use <code>NoOperationDisconnectTime</code> to set the wait duration.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder noOperationDisconnect(String noOperationDisconnect) {
                this.noOperationDisconnect = noOperationDisconnect;
                return this;
            }

            /**
             * <p>The wait duration before disconnection is triggered after no operation, in seconds. Whether this feature is enabled is indicated by <code>NoOperationDisconnect</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder noOperationDisconnectTime(Integer noOperationDisconnectTime) {
                this.noOperationDisconnectTime = noOperationDisconnectTime;
                return this;
            }

            /**
             * <p>The ID of the policy associated with the browser instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-0bf5d87epuq5****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The policy version.</p>
             * <ul>
             * <li><code>DEFAULT</code>: Legacy policy.</li>
             * <li><code>CENTER</code>: Centralized policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CENTER</p>
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * <p>The video display policy for browser sessions.</p>
             */
            public Builder videoPolicy(VideoPolicy videoPolicy) {
                this.videoPolicy = videoPolicy;
                return this;
            }

            /**
             * <p>The watermark display configuration for browser sessions.</p>
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
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
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
             * <p>The session retention duration after disconnection, in minutes. A value of <code>-1</code> indicates that the session is not unbound due to this timeout, but is still subject to authorization and other session release policies.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The timer configuration type. <code>SESSION_TIMEOUT</code> indicates the session retention duration after disconnection.</p>
             * 
             * <strong>example:</strong>
             * <p>SESSION_TIMEOUT</p>
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
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class UserLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserQuota")
        private Integer userQuota;

        private UserLimit(Builder builder) {
            this.userQuota = builder.userQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserLimit create() {
            return builder().build();
        }

        /**
         * @return userQuota
         */
        public Integer getUserQuota() {
            return this.userQuota;
        }

        public static final class Builder {
            private Integer userQuota; 

            private Builder() {
            } 

            private Builder(UserLimit model) {
                this.userQuota = model.userQuota;
            } 

            /**
             * <p>The user quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder userQuota(Integer userQuota) {
                this.userQuota = userQuota;
                return this;
            }

            public UserLimit build() {
                return new UserLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetBrowserInstanceGroupResponseBody</p>
     */
    public static class BrowserInstanceGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthNotificationEnabled")
        private Boolean authNotificationEnabled;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserInfo")
        private AuthorizedUserInfo authorizedUserInfo;

        @com.aliyun.core.annotation.NameInMap("BizRegionId")
        private String bizRegionId;

        @com.aliyun.core.annotation.NameInMap("BrowserConfig")
        private BrowserConfig browserConfig;

        @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupId")
        private String browserInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupName")
        private String browserInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupSetId")
        private String browserInstanceGroupSetId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DefaultAccessUrl")
        private String defaultAccessUrl;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Duration duration;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Homepage")
        private String homepage;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private NodeInstanceType nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("NodePool")
        private java.util.List<NodePool> nodePool;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private Policy policy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        @com.aliyun.core.annotation.NameInMap("SupportUserGroupMixedAuth")
        private Boolean supportUserGroupMixedAuth;

        @com.aliyun.core.annotation.NameInMap("Tier")
        private String tier;

        @com.aliyun.core.annotation.NameInMap("Timers")
        private java.util.List<Timers> timers;

        @com.aliyun.core.annotation.NameInMap("UserGroupAuthMode")
        private String userGroupAuthMode;

        @com.aliyun.core.annotation.NameInMap("UserLimit")
        private UserLimit userLimit;

        private BrowserInstanceGroupModel(Builder builder) {
            this.authNotificationEnabled = builder.authNotificationEnabled;
            this.authorizedUserInfo = builder.authorizedUserInfo;
            this.bizRegionId = builder.bizRegionId;
            this.browserConfig = builder.browserConfig;
            this.browserInstanceGroupId = builder.browserInstanceGroupId;
            this.browserInstanceGroupName = builder.browserInstanceGroupName;
            this.browserInstanceGroupSetId = builder.browserInstanceGroupSetId;
            this.chargeType = builder.chargeType;
            this.defaultAccessUrl = builder.defaultAccessUrl;
            this.duration = builder.duration;
            this.expiredTime = builder.expiredTime;
            this.gmtCreate = builder.gmtCreate;
            this.homepage = builder.homepage;
            this.imageId = builder.imageId;
            this.instanceType = builder.instanceType;
            this.maxAmount = builder.maxAmount;
            this.network = builder.network;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.nodePool = builder.nodePool;
            this.osType = builder.osType;
            this.policy = builder.policy;
            this.status = builder.status;
            this.subPayType = builder.subPayType;
            this.supportUserGroupMixedAuth = builder.supportUserGroupMixedAuth;
            this.tier = builder.tier;
            this.timers = builder.timers;
            this.userGroupAuthMode = builder.userGroupAuthMode;
            this.userLimit = builder.userLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserInstanceGroupModel create() {
            return builder().build();
        }

        /**
         * @return authNotificationEnabled
         */
        public Boolean getAuthNotificationEnabled() {
            return this.authNotificationEnabled;
        }

        /**
         * @return authorizedUserInfo
         */
        public AuthorizedUserInfo getAuthorizedUserInfo() {
            return this.authorizedUserInfo;
        }

        /**
         * @return bizRegionId
         */
        public String getBizRegionId() {
            return this.bizRegionId;
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
         * @return browserInstanceGroupName
         */
        public String getBrowserInstanceGroupName() {
            return this.browserInstanceGroupName;
        }

        /**
         * @return browserInstanceGroupSetId
         */
        public String getBrowserInstanceGroupSetId() {
            return this.browserInstanceGroupSetId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return defaultAccessUrl
         */
        public String getDefaultAccessUrl() {
            return this.defaultAccessUrl;
        }

        /**
         * @return duration
         */
        public Duration getDuration() {
            return this.duration;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return homepage
         */
        public String getHomepage() {
            return this.homepage;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return nodeInstanceType
         */
        public NodeInstanceType getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return nodePool
         */
        public java.util.List<NodePool> getNodePool() {
            return this.nodePool;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return policy
         */
        public Policy getPolicy() {
            return this.policy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        /**
         * @return supportUserGroupMixedAuth
         */
        public Boolean getSupportUserGroupMixedAuth() {
            return this.supportUserGroupMixedAuth;
        }

        /**
         * @return tier
         */
        public String getTier() {
            return this.tier;
        }

        /**
         * @return timers
         */
        public java.util.List<Timers> getTimers() {
            return this.timers;
        }

        /**
         * @return userGroupAuthMode
         */
        public String getUserGroupAuthMode() {
            return this.userGroupAuthMode;
        }

        /**
         * @return userLimit
         */
        public UserLimit getUserLimit() {
            return this.userLimit;
        }

        public static final class Builder {
            private Boolean authNotificationEnabled; 
            private AuthorizedUserInfo authorizedUserInfo; 
            private String bizRegionId; 
            private BrowserConfig browserConfig; 
            private String browserInstanceGroupId; 
            private String browserInstanceGroupName; 
            private String browserInstanceGroupSetId; 
            private String chargeType; 
            private String defaultAccessUrl; 
            private Duration duration; 
            private String expiredTime; 
            private String gmtCreate; 
            private String homepage; 
            private String imageId; 
            private String instanceType; 
            private Integer maxAmount; 
            private Network network; 
            private NodeInstanceType nodeInstanceType; 
            private java.util.List<NodePool> nodePool; 
            private String osType; 
            private Policy policy; 
            private String status; 
            private String subPayType; 
            private Boolean supportUserGroupMixedAuth; 
            private String tier; 
            private java.util.List<Timers> timers; 
            private String userGroupAuthMode; 
            private UserLimit userLimit; 

            private Builder() {
            } 

            private Builder(BrowserInstanceGroupModel model) {
                this.authNotificationEnabled = model.authNotificationEnabled;
                this.authorizedUserInfo = model.authorizedUserInfo;
                this.bizRegionId = model.bizRegionId;
                this.browserConfig = model.browserConfig;
                this.browserInstanceGroupId = model.browserInstanceGroupId;
                this.browserInstanceGroupName = model.browserInstanceGroupName;
                this.browserInstanceGroupSetId = model.browserInstanceGroupSetId;
                this.chargeType = model.chargeType;
                this.defaultAccessUrl = model.defaultAccessUrl;
                this.duration = model.duration;
                this.expiredTime = model.expiredTime;
                this.gmtCreate = model.gmtCreate;
                this.homepage = model.homepage;
                this.imageId = model.imageId;
                this.instanceType = model.instanceType;
                this.maxAmount = model.maxAmount;
                this.network = model.network;
                this.nodeInstanceType = model.nodeInstanceType;
                this.nodePool = model.nodePool;
                this.osType = model.osType;
                this.policy = model.policy;
                this.status = model.status;
                this.subPayType = model.subPayType;
                this.supportUserGroupMixedAuth = model.supportUserGroupMixedAuth;
                this.tier = model.tier;
                this.timers = model.timers;
                this.userGroupAuthMode = model.userGroupAuthMode;
                this.userLimit = model.userLimit;
            } 

            /**
             * <p>Indicates whether authorization and deauthorization notification emails are enabled. <code>true</code> indicates that the feature is enabled. <code>false</code> indicates that the feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authNotificationEnabled(Boolean authNotificationEnabled) {
                this.authNotificationEnabled = authNotificationEnabled;
                return this;
            }

            /**
             * <p>The statistics of authorized users for the browser group.</p>
             */
            public Builder authorizedUserInfo(AuthorizedUserInfo authorizedUserInfo) {
                this.authorizedUserInfo = authorizedUserInfo;
                return this;
            }

            /**
             * <p>The business region where the browser group resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * <p>The current browser configuration.</p>
             */
            public Builder browserConfig(BrowserConfig browserConfig) {
                this.browserConfig = browserConfig;
                return this;
            }

            /**
             * <p>The cloud browser group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>big-0c7loey7fzjq****</p>
             */
            public Builder browserInstanceGroupId(String browserInstanceGroupId) {
                this.browserInstanceGroupId = browserInstanceGroupId;
                return this;
            }

            /**
             * <p>The cloud browser group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Office Browser</p>
             */
            public Builder browserInstanceGroupName(String browserInstanceGroupName) {
                this.browserInstanceGroupName = browserInstanceGroupName;
                return this;
            }

            /**
             * <p>The ID of the browser group set to which the browser group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>set-3jm9d0abc00example</p>
             */
            public Builder browserInstanceGroupSetId(String browserInstanceGroupSetId) {
                this.browserInstanceGroupSetId = browserInstanceGroupSetId;
                return this;
            }

            /**
             * <p>The billing type. In MAU scenarios, <code>PostPaid</code> is returned, which indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The default access URL of the browser group. Use the URL returned by the API to access the browser group. Replace the resource ID in the example with your actual value.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://wuying.aliyun.com/integration?appId=browser&appInstanceGroupId=big-0c7loey7fzjq">https://wuying.aliyun.com/integration?appId=browser&amp;appInstanceGroupId=big-0c7loey7fzjq</a>****</p>
             */
            public Builder defaultAccessUrl(String defaultAccessUrl) {
                this.defaultAccessUrl = defaultAccessUrl;
                return this;
            }

            /**
             * <p>The plan duration information. In MAU scenarios, plan duration does not apply, and an empty object may be returned.</p>
             */
            public Builder duration(Duration duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The expiration time of the browser group. This field does not apply to MAU scenarios and is not returned.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The creation time of the browser group. The value is an RFC 3339 time string in the <code>yyyy-MM-ddTHH:mm:ss.SSSXXX</code> format, which includes milliseconds and a time zone offset. The <code>+00:00</code> in the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-21T07:00:39.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The homepage URL of the browser group.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder homepage(String homepage) {
                this.homepage = homepage;
                return this;
            }

            /**
             * <p>The image ID used by the browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-070qhs8oeju4****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance type used by the browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.general.basic</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum number of instances configured for the MAU scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * <p>The office network and website access restriction configuration.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The node specifications information. This field does not apply to MAU scenarios.</p>
             */
            public Builder nodeInstanceType(NodeInstanceType nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The list of node pool information. In MAU scenarios, this field does not apply and an empty list may be returned.</p>
             */
            public Builder nodePool(java.util.List<NodePool> nodePool) {
                this.nodePool = nodePool;
                return this;
            }

            /**
             * <p>The operating system type of the browser group. The current MAU product scenario uses Windows.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The policy configuration returned for the browser group. The policy fields are used to view existing settings and do not indicate that all corresponding creation parameters are configurable.</p>
             */
            public Builder policy(Policy policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The status of the browser instance group.</p>
             * <ul>
             * <li><code>DEPLOYING</code>: Being deployed.</li>
             * <li><code>PUBLISHED</code>: Deployed.</li>
             * <li><code>FAILED</code>: Deployment failed.</li>
             * <li><code>EXPIRED</code>: Expired.</li>
             * <li><code>CEASED</code>: Suspended due to overdue payment.</li>
             * <li><code>MAINTAINING</code>: Being updated.</li>
             * <li><code>MAINTAIN_FAILED</code>: Update failed.</li>
             * <li><code>DELETING</code>: Being deleted.</li>
             * <li><code>UNAVAILABLE</code>: Unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-billing type. In MAU scenarios, the actual returned value is <code>mau</code>, which indicates billing by monthly active users.</p>
             * 
             * <strong>example:</strong>
             * <p>mau</p>
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            /**
             * <p>Indicates whether mixed authorization of users and user groups is supported. <code>true</code> indicates supported, and <code>false</code> indicates not supported. Evaluate this value based on the current authorization mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportUserGroupMixedAuth(Boolean supportUserGroupMixedAuth) {
                this.supportUserGroupMixedAuth = supportUserGroupMixedAuth;
                return this;
            }

            /**
             * <p>The version of the browser.</p>
             * <ul>
             * <li><code>Basic</code>: Basic Edition.</li>
             * <li><code>Pro</code>: Premium Edition.</li>
             * </ul>
             * <p>In MAU scenarios, the value is <code>Pro</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Pro</p>
             */
            public Builder tier(String tier) {
                this.tier = tier;
                return this;
            }

            /**
             * <p>The session timer configurations currently returned. These are for viewing the effective settings and do not indicate that the creation API supports setting this parameter.</p>
             */
            public Builder timers(java.util.List<Timers> timers) {
                this.timers = timers;
                return this;
            }

            /**
             * <p>The current authorization mode.</p>
             * <ul>
             * <li><code>Mixed</code>: Mixed authorization of users and user groups.</li>
             * <li><code>User</code>: User authorization.</li>
             * <li><code>UserGroup</code>: User group authorization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Mixed</p>
             */
            public Builder userGroupAuthMode(String userGroupAuthMode) {
                this.userGroupAuthMode = userGroupAuthMode;
                return this;
            }

            /**
             * <p>The user quota information.</p>
             */
            public Builder userLimit(UserLimit userLimit) {
                this.userLimit = userLimit;
                return this;
            }

            public BrowserInstanceGroupModel build() {
                return new BrowserInstanceGroupModel(this);
            } 

        } 

    }
}
