// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>MerchandiseSceneDetectionResponseBody</p>
 */
public class MerchandiseSceneDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MerchandiseSceneDetectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandiseSceneDetectionResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MerchandiseSceneDetectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The display scene detection result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MerchandiseSceneDetectionResponseBody build() {
            return new MerchandiseSceneDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox_2d")
        private java.util.List<Double> bbox2d;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Regions(Builder builder) {
            this.bbox2d = builder.bbox2d;
            this.label = builder.label;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return bbox2d
         */
        public java.util.List<Double> getBbox2d() {
            return this.bbox2d;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Double> bbox2d; 
            private String label; 
            private String text; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.bbox2d = model.bbox2d;
                this.label = model.label;
                this.text = model.text;
            } 

            /**
             * <p>The 2D bounding box in the format of [top-left x, top-left y, bottom-right x, bottom-right y]. Valid values: 0 to 1000. The left coordinate must be less than the right coordinate, and the top coordinate must be less than the bottom coordinate.</p>
             */
            public Builder bbox2d(java.util.List<Double> bbox2d) {
                this.bbox2d = bbox2d;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>shelf</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The recognized text.</p>
             * 
             * <strong>example:</strong>
             * <p>Multi-tier product display shelf</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class Grounding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<Regions> regions;

        private Grounding(Builder builder) {
            this.coverage = builder.coverage;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grounding create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return regions
         */
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String coverage; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(Grounding model) {
                this.coverage = model.coverage;
                this.regions = model.regions;
            } 

            /**
             * <p>The coverage.</p>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The list of regions.</p>
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public Grounding build() {
                return new Grounding(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class SceneLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Double y;

        private SceneLocation(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneLocation create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double x; 
            private Double y; 

            private Builder() {
            } 

            private Builder(SceneLocation model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The x-coordinate of the region point.</p>
             * 
             * <strong>example:</strong>
             * <p>0.431</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate of the region point.</p>
             * 
             * <strong>example:</strong>
             * <p>0.973</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public SceneLocation build() {
                return new SceneLocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaRate")
        private Double areaRate;

        @com.aliyun.core.annotation.NameInMap("OwnPurity")
        private Double ownPurity;

        @com.aliyun.core.annotation.NameInMap("Plumpness")
        private Double plumpness;

        @com.aliyun.core.annotation.NameInMap("SceneActualName")
        private String sceneActualName;

        @com.aliyun.core.annotation.NameInMap("SceneCenter")
        private java.util.List<Double> sceneCenter;

        @com.aliyun.core.annotation.NameInMap("SceneLocation")
        private java.util.List<SceneLocation> sceneLocation;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("ShelfDistributionRate")
        private Double shelfDistributionRate;

        private Scenes(Builder builder) {
            this.areaRate = builder.areaRate;
            this.ownPurity = builder.ownPurity;
            this.plumpness = builder.plumpness;
            this.sceneActualName = builder.sceneActualName;
            this.sceneCenter = builder.sceneCenter;
            this.sceneLocation = builder.sceneLocation;
            this.sceneName = builder.sceneName;
            this.shelfDistributionRate = builder.shelfDistributionRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return areaRate
         */
        public Double getAreaRate() {
            return this.areaRate;
        }

        /**
         * @return ownPurity
         */
        public Double getOwnPurity() {
            return this.ownPurity;
        }

        /**
         * @return plumpness
         */
        public Double getPlumpness() {
            return this.plumpness;
        }

        /**
         * @return sceneActualName
         */
        public String getSceneActualName() {
            return this.sceneActualName;
        }

        /**
         * @return sceneCenter
         */
        public java.util.List<Double> getSceneCenter() {
            return this.sceneCenter;
        }

        /**
         * @return sceneLocation
         */
        public java.util.List<SceneLocation> getSceneLocation() {
            return this.sceneLocation;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return shelfDistributionRate
         */
        public Double getShelfDistributionRate() {
            return this.shelfDistributionRate;
        }

        public static final class Builder {
            private Double areaRate; 
            private Double ownPurity; 
            private Double plumpness; 
            private String sceneActualName; 
            private java.util.List<Double> sceneCenter; 
            private java.util.List<SceneLocation> sceneLocation; 
            private String sceneName; 
            private Double shelfDistributionRate; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.areaRate = model.areaRate;
                this.ownPurity = model.ownPurity;
                this.plumpness = model.plumpness;
                this.sceneActualName = model.sceneActualName;
                this.sceneCenter = model.sceneCenter;
                this.sceneLocation = model.sceneLocation;
                this.sceneName = model.sceneName;
                this.shelfDistributionRate = model.shelfDistributionRate;
            } 

            /**
             * <p>Optional. The area proportion.</p>
             * 
             * <strong>example:</strong>
             * <p>0.985</p>
             */
            public Builder areaRate(Double areaRate) {
                this.areaRate = areaRate;
                return this;
            }

            /**
             * <p>Optional. The purity metric for proprietary products. The specific business criteria are subject to the recognition service.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ownPurity(Double ownPurity) {
                this.ownPurity = ownPurity;
                return this;
            }

            /**
             * <p>Optional. The display plumpness metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder plumpness(Double plumpness) {
                this.plumpness = plumpness;
                return this;
            }

            /**
             * <p>The display name of the scene. If omitted, the value is an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>Air-cooled display cabinet</p>
             */
            public Builder sceneActualName(String sceneActualName) {
                this.sceneActualName = sceneActualName;
                return this;
            }

            /**
             * <p>The center point of the scene, which retains the original normalized coordinates. If omitted, the value is an empty array.</p>
             */
            public Builder sceneCenter(java.util.List<Double> sceneCenter) {
                this.sceneCenter = sceneCenter;
                return this;
            }

            /**
             * <p>The list of region points. Each item is in the {x,y} format and retains the original normalized coordinates. If omitted, the value is an empty array.</p>
             */
            public Builder sceneLocation(java.util.List<SceneLocation> sceneLocation) {
                this.sceneLocation = sceneLocation;
                return this;
            }

            /**
             * <p>The scene identifier. This parameter is required and cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>yl_cj_lfg</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>Optional. The shelf distribution proportion metric. The specific business criteria are subject to the recognition service.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder shelfDistributionRate(Double shelfDistributionRate) {
                this.shelfDistributionRate = shelfDistributionRate;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grounding")
        private Grounding grounding;

        @com.aliyun.core.annotation.NameInMap("Scenes")
        private java.util.List<Scenes> scenes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.grounding = builder.grounding;
            this.scenes = builder.scenes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return grounding
         */
        public Grounding getGrounding() {
            return this.grounding;
        }

        /**
         * @return scenes
         */
        public java.util.List<Scenes> getScenes() {
            return this.scenes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Grounding grounding; 
            private java.util.List<Scenes> scenes; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.grounding = model.grounding;
                this.scenes = model.scenes;
                this.type = model.type;
            } 

            /**
             * <p>The positioning information.</p>
             */
            public Builder grounding(Grounding grounding) {
                this.grounding = grounding;
                return this;
            }

            /**
             * <p>The list of recognized scenes.</p>
             */
            public Builder scenes(java.util.List<Scenes> scenes) {
                this.scenes = scenes;
                return this;
            }

            /**
             * <p>Fixed value: scene.</p>
             * 
             * <strong>example:</strong>
             * <p>scene</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link MerchandiseSceneDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>MerchandiseSceneDetectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.result = builder.result;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Result result; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The details of the display scene detection result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessingCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
