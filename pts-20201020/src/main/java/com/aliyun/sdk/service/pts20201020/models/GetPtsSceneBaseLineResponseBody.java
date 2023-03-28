// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsSceneBaseLineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsSceneBaseLineResponseBody</p>
 */
public class GetPtsSceneBaseLineResponseBody extends TeaModel {
    @NameInMap("Baseline")
    private Baseline baseline;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneId")
    private String sceneId;

    @NameInMap("Success")
    private Boolean success;

    private GetPtsSceneBaseLineResponseBody(Builder builder) {
        this.baseline = builder.baseline;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsSceneBaseLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return baseline
     */
    public Baseline getBaseline() {
        return this.baseline;
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Baseline baseline; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String sceneId; 
        private Boolean success; 

        /**
         * Baseline.
         */
        public Builder baseline(Baseline baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsSceneBaseLineResponseBody build() {
            return new GetPtsSceneBaseLineResponseBody(this);
        } 

    } 

    public static class ApiBaselines extends TeaModel {
        @NameInMap("AvgRt")
        private Float avgRt;

        @NameInMap("AvgTps")
        private Float avgTps;

        @NameInMap("FailCountBiz")
        private Long failCountBiz;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxRt")
        private Integer maxRt;

        @NameInMap("MinRt")
        private Integer minRt;

        @NameInMap("Name")
        private String name;

        @NameInMap("Seg90Rt")
        private Float seg90Rt;

        @NameInMap("Seg99Rt")
        private Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @NameInMap("SuccessRateReq")
        private Float successRateReq;

        private ApiBaselines(Builder builder) {
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountBiz = builder.failCountBiz;
            this.failCountReq = builder.failCountReq;
            this.id = builder.id;
            this.maxRt = builder.maxRt;
            this.minRt = builder.minRt;
            this.name = builder.name;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateBiz = builder.successRateBiz;
            this.successRateReq = builder.successRateReq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiBaselines create() {
            return builder().build();
        }

        /**
         * @return avgRt
         */
        public Float getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Float getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountBiz
         */
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        /**
         * @return failCountReq
         */
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxRt
         */
        public Integer getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return minRt
         */
        public Integer getMinRt() {
            return this.minRt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return seg90Rt
         */
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateBiz
         */
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        /**
         * @return successRateReq
         */
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Float avgRt; 
            private Float avgTps; 
            private Long failCountBiz; 
            private Long failCountReq; 
            private Long id; 
            private Integer maxRt; 
            private Integer minRt; 
            private String name; 
            private Float seg90Rt; 
            private Float seg99Rt; 
            private Float successRateBiz; 
            private Float successRateReq; 

            /**
             * AvgRt.
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountBiz.
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * FailCountReq.
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MaxRt.
             */
            public Builder maxRt(Integer maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * MinRt.
             */
            public Builder minRt(Integer minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Seg90Rt.
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateBiz.
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * SuccessRateReq.
             */
            public Builder successRateReq(Float successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public ApiBaselines build() {
                return new ApiBaselines(this);
            } 

        } 

    }
    public static class SceneBaseline extends TeaModel {
        @NameInMap("AvgRt")
        private Float avgRt;

        @NameInMap("AvgTps")
        private Float avgTps;

        @NameInMap("FailCountBiz")
        private Long failCountBiz;

        @NameInMap("FailCountReq")
        private Long failCountReq;

        @NameInMap("Seg90Rt")
        private Float seg90Rt;

        @NameInMap("Seg99Rt")
        private Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @NameInMap("SuccessRateReq")
        private Float successRateReq;

        private SceneBaseline(Builder builder) {
            this.avgRt = builder.avgRt;
            this.avgTps = builder.avgTps;
            this.failCountBiz = builder.failCountBiz;
            this.failCountReq = builder.failCountReq;
            this.seg90Rt = builder.seg90Rt;
            this.seg99Rt = builder.seg99Rt;
            this.successRateBiz = builder.successRateBiz;
            this.successRateReq = builder.successRateReq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneBaseline create() {
            return builder().build();
        }

        /**
         * @return avgRt
         */
        public Float getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgTps
         */
        public Float getAvgTps() {
            return this.avgTps;
        }

        /**
         * @return failCountBiz
         */
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        /**
         * @return failCountReq
         */
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        /**
         * @return seg90Rt
         */
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        /**
         * @return seg99Rt
         */
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        /**
         * @return successRateBiz
         */
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        /**
         * @return successRateReq
         */
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

        public static final class Builder {
            private Float avgRt; 
            private Float avgTps; 
            private Long failCountBiz; 
            private Long failCountReq; 
            private Float seg90Rt; 
            private Float seg99Rt; 
            private Float successRateBiz; 
            private Float successRateReq; 

            /**
             * AvgRt.
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgTps.
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * FailCountBiz.
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * FailCountReq.
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * Seg90Rt.
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * Seg99Rt.
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * SuccessRateBiz.
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * SuccessRateReq.
             */
            public Builder successRateReq(Float successRateReq) {
                this.successRateReq = successRateReq;
                return this;
            }

            public SceneBaseline build() {
                return new SceneBaseline(this);
            } 

        } 

    }
    public static class Baseline extends TeaModel {
        @NameInMap("ApiBaselines")
        private java.util.List < ApiBaselines> apiBaselines;

        @NameInMap("Name")
        private String name;

        @NameInMap("SceneBaseline")
        private SceneBaseline sceneBaseline;

        private Baseline(Builder builder) {
            this.apiBaselines = builder.apiBaselines;
            this.name = builder.name;
            this.sceneBaseline = builder.sceneBaseline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baseline create() {
            return builder().build();
        }

        /**
         * @return apiBaselines
         */
        public java.util.List < ApiBaselines> getApiBaselines() {
            return this.apiBaselines;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sceneBaseline
         */
        public SceneBaseline getSceneBaseline() {
            return this.sceneBaseline;
        }

        public static final class Builder {
            private java.util.List < ApiBaselines> apiBaselines; 
            private String name; 
            private SceneBaseline sceneBaseline; 

            /**
             * ApiBaselines.
             */
            public Builder apiBaselines(java.util.List < ApiBaselines> apiBaselines) {
                this.apiBaselines = apiBaselines;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SceneBaseline.
             */
            public Builder sceneBaseline(SceneBaseline sceneBaseline) {
                this.sceneBaseline = sceneBaseline;
                return this;
            }

            public Baseline build() {
                return new Baseline(this);
            } 

        } 

    }
}
