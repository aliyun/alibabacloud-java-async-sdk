// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpaceDirectoriesResponseBody</p>
 */
public class GetSpaceDirectoriesResponseBody extends TeaModel {
    @NameInMap("children")
    private java.util.List < Children> children;

    @NameInMap("hasMore")
    private Boolean hasMore;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    private GetSpaceDirectoriesResponseBody(Builder builder) {
        this.children = builder.children;
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return children
     */
    public java.util.List < Children> getChildren() {
        return this.children;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Children> children; 
        private Boolean hasMore; 
        private String nextToken; 
        private String requestId; 

        /**
         * children.
         */
        public Builder children(java.util.List < Children> children) {
            this.children = children;
            return this;
        }

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSpaceDirectoriesResponseBody build() {
            return new GetSpaceDirectoriesResponseBody(this);
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
        private java.util.List < ? > recentList;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Url")
        private String url;

        @NameInMap("VisitorInfo")
        private VisitorInfo visitorInfo;

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
        public java.util.List < ? > getRecentList() {
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
        public VisitorInfo getVisitorInfo() {
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
            private java.util.List < ? > recentList; 
            private Integer type; 
            private String url; 
            private VisitorInfo visitorInfo; 

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
            public Builder recentList(java.util.List < ? > recentList) {
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
            public Builder visitorInfo(VisitorInfo visitorInfo) {
                this.visitorInfo = visitorInfo;
                return this;
            }

            public Space build() {
                return new Space(this);
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
             * WordCount
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
    public static class ChildrenVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        private java.util.List < String > dentryActions;

        @NameInMap("RoleCode")
        private String roleCode;

        @NameInMap("SpaceActions")
        private java.util.List < String > spaceActions;

        private ChildrenVisitorInfo(Builder builder) {
            this.dentryActions = builder.dentryActions;
            this.roleCode = builder.roleCode;
            this.spaceActions = builder.spaceActions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildrenVisitorInfo create() {
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

            public ChildrenVisitorInfo build() {
                return new ChildrenVisitorInfo(this);
            } 

        } 

    }
    public static class Children extends TeaModel {
        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Creator")
        private Creator creator;

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
        private LinkSourceInfo linkSourceInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Space")
        private Space space;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("StatisticalInfo")
        private StatisticalInfo statisticalInfo;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("Updater")
        private Updater updater;

        @NameInMap("Url")
        private String url;

        @NameInMap("VisitorInfo")
        private ChildrenVisitorInfo visitorInfo;

        private Children(Builder builder) {
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

        public static Children create() {
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
        public ChildrenVisitorInfo getVisitorInfo() {
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
            private Space space; 
            private String spaceId; 
            private StatisticalInfo statisticalInfo; 
            private Long updatedTime; 
            private Updater updater; 
            private String url; 
            private ChildrenVisitorInfo visitorInfo; 

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
            public Builder linkSourceInfo(LinkSourceInfo linkSourceInfo) {
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
            public Builder space(Space space) {
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
            public Builder visitorInfo(ChildrenVisitorInfo visitorInfo) {
                this.visitorInfo = visitorInfo;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
}
