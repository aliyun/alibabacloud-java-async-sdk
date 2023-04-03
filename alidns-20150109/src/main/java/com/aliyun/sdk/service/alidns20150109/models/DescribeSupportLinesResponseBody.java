// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportLinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportLinesResponseBody</p>
 */
public class DescribeSupportLinesResponseBody extends TeaModel {
    @NameInMap("RecordLines")
    private RecordLines recordLines;

    @NameInMap("RequestId")
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
         * The list of Alibaba Cloud DNS lines.
         */
        public Builder recordLines(RecordLines recordLines) {
            this.recordLines = recordLines;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSupportLinesResponseBody build() {
            return new DescribeSupportLinesResponseBody(this);
        } 

    } 

    public static class RecordLine extends TeaModel {
        @NameInMap("FatherCode")
        private String fatherCode;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineDisplayName")
        private String lineDisplayName;

        @NameInMap("LineName")
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
             * The code of the parent line. Leave it blank if there is no parent line.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * The code of the child line.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The name of the parent line.
             */
            public Builder lineDisplayName(String lineDisplayName) {
                this.lineDisplayName = lineDisplayName;
                return this;
            }

            /**
             * The name of the child line.
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
    public static class RecordLines extends TeaModel {
        @NameInMap("RecordLine")
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
