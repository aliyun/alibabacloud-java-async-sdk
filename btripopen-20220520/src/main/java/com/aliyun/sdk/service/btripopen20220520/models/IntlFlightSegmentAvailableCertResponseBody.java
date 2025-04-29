// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightSegmentAvailableCertResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightSegmentAvailableCertResponseBody</p>
 */
public class IntlFlightSegmentAvailableCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result_code")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("result_msg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private IntlFlightSegmentAvailableCertResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightSegmentAvailableCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(IntlFlightSegmentAvailableCertResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result_code.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightSegmentAvailableCertResponseBody build() {
            return new IntlFlightSegmentAvailableCertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightSegmentAvailableCertResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightSegmentAvailableCertResponseBody</p>
     */
    public static class SegmentPosition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        private SegmentPosition(Builder builder) {
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentPosition create() {
            return builder().build();
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public static final class Builder {
            private Integer journeyIndex; 
            private Integer segmentIndex; 

            private Builder() {
            } 

            private Builder(SegmentPosition model) {
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
            } 

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            public SegmentPosition build() {
                return new SegmentPosition(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightSegmentAvailableCertResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightSegmentAvailableCertResponseBody</p>
     */
    public static class SegmentAvailableCertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_types")
        private java.util.List<Integer> certTypes;

        @com.aliyun.core.annotation.NameInMap("segment_position")
        private SegmentPosition segmentPosition;

        private SegmentAvailableCertList(Builder builder) {
            this.certTypes = builder.certTypes;
            this.segmentPosition = builder.segmentPosition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentAvailableCertList create() {
            return builder().build();
        }

        /**
         * @return certTypes
         */
        public java.util.List<Integer> getCertTypes() {
            return this.certTypes;
        }

        /**
         * @return segmentPosition
         */
        public SegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public static final class Builder {
            private java.util.List<Integer> certTypes; 
            private SegmentPosition segmentPosition; 

            private Builder() {
            } 

            private Builder(SegmentAvailableCertList model) {
                this.certTypes = model.certTypes;
                this.segmentPosition = model.segmentPosition;
            } 

            /**
             * cert_types.
             */
            public Builder certTypes(java.util.List<Integer> certTypes) {
                this.certTypes = certTypes;
                return this;
            }

            /**
             * segment_position.
             */
            public Builder segmentPosition(SegmentPosition segmentPosition) {
                this.segmentPosition = segmentPosition;
                return this;
            }

            public SegmentAvailableCertList build() {
                return new SegmentAvailableCertList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightSegmentAvailableCertResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightSegmentAvailableCertResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_available_cert_list")
        private java.util.List<SegmentAvailableCertList> segmentAvailableCertList;

        private Module(Builder builder) {
            this.segmentAvailableCertList = builder.segmentAvailableCertList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return segmentAvailableCertList
         */
        public java.util.List<SegmentAvailableCertList> getSegmentAvailableCertList() {
            return this.segmentAvailableCertList;
        }

        public static final class Builder {
            private java.util.List<SegmentAvailableCertList> segmentAvailableCertList; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.segmentAvailableCertList = model.segmentAvailableCertList;
            } 

            /**
             * segment_available_cert_list.
             */
            public Builder segmentAvailableCertList(java.util.List<SegmentAvailableCertList> segmentAvailableCertList) {
                this.segmentAvailableCertList = segmentAvailableCertList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
