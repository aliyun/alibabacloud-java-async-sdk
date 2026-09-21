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
 * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListBrowserInstanceGroupResponseBody</p>
 */
public class ListBrowserInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupModels")
    private java.util.List<BrowserInstanceGroupModels> browserInstanceGroupModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBrowserInstanceGroupResponseBody(Builder builder) {
        this.browserInstanceGroupModels = builder.browserInstanceGroupModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowserInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserInstanceGroupModels
     */
    public java.util.List<BrowserInstanceGroupModels> getBrowserInstanceGroupModels() {
        return this.browserInstanceGroupModels;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BrowserInstanceGroupModels> browserInstanceGroupModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBrowserInstanceGroupResponseBody model) {
            this.browserInstanceGroupModels = model.browserInstanceGroupModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of browser groups on the current page.</p>
         */
        public Builder browserInstanceGroupModels(java.util.List<BrowserInstanceGroupModels> browserInstanceGroupModels) {
            this.browserInstanceGroupModels = browserInstanceGroupModels;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>The total number of browser groups that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBrowserInstanceGroupResponseBody build() {
            return new ListBrowserInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
     */
    public static class BrowserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrowserParam")
        private String browserParam;

        @com.aliyun.core.annotation.NameInMap("CookiesSync")
        private String cookiesSync;

        @com.aliyun.core.annotation.NameInMap("Homepage")
        private String homepage;

        private BrowserConfig(Builder builder) {
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
            private String browserParam; 
            private String cookiesSync; 
            private String homepage; 

            private Builder() {
            } 

            private Builder(BrowserConfig model) {
                this.browserParam = model.browserParam;
                this.cookiesSync = model.cookiesSync;
                this.homepage = model.homepage;
            } 

            /**
             * <p>The browser startup parameters. For example, <code>--incognito</code> indicates an incognito window.</p>
             * 
             * <strong>example:</strong>
             * <p>--incognito</p>
             */
            public Builder browserParam(String browserParam) {
                this.browserParam = browserParam;
                return this;
            }

            /**
             * <p>The cookie synchronization configuration. The string <code>true</code> indicates enabled. <code>false</code> indicates disabled.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
             * <p>The current payment stage of the plan. Not applicable in MAU scenarios.</p>
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
             * <p>The end time of the plan period. Not applicable in MAU scenarios. This field is not returned.</p>
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
             * <p>The start time of the plan period. Not applicable in MAU scenarios. This field is not returned.</p>
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
             * <p>The total duration of the plan, in seconds. Not applicable in MAU scenarios.</p>
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
             * <p>The used duration of the plan, in seconds. Not applicable in MAU scenarios.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRestriction")
        private String accessRestriction;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Network(Builder builder) {
            this.accessRestriction = builder.accessRestriction;
            this.officeSiteId = builder.officeSiteId;
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
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String accessRestriction; 
            private String officeSiteId; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessRestriction = model.accessRestriction;
                this.officeSiteId = model.officeSiteId;
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
             * <p>The ID of the workspace to which the browser group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-843734****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs used by the browser group, available for scenarios with custom network configurations.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
             * <p>The source CIDR block of the client that is allowed to access.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
             * <p>The access policy switch for this client type.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
     */
    public static class ClipboardPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        private ClipboardPolicy(Builder builder) {
            this.clipboard = builder.clipboard;
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

        public static final class Builder {
            private String clipboard; 

            private Builder() {
            } 

            private Builder(ClipboardPolicy model) {
                this.clipboard = model.clipboard;
            } 

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is disabled.</li>
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

            public ClipboardPolicy build() {
                return new ClipboardPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
             * <p>The watermark switch. The value is case-insensitive. Valid values:</p>
             * <ul>
             * <li><code>ON</code>: Watermark is enabled.</li>
             * <li><code>OFF</code>: Watermark is disabled.</li>
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
             * <p>The list of watermark content types. Valid values:</p>
             * <ul>
             * <li><code>EndUserId</code>: The user identifier.</li>
             * <li><code>InstanceGroupId</code>: The delivery group identifier.</li>
             * <li><code>ClientTime</code>: The current time on the client.</li>
             * </ul>
             * <p>Use watermark types that are supported by the browser and client.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("VideoPolicy")
        private VideoPolicy videoPolicy;

        @com.aliyun.core.annotation.NameInMap("WatermarkPolicy")
        private WatermarkPolicy watermarkPolicy;

        private Policy(Builder builder) {
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.clientTypes = builder.clientTypes;
            this.clipboardPolicy = builder.clipboardPolicy;
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
            private VideoPolicy videoPolicy; 
            private WatermarkPolicy watermarkPolicy; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.appContentProtection = model.appContentProtection;
                this.authorizeAccessPolicyRules = model.authorizeAccessPolicyRules;
                this.clientTypes = model.clientTypes;
                this.clipboardPolicy = model.clipboardPolicy;
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
             * <p>The client access control configuration list.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>office</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
             * <p>The session retention duration after disconnection, in minutes. <code>-1</code> indicates that the session is not unbound due to this timeout. The session is still subject to authorization and other session release policies.</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
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
     * {@link ListBrowserInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupResponseBody</p>
     */
    public static class BrowserInstanceGroupModels extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Tier")
        private String tier;

        @com.aliyun.core.annotation.NameInMap("Timers")
        private java.util.List<Timers> timers;

        @com.aliyun.core.annotation.NameInMap("UserGroupAuthMode")
        private String userGroupAuthMode;

        @com.aliyun.core.annotation.NameInMap("UserLimit")
        private UserLimit userLimit;

        private BrowserInstanceGroupModels(Builder builder) {
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
            this.network = builder.network;
            this.osType = builder.osType;
            this.policy = builder.policy;
            this.status = builder.status;
            this.subPayType = builder.subPayType;
            this.supportUserGroupMixedAuth = builder.supportUserGroupMixedAuth;
            this.tags = builder.tags;
            this.tier = builder.tier;
            this.timers = builder.timers;
            this.userGroupAuthMode = builder.userGroupAuthMode;
            this.userLimit = builder.userLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserInstanceGroupModels create() {
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
         * @return network
         */
        public Network getNetwork() {
            return this.network;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private Network network; 
            private String osType; 
            private Policy policy; 
            private String status; 
            private String subPayType; 
            private Boolean supportUserGroupMixedAuth; 
            private java.util.List<Tags> tags; 
            private String tier; 
            private java.util.List<Timers> timers; 
            private String userGroupAuthMode; 
            private UserLimit userLimit; 

            private Builder() {
            } 

            private Builder(BrowserInstanceGroupModels model) {
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
                this.network = model.network;
                this.osType = model.osType;
                this.policy = model.policy;
                this.status = model.status;
                this.subPayType = model.subPayType;
                this.supportUserGroupMixedAuth = model.supportUserGroupMixedAuth;
                this.tags = model.tags;
                this.tier = model.tier;
                this.timers = model.timers;
                this.userGroupAuthMode = model.userGroupAuthMode;
                this.userLimit = model.userLimit;
            } 

            /**
             * <p>Indicates whether authorization and deauthorization notification emails are enabled. <code>true</code> indicates enabled. <code>false</code> indicates disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authNotificationEnabled(Boolean authNotificationEnabled) {
                this.authNotificationEnabled = authNotificationEnabled;
                return this;
            }

            /**
             * <p>The authorized user statistics of the browser group.</p>
             */
            public Builder authorizedUserInfo(AuthorizedUserInfo authorizedUserInfo) {
                this.authorizedUserInfo = authorizedUserInfo;
                return this;
            }

            /**
             * <p>The business region where the browser group is located.</p>
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
             * <p>The ID of the cloud browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>big-0c7loey7fzjq****</p>
             */
            public Builder browserInstanceGroupId(String browserInstanceGroupId) {
                this.browserInstanceGroupId = browserInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the cloud browser group.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeBrowser</p>
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
             * <p>The billing type. In MAU scenarios, <code>PostPaid</code> is returned, which indicates pay-as-you-go.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The default access URL of the browser group. Use the URL returned by the API for access. The resource identifiers in the example must be replaced.</p>
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
             * <p>The expiration time of the browser group. Not applicable in MAU scenarios. This field is not returned.</p>
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
             * <p>The creation time of the browser group.</p>
             * <p>The time is in RFC 3339 format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss.SSSXXX</code>, which includes milliseconds and a time zone offset. The actual POP response uses the UTC offset <code>+00:00</code>.</p>
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
             * <p>The workspace network and website access restriction configuration.</p>
             */
            public Builder network(Network network) {
                this.network = network;
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
             * <p>The policy configuration returned for the browser group. Policy fields are used to view existing settings and do not indicate that all corresponding creation parameters are configurable.</p>
             */
            public Builder policy(Policy policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The browser group status.</p>
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
             * <p>The sub-payment type. In MAU scenarios, the actual returned value is <code>mau</code>, which indicates billing by monthly active users.</p>
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
             * <p>The list of resource tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The version of the browser. Valid values:</p>
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
             * <p>The session timer configurations currently returned. This is used to view the effective settings and does not indicate that the create operation supports setting this parameter.</p>
             */
            public Builder timers(java.util.List<Timers> timers) {
                this.timers = timers;
                return this;
            }

            /**
             * <p>The current authorization mode. Valid values:</p>
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

            public BrowserInstanceGroupModels build() {
                return new BrowserInstanceGroupModels(this);
            } 

        } 

    }
}
