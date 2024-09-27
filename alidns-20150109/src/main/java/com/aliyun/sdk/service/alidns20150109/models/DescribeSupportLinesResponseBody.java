// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSupportLinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportLinesResponseBody</p>
 */
public class DescribeSupportLinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordLines")
    private RecordLines recordLines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSupportLinesResponseBody(Builder builder) {
        this.recordLines = builder.recordLines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportLinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordLines
     */
    public RecordLines getRecordLines() {
        return this.recordLines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordLines recordLines; 
        private String requestId; 

        /**
         * <p>The Alibaba Cloud DNS lines.</p>
         */
        public Builder recordLines(RecordLines recordLines) {
            this.recordLines = recordLines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSupportLinesResponseBody build() {
            return new DescribeSupportLinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSupportLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSupportLinesResponseBody</p>
     */
    public static class RecordLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FatherCode")
        private String fatherCode;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineDisplayName")
        private String lineDisplayName;

        @com.aliyun.core.annotation.NameInMap("LineName")
        private String lineName;

        private RecordLine(Builder builder) {
            this.fatherCode = builder.fatherCode;
            this.lineCode = builder.lineCode;
            this.lineDisplayName = builder.lineDisplayName;
            this.lineName = builder.lineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLine create() {
            return builder().build();
        }

        /**
         * @return fatherCode
         */
        public String getFatherCode() {
            return this.fatherCode;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineDisplayName
         */
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        /**
         * @return lineName
         */
        public String getLineName() {
            return this.lineName;
        }

        public static final class Builder {
            private String fatherCode; 
            private String lineCode; 
            private String lineDisplayName; 
            private String lineName; 

            /**
             * <p>The code of the parent line. This parameter is not returned if the line has no parent line.</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * <p>The code of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_unicom_shanxi</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The display name of the parent line.</p>
             * 
             * <strong>example:</strong>
             * <p>China Unicom</p>
             */
            public Builder lineDisplayName(String lineDisplayName) {
                this.lineDisplayName = lineDisplayName;
                return this;
            }

            /**
             * <p>The display name of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>China Unicom_Shanxi</p>
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            public RecordLine build() {
                return new RecordLine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSupportLinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSupportLinesResponseBody</p>
     */
    public static class RecordLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordLine")
        private java.util.List < RecordLine> recordLine;

        private RecordLines(Builder builder) {
            this.recordLine = builder.recordLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLines create() {
            return builder().build();
        }

        /**
         * @return recordLine
         */
        public java.util.List < RecordLine> getRecordLine() {
            return this.recordLine;
        }

        public static final class Builder {
            private java.util.List < RecordLine> recordLine; 

            /**
             * RecordLine.
             */
            public Builder recordLine(java.util.List < RecordLine> recordLine) {
                this.recordLine = recordLine;
                return this;
            }

            public RecordLines build() {
                return new RecordLines(this);
            } 

        } 

    }
}
