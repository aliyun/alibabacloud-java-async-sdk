// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeListFaceVerifyDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListFaceVerifyDataResponseBody</p>
 */
public class DescribeListFaceVerifyDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorData")
    private MonitorData monitorData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeListFaceVerifyDataResponseBody(Builder builder) {
        this.monitorData = builder.monitorData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListFaceVerifyDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorData
     */
    public MonitorData getMonitorData() {
        return this.monitorData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MonitorData monitorData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeListFaceVerifyDataResponseBody model) {
            this.monitorData = model.monitorData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data.</p>
         */
        public Builder monitorData(MonitorData monitorData) {
            this.monitorData = monitorData;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>EBD373EA-07FC-50BC-906F-B8950B6ED462</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeListFaceVerifyDataResponseBody build() {
            return new DescribeListFaceVerifyDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeListFaceVerifyDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeListFaceVerifyDataResponseBody</p>
     */
    public static class FaceVerifyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConDate")
        private String conDate;

        @com.aliyun.core.annotation.NameInMap("FailCnt")
        private String failCnt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SuccCnt")
        private String succCnt;

        @com.aliyun.core.annotation.NameInMap("TotalCnt")
        private String totalCnt;

        private FaceVerifyData(Builder builder) {
            this.conDate = builder.conDate;
            this.failCnt = builder.failCnt;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
            this.succCnt = builder.succCnt;
            this.totalCnt = builder.totalCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceVerifyData create() {
            return builder().build();
        }

        /**
         * @return conDate
         */
        public String getConDate() {
            return this.conDate;
        }

        /**
         * @return failCnt
         */
        public String getFailCnt() {
            return this.failCnt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return succCnt
         */
        public String getSuccCnt() {
            return this.succCnt;
        }

        /**
         * @return totalCnt
         */
        public String getTotalCnt() {
            return this.totalCnt;
        }

        public static final class Builder {
            private String conDate; 
            private String failCnt; 
            private String name; 
            private String sceneId; 
            private String succCnt; 
            private String totalCnt; 

            private Builder() {
            } 

            private Builder(FaceVerifyData model) {
                this.conDate = model.conDate;
                this.failCnt = model.failCnt;
                this.name = model.name;
                this.sceneId = model.sceneId;
                this.succCnt = model.succCnt;
                this.totalCnt = model.totalCnt;
            } 

            /**
             * <p>Verification statistics time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16T00:00:00.000Z</p>
             */
            public Builder conDate(String conDate) {
                this.conDate = conDate;
                return this;
            }

            /**
             * <p>Number of failed verifications.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder failCnt(String failCnt) {
                this.failCnt = failCnt;
                return this;
            }

            /**
             * <p>Verification scheme.</p>
             * 
             * <strong>example:</strong>
             * <p>Liveness</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000011644</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Number of successful verifications.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder succCnt(String succCnt) {
                this.succCnt = succCnt;
                return this;
            }

            /**
             * <p>Total number of verifications.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder totalCnt(String totalCnt) {
                this.totalCnt = totalCnt;
                return this;
            }

            public FaceVerifyData build() {
                return new FaceVerifyData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeListFaceVerifyDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeListFaceVerifyDataResponseBody</p>
     */
    public static class MonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceVerifyData")
        private java.util.List<FaceVerifyData> faceVerifyData;

        private MonitorData(Builder builder) {
            this.faceVerifyData = builder.faceVerifyData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorData create() {
            return builder().build();
        }

        /**
         * @return faceVerifyData
         */
        public java.util.List<FaceVerifyData> getFaceVerifyData() {
            return this.faceVerifyData;
        }

        public static final class Builder {
            private java.util.List<FaceVerifyData> faceVerifyData; 

            private Builder() {
            } 

            private Builder(MonitorData model) {
                this.faceVerifyData = model.faceVerifyData;
            } 

            /**
             * <p>Face verification data.</p>
             */
            public Builder faceVerifyData(java.util.List<FaceVerifyData> faceVerifyData) {
                this.faceVerifyData = faceVerifyData;
                return this;
            }

            public MonitorData build() {
                return new MonitorData(this);
            } 

        } 

    }
}
