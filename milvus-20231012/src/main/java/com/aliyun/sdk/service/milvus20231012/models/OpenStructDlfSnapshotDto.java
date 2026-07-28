// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link OpenStructDlfSnapshotDto} extends {@link TeaModel}
 *
 * <p>OpenStructDlfSnapshotDto</p>
 */
public class OpenStructDlfSnapshotDto extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("changelogRecordCount")
    private Long changelogRecordCount;

    @com.aliyun.core.annotation.NameInMap("commitKind")
    private String commitKind;

    @com.aliyun.core.annotation.NameInMap("deltaRecordCount")
    private Long deltaRecordCount;

    @com.aliyun.core.annotation.NameInMap("schemaId")
    private Long schemaId;

    @com.aliyun.core.annotation.NameInMap("snapshotId")
    private Long snapshotId;

    @com.aliyun.core.annotation.NameInMap("timeMillis")
    private Long timeMillis;

    @com.aliyun.core.annotation.NameInMap("totalRecordCount")
    private Long totalRecordCount;

    private OpenStructDlfSnapshotDto(Builder builder) {
        this.changelogRecordCount = builder.changelogRecordCount;
        this.commitKind = builder.commitKind;
        this.deltaRecordCount = builder.deltaRecordCount;
        this.schemaId = builder.schemaId;
        this.snapshotId = builder.snapshotId;
        this.timeMillis = builder.timeMillis;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructDlfSnapshotDto create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changelogRecordCount
     */
    public Long getChangelogRecordCount() {
        return this.changelogRecordCount;
    }

    /**
     * @return commitKind
     */
    public String getCommitKind() {
        return this.commitKind;
    }

    /**
     * @return deltaRecordCount
     */
    public Long getDeltaRecordCount() {
        return this.deltaRecordCount;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return snapshotId
     */
    public Long getSnapshotId() {
        return this.snapshotId;
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

    public static final class Builder {
        private Long changelogRecordCount; 
        private String commitKind; 
        private Long deltaRecordCount; 
        private Long schemaId; 
        private Long snapshotId; 
        private Long timeMillis; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(OpenStructDlfSnapshotDto model) {
            this.changelogRecordCount = model.changelogRecordCount;
            this.commitKind = model.commitKind;
            this.deltaRecordCount = model.deltaRecordCount;
            this.schemaId = model.schemaId;
            this.snapshotId = model.snapshotId;
            this.timeMillis = model.timeMillis;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * changelogRecordCount.
         */
        public Builder changelogRecordCount(Long changelogRecordCount) {
            this.changelogRecordCount = changelogRecordCount;
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
         * deltaRecordCount.
         */
        public Builder deltaRecordCount(Long deltaRecordCount) {
            this.deltaRecordCount = deltaRecordCount;
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
         * snapshotId.
         */
        public Builder snapshotId(Long snapshotId) {
            this.snapshotId = snapshotId;
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

        public OpenStructDlfSnapshotDto build() {
            return new OpenStructDlfSnapshotDto(this);
        } 

    } 

}
