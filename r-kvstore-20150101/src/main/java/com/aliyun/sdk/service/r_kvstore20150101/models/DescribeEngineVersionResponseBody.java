// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEngineVersionResponseBody</p>
 */
public class DescribeEngineVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBLatestMinorVersion")
    private DBLatestMinorVersion DBLatestMinorVersion;

    @com.aliyun.core.annotation.NameInMap("DBVersionRelease")
    private String DBVersionRelease;

    @com.aliyun.core.annotation.NameInMap("EnableUpgradeMajorVersion")
    private Boolean enableUpgradeMajorVersion;

    @com.aliyun.core.annotation.NameInMap("EnableUpgradeMinorVersion")
    private Boolean enableUpgradeMinorVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("IsAutoUpgradeOpen")
    private String isAutoUpgradeOpen;

    @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("IsNewSSLMode")
    private String isNewSSLMode;

    @com.aliyun.core.annotation.NameInMap("IsOpenNGLB")
    private String isOpenNGLB;

    @com.aliyun.core.annotation.NameInMap("IsRedisCompatibleVersion")
    private String isRedisCompatibleVersion;

    @com.aliyun.core.annotation.NameInMap("IsSSLEnable")
    private String isSSLEnable;

    @com.aliyun.core.annotation.NameInMap("MajorVersion")
    private String majorVersion;

    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyLatestMinorVersion")
    private ProxyLatestMinorVersion proxyLatestMinorVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyMinorVersion")
    private String proxyMinorVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyVersionRelease")
    private String proxyVersionRelease;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEngineVersionResponseBody(Builder builder) {
        this.DBLatestMinorVersion = builder.DBLatestMinorVersion;
        this.DBVersionRelease = builder.DBVersionRelease;
        this.enableUpgradeMajorVersion = builder.enableUpgradeMajorVersion;
        this.enableUpgradeMinorVersion = builder.enableUpgradeMinorVersion;
        this.engine = builder.engine;
        this.isAutoUpgradeOpen = builder.isAutoUpgradeOpen;
        this.isLatestVersion = builder.isLatestVersion;
        this.isNewSSLMode = builder.isNewSSLMode;
        this.isOpenNGLB = builder.isOpenNGLB;
        this.isRedisCompatibleVersion = builder.isRedisCompatibleVersion;
        this.isSSLEnable = builder.isSSLEnable;
        this.majorVersion = builder.majorVersion;
        this.minorVersion = builder.minorVersion;
        this.proxyLatestMinorVersion = builder.proxyLatestMinorVersion;
        this.proxyMinorVersion = builder.proxyMinorVersion;
        this.proxyVersionRelease = builder.proxyVersionRelease;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEngineVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBLatestMinorVersion
     */
    public DBLatestMinorVersion getDBLatestMinorVersion() {
        return this.DBLatestMinorVersion;
    }

    /**
     * @return DBVersionRelease
     */
    public String getDBVersionRelease() {
        return this.DBVersionRelease;
    }

    /**
     * @return enableUpgradeMajorVersion
     */
    public Boolean getEnableUpgradeMajorVersion() {
        return this.enableUpgradeMajorVersion;
    }

    /**
     * @return enableUpgradeMinorVersion
     */
    public Boolean getEnableUpgradeMinorVersion() {
        return this.enableUpgradeMinorVersion;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return isAutoUpgradeOpen
     */
    public String getIsAutoUpgradeOpen() {
        return this.isAutoUpgradeOpen;
    }

    /**
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return isNewSSLMode
     */
    public String getIsNewSSLMode() {
        return this.isNewSSLMode;
    }

    /**
     * @return isOpenNGLB
     */
    public String getIsOpenNGLB() {
        return this.isOpenNGLB;
    }

    /**
     * @return isRedisCompatibleVersion
     */
    public String getIsRedisCompatibleVersion() {
        return this.isRedisCompatibleVersion;
    }

    /**
     * @return isSSLEnable
     */
    public String getIsSSLEnable() {
        return this.isSSLEnable;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return proxyLatestMinorVersion
     */
    public ProxyLatestMinorVersion getProxyLatestMinorVersion() {
        return this.proxyLatestMinorVersion;
    }

    /**
     * @return proxyMinorVersion
     */
    public String getProxyMinorVersion() {
        return this.proxyMinorVersion;
    }

    /**
     * @return proxyVersionRelease
     */
    public String getProxyVersionRelease() {
        return this.proxyVersionRelease;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBLatestMinorVersion DBLatestMinorVersion; 
        private String DBVersionRelease; 
        private Boolean enableUpgradeMajorVersion; 
        private Boolean enableUpgradeMinorVersion; 
        private String engine; 
        private String isAutoUpgradeOpen; 
        private Boolean isLatestVersion; 
        private String isNewSSLMode; 
        private String isOpenNGLB; 
        private String isRedisCompatibleVersion; 
        private String isSSLEnable; 
        private String majorVersion; 
        private String minorVersion; 
        private ProxyLatestMinorVersion proxyLatestMinorVersion; 
        private String proxyMinorVersion; 
        private String proxyVersionRelease; 
        private String requestId; 

        /**
         * <p>该实例当前可升级至最新的小版本信息。</p>
         */
        public Builder DBLatestMinorVersion(DBLatestMinorVersion DBLatestMinorVersion) {
            this.DBLatestMinorVersion = DBLatestMinorVersion;
            return this;
        }

        /**
         * <p>The release notes for the minor version of the instance, including the release date, minor version number, release type such as new feature, and description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;releaseInfo&quot;:{&quot;createTime&quot;:&quot;2021-07-27&quot;,&quot;level&quot;:1,&quot;releaseVersion&quot;:&quot;0.5.4&quot;,&quot;releaseNote&quot;:&quot;功能更新：增强稳定性。&quot;}],&quot;versionChangesLevel&quot;:2}</p>
         */
        public Builder DBVersionRelease(String DBVersionRelease) {
            this.DBVersionRelease = DBVersionRelease;
            return this;
        }

        /**
         * <p>Indicates whether the major version can be upgraded for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The major version can be upgraded.</li>
         * <li><strong>false</strong>: The major version is the latest version and cannot be upgraded.</li>
         * </ul>
         * <blockquote>
         * <p> To upgrade the major version, call the <a href="https://help.aliyun.com/document_detail/95259.html">ModifyInstanceMajorVersion</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
            this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
            return this;
        }

        /**
         * <p>Indicates whether the minor version can be updated for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The minor version can be updated.</li>
         * <li><strong>false</strong>: The minor version is the latest version and cannot be updated.</li>
         * </ul>
         * <blockquote>
         * <p> To update the minor version, call the <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUpgradeMinorVersion(Boolean enableUpgradeMinorVersion) {
            this.enableUpgradeMinorVersion = enableUpgradeMinorVersion;
            return this;
        }

        /**
         * <p>The database engine of the instance. Valid values: <strong>redis</strong> and <strong>memcache</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>是否打开了小版本升级。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isAutoUpgradeOpen(String isAutoUpgradeOpen) {
            this.isAutoUpgradeOpen = isAutoUpgradeOpen;
            return this;
        }

        /**
         * <p>Indicates whether the instance minor version is the latest version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance minor version is the latest version.</li>
         * <li><strong>false</strong>: The instance minor version is not the latest version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * <p>是否支持新版 ssl。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isNewSSLMode(String isNewSSLMode) {
            this.isNewSSLMode = isNewSSLMode;
            return this;
        }

        /**
         * IsOpenNGLB.
         */
        public Builder isOpenNGLB(String isOpenNGLB) {
            this.isOpenNGLB = isOpenNGLB;
            return this;
        }

        /**
         * <p>Indicates whether the instance supports the new SSL encryption feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isRedisCompatibleVersion(String isRedisCompatibleVersion) {
            this.isRedisCompatibleVersion = isRedisCompatibleVersion;
            return this;
        }

        /**
         * <p>是否打开了小版本升级。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isSSLEnable(String isSSLEnable) {
            this.isSSLEnable = isSSLEnable;
            return this;
        }

        /**
         * <p>The major version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder majorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * <p>The minor version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>redis-5.0_0.5.0</p>
         */
        public Builder minorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * <p>该Proxy节点当前可升级至最新的小版本信息。</p>
         */
        public Builder proxyLatestMinorVersion(ProxyLatestMinorVersion proxyLatestMinorVersion) {
            this.proxyLatestMinorVersion = proxyLatestMinorVersion;
            return this;
        }

        /**
         * <p>The minor version of proxy nodes.</p>
         * <blockquote>
         * <p> This parameter is returned only for cluster and read/write splitting instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6.6.0</p>
         */
        public Builder proxyMinorVersion(String proxyMinorVersion) {
            this.proxyMinorVersion = proxyMinorVersion;
            return this;
        }

        /**
         * <p>The release notes for the minor version of proxy nodes. The release notes include the release date, minor version number, release type such as new feature, and description.</p>
         * <blockquote>
         * <p> This parameter is returned only for cluster and read/write splitting instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;releaseInfo&quot;:[{&quot;createTime&quot;:&quot;2021-06-08&quot;,&quot;level&quot;:0,&quot;releaseVersion&quot;:&quot;6.6.2&quot;,&quot;releaseNote&quot;:&quot;新特性：增加对部分内部命令的支持。&quot;}],&quot;versionChangesLevel&quot;:2}</p>
         */
        public Builder proxyVersionRelease(String proxyVersionRelease) {
            this.proxyVersionRelease = proxyVersionRelease;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A52974D1-9D57-4805-86CC-92E6EDE8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEngineVersionResponseBody build() {
            return new DescribeEngineVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class ReleaseInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        private ReleaseInfoList(Builder builder) {
            this.createTime = builder.createTime;
            this.level = builder.level;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseVersion = builder.releaseVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseInfoList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseNoteEn
         */
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public static final class Builder {
            private String createTime; 
            private String level; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseVersion; 

            /**
             * <p>实例的创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-21T13:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>重要等级。</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>版本发布说明。</p>
             * 
             * <strong>example:</strong>
             * <p>发布说明</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>可升级的版本英文描述。</p>
             * 
             * <strong>example:</strong>
             * <p>版本升级英文描述</p>
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * <p>EMR发行版。</p>
             * 
             * <strong>example:</strong>
             * <p>EMR-5.7.0</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            public ReleaseInfoList build() {
                return new ReleaseInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class ReleaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseInfoList")
        private java.util.List < ReleaseInfoList> releaseInfoList;

        private ReleaseInfo(Builder builder) {
            this.releaseInfoList = builder.releaseInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseInfo create() {
            return builder().build();
        }

        /**
         * @return releaseInfoList
         */
        public java.util.List < ReleaseInfoList> getReleaseInfoList() {
            return this.releaseInfoList;
        }

        public static final class Builder {
            private java.util.List < ReleaseInfoList> releaseInfoList; 

            /**
             * ReleaseInfoList.
             */
            public Builder releaseInfoList(java.util.List < ReleaseInfoList> releaseInfoList) {
                this.releaseInfoList = releaseInfoList;
                return this;
            }

            public ReleaseInfo build() {
                return new ReleaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class VersionRelease extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseInfo")
        private ReleaseInfo releaseInfo;

        @com.aliyun.core.annotation.NameInMap("VersionChangesLevel")
        private String versionChangesLevel;

        private VersionRelease(Builder builder) {
            this.releaseInfo = builder.releaseInfo;
            this.versionChangesLevel = builder.versionChangesLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionRelease create() {
            return builder().build();
        }

        /**
         * @return releaseInfo
         */
        public ReleaseInfo getReleaseInfo() {
            return this.releaseInfo;
        }

        /**
         * @return versionChangesLevel
         */
        public String getVersionChangesLevel() {
            return this.versionChangesLevel;
        }

        public static final class Builder {
            private ReleaseInfo releaseInfo; 
            private String versionChangesLevel; 

            /**
             * <p>小版本信息。</p>
             */
            public Builder releaseInfo(ReleaseInfo releaseInfo) {
                this.releaseInfo = releaseInfo;
                return this;
            }

            /**
             * <p>版本升级的重要性（推荐升级程度），取值：</p>
             * <ul>
             * <li>0：一般重要</li>
             * <li>1：比较重要</li>
             * <li>2：非常重要</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder versionChangesLevel(String versionChangesLevel) {
                this.versionChangesLevel = versionChangesLevel;
                return this;
            }

            public VersionRelease build() {
                return new VersionRelease(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class DBLatestMinorVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("VersionRelease")
        private VersionRelease versionRelease;

        private DBLatestMinorVersion(Builder builder) {
            this.level = builder.level;
            this.minorVersion = builder.minorVersion;
            this.versionRelease = builder.versionRelease;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBLatestMinorVersion create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return versionRelease
         */
        public VersionRelease getVersionRelease() {
            return this.versionRelease;
        }

        public static final class Builder {
            private String level; 
            private String minorVersion; 
            private VersionRelease versionRelease; 

            /**
             * <p>版本变更的重要性，取值：</p>
             * <ul>
             * <li><strong>0</strong>：一般重要</li>
             * <li><strong>1</strong>：比较重要</li>
             * <li><strong>2</strong>：非常重要</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>版本号。</p>
             * 
             * <strong>example:</strong>
             * <p>7.0.1.4</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>从实例当前小版本到最新小版本的版本演进路线，与版本文档一致，可以直接至版本说明文档查看更详细的信息。</p>
             */
            public Builder versionRelease(VersionRelease versionRelease) {
                this.versionRelease = versionRelease;
                return this;
            }

            public DBLatestMinorVersion build() {
                return new DBLatestMinorVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class ReleaseInfoReleaseInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        private ReleaseInfoReleaseInfoList(Builder builder) {
            this.createTime = builder.createTime;
            this.level = builder.level;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseVersion = builder.releaseVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseInfoReleaseInfoList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseNoteEn
         */
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public static final class Builder {
            private String createTime; 
            private String level; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseVersion; 

            /**
             * <p>版本的发布时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-23T14:26:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>版本变更的重要性，取值：</p>
             * <ul>
             * <li><strong>0</strong>：一般重要</li>
             * <li><strong>1</strong>：比较重要</li>
             * <li><strong>2</strong>：非常重要</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>版本的变更说明。</p>
             * 
             * <strong>example:</strong>
             * <p>版本变更说明</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>可升级的版本英文描述。</p>
             * 
             * <strong>example:</strong>
             * <p>版本升级英文描述</p>
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * <p>EMR发行版。</p>
             * 
             * <strong>example:</strong>
             * <p>EMR-5.9.1</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            public ReleaseInfoReleaseInfoList build() {
                return new ReleaseInfoReleaseInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class VersionReleaseReleaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseInfoList")
        private java.util.List < ReleaseInfoReleaseInfoList> releaseInfoList;

        private VersionReleaseReleaseInfo(Builder builder) {
            this.releaseInfoList = builder.releaseInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionReleaseReleaseInfo create() {
            return builder().build();
        }

        /**
         * @return releaseInfoList
         */
        public java.util.List < ReleaseInfoReleaseInfoList> getReleaseInfoList() {
            return this.releaseInfoList;
        }

        public static final class Builder {
            private java.util.List < ReleaseInfoReleaseInfoList> releaseInfoList; 

            /**
             * ReleaseInfoList.
             */
            public Builder releaseInfoList(java.util.List < ReleaseInfoReleaseInfoList> releaseInfoList) {
                this.releaseInfoList = releaseInfoList;
                return this;
            }

            public VersionReleaseReleaseInfo build() {
                return new VersionReleaseReleaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class ProxyLatestMinorVersionVersionRelease extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseInfo")
        private VersionReleaseReleaseInfo releaseInfo;

        @com.aliyun.core.annotation.NameInMap("VersionChangesLevel")
        private String versionChangesLevel;

        private ProxyLatestMinorVersionVersionRelease(Builder builder) {
            this.releaseInfo = builder.releaseInfo;
            this.versionChangesLevel = builder.versionChangesLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyLatestMinorVersionVersionRelease create() {
            return builder().build();
        }

        /**
         * @return releaseInfo
         */
        public VersionReleaseReleaseInfo getReleaseInfo() {
            return this.releaseInfo;
        }

        /**
         * @return versionChangesLevel
         */
        public String getVersionChangesLevel() {
            return this.versionChangesLevel;
        }

        public static final class Builder {
            private VersionReleaseReleaseInfo releaseInfo; 
            private String versionChangesLevel; 

            /**
             * <p>小版本信息。</p>
             */
            public Builder releaseInfo(VersionReleaseReleaseInfo releaseInfo) {
                this.releaseInfo = releaseInfo;
                return this;
            }

            /**
             * <p>版本升级的重要性（推荐升级程度），取值：</p>
             * <ul>
             * <li>0：一般重要</li>
             * <li>1：比较重要</li>
             * <li>2：非常重要</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder versionChangesLevel(String versionChangesLevel) {
                this.versionChangesLevel = versionChangesLevel;
                return this;
            }

            public ProxyLatestMinorVersionVersionRelease build() {
                return new ProxyLatestMinorVersionVersionRelease(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEngineVersionResponseBody</p>
     */
    public static class ProxyLatestMinorVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("VersionRelease")
        private ProxyLatestMinorVersionVersionRelease versionRelease;

        private ProxyLatestMinorVersion(Builder builder) {
            this.level = builder.level;
            this.minorVersion = builder.minorVersion;
            this.versionRelease = builder.versionRelease;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyLatestMinorVersion create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return versionRelease
         */
        public ProxyLatestMinorVersionVersionRelease getVersionRelease() {
            return this.versionRelease;
        }

        public static final class Builder {
            private String level; 
            private String minorVersion; 
            private ProxyLatestMinorVersionVersionRelease versionRelease; 

            /**
             * <p>版本变更的重要性，取值：</p>
             * <ul>
             * <li><strong>0</strong>：一般重要</li>
             * <li><strong>1</strong>：比较重要</li>
             * <li><strong>2</strong>：非常重要</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>版本号。</p>
             * 
             * <strong>example:</strong>
             * <p>7.0.6</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>从实例当前小版本到最新小版本的版本演进路线，与版本文档一致，可以直接至版本说明文档查看更详细的信息。</p>
             */
            public Builder versionRelease(ProxyLatestMinorVersionVersionRelease versionRelease) {
                this.versionRelease = versionRelease;
                return this;
            }

            public ProxyLatestMinorVersion build() {
                return new ProxyLatestMinorVersion(this);
            } 

        } 

    }
}
