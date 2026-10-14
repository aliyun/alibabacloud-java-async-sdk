// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetImageIncomeTaxDetectionTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageIncomeTaxDetectionTaskResultResponseBody</p>
 */
public class GetImageIncomeTaxDetectionTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetImageIncomeTaxDetectionTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageIncomeTaxDetectionTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private String result; 
        private String status; 
        private Boolean success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(GetImageIncomeTaxDetectionTaskResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p><strong>The business error code.</strong> The value &quot;OK&quot; is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p><strong>The HTTP status code.</strong> The value 200 is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p><strong>The list of detected abnormal items.</strong> Returned only when <code>Status</code> is <code>succeeded</code>. An empty array indicates that no abnormal items are detected.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The failure reason when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>poll timeout: no result within 30m0s</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The raw downstream detection result (extend.result string) for troubleshooting and passing through new fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;items&quot;: []}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p><strong>The task status.</strong> Valid values: <code>running</code> (in progress), <code>succeeded</code> (completed), <code>failed</code> (failed).</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p><strong>The task ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetImageIncomeTaxDetectionTaskResultResponseBody build() {
            return new GetImageIncomeTaxDetectionTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageIncomeTaxDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageIncomeTaxDetectionTaskResultResponseBody</p>
     */
    public static class Coordinates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X1")
        private Integer x1;

        @com.aliyun.core.annotation.NameInMap("X2")
        private Integer x2;

        @com.aliyun.core.annotation.NameInMap("Y1")
        private Integer y1;

        @com.aliyun.core.annotation.NameInMap("Y2")
        private Integer y2;

        private Coordinates(Builder builder) {
            this.x1 = builder.x1;
            this.x2 = builder.x2;
            this.y1 = builder.y1;
            this.y2 = builder.y2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coordinates create() {
            return builder().build();
        }

        /**
         * @return x1
         */
        public Integer getX1() {
            return this.x1;
        }

        /**
         * @return x2
         */
        public Integer getX2() {
            return this.x2;
        }

        /**
         * @return y1
         */
        public Integer getY1() {
            return this.y1;
        }

        /**
         * @return y2
         */
        public Integer getY2() {
            return this.y2;
        }

        public static final class Builder {
            private Integer x1; 
            private Integer x2; 
            private Integer y1; 
            private Integer y2; 

            private Builder() {
            } 

            private Builder(Coordinates model) {
                this.x1 = model.x1;
                this.x2 = model.x2;
                this.y1 = model.y1;
                this.y2 = model.y2;
            } 

            /**
             * <p>The X-coordinate of the upper-left corner (pixels).</p>
             * 
             * <strong>example:</strong>
             * <p>928</p>
             */
            public Builder x1(Integer x1) {
                this.x1 = x1;
                return this;
            }

            /**
             * <p>The X-coordinate of the lower-right corner of the bounding box (pixels).</p>
             * 
             * <strong>example:</strong>
             * <p>1147</p>
             */
            public Builder x2(Integer x2) {
                this.x2 = x2;
                return this;
            }

            /**
             * <p>The Y-coordinate of the upper-left corner (pixels).</p>
             * 
             * <strong>example:</strong>
             * <p>792</p>
             */
            public Builder y1(Integer y1) {
                this.y1 = y1;
                return this;
            }

            /**
             * <p>The Y-coordinate of the lower-right corner of the bounding box (pixels).</p>
             * 
             * <strong>example:</strong>
             * <p>847</p>
             */
            public Builder y2(Integer y2) {
                this.y2 = y2;
                return this;
            }

            public Coordinates build() {
                return new Coordinates(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageIncomeTaxDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageIncomeTaxDetectionTaskResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalItem")
        private String abnormalItem;

        @com.aliyun.core.annotation.NameInMap("Coordinates")
        private java.util.List<Coordinates> coordinates;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        private Items(Builder builder) {
            this.abnormalItem = builder.abnormalItem;
            this.coordinates = builder.coordinates;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return abnormalItem
         */
        public String getAbnormalItem() {
            return this.abnormalItem;
        }

        /**
         * @return coordinates
         */
        public java.util.List<Coordinates> getCoordinates() {
            return this.coordinates;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String abnormalItem; 
            private java.util.List<Coordinates> coordinates; 
            private String stage; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.abnormalItem = model.abnormalItem;
                this.coordinates = model.coordinates;
                this.stage = model.stage;
            } 

            /**
             * <p>The text description of the abnormal item.</p>
             * 
             * <strong>example:</strong>
             * <p>Month sequence anomaly: 2022-05 -&gt; 2022-11 (should be in descending or equal order)</p>
             */
            public Builder abnormalItem(String abnormalItem) {
                this.abnormalItem = abnormalItem;
                return this;
            }

            /**
             * <p>The bounding box position of the abnormal item in the image. May be an empty array for image-wide abnormalities.</p>
             */
            public Builder coordinates(java.util.List<Coordinates> coordinates) {
                this.coordinates = coordinates;
                return this;
            }

            /**
             * <p>The detection stage identifier for the abnormality.</p>
             * 
             * <strong>example:</strong>
             * <p>stage2</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
