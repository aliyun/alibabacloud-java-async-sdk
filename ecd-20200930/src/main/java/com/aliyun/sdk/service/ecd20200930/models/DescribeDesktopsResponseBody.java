// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopsResponseBody</p>
 */
public class DescribeDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List<Desktops> desktops;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDesktopsResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktops
     */
    public java.util.List<Desktops> getDesktops() {
        return this.desktops;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Desktops> desktops; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDesktopsResponseBody model) {
            this.desktops = model.desktops;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cloud computers.</p>
         */
        public Builder desktops(java.util.List<Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * <p>The token that is used for the next query. If this parameter is left empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>484256DA-D816-44D2-9D86-B6EE4D5BA78C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopsResponseBody build() {
            return new DescribeDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class DesktopDurationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @com.aliyun.core.annotation.NameInMap("PackageCreationTime")
        private String packageCreationTime;

        @com.aliyun.core.annotation.NameInMap("PackageExpiredTime")
        private String packageExpiredTime;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("PackageStatus")
        private String packageStatus;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUsedUpStrategy")
        private String packageUsedUpStrategy;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("PostPaidLimitFee")
        private Float postPaidLimitFee;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UsedDuration")
        private Long usedDuration;

        private DesktopDurationList(Builder builder) {
            this.orderInstanceId = builder.orderInstanceId;
            this.packageCreationTime = builder.packageCreationTime;
            this.packageExpiredTime = builder.packageExpiredTime;
            this.packageId = builder.packageId;
            this.packageStatus = builder.packageStatus;
            this.packageType = builder.packageType;
            this.packageUsedUpStrategy = builder.packageUsedUpStrategy;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.postPaidLimitFee = builder.postPaidLimitFee;
            this.totalDuration = builder.totalDuration;
            this.usedDuration = builder.usedDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopDurationList create() {
            return builder().build();
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        /**
         * @return packageCreationTime
         */
        public String getPackageCreationTime() {
            return this.packageCreationTime;
        }

        /**
         * @return packageExpiredTime
         */
        public String getPackageExpiredTime() {
            return this.packageExpiredTime;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUsedUpStrategy
         */
        public String getPackageUsedUpStrategy() {
            return this.packageUsedUpStrategy;
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
         * @return postPaidLimitFee
         */
        public Float getPostPaidLimitFee() {
            return this.postPaidLimitFee;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return usedDuration
         */
        public Long getUsedDuration() {
            return this.usedDuration;
        }

        public static final class Builder {
            private String orderInstanceId; 
            private String packageCreationTime; 
            private String packageExpiredTime; 
            private String packageId; 
            private String packageStatus; 
            private String packageType; 
            private String packageUsedUpStrategy; 
            private String periodEndTime; 
            private String periodStartTime; 
            private Float postPaidLimitFee; 
            private Long totalDuration; 
            private Long usedDuration; 

            private Builder() {
            } 

            private Builder(DesktopDurationList model) {
                this.orderInstanceId = model.orderInstanceId;
                this.packageCreationTime = model.packageCreationTime;
                this.packageExpiredTime = model.packageExpiredTime;
                this.packageId = model.packageId;
                this.packageStatus = model.packageStatus;
                this.packageType = model.packageType;
                this.packageUsedUpStrategy = model.packageUsedUpStrategy;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.postPaidLimitFee = model.postPaidLimitFee;
                this.totalDuration = model.totalDuration;
                this.usedDuration = model.usedDuration;
            } 

            /**
             * OrderInstanceId.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * PackageCreationTime.
             */
            public Builder packageCreationTime(String packageCreationTime) {
                this.packageCreationTime = packageCreationTime;
                return this;
            }

            /**
             * PackageExpiredTime.
             */
            public Builder packageExpiredTime(String packageExpiredTime) {
                this.packageExpiredTime = packageExpiredTime;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * PackageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageUsedUpStrategy.
             */
            public Builder packageUsedUpStrategy(String packageUsedUpStrategy) {
                this.packageUsedUpStrategy = packageUsedUpStrategy;
                return this;
            }

            /**
             * PeriodEndTime.
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * PeriodStartTime.
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * PostPaidLimitFee.
             */
            public Builder postPaidLimitFee(Float postPaidLimitFee) {
                this.postPaidLimitFee = postPaidLimitFee;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * UsedDuration.
             */
            public Builder usedDuration(Long usedDuration) {
                this.usedDuration = usedDuration;
                return this;
            }

            public DesktopDurationList build() {
                return new DesktopDurationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disks(Builder builder) {
            this.diskCategory = builder.diskCategory;
            this.diskId = builder.diskId;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String diskCategory; 
            private String diskId; 
            private Integer diskSize; 
            private String diskType; 
            private String performanceLevel; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.diskCategory = model.diskCategory;
                this.diskId = model.diskId;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * <p>The type of the disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_auto: standard SSD.</li>
             * <li>cloud_essd: enhanced SSD (ESSD).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * <p>The disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-jedbpr4sl9l37****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>DATA: data disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the disk when an enterprise SSD (ESSD) is used.</p>
             * <p>For more information about the differences among enterprise SSDs (ESSDs) at different PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PL1</li>
             * <li>PL0</li>
             * <li>PL3</li>
             * <li>PL2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class FotaUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("NewAppVersion")
        private String newAppVersion;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteEn")
        private String releaseNoteEn;

        @com.aliyun.core.annotation.NameInMap("ReleaseNoteJp")
        private String releaseNoteJp;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private FotaUpdate(Builder builder) {
            this.currentAppVersion = builder.currentAppVersion;
            this.newAppVersion = builder.newAppVersion;
            this.releaseNote = builder.releaseNote;
            this.releaseNoteEn = builder.releaseNoteEn;
            this.releaseNoteJp = builder.releaseNoteJp;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaUpdate create() {
            return builder().build();
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return newAppVersion
         */
        public String getNewAppVersion() {
            return this.newAppVersion;
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
         * @return releaseNoteJp
         */
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String currentAppVersion; 
            private String newAppVersion; 
            private String releaseNote; 
            private String releaseNoteEn; 
            private String releaseNoteJp; 
            private Long size; 

            private Builder() {
            } 

            private Builder(FotaUpdate model) {
                this.currentAppVersion = model.currentAppVersion;
                this.newAppVersion = model.newAppVersion;
                this.releaseNote = model.releaseNote;
                this.releaseNoteEn = model.releaseNoteEn;
                this.releaseNoteJp = model.releaseNoteJp;
                this.size = model.size;
            } 

            /**
             * <p>The current image version of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0-D-20220102.000000</p>
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * <p>The version number to which the image of the cloud computer can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0-R-20220307.190736</p>
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * <p>The description of the version to which the image of the cloud computer can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>Upgrade package for testing 03-07</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The English description of the version to which the image of the cloud computer can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>Release note</p>
             */
            public Builder releaseNoteEn(String releaseNoteEn) {
                this.releaseNoteEn = releaseNoteEn;
                return this;
            }

            /**
             * <p>The Japanese description of the image version to which the cloud desktop can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>リリースノート</p>
             */
            public Builder releaseNoteJp(String releaseNoteJp) {
                this.releaseNoteJp = releaseNoteJp;
                return this;
            }

            /**
             * <p>The size of the installation package for the image to which the cloud desktop can be updated. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>108815097</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public FotaUpdate build() {
                return new FotaUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Kb")
        private String kb;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Packages(Builder builder) {
            this.description = builder.description;
            this.kb = builder.kb;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return kb
         */
        public String getKb() {
            return this.kb;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String kb; 
            private String title; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this.description = model.description;
                this.kb = model.kb;
                this.title = model.title;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Kb.
             */
            public Builder kb(String kb) {
                this.kb = kb;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class OsUpdate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("PackageCount")
        private Integer packageCount;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private java.util.List<Packages> packages;

        private OsUpdate(Builder builder) {
            this.checkId = builder.checkId;
            this.packageCount = builder.packageCount;
            this.packages = builder.packages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsUpdate create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return packageCount
         */
        public Integer getPackageCount() {
            return this.packageCount;
        }

        /**
         * @return packages
         */
        public java.util.List<Packages> getPackages() {
            return this.packages;
        }

        public static final class Builder {
            private String checkId; 
            private Integer packageCount; 
            private java.util.List<Packages> packages; 

            private Builder() {
            } 

            private Builder(OsUpdate model) {
                this.checkId = model.checkId;
                this.packageCount = model.packageCount;
                this.packages = model.packages;
            } 

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * PackageCount.
             */
            public Builder packageCount(Integer packageCount) {
                this.packageCount = packageCount;
                return this;
            }

            /**
             * Packages.
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
                return this;
            }

            public OsUpdate build() {
                return new OsUpdate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class ResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ResourceGroups(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroups create() {
            return builder().build();
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

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ResourceGroups model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The ID of the enterprise resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-4hsvzbbmqdzu3s****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the enterprise resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource group 01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EstablishmentTime")
        private String establishmentTime;

        @com.aliyun.core.annotation.NameInMap("ExternalUserName")
        private String externalUserName;

        private Sessions(Builder builder) {
            this.endUserId = builder.endUserId;
            this.establishmentTime = builder.establishmentTime;
            this.externalUserName = builder.externalUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return establishmentTime
         */
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        /**
         * @return externalUserName
         */
        public String getExternalUserName() {
            return this.externalUserName;
        }

        public static final class Builder {
            private String endUserId; 
            private String establishmentTime; 
            private String externalUserName; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.endUserId = model.endUserId;
                this.establishmentTime = model.establishmentTime;
                this.externalUserName = model.externalUserName;
            } 

            /**
             * <p>The ID of the end user that connects to the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>29615820929547****</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the cloud computer session was established.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-07T08:23Z</p>
             */
            public Builder establishmentTime(String establishmentTime) {
                this.establishmentTime = establishmentTime;
                return this;
            }

            /**
             * <p>The name of the external user.</p>
             * 
             * <strong>example:</strong>
             * <p>Testname</p>
             */
            public Builder externalUserName(String externalUserName) {
                this.externalUserName = externalUserName;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
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
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
     * {@link DescribeDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopsResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindAmount")
        private Integer bindAmount;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("BundleName")
        private String bundleName;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DesktopDurationList")
        private java.util.List<DesktopDurationList> desktopDurationList;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("DowngradeQuota")
        private Long downgradeQuota;

        @com.aliyun.core.annotation.NameInMap("DowngradedTimes")
        private Long downgradedTimes;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FotaUpdate")
        private FotaUpdate fotaUpdate;

        @com.aliyun.core.annotation.NameInMap("GpuCategory")
        private Long gpuCategory;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Float gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("HibernationBeta")
        private Boolean hibernationBeta;

        @com.aliyun.core.annotation.NameInMap("HibernationOptionsConfigured")
        private Boolean hibernationOptionsConfigured;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("IsLdap")
        private Boolean isLdap;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private String managementFlag;

        @com.aliyun.core.annotation.NameInMap("ManagementFlags")
        private java.util.List<String> managementFlags;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteVpcType")
        private String officeSiteVpcType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OsUpdate")
        private OsUpdate osUpdate;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupIdList")
        private java.util.List<String> policyGroupIdList;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
        private String policyGroupName;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupNameList")
        private java.util.List<String> policyGroupNameList;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroups")
        private java.util.List<ResourceGroups> resourceGroups;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
        private String snapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("SnapshotPolicyName")
        private String snapshotPolicyName;

        @com.aliyun.core.annotation.NameInMap("StandardStartTime")
        private String standardStartTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SupportHibernation")
        private Boolean supportHibernation;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
        private String zoneType;

        private Desktops(Builder builder) {
            this.bindAmount = builder.bindAmount;
            this.bundleId = builder.bundleId;
            this.bundleName = builder.bundleName;
            this.chargeType = builder.chargeType;
            this.connectionStatus = builder.connectionStatus;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopDurationList = builder.desktopDurationList;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.desktopType = builder.desktopType;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.disks = builder.disks;
            this.downgradeQuota = builder.downgradeQuota;
            this.downgradedTimes = builder.downgradedTimes;
            this.endUserIds = builder.endUserIds;
            this.expiredTime = builder.expiredTime;
            this.fotaUpdate = builder.fotaUpdate;
            this.gpuCategory = builder.gpuCategory;
            this.gpuCount = builder.gpuCount;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuSpec = builder.gpuSpec;
            this.hibernationBeta = builder.hibernationBeta;
            this.hibernationOptionsConfigured = builder.hibernationOptionsConfigured;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.isLdap = builder.isLdap;
            this.managementFlag = builder.managementFlag;
            this.managementFlags = builder.managementFlags;
            this.memory = builder.memory;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.officeSiteVpcType = builder.officeSiteVpcType;
            this.osType = builder.osType;
            this.osUpdate = builder.osUpdate;
            this.platform = builder.platform;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupIdList = builder.policyGroupIdList;
            this.policyGroupName = builder.policyGroupName;
            this.policyGroupNameList = builder.policyGroupNameList;
            this.progress = builder.progress;
            this.protocolType = builder.protocolType;
            this.resourceGroups = builder.resourceGroups;
            this.sessionType = builder.sessionType;
            this.sessions = builder.sessions;
            this.snapshotPolicyId = builder.snapshotPolicyId;
            this.snapshotPolicyName = builder.snapshotPolicyName;
            this.standardStartTime = builder.standardStartTime;
            this.startTime = builder.startTime;
            this.supportHibernation = builder.supportHibernation;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return bindAmount
         */
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return bundleName
         */
        public String getBundleName() {
            return this.bundleName;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return desktopDurationList
         */
        public java.util.List<DesktopDurationList> getDesktopDurationList() {
            return this.desktopDurationList;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return disks
         */
        public java.util.List<Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return downgradeQuota
         */
        public Long getDowngradeQuota() {
            return this.downgradeQuota;
        }

        /**
         * @return downgradedTimes
         */
        public Long getDowngradedTimes() {
            return this.downgradedTimes;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return fotaUpdate
         */
        public FotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        /**
         * @return gpuCategory
         */
        public Long getGpuCategory() {
            return this.gpuCategory;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return hibernationBeta
         */
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        /**
         * @return hibernationOptionsConfigured
         */
        public Boolean getHibernationOptionsConfigured() {
            return this.hibernationOptionsConfigured;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return isLdap
         */
        public Boolean getIsLdap() {
            return this.isLdap;
        }

        /**
         * @return managementFlag
         */
        public String getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return managementFlags
         */
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return officeSiteVpcType
         */
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return osUpdate
         */
        public OsUpdate getOsUpdate() {
            return this.osUpdate;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return policyGroupIdList
         */
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        /**
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return policyGroupNameList
         */
        public java.util.List<String> getPolicyGroupNameList() {
            return this.policyGroupNameList;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return resourceGroups
         */
        public java.util.List<ResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return sessions
         */
        public java.util.List<Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return snapshotPolicyId
         */
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        /**
         * @return snapshotPolicyName
         */
        public String getSnapshotPolicyName() {
            return this.snapshotPolicyName;
        }

        /**
         * @return standardStartTime
         */
        public String getStandardStartTime() {
            return this.standardStartTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return supportHibernation
         */
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private Integer bindAmount; 
            private String bundleId; 
            private String bundleName; 
            private String chargeType; 
            private String connectionStatus; 
            private Integer cpu; 
            private String creationTime; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private java.util.List<DesktopDurationList> desktopDurationList; 
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String desktopType; 
            private String directoryId; 
            private String directoryType; 
            private java.util.List<Disks> disks; 
            private Long downgradeQuota; 
            private Long downgradedTimes; 
            private java.util.List<String> endUserIds; 
            private String expiredTime; 
            private FotaUpdate fotaUpdate; 
            private Long gpuCategory; 
            private Float gpuCount; 
            private String gpuDriverVersion; 
            private String gpuSpec; 
            private Boolean hibernationBeta; 
            private Boolean hibernationOptionsConfigured; 
            private String hostName; 
            private String imageId; 
            private Boolean isLdap; 
            private String managementFlag; 
            private java.util.List<String> managementFlags; 
            private Long memory; 
            private String networkInterfaceId; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String officeSiteVpcType; 
            private String osType; 
            private OsUpdate osUpdate; 
            private String platform; 
            private String policyGroupId; 
            private java.util.List<String> policyGroupIdList; 
            private String policyGroupName; 
            private java.util.List<String> policyGroupNameList; 
            private String progress; 
            private String protocolType; 
            private java.util.List<ResourceGroups> resourceGroups; 
            private String sessionType; 
            private java.util.List<Sessions> sessions; 
            private String snapshotPolicyId; 
            private String snapshotPolicyName; 
            private String standardStartTime; 
            private String startTime; 
            private Boolean supportHibernation; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List<Tags> tags; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 
            private String zoneType; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.bindAmount = model.bindAmount;
                this.bundleId = model.bundleId;
                this.bundleName = model.bundleName;
                this.chargeType = model.chargeType;
                this.connectionStatus = model.connectionStatus;
                this.cpu = model.cpu;
                this.creationTime = model.creationTime;
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskSize = model.dataDiskSize;
                this.desktopDurationList = model.desktopDurationList;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.desktopType = model.desktopType;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.disks = model.disks;
                this.downgradeQuota = model.downgradeQuota;
                this.downgradedTimes = model.downgradedTimes;
                this.endUserIds = model.endUserIds;
                this.expiredTime = model.expiredTime;
                this.fotaUpdate = model.fotaUpdate;
                this.gpuCategory = model.gpuCategory;
                this.gpuCount = model.gpuCount;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.gpuSpec = model.gpuSpec;
                this.hibernationBeta = model.hibernationBeta;
                this.hibernationOptionsConfigured = model.hibernationOptionsConfigured;
                this.hostName = model.hostName;
                this.imageId = model.imageId;
                this.isLdap = model.isLdap;
                this.managementFlag = model.managementFlag;
                this.managementFlags = model.managementFlags;
                this.memory = model.memory;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.officeSiteVpcType = model.officeSiteVpcType;
                this.osType = model.osType;
                this.osUpdate = model.osUpdate;
                this.platform = model.platform;
                this.policyGroupId = model.policyGroupId;
                this.policyGroupIdList = model.policyGroupIdList;
                this.policyGroupName = model.policyGroupName;
                this.policyGroupNameList = model.policyGroupNameList;
                this.progress = model.progress;
                this.protocolType = model.protocolType;
                this.resourceGroups = model.resourceGroups;
                this.sessionType = model.sessionType;
                this.sessions = model.sessions;
                this.snapshotPolicyId = model.snapshotPolicyId;
                this.snapshotPolicyName = model.snapshotPolicyName;
                this.standardStartTime = model.standardStartTime;
                this.startTime = model.startTime;
                this.supportHibernation = model.supportHibernation;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
                this.zoneType = model.zoneType;
            } 

            /**
             * <p>The number of concurrent sessions of each cloud computer in a multi-session cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * <p>The ID of the template used to create the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>b-2g65ljy4291vl****</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The name of the template used to create the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder bundleName(String bundleName) {
                this.bundleName = bundleName;
                return this;
            }

            /**
             * <p>The billing method of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Postpaid (default): pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The connection status of the end user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Unknown</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Connected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Disconnected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the cloud computer was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DesktopDurationList.
             */
            public Builder desktopDurationList(java.util.List<DesktopDurationList> desktopDurationList) {
                this.desktopDurationList = desktopDurationList;
                return this;
            }

            /**
             * <p>The ID of the cloud computer pool to which cloud computers belong. Default value: null.``</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesktopName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The cloud computer status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The cloud computer type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd.basic.large</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The directory ID, which is the same as the office network ID (OfficeSiteId).</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The information about the disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>The number of times for which the cloud desktop can be downgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder downgradeQuota(Long downgradeQuota) {
                this.downgradeQuota = downgradeQuota;
                return this;
            }

            /**
             * <p>The number of times for which the cloud desktop has been downgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder downgradedTimes(Long downgradedTimes) {
                this.downgradedTimes = downgradedTimes;
                return this;
            }

            /**
             * <p>The end user IDs.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The time when a subscription cloud computer expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-31T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The information about the image version of the cloud computer.</p>
             */
            public Builder fotaUpdate(FotaUpdate fotaUpdate) {
                this.fotaUpdate = fotaUpdate;
                return this;
            }

            /**
             * <p>Indicates whether the cloud computer uses GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpuCategory(Long gpuCategory) {
                this.gpuCategory = gpuCategory;
                return this;
            }

            /**
             * <p>The number of GPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU driver version used by the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The GPU Specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA T4</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hibernationBeta(Boolean hibernationBeta) {
                this.hibernationBeta = hibernationBeta;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
                this.hibernationOptionsConfigured = hibernationOptionsConfigured;
                return this;
            }

            /**
             * <p>The hostname of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-4zfb6zj728hhr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * IsLdap.
             */
            public Builder isLdap(Boolean isLdap) {
                this.isLdap = isLdap;
                return this;
            }

            /**
             * <p>The flag that is used to manage the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Migrating: The cloud computer is being migrated.</li>
             * <li>Updating: The configurations of the cloud computer are being updated.</li>
             * <li>NoFlag: No flags are available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoFlag</p>
             */
            public Builder managementFlag(String managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * <p>The flags that are used to manage the cloud computers.</p>
             */
            public Builder managementFlags(java.util.List<String> managementFlags) {
                this.managementFlags = managementFlags;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The ID of the supplementary network interface controller (NIC) created by EDS within an RAM user or Active Directory (AD) user. You cannot modify the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The IP address of the supplementary NIC created by EDS within an RAM or AD user.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.74.165</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The account type of the office network.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SIMPLE: convenience account</li>
             * <li>AD_CONNECTOR: enterprise AD account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The VPC type of the office network.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard</li>
             * <li>customized</li>
             * <li>basic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * <p>The OS that is defined in the desktop template.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * OsUpdate.
             */
            public Builder osUpdate(OsUpdate osUpdate) {
                this.osUpdate = osUpdate;
                return this;
            }

            /**
             * <p>The information about the OS platform.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Ubuntu</li>
             * <li>Windows Server 2022</li>
             * <li>UOS</li>
             * <li>CentOS</li>
             * <li>Windows Server 2019</li>
             * <li>Windows Server 2016</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>system-all-enabled-policy</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The IDs of the cloud computer policies.</p>
             */
            public Builder policyGroupIdList(java.util.List<String> policyGroupIdList) {
                this.policyGroupIdList = policyGroupIdList;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * <p>The names of the cloud computer policies.</p>
             */
            public Builder policyGroupNameList(java.util.List<String> policyGroupNameList) {
                this.policyGroupNameList = policyGroupNameList;
                return this;
            }

            /**
             * <p>The progress of creating the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HDX</li>
             * <li>ASP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The information about the enterprise resource groups.</p>
             */
            public Builder resourceGroups(java.util.List<ResourceGroups> resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * <p>The type of the session.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SINGLE_SESSION</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>MULTIPLE_SESSION</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_SESSION</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The session information about cloud computers connected by end users.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The snapshot policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-gi007jgyc3kcey2bb</p>
             */
            public Builder snapshotPolicyId(String snapshotPolicyId) {
                this.snapshotPolicyId = snapshotPolicyId;
                return this;
            }

            /**
             * <p>The name of the snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>testSnapshotName</p>
             */
            public Builder snapshotPolicyName(String snapshotPolicyName) {
                this.snapshotPolicyName = snapshotPolicyName;
                return this;
            }

            /**
             * <p>The standard start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-24T06:38:02Z</p>
             */
            public Builder standardStartTime(String standardStartTime) {
                this.standardStartTime = standardStartTime;
                return this;
            }

            /**
             * <p>The time when the cloud computer was first started.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:31Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates whether the cloud desktop supports hibernation.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportHibernation(Boolean supportHibernation) {
                this.supportHibernation = supportHibernation;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>Details about the tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query the list of KMS keys.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            /**
             * <p>The zone type. Default value: <code>AvailabilityZone</code>. This value indicates Alibaba Cloud zones.</p>
             * 
             * <strong>example:</strong>
             * <p>AvailabilityZone</p>
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
