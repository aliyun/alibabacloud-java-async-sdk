// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link QueryVideoAuditResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVideoAuditResultResponseBody</p>
 */
public class QueryVideoAuditResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryVideoAuditResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoAuditResultResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryVideoAuditResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>业务处理结果状态码</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>视频审校的详细结果</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP响应状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>业务处理结果描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>查询成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>本次API请求的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否处理成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryVideoAuditResultResponseBody build() {
            return new QueryVideoAuditResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVideoAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoAuditResultResponseBody</p>
     */
    public static class ImageUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Double timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ImageUrls(Builder builder) {
            this.id = builder.id;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrls create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return timestamp
         */
        public Double getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private Double timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrls model) {
                this.id = model.id;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>图片ID，与AliyunImageAuditResult中的dataId对应</p>
             * 
             * <strong>example:</strong>
             * <p>img001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Double timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrls build() {
                return new ImageUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVideoAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoAuditResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>0到100分，保留到小数点后2位，部分标签无置信分</p>
             * 
             * <strong>example:</strong>
             * <p>99.5</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Label字段的解释说明</p>
             * 
             * <strong>example:</strong>
             * <p>未检测出风险</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>图片内容检测运算后返回的标签，如：nonLabel（未检测出风险）</p>
             * 
             * <strong>example:</strong>
             * <p>nonLabel</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVideoAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoAuditResultResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Results(Builder builder) {
            this.dataId = builder.dataId;
            this.reqId = builder.reqId;
            this.result = builder.result;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String dataId; 
            private String reqId; 
            private java.util.List<Result> result; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.dataId = model.dataId;
                this.reqId = model.reqId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>对应图片的ID，与ImageUrl中的id字段对应</p>
             * 
             * <strong>example:</strong>
             * <p>d411ed15e8fc154fd0ef5addabfee04b</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>审核请求ID</p>
             * 
             * <strong>example:</strong>
             * <p>B5D1CF9E-0404-51E3-A28E-A5C7D95B6C71</p>
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * <p>图片检测的风险标签、置信分等参数结果</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>风险等级：high(高风险)、medium(中风险)、low(低风险)、none(未检测到风险)</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVideoAuditResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoAuditResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Double fps;

        @com.aliyun.core.annotation.NameInMap("FrameAudited")
        private Integer frameAudited;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("ImageUrls")
        private java.util.List<ImageUrls> imageUrls;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("TotalFrameAudit")
        private Integer totalFrameAudit;

        @com.aliyun.core.annotation.NameInMap("TotalFrames")
        private Integer totalFrames;

        @com.aliyun.core.annotation.NameInMap("TotalShots")
        private Integer totalShots;

        @com.aliyun.core.annotation.NameInMap("VideoFileKey")
        private String videoFileKey;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.errorMessage = builder.errorMessage;
            this.fps = builder.fps;
            this.frameAudited = builder.frameAudited;
            this.height = builder.height;
            this.imageUrls = builder.imageUrls;
            this.results = builder.results;
            this.status = builder.status;
            this.text = builder.text;
            this.totalFrameAudit = builder.totalFrameAudit;
            this.totalFrames = builder.totalFrames;
            this.totalShots = builder.totalShots;
            this.videoFileKey = builder.videoFileKey;
            this.videoUrl = builder.videoUrl;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fps
         */
        public Double getFps() {
            return this.fps;
        }

        /**
         * @return frameAudited
         */
        public Integer getFrameAudited() {
            return this.frameAudited;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return imageUrls
         */
        public java.util.List<ImageUrls> getImageUrls() {
            return this.imageUrls;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return totalFrameAudit
         */
        public Integer getTotalFrameAudit() {
            return this.totalFrameAudit;
        }

        /**
         * @return totalFrames
         */
        public Integer getTotalFrames() {
            return this.totalFrames;
        }

        /**
         * @return totalShots
         */
        public Integer getTotalShots() {
            return this.totalShots;
        }

        /**
         * @return videoFileKey
         */
        public String getVideoFileKey() {
            return this.videoFileKey;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Double duration; 
            private String errorMessage; 
            private Double fps; 
            private Integer frameAudited; 
            private Integer height; 
            private java.util.List<ImageUrls> imageUrls; 
            private java.util.List<Results> results; 
            private String status; 
            private String text; 
            private Integer totalFrameAudit; 
            private Integer totalFrames; 
            private Integer totalShots; 
            private String videoFileKey; 
            private String videoUrl; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.duration = model.duration;
                this.errorMessage = model.errorMessage;
                this.fps = model.fps;
                this.frameAudited = model.frameAudited;
                this.height = model.height;
                this.imageUrls = model.imageUrls;
                this.results = model.results;
                this.status = model.status;
                this.text = model.text;
                this.totalFrameAudit = model.totalFrameAudit;
                this.totalFrames = model.totalFrames;
                this.totalShots = model.totalShots;
                this.videoFileKey = model.videoFileKey;
                this.videoUrl = model.videoUrl;
                this.width = model.width;
            } 

            /**
             * <p>视频总时长（秒）</p>
             * 
             * <strong>example:</strong>
             * <p>120.5</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>任务执行失败时的错误信息</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>视频帧率（FPS）</p>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder fps(Double fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>已经完成审核的帧数</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder frameAudited(Integer frameAudited) {
                this.frameAudited = frameAudited;
                return this;
            }

            /**
             * <p>视频高度（像素）</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>抽取的图片URL列表</p>
             */
            public Builder imageUrls(java.util.List<ImageUrls> imageUrls) {
                this.imageUrls = imageUrls;
                return this;
            }

            /**
             * <p>图片审核结果详情</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>任务状态：PENDING(待执行)、RUNNING(执行中)、SUCCESSED(成功)、FAILED(失败)、CANCELED(取消)</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>视频审校的文本结果</p>
             * 
             * <strong>example:</strong>
             * <p>视频审核完成</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>需要审核的视频帧总数</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder totalFrameAudit(Integer totalFrameAudit) {
                this.totalFrameAudit = totalFrameAudit;
                return this;
            }

            /**
             * <p>视频总帧数</p>
             * 
             * <strong>example:</strong>
             * <p>3615</p>
             */
            public Builder totalFrames(Integer totalFrames) {
                this.totalFrames = totalFrames;
                return this;
            }

            /**
             * <p>检测到的视频分镜总数</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder totalShots(Integer totalShots) {
                this.totalShots = totalShots;
                return this;
            }

            /**
             * <p>被审核的视频文件Key</p>
             * 
             * <strong>example:</strong>
             * <p>video/test.mp4</p>
             */
            public Builder videoFileKey(String videoFileKey) {
                this.videoFileKey = videoFileKey;
                return this;
            }

            /**
             * <p>被审核的视频URL地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * <p>视频宽度（像素）</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
