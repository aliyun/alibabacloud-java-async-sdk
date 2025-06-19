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
 * {@link FullInstant} extends {@link TeaModel}
 *
 * <p>FullInstant</p>
 */
public class FullInstant extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("snapshotId")
    private Long snapshotId;

    @com.aliyun.core.annotation.NameInMap("tagName")
    private String tagName;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private FullInstant(Builder builder) {
        this.snapshotId = builder.snapshotId;
        this.tagName = builder.tagName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FullInstant create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long snapshotId; 
        private String tagName; 
        private String type; 

        private Builder() {
        } 

        private Builder(FullInstant model) {
            this.snapshotId = model.snapshotId;
            this.tagName = model.tagName;
            this.type = model.type;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FullInstant build() {
            return new FullInstant(this);
        } 

    } 

}
