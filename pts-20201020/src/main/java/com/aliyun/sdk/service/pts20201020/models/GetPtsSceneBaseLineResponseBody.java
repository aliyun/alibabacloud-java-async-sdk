// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetPtsSceneBaseLineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsSceneBaseLineResponseBody</p>
 */
public class GetPtsSceneBaseLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Baseline")
    private Baseline baseline;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPtsSceneBaseLineResponseBody model) {
            this.baseline = model.baseline;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
            this.success = model.success;
        } 

        /**
         * <p>Baseline data</p>
         */
        public Builder baseline(Baseline baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * <p>The system status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F7D2CE0-AE4C-4143-955A-8E4595AF86A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>NHG67BF</p>
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true</li>
         * <li>false:</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsSceneBaseLineResponseBody build() {
            return new GetPtsSceneBaseLineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPtsSceneBaseLineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneBaseLineResponseBody</p>
     */
    public static class ApiBaselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Float avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Float avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountBiz")
        private Long failCountBiz;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private Integer maxRt;

        @com.aliyun.core.annotation.NameInMap("MinRt")
        private Integer minRt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Float seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Float seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
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

            private Builder() {
            } 

            private Builder(ApiBaselines model) {
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountBiz = model.failCountBiz;
                this.failCountReq = model.failCountReq;
                this.id = model.id;
                this.maxRt = model.maxRt;
                this.minRt = model.minRt;
                this.name = model.name;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateBiz = model.successRateBiz;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>Average RT</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * <p>Failures</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>76543</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxRt(Integer maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minRt(Integer minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * <p>The name of the API operation.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * <p>request success rate</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
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
    /**
     * 
     * {@link GetPtsSceneBaseLineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneBaseLineResponseBody</p>
     */
    public static class SceneBaseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Float avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgTps")
        private Float avgTps;

        @com.aliyun.core.annotation.NameInMap("FailCountBiz")
        private Long failCountBiz;

        @com.aliyun.core.annotation.NameInMap("FailCountReq")
        private Long failCountReq;

        @com.aliyun.core.annotation.NameInMap("Seg90Rt")
        private Float seg90Rt;

        @com.aliyun.core.annotation.NameInMap("Seg99Rt")
        private Float seg99Rt;

        @com.aliyun.core.annotation.NameInMap("SuccessRateBiz")
        private Float successRateBiz;

        @com.aliyun.core.annotation.NameInMap("SuccessRateReq")
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

            private Builder() {
            } 

            private Builder(SceneBaseline model) {
                this.avgRt = model.avgRt;
                this.avgTps = model.avgTps;
                this.failCountBiz = model.failCountBiz;
                this.failCountReq = model.failCountReq;
                this.seg90Rt = model.seg90Rt;
                this.seg99Rt = model.seg99Rt;
                this.successRateBiz = model.successRateBiz;
                this.successRateReq = model.successRateReq;
            } 

            /**
             * <p>Average RT</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder avgTps(Float avgTps) {
                this.avgTps = avgTps;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder failCountBiz(Long failCountBiz) {
                this.failCountBiz = failCountBiz;
                return this;
            }

            /**
             * <p>Failures</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder failCountReq(Long failCountReq) {
                this.failCountReq = failCountReq;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder seg90Rt(Float seg90Rt) {
                this.seg90Rt = seg90Rt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder seg99Rt(Float seg99Rt) {
                this.seg99Rt = seg99Rt;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder successRateBiz(Float successRateBiz) {
                this.successRateBiz = successRateBiz;
                return this;
            }

            /**
             * <p>request success rate</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
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
    /**
     * 
     * {@link GetPtsSceneBaseLineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsSceneBaseLineResponseBody</p>
     */
    public static class Baseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiBaselines")
        private java.util.List<ApiBaselines> apiBaselines;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneBaseline")
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
        public java.util.List<ApiBaselines> getApiBaselines() {
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
            private java.util.List<ApiBaselines> apiBaselines; 
            private String name; 
            private SceneBaseline sceneBaseline; 

            private Builder() {
            } 

            private Builder(Baseline model) {
                this.apiBaselines = model.apiBaselines;
                this.name = model.name;
                this.sceneBaseline = model.sceneBaseline;
            } 

            /**
             * <p>null</p>
             */
            public Builder apiBaselines(java.util.List<ApiBaselines> apiBaselines) {
                this.apiBaselines = apiBaselines;
                return this;
            }

            /**
             * <p>Scenario</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>null</p>
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
