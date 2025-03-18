// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link ComparePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>ComparePlaybooksResponseBody</p>
 */
public class ComparePlaybooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompareResult")
    private CompareResult compareResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ComparePlaybooksResponseBody(Builder builder) {
        this.compareResult = builder.compareResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComparePlaybooksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compareResult
     */
    public CompareResult getCompareResult() {
        return this.compareResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompareResult compareResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ComparePlaybooksResponseBody model) {
            this.compareResult = model.compareResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The comparison result.</p>
         */
        public Builder compareResult(CompareResult compareResult) {
            this.compareResult = compareResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EC05B06-BF3C-5F3E-8FE8-3B1FAD76087A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ComparePlaybooksResponseBody build() {
            return new ComparePlaybooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ComparePlaybooksResponseBody} extends {@link TeaModel}
     *
     * <p>ComparePlaybooksResponseBody</p>
     */
    public static class CompareResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("New")
        private Boolean _new;

        @com.aliyun.core.annotation.NameInMap("Same")
        private Boolean same;

        private CompareResult(Builder builder) {
            this.description = builder.description;
            this._new = builder._new;
            this.same = builder.same;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompareResult create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return _new
         */
        public Boolean get_new() {
            return this._new;
        }

        /**
         * @return same
         */
        public Boolean getSame() {
            return this.same;
        }

        public static final class Builder {
            private String description; 
            private Boolean _new; 
            private Boolean same; 

            private Builder() {
            } 

            private Builder(CompareResult model) {
                this.description = model.description;
                this._new = model._new;
                this.same = model.same;
            } 

            /**
             * <p>The description of the comparison result.</p>
             * 
             * <strong>example:</strong>
             * <p>The first version adds one node compared to the second version</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the second version provides more information than the first version. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder _new(Boolean _new) {
                this._new = _new;
                return this;
            }

            /**
             * <p>Indicates whether the configurations of the two versions are the same. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder same(Boolean same) {
                this.same = same;
                return this;
            }

            public CompareResult build() {
                return new CompareResult(this);
            } 

        } 

    }
}
