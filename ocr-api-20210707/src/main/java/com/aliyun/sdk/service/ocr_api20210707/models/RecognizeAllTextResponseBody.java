// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

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
 * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeAllTextResponseBody</p>
 */
public class RecognizeAllTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RecognizeAllTextResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAllTextResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RecognizeAllTextResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public RecognizeAllTextResponseBody build() {
            return new RecognizeAllTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BarCodePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private BarCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(BarCodePoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BarCodePoints build() {
                return new BarCodePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BarCodeRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private BarCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(BarCodeRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BarCodeRect build() {
                return new BarCodeRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BarCodeDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BarCodeAngle")
        private Integer barCodeAngle;

        @com.aliyun.core.annotation.NameInMap("BarCodePoints")
        private java.util.List<BarCodePoints> barCodePoints;

        @com.aliyun.core.annotation.NameInMap("BarCodeRect")
        private BarCodeRect barCodeRect;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BarCodeDetails(Builder builder) {
            this.barCodeAngle = builder.barCodeAngle;
            this.barCodePoints = builder.barCodePoints;
            this.barCodeRect = builder.barCodeRect;
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeDetails create() {
            return builder().build();
        }

        /**
         * @return barCodeAngle
         */
        public Integer getBarCodeAngle() {
            return this.barCodeAngle;
        }

        /**
         * @return barCodePoints
         */
        public java.util.List<BarCodePoints> getBarCodePoints() {
            return this.barCodePoints;
        }

        /**
         * @return barCodeRect
         */
        public BarCodeRect getBarCodeRect() {
            return this.barCodeRect;
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer barCodeAngle; 
            private java.util.List<BarCodePoints> barCodePoints; 
            private BarCodeRect barCodeRect; 
            private Object data; 
            private String type; 

            private Builder() {
            } 

            private Builder(BarCodeDetails model) {
                this.barCodeAngle = model.barCodeAngle;
                this.barCodePoints = model.barCodePoints;
                this.barCodeRect = model.barCodeRect;
                this.data = model.data;
                this.type = model.type;
            } 

            /**
             * BarCodeAngle.
             */
            public Builder barCodeAngle(Integer barCodeAngle) {
                this.barCodeAngle = barCodeAngle;
                return this;
            }

            /**
             * BarCodePoints.
             */
            public Builder barCodePoints(java.util.List<BarCodePoints> barCodePoints) {
                this.barCodePoints = barCodePoints;
                return this;
            }

            /**
             * BarCodeRect.
             */
            public Builder barCodeRect(BarCodeRect barCodeRect) {
                this.barCodeRect = barCodeRect;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BarCodeDetails build() {
                return new BarCodeDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BarCodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BarCodeCount")
        private Integer barCodeCount;

        @com.aliyun.core.annotation.NameInMap("BarCodeDetails")
        private java.util.List<BarCodeDetails> barCodeDetails;

        private BarCodeInfo(Builder builder) {
            this.barCodeCount = builder.barCodeCount;
            this.barCodeDetails = builder.barCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeInfo create() {
            return builder().build();
        }

        /**
         * @return barCodeCount
         */
        public Integer getBarCodeCount() {
            return this.barCodeCount;
        }

        /**
         * @return barCodeDetails
         */
        public java.util.List<BarCodeDetails> getBarCodeDetails() {
            return this.barCodeDetails;
        }

        public static final class Builder {
            private Integer barCodeCount; 
            private java.util.List<BarCodeDetails> barCodeDetails; 

            private Builder() {
            } 

            private Builder(BarCodeInfo model) {
                this.barCodeCount = model.barCodeCount;
                this.barCodeDetails = model.barCodeDetails;
            } 

            /**
             * BarCodeCount.
             */
            public Builder barCodeCount(Integer barCodeCount) {
                this.barCodeCount = barCodeCount;
                return this;
            }

            /**
             * BarCodeDetails.
             */
            public Builder barCodeDetails(java.util.List<BarCodeDetails> barCodeDetails) {
                this.barCodeDetails = barCodeDetails;
                return this;
            }

            public BarCodeInfo build() {
                return new BarCodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BlockPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private BlockPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(BlockPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BlockPoints build() {
                return new BlockPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BlockRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private BlockRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(BlockRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BlockRect build() {
                return new BlockRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CharPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private CharPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(CharPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CharPoints build() {
                return new CharPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CharRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private CharRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(CharRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CharRect build() {
                return new CharRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CharInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharConfidence")
        private Integer charConfidence;

        @com.aliyun.core.annotation.NameInMap("CharContent")
        private String charContent;

        @com.aliyun.core.annotation.NameInMap("CharId")
        private Integer charId;

        @com.aliyun.core.annotation.NameInMap("CharPoints")
        private java.util.List<CharPoints> charPoints;

        @com.aliyun.core.annotation.NameInMap("CharRect")
        private CharRect charRect;

        private CharInfos(Builder builder) {
            this.charConfidence = builder.charConfidence;
            this.charContent = builder.charContent;
            this.charId = builder.charId;
            this.charPoints = builder.charPoints;
            this.charRect = builder.charRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfos create() {
            return builder().build();
        }

        /**
         * @return charConfidence
         */
        public Integer getCharConfidence() {
            return this.charConfidence;
        }

        /**
         * @return charContent
         */
        public String getCharContent() {
            return this.charContent;
        }

        /**
         * @return charId
         */
        public Integer getCharId() {
            return this.charId;
        }

        /**
         * @return charPoints
         */
        public java.util.List<CharPoints> getCharPoints() {
            return this.charPoints;
        }

        /**
         * @return charRect
         */
        public CharRect getCharRect() {
            return this.charRect;
        }

        public static final class Builder {
            private Integer charConfidence; 
            private String charContent; 
            private Integer charId; 
            private java.util.List<CharPoints> charPoints; 
            private CharRect charRect; 

            private Builder() {
            } 

            private Builder(CharInfos model) {
                this.charConfidence = model.charConfidence;
                this.charContent = model.charContent;
                this.charId = model.charId;
                this.charPoints = model.charPoints;
                this.charRect = model.charRect;
            } 

            /**
             * CharConfidence.
             */
            public Builder charConfidence(Integer charConfidence) {
                this.charConfidence = charConfidence;
                return this;
            }

            /**
             * CharContent.
             */
            public Builder charContent(String charContent) {
                this.charContent = charContent;
                return this;
            }

            /**
             * CharId.
             */
            public Builder charId(Integer charId) {
                this.charId = charId;
                return this;
            }

            /**
             * CharPoints.
             */
            public Builder charPoints(java.util.List<CharPoints> charPoints) {
                this.charPoints = charPoints;
                return this;
            }

            /**
             * CharRect.
             */
            public Builder charRect(CharRect charRect) {
                this.charRect = charRect;
                return this;
            }

            public CharInfos build() {
                return new CharInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BlockDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockAngle")
        private Integer blockAngle;

        @com.aliyun.core.annotation.NameInMap("BlockConfidence")
        private Integer blockConfidence;

        @com.aliyun.core.annotation.NameInMap("BlockContent")
        private String blockContent;

        @com.aliyun.core.annotation.NameInMap("BlockId")
        private Integer blockId;

        @com.aliyun.core.annotation.NameInMap("BlockPoints")
        private java.util.List<BlockPoints> blockPoints;

        @com.aliyun.core.annotation.NameInMap("BlockRect")
        private BlockRect blockRect;

        @com.aliyun.core.annotation.NameInMap("CharInfos")
        private java.util.List<CharInfos> charInfos;

        private BlockDetails(Builder builder) {
            this.blockAngle = builder.blockAngle;
            this.blockConfidence = builder.blockConfidence;
            this.blockContent = builder.blockContent;
            this.blockId = builder.blockId;
            this.blockPoints = builder.blockPoints;
            this.blockRect = builder.blockRect;
            this.charInfos = builder.charInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockDetails create() {
            return builder().build();
        }

        /**
         * @return blockAngle
         */
        public Integer getBlockAngle() {
            return this.blockAngle;
        }

        /**
         * @return blockConfidence
         */
        public Integer getBlockConfidence() {
            return this.blockConfidence;
        }

        /**
         * @return blockContent
         */
        public String getBlockContent() {
            return this.blockContent;
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return blockPoints
         */
        public java.util.List<BlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        /**
         * @return blockRect
         */
        public BlockRect getBlockRect() {
            return this.blockRect;
        }

        /**
         * @return charInfos
         */
        public java.util.List<CharInfos> getCharInfos() {
            return this.charInfos;
        }

        public static final class Builder {
            private Integer blockAngle; 
            private Integer blockConfidence; 
            private String blockContent; 
            private Integer blockId; 
            private java.util.List<BlockPoints> blockPoints; 
            private BlockRect blockRect; 
            private java.util.List<CharInfos> charInfos; 

            private Builder() {
            } 

            private Builder(BlockDetails model) {
                this.blockAngle = model.blockAngle;
                this.blockConfidence = model.blockConfidence;
                this.blockContent = model.blockContent;
                this.blockId = model.blockId;
                this.blockPoints = model.blockPoints;
                this.blockRect = model.blockRect;
                this.charInfos = model.charInfos;
            } 

            /**
             * BlockAngle.
             */
            public Builder blockAngle(Integer blockAngle) {
                this.blockAngle = blockAngle;
                return this;
            }

            /**
             * BlockConfidence.
             */
            public Builder blockConfidence(Integer blockConfidence) {
                this.blockConfidence = blockConfidence;
                return this;
            }

            /**
             * BlockContent.
             */
            public Builder blockContent(String blockContent) {
                this.blockContent = blockContent;
                return this;
            }

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * BlockPoints.
             */
            public Builder blockPoints(java.util.List<BlockPoints> blockPoints) {
                this.blockPoints = blockPoints;
                return this;
            }

            /**
             * BlockRect.
             */
            public Builder blockRect(BlockRect blockRect) {
                this.blockRect = blockRect;
                return this;
            }

            /**
             * CharInfos.
             */
            public Builder charInfos(java.util.List<CharInfos> charInfos) {
                this.charInfos = charInfos;
                return this;
            }

            public BlockDetails build() {
                return new BlockDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class BlockInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockCount")
        private Integer blockCount;

        @com.aliyun.core.annotation.NameInMap("BlockDetails")
        private java.util.List<BlockDetails> blockDetails;

        private BlockInfo(Builder builder) {
            this.blockCount = builder.blockCount;
            this.blockDetails = builder.blockDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInfo create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return blockDetails
         */
        public java.util.List<BlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

        public static final class Builder {
            private Integer blockCount; 
            private java.util.List<BlockDetails> blockDetails; 

            private Builder() {
            } 

            private Builder(BlockInfo model) {
                this.blockCount = model.blockCount;
                this.blockDetails = model.blockDetails;
            } 

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * BlockDetails.
             */
            public Builder blockDetails(java.util.List<BlockDetails> blockDetails) {
                this.blockDetails = blockDetails;
                return this;
            }

            public BlockInfo build() {
                return new BlockInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class KvInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("KvCount")
        private Integer kvCount;

        @com.aliyun.core.annotation.NameInMap("KvDetails")
        private java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> kvDetails;

        private KvInfo(Builder builder) {
            this.data = builder.data;
            this.kvCount = builder.kvCount;
            this.kvDetails = builder.kvDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvInfo create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return kvCount
         */
        public Integer getKvCount() {
            return this.kvCount;
        }

        /**
         * @return kvDetails
         */
        public java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> getKvDetails() {
            return this.kvDetails;
        }

        public static final class Builder {
            private Object data; 
            private Integer kvCount; 
            private java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> kvDetails; 

            private Builder() {
            } 

            private Builder(KvInfo model) {
                this.data = model.data;
                this.kvCount = model.kvCount;
                this.kvDetails = model.kvDetails;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * KvCount.
             */
            public Builder kvCount(Integer kvCount) {
                this.kvCount = kvCount;
                return this;
            }

            /**
             * KvDetails.
             */
            public Builder kvDetails(java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> kvDetails) {
                this.kvDetails = kvDetails;
                return this;
            }

            public KvInfo build() {
                return new KvInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class ParagraphDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockList")
        private java.util.List<Integer> blockList;

        @com.aliyun.core.annotation.NameInMap("ParagraphContent")
        private String paragraphContent;

        @com.aliyun.core.annotation.NameInMap("ParagraphId")
        private Integer paragraphId;

        private ParagraphDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.paragraphContent = builder.paragraphContent;
            this.paragraphId = builder.paragraphId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        /**
         * @return paragraphContent
         */
        public String getParagraphContent() {
            return this.paragraphContent;
        }

        /**
         * @return paragraphId
         */
        public Integer getParagraphId() {
            return this.paragraphId;
        }

        public static final class Builder {
            private java.util.List<Integer> blockList; 
            private String paragraphContent; 
            private Integer paragraphId; 

            private Builder() {
            } 

            private Builder(ParagraphDetails model) {
                this.blockList = model.blockList;
                this.paragraphContent = model.paragraphContent;
                this.paragraphId = model.paragraphId;
            } 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List<Integer> blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * ParagraphContent.
             */
            public Builder paragraphContent(String paragraphContent) {
                this.paragraphContent = paragraphContent;
                return this;
            }

            /**
             * ParagraphId.
             */
            public Builder paragraphId(Integer paragraphId) {
                this.paragraphId = paragraphId;
                return this;
            }

            public ParagraphDetails build() {
                return new ParagraphDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class ParagraphInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParagraphCount")
        private Integer paragraphCount;

        @com.aliyun.core.annotation.NameInMap("ParagraphDetails")
        private java.util.List<ParagraphDetails> paragraphDetails;

        private ParagraphInfo(Builder builder) {
            this.paragraphCount = builder.paragraphCount;
            this.paragraphDetails = builder.paragraphDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphInfo create() {
            return builder().build();
        }

        /**
         * @return paragraphCount
         */
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        /**
         * @return paragraphDetails
         */
        public java.util.List<ParagraphDetails> getParagraphDetails() {
            return this.paragraphDetails;
        }

        public static final class Builder {
            private Integer paragraphCount; 
            private java.util.List<ParagraphDetails> paragraphDetails; 

            private Builder() {
            } 

            private Builder(ParagraphInfo model) {
                this.paragraphCount = model.paragraphCount;
                this.paragraphDetails = model.paragraphDetails;
            } 

            /**
             * ParagraphCount.
             */
            public Builder paragraphCount(Integer paragraphCount) {
                this.paragraphCount = paragraphCount;
                return this;
            }

            /**
             * ParagraphDetails.
             */
            public Builder paragraphDetails(java.util.List<ParagraphDetails> paragraphDetails) {
                this.paragraphDetails = paragraphDetails;
                return this;
            }

            public ParagraphInfo build() {
                return new ParagraphInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class QrCodePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private QrCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(QrCodePoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public QrCodePoints build() {
                return new QrCodePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class QrCodeRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private QrCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(QrCodeRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public QrCodeRect build() {
                return new QrCodeRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class QrCodeDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("QrCodeAngle")
        private Integer qrCodeAngle;

        @com.aliyun.core.annotation.NameInMap("QrCodePoints")
        private java.util.List<QrCodePoints> qrCodePoints;

        @com.aliyun.core.annotation.NameInMap("QrCodeRect")
        private QrCodeRect qrCodeRect;

        private QrCodeDetails(Builder builder) {
            this.data = builder.data;
            this.qrCodeAngle = builder.qrCodeAngle;
            this.qrCodePoints = builder.qrCodePoints;
            this.qrCodeRect = builder.qrCodeRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeDetails create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return qrCodeAngle
         */
        public Integer getQrCodeAngle() {
            return this.qrCodeAngle;
        }

        /**
         * @return qrCodePoints
         */
        public java.util.List<QrCodePoints> getQrCodePoints() {
            return this.qrCodePoints;
        }

        /**
         * @return qrCodeRect
         */
        public QrCodeRect getQrCodeRect() {
            return this.qrCodeRect;
        }

        public static final class Builder {
            private Object data; 
            private Integer qrCodeAngle; 
            private java.util.List<QrCodePoints> qrCodePoints; 
            private QrCodeRect qrCodeRect; 

            private Builder() {
            } 

            private Builder(QrCodeDetails model) {
                this.data = model.data;
                this.qrCodeAngle = model.qrCodeAngle;
                this.qrCodePoints = model.qrCodePoints;
                this.qrCodeRect = model.qrCodeRect;
            } 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * QrCodeAngle.
             */
            public Builder qrCodeAngle(Integer qrCodeAngle) {
                this.qrCodeAngle = qrCodeAngle;
                return this;
            }

            /**
             * QrCodePoints.
             */
            public Builder qrCodePoints(java.util.List<QrCodePoints> qrCodePoints) {
                this.qrCodePoints = qrCodePoints;
                return this;
            }

            /**
             * QrCodeRect.
             */
            public Builder qrCodeRect(QrCodeRect qrCodeRect) {
                this.qrCodeRect = qrCodeRect;
                return this;
            }

            public QrCodeDetails build() {
                return new QrCodeDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class QrCodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QrCodeCount")
        private Integer qrCodeCount;

        @com.aliyun.core.annotation.NameInMap("QrCodeDetails")
        private java.util.List<QrCodeDetails> qrCodeDetails;

        private QrCodeInfo(Builder builder) {
            this.qrCodeCount = builder.qrCodeCount;
            this.qrCodeDetails = builder.qrCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeInfo create() {
            return builder().build();
        }

        /**
         * @return qrCodeCount
         */
        public Integer getQrCodeCount() {
            return this.qrCodeCount;
        }

        /**
         * @return qrCodeDetails
         */
        public java.util.List<QrCodeDetails> getQrCodeDetails() {
            return this.qrCodeDetails;
        }

        public static final class Builder {
            private Integer qrCodeCount; 
            private java.util.List<QrCodeDetails> qrCodeDetails; 

            private Builder() {
            } 

            private Builder(QrCodeInfo model) {
                this.qrCodeCount = model.qrCodeCount;
                this.qrCodeDetails = model.qrCodeDetails;
            } 

            /**
             * QrCodeCount.
             */
            public Builder qrCodeCount(Integer qrCodeCount) {
                this.qrCodeCount = qrCodeCount;
                return this;
            }

            /**
             * QrCodeDetails.
             */
            public Builder qrCodeDetails(java.util.List<QrCodeDetails> qrCodeDetails) {
                this.qrCodeDetails = qrCodeDetails;
                return this;
            }

            public QrCodeInfo build() {
                return new QrCodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class QualityInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletenessScore")
        private Float completenessScore;

        @com.aliyun.core.annotation.NameInMap("IsCopy")
        private Boolean isCopy;

        @com.aliyun.core.annotation.NameInMap("IsReshoot")
        private Boolean isReshoot;

        @com.aliyun.core.annotation.NameInMap("QualityScore")
        private Float qualityScore;

        @com.aliyun.core.annotation.NameInMap("TamperScore")
        private Float tamperScore;

        private QualityInfo(Builder builder) {
            this.completenessScore = builder.completenessScore;
            this.isCopy = builder.isCopy;
            this.isReshoot = builder.isReshoot;
            this.qualityScore = builder.qualityScore;
            this.tamperScore = builder.tamperScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityInfo create() {
            return builder().build();
        }

        /**
         * @return completenessScore
         */
        public Float getCompletenessScore() {
            return this.completenessScore;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return isReshoot
         */
        public Boolean getIsReshoot() {
            return this.isReshoot;
        }

        /**
         * @return qualityScore
         */
        public Float getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return tamperScore
         */
        public Float getTamperScore() {
            return this.tamperScore;
        }

        public static final class Builder {
            private Float completenessScore; 
            private Boolean isCopy; 
            private Boolean isReshoot; 
            private Float qualityScore; 
            private Float tamperScore; 

            private Builder() {
            } 

            private Builder(QualityInfo model) {
                this.completenessScore = model.completenessScore;
                this.isCopy = model.isCopy;
                this.isReshoot = model.isReshoot;
                this.qualityScore = model.qualityScore;
                this.tamperScore = model.tamperScore;
            } 

            /**
             * CompletenessScore.
             */
            public Builder completenessScore(Float completenessScore) {
                this.completenessScore = completenessScore;
                return this;
            }

            /**
             * IsCopy.
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * IsReshoot.
             */
            public Builder isReshoot(Boolean isReshoot) {
                this.isReshoot = isReshoot;
                return this;
            }

            /**
             * QualityScore.
             */
            public Builder qualityScore(Float qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * TamperScore.
             */
            public Builder tamperScore(Float tamperScore) {
                this.tamperScore = tamperScore;
                return this;
            }

            public QualityInfo build() {
                return new QualityInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class RowDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockList")
        private java.util.List<Integer> blockList;

        @com.aliyun.core.annotation.NameInMap("RowContent")
        private String rowContent;

        @com.aliyun.core.annotation.NameInMap("RowId")
        private Integer rowId;

        private RowDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.rowContent = builder.rowContent;
            this.rowId = builder.rowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        /**
         * @return rowContent
         */
        public String getRowContent() {
            return this.rowContent;
        }

        /**
         * @return rowId
         */
        public Integer getRowId() {
            return this.rowId;
        }

        public static final class Builder {
            private java.util.List<Integer> blockList; 
            private String rowContent; 
            private Integer rowId; 

            private Builder() {
            } 

            private Builder(RowDetails model) {
                this.blockList = model.blockList;
                this.rowContent = model.rowContent;
                this.rowId = model.rowId;
            } 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List<Integer> blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * RowContent.
             */
            public Builder rowContent(String rowContent) {
                this.rowContent = rowContent;
                return this;
            }

            /**
             * RowId.
             */
            public Builder rowId(Integer rowId) {
                this.rowId = rowId;
                return this;
            }

            public RowDetails build() {
                return new RowDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class RowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        @com.aliyun.core.annotation.NameInMap("RowDetails")
        private java.util.List<RowDetails> rowDetails;

        private RowInfo(Builder builder) {
            this.rowCount = builder.rowCount;
            this.rowDetails = builder.rowDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowInfo create() {
            return builder().build();
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rowDetails
         */
        public java.util.List<RowDetails> getRowDetails() {
            return this.rowDetails;
        }

        public static final class Builder {
            private Integer rowCount; 
            private java.util.List<RowDetails> rowDetails; 

            private Builder() {
            } 

            private Builder(RowInfo model) {
                this.rowCount = model.rowCount;
                this.rowDetails = model.rowDetails;
            } 

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * RowDetails.
             */
            public Builder rowDetails(java.util.List<RowDetails> rowDetails) {
                this.rowDetails = rowDetails;
                return this;
            }

            public RowInfo build() {
                return new RowInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class StampDetailsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntiFakeCode")
        private String antiFakeCode;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private String companyId;

        @com.aliyun.core.annotation.NameInMap("OrganizationName")
        private String organizationName;

        @com.aliyun.core.annotation.NameInMap("OrganizationNameEng")
        private String organizationNameEng;

        @com.aliyun.core.annotation.NameInMap("OtherText")
        private String otherText;

        @com.aliyun.core.annotation.NameInMap("TaxpayerId")
        private String taxpayerId;

        @com.aliyun.core.annotation.NameInMap("TopText")
        private String topText;

        private StampDetailsData(Builder builder) {
            this.antiFakeCode = builder.antiFakeCode;
            this.companyId = builder.companyId;
            this.organizationName = builder.organizationName;
            this.organizationNameEng = builder.organizationNameEng;
            this.otherText = builder.otherText;
            this.taxpayerId = builder.taxpayerId;
            this.topText = builder.topText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetailsData create() {
            return builder().build();
        }

        /**
         * @return antiFakeCode
         */
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        /**
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return organizationNameEng
         */
        public String getOrganizationNameEng() {
            return this.organizationNameEng;
        }

        /**
         * @return otherText
         */
        public String getOtherText() {
            return this.otherText;
        }

        /**
         * @return taxpayerId
         */
        public String getTaxpayerId() {
            return this.taxpayerId;
        }

        /**
         * @return topText
         */
        public String getTopText() {
            return this.topText;
        }

        public static final class Builder {
            private String antiFakeCode; 
            private String companyId; 
            private String organizationName; 
            private String organizationNameEng; 
            private String otherText; 
            private String taxpayerId; 
            private String topText; 

            private Builder() {
            } 

            private Builder(StampDetailsData model) {
                this.antiFakeCode = model.antiFakeCode;
                this.companyId = model.companyId;
                this.organizationName = model.organizationName;
                this.organizationNameEng = model.organizationNameEng;
                this.otherText = model.otherText;
                this.taxpayerId = model.taxpayerId;
                this.topText = model.topText;
            } 

            /**
             * AntiFakeCode.
             */
            public Builder antiFakeCode(String antiFakeCode) {
                this.antiFakeCode = antiFakeCode;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * OrganizationNameEng.
             */
            public Builder organizationNameEng(String organizationNameEng) {
                this.organizationNameEng = organizationNameEng;
                return this;
            }

            /**
             * OtherText.
             */
            public Builder otherText(String otherText) {
                this.otherText = otherText;
                return this;
            }

            /**
             * TaxpayerId.
             */
            public Builder taxpayerId(String taxpayerId) {
                this.taxpayerId = taxpayerId;
                return this;
            }

            /**
             * TopText.
             */
            public Builder topText(String topText) {
                this.topText = topText;
                return this;
            }

            public StampDetailsData build() {
                return new StampDetailsData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class StampPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private StampPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(StampPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public StampPoints build() {
                return new StampPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class StampRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private StampRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(StampRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public StampRect build() {
                return new StampRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class StampDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private StampDetailsData data;

        @com.aliyun.core.annotation.NameInMap("StampAngle")
        private Integer stampAngle;

        @com.aliyun.core.annotation.NameInMap("StampPoints")
        private java.util.List<StampPoints> stampPoints;

        @com.aliyun.core.annotation.NameInMap("StampRect")
        private StampRect stampRect;

        private StampDetails(Builder builder) {
            this.data = builder.data;
            this.stampAngle = builder.stampAngle;
            this.stampPoints = builder.stampPoints;
            this.stampRect = builder.stampRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetails create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public StampDetailsData getData() {
            return this.data;
        }

        /**
         * @return stampAngle
         */
        public Integer getStampAngle() {
            return this.stampAngle;
        }

        /**
         * @return stampPoints
         */
        public java.util.List<StampPoints> getStampPoints() {
            return this.stampPoints;
        }

        /**
         * @return stampRect
         */
        public StampRect getStampRect() {
            return this.stampRect;
        }

        public static final class Builder {
            private StampDetailsData data; 
            private Integer stampAngle; 
            private java.util.List<StampPoints> stampPoints; 
            private StampRect stampRect; 

            private Builder() {
            } 

            private Builder(StampDetails model) {
                this.data = model.data;
                this.stampAngle = model.stampAngle;
                this.stampPoints = model.stampPoints;
                this.stampRect = model.stampRect;
            } 

            /**
             * Data.
             */
            public Builder data(StampDetailsData data) {
                this.data = data;
                return this;
            }

            /**
             * StampAngle.
             */
            public Builder stampAngle(Integer stampAngle) {
                this.stampAngle = stampAngle;
                return this;
            }

            /**
             * StampPoints.
             */
            public Builder stampPoints(java.util.List<StampPoints> stampPoints) {
                this.stampPoints = stampPoints;
                return this;
            }

            /**
             * StampRect.
             */
            public Builder stampRect(StampRect stampRect) {
                this.stampRect = stampRect;
                return this;
            }

            public StampDetails build() {
                return new StampDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class StampInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StampCount")
        private Integer stampCount;

        @com.aliyun.core.annotation.NameInMap("StampDetails")
        private java.util.List<StampDetails> stampDetails;

        private StampInfo(Builder builder) {
            this.stampCount = builder.stampCount;
            this.stampDetails = builder.stampDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampInfo create() {
            return builder().build();
        }

        /**
         * @return stampCount
         */
        public Integer getStampCount() {
            return this.stampCount;
        }

        /**
         * @return stampDetails
         */
        public java.util.List<StampDetails> getStampDetails() {
            return this.stampDetails;
        }

        public static final class Builder {
            private Integer stampCount; 
            private java.util.List<StampDetails> stampDetails; 

            private Builder() {
            } 

            private Builder(StampInfo model) {
                this.stampCount = model.stampCount;
                this.stampDetails = model.stampDetails;
            } 

            /**
             * StampCount.
             */
            public Builder stampCount(Integer stampCount) {
                this.stampCount = stampCount;
                return this;
            }

            /**
             * StampDetails.
             */
            public Builder stampDetails(java.util.List<StampDetails> stampDetails) {
                this.stampDetails = stampDetails;
                return this;
            }

            public StampInfo build() {
                return new StampInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class SubImagePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private SubImagePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImagePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(SubImagePoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubImagePoints build() {
                return new SubImagePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class SubImageRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private SubImageRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImageRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(SubImageRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SubImageRect build() {
                return new SubImageRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CellPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private CellPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(CellPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CellPoints build() {
                return new CellPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CellRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private CellRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(CellRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CellRect build() {
                return new CellRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class CellDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockList")
        private java.util.List<Integer> blockList;

        @com.aliyun.core.annotation.NameInMap("CellAngle")
        private Integer cellAngle;

        @com.aliyun.core.annotation.NameInMap("CellContent")
        private String cellContent;

        @com.aliyun.core.annotation.NameInMap("CellId")
        private Integer cellId;

        @com.aliyun.core.annotation.NameInMap("CellPoints")
        private java.util.List<CellPoints> cellPoints;

        @com.aliyun.core.annotation.NameInMap("CellRect")
        private CellRect cellRect;

        @com.aliyun.core.annotation.NameInMap("ColumnEnd")
        private Integer columnEnd;

        @com.aliyun.core.annotation.NameInMap("ColumnStart")
        private Integer columnStart;

        @com.aliyun.core.annotation.NameInMap("RowEnd")
        private Integer rowEnd;

        @com.aliyun.core.annotation.NameInMap("RowStart")
        private Integer rowStart;

        private CellDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.cellAngle = builder.cellAngle;
            this.cellContent = builder.cellContent;
            this.cellId = builder.cellId;
            this.cellPoints = builder.cellPoints;
            this.cellRect = builder.cellRect;
            this.columnEnd = builder.columnEnd;
            this.columnStart = builder.columnStart;
            this.rowEnd = builder.rowEnd;
            this.rowStart = builder.rowStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        /**
         * @return cellAngle
         */
        public Integer getCellAngle() {
            return this.cellAngle;
        }

        /**
         * @return cellContent
         */
        public String getCellContent() {
            return this.cellContent;
        }

        /**
         * @return cellId
         */
        public Integer getCellId() {
            return this.cellId;
        }

        /**
         * @return cellPoints
         */
        public java.util.List<CellPoints> getCellPoints() {
            return this.cellPoints;
        }

        /**
         * @return cellRect
         */
        public CellRect getCellRect() {
            return this.cellRect;
        }

        /**
         * @return columnEnd
         */
        public Integer getColumnEnd() {
            return this.columnEnd;
        }

        /**
         * @return columnStart
         */
        public Integer getColumnStart() {
            return this.columnStart;
        }

        /**
         * @return rowEnd
         */
        public Integer getRowEnd() {
            return this.rowEnd;
        }

        /**
         * @return rowStart
         */
        public Integer getRowStart() {
            return this.rowStart;
        }

        public static final class Builder {
            private java.util.List<Integer> blockList; 
            private Integer cellAngle; 
            private String cellContent; 
            private Integer cellId; 
            private java.util.List<CellPoints> cellPoints; 
            private CellRect cellRect; 
            private Integer columnEnd; 
            private Integer columnStart; 
            private Integer rowEnd; 
            private Integer rowStart; 

            private Builder() {
            } 

            private Builder(CellDetails model) {
                this.blockList = model.blockList;
                this.cellAngle = model.cellAngle;
                this.cellContent = model.cellContent;
                this.cellId = model.cellId;
                this.cellPoints = model.cellPoints;
                this.cellRect = model.cellRect;
                this.columnEnd = model.columnEnd;
                this.columnStart = model.columnStart;
                this.rowEnd = model.rowEnd;
                this.rowStart = model.rowStart;
            } 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List<Integer> blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * CellAngle.
             */
            public Builder cellAngle(Integer cellAngle) {
                this.cellAngle = cellAngle;
                return this;
            }

            /**
             * CellContent.
             */
            public Builder cellContent(String cellContent) {
                this.cellContent = cellContent;
                return this;
            }

            /**
             * CellId.
             */
            public Builder cellId(Integer cellId) {
                this.cellId = cellId;
                return this;
            }

            /**
             * CellPoints.
             */
            public Builder cellPoints(java.util.List<CellPoints> cellPoints) {
                this.cellPoints = cellPoints;
                return this;
            }

            /**
             * CellRect.
             */
            public Builder cellRect(CellRect cellRect) {
                this.cellRect = cellRect;
                return this;
            }

            /**
             * ColumnEnd.
             */
            public Builder columnEnd(Integer columnEnd) {
                this.columnEnd = columnEnd;
                return this;
            }

            /**
             * ColumnStart.
             */
            public Builder columnStart(Integer columnStart) {
                this.columnStart = columnStart;
                return this;
            }

            /**
             * RowEnd.
             */
            public Builder rowEnd(Integer rowEnd) {
                this.rowEnd = rowEnd;
                return this;
            }

            /**
             * RowStart.
             */
            public Builder rowStart(Integer rowStart) {
                this.rowStart = rowStart;
                return this;
            }

            public CellDetails build() {
                return new CellDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class Footer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockId")
        private Integer blockId;

        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<String> contents;

        private Footer(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Footer create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List<String> getContents() {
            return this.contents;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List<String> contents; 

            private Builder() {
            } 

            private Builder(Footer model) {
                this.blockId = model.blockId;
                this.contents = model.contents;
            } 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List<String> contents) {
                this.contents = contents;
                return this;
            }

            public Footer build() {
                return new Footer(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class TableDetailsHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockId")
        private Integer blockId;

        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<String> contents;

        private TableDetailsHeader(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetailsHeader create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List<String> getContents() {
            return this.contents;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List<String> contents; 

            private Builder() {
            } 

            private Builder(TableDetailsHeader model) {
                this.blockId = model.blockId;
                this.contents = model.contents;
            } 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List<String> contents) {
                this.contents = contents;
                return this;
            }

            public TableDetailsHeader build() {
                return new TableDetailsHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class TablePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private TablePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(TablePoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public TablePoints build() {
                return new TablePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class TableRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private TableRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(TableRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public TableRect build() {
                return new TableRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class TableDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CellCount")
        private Integer cellCount;

        @com.aliyun.core.annotation.NameInMap("CellDetails")
        private java.util.List<CellDetails> cellDetails;

        @com.aliyun.core.annotation.NameInMap("ColumnCount")
        private Integer columnCount;

        @com.aliyun.core.annotation.NameInMap("Footer")
        private Footer footer;

        @com.aliyun.core.annotation.NameInMap("Header")
        private TableDetailsHeader header;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private Integer tableId;

        @com.aliyun.core.annotation.NameInMap("TablePoints")
        private java.util.List<TablePoints> tablePoints;

        @com.aliyun.core.annotation.NameInMap("TableRect")
        private TableRect tableRect;

        private TableDetails(Builder builder) {
            this.cellCount = builder.cellCount;
            this.cellDetails = builder.cellDetails;
            this.columnCount = builder.columnCount;
            this.footer = builder.footer;
            this.header = builder.header;
            this.rowCount = builder.rowCount;
            this.tableId = builder.tableId;
            this.tablePoints = builder.tablePoints;
            this.tableRect = builder.tableRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return cellCount
         */
        public Integer getCellCount() {
            return this.cellCount;
        }

        /**
         * @return cellDetails
         */
        public java.util.List<CellDetails> getCellDetails() {
            return this.cellDetails;
        }

        /**
         * @return columnCount
         */
        public Integer getColumnCount() {
            return this.columnCount;
        }

        /**
         * @return footer
         */
        public Footer getFooter() {
            return this.footer;
        }

        /**
         * @return header
         */
        public TableDetailsHeader getHeader() {
            return this.header;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return tableId
         */
        public Integer getTableId() {
            return this.tableId;
        }

        /**
         * @return tablePoints
         */
        public java.util.List<TablePoints> getTablePoints() {
            return this.tablePoints;
        }

        /**
         * @return tableRect
         */
        public TableRect getTableRect() {
            return this.tableRect;
        }

        public static final class Builder {
            private Integer cellCount; 
            private java.util.List<CellDetails> cellDetails; 
            private Integer columnCount; 
            private Footer footer; 
            private TableDetailsHeader header; 
            private Integer rowCount; 
            private Integer tableId; 
            private java.util.List<TablePoints> tablePoints; 
            private TableRect tableRect; 

            private Builder() {
            } 

            private Builder(TableDetails model) {
                this.cellCount = model.cellCount;
                this.cellDetails = model.cellDetails;
                this.columnCount = model.columnCount;
                this.footer = model.footer;
                this.header = model.header;
                this.rowCount = model.rowCount;
                this.tableId = model.tableId;
                this.tablePoints = model.tablePoints;
                this.tableRect = model.tableRect;
            } 

            /**
             * CellCount.
             */
            public Builder cellCount(Integer cellCount) {
                this.cellCount = cellCount;
                return this;
            }

            /**
             * CellDetails.
             */
            public Builder cellDetails(java.util.List<CellDetails> cellDetails) {
                this.cellDetails = cellDetails;
                return this;
            }

            /**
             * ColumnCount.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * Footer.
             */
            public Builder footer(Footer footer) {
                this.footer = footer;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(TableDetailsHeader header) {
                this.header = header;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(Integer tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TablePoints.
             */
            public Builder tablePoints(java.util.List<TablePoints> tablePoints) {
                this.tablePoints = tablePoints;
                return this;
            }

            /**
             * TableRect.
             */
            public Builder tableRect(TableRect tableRect) {
                this.tableRect = tableRect;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class TableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Integer tableCount;

        @com.aliyun.core.annotation.NameInMap("TableDetails")
        private java.util.List<TableDetails> tableDetails;

        @com.aliyun.core.annotation.NameInMap("TableExcel")
        private String tableExcel;

        @com.aliyun.core.annotation.NameInMap("TableHtml")
        private String tableHtml;

        private TableInfo(Builder builder) {
            this.tableCount = builder.tableCount;
            this.tableDetails = builder.tableDetails;
            this.tableExcel = builder.tableExcel;
            this.tableHtml = builder.tableHtml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tableDetails
         */
        public java.util.List<TableDetails> getTableDetails() {
            return this.tableDetails;
        }

        /**
         * @return tableExcel
         */
        public String getTableExcel() {
            return this.tableExcel;
        }

        /**
         * @return tableHtml
         */
        public String getTableHtml() {
            return this.tableHtml;
        }

        public static final class Builder {
            private Integer tableCount; 
            private java.util.List<TableDetails> tableDetails; 
            private String tableExcel; 
            private String tableHtml; 

            private Builder() {
            } 

            private Builder(TableInfo model) {
                this.tableCount = model.tableCount;
                this.tableDetails = model.tableDetails;
                this.tableExcel = model.tableExcel;
                this.tableHtml = model.tableHtml;
            } 

            /**
             * TableCount.
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * TableDetails.
             */
            public Builder tableDetails(java.util.List<TableDetails> tableDetails) {
                this.tableDetails = tableDetails;
                return this;
            }

            /**
             * TableExcel.
             */
            public Builder tableExcel(String tableExcel) {
                this.tableExcel = tableExcel;
                return this;
            }

            /**
             * TableHtml.
             */
            public Builder tableHtml(String tableHtml) {
                this.tableHtml = tableHtml;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class SubImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Integer angle;

        @com.aliyun.core.annotation.NameInMap("BarCodeInfo")
        private BarCodeInfo barCodeInfo;

        @com.aliyun.core.annotation.NameInMap("BlockInfo")
        private BlockInfo blockInfo;

        @com.aliyun.core.annotation.NameInMap("FigureInfo")
        private java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo;

        @com.aliyun.core.annotation.NameInMap("KvInfo")
        private KvInfo kvInfo;

        @com.aliyun.core.annotation.NameInMap("ParagraphInfo")
        private ParagraphInfo paragraphInfo;

        @com.aliyun.core.annotation.NameInMap("QrCodeInfo")
        private QrCodeInfo qrCodeInfo;

        @com.aliyun.core.annotation.NameInMap("QualityInfo")
        private QualityInfo qualityInfo;

        @com.aliyun.core.annotation.NameInMap("RowInfo")
        private RowInfo rowInfo;

        @com.aliyun.core.annotation.NameInMap("StampInfo")
        private StampInfo stampInfo;

        @com.aliyun.core.annotation.NameInMap("SubImageId")
        private Integer subImageId;

        @com.aliyun.core.annotation.NameInMap("SubImagePoints")
        private java.util.List<SubImagePoints> subImagePoints;

        @com.aliyun.core.annotation.NameInMap("SubImageRect")
        private SubImageRect subImageRect;

        @com.aliyun.core.annotation.NameInMap("TableInfo")
        private TableInfo tableInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SubImages(Builder builder) {
            this.angle = builder.angle;
            this.barCodeInfo = builder.barCodeInfo;
            this.blockInfo = builder.blockInfo;
            this.figureInfo = builder.figureInfo;
            this.kvInfo = builder.kvInfo;
            this.paragraphInfo = builder.paragraphInfo;
            this.qrCodeInfo = builder.qrCodeInfo;
            this.qualityInfo = builder.qualityInfo;
            this.rowInfo = builder.rowInfo;
            this.stampInfo = builder.stampInfo;
            this.subImageId = builder.subImageId;
            this.subImagePoints = builder.subImagePoints;
            this.subImageRect = builder.subImageRect;
            this.tableInfo = builder.tableInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImages create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return barCodeInfo
         */
        public BarCodeInfo getBarCodeInfo() {
            return this.barCodeInfo;
        }

        /**
         * @return blockInfo
         */
        public BlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        /**
         * @return figureInfo
         */
        public java.util.Map<String, DataSubImagesFigureInfoValue> getFigureInfo() {
            return this.figureInfo;
        }

        /**
         * @return kvInfo
         */
        public KvInfo getKvInfo() {
            return this.kvInfo;
        }

        /**
         * @return paragraphInfo
         */
        public ParagraphInfo getParagraphInfo() {
            return this.paragraphInfo;
        }

        /**
         * @return qrCodeInfo
         */
        public QrCodeInfo getQrCodeInfo() {
            return this.qrCodeInfo;
        }

        /**
         * @return qualityInfo
         */
        public QualityInfo getQualityInfo() {
            return this.qualityInfo;
        }

        /**
         * @return rowInfo
         */
        public RowInfo getRowInfo() {
            return this.rowInfo;
        }

        /**
         * @return stampInfo
         */
        public StampInfo getStampInfo() {
            return this.stampInfo;
        }

        /**
         * @return subImageId
         */
        public Integer getSubImageId() {
            return this.subImageId;
        }

        /**
         * @return subImagePoints
         */
        public java.util.List<SubImagePoints> getSubImagePoints() {
            return this.subImagePoints;
        }

        /**
         * @return subImageRect
         */
        public SubImageRect getSubImageRect() {
            return this.subImageRect;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer angle; 
            private BarCodeInfo barCodeInfo; 
            private BlockInfo blockInfo; 
            private java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo; 
            private KvInfo kvInfo; 
            private ParagraphInfo paragraphInfo; 
            private QrCodeInfo qrCodeInfo; 
            private QualityInfo qualityInfo; 
            private RowInfo rowInfo; 
            private StampInfo stampInfo; 
            private Integer subImageId; 
            private java.util.List<SubImagePoints> subImagePoints; 
            private SubImageRect subImageRect; 
            private TableInfo tableInfo; 
            private String type; 

            private Builder() {
            } 

            private Builder(SubImages model) {
                this.angle = model.angle;
                this.barCodeInfo = model.barCodeInfo;
                this.blockInfo = model.blockInfo;
                this.figureInfo = model.figureInfo;
                this.kvInfo = model.kvInfo;
                this.paragraphInfo = model.paragraphInfo;
                this.qrCodeInfo = model.qrCodeInfo;
                this.qualityInfo = model.qualityInfo;
                this.rowInfo = model.rowInfo;
                this.stampInfo = model.stampInfo;
                this.subImageId = model.subImageId;
                this.subImagePoints = model.subImagePoints;
                this.subImageRect = model.subImageRect;
                this.tableInfo = model.tableInfo;
                this.type = model.type;
            } 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * BarCodeInfo.
             */
            public Builder barCodeInfo(BarCodeInfo barCodeInfo) {
                this.barCodeInfo = barCodeInfo;
                return this;
            }

            /**
             * BlockInfo.
             */
            public Builder blockInfo(BlockInfo blockInfo) {
                this.blockInfo = blockInfo;
                return this;
            }

            /**
             * FigureInfo.
             */
            public Builder figureInfo(java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo) {
                this.figureInfo = figureInfo;
                return this;
            }

            /**
             * KvInfo.
             */
            public Builder kvInfo(KvInfo kvInfo) {
                this.kvInfo = kvInfo;
                return this;
            }

            /**
             * ParagraphInfo.
             */
            public Builder paragraphInfo(ParagraphInfo paragraphInfo) {
                this.paragraphInfo = paragraphInfo;
                return this;
            }

            /**
             * QrCodeInfo.
             */
            public Builder qrCodeInfo(QrCodeInfo qrCodeInfo) {
                this.qrCodeInfo = qrCodeInfo;
                return this;
            }

            /**
             * QualityInfo.
             */
            public Builder qualityInfo(QualityInfo qualityInfo) {
                this.qualityInfo = qualityInfo;
                return this;
            }

            /**
             * RowInfo.
             */
            public Builder rowInfo(RowInfo rowInfo) {
                this.rowInfo = rowInfo;
                return this;
            }

            /**
             * StampInfo.
             */
            public Builder stampInfo(StampInfo stampInfo) {
                this.stampInfo = stampInfo;
                return this;
            }

            /**
             * SubImageId.
             */
            public Builder subImageId(Integer subImageId) {
                this.subImageId = subImageId;
                return this;
            }

            /**
             * SubImagePoints.
             */
            public Builder subImagePoints(java.util.List<SubImagePoints> subImagePoints) {
                this.subImagePoints = subImagePoints;
                return this;
            }

            /**
             * SubImageRect.
             */
            public Builder subImageRect(SubImageRect subImageRect) {
                this.subImageRect = subImageRect;
                return this;
            }

            /**
             * TableInfo.
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubImages build() {
                return new SubImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgoServer")
        private java.util.List<String> algoServer;

        @com.aliyun.core.annotation.NameInMap("AlgoVersion")
        private String algoVersion;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DebugInfo")
        private Object debugInfo;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("IsMixedMode")
        private Boolean isMixedMode;

        @com.aliyun.core.annotation.NameInMap("KvExcelUrl")
        private String kvExcelUrl;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("SubImageCount")
        private Integer subImageCount;

        @com.aliyun.core.annotation.NameInMap("SubImages")
        private java.util.List<SubImages> subImages;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        @com.aliyun.core.annotation.NameInMap("XmlResult")
        private String xmlResult;

        private Data(Builder builder) {
            this.algoServer = builder.algoServer;
            this.algoVersion = builder.algoVersion;
            this.content = builder.content;
            this.debugInfo = builder.debugInfo;
            this.height = builder.height;
            this.isMixedMode = builder.isMixedMode;
            this.kvExcelUrl = builder.kvExcelUrl;
            this.pageNo = builder.pageNo;
            this.subImageCount = builder.subImageCount;
            this.subImages = builder.subImages;
            this.width = builder.width;
            this.xmlResult = builder.xmlResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algoServer
         */
        public java.util.List<String> getAlgoServer() {
            return this.algoServer;
        }

        /**
         * @return algoVersion
         */
        public String getAlgoVersion() {
            return this.algoVersion;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return debugInfo
         */
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return isMixedMode
         */
        public Boolean getIsMixedMode() {
            return this.isMixedMode;
        }

        /**
         * @return kvExcelUrl
         */
        public String getKvExcelUrl() {
            return this.kvExcelUrl;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return subImageCount
         */
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        /**
         * @return subImages
         */
        public java.util.List<SubImages> getSubImages() {
            return this.subImages;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return xmlResult
         */
        public String getXmlResult() {
            return this.xmlResult;
        }

        public static final class Builder {
            private java.util.List<String> algoServer; 
            private String algoVersion; 
            private String content; 
            private Object debugInfo; 
            private Integer height; 
            private Boolean isMixedMode; 
            private String kvExcelUrl; 
            private Integer pageNo; 
            private Integer subImageCount; 
            private java.util.List<SubImages> subImages; 
            private Integer width; 
            private String xmlResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.algoServer = model.algoServer;
                this.algoVersion = model.algoVersion;
                this.content = model.content;
                this.debugInfo = model.debugInfo;
                this.height = model.height;
                this.isMixedMode = model.isMixedMode;
                this.kvExcelUrl = model.kvExcelUrl;
                this.pageNo = model.pageNo;
                this.subImageCount = model.subImageCount;
                this.subImages = model.subImages;
                this.width = model.width;
                this.xmlResult = model.xmlResult;
            } 

            /**
             * AlgoServer.
             */
            public Builder algoServer(java.util.List<String> algoServer) {
                this.algoServer = algoServer;
                return this;
            }

            /**
             * AlgoVersion.
             */
            public Builder algoVersion(String algoVersion) {
                this.algoVersion = algoVersion;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DebugInfo.
             */
            public Builder debugInfo(Object debugInfo) {
                this.debugInfo = debugInfo;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * IsMixedMode.
             */
            public Builder isMixedMode(Boolean isMixedMode) {
                this.isMixedMode = isMixedMode;
                return this;
            }

            /**
             * KvExcelUrl.
             */
            public Builder kvExcelUrl(String kvExcelUrl) {
                this.kvExcelUrl = kvExcelUrl;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * SubImageCount.
             */
            public Builder subImageCount(Integer subImageCount) {
                this.subImageCount = subImageCount;
                return this;
            }

            /**
             * SubImages.
             */
            public Builder subImages(java.util.List<SubImages> subImages) {
                this.subImages = subImages;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * XmlResult.
             */
            public Builder xmlResult(String xmlResult) {
                this.xmlResult = xmlResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
