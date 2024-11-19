// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyDentryResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDentryResponseBody</p>
 */
public class CopyDentryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("creator")
    private java.util.Map < String, ? > creator;

    @com.aliyun.core.annotation.NameInMap("dentryId")
    private String dentryId;

    @com.aliyun.core.annotation.NameInMap("dentryType")
    private String dentryType;

    @com.aliyun.core.annotation.NameInMap("dentryUuid")
    private String dentryUuid;

    @com.aliyun.core.annotation.NameInMap("docKey")
    private String docKey;

    @com.aliyun.core.annotation.NameInMap("extension")
    private String extension;

    @com.aliyun.core.annotation.NameInMap("hasChildren")
    private Boolean hasChildren;

    @com.aliyun.core.annotation.NameInMap("linkSourceInfo")
    private LinkSourceInfo linkSourceInfo;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("space")
    private Space space;

    @com.aliyun.core.annotation.NameInMap("spaceId")
    private String spaceId;

    @com.aliyun.core.annotation.NameInMap("updatedTime")
    private Long updatedTime;

    @com.aliyun.core.annotation.NameInMap("updater")
    private java.util.Map < String, ? > updater;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    @com.aliyun.core.annotation.NameInMap("visitorInfo")
    private java.util.Map < String, ? > visitorInfo;

    private CopyDentryResponseBody(Builder builder) {
        this.contentType = builder.contentType;
        this.createdTime = builder.createdTime;
        this.creator = builder.creator;
        this.dentryId = builder.dentryId;
        this.dentryType = builder.dentryType;
        this.dentryUuid = builder.dentryUuid;
        this.docKey = builder.docKey;
        this.extension = builder.extension;
        this.hasChildren = builder.hasChildren;
        this.linkSourceInfo = builder.linkSourceInfo;
        this.name = builder.name;
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.space = builder.space;
        this.spaceId = builder.spaceId;
        this.updatedTime = builder.updatedTime;
        this.updater = builder.updater;
        this.url = builder.url;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
        this.visitorInfo = builder.visitorInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDentryResponseBody create() {
        return builder().build();
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return creator
     */
    public java.util.Map < String, ? > getCreator() {
        return this.creator;
    }

    /**
     * @return dentryId
     */
    public String getDentryId() {
        return this.dentryId;
    }

    /**
     * @return dentryType
     */
    public String getDentryType() {
        return this.dentryType;
    }

    /**
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return docKey
     */
    public String getDocKey() {
        return this.docKey;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return hasChildren
     */
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    /**
     * @return linkSourceInfo
     */
    public LinkSourceInfo getLinkSourceInfo() {
        return this.linkSourceInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return space
     */
    public Space getSpace() {
        return this.space;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @return updater
     */
    public java.util.Map < String, ? > getUpdater() {
        return this.updater;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    /**
     * @return visitorInfo
     */
    public java.util.Map < String, ? > getVisitorInfo() {
        return this.visitorInfo;
    }

    public static final class Builder {
        private String contentType; 
        private Long createdTime; 
        private java.util.Map < String, ? > creator; 
        private String dentryId; 
        private String dentryType; 
        private String dentryUuid; 
        private String docKey; 
        private String extension; 
        private Boolean hasChildren; 
        private LinkSourceInfo linkSourceInfo; 
        private String name; 
        private String path; 
        private String requestId; 
        private Space space; 
        private String spaceId; 
        private Long updatedTime; 
        private java.util.Map < String, ? > updater; 
        private String url; 
        private String vendorRequestId; 
        private String vendorType; 
        private java.util.Map < String, ? > visitorInfo; 

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(java.util.Map < String, ? > creator) {
            this.creator = creator;
            return this;
        }

        /**
         * dentryId.
         */
        public Builder dentryId(String dentryId) {
            this.dentryId = dentryId;
            return this;
        }

        /**
         * dentryType.
         */
        public Builder dentryType(String dentryType) {
            this.dentryType = dentryType;
            return this;
        }

        /**
         * dentryUuid.
         */
        public Builder dentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * docKey.
         */
        public Builder docKey(String docKey) {
            this.docKey = docKey;
            return this;
        }

        /**
         * extension.
         */
        public Builder extension(String extension) {
            this.extension = extension;
            return this;
        }

        /**
         * hasChildren.
         */
        public Builder hasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }

        /**
         * linkSourceInfo.
         */
        public Builder linkSourceInfo(LinkSourceInfo linkSourceInfo) {
            this.linkSourceInfo = linkSourceInfo;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * space.
         */
        public Builder space(Space space) {
            this.space = space;
            return this;
        }

        /**
         * spaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * updatedTime.
         */
        public Builder updatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        /**
         * updater.
         */
        public Builder updater(java.util.Map < String, ? > updater) {
            this.updater = updater;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        /**
         * visitorInfo.
         */
        public Builder visitorInfo(java.util.Map < String, ? > visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }

        public CopyDentryResponseBody build() {
            return new CopyDentryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class IconUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        private IconUrl(Builder builder) {
            this.line = builder.line;
            this.small = builder.small;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IconUrl create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return small
         */
        public String getSmall() {
            return this.small;
        }

        public static final class Builder {
            private String line; 
            private String small; 

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Small.
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            public IconUrl build() {
                return new IconUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class LinkSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private IconUrl iconUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LinkType")
        private Long linkType;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        private LinkSourceInfo(Builder builder) {
            this.extension = builder.extension;
            this.iconUrl = builder.iconUrl;
            this.id = builder.id;
            this.linkType = builder.linkType;
            this.spaceId = builder.spaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkSourceInfo create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return iconUrl
         */
        public IconUrl getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return linkType
         */
        public Long getLinkType() {
            return this.linkType;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        public static final class Builder {
            private String extension; 
            private IconUrl iconUrl; 
            private String id; 
            private Long linkType; 
            private String spaceId; 

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(IconUrl iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LinkType.
             */
            public Builder linkType(Long linkType) {
                this.linkType = linkType;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            public LinkSourceInfo build() {
                return new LinkSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class HdIconVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HdIconVO(Builder builder) {
            this.icon = builder.icon;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HdIconVO create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String icon; 
            private String type; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HdIconVO build() {
                return new HdIconVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class IconVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IconVO(Builder builder) {
            this.icon = builder.icon;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IconVO create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String icon; 
            private String type; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IconVO build() {
                return new IconVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owner(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String name; 
            private String userId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Creator(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String name; 
            private String userId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class LinkSourceInfoIconUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Small")
        private String small;

        private LinkSourceInfoIconUrl(Builder builder) {
            this.line = builder.line;
            this.small = builder.small;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkSourceInfoIconUrl create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return small
         */
        public String getSmall() {
            return this.small;
        }

        public static final class Builder {
            private String line; 
            private String small; 

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Small.
             */
            public Builder small(String small) {
                this.small = small;
                return this;
            }

            public LinkSourceInfoIconUrl build() {
                return new LinkSourceInfoIconUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class RecentListLinkSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private LinkSourceInfoIconUrl iconUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LinkType")
        private Long linkType;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        private RecentListLinkSourceInfo(Builder builder) {
            this.extension = builder.extension;
            this.iconUrl = builder.iconUrl;
            this.id = builder.id;
            this.linkType = builder.linkType;
            this.spaceId = builder.spaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentListLinkSourceInfo create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return iconUrl
         */
        public LinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return linkType
         */
        public Long getLinkType() {
            return this.linkType;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        public static final class Builder {
            private String extension; 
            private LinkSourceInfoIconUrl iconUrl; 
            private String id; 
            private Long linkType; 
            private String spaceId; 

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(LinkSourceInfoIconUrl iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LinkType.
             */
            public Builder linkType(Long linkType) {
                this.linkType = linkType;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            public RecentListLinkSourceInfo build() {
                return new RecentListLinkSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class StatisticalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WordCount")
        private Long wordCount;

        private StatisticalInfo(Builder builder) {
            this.wordCount = builder.wordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticalInfo create() {
            return builder().build();
        }

        /**
         * @return wordCount
         */
        public Long getWordCount() {
            return this.wordCount;
        }

        public static final class Builder {
            private Long wordCount; 

            /**
             * WordCount.
             */
            public Builder wordCount(Long wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            public StatisticalInfo build() {
                return new StatisticalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class Updater extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Updater(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Updater create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String name; 
            private String userId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Updater build() {
                return new Updater(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class VisitorInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("SpaceActions")
        private java.util.List < String > spaceActions;

        private VisitorInfo(Builder builder) {
            this.dentryActions = builder.dentryActions;
            this.roleCode = builder.roleCode;
            this.spaceActions = builder.spaceActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisitorInfo create() {
            return builder().build();
        }

        /**
         * @return dentryActions
         */
        public java.util.List < String > getDentryActions() {
            return this.dentryActions;
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return spaceActions
         */
        public java.util.List < String > getSpaceActions() {
            return this.spaceActions;
        }

        public static final class Builder {
            private java.util.List < String > dentryActions; 
            private String roleCode; 
            private java.util.List < String > spaceActions; 

            /**
             * DentryActions.
             */
            public Builder dentryActions(java.util.List < String > dentryActions) {
                this.dentryActions = dentryActions;
                return this;
            }

            /**
             * RoleCode.
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * SpaceActions.
             */
            public Builder spaceActions(java.util.List < String > spaceActions) {
                this.spaceActions = spaceActions;
                return this;
            }

            public VisitorInfo build() {
                return new VisitorInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class RecentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("DentryId")
        private String dentryId;

        @com.aliyun.core.annotation.NameInMap("DentryType")
        private String dentryType;

        @com.aliyun.core.annotation.NameInMap("DentryUuid")
        private String dentryUuid;

        @com.aliyun.core.annotation.NameInMap("DocKey")
        private String docKey;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("HasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("LinkSourceInfo")
        private RecentListLinkSourceInfo linkSourceInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Space")
        private Object space;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        @com.aliyun.core.annotation.NameInMap("StatisticalInfo")
        private StatisticalInfo statisticalInfo;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private Updater updater;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VisitorInfo")
        private VisitorInfo visitorInfo;

        private RecentList(Builder builder) {
            this.contentType = builder.contentType;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.dentryId = builder.dentryId;
            this.dentryType = builder.dentryType;
            this.dentryUuid = builder.dentryUuid;
            this.docKey = builder.docKey;
            this.extension = builder.extension;
            this.hasChildren = builder.hasChildren;
            this.linkSourceInfo = builder.linkSourceInfo;
            this.name = builder.name;
            this.path = builder.path;
            this.space = builder.space;
            this.spaceId = builder.spaceId;
            this.statisticalInfo = builder.statisticalInfo;
            this.updatedTime = builder.updatedTime;
            this.updater = builder.updater;
            this.url = builder.url;
            this.visitorInfo = builder.visitorInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentList create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return dentryId
         */
        public String getDentryId() {
            return this.dentryId;
        }

        /**
         * @return dentryType
         */
        public String getDentryType() {
            return this.dentryType;
        }

        /**
         * @return dentryUuid
         */
        public String getDentryUuid() {
            return this.dentryUuid;
        }

        /**
         * @return docKey
         */
        public String getDocKey() {
            return this.docKey;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return linkSourceInfo
         */
        public RecentListLinkSourceInfo getLinkSourceInfo() {
            return this.linkSourceInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return space
         */
        public Object getSpace() {
            return this.space;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return statisticalInfo
         */
        public StatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return updater
         */
        public Updater getUpdater() {
            return this.updater;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return visitorInfo
         */
        public VisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

        public static final class Builder {
            private String contentType; 
            private Long createdTime; 
            private Creator creator; 
            private String dentryId; 
            private String dentryType; 
            private String dentryUuid; 
            private String docKey; 
            private String extension; 
            private Boolean hasChildren; 
            private RecentListLinkSourceInfo linkSourceInfo; 
            private String name; 
            private String path; 
            private Object space; 
            private String spaceId; 
            private StatisticalInfo statisticalInfo; 
            private Long updatedTime; 
            private Updater updater; 
            private String url; 
            private VisitorInfo visitorInfo; 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DentryId.
             */
            public Builder dentryId(String dentryId) {
                this.dentryId = dentryId;
                return this;
            }

            /**
             * DentryType.
             */
            public Builder dentryType(String dentryType) {
                this.dentryType = dentryType;
                return this;
            }

            /**
             * DentryUuid.
             */
            public Builder dentryUuid(String dentryUuid) {
                this.dentryUuid = dentryUuid;
                return this;
            }

            /**
             * DocKey.
             */
            public Builder docKey(String docKey) {
                this.docKey = docKey;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * HasChildren.
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * LinkSourceInfo.
             */
            public Builder linkSourceInfo(RecentListLinkSourceInfo linkSourceInfo) {
                this.linkSourceInfo = linkSourceInfo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Space.
             */
            public Builder space(Object space) {
                this.space = space;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * StatisticalInfo.
             */
            public Builder statisticalInfo(StatisticalInfo statisticalInfo) {
                this.statisticalInfo = statisticalInfo;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * Updater.
             */
            public Builder updater(Updater updater) {
                this.updater = updater;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * VisitorInfo.
             */
            public Builder visitorInfo(VisitorInfo visitorInfo) {
                this.visitorInfo = visitorInfo;
                return this;
            }

            public RecentList build() {
                return new RecentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class SpaceVisitorInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @com.aliyun.core.annotation.NameInMap("RoleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("SpaceActions")
        private java.util.List < String > spaceActions;

        private SpaceVisitorInfo(Builder builder) {
            this.dentryActions = builder.dentryActions;
            this.roleCode = builder.roleCode;
            this.spaceActions = builder.spaceActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceVisitorInfo create() {
            return builder().build();
        }

        /**
         * @return dentryActions
         */
        public java.util.List < String > getDentryActions() {
            return this.dentryActions;
        }

        /**
         * @return roleCode
         */
        public String getRoleCode() {
            return this.roleCode;
        }

        /**
         * @return spaceActions
         */
        public java.util.List < String > getSpaceActions() {
            return this.spaceActions;
        }

        public static final class Builder {
            private java.util.List < String > dentryActions; 
            private String roleCode; 
            private java.util.List < String > spaceActions; 

            /**
             * DentryActions.
             */
            public Builder dentryActions(java.util.List < String > dentryActions) {
                this.dentryActions = dentryActions;
                return this;
            }

            /**
             * RoleCode.
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * SpaceActions.
             */
            public Builder spaceActions(java.util.List < String > spaceActions) {
                this.spaceActions = spaceActions;
                return this;
            }

            public SpaceVisitorInfo build() {
                return new SpaceVisitorInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyDentryResponseBody} extends {@link TeaModel}
     *
     * <p>CopyDentryResponseBody</p>
     */
    public static class Space extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cover")
        private String cover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HdIconVO")
        private HdIconVO hdIconVO;

        @com.aliyun.core.annotation.NameInMap("IconVO")
        private IconVO iconVO;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Owner owner;

        @com.aliyun.core.annotation.NameInMap("RecentList")
        private java.util.List < RecentList> recentList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VisitorInfo")
        private SpaceVisitorInfo visitorInfo;

        private Space(Builder builder) {
            this.cover = builder.cover;
            this.description = builder.description;
            this.hdIconVO = builder.hdIconVO;
            this.iconVO = builder.iconVO;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.recentList = builder.recentList;
            this.type = builder.type;
            this.url = builder.url;
            this.visitorInfo = builder.visitorInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Space create() {
            return builder().build();
        }

        /**
         * @return cover
         */
        public String getCover() {
            return this.cover;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hdIconVO
         */
        public HdIconVO getHdIconVO() {
            return this.hdIconVO;
        }

        /**
         * @return iconVO
         */
        public IconVO getIconVO() {
            return this.iconVO;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return recentList
         */
        public java.util.List < RecentList> getRecentList() {
            return this.recentList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return visitorInfo
         */
        public SpaceVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

        public static final class Builder {
            private String cover; 
            private String description; 
            private HdIconVO hdIconVO; 
            private IconVO iconVO; 
            private String id; 
            private String name; 
            private Owner owner; 
            private java.util.List < RecentList> recentList; 
            private Integer type; 
            private String url; 
            private SpaceVisitorInfo visitorInfo; 

            /**
             * Cover.
             */
            public Builder cover(String cover) {
                this.cover = cover;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HdIconVO.
             */
            public Builder hdIconVO(HdIconVO hdIconVO) {
                this.hdIconVO = hdIconVO;
                return this;
            }

            /**
             * IconVO.
             */
            public Builder iconVO(IconVO iconVO) {
                this.iconVO = iconVO;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RecentList.
             */
            public Builder recentList(java.util.List < RecentList> recentList) {
                this.recentList = recentList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * VisitorInfo.
             */
            public Builder visitorInfo(SpaceVisitorInfo visitorInfo) {
                this.visitorInfo = visitorInfo;
                return this;
            }

            public Space build() {
                return new Space(this);
            } 

        } 

    }
}
