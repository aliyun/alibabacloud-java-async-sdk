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
 * {@link OpenStructDlfTagDto} extends {@link TeaModel}
 *
 * <p>OpenStructDlfTagDto</p>
 */
public class OpenStructDlfTagDto extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("snapshotId")
    private Long snapshotId;

    @com.aliyun.core.annotation.NameInMap("tagName")
    private String tagName;

    @com.aliyun.core.annotation.NameInMap("timeMillis")
    private Long timeMillis;

    @com.aliyun.core.annotation.NameInMap("totalRecordCount")
    private Long totalRecordCount;

    private OpenStructDlfTagDto(Builder builder) {
        this.snapshotId = builder.snapshotId;
        this.tagName = builder.tagName;
        this.timeMillis = builder.timeMillis;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructDlfTagDto create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snapshotId
     */
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
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
        private Long snapshotId; 
        private String tagName; 
        private Long timeMillis; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(OpenStructDlfTagDto model) {
            this.snapshotId = model.snapshotId;
            this.tagName = model.tagName;
            this.timeMillis = model.timeMillis;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * snapshotId.
         */
        public Builder snapshotId(Long snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * tagName.
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
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

        public OpenStructDlfTagDto build() {
            return new OpenStructDlfTagDto(this);
        } 

    } 

}
