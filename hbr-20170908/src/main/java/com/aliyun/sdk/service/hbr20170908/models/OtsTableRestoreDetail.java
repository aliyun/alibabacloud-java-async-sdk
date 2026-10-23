// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link OtsTableRestoreDetail} extends {@link TeaModel}
 *
 * <p>OtsTableRestoreDetail</p>
 */
public class OtsTableRestoreDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchChannelCount")
    private Integer batchChannelCount;

    @com.aliyun.core.annotation.NameInMap("IndexNameSuffix")
    private String indexNameSuffix;

    @com.aliyun.core.annotation.NameInMap("OverwriteExisting")
    private Boolean overwriteExisting;

    @com.aliyun.core.annotation.NameInMap("ReGenerateAutoIncrementPK")
    private Boolean reGenerateAutoIncrementPK;

    @com.aliyun.core.annotation.NameInMap("RestoreIndex")
    private Boolean restoreIndex;

    @com.aliyun.core.annotation.NameInMap("RestoreSearchIndex")
    private Boolean restoreSearchIndex;

    @com.aliyun.core.annotation.NameInMap("SearchIndexNameSuffix")
    private String searchIndexNameSuffix;

    private OtsTableRestoreDetail(Builder builder) {
        this.batchChannelCount = builder.batchChannelCount;
        this.indexNameSuffix = builder.indexNameSuffix;
        this.overwriteExisting = builder.overwriteExisting;
        this.reGenerateAutoIncrementPK = builder.reGenerateAutoIncrementPK;
        this.restoreIndex = builder.restoreIndex;
        this.restoreSearchIndex = builder.restoreSearchIndex;
        this.searchIndexNameSuffix = builder.searchIndexNameSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OtsTableRestoreDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchChannelCount
     */
    public Integer getBatchChannelCount() {
        return this.batchChannelCount;
    }

    /**
     * @return indexNameSuffix
     */
    public String getIndexNameSuffix() {
        return this.indexNameSuffix;
    }

    /**
     * @return overwriteExisting
     */
    public Boolean getOverwriteExisting() {
        return this.overwriteExisting;
    }

    /**
     * @return reGenerateAutoIncrementPK
     */
    public Boolean getReGenerateAutoIncrementPK() {
        return this.reGenerateAutoIncrementPK;
    }

    /**
     * @return restoreIndex
     */
    public Boolean getRestoreIndex() {
        return this.restoreIndex;
    }

    /**
     * @return restoreSearchIndex
     */
    public Boolean getRestoreSearchIndex() {
        return this.restoreSearchIndex;
    }

    /**
     * @return searchIndexNameSuffix
     */
    public String getSearchIndexNameSuffix() {
        return this.searchIndexNameSuffix;
    }

    public static final class Builder {
        private Integer batchChannelCount; 
        private String indexNameSuffix; 
        private Boolean overwriteExisting; 
        private Boolean reGenerateAutoIncrementPK; 
        private Boolean restoreIndex; 
        private Boolean restoreSearchIndex; 
        private String searchIndexNameSuffix; 

        private Builder() {
        } 

        private Builder(OtsTableRestoreDetail model) {
            this.batchChannelCount = model.batchChannelCount;
            this.indexNameSuffix = model.indexNameSuffix;
            this.overwriteExisting = model.overwriteExisting;
            this.reGenerateAutoIncrementPK = model.reGenerateAutoIncrementPK;
            this.restoreIndex = model.restoreIndex;
            this.restoreSearchIndex = model.restoreSearchIndex;
            this.searchIndexNameSuffix = model.searchIndexNameSuffix;
        } 

        /**
         * <p>The number of concurrent processes for each restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder batchChannelCount(Integer batchChannelCount) {
            this.batchChannelCount = batchChannelCount;
            return this;
        }

        /**
         * <p>The name prefixes of the indexes that you want to restore.</p>
         * 
         * <strong>example:</strong>
         * <p>2022xxxx143933</p>
         */
        public Builder indexNameSuffix(String indexNameSuffix) {
            this.indexNameSuffix = indexNameSuffix;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite existing tables.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwriteExisting(Boolean overwriteExisting) {
            this.overwriteExisting = overwriteExisting;
            return this;
        }

        /**
         * <p>Specifies whether to regenerate auto-increment primary keys.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reGenerateAutoIncrementPK(Boolean reGenerateAutoIncrementPK) {
            this.reGenerateAutoIncrementPK = reGenerateAutoIncrementPK;
            return this;
        }

        /**
         * <p>Specifies whether to restore indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restoreIndex(Boolean restoreIndex) {
            this.restoreIndex = restoreIndex;
            return this;
        }

        /**
         * <p>Specifies whether to restore search indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restoreSearchIndex(Boolean restoreSearchIndex) {
            this.restoreSearchIndex = restoreSearchIndex;
            return this;
        }

        /**
         * <p>The name prefixes of the search indexes that you want to restore.</p>
         * 
         * <strong>example:</strong>
         * <p>2022xxxx143933</p>
         */
        public Builder searchIndexNameSuffix(String searchIndexNameSuffix) {
            this.searchIndexNameSuffix = searchIndexNameSuffix;
            return this;
        }

        public OtsTableRestoreDetail build() {
            return new OtsTableRestoreDetail(this);
        } 

    } 

}
