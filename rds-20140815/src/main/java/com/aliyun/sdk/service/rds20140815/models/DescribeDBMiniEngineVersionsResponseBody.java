// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBMiniEngineVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBMiniEngineVersionsResponseBody</p>
 */
public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("MaxRecordsPerPage")
    private Integer maxRecordsPerPage;

    @NameInMap("MinorVersionItems")
    private java.util.List < MinorVersionItems> minorVersionItems;

    @NameInMap("PageNumbers")
    private Integer pageNumbers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBMiniEngineVersionsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.minorVersionItems = builder.minorVersionItems;
        this.pageNumbers = builder.pageNumbers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBMiniEngineVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return maxRecordsPerPage
     */
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    /**
     * @return minorVersionItems
     */
    public java.util.List < MinorVersionItems> getMinorVersionItems() {
        return this.minorVersionItems;
    }

    /**
     * @return pageNumbers
     */
    public Integer getPageNumbers() {
        return this.pageNumbers;
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
        private String DBInstanceId; 
        private Integer maxRecordsPerPage; 
        private java.util.List < MinorVersionItems> minorVersionItems; 
        private Integer pageNumbers; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * MaxRecordsPerPage.
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * MinorVersionItems.
         */
        public Builder minorVersionItems(java.util.List < MinorVersionItems> minorVersionItems) {
            this.minorVersionItems = minorVersionItems;
            return this;
        }

        /**
         * PageNumbers.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
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

        public DescribeDBMiniEngineVersionsResponseBody build() {
            return new DescribeDBMiniEngineVersionsResponseBody(this);
        } 

    } 

    public static class MinorVersionItems extends TeaModel {
        @NameInMap("CommunityMinorVersion")
        private String communityMinorVersion;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("IsHotfixVersion")
        private Boolean isHotfixVersion;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("ReleaseType")
        private String releaseType;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Tag")
        private String tag;

        private MinorVersionItems(Builder builder) {
            this.communityMinorVersion = builder.communityMinorVersion;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.isHotfixVersion = builder.isHotfixVersion;
            this.minorVersion = builder.minorVersion;
            this.nodeType = builder.nodeType;
            this.releaseNote = builder.releaseNote;
            this.releaseType = builder.releaseType;
            this.statusDesc = builder.statusDesc;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinorVersionItems create() {
            return builder().build();
        }

        /**
         * @return communityMinorVersion
         */
        public String getCommunityMinorVersion() {
            return this.communityMinorVersion;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return isHotfixVersion
         */
        public Boolean getIsHotfixVersion() {
            return this.isHotfixVersion;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String communityMinorVersion; 
            private String engine; 
            private String engineVersion; 
            private Boolean isHotfixVersion; 
            private String minorVersion; 
            private String nodeType; 
            private String releaseNote; 
            private String releaseType; 
            private String statusDesc; 
            private String tag; 

            /**
             * CommunityMinorVersion.
             */
            public Builder communityMinorVersion(String communityMinorVersion) {
                this.communityMinorVersion = communityMinorVersion;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * IsHotfixVersion.
             */
            public Builder isHotfixVersion(Boolean isHotfixVersion) {
                this.isHotfixVersion = isHotfixVersion;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * ReleaseType.
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public MinorVersionItems build() {
                return new MinorVersionItems(this);
            } 

        } 

    }
}
