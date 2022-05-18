// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageVulListResponseBody</p>
 */
public class DescribeImageVulListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VulRecords")
    private java.util.List < VulRecords> vulRecords;

    private DescribeImageVulListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulRecords = builder.vulRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageVulListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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

    /**
     * @return vulRecords
     */
    public java.util.List < VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VulRecords> vulRecords; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VulRecords.
         */
        public Builder vulRecords(java.util.List < VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeImageVulListResponseBody build() {
            return new DescribeImageVulListResponseBody(this);
        } 

    } 

    public static class RpmEntityList extends TeaModel {
        @NameInMap("FullVersion")
        private String fullVersion;

        @NameInMap("Layer")
        private String layer;

        @NameInMap("MatchDetail")
        private String matchDetail;

        @NameInMap("MatchList")
        private java.util.List < String > matchList;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("UpdateCmd")
        private String updateCmd;

        @NameInMap("Version")
        private String version;

        private RpmEntityList(Builder builder) {
            this.fullVersion = builder.fullVersion;
            this.layer = builder.layer;
            this.matchDetail = builder.matchDetail;
            this.matchList = builder.matchList;
            this.name = builder.name;
            this.path = builder.path;
            this.updateCmd = builder.updateCmd;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RpmEntityList create() {
            return builder().build();
        }

        /**
         * @return fullVersion
         */
        public String getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
        }

        /**
         * @return matchDetail
         */
        public String getMatchDetail() {
            return this.matchDetail;
        }

        /**
         * @return matchList
         */
        public java.util.List < String > getMatchList() {
            return this.matchList;
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
         * @return updateCmd
         */
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String fullVersion; 
            private String layer; 
            private String matchDetail; 
            private java.util.List < String > matchList; 
            private String name; 
            private String path; 
            private String updateCmd; 
            private String version; 

            /**
             * FullVersion.
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * MatchDetail.
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * MatchList.
             */
            public Builder matchList(java.util.List < String > matchList) {
                this.matchList = matchList;
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
             * UpdateCmd.
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RpmEntityList build() {
                return new RpmEntityList(this);
            } 

        } 

    }
    public static class ExtendContentJson extends TeaModel {
        @NameInMap("Os")
        private String os;

        @NameInMap("OsRelease")
        private String osRelease;

        @NameInMap("RpmEntityList")
        private java.util.List < RpmEntityList> rpmEntityList;

        private ExtendContentJson(Builder builder) {
            this.os = builder.os;
            this.osRelease = builder.osRelease;
            this.rpmEntityList = builder.rpmEntityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendContentJson create() {
            return builder().build();
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osRelease
         */
        public String getOsRelease() {
            return this.osRelease;
        }

        /**
         * @return rpmEntityList
         */
        public java.util.List < RpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public static final class Builder {
            private String os; 
            private String osRelease; 
            private java.util.List < RpmEntityList> rpmEntityList; 

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsRelease.
             */
            public Builder osRelease(String osRelease) {
                this.osRelease = osRelease;
                return this;
            }

            /**
             * RpmEntityList.
             */
            public Builder rpmEntityList(java.util.List < RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            public ExtendContentJson build() {
                return new ExtendContentJson(this);
            } 

        } 

    }
    public static class VulRecords extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("CanFix")
        private String canFix;

        @NameInMap("CanUpdate")
        private Boolean canUpdate;

        @NameInMap("ExtendContentJson")
        private ExtendContentJson extendContentJson;

        @NameInMap("FirstTs")
        private Long firstTs;

        @NameInMap("ImageDigest")
        private String imageDigest;

        @NameInMap("LastTs")
        private Long lastTs;

        @NameInMap("Layers")
        private java.util.List < String > layers;

        @NameInMap("ModifyTs")
        private Long modifyTs;

        @NameInMap("Name")
        private String name;

        @NameInMap("Necessity")
        private String necessity;

        @NameInMap("PrimaryId")
        private Long primaryId;

        @NameInMap("Related")
        private String related;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;

        private VulRecords(Builder builder) {
            this.aliasName = builder.aliasName;
            this.canFix = builder.canFix;
            this.canUpdate = builder.canUpdate;
            this.extendContentJson = builder.extendContentJson;
            this.firstTs = builder.firstTs;
            this.imageDigest = builder.imageDigest;
            this.lastTs = builder.lastTs;
            this.layers = builder.layers;
            this.modifyTs = builder.modifyTs;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.primaryId = builder.primaryId;
            this.related = builder.related;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.status = builder.status;
            this.tag = builder.tag;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulRecords create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return canFix
         */
        public String getCanFix() {
            return this.canFix;
        }

        /**
         * @return canUpdate
         */
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        /**
         * @return extendContentJson
         */
        public ExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        /**
         * @return firstTs
         */
        public Long getFirstTs() {
            return this.firstTs;
        }

        /**
         * @return imageDigest
         */
        public String getImageDigest() {
            return this.imageDigest;
        }

        /**
         * @return lastTs
         */
        public Long getLastTs() {
            return this.lastTs;
        }

        /**
         * @return layers
         */
        public java.util.List < String > getLayers() {
            return this.layers;
        }

        /**
         * @return modifyTs
         */
        public Long getModifyTs() {
            return this.modifyTs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return related
         */
        public String getRelated() {
            return this.related;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliasName; 
            private String canFix; 
            private Boolean canUpdate; 
            private ExtendContentJson extendContentJson; 
            private Long firstTs; 
            private String imageDigest; 
            private Long lastTs; 
            private java.util.List < String > layers; 
            private Long modifyTs; 
            private String name; 
            private String necessity; 
            private Long primaryId; 
            private String related; 
            private String repoName; 
            private String repoNamespace; 
            private Integer status; 
            private String tag; 
            private String type; 
            private String uuid; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * CanFix.
             */
            public Builder canFix(String canFix) {
                this.canFix = canFix;
                return this;
            }

            /**
             * CanUpdate.
             */
            public Builder canUpdate(Boolean canUpdate) {
                this.canUpdate = canUpdate;
                return this;
            }

            /**
             * ExtendContentJson.
             */
            public Builder extendContentJson(ExtendContentJson extendContentJson) {
                this.extendContentJson = extendContentJson;
                return this;
            }

            /**
             * FirstTs.
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * ImageDigest.
             */
            public Builder imageDigest(String imageDigest) {
                this.imageDigest = imageDigest;
                return this;
            }

            /**
             * LastTs.
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * Layers.
             */
            public Builder layers(java.util.List < String > layers) {
                this.layers = layers;
                return this;
            }

            /**
             * ModifyTs.
             */
            public Builder modifyTs(Long modifyTs) {
                this.modifyTs = modifyTs;
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
             * Necessity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * PrimaryId.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * Related.
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespace.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
