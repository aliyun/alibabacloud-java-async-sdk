// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComparePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>ComparePlaybooksResponseBody</p>
 */
public class ComparePlaybooksResponseBody extends TeaModel {
    @NameInMap("CompareResult")
    private CompareResult compareResult;

    @NameInMap("RequestId")
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

        /**
         * The comparison result.
         */
        public Builder compareResult(CompareResult compareResult) {
            this.compareResult = compareResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ComparePlaybooksResponseBody build() {
            return new ComparePlaybooksResponseBody(this);
        } 

    } 

    public static class CompareResult extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("New")
        private Boolean _new;

        @NameInMap("Same")
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

            /**
             * The description of the comparison result.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the second version provides more information than the first version. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder _new(Boolean _new) {
                this._new = _new;
                return this;
            }

            /**
             * Indicates whether the configurations of the two versions are the same. Valid values: **true** and **false**.
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
