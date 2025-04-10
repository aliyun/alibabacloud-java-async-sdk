// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDDoSTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSTrafficResponseBody</p>
 */
public class DescribeDDoSTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DDoSTrafficPoints")
    private java.util.List<DDoSTrafficPoints> dDoSTrafficPoints;

    @com.aliyun.core.annotation.NameInMap("DefenseInBytes")
    private Long defenseInBytes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceInBytes")
    private Long sourceInBytes;

    private DescribeDDoSTrafficResponseBody(Builder builder) {
        this.dDoSTrafficPoints = builder.dDoSTrafficPoints;
        this.defenseInBytes = builder.defenseInBytes;
        this.requestId = builder.requestId;
        this.sourceInBytes = builder.sourceInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSTrafficResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dDoSTrafficPoints
     */
    public java.util.List<DDoSTrafficPoints> getDDoSTrafficPoints() {
        return this.dDoSTrafficPoints;
    }

    /**
     * @return defenseInBytes
     */
    public Long getDefenseInBytes() {
        return this.defenseInBytes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceInBytes
     */
    public Long getSourceInBytes() {
        return this.sourceInBytes;
    }

    public static final class Builder {
        private java.util.List<DDoSTrafficPoints> dDoSTrafficPoints; 
        private Long defenseInBytes; 
        private String requestId; 
        private Long sourceInBytes; 

        private Builder() {
        } 

        private Builder(DescribeDDoSTrafficResponseBody model) {
            this.dDoSTrafficPoints = model.dDoSTrafficPoints;
            this.defenseInBytes = model.defenseInBytes;
            this.requestId = model.requestId;
            this.sourceInBytes = model.sourceInBytes;
        } 

        /**
         * DDoSTrafficPoints.
         */
        public Builder dDoSTrafficPoints(java.util.List<DDoSTrafficPoints> dDoSTrafficPoints) {
            this.dDoSTrafficPoints = dDoSTrafficPoints;
            return this;
        }

        /**
         * DefenseInBytes.
         */
        public Builder defenseInBytes(Long defenseInBytes) {
            this.defenseInBytes = defenseInBytes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceInBytes.
         */
        public Builder sourceInBytes(Long sourceInBytes) {
            this.sourceInBytes = sourceInBytes;
            return this;
        }

        public DescribeDDoSTrafficResponseBody build() {
            return new DescribeDDoSTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSTrafficResponseBody</p>
     */
    public static class DDoSTrafficPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseMaxInBps")
        private Long defenseMaxInBps;

        @com.aliyun.core.annotation.NameInMap("SourceMaxInBps")
        private Long sourceMaxInBps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private DDoSTrafficPoints(Builder builder) {
            this.defenseMaxInBps = builder.defenseMaxInBps;
            this.sourceMaxInBps = builder.sourceMaxInBps;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDoSTrafficPoints create() {
            return builder().build();
        }

        /**
         * @return defenseMaxInBps
         */
        public Long getDefenseMaxInBps() {
            return this.defenseMaxInBps;
        }

        /**
         * @return sourceMaxInBps
         */
        public Long getSourceMaxInBps() {
            return this.sourceMaxInBps;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long defenseMaxInBps; 
            private Long sourceMaxInBps; 
            private Long time; 

            private Builder() {
            } 

            private Builder(DDoSTrafficPoints model) {
                this.defenseMaxInBps = model.defenseMaxInBps;
                this.sourceMaxInBps = model.sourceMaxInBps;
                this.time = model.time;
            } 

            /**
             * DefenseMaxInBps.
             */
            public Builder defenseMaxInBps(Long defenseMaxInBps) {
                this.defenseMaxInBps = defenseMaxInBps;
                return this;
            }

            /**
             * SourceMaxInBps.
             */
            public Builder sourceMaxInBps(Long sourceMaxInBps) {
                this.sourceMaxInBps = sourceMaxInBps;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public DDoSTrafficPoints build() {
                return new DDoSTrafficPoints(this);
            } 

        } 

    }
}
