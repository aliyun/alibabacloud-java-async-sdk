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
 * {@link AlterCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>AlterCatalogResponseBody</p>
 */
public class AlterCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("missing")
    private java.util.List<String> missing;

    @com.aliyun.core.annotation.NameInMap("removed")
    private java.util.List<String> removed;

    @com.aliyun.core.annotation.NameInMap("updated")
    private java.util.List<String> updated;

    private AlterCatalogResponseBody(Builder builder) {
        this.missing = builder.missing;
        this.removed = builder.removed;
        this.updated = builder.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterCatalogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return missing
     */
    public java.util.List<String> getMissing() {
        return this.missing;
    }

    /**
     * @return removed
     */
    public java.util.List<String> getRemoved() {
        return this.removed;
    }

    /**
     * @return updated
     */
    public java.util.List<String> getUpdated() {
        return this.updated;
    }

    public static final class Builder {
        private java.util.List<String> missing; 
        private java.util.List<String> removed; 
        private java.util.List<String> updated; 

        private Builder() {
        } 

        private Builder(AlterCatalogResponseBody model) {
            this.missing = model.missing;
            this.removed = model.removed;
            this.updated = model.updated;
        } 

        /**
         * missing.
         */
        public Builder missing(java.util.List<String> missing) {
            this.missing = missing;
            return this;
        }

        /**
         * removed.
         */
        public Builder removed(java.util.List<String> removed) {
            this.removed = removed;
            return this;
        }

        /**
         * updated.
         */
        public Builder updated(java.util.List<String> updated) {
            this.updated = updated;
            return this;
        }

        public AlterCatalogResponseBody build() {
            return new AlterCatalogResponseBody(this);
        } 

    } 

}
