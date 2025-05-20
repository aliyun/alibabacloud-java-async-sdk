// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link Snapshot} extends {@link TeaModel}
 *
 * <p>Snapshot</p>
 */
public class Snapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("baseManifestList")
    private String baseManifestList;

    @com.aliyun.core.annotation.NameInMap("changelogManifestList")
    private String changelogManifestList;

    @com.aliyun.core.annotation.NameInMap("changelogRecordCount")
    private Long changelogRecordCount;

    @com.aliyun.core.annotation.NameInMap("commitIdentifier")
    private Long commitIdentifier;

    @com.aliyun.core.annotation.NameInMap("commitKind")
    private String commitKind;

    @com.aliyun.core.annotation.NameInMap("commitUser")
    private String commitUser;

    @com.aliyun.core.annotation.NameInMap("deltaManifestList")
    private String deltaManifestList;

    @com.aliyun.core.annotation.NameInMap("deltaRecordCount")
    private Long deltaRecordCount;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("indexManifest")
    private String indexManifest;

    @com.aliyun.core.annotation.NameInMap("logOffsets")
    private java.util.Map<String, Long> logOffsets;

    @com.aliyun.core.annotation.NameInMap("schemaId")
    private Long schemaId;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private String statistics;

    @com.aliyun.core.annotation.NameInMap("timeMillis")
    private Long timeMillis;

    @com.aliyun.core.annotation.NameInMap("totalRecordCount")
    private Long totalRecordCount;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("watermark")
    private Long watermark;

    private Snapshot(Builder builder) {
        this.baseManifestList = builder.baseManifestList;
        this.changelogManifestList = builder.changelogManifestList;
        this.changelogRecordCount = builder.changelogRecordCount;
        this.commitIdentifier = builder.commitIdentifier;
        this.commitKind = builder.commitKind;
        this.commitUser = builder.commitUser;
        this.deltaManifestList = builder.deltaManifestList;
        this.deltaRecordCount = builder.deltaRecordCount;
        this.id = builder.id;
        this.indexManifest = builder.indexManifest;
        this.logOffsets = builder.logOffsets;
        this.schemaId = builder.schemaId;
        this.statistics = builder.statistics;
        this.timeMillis = builder.timeMillis;
        this.totalRecordCount = builder.totalRecordCount;
        this.version = builder.version;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Snapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseManifestList
     */
    public String getBaseManifestList() {
        return this.baseManifestList;
    }

    /**
     * @return changelogManifestList
     */
    public String getChangelogManifestList() {
        return this.changelogManifestList;
    }

    /**
     * @return changelogRecordCount
     */
    public Long getChangelogRecordCount() {
        return this.changelogRecordCount;
    }

    /**
     * @return commitIdentifier
     */
    public Long getCommitIdentifier() {
        return this.commitIdentifier;
    }

    /**
     * @return commitKind
     */
    public String getCommitKind() {
        return this.commitKind;
    }

    /**
     * @return commitUser
     */
    public String getCommitUser() {
        return this.commitUser;
    }

    /**
     * @return deltaManifestList
     */
    public String getDeltaManifestList() {
        return this.deltaManifestList;
    }

    /**
     * @return deltaRecordCount
     */
    public Long getDeltaRecordCount() {
        return this.deltaRecordCount;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return indexManifest
     */
    public String getIndexManifest() {
        return this.indexManifest;
    }

    /**
     * @return logOffsets
     */
    public java.util.Map<String, Long> getLogOffsets() {
        return this.logOffsets;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return statistics
     */
    public String getStatistics() {
        return this.statistics;
    }

    /**
     * @return timeMillis
     */
    public Long getTimeMillis() {
        return this.timeMillis;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return watermark
     */
    public Long getWatermark() {
        return this.watermark;
    }

    public static final class Builder {
        private String baseManifestList; 
        private String changelogManifestList; 
        private Long changelogRecordCount; 
        private Long commitIdentifier; 
        private String commitKind; 
        private String commitUser; 
        private String deltaManifestList; 
        private Long deltaRecordCount; 
        private Long id; 
        private String indexManifest; 
        private java.util.Map<String, Long> logOffsets; 
        private Long schemaId; 
        private String statistics; 
        private Long timeMillis; 
        private Long totalRecordCount; 
        private Integer version; 
        private Long watermark; 

        private Builder() {
        } 

        private Builder(Snapshot model) {
            this.baseManifestList = model.baseManifestList;
            this.changelogManifestList = model.changelogManifestList;
            this.changelogRecordCount = model.changelogRecordCount;
            this.commitIdentifier = model.commitIdentifier;
            this.commitKind = model.commitKind;
            this.commitUser = model.commitUser;
            this.deltaManifestList = model.deltaManifestList;
            this.deltaRecordCount = model.deltaRecordCount;
            this.id = model.id;
            this.indexManifest = model.indexManifest;
            this.logOffsets = model.logOffsets;
            this.schemaId = model.schemaId;
            this.statistics = model.statistics;
            this.timeMillis = model.timeMillis;
            this.totalRecordCount = model.totalRecordCount;
            this.version = model.version;
            this.watermark = model.watermark;
        } 

        /**
         * baseManifestList.
         */
        public Builder baseManifestList(String baseManifestList) {
            this.baseManifestList = baseManifestList;
            return this;
        }

        /**
         * changelogManifestList.
         */
        public Builder changelogManifestList(String changelogManifestList) {
            this.changelogManifestList = changelogManifestList;
            return this;
        }

        /**
         * changelogRecordCount.
         */
        public Builder changelogRecordCount(Long changelogRecordCount) {
            this.changelogRecordCount = changelogRecordCount;
            return this;
        }

        /**
         * commitIdentifier.
         */
        public Builder commitIdentifier(Long commitIdentifier) {
            this.commitIdentifier = commitIdentifier;
            return this;
        }

        /**
         * commitKind.
         */
        public Builder commitKind(String commitKind) {
            this.commitKind = commitKind;
            return this;
        }

        /**
         * commitUser.
         */
        public Builder commitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }

        /**
         * deltaManifestList.
         */
        public Builder deltaManifestList(String deltaManifestList) {
            this.deltaManifestList = deltaManifestList;
            return this;
        }

        /**
         * deltaRecordCount.
         */
        public Builder deltaRecordCount(Long deltaRecordCount) {
            this.deltaRecordCount = deltaRecordCount;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * indexManifest.
         */
        public Builder indexManifest(String indexManifest) {
            this.indexManifest = indexManifest;
            return this;
        }

        /**
         * logOffsets.
         */
        public Builder logOffsets(java.util.Map<String, Long> logOffsets) {
            this.logOffsets = logOffsets;
            return this;
        }

        /**
         * schemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        /**
         * statistics.
         */
        public Builder statistics(String statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * timeMillis.
         */
        public Builder timeMillis(Long timeMillis) {
            this.timeMillis = timeMillis;
            return this;
        }

        /**
         * totalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * watermark.
         */
        public Builder watermark(Long watermark) {
            this.watermark = watermark;
            return this;
        }

        public Snapshot build() {
            return new Snapshot(this);
        } 

    } 

}
