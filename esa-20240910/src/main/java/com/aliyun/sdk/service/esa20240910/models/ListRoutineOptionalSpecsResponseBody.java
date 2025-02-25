// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineOptionalSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineOptionalSpecsResponseBody</p>
 */
public class ListRoutineOptionalSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List<Specs> specs;

    private ListRoutineOptionalSpecsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineOptionalSpecsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specs
     */
    public java.util.List<Specs> getSpecs() {
        return this.specs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Specs> specs; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890ABCDEF01234567890ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The available specifications.</p>
         */
        public Builder specs(java.util.List<Specs> specs) {
            this.specs = specs;
            return this;
        }

        public ListRoutineOptionalSpecsResponseBody build() {
            return new ListRoutineOptionalSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineOptionalSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineOptionalSpecsResponseBody</p>
     */
    public static class Specs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        private Specs(Builder builder) {
            this.isAvailable = builder.isAvailable;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specs create() {
            return builder().build();
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private Boolean isAvailable; 
            private String specName; 

            /**
             * <p>Indicates whether the specification is available. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>5ms</p>
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public Specs build() {
                return new Specs(this);
            } 

        } 

    }
}
