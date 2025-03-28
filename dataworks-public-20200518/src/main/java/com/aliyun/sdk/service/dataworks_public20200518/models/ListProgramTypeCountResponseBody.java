// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListProgramTypeCountResponseBody} extends {@link TeaModel}
 *
 * <p>ListProgramTypeCountResponseBody</p>
 */
public class ListProgramTypeCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramTypeAndCounts")
    private java.util.List<ProgramTypeAndCounts> programTypeAndCounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProgramTypeCountResponseBody(Builder builder) {
        this.programTypeAndCounts = builder.programTypeAndCounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProgramTypeCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return programTypeAndCounts
     */
    public java.util.List<ProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ProgramTypeAndCounts> programTypeAndCounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProgramTypeCountResponseBody model) {
            this.programTypeAndCounts = model.programTypeAndCounts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of node types and quantity.</p>
         */
        public Builder programTypeAndCounts(java.util.List<ProgramTypeAndCounts> programTypeAndCounts) {
            this.programTypeAndCounts = programTypeAndCounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProgramTypeCountResponseBody build() {
            return new ListProgramTypeCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProgramTypeCountResponseBody} extends {@link TeaModel}
     *
     * <p>ListProgramTypeCountResponseBody</p>
     */
    public static class ProgramTypeAndCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
        private String programType;

        private ProgramTypeAndCounts(Builder builder) {
            this.count = builder.count;
            this.programType = builder.programType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramTypeAndCounts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return programType
         */
        public String getProgramType() {
            return this.programType;
        }

        public static final class Builder {
            private Integer count; 
            private String programType; 

            private Builder() {
            } 

            private Builder(ProgramTypeAndCounts model) {
                this.count = model.count;
                this.programType = model.programType;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder programType(String programType) {
                this.programType = programType;
                return this;
            }

            public ProgramTypeAndCounts build() {
                return new ProgramTypeAndCounts(this);
            } 

        } 

    }
}
