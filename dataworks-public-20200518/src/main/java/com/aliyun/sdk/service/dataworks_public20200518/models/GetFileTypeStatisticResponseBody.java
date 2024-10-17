// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileTypeStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileTypeStatisticResponseBody</p>
 */
public class GetFileTypeStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramTypeAndCounts")
    private java.util.List < ProgramTypeAndCounts> programTypeAndCounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileTypeStatisticResponseBody(Builder builder) {
        this.programTypeAndCounts = builder.programTypeAndCounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileTypeStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return programTypeAndCounts
     */
    public java.util.List < ProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ProgramTypeAndCounts> programTypeAndCounts; 
        private String requestId; 

        /**
         * <p>An array of node types and quantity.</p>
         */
        public Builder programTypeAndCounts(java.util.List < ProgramTypeAndCounts> programTypeAndCounts) {
            this.programTypeAndCounts = programTypeAndCounts;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileTypeStatisticResponseBody build() {
            return new GetFileTypeStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileTypeStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileTypeStatisticResponseBody</p>
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

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * <p>Valid values:</p>
             * <p>6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time data synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).</p>
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
