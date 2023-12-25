// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDentryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDentryResponseBody</p>
 */
public class QueryDentryResponseBody extends TeaModel {
    @NameInMap("contentType")
    private String contentType;

    @NameInMap("createdTime")
    private Long createdTime;

    @NameInMap("creator")
    private Creator creator;

    @NameInMap("dentryId")
    private String dentryId;

    @NameInMap("dentryType")
    private String dentryType;

    @NameInMap("dentryUuid")
    private String dentryUuid;

    @NameInMap("docKey")
    private String docKey;

    @NameInMap("extension")
    private String extension;

    @NameInMap("hasChildren")
    private Boolean hasChildren;

    @NameInMap("linkSourceInfo")
    private LinkSourceInfo linkSourceInfo;

    @NameInMap("name")
    private String name;

    @NameInMap("path")
    private String path;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("space")
    private Space space;

    @NameInMap("spaceId")
    private String spaceId;

    @NameInMap("updatedTime")
    private Long updatedTime;

    @NameInMap("updater")
    private Updater updater;

    @NameInMap("url")
    private String url;

    @NameInMap("visitorInfo")
    private VisitorInfo visitorInfo;

    private QueryDentryResponseBody(Builder builder) {
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
        this.visitorInfo = builder.visitorInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDentryResponseBody create() {
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
        private LinkSourceInfo linkSourceInfo; 
        private String name; 
        private String path; 
        private String requestId; 
        private Space space; 
        private String spaceId; 
        private Long updatedTime; 
        private Updater updater; 
        private String url; 
        private VisitorInfo visitorInfo; 

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
        public Builder creator(Creator creator) {
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
         * requestId
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
        public Builder updater(Updater updater) {
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
         * visitorInfo.
         */
        public Builder visitorInfo(VisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }

        public QueryDentryResponseBody build() {
            return new QueryDentryResponseBody(this);
        } 

    } 

    public static class Creator extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
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
    public static class IconUrl extends TeaModel {
        @NameInMap("Line")
        private String line;

        @NameInMap("Small")
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
    public static class LinkSourceInfo extends TeaModel {
        @NameInMap("Extension")
        private String extension;

        @NameInMap("IconUrl")
        private IconUrl iconUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("LinkType")
        private Long linkType;

        @NameInMap("SpaceId")
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
    public static class HdIconVO extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("Type")
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
    public static class IconVO extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("Type")
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
    public static class Owner extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
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
    public static class RecentListCreator extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
        private String userId;

        private RecentListCreator(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentListCreator create() {
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

            public RecentListCreator build() {
                return new RecentListCreator(this);
            } 

        } 

    }
    public static class LinkSourceInfoIconUrl extends TeaModel {
        @NameInMap("Line")
        private String line;

        @NameInMap("Small")
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
    public static class RecentListLinkSourceInfo extends TeaModel {
        @NameInMap("Extension")
        private String extension;

        @NameInMap("IconUrl")
        private LinkSourceInfoIconUrl iconUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("LinkType")
        private Long linkType;

        @NameInMap("SpaceId")
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
    public static class StatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
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
    public static class RecentListUpdater extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
        private String userId;

        private RecentListUpdater(Builder builder) {
            this.name = builder.name;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentListUpdater create() {
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

            public RecentListUpdater build() {
                return new RecentListUpdater(this);
            } 

        } 

    }
    public static class RecentListVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @NameInMap("RoleCode")
        private String roleCode;

        @NameInMap("SpaceActions")
        private java.util.List < String > spaceActions;

        private RecentListVisitorInfo(Builder builder) {
            this.dentryActions = builder.dentryActions;
            this.roleCode = builder.roleCode;
            this.spaceActions = builder.spaceActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentListVisitorInfo create() {
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

            public RecentListVisitorInfo build() {
                return new RecentListVisitorInfo(this);
            } 

        } 

    }
    public static class RecentList extends TeaModel {
        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Creator")
        private RecentListCreator creator;

        @NameInMap("DentryId")
        private String dentryId;

        @NameInMap("DentryType")
        private String dentryType;

        @NameInMap("DentryUuid")
        private String dentryUuid;

        @NameInMap("DocKey")
        private String docKey;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("HasChildren")
        private Boolean hasChildren;

        @NameInMap("LinkSourceInfo")
        private RecentListLinkSourceInfo linkSourceInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Space")
        private Object space;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("StatisticalInfo")
        private StatisticalInfo statisticalInfo;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("Updater")
        private RecentListUpdater updater;

        @NameInMap("Url")
        private String url;

        @NameInMap("VisitorInfo")
        private RecentListVisitorInfo visitorInfo;

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
        public RecentListCreator getCreator() {
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
        public RecentListUpdater getUpdater() {
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
        public RecentListVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

        public static final class Builder {
            private String contentType; 
            private Long createdTime; 
            private RecentListCreator creator; 
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
            private RecentListUpdater updater; 
            private String url; 
            private RecentListVisitorInfo visitorInfo; 

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
            public Builder creator(RecentListCreator creator) {
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
            public Builder updater(RecentListUpdater updater) {
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
            public Builder visitorInfo(RecentListVisitorInfo visitorInfo) {
                this.visitorInfo = visitorInfo;
                return this;
            }

            public RecentList build() {
                return new RecentList(this);
            } 

        } 

    }
    public static class SpaceVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @NameInMap("RoleCode")
        private String roleCode;

        @NameInMap("SpaceActions")
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
    public static class Space extends TeaModel {
        @NameInMap("Cover")
        private String cover;

        @NameInMap("Description")
        private String description;

        @NameInMap("HdIconVO")
        private HdIconVO hdIconVO;

        @NameInMap("IconVO")
        private IconVO iconVO;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private Owner owner;

        @NameInMap("RecentList")
        private java.util.List < RecentList> recentList;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Url")
        private String url;

        @NameInMap("VisitorInfo")
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
    public static class Updater extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("UserId")
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
    public static class VisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @NameInMap("RoleCode")
        private String roleCode;

        @NameInMap("SpaceActions")
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
}
